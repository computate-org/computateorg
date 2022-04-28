package org.computate.site.frFR.vertx;

import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
/**
 * Traduire: false
 */
public class AppliOpenApi3 extends AppliOpenApi3Gen<AppliSwagger2> {  

	@Override protected void _apiVersion(Couverture<String> c) {
		c.o("3.0.0");
	}

	/**
	 * r: FrFR
	 * r.enUS: EnUS
	 */
	public static void main(String[] args) {
		AppliOpenApi3 api = new AppliOpenApi3();
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR(requeteSite);
		api.initLoinAppliOpenApi3(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		api.ecrireOpenApi();
	}
}
