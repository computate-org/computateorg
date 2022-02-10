package org.computate.site.enUS.cours.c001.l007;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresqlEnUSGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresqlEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L007InstallerPostgresqlEnUSPageGen<DEV> extends C001L007InstallerPostgresqlEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L007InstallerPostgresqlEnUSPage = false;

	public C001L007InstallerPostgresqlEnUSPage initLoinC001L007InstallerPostgresqlEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L007InstallerPostgresqlEnUSPage) {
			dejaInitialiseC001L007InstallerPostgresqlEnUSPage = true;
			initLoinC001L007InstallerPostgresqlEnUSPage();
		}
		return (C001L007InstallerPostgresqlEnUSPage)this;
	}

	public void initLoinC001L007InstallerPostgresqlEnUSPage() {
		super.initLoinC001L007InstallerPostgresqlEnUSGenPage(requeteSite_);
		initC001L007InstallerPostgresqlEnUSPage();
	}

	public void initC001L007InstallerPostgresqlEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L007InstallerPostgresqlEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L007InstallerPostgresqlEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L007InstallerPostgresqlEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L007InstallerPostgresqlEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L007InstallerPostgresqlEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L007InstallerPostgresqlEnUSPage(String var) {
		C001L007InstallerPostgresqlEnUSPage oC001L007InstallerPostgresqlEnUSPage = (C001L007InstallerPostgresqlEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L007InstallerPostgresqlEnUSGenPage(var);
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
				o = attribuerC001L007InstallerPostgresqlEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L007InstallerPostgresqlEnUSPage(String var, Object val) {
		C001L007InstallerPostgresqlEnUSPage oC001L007InstallerPostgresqlEnUSPage = (C001L007InstallerPostgresqlEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L007InstallerPostgresqlEnUSGenPage(var, val);
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
					o = definirC001L007InstallerPostgresqlEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L007InstallerPostgresqlEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L007InstallerPostgresqlEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L007InstallerPostgresqlEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L007InstallerPostgresqlEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L007InstallerPostgresqlEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L007InstallerPostgresqlEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L007InstallerPostgresqlEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L007InstallerPostgresqlEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L007InstallerPostgresqlEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L007InstallerPostgresqlEnUSPage() {
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
		if(!(o instanceof C001L007InstallerPostgresqlEnUSPage))
			return false;
		C001L007InstallerPostgresqlEnUSPage that = (C001L007InstallerPostgresqlEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L007InstallerPostgresqlEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
