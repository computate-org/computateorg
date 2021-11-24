package org.computate.site.frfr.utilisateur;

import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.recherche.ResultatRecherche;
import org.computate.site.frfr.config.ConfigCles;
import org.computate.site.frfr.base.BaseApiServiceImpl;
import io.vertx.ext.web.client.WebClient;
import java.util.Objects;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.EventBus;
import io.vertx.pgclient.PgPool;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.core.eventbus.DeliveryOptions;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.time.Instant;
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
import org.apache.solr.common.SolrInputDocument;
import java.util.Collection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import org.apache.commons.lang3.math.NumberUtils;
import io.vertx.ext.web.Router;
import io.vertx.core.Vertx;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import io.vertx.core.MultiMap;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.vertx.sqlclient.Transaction;
import io.vertx.sqlclient.SqlConnection;
import io.vertx.sqlclient.Tuple;
import io.vertx.sqlclient.Row;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.Timestamp;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.AsyncResult;
import java.net.URLEncoder;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.CompositeFuture;
import io.vertx.core.http.HttpHeaders;
import org.apache.http.client.utils.URLEncodedUtils;
import java.nio.charset.Charset;
import org.apache.http.NameValuePair;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.client.predicate.ResponsePredicate;
import java.util.HashMap;
import io.vertx.ext.auth.User;
import java.util.Optional;
import java.util.stream.Stream;
import java.net.URLDecoder;
import org.apache.solr.util.DateMathParser;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.client.solrj.response.PivotField;
import org.apache.solr.client.solrj.response.RangeFacet;
import org.apache.solr.client.solrj.response.FacetField;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Base64;
import java.time.ZonedDateTime;
import org.apache.solr.common.util.SimpleOrderedMap;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.computate.site.frfr.utilisateur.UtilisateurSiteFrFRApiServiceImpl;
import org.computate.site.frfr.recherche.ListeRecherche;


/**
 * Traduire: false
 * NomCanonique.frFR: org.computate.site.frfr.utilisateur.UtilisateurSiteFrFRGenApiServiceImpl
 **/
public class UtilisateurSiteEnUSGenApiServiceImpl extends BaseApiServiceImpl implements UtilisateurSiteEnUSGenApiService {

	protected static final Logger LOG = LoggerFactory.getLogger(UtilisateurSiteEnUSGenApiServiceImpl.class);

	public UtilisateurSiteEnUSGenApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor executeurTravailleur, PgPool pgPool, WebClient clientWeb, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, executeurTravailleur, pgPool, clientWeb, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}

	// Search //

	@Override
	public void searchUtilisateurSite(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		utilisateur(requeteService).onSuccess(requeteSite -> {
			try {
				{
					reponse200SearchUtilisateurSite(requeteSite).onSuccess(reponse -> {
						gestionnaireEvenements.handle(Future.succeededFuture(reponse));
						LOG.debug(String.format("searchUtilisateurSite a réussi. "));
					}).onFailure(ex -> {
						LOG.error(String.format("searchUtilisateurSite a échoué. ", c.cause()));
						erreur(requeteSite, gestionnaireEvenements, c);
					});
				}
			} catch(Exception ex) {
				LOG.error(String.format("searchUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || "invalid_grant: Refresh token expired".equals(ex.getMessage())) {
				try {
					gestionnaireEvenements.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/deconnexion?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchUtilisateurSite a échoué. ", ex2));
					erreur(null, gestionnaireEvenements, ex2);
				}
			} else {
				LOG.error(String.format("searchUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		});
	}



	public Future<ServiceResponse> reponse200SearchUtilisateurSite(RequeteSiteFrFR requeteSite) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("reponse200SearchUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// PATCHEnUS //

	@Override
	public void patchenusUtilisateurSite(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		LOG.debug(String.format("patchenusUtilisateurSite a démarré. "));
		utilisateur(requeteService).onSuccess(requeteSite -> {
			try {
				requeteSite.setJsonObject(body);
				{
					rechercherUtilisateurSiteListe(requeteSite, false, true, true).onSuccess(listeUtilisateurSite -> {
						try {
							List<String> roles2 = Optional.ofNullable(config.getValue(ConfigCles.AUTH_ROLES_ADMIN)).map(v -> v instanceof JsonArray ? (JsonArray)v : new JsonArray(v.toString())).orElse(new JsonArray()).getList();
							if(listeUtilisateurSite.getQueryResponse().getResults().getNumFound() > 1
									&& !CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRessource(), roles2)
									&& !CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRoyaume(), roles2)
									) {
								String message = String.format("rôles requis : " + String.join(", ", roles2));
								LOG.error(message);
								erreur(requeteSite, gestionnaireEvenements, new RuntimeException(message));
							} else {

								RequeteApi requeteApi = new RequeteApi();
								requeteApi.setRows(listeUtilisateurSite.getRows());
								requeteApi.setNumFound(listeUtilisateurSite.getQueryResponse().getResults().getNumFound());
								requeteApi.setNumPATCH(0L);
								requeteApi.initLoinRequeteApi(requeteSite);
								requeteSite.setRequeteApi_(requeteApi);
								if(requeteApi.getNumFound() == 1L)
									requeteApi.setOriginal(listeUtilisateurSite.first());
								requeteApi.setPk(Optional.ofNullable(listeUtilisateurSite.first()).map(o2 -> o2.getPk()).orElse(null));
								eventBus.publish("websocketUtilisateurSite", JsonObject.mapFrom(requeteApi).toString());

								listePATCHEnUSUtilisateurSite(requeteApi, listeUtilisateurSite).onSuccess(e -> {
									reponse200PATCHEnUSUtilisateurSite(requeteSite).onSuccess(reponse -> {
										LOG.debug(String.format("patchenusUtilisateurSite a réussi. "));
										gestionnaireEvenements.handle(Future.succeededFuture(reponse));
									}).onFailure(ex -> {
										LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
										erreur(requeteSite, gestionnaireEvenements, ex);
									});
								}).onFailure(ex -> {
									LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
									erreur(requeteSite, gestionnaireEvenements, ex);
								});
							}
						} catch(Exception ex) {
							LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
							erreur(requeteSite, gestionnaireEvenements, ex);
						}
					}).onFailure(ex -> {
						LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
						erreur(requeteSite, gestionnaireEvenements, ex);
					});
				}
			} catch(Exception ex) {
				LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || "invalid_grant: Refresh token expired".equals(ex.getMessage())) {
				try {
					gestionnaireEvenements.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/deconnexion?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("patchenusUtilisateurSite a échoué. ", ex2));
					erreur(null, gestionnaireEvenements, ex2);
				}
			} else {
				LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		});
	}


	public Future<Void> listePATCHEnUSUtilisateurSite(RequeteApi requeteApi, ListeRecherche<UtilisateurSite> listeUtilisateurSite) {
		Promise<Void> promise = Promise.promise();
		List<Future> futures = new ArrayList<>();
		RequeteSiteFrFR requeteSite = listeUtilisateurSite.getRequeteSite_();
		listeUtilisateurSite.getList().forEach(o -> {
			RequeteSiteFrFR requeteSite2 = genererRequeteSiteFrFR(requeteSite.getUtilisateur(), requeteSite.getRequeteService(), requeteSite.getJsonObject());
			o.setRequeteSite_(requeteSite2);
			futures.add(Future.future(promise1 -> {
				patchenusUtilisateurSiteFuture(o, false).onSuccess(a -> {
					promise1.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("listePATCHEnUSUtilisateurSite a échoué. "), ex);
					promise1.fail(ex);
				});
			}));
		});
		CompositeFuture.all(futures).onSuccess( a -> {
			if(requeteApi != null) {
				requeteApi.setNumPATCH(requeteApi.getNumPATCH() + listeUtilisateurSite.getQueryResponse().getResults().size());
				if(requeteApi.getNumFound() == 1L)
					listeUtilisateurSite.first().requeteApiUtilisateurSite();
				eventBus.publish("websocketUtilisateurSite", JsonObject.mapFrom(requeteApi).toString());
			}
			listeUtilisateurSite.next().onSuccess(suivant -> {
				if(suivant) {
					listePATCHEnUSUtilisateurSite(requeteApi, listeUtilisateurSite);
				} else {
					promise.complete();
				}
			}).onFailure(ex -> {
				LOG.error(String.format("listePATCHEnUSUtilisateurSite a échoué. "), ex);
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			LOG.error(String.format("listePATCHEnUSUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override
	public void patchenusUtilisateurSiteFuture(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		utilisateur(requeteService).onSuccess(requeteSite -> {
			try {
				requeteSite.setJsonObject(body);
				requeteService.getParams().getJsonObject("query").put("rows", 1);
				rechercherUtilisateurSiteListe(requeteSite, false, true, true).onSuccess(listeUtilisateurSite -> {
					try {
						UtilisateurSite o = listeUtilisateurSite.first();
						if(o != null && listeUtilisateurSite.getQueryResponse().getResults().getNumFound() == 1) {
							RequeteApi requeteApi = new RequeteApi();
							requeteApi.setRows(1);
							requeteApi.setNumFound(1L);
							requeteApi.setNumPATCH(0L);
							requeteApi.initLoinRequeteApi(requeteSite);
							requeteSite.setRequeteApi_(requeteApi);
							if(Optional.ofNullable(requeteService.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "recharger:false".equals(s)).count() > 0L) {
								requeteSite.getRequeteVars().put( "recharger", "false" );
							}
							if(requeteApi.getNumFound() == 1L)
								requeteApi.setOriginal(o);
							requeteApi.setPk(Optional.ofNullable(listeUtilisateurSite.first()).map(o2 -> o2.getPk()).orElse(null));
							eventBus.publish("websocketUtilisateurSite", JsonObject.mapFrom(requeteApi).toString());
							patchenusUtilisateurSiteFuture(o, false).onSuccess(a -> {
								gestionnaireEvenements.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
							}).onFailure(ex -> {
								gestionnaireEvenements.handle(Future.failedFuture(ex));
							});
						} else {
							gestionnaireEvenements.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().encodePrettily()))));
						}
					} catch(Exception ex) {
						LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
						erreur(requeteSite, gestionnaireEvenements, ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
					erreur(requeteSite, gestionnaireEvenements, ex);
				});
			} catch(Exception ex) {
				LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		}).onFailure(ex -> {
			LOG.error(String.format("patchenusUtilisateurSite a échoué. "), ex);
			erreur(null, gestionnaireEvenements, ex);
		});
	}

	public Future<UtilisateurSite> patchenusUtilisateurSiteFuture(UtilisateurSite o, Boolean inheritPk) {
		RequeteSiteFrFR requeteSite = o.getRequeteSite_();
		Promise<UtilisateurSite> promise = Promise.promise();

		try {
			RequeteApi requeteApi = requeteSite.getRequeteApi_();
			pgPool.withTransaction(connexionSql -> {
				Promise<UtilisateurSite> promise1 = Promise.promise();
				requeteSite.setConnexionSql(connexionSql);
				sqlPATCHEnUSUtilisateurSite(o, inheritPk).onSuccess(utilisateurSite -> {
					definirUtilisateurSite(utilisateurSite).onSuccess(c -> {
						attribuerUtilisateurSite(utilisateurSite).onSuccess(d -> {
							indexerUtilisateurSite(utilisateurSite).onSuccess(e -> {
								promise1.complete(utilisateurSite);
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				requeteSite.setConnexionSql(null);
			}).onFailure(ex -> {
				requeteSite.setConnexionSql(null);
				promise.fail(ex);
			}).compose(utilisateurSite -> {
				Promise<UtilisateurSite> promise2 = Promise.promise();
				rechargerUtilisateurSite(utilisateurSite).onSuccess(a -> {
					promise2.complete(utilisateurSite);
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(utilisateurSite -> {
				promise.complete(utilisateurSite);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("patchenusUtilisateurSiteFuture a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<UtilisateurSite> sqlPATCHEnUSUtilisateurSite(UtilisateurSite o, Boolean inheritPk) {
		Promise<UtilisateurSite> promise = Promise.promise();
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			RequeteApi requeteApi = requeteSite.getRequeteApi_();
			List<Long> pks = Optional.ofNullable(requeteApi).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(requeteApi).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection connexionSql = requeteSite.getConnexionSql();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE UtilisateurSite SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long  = o.get();
			JsonObject jsonObject = requeteSite.getObjetJson();
			Set<String> methodeNoms = jsonObject.fieldNames();
			UtilisateurSite o2 = new UtilisateurSite();
			o2.setRequeteSite_(requeteSite);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			for(String entiteVar : methodeNoms) {
				switch(entiteVar) {
					case "setUserName":
							o2.setUserName(jsonObject.getString(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_userName + "=$" + num);
							num++;
							bParams.add(o2.sqlUserName());
						break;
					case "setUserEmail":
							o2.setUserEmail(jsonObject.getString(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_userEmail + "=$" + num);
							num++;
							bParams.add(o2.sqlUserEmail());
						break;
					case "setCustomerProfileId1":
							o2.setCustomerProfileId1(jsonObject.getString(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_customerProfileId1 + "=$" + num);
							num++;
							bParams.add(o2.sqlCustomerProfileId1());
						break;
					case "setUserReceiveEmails":
							o2.setUserReceiveEmails(jsonObject.getBoolean(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_userReceiveEmails + "=$" + num);
							num++;
							bParams.add(o2.sqlUserReceiveEmails());
						break;
					case "setSeeArchived":
							o2.setSeeArchived(jsonObject.getBoolean(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_seeArchived + "=$" + num);
							num++;
							bParams.add(o2.sqlSeeArchived());
						break;
					case "setSeeDeleted":
							o2.setSeeDeleted(jsonObject.getBoolean(entiteVar));
							if(bParams.size() > 0)
								bSql.append(", ");
							bSql.append(UtilisateurSite.VAR_seeDeleted + "=$" + num);
							num++;
							bParams.add(o2.sqlSeeDeleted());
						break;
				}
			}
			bSql.append(" WHERE =$" + num);
			if(bParams.size() > 0) {
				bParams.add();
				num++;
				futures2.add(0, Future.future(a -> {
					connexionSql.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("valeur UtilisateurSite a échoué", ex);
						LOG.error(String.format("attribuerUtilisateurSite a échoué. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					UtilisateurSite o3 = new UtilisateurSite();
					o3.setRequeteSite_(o.getRequeteSite_());
					o3.set();
					promise.complete(o3);
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPATCHEnUSUtilisateurSite a échoué. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPATCHEnUSUtilisateurSite a échoué. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPATCHEnUSUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}


	public Future<ServiceResponse> reponse200PATCHEnUSUtilisateurSite(RequeteSiteFrFR requeteSite) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			JsonObject json = new JsonObject();
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("reponse200PATCHEnUSUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// POSTEnUS //

	@Override
	public void postenusUtilisateurSite(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		LOG.debug(String.format("postenusUtilisateurSite a démarré. "));
		utilisateur(requeteService).onSuccess(requeteSite -> {
			try {
				requeteSite.setJsonObject(body);
				{
					RequeteApi requeteApi = new RequeteApi();
					requeteApi.setRows(1);
					requeteApi.setNumFound(1L);
					requeteApi.setNumPATCH(0L);
					requeteApi.initLoinRequeteApi(requeteSite);
					requeteSite.setRequeteApi_(requeteApi);
					eventBus.publish("websocketUtilisateurSite", JsonObject.mapFrom(requeteApi).toString());
					JsonObject params = new JsonObject();
					params.put("body", requeteSite.getJsonObject());
					params.put("path", new JsonObject());
					params.put("cookie", new JsonObject());
					params.put("header", new JsonObject());
					params.put("form", new JsonObject());
					JsonObject query = new JsonObject();
					Boolean softCommit = Optional.ofNullable(requeteSite.getRequeteService().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
					Integer commitWithin = Optional.ofNullable(requeteSite.getRequeteService().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
					if(softCommit == null && commitWithin == null)
						softCommit = true;
					if(softCommit)
						query.put("softCommit", softCommit);
					if(commitWithin != null)
						query.put("commitWithin", commitWithin);
					params.put("query", query);
					JsonObject context = new JsonObject().put("params", params).put("user", Optional.ofNullable(requeteSite.getUtilisateur()).map(utilisateur -> utilisateur.principal()).orElse(null));
					JsonObject json = new JsonObject().put("context", context);
					eventBus.request("computate.org-enUS-UtilisateurSite", json, new DeliveryOptions().addHeader("action", "postenusUtilisateurSiteFuture")).onSuccess(a -> {
						JsonObject responseMessage = (JsonObject)a.body();
						JsonObject responseBody = new JsonObject(new String(Base64.getDecoder().decode(responseMessage.getString("payload")), Charset.forName("UTF-8")));
						requeteApi.setPk(Long.parseLong(responseBody.getString("pk")));
						gestionnaireEvenements.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(responseBody.encodePrettily()))));
						LOG.debug(String.format("postenusUtilisateurSite a réussi. "));
					}).onFailure(ex -> {
						LOG.error(String.format("postenusUtilisateurSite a échoué. "), ex);
						erreur(requeteSite, gestionnaireEvenements, ex);
					});
				}
			} catch(Exception ex) {
				LOG.error(String.format("postenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || "invalid_grant: Refresh token expired".equals(ex.getMessage())) {
				try {
					gestionnaireEvenements.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/deconnexion?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postenusUtilisateurSite a échoué. ", ex2));
					erreur(null, gestionnaireEvenements, ex2);
				}
			} else {
				LOG.error(String.format("postenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		});
	}


	@Override
	public void postenusUtilisateurSiteFuture(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		utilisateur(requeteService).onSuccess(requeteSite -> {
			RequeteApi requeteApi = new RequeteApi();
			requeteApi.setRows(1);
			requeteApi.setNumFound(1L);
			requeteApi.setNumPATCH(0L);
			requeteApi.initLoinRequeteApi(requeteSite);
			requeteSite.setRequeteApi_(requeteApi);
			if(Optional.ofNullable(requeteService.getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getJsonArray("var")).orElse(new JsonArray()).stream().filter(s -> "recharger:false".equals(s)).count() > 0L) {
				requeteSite.getRequeteVars().put( "recharger", "false" );
			}
			postenusUtilisateurSiteFuture(requeteSite, false).onSuccess(o -> {
				gestionnaireEvenements.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(JsonObject.mapFrom(o).encodePrettily()))));
			}).onFailure(ex -> {
				gestionnaireEvenements.handle(Future.failedFuture(ex));
			});
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || "invalid_grant: Refresh token expired".equals(ex.getMessage())) {
				try {
					gestionnaireEvenements.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/deconnexion?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("postenusUtilisateurSite a échoué. ", ex2));
					erreur(null, gestionnaireEvenements, ex2);
				}
			} else {
				LOG.error(String.format("postenusUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		});
	}

	public Future<UtilisateurSite> postenusUtilisateurSiteFuture(RequeteSiteFrFR requeteSite, Boolean inheritPk) {
		Promise<UtilisateurSite> promise = Promise.promise();

		try {
			pgPool.withTransaction(connexionSql -> {
				Promise<UtilisateurSite> promise1 = Promise.promise();
				requeteSite.setConnexionSql(connexionSql);
				creerUtilisateurSite(requeteSite).onSuccess(utilisateurSite -> {
					sqlPOSTEnUSUtilisateurSite(utilisateurSite, inheritPk).onSuccess(b -> {
						definirUtilisateurSite(utilisateurSite).onSuccess(c -> {
							attribuerUtilisateurSite(utilisateurSite).onSuccess(d -> {
								indexerUtilisateurSite(utilisateurSite).onSuccess(e -> {
									promise1.complete(utilisateurSite);
								}).onFailure(ex -> {
									promise1.fail(ex);
								});
							}).onFailure(ex -> {
								promise1.fail(ex);
							});
						}).onFailure(ex -> {
							promise1.fail(ex);
						});
					}).onFailure(ex -> {
						promise1.fail(ex);
					});
				}).onFailure(ex -> {
					promise1.fail(ex);
				});
				return promise1.future();
			}).onSuccess(a -> {
				requeteSite.setConnexionSql(null);
			}).onFailure(ex -> {
				requeteSite.setConnexionSql(null);
				promise.fail(ex);
			}).compose(utilisateurSite -> {
				Promise<UtilisateurSite> promise2 = Promise.promise();
				rechargerUtilisateurSite(utilisateurSite).onSuccess(a -> {
					try {
						RequeteApi requeteApi = requeteSite.getRequeteApi_();
						if(requeteApi != null) {
							requeteApi.setNumPATCH(requeteApi.getNumPATCH() + 1);
							utilisateurSite.requeteApiUtilisateurSite();
							eventBus.publish("websocketUtilisateurSite", JsonObject.mapFrom(requeteApi).toString());
						}
						promise2.complete(utilisateurSite);
					} catch(Exception ex) {
						LOG.error(String.format("postenusUtilisateurSiteFuture a échoué. "), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					promise2.fail(ex);
				});
				return promise2.future();
			}).onSuccess(utilisateurSite -> {
				promise.complete(utilisateurSite);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("postenusUtilisateurSiteFuture a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> sqlPOSTEnUSUtilisateurSite(UtilisateurSite o, Boolean inheritPk) {
		Promise<Void> promise = Promise.promise();
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			RequeteApi requeteApi = requeteSite.getRequeteApi_();
			List<Long> pks = Optional.ofNullable(requeteApi).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(requeteApi).map(r -> r.getClasses()).orElse(new ArrayList<>());
			SqlConnection connexionSql = requeteSite.getConnexionSql();
			Integer num = 1;
			StringBuilder bSql = new StringBuilder("UPDATE UtilisateurSite SET ");
			List<Object> bParams = new ArrayList<Object>();
			Long  = o.get();
			JsonObject jsonObject = requeteSite.getObjetJson();
			UtilisateurSite o2 = new UtilisateurSite();
			o2.setRequeteSite_(requeteSite);
			List<Future> futures1 = new ArrayList<>();
			List<Future> futures2 = new ArrayList<>();

			if(requeteSite.getSessionId() != null) {
				if(bParams.size() > 0) {
					bSql.append(", ");
				}
				bSql.append("sessionId=$" + num);
				num++;
				bParams.add(requeteSite.getSessionId());
			}
			if(requeteSite.getUtilisateurCle() != null) {
				if(bParams.size() > 0) {
					bSql.append(", ");
				}
				bSql.append("utilisateurCle=$" + num);
				num++;
				bParams.add(requeteSite.getUtilisateurCle());
			}
			if(requeteSite.getUtilisateurId() != null) {
				if(bParams.size() > 0) {
					bSql.append(", ");
				}
				bSql.append("utilisateurId=$" + num);
				num++;
				bParams.add(requeteSite.getUtilisateurId());
			}

			if(jsonObject != null) {
				Set<String> entiteVars = jsonObject.fieldNames();
				for(String entiteVar : entiteVars) {
					switch(entiteVar) {
					case UtilisateurSite.VAR_userName:
						o2.setUserName(jsonObject.getString(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_userName + "=$" + num);
						num++;
						bParams.add(o2.sqlUserName());
						break;
					case UtilisateurSite.VAR_userEmail:
						o2.setUserEmail(jsonObject.getString(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_userEmail + "=$" + num);
						num++;
						bParams.add(o2.sqlUserEmail());
						break;
					case UtilisateurSite.VAR_customerProfileId1:
						o2.setCustomerProfileId1(jsonObject.getString(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_customerProfileId1 + "=$" + num);
						num++;
						bParams.add(o2.sqlCustomerProfileId1());
						break;
					case UtilisateurSite.VAR_userReceiveEmails:
						o2.setUserReceiveEmails(jsonObject.getBoolean(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_userReceiveEmails + "=$" + num);
						num++;
						bParams.add(o2.sqlUserReceiveEmails());
						break;
					case UtilisateurSite.VAR_seeArchived:
						o2.setSeeArchived(jsonObject.getBoolean(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_seeArchived + "=$" + num);
						num++;
						bParams.add(o2.sqlSeeArchived());
						break;
					case UtilisateurSite.VAR_seeDeleted:
						o2.setSeeDeleted(jsonObject.getBoolean(entiteVar));
						if(bParams.size() > 0) {
							bSql.append(", ");
						}
						bSql.append(UtilisateurSite.VAR_seeDeleted + "=$" + num);
						num++;
						bParams.add(o2.sqlSeeDeleted());
						break;
					}
				}
			}
			bSql.append(" WHERE =$" + num);
			if(bParams.size() > 0) {
			bParams.add();
			num++;
				futures2.add(0, Future.future(a -> {
					connexionSql.preparedQuery(bSql.toString())
							.execute(Tuple.tuple(bParams)
							).onSuccess(b -> {
						a.handle(Future.succeededFuture());
					}).onFailure(ex -> {
						RuntimeException ex2 = new RuntimeException("valeur UtilisateurSite a échoué", ex);
						LOG.error(String.format("attribuerUtilisateurSite a échoué. "), ex2);
						a.handle(Future.failedFuture(ex2));
					});
				}));
			}
			CompositeFuture.all(futures1).onSuccess(a -> {
				CompositeFuture.all(futures2).onSuccess(b -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("sqlPOSTEnUSUtilisateurSite a échoué. "), ex);
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("sqlPOSTEnUSUtilisateurSite a échoué. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("sqlPOSTEnUSUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}


	public Future<ServiceResponse> reponse200POSTEnUSUtilisateurSite(UtilisateurSite o) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			JsonObject json = JsonObject.mapFrom(o);
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("reponse200POSTEnUSUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// SearchPage //

	@Override
	public void searchpageUtilisateurSiteId(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		searchpageUtilisateurSite(requeteService, gestionnaireEvenements);
	}

	@Override
	public void searchpageUtilisateurSite(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements) {
		utilisateur(requeteService).onSuccess(requeteSite -> {
			try {
				{
					reponse200SearchPageUtilisateurSite(requeteSite).onSuccess(reponse -> {
						gestionnaireEvenements.handle(Future.succeededFuture(reponse));
						LOG.debug(String.format("searchpageUtilisateurSite a réussi. "));
					}).onFailure(ex -> {
						LOG.error(String.format("searchpageUtilisateurSite a échoué. ", c.cause()));
						erreur(requeteSite, gestionnaireEvenements, c);
					});
				}
			} catch(Exception ex) {
				LOG.error(String.format("searchpageUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		}).onFailure(ex -> {
			if("Inactive Token".equals(ex.getMessage()) || "invalid_grant: Refresh token expired".equals(ex.getMessage())) {
				try {
					gestionnaireEvenements.handle(Future.succeededFuture(new ServiceResponse(302, "Found", null, MultiMap.caseInsensitiveMultiMap().add(HttpHeaders.LOCATION, "/deconnexion?redirect_uri=" + URLEncoder.encode(serviceRequest.getExtra().getString("uri"), "UTF-8")))));
				} catch(Exception ex2) {
					LOG.error(String.format("searchpageUtilisateurSite a échoué. ", ex2));
					erreur(null, gestionnaireEvenements, ex2);
				}
			} else {
				LOG.error(String.format("searchpageUtilisateurSite a échoué. "), ex);
				erreur(null, gestionnaireEvenements, ex);
			}
		});
	}


	public void searchpageUtilisateurSitePageInit(UtilisateurSitePage page, ListeRecherche<UtilisateurSite> listeUtilisateurSite) {
	}
	public String templateSearchPageUtilisateurSite() {
		return Optional.ofNullable(config.getString(ConfigCles.TEMPLATE_PATH)).orElse("templates") + "/enUS/UtilisateurSitePage";
	}
	public Future<ServiceResponse> reponse200SearchPageUtilisateurSite(RequeteSiteFrFR requeteSite) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			promise.complete(ServiceResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily())));
		} catch(Exception ex) {
			LOG.error(String.format("reponse200SearchPageUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	// General //

	public void rechercherUtilisateurSiteQ(ListeRecherche<UtilisateurSite> listeRecherche, String entiteVar, String valeurIndexe, String varIndexe) {
		listeRecherche.setQuery(varIndexe + ":" + ("*".equals(valeurIndexe) ? valeurIndexe : ClientUtils.escapeQueryChars(valeurIndexe)));
		if(!"*".equals(entiteVar)) {
		}
	}

	public String rechercherUtilisateurSiteFq(ListeRecherche<UtilisateurSite> listeRecherche, String entiteVar, String valeurIndexe, String varIndexe) {
		if(varIndexe == null)
			throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		if(StringUtils.startsWith(valeurIndexe, "[")) {
			String[] fqs = StringUtils.substringBefore(StringUtils.substringAfter(valeurIndexe, "["), "]").split(" TO ");
			if(fqs.length != 2)
				throw new RuntimeException(String.format("\"%s\" invalid range query. ", valeurIndexe));
			String fq1 = fqs[0].equals("*") ? fqs[0] : UtilisateurSite.staticSolrFqPourClasse(entiteVar, listeRecherche.getRequeteSite_(), fqs[0]);
			String fq2 = fqs[1].equals("*") ? fqs[1] : UtilisateurSite.staticSolrFqPourClasse(entiteVar, listeRecherche.getRequeteSite_(), fqs[1]);
			 return varIndexe + ":[" + fq1 + " TO " + fq2 + "]";
		} else {
			return varIndexe + ":" + ClientUtils.escapeQueryChars(UtilisateurSite.staticSolrFqPourClasse(entiteVar, listeRecherche.getRequeteSite_(), valeurIndexe)).replace("\\", "\\\\");
		}
	}

	public void rechercherUtilisateurSiteSort(ListeRecherche<UtilisateurSite> listeRecherche, String entiteVar, String valeurIndexe, String varIndexe) {
		if(varIndexe == null)
			throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		listeRecherche.addSort(varIndexe, ORDER.valueOf(valeurIndexe));
	}

	public void rechercherUtilisateurSiteRows(ListeRecherche<UtilisateurSite> listeRecherche, Integer valeurRows) {
			listeRecherche.setRows(valeurRows != null ? valeurRows : 10);
	}

	public void rechercherUtilisateurSiteStart(ListeRecherche<UtilisateurSite> listeRecherche, Integer valeurStart) {
		listeRecherche.setStart(valeurStart);
	}

	public void rechercherUtilisateurSiteVar(ListeRecherche<UtilisateurSite> listeRecherche, String var, String valeur) {
		listeRecherche.getRequeteSite_().getRequeteVars().put(var, valeur);
	}

	public void rechercherUtilisateurSiteUri(ListeRecherche<UtilisateurSite> listeRecherche) {
	}

	public Future<ServiceResponse> varsUtilisateurSite(RequeteSiteFrFR requeteSite) {
		Promise<ServiceResponse> promise = Promise.promise();
		try {
			ServiceRequest requeteService = requeteSite.getRequeteService();

			requeteService.getParams().getJsonObject("query").stream().filter(paramRequete -> "var".equals(paramRequete.getKey()) && paramRequete.getValue() != null).findFirst().ifPresent(paramRequete -> {
				String entiteVar = null;
				String valeurIndexe = null;
				Object paramValeursObjet = paramRequete.getValue();
				JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

				try {
					for(Object paramObjet : paramObjets) {
						entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
						valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
						requeteSite.getRequeteVars().put(entiteVar, valeurIndexe);
					}
				} catch(Exception ex) {
					LOG.error(String.format("rechercherUtilisateurSite a échoué. "), ex);
					promise.fail(ex);
				}
			});
			promise.complete();
		} catch(Exception ex) {
			LOG.error(String.format("rechercherUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<ListeRecherche<UtilisateurSite>> rechercherUtilisateurSiteListe(RequeteSiteFrFR requeteSite, Boolean peupler, Boolean stocker, Boolean modifier) {
		Promise<ListeRecherche<UtilisateurSite>> promise = Promise.promise();
		try {
			ServiceRequest requeteService = requeteSite.getRequeteService();
			String entiteListeStr = requeteSite.getRequeteService().getParams().getJsonObject("query").getString("fl");
			String[] entiteListe = entiteListeStr == null ? null : entiteListeStr.split(",\\s*");
			ListeRecherche<UtilisateurSite> listeRecherche = new ListeRecherche<UtilisateurSite>();
			listeRecherche.setPeupler(peupler);
			listeRecherche.setStocker(stocker);
			listeRecherche.setQuery("*:*");
			listeRecherche.setC(UtilisateurSite.class);
			listeRecherche.setRequeteSite_(requeteSite);
			if(entiteListe != null)
				listeRecherche.addFields(entiteListe);

			String id = requeteService.getParams().getJsonObject("path").getString("id");
			if( != null && NumberUtils.isCreatable()) {
				listeRecherche.addFilterQuery("(_docvalues_long:" + ClientUtils.escapeQueryChars(id) + " OR _docvalues_string:" + ClientUtils.escapeQueryChars(id) + ")");
			} else if( != null) {
				listeRecherche.addFilterQuery("_docvalues_string:" + ClientUtils.escapeQueryChars(id));
			}

			List<String> roles = Optional.ofNullable(config.getValue(ConfigCles.AUTH_ROLES_REQUIS + "_UtilisateurSite")).map(v -> v instanceof JsonArray ? (JsonArray)v : new JsonArray(v.toString())).orElse(new JsonArray()).getList();
			List<String> roleLires = Arrays.asList("");
			if(
					!CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRessource(), roles)
					&& !CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRoyaume(), roles)
					&& (modifier || !CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRessource(), roleLires))
					&& (modifier || !CollectionUtils.containsAny(requeteSite.getUtilisateurRolesRoyaume(), roleLires))
					) {
				listeRecherche.addFilterQuery("sessionId_docvalues_string:" + ClientUtils.escapeQueryChars(Optional.ofNullable(requeteSite.getSessionId()).orElse("-----")) + " OR " + "sessionId_docvalues_string:" + ClientUtils.escapeQueryChars(Optional.ofNullable(requeteSite.getSessionIdAvant()).orElse("-----"))
						+ " OR utilisateurCles_docvalues_longs:" + Optional.ofNullable(requeteSite.getUtilisateurCle()).orElse(0L));
			}

			requeteService.getParams().getJsonObject("query").forEach(paramRequete -> {
				String entiteVar = null;
				String valeurIndexe = null;
				String varIndexe = null;
				String valeurTri = null;
				Integer valeurStart = null;
				Integer valeurRows = null;
				String valeurCursorMark = null;
				String paramNom = paramRequete.getKey();
				Object paramValeursObjet = paramRequete.getValue();
				JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

				try {
					if(paramValeursObjet != null && "facet.pivot".equals(paramNom)) {
						Matcher mFacetPivot = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher(StringUtils.join(paramObjets.getList().toArray(), ","));
						boolean foundFacetPivot = mFacetPivot.find();
						if(foundFacetPivot) {
							String solrLocalParams = mFacetPivot.group(1);
							String[] entiteVars = mFacetPivot.group(2).trim().split(",");
							String[] varsIndexe = new String[entiteVars.length];
							for(Integer i = 0; i < entiteVars.length; i++) {
								entiteVar = entiteVars[i];
								varsIndexe[i] = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
							}
							listeRecherche.add("facet.pivot", (solrLocalParams == null ? "" : solrLocalParams) + StringUtils.join(varsIndexe, ","));
						}
					} else if(paramValeursObjet != null) {
						for(Object paramObjet : paramObjets) {
							switch(paramNom) {
								case "q":
									Matcher mQ = Pattern.compile("(\\w+):(.+?(?=(\\)|\\s+OR\\s+|\\s+AND\\s+|\\^|$)))").matcher((String)paramObjet);
									boolean foundQ = mQ.find();
									if(foundQ) {
										StringBuffer sb = new StringBuffer();
										while(foundQ) {
											entiteVar = mQ.group(1).trim();
											valeurIndexe = mQ.group(2).trim();
											varIndexe = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
											String entiteQ = rechercherUtilisateurSiteFq(listeRecherche, entiteVar, valeurIndexe, varIndexe);
											mQ.appendReplacement(sb, entiteQ);
											foundQ = mQ.find();
										}
										mQ.appendTail(sb);
										listeRecherche.setQuery(sb.toString());
									}
									break;
								case "fq":
									Matcher mFq = Pattern.compile("(\\w+):(.+?(?=(\\)|\\s+OR\\s+|\\s+AND\\s+|$)))").matcher((String)paramObjet);
									boolean foundFq = mFq.find();
									if(foundFq) {
										StringBuffer sb = new StringBuffer();
										while(foundFq) {
											entiteVar = mFq.group(1).trim();
											valeurIndexe = mFq.group(2).trim();
											varIndexe = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
											String entiteFq = rechercherUtilisateurSiteFq(listeRecherche, entiteVar, valeurIndexe, varIndexe);
											mFq.appendReplacement(sb, entiteFq);
											foundFq = mFq.find();
										}
										mFq.appendTail(sb);
										listeRecherche.addFilterQuery(sb.toString());
									}
									break;
								case "sort":
									entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, " "));
									valeurIndexe = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, " "));
									varIndexe = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
									rechercherUtilisateurSiteSort(listeRecherche, entiteVar, valeurIndexe, varIndexe);
									break;
								case "start":
									valeurStart = paramObjet instanceof Integer ? (Integer)paramObjet : Integer.parseInt(paramObjet.toString());
									rechercherUtilisateurSiteStart(listeRecherche, valeurStart);
									break;
								case "rows":
									valeurRows = paramObjet instanceof Integer ? (Integer)paramObjet : Integer.parseInt(paramObjet.toString());
									rechercherUtilisateurSiteRows(listeRecherche, valeurRows);
									break;
								case "facet":
									listeRecherche.add("facet", ((Boolean)paramObjet).toString());
									break;
								case "facet.range.start":
									String startMathStr = (String)paramObjet;
									Date start = DateMathParser.parseMath(null, startMathStr);
									listeRecherche.add("facet.range.start", start.toInstant().toString());
									break;
								case "facet.range.end":
									String endMathStr = (String)paramObjet;
									Date end = DateMathParser.parseMath(null, endMathStr);
									listeRecherche.add("facet.range.end", end.toInstant().toString());
									break;
								case "facet.range.gap":
									String gap = (String)paramObjet;
									listeRecherche.add("facet.range.gap", gap);
									break;
								case "facet.range":
									Matcher mFacetRange = Pattern.compile("(?:(\\{![^\\}]+\\}))?(.*)").matcher((String)paramObjet);
									boolean foundFacetRange = mFacetRange.find();
									if(foundFacetRange) {
										String solrLocalParams = mFacetRange.group(1);
										entiteVar = mFacetRange.group(2).trim();
										varIndexe = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
										listeRecherche.add("facet.range", (solrLocalParams == null ? "" : solrLocalParams) + varIndexe);
									}
									break;
								case "facet.field":
									entiteVar = (String)paramObjet;
									varIndexe = UtilisateurSite.varIndexeUtilisateurSite(entiteVar);
									if(varIndexe != null)
										listeRecherche.addFacetField(varIndexe);
									break;
								case "var":
									entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
									valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
									rechercherUtilisateurSiteVar(listeRecherche, entiteVar, valeurIndexe);
									break;
								case "cursorMark":
									valeurCursorMark = (String)paramObjet;
									listeRecherche.add("cursorMark", (String)paramObjet);
									break;
							}
						}
						rechercherUtilisateurSiteUri(listeRecherche);
					}
				} catch(Exception e) {
					ExceptionUtils.rethrow(e);
				}
			});
			rechercherUtilisateurSite2(requeteSite, peupler, stocker, modifier, listeRecherche);
			listeRecherche.promesseLoinPourClasse(requeteSite).onSuccess(a -> {
				promise.complete(listeRecherche);
			}).onFailure(ex -> {
				LOG.error(String.format("rechercherUtilisateurSite a échoué. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("rechercherUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}
	public void rechercherUtilisateurSite2(RequeteSiteFrFR requeteSite, Boolean peupler, Boolean stocker, Boolean modifier, ListeRecherche<UtilisateurSite> listeRecherche) {
	}

	public Future<Void> definirUtilisateurSite(UtilisateurSite o) {
		Promise<Void> promise = Promise.promise();
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			SqlConnection connexionSql = requeteSite.getConnexionSql();
			Long  = o.get();
			connexionSql.preparedQuery("SELECT * FROM UtilisateurSite WHERE =$1")
					.collecting(Collectors.toList())
					.execute(Tuple.of()
					).onSuccess(resultat -> {
				try {
					for(Row definition : resultat.value()) {
						for(Integer i = 0; i < definition.size(); i++) {
							String columnName = definition.getColumnName(i);
							Object columnValue = definition.getValue(i);
							if(!"".equals(columnName)) {
								try {
									o.definirPourClasse(columnName, columnValue);
								} catch(Exception e) {
									LOG.error(String.format("definirUtilisateurSite a échoué. "), e);
								}
							}
						}
					}
					promise.complete();
				} catch(Exception ex) {
					LOG.error(String.format("definirUtilisateurSite a échoué. "), ex);
					promise.fail(ex);
				}
			}).onFailure(ex -> {
				RuntimeException ex2 = new RuntimeException(ex);
				LOG.error(String.format("definirUtilisateurSite a échoué. "), ex2);
				promise.fail(ex2);
			});
		} catch(Exception ex) {
			LOG.error(String.format("definirUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

	public Future<Void> attribuerUtilisateurSite(UtilisateurSite o) {
		Promise<Void> promise = Promise.promise();
			promise.complete();
		return promise.future();
	}

	public Future<Void> indexerUtilisateurSite(UtilisateurSite o) {
		Promise<Void> promise = Promise.promise();
		try {
			RequeteSiteFrFR requeteSite = o.getRequeteSite_();
			RequeteApi requeteApi = requeteSite.getRequeteApi_();
			o.promesseLoinPourClasse(requeteSite).onSuccess(a -> {
				SolrInputDocument document = new SolrInputDocument();
				o.indexerUtilisateurSite(document);
				String solrHostName = requeteSite.getConfig().getString(ConfigCles.SOLR_HOST_NAME);
				Integer solrPort = requeteSite.getConfig().getInteger(ConfigCles.SOLR_PORT);
				String solrCollection = requeteSite.getConfig().getString(ConfigCles.SOLR_COLLECTION);
				Boolean softCommit = Optional.ofNullable(requeteSite.getRequeteService().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getBoolean("softCommit")).orElse(null);
				Integer commitWithin = Optional.ofNullable(requeteSite.getRequeteService().getParams()).map(p -> p.getJsonObject("query")).map( q -> q.getInteger("commitWithin")).orElse(null);
					if(softCommit == null && commitWithin == null)
						softCommit = true;
					else if(softCommit == null)
						softCommit = false;
				String solrRequestUri = String.format("/solr/%s/update%s%s%s", solrCollection, "?overwrite=true&wt=json", softCommit ? "&softCommit=true" : "", commitWithin != null ? ("&commitWithin=" + commitWithin) : "");
				JsonArray json = new JsonArray().add(new JsonObject(document.toMap(new HashMap<String, Object>())));
				clientWeb.post(solrPort, solrHostName, solrRequestUri).putHeader("Content-Type", "application/json").expect(ResponsePredicate.SC_OK).sendBuffer(json.toBuffer()).onSuccess(b -> {
					promise.complete();
				}).onFailure(ex -> {
					LOG.error(String.format("indexerUtilisateurSite a échoué. "), new RuntimeException(ex));
					promise.fail(ex);
				});
			}).onFailure(ex -> {
				LOG.error(String.format("indexerUtilisateurSite a échoué. "), ex);
				promise.fail(ex);
			});
		} catch(Exception ex) {
			LOG.error(String.format("indexerUtilisateurSite a échoué. "), ex);
			promise.fail(ex);
		}
		return promise.future();
	}

}
