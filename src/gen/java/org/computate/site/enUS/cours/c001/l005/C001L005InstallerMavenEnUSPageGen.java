package org.computate.site.enUS.cours.c001.l005;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l005.C001L005InstallerMavenEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMavenEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenEnUSPageGen<DEV> extends C001L005InstallerMavenEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerMavenEnUSPage = false;

	public C001L005InstallerMavenEnUSPage initLoinC001L005InstallerMavenEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMavenEnUSPage) {
			dejaInitialiseC001L005InstallerMavenEnUSPage = true;
			initLoinC001L005InstallerMavenEnUSPage();
		}
		return (C001L005InstallerMavenEnUSPage)this;
	}

	public void initLoinC001L005InstallerMavenEnUSPage() {
		super.initLoinC001L005InstallerMavenEnUSGenPage(requeteSite_);
		initC001L005InstallerMavenEnUSPage();
	}

	public void initC001L005InstallerMavenEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L005InstallerMavenEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMavenEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L005InstallerMavenEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L005InstallerMavenEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMavenEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMavenEnUSPage(String var) {
		C001L005InstallerMavenEnUSPage oC001L005InstallerMavenEnUSPage = (C001L005InstallerMavenEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L005InstallerMavenEnUSGenPage(var);
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
				o = attribuerC001L005InstallerMavenEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMavenEnUSPage(String var, Object val) {
		C001L005InstallerMavenEnUSPage oC001L005InstallerMavenEnUSPage = (C001L005InstallerMavenEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L005InstallerMavenEnUSGenPage(var, val);
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
					o = definirC001L005InstallerMavenEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMavenEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L005InstallerMavenEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L005InstallerMavenEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L005InstallerMavenEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerMavenEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerMavenEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMavenEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L005InstallerMavenEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L005InstallerMavenEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L005InstallerMavenEnUSPage() {
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
		if(!(o instanceof C001L005InstallerMavenEnUSPage))
			return false;
		C001L005InstallerMavenEnUSPage that = (C001L005InstallerMavenEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMavenEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
