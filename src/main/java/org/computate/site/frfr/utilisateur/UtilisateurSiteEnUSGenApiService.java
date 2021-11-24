package org.computate.site.frfr.utilisateur;

import io.vertx.ext.web.client.WebClient;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.serviceproxy.ServiceBinder;
import io.vertx.core.AsyncResult;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.service.WebApiServiceGen;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.templ.handlebars.HandlebarsTemplateEngine;
import io.vertx.core.WorkerExecutor;
import io.vertx.pgclient.PgPool;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.authorization.AuthorizationProvider;

/**
 * Traduire: false
 * NomCanonique.frFR: org.computate.site.frfr.utilisateur.UtilisateurSiteFrFRGenApiService
 * Gen: false
 **/
@WebApiServiceGen
@ProxyGen
public interface UtilisateurSiteEnUSGenApiService {
	static void enregistrerService(EventBus eventBus, JsonObject config, WorkerExecutor executeurTravailleur, PgPool pgPool, WebClient clientWeb, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("computate.org-enUS-UtilisateurSite").register(UtilisateurSiteEnUSGenApiService.class, new UtilisateurSiteEnUSApiServiceImpl(eventBus, config, executeurTravailleur, pgPool, clientWeb, oauth2AuthenticationProvider, authorizationProvider, templateEngine));
	}

	public void searchUtilisateurSite(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void patchenusUtilisateurSite(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void patchenusUtilisateurSiteFuture(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void postenusUtilisateurSite(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void postenusUtilisateurSiteFuture(JsonObject body, ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void searchpageUtilisateurSiteId(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
	public void searchpageUtilisateurSite(ServiceRequest requeteService, Handler<AsyncResult<ServiceResponse>> gestionnaireEvenements);
}
