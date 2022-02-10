package org.computate.site.enUS.cours.c001.l006;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	//////////////////////////////
	// c001L006InstallerEclipse //
	//////////////////////////////

	/**	L'entité « c001L006InstallerEclipse »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L006InstallerEclipse c001L006InstallerEclipse;
	public Couverture<C001L006InstallerEclipse> c001L006InstallerEclipseCouverture = new Couverture<C001L006InstallerEclipse>().p(this).c(C001L006InstallerEclipse.class).var("c001L006InstallerEclipse").o(c001L006InstallerEclipse);

	/**	<br/>L'entité « c001L006InstallerEclipse »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L006InstallerEclipse">Trouver l'entité c001L006InstallerEclipse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L006InstallerEclipse(Couverture<C001L006InstallerEclipse> c);

	public C001L006InstallerEclipse getC001L006InstallerEclipse() {
		return c001L006InstallerEclipse;
	}

	public void setC001L006InstallerEclipse(C001L006InstallerEclipse c001L006InstallerEclipse) {
		this.c001L006InstallerEclipse = c001L006InstallerEclipse;
		this.c001L006InstallerEclipseCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipseEnUSGenPage c001L006InstallerEclipseInit() {
		if(!c001L006InstallerEclipseCouverture.dejaInitialise) {
			_c001L006InstallerEclipse(c001L006InstallerEclipseCouverture);
			if(c001L006InstallerEclipse == null)
				setC001L006InstallerEclipse(c001L006InstallerEclipseCouverture.o);
		}
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.initLoinPourClasse(requeteSite_);
		c001L006InstallerEclipseCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipseEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L006InstallerEclipseEnUSGenPage = false;

	public C001L006InstallerEclipseEnUSGenPage initLoinC001L006InstallerEclipseEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipseEnUSGenPage) {
			dejaInitialiseC001L006InstallerEclipseEnUSGenPage = true;
			initLoinC001L006InstallerEclipseEnUSGenPage();
		}
		return (C001L006InstallerEclipseEnUSGenPage)this;
	}

	public void initLoinC001L006InstallerEclipseEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L006InstallerEclipseEnUSGenPage();
	}

	public void initC001L006InstallerEclipseEnUSGenPage() {
		c001L006InstallerEclipseInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L006InstallerEclipseEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipseEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L006InstallerEclipseEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipseEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipseEnUSGenPage(String var) {
		C001L006InstallerEclipseEnUSGenPage oC001L006InstallerEclipseEnUSGenPage = (C001L006InstallerEclipseEnUSGenPage)this;
		switch(var) {
			case "c001L006InstallerEclipse":
				return oC001L006InstallerEclipseEnUSGenPage.c001L006InstallerEclipse;
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
				o = attribuerC001L006InstallerEclipseEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipseEnUSGenPage(String var, Object val) {
		C001L006InstallerEclipseEnUSGenPage oC001L006InstallerEclipseEnUSGenPage = (C001L006InstallerEclipseEnUSGenPage)this;
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
					o = definirC001L006InstallerEclipseEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipseEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L006InstallerEclipseEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L006InstallerEclipseEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L006InstallerEclipseEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L006InstallerEclipseEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L006InstallerEclipseEnUSGenPage();
	}

	public void htmlBodyCourtC001L006InstallerEclipseEnUSGenPage() {
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L006InstallerEclipseEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L006InstallerEclipseEnUSGenPage() {
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
		if(!(o instanceof C001L006InstallerEclipseEnUSGenPage))
			return false;
		C001L006InstallerEclipseEnUSGenPage that = (C001L006InstallerEclipseEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L006InstallerEclipseEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
