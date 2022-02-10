package org.computate.site.enUS.cours.c001.l005;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMavenEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	////////////////////////////
	// c001L005InstallerMaven //
	////////////////////////////

	/**	L'entité « c001L005InstallerMaven »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L005InstallerMaven c001L005InstallerMaven;
	public Couverture<C001L005InstallerMaven> c001L005InstallerMavenCouverture = new Couverture<C001L005InstallerMaven>().p(this).c(C001L005InstallerMaven.class).var("c001L005InstallerMaven").o(c001L005InstallerMaven);

	/**	<br/>L'entité « c001L005InstallerMaven »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMavenEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L005InstallerMaven">Trouver l'entité c001L005InstallerMaven dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L005InstallerMaven(Couverture<C001L005InstallerMaven> c);

	public C001L005InstallerMaven getC001L005InstallerMaven() {
		return c001L005InstallerMaven;
	}

	public void setC001L005InstallerMaven(C001L005InstallerMaven c001L005InstallerMaven) {
		this.c001L005InstallerMaven = c001L005InstallerMaven;
		this.c001L005InstallerMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMavenEnUSGenPage c001L005InstallerMavenInit() {
		if(!c001L005InstallerMavenCouverture.dejaInitialise) {
			_c001L005InstallerMaven(c001L005InstallerMavenCouverture);
			if(c001L005InstallerMaven == null)
				setC001L005InstallerMaven(c001L005InstallerMavenCouverture.o);
		}
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.initLoinPourClasse(requeteSite_);
		c001L005InstallerMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMavenEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerMavenEnUSGenPage = false;

	public C001L005InstallerMavenEnUSGenPage initLoinC001L005InstallerMavenEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMavenEnUSGenPage) {
			dejaInitialiseC001L005InstallerMavenEnUSGenPage = true;
			initLoinC001L005InstallerMavenEnUSGenPage();
		}
		return (C001L005InstallerMavenEnUSGenPage)this;
	}

	public void initLoinC001L005InstallerMavenEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L005InstallerMavenEnUSGenPage();
	}

	public void initC001L005InstallerMavenEnUSGenPage() {
		c001L005InstallerMavenInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L005InstallerMavenEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMavenEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L005InstallerMavenEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMavenEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMavenEnUSGenPage(String var) {
		C001L005InstallerMavenEnUSGenPage oC001L005InstallerMavenEnUSGenPage = (C001L005InstallerMavenEnUSGenPage)this;
		switch(var) {
			case "c001L005InstallerMaven":
				return oC001L005InstallerMavenEnUSGenPage.c001L005InstallerMaven;
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
				o = attribuerC001L005InstallerMavenEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMavenEnUSGenPage(String var, Object val) {
		C001L005InstallerMavenEnUSGenPage oC001L005InstallerMavenEnUSGenPage = (C001L005InstallerMavenEnUSGenPage)this;
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
					o = definirC001L005InstallerMavenEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMavenEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L005InstallerMavenEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L005InstallerMavenEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerMavenEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerMavenEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMavenEnUSGenPage();
	}

	public void htmlBodyCourtC001L005InstallerMavenEnUSGenPage() {
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L005InstallerMavenEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L005InstallerMavenEnUSGenPage() {
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
		if(!(o instanceof C001L005InstallerMavenEnUSGenPage))
			return false;
		C001L005InstallerMavenEnUSGenPage that = (C001L005InstallerMavenEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMavenEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
