package org.computate.site.enUS.article;

import java.util.Objects;

import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ArticleEnUSGenPageGen<DEV> extends MiseEnPage {

	//////////////////
	// listeArticle //
	//////////////////

	/**	L'entité « listeArticle »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<Article> listeArticle;
	public Couverture<ListeRecherche<Article>> listeArticleCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("listeArticle").o(listeArticle);

	/**	<br/>L'entité « listeArticle »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeArticle(Couverture<ListeRecherche<Article>> c);

	public ListeRecherche<Article> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ListeRecherche<Article> listeArticle) {
		this.listeArticle = listeArticle;
		this.listeArticleCouverture.dejaInitialise = true;
	}
	protected ArticleEnUSGenPage listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticleCouverture);
			if(listeArticle == null)
				setListeArticle(listeArticleCouverture.o);
		}
		if(listeArticle != null)
			listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (ArticleEnUSGenPage)this;
	}

	/////////////
	// article //
	/////////////

	/**	L'entité « article »
	 *	 is defined as null before being initialized. 
	 */
	protected Article article;
	public Couverture<Article> articleCouverture = new Couverture<Article>().p(this).c(Article.class).var("article").o(article);

	/**	<br/>L'entité « article »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:article">Trouver l'entité article dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _article(Couverture<Article> c);

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
		this.articleCouverture.dejaInitialise = true;
	}
	protected ArticleEnUSGenPage articleInit() {
		if(!articleCouverture.dejaInitialise) {
			_article(articleCouverture);
			if(article == null)
				setArticle(articleCouverture.o);
		}
		if(article != null)
			article.initLoinPourClasse(requeteSite_);
		articleCouverture.dejaInitialise(true);
		return (ArticleEnUSGenPage)this;
	}

	////////////////////
	// pageUriArticle //
	////////////////////

	/**	L'entité « pageUriArticle »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriArticle;
	public Couverture<String> pageUriArticleCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriArticle").o(pageUriArticle);

	/**	<br/>L'entité « pageUriArticle »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUriArticle">Trouver l'entité pageUriArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriArticle(Couverture<String> c);

	public String getPageUriArticle() {
		return pageUriArticle;
	}

	public void setPageUriArticle(String pageUriArticle) {
		this.pageUriArticle = pageUriArticle;
		this.pageUriArticleCouverture.dejaInitialise = true;
	}
	protected ArticleEnUSGenPage pageUriArticleInit() {
		if(!pageUriArticleCouverture.dejaInitialise) {
			_pageUriArticle(pageUriArticleCouverture);
			if(pageUriArticle == null)
				setPageUriArticle(pageUriArticleCouverture.o);
		}
		pageUriArticleCouverture.dejaInitialise(true);
		return (ArticleEnUSGenPage)this;
	}

	public String solrPageUriArticle() {
		return pageUriArticle;
	}

	public String strPageUriArticle() {
		return pageUriArticle == null ? "" : pageUriArticle;
	}

	public String nomAffichagePageUriArticle() {
		return null;
	}

	public String htmTooltipPageUriArticle() {
		return null;
	}

	public String htmPageUriArticle() {
		return pageUriArticle == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriArticle());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticleEnUSGenPage = false;

	public ArticleEnUSGenPage initLoinArticleEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticleEnUSGenPage) {
			dejaInitialiseArticleEnUSGenPage = true;
			initLoinArticleEnUSGenPage();
		}
		return (ArticleEnUSGenPage)this;
	}

	public void initLoinArticleEnUSGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initArticleEnUSGenPage();
	}

	public void initArticleEnUSGenPage() {
		listeArticleInit();
		articleInit();
		pageUriArticleInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinArticleEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticleEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(article != null)
			article.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteArticleEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticleEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticleEnUSGenPage(String var) {
		ArticleEnUSGenPage oArticleEnUSGenPage = (ArticleEnUSGenPage)this;
		switch(var) {
			case "listeArticle":
				return oArticleEnUSGenPage.listeArticle;
			case "article":
				return oArticleEnUSGenPage.article;
			case "pageUriArticle":
				return oArticleEnUSGenPage.pageUriArticle;
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
				o = attribuerArticleEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticleEnUSGenPage(String var, Object val) {
		ArticleEnUSGenPage oArticleEnUSGenPage = (ArticleEnUSGenPage)this;
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
					o = definirArticleEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticleEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsArticleEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsArticleEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptArticleEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptArticleEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyArticleEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyArticleEnUSGenPage() {
		if(article != null)
			article.htmlBody();
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlArticleEnUSGenPage();
		super.html();
	}

	public void htmlArticleEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaArticleEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaArticleEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesArticleEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesArticleEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleArticleEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleArticleEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtArticleEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtArticleEnUSGenPage() {
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
		if(!(o instanceof ArticleEnUSGenPage))
			return false;
		ArticleEnUSGenPage that = (ArticleEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ArticleEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
