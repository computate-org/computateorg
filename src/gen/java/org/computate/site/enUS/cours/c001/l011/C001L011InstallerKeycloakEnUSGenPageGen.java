package org.computate.site.enUS.cours.c001.l011;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloakEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L011InstallerKeycloakEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	///////////////////////////////
	// c001L011InstallerKeycloak //
	///////////////////////////////

	/**	L'entité « c001L011InstallerKeycloak »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L011InstallerKeycloak c001L011InstallerKeycloak;
	public Couverture<C001L011InstallerKeycloak> c001L011InstallerKeycloakCouverture = new Couverture<C001L011InstallerKeycloak>().p(this).c(C001L011InstallerKeycloak.class).var("c001L011InstallerKeycloak").o(c001L011InstallerKeycloak);

	/**	<br/>L'entité « c001L011InstallerKeycloak »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloakEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L011InstallerKeycloak">Trouver l'entité c001L011InstallerKeycloak dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L011InstallerKeycloak(Couverture<C001L011InstallerKeycloak> c);

	public C001L011InstallerKeycloak getC001L011InstallerKeycloak() {
		return c001L011InstallerKeycloak;
	}

	public void setC001L011InstallerKeycloak(C001L011InstallerKeycloak c001L011InstallerKeycloak) {
		this.c001L011InstallerKeycloak = c001L011InstallerKeycloak;
		this.c001L011InstallerKeycloakCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloakEnUSGenPage c001L011InstallerKeycloakInit() {
		if(!c001L011InstallerKeycloakCouverture.dejaInitialise) {
			_c001L011InstallerKeycloak(c001L011InstallerKeycloakCouverture);
			if(c001L011InstallerKeycloak == null)
				setC001L011InstallerKeycloak(c001L011InstallerKeycloakCouverture.o);
		}
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.initLoinPourClasse(requeteSite_);
		c001L011InstallerKeycloakCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloakEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L011InstallerKeycloakEnUSGenPage = false;

	public C001L011InstallerKeycloakEnUSGenPage initLoinC001L011InstallerKeycloakEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L011InstallerKeycloakEnUSGenPage) {
			dejaInitialiseC001L011InstallerKeycloakEnUSGenPage = true;
			initLoinC001L011InstallerKeycloakEnUSGenPage();
		}
		return (C001L011InstallerKeycloakEnUSGenPage)this;
	}

	public void initLoinC001L011InstallerKeycloakEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L011InstallerKeycloakEnUSGenPage();
	}

	public void initC001L011InstallerKeycloakEnUSGenPage() {
		c001L011InstallerKeycloakInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L011InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L011InstallerKeycloakEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L011InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L011InstallerKeycloakEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L011InstallerKeycloakEnUSGenPage(String var) {
		C001L011InstallerKeycloakEnUSGenPage oC001L011InstallerKeycloakEnUSGenPage = (C001L011InstallerKeycloakEnUSGenPage)this;
		switch(var) {
			case "c001L011InstallerKeycloak":
				return oC001L011InstallerKeycloakEnUSGenPage.c001L011InstallerKeycloak;
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
				o = attribuerC001L011InstallerKeycloakEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L011InstallerKeycloakEnUSGenPage(String var, Object val) {
		C001L011InstallerKeycloakEnUSGenPage oC001L011InstallerKeycloakEnUSGenPage = (C001L011InstallerKeycloakEnUSGenPage)this;
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
					o = definirC001L011InstallerKeycloakEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L011InstallerKeycloakEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L011InstallerKeycloakEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L011InstallerKeycloakEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L011InstallerKeycloakEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L011InstallerKeycloakEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L011InstallerKeycloakEnUSGenPage();
	}

	public void htmlBodyCourtC001L011InstallerKeycloakEnUSGenPage() {
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L011InstallerKeycloakEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L011InstallerKeycloakEnUSGenPage() {
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
		if(!(o instanceof C001L011InstallerKeycloakEnUSGenPage))
			return false;
		C001L011InstallerKeycloakEnUSGenPage that = (C001L011InstallerKeycloakEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L011InstallerKeycloakEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
