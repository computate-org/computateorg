package org.computate.site.enUS.cours.c001.l004;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7EnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7EnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7EnUSPageGen<DEV> extends C001L004InstallerCentos7EnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L004InstallerCentos7EnUSPage = false;

	public C001L004InstallerCentos7EnUSPage initLoinC001L004InstallerCentos7EnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7EnUSPage) {
			dejaInitialiseC001L004InstallerCentos7EnUSPage = true;
			initLoinC001L004InstallerCentos7EnUSPage();
		}
		return (C001L004InstallerCentos7EnUSPage)this;
	}

	public void initLoinC001L004InstallerCentos7EnUSPage() {
		super.initLoinC001L004InstallerCentos7EnUSGenPage(requeteSite_);
		initC001L004InstallerCentos7EnUSPage();
	}

	public void initC001L004InstallerCentos7EnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L004InstallerCentos7EnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7EnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L004InstallerCentos7EnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L004InstallerCentos7EnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7EnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7EnUSPage(String var) {
		C001L004InstallerCentos7EnUSPage oC001L004InstallerCentos7EnUSPage = (C001L004InstallerCentos7EnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L004InstallerCentos7EnUSGenPage(var);
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
				o = attribuerC001L004InstallerCentos7EnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7EnUSPage(String var, Object val) {
		C001L004InstallerCentos7EnUSPage oC001L004InstallerCentos7EnUSPage = (C001L004InstallerCentos7EnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L004InstallerCentos7EnUSGenPage(var, val);
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
					o = definirC001L004InstallerCentos7EnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7EnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L004InstallerCentos7EnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L004InstallerCentos7EnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L004InstallerCentos7EnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L004InstallerCentos7EnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7EnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7EnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L004InstallerCentos7EnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L004InstallerCentos7EnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L004InstallerCentos7EnUSPage() {
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
		if(!(o instanceof C001L004InstallerCentos7EnUSPage))
			return false;
		C001L004InstallerCentos7EnUSPage that = (C001L004InstallerCentos7EnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7EnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
