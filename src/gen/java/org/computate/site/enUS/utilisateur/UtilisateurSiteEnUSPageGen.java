package org.computate.site.enUS.utilisateur;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.user.UtilisateurSiteEnUSGenPage;
import org.computate.site.enUS.user.UtilisateurSiteEnUSPage;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class UtilisateurSiteEnUSPageGen<DEV> extends UtilisateurSiteEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseUtilisateurSiteEnUSPage = false;

	public UtilisateurSiteEnUSPage initLoinUtilisateurSiteEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseUtilisateurSiteEnUSPage) {
			dejaInitialiseUtilisateurSiteEnUSPage = true;
			initLoinUtilisateurSiteEnUSPage();
		}
		return (UtilisateurSiteEnUSPage)this;
	}

	public void initLoinUtilisateurSiteEnUSPage() {
		super.initLoinUtilisateurSiteEnUSGenPage(requeteSite_);
		initUtilisateurSiteEnUSPage();
	}

	public void initUtilisateurSiteEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinUtilisateurSiteEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteUtilisateurSiteEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteUtilisateurSiteEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteUtilisateurSiteEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirUtilisateurSiteEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirUtilisateurSiteEnUSPage(String var) {
		UtilisateurSiteEnUSPage oUtilisateurSiteEnUSPage = (UtilisateurSiteEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirUtilisateurSiteEnUSGenPage(var);
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
				o = attribuerUtilisateurSiteEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerUtilisateurSiteEnUSPage(String var, Object val) {
		UtilisateurSiteEnUSPage oUtilisateurSiteEnUSPage = (UtilisateurSiteEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerUtilisateurSiteEnUSGenPage(var, val);
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
					o = definirUtilisateurSiteEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirUtilisateurSiteEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirUtilisateurSiteEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsUtilisateurSiteEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsUtilisateurSiteEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptUtilisateurSiteEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptUtilisateurSiteEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyUtilisateurSiteEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyUtilisateurSiteEnUSPage() {
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
		if(!(o instanceof UtilisateurSiteEnUSPage))
			return false;
		UtilisateurSiteEnUSPage that = (UtilisateurSiteEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("UtilisateurSiteEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
