package org.computate.site.frfr.utilisateur;

import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.pgclient.PgPool;

/**
 * Traduire: false
 * NomCanonique.frFR: org.computate.site.frfr.utilisateur.UtilisateurSiteFrFRApiServiceImpl
 **/
public class UtilisateurSiteEnUSApiServiceImpl extends UtilisateurSiteEnUSGenApiServiceImpl {

	public UtilisateurSiteEnUSApiServiceImpl(EventBus eventBus, JsonObject config, WorkerExecutor executeurTravailleur, PgPool pgPool, WebClient clientWeb, OAuth2Auth oauth2AuthenticationProvider, AuthorizationProvider authorizationProvider, HandlebarsTemplateEngine templateEngine) {
		super(eventBus, config, executeurTravailleur, pgPool, clientWeb, oauth2AuthenticationProvider, authorizationProvider, templateEngine);
	}
}
