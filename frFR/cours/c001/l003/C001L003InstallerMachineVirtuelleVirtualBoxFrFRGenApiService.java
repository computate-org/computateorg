package org.computate.site.frFR.cours.c001.l003;

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
public interface C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteFrFR siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("frFRC001L003InstallerMachineVirtuelleVirtualBox").register(C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService.class, new C001L003InstallerMachineVirtuelleVirtualBoxFrFRApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService creer(SiteContexteFrFR siteContexte, Vertx vertx) {
		return new C001L003InstallerMachineVirtuelleVirtualBoxFrFRApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchefrfrpageC001L003InstallerMachineVirtuelleVirtualBoxId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void recherchefrfrpageC001L003InstallerMachineVirtuelleVirtualBox(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
