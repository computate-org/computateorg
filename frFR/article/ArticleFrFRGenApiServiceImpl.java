package org.computate.site.frFR.article;

import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import org.computate.site.frFR.recherche.ResultatRecherche;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import io.vertx.core.json.Json;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.commons.lang3.StringUtils;
import java.security.Principal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import java.io.PrintWriter;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrDocument;
import java.util.Collection;
import java.math.BigDecimal;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Router;
import io.vertx.core.Vertx;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import io.vertx.core.MultiMap;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.api.validation.HTTPRequestValidationHandler;
import io.vertx.ext.web.api.validation.ParameterTypeValidator;
import io.vertx.ext.web.api.validation.ValidationException;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.ext.sql.SQLClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import io.vertx.core.Future;
import io.vertx.core.http.CaseInsensitiveHeaders;
import io.vertx.core.AsyncResult;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.api.OperationResponse;
import io.vertx.core.CompositeFuture;
import org.apache.http.client.utils.URLEncodedUtils;
import java.nio.charset.Charset;
import org.apache.http.NameValuePair;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.auth.oauth2.KeycloakHelper;
import java.util.Optional;
import java.util.stream.Stream;
import java.net.URLDecoder;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.article.ArticleFrFRPage;


/**
 * Traduire: false
 **/
public class ArticleFrFRGenApiServiceImpl implements ArticleFrFRGenApiService {

	protected static final Logger LOGGER = LoggerFactory.getLogger(ArticleFrFRGenApiServiceImpl.class);

	protected static final String SERVICE_ADDRESS = "ArticleFrFRApiServiceImpl";

	protected SiteContexteFrFR siteContexte;

	public ArticleFrFRGenApiServiceImpl(SiteContexteFrFR siteContexte) {
		this.siteContexte = siteContexte;
		ArticleFrFRGenApiService service = ArticleFrFRGenApiService.creerProxy(siteContexte.getVertx(), SERVICE_ADDRESS);
	}

	// RechercheFrFRPage //

