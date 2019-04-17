package org.computate.site.enUS.utilisateur;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

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

	@Override public Object obtenirPourClasse(String var) throws Exception {
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
	public Object obtenirUtilisateurSiteEnUSPage(String var) throws Exception {
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

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyUtilisateurSiteEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyUtilisateurSiteEnUSPage() {
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

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlUtilisateurSiteEnUSPage();
		super.html();
	}

	public void htmlUtilisateurSiteEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaUtilisateurSiteEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaUtilisateurSiteEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesUtilisateurSiteEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesUtilisateurSiteEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleUtilisateurSiteEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleUtilisateurSiteEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtUtilisateurSiteEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtUtilisateurSiteEnUSPage() {
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