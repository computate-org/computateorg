package org.computate.site.enUS.cours.c001.l004;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7EnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7EnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	//////////////////////////////
	// c001L004InstallerCentos7 //
	//////////////////////////////

	/**	L'entité « c001L004InstallerCentos7 »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L004InstallerCentos7 c001L004InstallerCentos7;
	public Couverture<C001L004InstallerCentos7> c001L004InstallerCentos7Couverture = new Couverture<C001L004InstallerCentos7>().p(this).c(C001L004InstallerCentos7.class).var("c001L004InstallerCentos7").o(c001L004InstallerCentos7);

	/**	<br/>L'entité « c001L004InstallerCentos7 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7EnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L004InstallerCentos7">Trouver l'entité c001L004InstallerCentos7 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L004InstallerCentos7(Couverture<C001L004InstallerCentos7> c);

	public C001L004InstallerCentos7 getC001L004InstallerCentos7() {
		return c001L004InstallerCentos7;
	}

	public void setC001L004InstallerCentos7(C001L004InstallerCentos7 c001L004InstallerCentos7) {
		this.c001L004InstallerCentos7 = c001L004InstallerCentos7;
		this.c001L004InstallerCentos7Couverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7EnUSGenPage c001L004InstallerCentos7Init() {
		if(!c001L004InstallerCentos7Couverture.dejaInitialise) {
			_c001L004InstallerCentos7(c001L004InstallerCentos7Couverture);
			if(c001L004InstallerCentos7 == null)
				setC001L004InstallerCentos7(c001L004InstallerCentos7Couverture.o);
		}
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.initLoinPourClasse(requeteSite_);
		c001L004InstallerCentos7Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7EnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L004InstallerCentos7EnUSGenPage = false;

	public C001L004InstallerCentos7EnUSGenPage initLoinC001L004InstallerCentos7EnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7EnUSGenPage) {
			dejaInitialiseC001L004InstallerCentos7EnUSGenPage = true;
			initLoinC001L004InstallerCentos7EnUSGenPage();
		}
		return (C001L004InstallerCentos7EnUSGenPage)this;
	}

	public void initLoinC001L004InstallerCentos7EnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L004InstallerCentos7EnUSGenPage();
	}

	public void initC001L004InstallerCentos7EnUSGenPage() {
		c001L004InstallerCentos7Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L004InstallerCentos7EnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7EnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L004InstallerCentos7EnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7EnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7EnUSGenPage(String var) {
		C001L004InstallerCentos7EnUSGenPage oC001L004InstallerCentos7EnUSGenPage = (C001L004InstallerCentos7EnUSGenPage)this;
		switch(var) {
			case "c001L004InstallerCentos7":
				return oC001L004InstallerCentos7EnUSGenPage.c001L004InstallerCentos7;
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
				o = attribuerC001L004InstallerCentos7EnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7EnUSGenPage(String var, Object val) {
		C001L004InstallerCentos7EnUSGenPage oC001L004InstallerCentos7EnUSGenPage = (C001L004InstallerCentos7EnUSGenPage)this;
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
					o = definirC001L004InstallerCentos7EnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7EnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L004InstallerCentos7EnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L004InstallerCentos7EnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L004InstallerCentos7EnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7EnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7EnUSGenPage();
	}

	public void htmlBodyCourtC001L004InstallerCentos7EnUSGenPage() {
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L004InstallerCentos7EnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L004InstallerCentos7EnUSGenPage() {
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
		if(!(o instanceof C001L004InstallerCentos7EnUSGenPage))
			return false;
		C001L004InstallerCentos7EnUSGenPage that = (C001L004InstallerCentos7EnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7EnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
