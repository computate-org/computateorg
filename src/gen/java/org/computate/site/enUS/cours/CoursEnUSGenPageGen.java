package org.computate.site.enUS.cours;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.Cours;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursEnUSGenPageGen<DEV> extends MiseEnPage {

	////////////////
	// listeCours //
	////////////////

	/**	L'entité « listeCours »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<Cours> listeCours;
	public Couverture<ListeRecherche<Cours>> listeCoursCouverture = new Couverture<ListeRecherche<Cours>>().p(this).c(ListeRecherche.class).var("listeCours").o(listeCours);

	/**	<br/>L'entité « listeCours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeCours">Trouver l'entité listeCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeCours(Couverture<ListeRecherche<Cours>> c);

	public ListeRecherche<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(ListeRecherche<Cours> listeCours) {
		this.listeCours = listeCours;
		this.listeCoursCouverture.dejaInitialise = true;
	}
	protected CoursEnUSGenPage listeCoursInit() {
		if(!listeCoursCouverture.dejaInitialise) {
			_listeCours(listeCoursCouverture);
			if(listeCours == null)
				setListeCours(listeCoursCouverture.o);
		}
		if(listeCours != null)
			listeCours.initLoinPourClasse(requeteSite_);
		listeCoursCouverture.dejaInitialise(true);
		return (CoursEnUSGenPage)this;
	}

	///////////
	// cours //
	///////////

	/**	L'entité « cours »
	 *	 is defined as null before being initialized. 
	 */
	protected Cours cours;
	public Couverture<Cours> coursCouverture = new Couverture<Cours>().p(this).c(Cours.class).var("cours").o(cours);

	/**	<br/>L'entité « cours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cours">Trouver l'entité cours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cours(Couverture<Cours> c);

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
		this.coursCouverture.dejaInitialise = true;
	}
	protected CoursEnUSGenPage coursInit() {
		if(!coursCouverture.dejaInitialise) {
			_cours(coursCouverture);
			if(cours == null)
				setCours(coursCouverture.o);
		}
		if(cours != null)
			cours.initLoinPourClasse(requeteSite_);
		coursCouverture.dejaInitialise(true);
		return (CoursEnUSGenPage)this;
	}

	//////////////////
	// pageUriCours //
	//////////////////

	/**	L'entité « pageUriCours »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriCours;
	public Couverture<String> pageUriCoursCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriCours").o(pageUriCours);

	/**	<br/>L'entité « pageUriCours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUriCours">Trouver l'entité pageUriCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriCours(Couverture<String> c);

	public String getPageUriCours() {
		return pageUriCours;
	}

	public void setPageUriCours(String pageUriCours) {
		this.pageUriCours = pageUriCours;
		this.pageUriCoursCouverture.dejaInitialise = true;
	}
	protected CoursEnUSGenPage pageUriCoursInit() {
		if(!pageUriCoursCouverture.dejaInitialise) {
			_pageUriCours(pageUriCoursCouverture);
			if(pageUriCours == null)
				setPageUriCours(pageUriCoursCouverture.o);
		}
		pageUriCoursCouverture.dejaInitialise(true);
		return (CoursEnUSGenPage)this;
	}

	public String solrPageUriCours() {
		return pageUriCours;
	}

	public String strPageUriCours() {
		return pageUriCours == null ? "" : pageUriCours;
	}

	public String nomAffichagePageUriCours() {
		return null;
	}

	public String htmTooltipPageUriCours() {
		return null;
	}

	public String htmPageUriCours() {
		return pageUriCours == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriCours());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursEnUSGenPage = false;

	public CoursEnUSGenPage initLoinCoursEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursEnUSGenPage) {
			dejaInitialiseCoursEnUSGenPage = true;
			initLoinCoursEnUSGenPage();
		}
		return (CoursEnUSGenPage)this;
	}

	public void initLoinCoursEnUSGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initCoursEnUSGenPage();
	}

	public void initCoursEnUSGenPage() {
		listeCoursInit();
		coursInit();
		pageUriCoursInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinCoursEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeCours != null)
			listeCours.setRequeteSite_(requeteSite_);
		if(cours != null)
			cours.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteCoursEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursEnUSGenPage(String var) {
		CoursEnUSGenPage oCoursEnUSGenPage = (CoursEnUSGenPage)this;
		switch(var) {
			case "listeCours":
				return oCoursEnUSGenPage.listeCours;
			case "cours":
				return oCoursEnUSGenPage.cours;
			case "pageUriCours":
				return oCoursEnUSGenPage.pageUriCours;
			default:
				return super.obtenirMiseEnPage(var);
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
				o = attribuerCoursEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursEnUSGenPage(String var, Object val) {
		CoursEnUSGenPage oCoursEnUSGenPage = (CoursEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerMiseEnPage(var, val);
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
					o = definirCoursEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsCoursEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptCoursEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyCoursEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlCoursEnUSGenPage();
		super.html();
	}

	public void htmlCoursEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaCoursEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaCoursEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesCoursEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesCoursEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleCoursEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleCoursEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCoursEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCoursEnUSGenPage() {
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
		if(!(o instanceof CoursEnUSGenPage))
			return false;
		CoursEnUSGenPage that = (CoursEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
