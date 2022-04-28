package org.computate.site.frFR.page.accueil;

import org.computate.site.frFR.contexte.SiteContexteFrFR;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.ext.web.api.generator.WebApiServiceGen;
import io.vertx.serviceproxy.ServiceBinder;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

/**
 * Traduire: false
 * Gen: false
 **/
@WebApiServiceGen
@ProxyGen
public interface PageAccueilFrFRGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteFrFR siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("frFRPageAccueil").register(PageAccueilFrFRGenApiService.class, new PageAccueilFrFRApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static PageAccueilFrFRGenApiService creer(SiteContexteFrFR siteContexte, Vertx vertx) {
		return new PageAccueilFrFRApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static PageAccueilFrFRGenApiService creerProxy(Vertx vertx, String addresse) {
		return new PageAccueilFrFRGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchefrfrpagePageAccueilId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void recherchefrfrpagePageAccueil(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
