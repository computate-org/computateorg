package org.computate.site.enUS.cours.c001.l006;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseEnUSPageGen<DEV> extends C001L006InstallerEclipseEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L006InstallerEclipseEnUSPage = false;

	public C001L006InstallerEclipseEnUSPage initLoinC001L006InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipseEnUSPage) {
			dejaInitialiseC001L006InstallerEclipseEnUSPage = true;
			initLoinC001L006InstallerEclipseEnUSPage();
		}
		return (C001L006InstallerEclipseEnUSPage)this;
	}

	public void initLoinC001L006InstallerEclipseEnUSPage() {
		super.initLoinC001L006InstallerEclipseEnUSGenPage(requeteSite_);
		initC001L006InstallerEclipseEnUSPage();
	}

	public void initC001L006InstallerEclipseEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L006InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L006InstallerEclipseEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L006InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipseEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipseEnUSPage(String var) {
		C001L006InstallerEclipseEnUSPage oC001L006InstallerEclipseEnUSPage = (C001L006InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L006InstallerEclipseEnUSGenPage(var);
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
				o = attribuerC001L006InstallerEclipseEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipseEnUSPage(String var, Object val) {
		C001L006InstallerEclipseEnUSPage oC001L006InstallerEclipseEnUSPage = (C001L006InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L006InstallerEclipseEnUSGenPage(var, val);
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
					o = definirC001L006InstallerEclipseEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipseEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L006InstallerEclipseEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L006InstallerEclipseEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L006InstallerEclipseEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L006InstallerEclipseEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L006InstallerEclipseEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L006InstallerEclipseEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L006InstallerEclipseEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L006InstallerEclipseEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L006InstallerEclipseEnUSPage() {
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
		if(!(o instanceof C001L006InstallerEclipseEnUSPage))
			return false;
		C001L006InstallerEclipseEnUSPage that = (C001L006InstallerEclipseEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L006InstallerEclipseEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
