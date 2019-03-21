package org.computate.enUS.site.vertx;

import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.enUS.site.requete.RequeteSiteEnUS;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.contexte.SiteContexteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.Object;
import org.computate.enUS.site.config.ConfigSite;
import org.apache.commons.lang3.StringUtils;
import java.lang.Exception;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.vertx.AppliPeupler&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class AppliPeuplerGen<DEV> extends Object {

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	L'entité « requeteSite_ »
	 *	 is defined as null before being initialized. 
	 */
	protected RequeteSiteEnUS requeteSite_;
	public Couverture<RequeteSiteEnUS> requeteSite_Couverture = new Couverture<RequeteSiteEnUS>().p(this).c(RequeteSiteEnUS.class).var("requeteSite_").o(requeteSite_);

	/**	<br/>L'entité « requeteSite_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.vertx.AppliPeupler&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteSite_(Couverture<RequeteSiteEnUS> c) throws Exception, Exception;

	public RequeteSiteEnUS getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSiteEnUS requeteSite_) {
		this.requeteSite_ = requeteSite_;
		this.requeteSite_Couverture.dejaInitialise = true;
	}

	//////////////////
	// siteContexte //
	//////////////////

	/**	L'entité « siteContexte »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut SiteContexteEnUS(). 
	 */
	protected SiteContexteEnUS siteContexte = new SiteContexteEnUS();
	public Couverture<SiteContexteEnUS> siteContexteCouverture = new Couverture<SiteContexteEnUS>().p(this).c(SiteContexteEnUS.class).var("siteContexte").o(siteContexte);

	/**	<br/>L'entité « siteContexte »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut SiteContexteEnUS(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.vertx.AppliPeupler&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteContexte">Trouver l'entité siteContexte dans Solr</a>
	 * <br/>
	 * @param siteContexte est l'entité déjà construit. 
	 **/
	protected abstract void _siteContexte(SiteContexteEnUS o) throws Exception, Exception;

	public SiteContexteEnUS getSiteContexte() {
		return siteContexte;
	}

	public void setSiteContexte(SiteContexteEnUS siteContexte) {
		this.siteContexte = siteContexte;
		this.siteContexteCouverture.dejaInitialise = true;
	}
	protected AppliPeupler siteContexteInit() throws Exception {
		if(!siteContexteCouverture.dejaInitialise) {
			_siteContexte(siteContexte);
		}
		siteContexte.initLoinPourClasse(requeteSite_);
		siteContexteCouverture.dejaInitialise(true);
		return (AppliPeupler)this;
	}

	////////////////
	// configSite //
	////////////////

	/**	L'entité « configSite »
	 *	 is defined as null before being initialized. 
	 */
	protected ConfigSite configSite;
	public Couverture<ConfigSite> configSiteCouverture = new Couverture<ConfigSite>().p(this).c(ConfigSite.class).var("configSite").o(configSite);

	/**	<br/>L'entité « configSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.vertx.AppliPeupler&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:configSite">Trouver l'entité configSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _configSite(Couverture<ConfigSite> c) throws Exception, Exception;

	public ConfigSite getConfigSite() {
		return configSite;
	}

	public void setConfigSite(ConfigSite configSite) {
		this.configSite = configSite;
		this.configSiteCouverture.dejaInitialise = true;
	}
	protected AppliPeupler configSiteInit() throws Exception {
		if(!configSiteCouverture.dejaInitialise) {
			_configSite(configSiteCouverture);
			if(configSite == null)
				setConfigSite(configSiteCouverture.o);
		}
		if(configSite != null)
			configSite.initLoinPourClasse(requeteSite_);
		configSiteCouverture.dejaInitialise(true);
		return (AppliPeupler)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseAppliPeupler = false;

	public AppliPeupler initLoinAppliPeupler(RequeteSiteEnUS requeteSite_) throws Exception {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseAppliPeupler) {
			dejaInitialiseAppliPeupler = true;
			initLoinAppliPeupler();
		}
		return (AppliPeupler)this;
	}

	public void initLoinAppliPeupler() throws Exception {
		initAppliPeupler();
	}

	public void initAppliPeupler() throws Exception {
		siteContexteInit();
		configSiteInit();
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) throws Exception {
		initLoinAppliPeupler(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteAppliPeupler(RequeteSiteEnUS requeteSite_) {
		siteContexte.setRequeteSite_(requeteSite_);
		configSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteAppliPeupler(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirAppliPeupler(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirAppliPeupler(String var) throws Exception {
		AppliPeupler oAppliPeupler = (AppliPeupler)this;
		switch(var) {
			case "requeteSite_":
				return oAppliPeupler.requeteSite_;
			case "siteContexte":
				return oAppliPeupler.siteContexte;
			case "configSite":
				return oAppliPeupler.configSite;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerAppliPeupler(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerAppliPeupler(String var, Object val) {
		AppliPeupler oAppliPeupler = (AppliPeupler)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirAppliPeupler(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirAppliPeupler(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof AppliPeupler))
			return false;
		AppliPeupler that = (AppliPeupler)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AppliPeupler {");
		sb.append(" }");
		return sb.toString();
	}
}
