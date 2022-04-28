package org.computate.site.frFR.cluster;

import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.site.SiteIndexer;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

/**
 * Traduire: false
 **/
public class ClusterFrFRApiServiceImpl extends ClusterFrFRGenApiServiceImpl {

	public ClusterFrFRApiServiceImpl(SiteContexteFrFR siteContexte) {
		super(siteContexte);
	}

	@Override
	public void patchCluster(JsonObject body, OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSiteFrFR requeteSite = genererRequeteSiteFrFRPourCluster(siteContexte, operationRequete, body);
			sqlCluster(requeteSite, a -> {
				if(a.succeeded()) {
					utilisateurCluster(requeteSite, b -> {
						if(b.succeeded()) {
							JsonArray fls = operationRequete.getParams().getJsonObject("query").getJsonArray("fq");
							if(fls == null || fls.size() == 0) {
								WorkerExecutor executeurTravailleur = siteContexte.getExecuteurTravailleur();
								executeurTravailleur.executeBlocking(future -> {
									SiteIndexer.main();
									future.complete();
								}, res -> {
									LOGGER.info("SiteIndexer terminé. ");
									Buffer buffer = Buffer.buffer();
									buffer.appendString("{}");
									gestionnaireEvenements.handle(Future.succeededFuture(OperationResponse.completedWithJson(buffer)));
								});
							}
							else {
								rechercheCluster(requeteSite, false, true, null, c -> {
									if(c.succeeded()) {
										ListeRecherche<Cluster> listeCluster = c.result();
										listePATCHCluster(listeCluster, d -> {
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
																	erreurCluster(requeteSite, gestionnaireEvenements, f);
																}
															});
														} else {
															erreurCluster(requeteSite, gestionnaireEvenements, e);
														}
													});
												}
											} else {
												erreurCluster(requeteSite, gestionnaireEvenements, d);
											}
										});
									} else {
										erreurCluster(requeteSite, gestionnaireEvenements, c);
									}
								});
							}
						} else {
							erreurCluster(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurCluster(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurCluster(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}
}
