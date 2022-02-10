package org.computate.site.enUS.cours.c001.l009;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeperEnUSGenPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeperEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerZookeeperEnUSPageGen<DEV> extends C001L009InstallerZookeeperEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerZookeeperEnUSPage = false;

	public C001L009InstallerZookeeperEnUSPage initLoinC001L009InstallerZookeeperEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerZookeeperEnUSPage) {
			dejaInitialiseC001L009InstallerZookeeperEnUSPage = true;
			initLoinC001L009InstallerZookeeperEnUSPage();
		}
		return (C001L009InstallerZookeeperEnUSPage)this;
	}

	public void initLoinC001L009InstallerZookeeperEnUSPage() {
		super.initLoinC001L009InstallerZookeeperEnUSGenPage(requeteSite_);
		initC001L009InstallerZookeeperEnUSPage();
	}

	public void initC001L009InstallerZookeeperEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L009InstallerZookeeperEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerZookeeperEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L009InstallerZookeeperEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L009InstallerZookeeperEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerZookeeperEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerZookeeperEnUSPage(String var) {
		C001L009InstallerZookeeperEnUSPage oC001L009InstallerZookeeperEnUSPage = (C001L009InstallerZookeeperEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L009InstallerZookeeperEnUSGenPage(var);
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
				o = attribuerC001L009InstallerZookeeperEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerZookeeperEnUSPage(String var, Object val) {
		C001L009InstallerZookeeperEnUSPage oC001L009InstallerZookeeperEnUSPage = (C001L009InstallerZookeeperEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L009InstallerZookeeperEnUSGenPage(var, val);
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
					o = definirC001L009InstallerZookeeperEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerZookeeperEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L009InstallerZookeeperEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerZookeeperEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerZookeeperEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerZookeeperEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerZookeeperEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerZookeeperEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerZookeeperEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerZookeeperEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerZookeeperEnUSPage() {
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
		if(!(o instanceof C001L009InstallerZookeeperEnUSPage))
			return false;
		C001L009InstallerZookeeperEnUSPage that = (C001L009InstallerZookeeperEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerZookeeperEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