	@Override
	public void recherchefrfrpageArticleId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		recherchefrfrpageArticle(operationRequete, gestionnaireEvenements);
	}

	@Override
	public void recherchefrfrpageArticle(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = genererRequeteSiteFrFRPourArticle(siteContexte, operationRequete);
			sqlArticle(requeteSite, a -> {
				if(a.succeeded()) {
					utilisateurArticle(requeteSite, b -> {
						if(b.succeeded()) {
							rechercheArticle(requeteSite, false, true, "/frFR/article", c -> {
								if(c.succeeded()) {
									ListeRecherche<Article> listeArticle = c.result();
									reponse200RechercheFrFRPageArticle(listeArticle, d -> {
										if(d.succeeded()) {
											SQLConnection connexionSql = requeteSite.getConnexionSql();
											if(connexionSql == null) {
												gestionnaireEvenements.handle(Future.succeededFuture(d.result()));
											} else {
												connexionSql.commit(e -> {
													if(e.succeeded()) {
														connexionSql.close(f -> {
															if(f.succeeded()) {
																gestionnaireEvenements.handle(Future.succeededFuture(d.result()));
															} else {
																erreurArticle(requeteSite, gestionnaireEvenements, f);
															}
														});
													} else {
														erreurArticle(requeteSite, gestionnaireEvenements, e);
													}
												});
											}
										} else {
											erreurArticle(requeteSite, gestionnaireEvenements, d);
										}
									});
								} else {
									erreurArticle(requeteSite, gestionnaireEvenements, c);
								}
							});
						} else {
							erreurArticle(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurArticle(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurArticle(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}

	public void reponse200RechercheFrFRPageArticle(ListeRecherche<Article> listeArticle, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSiteFrFR requeteSite = listeArticle.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeArticle.getRequeteSite_(), buffer);
			requeteSite.setW(w);
			ArticleFrFRPage page = new ArticleFrFRPage();
			SolrDocument pageDocumentSolr = new SolrDocument();

			pageDocumentSolr.setField("pageUri_frFR_stored_string", "/frFR/article");
			page.setPageDocumentSolr(pageDocumentSolr);
			page.setW(w);
			page.setListeArticle(listeArticle);
			page.initLoinArticleFrFRPage(requeteSite);
			page.html();
			gestionnaireEvenements.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, new CaseInsensitiveHeaders())));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	// Recherche //

	@Override
	public void rechercheArticle(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = genererRequeteSiteFrFRPourArticle(siteContexte, operationRequete);
			rechercheArticle(requeteSite, false, true, null, a -> {
				if(a.succeeded()) {
					ListeRecherche<Article> listeArticle = a.result();
					reponse200RechercheArticle(listeArticle, b -> {
						if(b.succeeded()) {
							gestionnaireEvenements.handle(Future.succeededFuture(b.result()));
						} else {
							erreurArticle(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurArticle(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurArticle(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}

	public void reponse200RechercheArticle(ListeRecherche<Article> listeArticle, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSiteFrFR requeteSite = listeArticle.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeArticle.getRequeteSite_(), buffer);
			requeteSite.setW(w);
			QueryResponse reponseRecherche = listeArticle.getQueryResponse();
			SolrDocumentList documentsSolr = listeArticle.getSolrDocumentList();
			Long millisRecherche = Long.valueOf(reponseRecherche.getQTime());
			Long millisTransmission = reponseRecherche.getElapsedTime();
			Long numCommence = reponseRecherche.getResults().getStart();
			Long numTrouve = reponseRecherche.getResults().getNumFound();
			Integer numRetourne = reponseRecherche.getResults().size();
			String tempsRecherche = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(millisRecherche), TimeUnit.MILLISECONDS.toMillis(millisRecherche) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisRecherche)));
			String tempsTransmission = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(millisTransmission), TimeUnit.MILLISECONDS.toMillis(millisTransmission) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(millisTransmission)));
			Exception exceptionRecherche = reponseRecherche.getException();

			w.l("{");
			w.tl(1, "\"numCommence\": ", numCommence);
			w.tl(1, ", \"numTrouve\": ", numTrouve);
			w.tl(1, ", \"numRetourne\": ", numRetourne);
			w.tl(1, ", \"tempsRecherche\": ", w.q(tempsRecherche));
			w.tl(1, ", \"tempsTransmission\": ", w.q(tempsTransmission));
			w.tl(1, ", \"liste\": [");
			for(int i = 0; i < listeArticle.size(); i++) {
				Article o = listeArticle.getList().get(i);
				Object entiteValeur;
				Integer entiteNumero = 0;

				w.t(2);
				if(i > 0)
					w.s(", ");
				w.l("{");

				entiteValeur = o.getPk();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pk\": ", entiteValeur);

				entiteValeur = o.getCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"cree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getModifie();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"modifie\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArchive();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"archive\": ", entiteValeur);

				entiteValeur = o.getSupprime();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"supprime\": ", entiteValeur);

				entiteValeur = o.getClasseNomCanonique();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"classeNomCanonique\": ", w.qjs(entiteValeur));

				entiteValeur = o.getClasseNomSimple();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"classeNomSimple\": ", w.qjs(entiteValeur));

				{
					List<String> entiteValeurs = o.getClasseNomsCanoniques();
					w.t(3, entiteNumero++ == 0 ? "" : ", ");
					w.s("\"classeNomsCanoniques\": [");
					for(int k = 0; k < entiteValeurs.size(); k++) {
						entiteValeur = entiteValeurs.get(k);
						if(k > 0)
							w.s(", ");
						w.s("\"");
						w.s(((String)entiteValeur));
						w.s("\"");
					}
					w.l("]");
				}

				entiteValeur = o.getEstCours();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estCours\": ", entiteValeur);

				entiteValeur = o.getEstLecon();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estLecon\": ", entiteValeur);

				entiteValeur = o.getEstArticle();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estArticle\": ", entiteValeur);

				entiteValeur = o.getCoursNumero();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"coursNumero\": ", entiteValeur);

				entiteValeur = o.getLeconNumero();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"leconNumero\": ", entiteValeur);

				entiteValeur = o.getArticleH1_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH1_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH1_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH1_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH2_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH2_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH2_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH2_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleCree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageUri_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageUri_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageUri_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageUri_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageImageUri_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageImageUri_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageImageUri_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageImageUri_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageCree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH1();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH1\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH2();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH2\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH3();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH3\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageTitre();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageTitre\": ", w.qjs(entiteValeur));

				w.tl(2, "}");
			}
			w.tl(1, "]");
			if(exceptionRecherche != null) {
				w.tl(1, ", \"exceptionRecherche\": ", w.q(exceptionRecherche.getMessage()));
			}
			w.l("}");
			gestionnaireEvenements.handle(Future.succeededFuture(OperationResponse.completedWithJson(buffer)));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	// GET //

	@Override
	public void getArticle(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = genererRequeteSiteFrFRPourArticle(siteContexte, operationRequete);
			rechercheArticle(requeteSite, false, true, null, a -> {
				if(a.succeeded()) {
					ListeRecherche<Article> listeArticle = a.result();
					reponse200GETArticle(listeArticle, b -> {
						if(b.succeeded()) {
							gestionnaireEvenements.handle(Future.succeededFuture(b.result()));
						} else {
							erreurArticle(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurArticle(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurArticle(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}

	public void reponse200GETArticle(ListeRecherche<Article> listeArticle, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSiteFrFR requeteSite = listeArticle.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeArticle.getRequeteSite_(), buffer);
			requeteSite.setW(w);
			SolrDocumentList documentsSolr = listeArticle.getSolrDocumentList();

			if(listeArticle.size() > 0) {
				SolrDocument documentSolr = documentsSolr.get(0);
				Article o = listeArticle.get(0);
				Object entiteValeur;
				Integer entiteNumero = 0;

				w.l("{");

				entiteValeur = o.getPk();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pk\": ", entiteValeur);

				entiteValeur = o.getCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"cree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getModifie();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"modifie\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArchive();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"archive\": ", entiteValeur);

				entiteValeur = o.getSupprime();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"supprime\": ", entiteValeur);

				entiteValeur = o.getClasseNomCanonique();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"classeNomCanonique\": ", w.qjs(entiteValeur));

				entiteValeur = o.getClasseNomSimple();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"classeNomSimple\": ", w.qjs(entiteValeur));

				{
					List<String> entiteValeurs = o.getClasseNomsCanoniques();
					w.t(3, entiteNumero++ == 0 ? "" : ", ");
					w.s("\"classeNomsCanoniques\": [");
					for(int k = 0; k < entiteValeurs.size(); k++) {
						entiteValeur = entiteValeurs.get(k);
						if(k > 0)
							w.s(", ");
						w.s("\"");
						w.s(((String)entiteValeur));
						w.s("\"");
					}
					w.l("]");
				}

				entiteValeur = o.getEstCours();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estCours\": ", entiteValeur);

				entiteValeur = o.getEstLecon();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estLecon\": ", entiteValeur);

				entiteValeur = o.getEstArticle();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"estArticle\": ", entiteValeur);

				entiteValeur = o.getCoursNumero();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"coursNumero\": ", entiteValeur);

				entiteValeur = o.getLeconNumero();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"leconNumero\": ", entiteValeur);

				entiteValeur = o.getArticleH1_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH1_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH1_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH1_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH2_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH2_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleH2_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleH2_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getArticleCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"articleCree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageUri_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageUri_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageUri_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageUri_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageImageUri_enUS();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageImageUri_enUS\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageImageUri_frFR();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageImageUri_frFR\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageCree();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageCree\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH1();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH1\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH2();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH2\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageH3();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageH3\": ", w.qjs(entiteValeur));

				entiteValeur = o.getPageTitre();
				if(entiteValeur != null)
					w.tl(3, entiteNumero++ == 0 ? "" : ", ", "\"pageTitre\": ", w.qjs(entiteValeur));

				w.l("}");
			}
			gestionnaireEvenements.handle(Future.succeededFuture(OperationResponse.completedWithJson(buffer)));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public String varIndexeArticle(String entiteVar) {
		switch(entiteVar) {
			case "pk":
				return "pk_indexed_long";
			case "id":
				return "id_indexed_string";
			case "cree":
				return "cree_indexed_date";
			case "modifie":
				return "modifie_indexed_date";
			case "archive":
				return "archive_indexed_boolean";
			case "supprime":
				return "supprime_indexed_boolean";
			case "classeNomCanonique":
				return "classeNomCanonique_indexed_string";
			case "classeNomSimple":
				return "classeNomSimple_indexed_string";
			case "classeNomsCanoniques":
				return "classeNomsCanoniques_indexed_strings";
			case "estCours":
				return "estCours_indexed_boolean";
			case "estLecon":
				return "estLecon_indexed_boolean";
			case "estArticle":
				return "estArticle_indexed_boolean";
			case "coursNumero":
				return "coursNumero_indexed_int";
			case "leconNumero":
				return "leconNumero_indexed_int";
			case "articleH1_enUS":
				return "articleH1_enUS_indexed_string";
			case "articleH1_frFR":
				return "articleH1_frFR_indexed_string";
			case "articleH2_enUS":
				return "articleH2_enUS_indexed_string";
			case "articleH2_frFR":
				return "articleH2_frFR_indexed_string";
			case "articleCree":
				return "articleCree_indexed_date";
			case "pageUri_enUS":
				return "pageUri_enUS_indexed_string";
			case "pageUri_frFR":
				return "pageUri_frFR_indexed_string";
			case "pageImageUri_enUS":
				return "pageImageUri_enUS_indexed_string";
			case "pageImageUri_frFR":
				return "pageImageUri_frFR_indexed_string";
			case "pageCree":
				return "pageCree_indexed_date";
			case "pageH1":
				return "pageH1_indexed_string";
			case "pageH2":
				return "pageH2_indexed_string";
			case "pageH3":
				return "pageH3_indexed_string";
			case "pageTitre":
				return "pageTitre_indexed_string";
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	public String varRechercheArticle(String entiteVar) {
		switch(entiteVar) {
			case "pageRecherche_enUS":
				return "pageRecherche_enUS_text_enUS";
			case "pageRecherche_frFR":
				return "pageRecherche_frFR_text_frFR";
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	public String varSuggereArticle(String entiteVar) {
		switch(entiteVar) {
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	// Partagé //

	public void erreurArticle(RequeteSiteFrFR requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements, AsyncResult<?> resultatAsync) {
		Throwable e = resultatAsync.cause();
		ExceptionUtils.printRootCauseStackTrace(e);
		OperationResponse reponseOperation = new OperationResponse(400, "BAD REQUEST", 
			Buffer.buffer().appendString(
				new JsonObject() {{
					put("erreur", new JsonObject() {{
					put("message", e.getMessage());
					}});
				}}.encodePrettily()
			)
			, new CaseInsensitiveHeaders()
		);
		if(requeteSite != null) {
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			if(connexionSql != null) {
				connexionSql.rollback(a -> {
					if(a.succeeded()) {
						connexionSql.close(b -> {
							if(a.succeeded()) {
								gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
							} else {
								gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
							}
						});
					} else {
						gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
					}
				});
			} else {
				gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
			}
		} else {
			gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
		}
	}

	public void sqlArticle(RequeteSiteFrFR requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			SQLClient clientSql = requeteSite.getSiteContexte_().getClientSql();

			if(clientSql == null) {
				gestionnaireEvenements.handle(Future.succeededFuture());
			} else {
				clientSql.getConnection(sqlAsync -> {
					if(sqlAsync.succeeded()) {
						SQLConnection connexionSql = sqlAsync.result();
						connexionSql.setAutoCommit(false, a -> {
							if(a.succeeded()) {
								requeteSite.setConnexionSql(connexionSql);
								gestionnaireEvenements.handle(Future.succeededFuture());
							} else {
								gestionnaireEvenements.handle(Future.failedFuture(a.cause()));
							}
						});
					} else {
						gestionnaireEvenements.handle(Future.failedFuture(sqlAsync.cause()));
					}
				});
			}
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public RequeteSiteFrFR genererRequeteSiteFrFRPourArticle(SiteContexteFrFR siteContexte, OperationRequest operationRequete) {
		return genererRequeteSiteFrFRPourArticle(siteContexte, operationRequete, null);
	}

	public RequeteSiteFrFR genererRequeteSiteFrFRPourArticle(SiteContexteFrFR siteContexte, OperationRequest operationRequete, JsonObject body) {
		Vertx vertx = siteContexte.getVertx();
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.setObjetJson(body);
		requeteSite.setVertx(vertx);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		requeteSite.setOperationRequete(operationRequete);
		requeteSite.initLoinRequeteSiteFrFR(requeteSite);

		return requeteSite;
	}

	public void utilisateurArticle(RequeteSiteFrFR requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			String utilisateurId = requeteSite.getUtilisateurId();
			if(utilisateurId == null) {
				gestionnaireEvenements.handle(Future.succeededFuture());
			} else {
				connexionSql.queryWithParams(
						SiteContexteFrFR.SQL_selectC
						, new JsonArray(Arrays.asList("org.computate.site.frFR.utilisateur.UtilisateurSite", utilisateurId))
						, selectCAsync
				-> {
					if(selectCAsync.succeeded()) {
						JsonArray utilisateurValeurs = selectCAsync.result().getResults().stream().findFirst().orElse(null);
						if(utilisateurValeurs == null) {
							connexionSql.queryWithParams(
									SiteContexteFrFR.SQL_creer
									, new JsonArray(Arrays.asList("org.computate.site.frFR.utilisateur.UtilisateurSite", utilisateurId))
									, creerAsync
							-> {
								JsonArray creerLigne = creerAsync.result().getResults().stream().findFirst().orElseGet(() -> null);
								Long pkUtilisateur = creerLigne.getLong(0);
								UtilisateurSite utilisateurSite = new UtilisateurSite();
								utilisateurSite.setPk(pkUtilisateur);

								connexionSql.queryWithParams(
										SiteContexteFrFR.SQL_definir
										, new JsonArray(Arrays.asList(pkUtilisateur, pkUtilisateur, pkUtilisateur))
										, definirAsync
								-> {
									if(definirAsync.succeeded()) {
										try {
											for(JsonArray definition : definirAsync.result().getResults()) {
												utilisateurSite.definirPourClasse(definition.getString(0), definition.getString(1));
											}
											JsonObject utilisateurVertx = requeteSite.getOperationRequete().getUser();
											JsonObject principalJson = KeycloakHelper.parseToken(utilisateurVertx.getString("access_token"));
											utilisateurSite.setUtilisateurNom(principalJson.getString("preferred_username"));
											utilisateurSite.setUtilisateurPrenom(principalJson.getString("given_name"));
											utilisateurSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
											utilisateurSite.setUtilisateurId(principalJson.getString("sub"));
											utilisateurSite.initLoinPourClasse(requeteSite);
											utilisateurSite.indexerPourClasse();
											requeteSite.setUtilisateurSite(utilisateurSite);
											requeteSite.setUtilisateurNom(principalJson.getString("preferred_username"));
											requeteSite.setUtilisateurPrenom(principalJson.getString("given_name"));
											requeteSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
											requeteSite.setUtilisateurId(principalJson.getString("sub"));
											gestionnaireEvenements.handle(Future.succeededFuture());
										} catch(Exception e) {
											gestionnaireEvenements.handle(Future.failedFuture(e));
										}
									} else {
										gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
									}
								});
							});
						} else {
							Long pkUtilisateur = utilisateurValeurs.getLong(0);
							UtilisateurSite utilisateurSite = new UtilisateurSite();
							utilisateurSite.setPk(pkUtilisateur);

							connexionSql.queryWithParams(
									SiteContexteFrFR.SQL_definir
									, new JsonArray(Arrays.asList(pkUtilisateur, pkUtilisateur, pkUtilisateur))
									, definirAsync
							-> {
								if(definirAsync.succeeded()) {
									for(JsonArray definition : definirAsync.result().getResults()) {
										utilisateurSite.definirPourClasse(definition.getString(0), definition.getString(1));
									}
									JsonObject utilisateurVertx = requeteSite.getOperationRequete().getUser();
									JsonObject principalJson = KeycloakHelper.parseToken(utilisateurVertx.getString("access_token"));
									utilisateurSite.setUtilisateurNom(principalJson.getString("preferred_username"));
									utilisateurSite.setUtilisateurPrenom(principalJson.getString("given_name"));
									utilisateurSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
									utilisateurSite.setUtilisateurId(principalJson.getString("sub"));
									utilisateurSite.initLoinPourClasse(requeteSite);
									utilisateurSite.indexerPourClasse();
									requeteSite.setUtilisateurSite(utilisateurSite);
									requeteSite.setUtilisateurNom(principalJson.getString("preferred_username"));
									requeteSite.setUtilisateurPrenom(principalJson.getString("given_name"));
									requeteSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
									requeteSite.setUtilisateurId(principalJson.getString("sub"));
									gestionnaireEvenements.handle(Future.succeededFuture());
								} else {
									gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
								}
							});
						}
					} else {
						gestionnaireEvenements.handle(Future.failedFuture(selectCAsync.cause()));
					}
				});
			}
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void rechercheArticle(RequeteSiteFrFR requeteSite, Boolean peupler, Boolean stocker, String classeApiUriMethode, Handler<AsyncResult<ListeRecherche<Article>>> gestionnaireEvenements) {
		try {
			OperationRequest operationRequete = requeteSite.getOperationRequete();
			String entiteListeStr = requeteSite.getOperationRequete().getParams().getJsonObject("query").getString("fl");
			String[] entiteListe = entiteListeStr == null ? null : entiteListeStr.split(",\\s*");
			ListeRecherche<Article> listeRecherche = new ListeRecherche<Article>();
			listeRecherche.setPeupler(peupler);
			listeRecherche.setStocker(stocker);
			listeRecherche.setQuery("*:*");
			listeRecherche.setC(Article.class);
			if(entiteListe != null)
			listeRecherche.setFields(entiteListe);
			listeRecherche.addSort("archive_indexed_boolean", ORDER.asc);
			listeRecherche.addSort("supprime_indexed_boolean", ORDER.asc);
			listeRecherche.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
			UtilisateurSite utilisateurSite = requeteSite.getUtilisateurSite();
			if(utilisateurSite != null && !utilisateurSite.getVoirSupprime())
				listeRecherche.addFilterQuery("supprime_indexed_boolean:false");
			if(utilisateurSite != null && !utilisateurSite.getVoirArchive())
				listeRecherche.addFilterQuery("archive_indexed_boolean:false");

			String pageUri = null;
			String id = operationRequete.getParams().getJsonObject("path").getString("id");
			if(id != null) {
				pageUri = classeApiUriMethode + "/" + id;
				listeRecherche.addFilterQuery("pageUri_indexed_string:" + ClientUtils.escapeQueryChars(pageUri));
			}

			operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
				String entiteVar = null;
				String valeurIndexe = null;
				String varIndexe = null;
				String valeurTri = null;
				Integer rechercheDebut = null;
				Integer rechercheNum = null;
				String paramNom = paramRequete.getKey();
				Object paramValeursObjet = paramRequete.getValue();
				JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

				try {
					for(Object paramObjet : paramObjets) {
						switch(paramNom) {
							case "q":
								entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
								varIndexe = "*".equals(entiteVar) ? entiteVar : varRechercheArticle(entiteVar);
								valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
								valeurIndexe = StringUtils.isEmpty(valeurIndexe) ? "*" : valeurIndexe;
								listeRecherche.setQuery(varIndexe + ":" + ("*".equals(valeurIndexe) ? valeurIndexe : ClientUtils.escapeQueryChars(valeurIndexe)));
								if(!"*".equals(entiteVar)) {
									listeRecherche.setHighlight(true);
									listeRecherche.setHighlightSnippets(3);
									listeRecherche.addHighlightField(varIndexe);
									listeRecherche.setParam("hl.encoder", "html");
								}
								break;
							case "fq":
								entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
								valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
								varIndexe = varIndexeArticle(entiteVar);
								listeRecherche.addFilterQuery(varIndexe + ":" + ClientUtils.escapeQueryChars(valeurIndexe));
								break;
							case "sort":
								entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, " "));
								valeurTri = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, " "));
								varIndexe = varIndexeArticle(entiteVar);
								listeRecherche.addSort(varIndexe, ORDER.valueOf(valeurTri));
								break;
							case "fl":
								entiteVar = StringUtils.trim((String)paramObjet);
								varIndexe = varIndexeArticle(entiteVar);
								listeRecherche.addField(varIndexe);
								break;
							case "start":
								rechercheDebut = (Integer)paramObjet;
								listeRecherche.setStart(rechercheDebut);
								break;
							case "rows":
								rechercheNum = (Integer)paramObjet;
								listeRecherche.setRows(rechercheNum);
								break;
						}
					}
				} catch(Exception e) {
					gestionnaireEvenements.handle(Future.failedFuture(e));
				}
			});
			listeRecherche.initLoinPourClasse(requeteSite);
			gestionnaireEvenements.handle(Future.succeededFuture(listeRecherche));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void definirArticle(Article o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long pk = o.getPk();
			connexionSql.queryWithParams(
					SiteContexteFrFR.SQL_definir
					, new JsonArray(Arrays.asList(pk, pk, pk))
					, definirAsync
			-> {
				if(definirAsync.succeeded()) {
					for(JsonArray definition : definirAsync.result().getResults()) {
						o.definirPourClasse(definition.getString(0), definition.getString(1));
					}
					gestionnaireEvenements.handle(Future.succeededFuture());
				} else {
					gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
				}
			});
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void attribuerArticle(Article o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long pk = o.getPk();
			connexionSql.queryWithParams(
					SiteContexteFrFR.SQL_attribuer
					, new JsonArray(Arrays.asList(pk, pk))
					, attribuerAsync
			-> {
				if(attribuerAsync.succeeded()) {
					if(attribuerAsync.result() != null) {
						for(JsonArray definition : attribuerAsync.result().getResults()) {
							o.attribuerPourClasse(definition.getString(0), definition.getString(1));
						}
					}
					gestionnaireEvenements.handle(Future.succeededFuture());
				} else {
					gestionnaireEvenements.handle(Future.failedFuture(attribuerAsync.cause()));
				}
			});
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void indexerArticle(Article o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		RequeteSiteFrFR requeteSite = o.getRequeteSite_();
		try {
			o.initLoinPourClasse(requeteSite);
			o.indexerPourClasse();
			gestionnaireEvenements.handle(Future.succeededFuture());
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}
}
