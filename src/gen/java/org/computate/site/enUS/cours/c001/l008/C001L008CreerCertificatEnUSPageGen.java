package org.computate.site.enUS.cours.c001.l008;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificatEnUSGenPage;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificatEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatEnUSPageGen<DEV> extends C001L008CreerCertificatEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L008CreerCertificatEnUSPage = false;

	public C001L008CreerCertificatEnUSPage initLoinC001L008CreerCertificatEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificatEnUSPage) {
			dejaInitialiseC001L008CreerCertificatEnUSPage = true;
			initLoinC001L008CreerCertificatEnUSPage();
		}
		return (C001L008CreerCertificatEnUSPage)this;
	}

	public void initLoinC001L008CreerCertificatEnUSPage() {
		super.initLoinC001L008CreerCertificatEnUSGenPage(requeteSite_);
		initC001L008CreerCertificatEnUSPage();
	}

	public void initC001L008CreerCertificatEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L008CreerCertificatEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificatEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L008CreerCertificatEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L008CreerCertificatEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificatEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificatEnUSPage(String var) {
		C001L008CreerCertificatEnUSPage oC001L008CreerCertificatEnUSPage = (C001L008CreerCertificatEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L008CreerCertificatEnUSGenPage(var);
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
				o = attribuerC001L008CreerCertificatEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificatEnUSPage(String var, Object val) {
		C001L008CreerCertificatEnUSPage oC001L008CreerCertificatEnUSPage = (C001L008CreerCertificatEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L008CreerCertificatEnUSGenPage(var, val);
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
					o = definirC001L008CreerCertificatEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificatEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L008CreerCertificatEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L008CreerCertificatEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L008CreerCertificatEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L008CreerCertificatEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificatEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificatEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L008CreerCertificatEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L008CreerCertificatEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L008CreerCertificatEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L008CreerCertificatEnUSPage();
		super.html();
	}

	public void htmlC001L008CreerCertificatEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L008CreerCertificatEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L008CreerCertificatEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L008CreerCertificatEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L008CreerCertificatEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L008CreerCertificatEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L008CreerCertificatEnUSPage() {
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
		if(!(o instanceof C001L008CreerCertificatEnUSPage))
			return false;
		C001L008CreerCertificatEnUSPage that = (C001L008CreerCertificatEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificatEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
