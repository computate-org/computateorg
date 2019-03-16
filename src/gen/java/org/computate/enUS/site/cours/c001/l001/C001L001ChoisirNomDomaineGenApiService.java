package org.computate.enUS.site.cours.c001.l001;

import org.computate.frFR.site.contexte.SiteContexte;
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

@WebApiServiceGen
@ProxyGen
public interface C001L001ChoisirNomDomaineGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexte siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("C001L001ChoisirNomDomaine").register(C001L001ChoisirNomDomaineGenApiService.class, new C001L001ChoisirNomDomaineApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L001ChoisirNomDomaineGenApiService creer(SiteContexte siteContexte, Vertx vertx) {
		return new C001L001ChoisirNomDomaineApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L001ChoisirNomDomaineGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L001ChoisirNomDomaineGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void (OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void (OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
