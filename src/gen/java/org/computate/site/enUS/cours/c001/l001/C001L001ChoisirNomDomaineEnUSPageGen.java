package org.computate.site.enUS.cours.c001.l001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaineEnUSGenPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaineEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineEnUSPageGen<DEV> extends C001L001ChoisirNomDomaineEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaineEnUSPage = false;

	public C001L001ChoisirNomDomaineEnUSPage initLoinC001L001ChoisirNomDomaineEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineEnUSPage) {
			dejaInitialiseC001L001ChoisirNomDomaineEnUSPage = true;
			initLoinC001L001ChoisirNomDomaineEnUSPage();
		}
		return (C001L001ChoisirNomDomaineEnUSPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineEnUSPage() {
		super.initLoinC001L001ChoisirNomDomaineEnUSGenPage(requeteSite_);
		initC001L001ChoisirNomDomaineEnUSPage();
	}

	public void initC001L001ChoisirNomDomaineEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L001ChoisirNomDomaineEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L001ChoisirNomDomaineEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaineEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaineEnUSPage(String var) {
		C001L001ChoisirNomDomaineEnUSPage oC001L001ChoisirNomDomaineEnUSPage = (C001L001ChoisirNomDomaineEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L001ChoisirNomDomaineEnUSGenPage(var);
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
				o = attribuerC001L001ChoisirNomDomaineEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaineEnUSPage(String var, Object val) {
		C001L001ChoisirNomDomaineEnUSPage oC001L001ChoisirNomDomaineEnUSPage = (C001L001ChoisirNomDomaineEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L001ChoisirNomDomaineEnUSGenPage(var, val);
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
					o = definirC001L001ChoisirNomDomaineEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaineEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L001ChoisirNomDomaineEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L001ChoisirNomDomaineEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L001ChoisirNomDomaineEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaineEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L001ChoisirNomDomaineEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L001ChoisirNomDomaineEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L001ChoisirNomDomaineEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L001ChoisirNomDomaineEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L001ChoisirNomDomaineEnUSPage() {
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
		if(!(o instanceof C001L001ChoisirNomDomaineEnUSPage))
			return false;
		C001L001ChoisirNomDomaineEnUSPage that = (C001L001ChoisirNomDomaineEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaineEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
