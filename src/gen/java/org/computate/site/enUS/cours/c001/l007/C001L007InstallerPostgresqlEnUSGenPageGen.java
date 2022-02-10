package org.computate.site.enUS.cours.c001.l007;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresqlEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L007InstallerPostgresqlEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	/////////////////////////////////
	// c001L007InstallerPostgresql //
	/////////////////////////////////

	/**	L'entité « c001L007InstallerPostgresql »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L007InstallerPostgresql c001L007InstallerPostgresql;
	public Couverture<C001L007InstallerPostgresql> c001L007InstallerPostgresqlCouverture = new Couverture<C001L007InstallerPostgresql>().p(this).c(C001L007InstallerPostgresql.class).var("c001L007InstallerPostgresql").o(c001L007InstallerPostgresql);

	/**	<br/>L'entité « c001L007InstallerPostgresql »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresqlEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L007InstallerPostgresql">Trouver l'entité c001L007InstallerPostgresql dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L007InstallerPostgresql(Couverture<C001L007InstallerPostgresql> c);

	public C001L007InstallerPostgresql getC001L007InstallerPostgresql() {
		return c001L007InstallerPostgresql;
	}

	public void setC001L007InstallerPostgresql(C001L007InstallerPostgresql c001L007InstallerPostgresql) {
		this.c001L007InstallerPostgresql = c001L007InstallerPostgresql;
		this.c001L007InstallerPostgresqlCouverture.dejaInitialise = true;
	}
	protected C001L007InstallerPostgresqlEnUSGenPage c001L007InstallerPostgresqlInit() {
		if(!c001L007InstallerPostgresqlCouverture.dejaInitialise) {
			_c001L007InstallerPostgresql(c001L007InstallerPostgresqlCouverture);
			if(c001L007InstallerPostgresql == null)
				setC001L007InstallerPostgresql(c001L007InstallerPostgresqlCouverture.o);
		}
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.initLoinPourClasse(requeteSite_);
		c001L007InstallerPostgresqlCouverture.dejaInitialise(true);
		return (C001L007InstallerPostgresqlEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L007InstallerPostgresqlEnUSGenPage = false;

	public C001L007InstallerPostgresqlEnUSGenPage initLoinC001L007InstallerPostgresqlEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L007InstallerPostgresqlEnUSGenPage) {
			dejaInitialiseC001L007InstallerPostgresqlEnUSGenPage = true;
			initLoinC001L007InstallerPostgresqlEnUSGenPage();
		}
		return (C001L007InstallerPostgresqlEnUSGenPage)this;
	}

	public void initLoinC001L007InstallerPostgresqlEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L007InstallerPostgresqlEnUSGenPage();
	}

	public void initC001L007InstallerPostgresqlEnUSGenPage() {
		c001L007InstallerPostgresqlInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L007InstallerPostgresqlEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L007InstallerPostgresqlEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L007InstallerPostgresqlEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L007InstallerPostgresqlEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L007InstallerPostgresqlEnUSGenPage(String var) {
		C001L007InstallerPostgresqlEnUSGenPage oC001L007InstallerPostgresqlEnUSGenPage = (C001L007InstallerPostgresqlEnUSGenPage)this;
		switch(var) {
			case "c001L007InstallerPostgresql":
				return oC001L007InstallerPostgresqlEnUSGenPage.c001L007InstallerPostgresql;
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
				o = attribuerC001L007InstallerPostgresqlEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L007InstallerPostgresqlEnUSGenPage(String var, Object val) {
		C001L007InstallerPostgresqlEnUSGenPage oC001L007InstallerPostgresqlEnUSGenPage = (C001L007InstallerPostgresqlEnUSGenPage)this;
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
					o = definirC001L007InstallerPostgresqlEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L007InstallerPostgresqlEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L007InstallerPostgresqlEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L007InstallerPostgresqlEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L007InstallerPostgresqlEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L007InstallerPostgresqlEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L007InstallerPostgresqlEnUSGenPage();
	}

	public void htmlBodyCourtC001L007InstallerPostgresqlEnUSGenPage() {
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L007InstallerPostgresqlEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L007InstallerPostgresqlEnUSGenPage() {
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
		if(!(o instanceof C001L007InstallerPostgresqlEnUSGenPage))
			return false;
		C001L007InstallerPostgresqlEnUSGenPage that = (C001L007InstallerPostgresqlEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L007InstallerPostgresqlEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
