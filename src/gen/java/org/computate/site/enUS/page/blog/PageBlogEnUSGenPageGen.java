package org.computate.site.enUS.page.blog;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enus.article.ArticleEnUSPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.page.blog.PageBlog;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlogEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageBlogEnUSGenPageGen<DEV> extends ArticleEnUSPage {

	//////////////
	// pageBlog //
	//////////////

	/**	L'entité « pageBlog »
	 *	 is defined as null before being initialized. 
	 */
	protected PageBlog pageBlog;
	public Couverture<PageBlog> pageBlogCouverture = new Couverture<PageBlog>().p(this).c(PageBlog.class).var("pageBlog").o(pageBlog);

	/**	<br/>L'entité « pageBlog »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlogEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageBlog">Trouver l'entité pageBlog dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageBlog(Couverture<PageBlog> c);

	public PageBlog getPageBlog() {
		return pageBlog;
	}

	public void setPageBlog(PageBlog pageBlog) {
		this.pageBlog = pageBlog;
		this.pageBlogCouverture.dejaInitialise = true;
	}
	protected PageBlogEnUSGenPage pageBlogInit() {
		if(!pageBlogCouverture.dejaInitialise) {
			_pageBlog(pageBlogCouverture);
			if(pageBlog == null)
				setPageBlog(pageBlogCouverture.o);
		}
		if(pageBlog != null)
			pageBlog.initLoinPourClasse(requeteSite_);
		pageBlogCouverture.dejaInitialise(true);
		return (PageBlogEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageBlogEnUSGenPage = false;

	public PageBlogEnUSGenPage initLoinPageBlogEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageBlogEnUSGenPage) {
			dejaInitialisePageBlogEnUSGenPage = true;
			initLoinPageBlogEnUSGenPage();
		}
		return (PageBlogEnUSGenPage)this;
	}

	public void initLoinPageBlogEnUSGenPage() {
		super.initLoinArticleEnUSPage(requeteSite_);
		initPageBlogEnUSGenPage();
	}

	public void initPageBlogEnUSGenPage() {
		pageBlogInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageBlogEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageBlogEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticleEnUSPage(requeteSite_);
		if(pageBlog != null)
			pageBlog.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageBlogEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageBlogEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageBlogEnUSGenPage(String var) {
		PageBlogEnUSGenPage oPageBlogEnUSGenPage = (PageBlogEnUSGenPage)this;
		switch(var) {
			case "pageBlog":
				return oPageBlogEnUSGenPage.pageBlog;
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
				o = attribuerPageBlogEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageBlogEnUSGenPage(String var, Object val) {
		PageBlogEnUSGenPage oPageBlogEnUSGenPage = (PageBlogEnUSGenPage)this;
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
					o = definirPageBlogEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageBlogEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageBlogEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageBlogEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageBlogEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageBlogEnUSGenPage() {
		if(pageBlog != null)
			pageBlog.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageBlogEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageBlogEnUSGenPage() {
		if(pageBlog != null)
			pageBlog.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageBlogEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageBlogEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageBlogEnUSGenPage();
		super.html();
	}

	public void htmlPageBlogEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageBlogEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageBlogEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageBlogEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageBlogEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageBlogEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageBlogEnUSGenPage() {
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
		if(!(o instanceof PageBlogEnUSGenPage))
			return false;
		PageBlogEnUSGenPage that = (PageBlogEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageBlogEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
