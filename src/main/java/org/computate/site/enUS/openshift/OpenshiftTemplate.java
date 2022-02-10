package org.computate.site.enUS.openshift;

import java.io.File;

import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enus.config.ConfigSite;
import org.computate.site.site.enUS.couverture.Couverture;

public class OpenshiftTemplate extends OpenshiftTemplateGen<Object> {

	public static void  main(String[] args) {
		OpenshiftTemplate api = new OpenshiftTemplate();
		api.initLoinOpenshiftTemplate();
		api.ecrireOpenshiftTemplate();
	}

	protected void _requeteSite_(Couverture<RequeteSiteEnUS> c) {
	}

	protected void _siteContexte(SiteContexteEnUS o) {
	}

	protected void _configSite(Couverture<ConfigSite> c) {
		c.o(siteContexte.getConfigSite());
	}

	protected void _appliChemin(Couverture<String> c) {
		c.o(configSite.getAppliChemin());
	}

	protected void _openApiYamlChemin(Couverture<String> c) {
		c.o(appliChemin + "/.yaml");
	}

	protected void _openApiYamlFichier(Couverture<File> c) {
		c.o(new File(openApiYamlChemin));
	}

	protected void _w(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, openApiYamlFichier, "  "));
	}

	private void  ecrireOpenshiftTemplate() {
		// TODO Auto-generated method stub
		
	}
}
