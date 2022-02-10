package org.computate.site.enUS.cours.c001.l011;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloakEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloakEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L011InstallerKeycloakEnUSPageGen<DEV> extends C001L011InstallerKeycloakEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L011InstallerKeycloakEnUSPage = false;

	public C001L011InstallerKeycloakEnUSPage initLoinC001L011InstallerKeycloakEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L011InstallerKeycloakEnUSPage) {
			dejaInitialiseC001L011InstallerKeycloakEnUSPage = true;
			initLoinC001L011InstallerKeycloakEnUSPage();
		}
		return (C001L011InstallerKeycloakEnUSPage)this;
	}

	public void initLoinC001L011InstallerKeycloakEnUSPage() {
		super.initLoinC001L011InstallerKeycloakEnUSGenPage(requeteSite_);
		initC001L011InstallerKeycloakEnUSPage();
	}

	public void initC001L011InstallerKeycloakEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L011InstallerKeycloakEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L011InstallerKeycloakEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L011InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L011InstallerKeycloakEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L011InstallerKeycloakEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L011InstallerKeycloakEnUSPage(String var) {
		C001L011InstallerKeycloakEnUSPage oC001L011InstallerKeycloakEnUSPage = (C001L011InstallerKeycloakEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L011InstallerKeycloakEnUSGenPage(var);
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
				o = attribuerC001L011InstallerKeycloakEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L011InstallerKeycloakEnUSPage(String var, Object val) {
		C001L011InstallerKeycloakEnUSPage oC001L011InstallerKeycloakEnUSPage = (C001L011InstallerKeycloakEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L011InstallerKeycloakEnUSGenPage(var, val);
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
					o = definirC001L011InstallerKeycloakEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L011InstallerKeycloakEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L011InstallerKeycloakEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L011InstallerKeycloakEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L011InstallerKeycloakEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L011InstallerKeycloakEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L011InstallerKeycloakEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L011InstallerKeycloakEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L011InstallerKeycloakEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L011InstallerKeycloakEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L011InstallerKeycloakEnUSPage() {
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
		if(!(o instanceof C001L011InstallerKeycloakEnUSPage))
			return false;
		C001L011InstallerKeycloakEnUSPage that = (C001L011InstallerKeycloakEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L011InstallerKeycloakEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
