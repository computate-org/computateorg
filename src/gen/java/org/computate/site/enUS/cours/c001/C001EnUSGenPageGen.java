package org.computate.site.enUS.cours.c001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.CoursEnUSPage;
import org.computate.site.enUS.cours.c001.C001;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001EnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001EnUSGenPageGen<DEV> extends CoursEnUSPage {

	///////////////
	// listeC001 //
	///////////////

	/**	L'entité « listeC001 »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<C001> listeC001;
	public Couverture<ListeRecherche<C001>> listeC001Couverture = new Couverture<ListeRecherche<C001>>().p(this).c(ListeRecherche.class).var("listeC001").o(listeC001);

	/**	<br/>L'entité « listeC001 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001EnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeC001">Trouver l'entité listeC001 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeC001(Couverture<ListeRecherche<C001>> c);

	public ListeRecherche<C001> getListeC001() {
		return listeC001;
	}

	public void setListeC001(ListeRecherche<C001> listeC001) {
		this.listeC001 = listeC001;
		this.listeC001Couverture.dejaInitialise = true;
	}
	protected C001EnUSGenPage listeC001Init() {
		if(!listeC001Couverture.dejaInitialise) {
			_listeC001(listeC001Couverture);
			if(listeC001 == null)
				setListeC001(listeC001Couverture.o);
		}
		if(listeC001 != null)
			listeC001.initLoinPourClasse(requeteSite_);
		listeC001Couverture.dejaInitialise(true);
		return (C001EnUSGenPage)this;
	}

	//////////
	// c001 //
	//////////

	/**	L'entité « c001 »
	 *	 is defined as null before being initialized. 
	 */
	protected C001 c001;
	public Couverture<C001> c001Couverture = new Couverture<C001>().p(this).c(C001.class).var("c001").o(c001);

	/**	<br/>L'entité « c001 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001EnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001">Trouver l'entité c001 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001(Couverture<C001> c);

	public C001 getC001() {
		return c001;
	}

	public void setC001(C001 c001) {
		this.c001 = c001;
		this.c001Couverture.dejaInitialise = true;
	}
	protected C001EnUSGenPage c001Init() {
		if(!c001Couverture.dejaInitialise) {
			_c001(c001Couverture);
			if(c001 == null)
				setC001(c001Couverture.o);
		}
		if(c001 != null)
			c001.initLoinPourClasse(requeteSite_);
		c001Couverture.dejaInitialise(true);
		return (C001EnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001EnUSGenPage = false;

	public C001EnUSGenPage initLoinC001EnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001EnUSGenPage) {
			dejaInitialiseC001EnUSGenPage = true;
			initLoinC001EnUSGenPage();
		}
		return (C001EnUSGenPage)this;
	}

	public void initLoinC001EnUSGenPage() {
		super.initLoinCoursEnUSPage(requeteSite_);
		initC001EnUSGenPage();
	}

	public void initC001EnUSGenPage() {
		listeC001Init();
		c001Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001EnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001EnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteCoursEnUSPage(requeteSite_);
		if(listeC001 != null)
			listeC001.setRequeteSite_(requeteSite_);
		if(c001 != null)
			c001.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001EnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001EnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001EnUSGenPage(String var) {
		C001EnUSGenPage oC001EnUSGenPage = (C001EnUSGenPage)this;
		switch(var) {
			case "listeC001":
				return oC001EnUSGenPage.listeC001;
			case "c001":
				return oC001EnUSGenPage.c001;
			default:
				return super.obtenirCoursEnUSPage(var);
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
				o = attribuerC001EnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001EnUSGenPage(String var, Object val) {
		C001EnUSGenPage oC001EnUSGenPage = (C001EnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerCoursEnUSPage(var, val);
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
					o = definirC001EnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001EnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirCoursEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001EnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001EnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001EnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001EnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001EnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001EnUSGenPage() {
		if(c001 != null)
			c001.htmlBody();
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001EnUSGenPage();
		super.html();
	}

	public void htmlC001EnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001EnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001EnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001EnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001EnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001EnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001EnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001EnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001EnUSGenPage() {
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
		if(!(o instanceof C001EnUSGenPage))
			return false;
		C001EnUSGenPage that = (C001EnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001EnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
