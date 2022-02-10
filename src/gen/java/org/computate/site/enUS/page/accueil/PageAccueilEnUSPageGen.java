package org.computate.site.enUS.page.accueil;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.page.accueil.PageAccueilEnUSGenPage;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueilEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilEnUSPageGen<DEV> extends PageAccueilEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueilEnUSPage = false;

	public PageAccueilEnUSPage initLoinPageAccueilEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueilEnUSPage) {
			dejaInitialisePageAccueilEnUSPage = true;
			initLoinPageAccueilEnUSPage();
		}
		return (PageAccueilEnUSPage)this;
	}

	public void initLoinPageAccueilEnUSPage() {
		super.initLoinPageAccueilEnUSGenPage(requeteSite_);
		initPageAccueilEnUSPage();
	}

	public void initPageAccueilEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAccueilEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueilEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePageAccueilEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAccueilEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueilEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueilEnUSPage(String var) {
		PageAccueilEnUSPage oPageAccueilEnUSPage = (PageAccueilEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirPageAccueilEnUSGenPage(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerPageAccueilEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueilEnUSPage(String var, Object val) {
		PageAccueilEnUSPage oPageAccueilEnUSPage = (PageAccueilEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerPageAccueilEnUSGenPage(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirPageAccueilEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueilEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageAccueilEnUSGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAccueilEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyPageAccueilEnUSPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAccueilEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAccueilEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAccueilEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAccueilEnUSPage() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof PageAccueilEnUSPage))
			return false;
		PageAccueilEnUSPage that = (PageAccueilEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueilEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
