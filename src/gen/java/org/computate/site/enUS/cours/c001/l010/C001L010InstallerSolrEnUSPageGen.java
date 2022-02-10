package org.computate.site.enUS.cours.c001.l010;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolrEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolrEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L010InstallerSolrEnUSPageGen<DEV> extends C001L010InstallerSolrEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L010InstallerSolrEnUSPage = false;

	public C001L010InstallerSolrEnUSPage initLoinC001L010InstallerSolrEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L010InstallerSolrEnUSPage) {
			dejaInitialiseC001L010InstallerSolrEnUSPage = true;
			initLoinC001L010InstallerSolrEnUSPage();
		}
		return (C001L010InstallerSolrEnUSPage)this;
	}

	public void initLoinC001L010InstallerSolrEnUSPage() {
		super.initLoinC001L010InstallerSolrEnUSGenPage(requeteSite_);
		initC001L010InstallerSolrEnUSPage();
	}

	public void initC001L010InstallerSolrEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L010InstallerSolrEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L010InstallerSolrEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L010InstallerSolrEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L010InstallerSolrEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L010InstallerSolrEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L010InstallerSolrEnUSPage(String var) {
		C001L010InstallerSolrEnUSPage oC001L010InstallerSolrEnUSPage = (C001L010InstallerSolrEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L010InstallerSolrEnUSGenPage(var);
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
				o = attribuerC001L010InstallerSolrEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L010InstallerSolrEnUSPage(String var, Object val) {
		C001L010InstallerSolrEnUSPage oC001L010InstallerSolrEnUSPage = (C001L010InstallerSolrEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L010InstallerSolrEnUSGenPage(var, val);
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
					o = definirC001L010InstallerSolrEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L010InstallerSolrEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L010InstallerSolrEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L010InstallerSolrEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L010InstallerSolrEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L010InstallerSolrEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L010InstallerSolrEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L010InstallerSolrEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L010InstallerSolrEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L010InstallerSolrEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L010InstallerSolrEnUSPage() {
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
		if(!(o instanceof C001L010InstallerSolrEnUSPage))
			return false;
		C001L010InstallerSolrEnUSPage that = (C001L010InstallerSolrEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L010InstallerSolrEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
