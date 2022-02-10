package org.computate.site.enUS.cours.c001.l010;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolrEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L010InstallerSolrEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	///////////////////////////
	// c001L010InstallerSolr //
	///////////////////////////

	/**	L'entité « c001L010InstallerSolr »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L010InstallerSolr c001L010InstallerSolr;
	public Couverture<C001L010InstallerSolr> c001L010InstallerSolrCouverture = new Couverture<C001L010InstallerSolr>().p(this).c(C001L010InstallerSolr.class).var("c001L010InstallerSolr").o(c001L010InstallerSolr);

	/**	<br/>L'entité « c001L010InstallerSolr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolrEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L010InstallerSolr">Trouver l'entité c001L010InstallerSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L010InstallerSolr(Couverture<C001L010InstallerSolr> c);

	public C001L010InstallerSolr getC001L010InstallerSolr() {
		return c001L010InstallerSolr;
	}

	public void setC001L010InstallerSolr(C001L010InstallerSolr c001L010InstallerSolr) {
		this.c001L010InstallerSolr = c001L010InstallerSolr;
		this.c001L010InstallerSolrCouverture.dejaInitialise = true;
	}
	protected C001L010InstallerSolrEnUSGenPage c001L010InstallerSolrInit() {
		if(!c001L010InstallerSolrCouverture.dejaInitialise) {
			_c001L010InstallerSolr(c001L010InstallerSolrCouverture);
			if(c001L010InstallerSolr == null)
				setC001L010InstallerSolr(c001L010InstallerSolrCouverture.o);
		}
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.initLoinPourClasse(requeteSite_);
		c001L010InstallerSolrCouverture.dejaInitialise(true);
		return (C001L010InstallerSolrEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L010InstallerSolrEnUSGenPage = false;

	public C001L010InstallerSolrEnUSGenPage initLoinC001L010InstallerSolrEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L010InstallerSolrEnUSGenPage) {
			dejaInitialiseC001L010InstallerSolrEnUSGenPage = true;
			initLoinC001L010InstallerSolrEnUSGenPage();
		}
		return (C001L010InstallerSolrEnUSGenPage)this;
	}

	public void initLoinC001L010InstallerSolrEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L010InstallerSolrEnUSGenPage();
	}

	public void initC001L010InstallerSolrEnUSGenPage() {
		c001L010InstallerSolrInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L010InstallerSolrEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L010InstallerSolrEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L010InstallerSolrEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L010InstallerSolrEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L010InstallerSolrEnUSGenPage(String var) {
		C001L010InstallerSolrEnUSGenPage oC001L010InstallerSolrEnUSGenPage = (C001L010InstallerSolrEnUSGenPage)this;
		switch(var) {
			case "c001L010InstallerSolr":
				return oC001L010InstallerSolrEnUSGenPage.c001L010InstallerSolr;
			default:
				return super.obtenirC001LeconEnUSPage(var);
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
				o = attribuerC001L010InstallerSolrEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L010InstallerSolrEnUSGenPage(String var, Object val) {
		C001L010InstallerSolrEnUSGenPage oC001L010InstallerSolrEnUSGenPage = (C001L010InstallerSolrEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconEnUSPage(var, val);
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
					o = definirC001L010InstallerSolrEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L010InstallerSolrEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L010InstallerSolrEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L010InstallerSolrEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L010InstallerSolrEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L010InstallerSolrEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L010InstallerSolrEnUSGenPage();
	}

	public void htmlBodyCourtC001L010InstallerSolrEnUSGenPage() {
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L010InstallerSolrEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L010InstallerSolrEnUSGenPage() {
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
		if(!(o instanceof C001L010InstallerSolrEnUSGenPage))
			return false;
		C001L010InstallerSolrEnUSGenPage that = (C001L010InstallerSolrEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L010InstallerSolrEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
