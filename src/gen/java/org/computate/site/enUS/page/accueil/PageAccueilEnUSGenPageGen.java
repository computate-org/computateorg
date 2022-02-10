package org.computate.site.enUS.page.accueil;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enus.article.ArticleEnUSPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.page.accueil.PageAccueil;
import org.computate.site.enUS.request.RequeteSiteEnUS;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueilEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilEnUSGenPageGen<DEV> extends ArticleEnUSPage {

	/////////////////
	// pageAccueil //
	/////////////////

	/**	L'entité « pageAccueil »
	 *	 is defined as null before being initialized. 
	 */
	protected PageAccueil pageAccueil;
	public Couverture<PageAccueil> pageAccueilCouverture = new Couverture<PageAccueil>().p(this).c(PageAccueil.class).var("pageAccueil").o(pageAccueil);

	/**	<br/>L'entité « pageAccueil »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueilEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageAccueil">Trouver l'entité pageAccueil dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAccueil(Couverture<PageAccueil> c);

	public PageAccueil getPageAccueil() {
		return pageAccueil;
	}

	public void setPageAccueil(PageAccueil pageAccueil) {
		this.pageAccueil = pageAccueil;
		this.pageAccueilCouverture.dejaInitialise = true;
	}
	protected PageAccueilEnUSGenPage pageAccueilInit() {
		if(!pageAccueilCouverture.dejaInitialise) {
			_pageAccueil(pageAccueilCouverture);
			if(pageAccueil == null)
				setPageAccueil(pageAccueilCouverture.o);
		}
		if(pageAccueil != null)
			pageAccueil.initLoinPourClasse(requeteSite_);
		pageAccueilCouverture.dejaInitialise(true);
		return (PageAccueilEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueilEnUSGenPage = false;

	public PageAccueilEnUSGenPage initLoinPageAccueilEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueilEnUSGenPage) {
			dejaInitialisePageAccueilEnUSGenPage = true;
			initLoinPageAccueilEnUSGenPage();
		}
		return (PageAccueilEnUSGenPage)this;
	}

	public void initLoinPageAccueilEnUSGenPage() {
		super.initLoinArticleEnUSPage(requeteSite_);
		initPageAccueilEnUSGenPage();
	}

	public void initPageAccueilEnUSGenPage() {
		pageAccueilInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAccueilEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueilEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticleEnUSPage(requeteSite_);
		if(pageAccueil != null)
			pageAccueil.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAccueilEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueilEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueilEnUSGenPage(String var) {
		PageAccueilEnUSGenPage oPageAccueilEnUSGenPage = (PageAccueilEnUSGenPage)this;
		switch(var) {
			case "pageAccueil":
				return oPageAccueilEnUSGenPage.pageAccueil;
			default:
				return super.obtenirArticleEnUSPage(var);
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
				o = attribuerPageAccueilEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueilEnUSGenPage(String var, Object val) {
		PageAccueilEnUSGenPage oPageAccueilEnUSGenPage = (PageAccueilEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerArticleEnUSPage(var, val);
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
					o = definirPageAccueilEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueilEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAccueilEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAccueilEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAccueilEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageAccueilEnUSGenPage() {
		if(pageAccueil != null)
			pageAccueil.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAccueilEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAccueilEnUSGenPage() {
		if(pageAccueil != null)
			pageAccueil.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageAccueilEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageAccueilEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageAccueilEnUSGenPage();
		super.html();
	}

	public void htmlPageAccueilEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageAccueilEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageAccueilEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageAccueilEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageAccueilEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageAccueilEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageAccueilEnUSGenPage() {
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
		if(!(o instanceof PageAccueilEnUSGenPage))
			return false;
		PageAccueilEnUSGenPage that = (PageAccueilEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueilEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
