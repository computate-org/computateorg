package org.computate.site.enUS.cours.c001.l001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaineEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	///////////////////////////////
	// c001L001ChoisirNomDomaine //
	///////////////////////////////

	/**	L'entité « c001L001ChoisirNomDomaine »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L001ChoisirNomDomaine c001L001ChoisirNomDomaine;
	public Couverture<C001L001ChoisirNomDomaine> c001L001ChoisirNomDomaineCouverture = new Couverture<C001L001ChoisirNomDomaine>().p(this).c(C001L001ChoisirNomDomaine.class).var("c001L001ChoisirNomDomaine").o(c001L001ChoisirNomDomaine);

	/**	<br/>L'entité « c001L001ChoisirNomDomaine »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaineEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L001ChoisirNomDomaine">Trouver l'entité c001L001ChoisirNomDomaine dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L001ChoisirNomDomaine(Couverture<C001L001ChoisirNomDomaine> c);

	public C001L001ChoisirNomDomaine getC001L001ChoisirNomDomaine() {
		return c001L001ChoisirNomDomaine;
	}

	public void setC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine c001L001ChoisirNomDomaine) {
		this.c001L001ChoisirNomDomaine = c001L001ChoisirNomDomaine;
		this.c001L001ChoisirNomDomaineCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaineEnUSGenPage c001L001ChoisirNomDomaineInit() {
		if(!c001L001ChoisirNomDomaineCouverture.dejaInitialise) {
			_c001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture);
			if(c001L001ChoisirNomDomaine == null)
				setC001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture.o);
		}
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.initLoinPourClasse(requeteSite_);
		c001L001ChoisirNomDomaineCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaineEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaineEnUSGenPage = false;

	public C001L001ChoisirNomDomaineEnUSGenPage initLoinC001L001ChoisirNomDomaineEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineEnUSGenPage) {
			dejaInitialiseC001L001ChoisirNomDomaineEnUSGenPage = true;
			initLoinC001L001ChoisirNomDomaineEnUSGenPage();
		}
		return (C001L001ChoisirNomDomaineEnUSGenPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L001ChoisirNomDomaineEnUSGenPage();
	}

	public void initC001L001ChoisirNomDomaineEnUSGenPage() {
		c001L001ChoisirNomDomaineInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L001ChoisirNomDomaineEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaineEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaineEnUSGenPage(String var) {
		C001L001ChoisirNomDomaineEnUSGenPage oC001L001ChoisirNomDomaineEnUSGenPage = (C001L001ChoisirNomDomaineEnUSGenPage)this;
		switch(var) {
			case "c001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineEnUSGenPage.c001L001ChoisirNomDomaine;
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
				o = attribuerC001L001ChoisirNomDomaineEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaineEnUSGenPage(String var, Object val) {
		C001L001ChoisirNomDomaineEnUSGenPage oC001L001ChoisirNomDomaineEnUSGenPage = (C001L001ChoisirNomDomaineEnUSGenPage)this;
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
					o = definirC001L001ChoisirNomDomaineEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaineEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L001ChoisirNomDomaineEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L001ChoisirNomDomaineEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaineEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L001ChoisirNomDomaineEnUSGenPage() {
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L001ChoisirNomDomaineEnUSGenPage();
	}

	public void htmlBodyCourtC001L001ChoisirNomDomaineEnUSGenPage() {
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L001ChoisirNomDomaineEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L001ChoisirNomDomaineEnUSGenPage() {
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
		if(!(o instanceof C001L001ChoisirNomDomaineEnUSGenPage))
			return false;
		C001L001ChoisirNomDomaineEnUSGenPage that = (C001L001ChoisirNomDomaineEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaineEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
