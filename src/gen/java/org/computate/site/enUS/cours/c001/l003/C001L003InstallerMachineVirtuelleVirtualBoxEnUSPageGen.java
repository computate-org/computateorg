package org.computate.site.enUS.cours.c001.l003;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxEnUSPageGen<DEV> extends C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage = false;

	public C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
		super.initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(String var) {
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage oC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(var);
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage oC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(var, val);
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxEnUSPage() {
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage that = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
