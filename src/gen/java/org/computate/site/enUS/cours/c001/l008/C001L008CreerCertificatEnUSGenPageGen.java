package org.computate.site.enUS.cours.c001.l008;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificatEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	/////////////////////////////
	// c001L008CreerCertificat //
	/////////////////////////////

	/**	L'entité « c001L008CreerCertificat »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L008CreerCertificat c001L008CreerCertificat;
	public Couverture<C001L008CreerCertificat> c001L008CreerCertificatCouverture = new Couverture<C001L008CreerCertificat>().p(this).c(C001L008CreerCertificat.class).var("c001L008CreerCertificat").o(c001L008CreerCertificat);

	/**	<br/>L'entité « c001L008CreerCertificat »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificatEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L008CreerCertificat">Trouver l'entité c001L008CreerCertificat dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L008CreerCertificat(Couverture<C001L008CreerCertificat> c);

	public C001L008CreerCertificat getC001L008CreerCertificat() {
		return c001L008CreerCertificat;
	}

	public void setC001L008CreerCertificat(C001L008CreerCertificat c001L008CreerCertificat) {
		this.c001L008CreerCertificat = c001L008CreerCertificat;
		this.c001L008CreerCertificatCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificatEnUSGenPage c001L008CreerCertificatInit() {
		if(!c001L008CreerCertificatCouverture.dejaInitialise) {
			_c001L008CreerCertificat(c001L008CreerCertificatCouverture);
			if(c001L008CreerCertificat == null)
				setC001L008CreerCertificat(c001L008CreerCertificatCouverture.o);
		}
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.initLoinPourClasse(requeteSite_);
		c001L008CreerCertificatCouverture.dejaInitialise(true);
		return (C001L008CreerCertificatEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L008CreerCertificatEnUSGenPage = false;

	public C001L008CreerCertificatEnUSGenPage initLoinC001L008CreerCertificatEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificatEnUSGenPage) {
			dejaInitialiseC001L008CreerCertificatEnUSGenPage = true;
			initLoinC001L008CreerCertificatEnUSGenPage();
		}
		return (C001L008CreerCertificatEnUSGenPage)this;
	}

	public void initLoinC001L008CreerCertificatEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L008CreerCertificatEnUSGenPage();
	}

	public void initC001L008CreerCertificatEnUSGenPage() {
		c001L008CreerCertificatInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L008CreerCertificatEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificatEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L008CreerCertificatEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificatEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificatEnUSGenPage(String var) {
		C001L008CreerCertificatEnUSGenPage oC001L008CreerCertificatEnUSGenPage = (C001L008CreerCertificatEnUSGenPage)this;
		switch(var) {
			case "c001L008CreerCertificat":
				return oC001L008CreerCertificatEnUSGenPage.c001L008CreerCertificat;
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
				o = attribuerC001L008CreerCertificatEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificatEnUSGenPage(String var, Object val) {
		C001L008CreerCertificatEnUSGenPage oC001L008CreerCertificatEnUSGenPage = (C001L008CreerCertificatEnUSGenPage)this;
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
					o = definirC001L008CreerCertificatEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificatEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L008CreerCertificatEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L008CreerCertificatEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L008CreerCertificatEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificatEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificatEnUSGenPage();
	}

	public void htmlBodyCourtC001L008CreerCertificatEnUSGenPage() {
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L008CreerCertificatEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L008CreerCertificatEnUSGenPage() {
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
		if(!(o instanceof C001L008CreerCertificatEnUSGenPage))
			return false;
		C001L008CreerCertificatEnUSGenPage that = (C001L008CreerCertificatEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificatEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
