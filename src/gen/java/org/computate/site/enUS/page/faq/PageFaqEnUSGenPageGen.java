package org.computate.site.enUS.page.faq;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enus.article.ArticleEnUSPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.page.faq.PageFaq;
import org.computate.site.enUS.request.RequeteSiteEnUS;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaqEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqEnUSGenPageGen<DEV> extends ArticleEnUSPage {

	/////////////
	// pageFaq //
	/////////////

	/**	L'entité « pageFaq »
	 *	 is defined as null before being initialized. 
	 */
	protected PageFaq pageFaq;
	public Couverture<PageFaq> pageFaqCouverture = new Couverture<PageFaq>().p(this).c(PageFaq.class).var("pageFaq").o(pageFaq);

	/**	<br/>L'entité « pageFaq »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaqEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageFaq">Trouver l'entité pageFaq dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageFaq(Couverture<PageFaq> c);

	public PageFaq getPageFaq() {
		return pageFaq;
	}

	public void setPageFaq(PageFaq pageFaq) {
		this.pageFaq = pageFaq;
		this.pageFaqCouverture.dejaInitialise = true;
	}
	protected PageFaqEnUSGenPage pageFaqInit() {
		if(!pageFaqCouverture.dejaInitialise) {
			_pageFaq(pageFaqCouverture);
			if(pageFaq == null)
				setPageFaq(pageFaqCouverture.o);
		}
		if(pageFaq != null)
			pageFaq.initLoinPourClasse(requeteSite_);
		pageFaqCouverture.dejaInitialise(true);
		return (PageFaqEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageFaqEnUSGenPage = false;

	public PageFaqEnUSGenPage initLoinPageFaqEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaqEnUSGenPage) {
			dejaInitialisePageFaqEnUSGenPage = true;
			initLoinPageFaqEnUSGenPage();
		}
		return (PageFaqEnUSGenPage)this;
	}

	public void initLoinPageFaqEnUSGenPage() {
		super.initLoinArticleEnUSPage(requeteSite_);
		initPageFaqEnUSGenPage();
	}

	public void initPageFaqEnUSGenPage() {
		pageFaqInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageFaqEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaqEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticleEnUSPage(requeteSite_);
		if(pageFaq != null)
			pageFaq.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageFaqEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaqEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaqEnUSGenPage(String var) {
		PageFaqEnUSGenPage oPageFaqEnUSGenPage = (PageFaqEnUSGenPage)this;
		switch(var) {
			case "pageFaq":
				return oPageFaqEnUSGenPage.pageFaq;
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
				o = attribuerPageFaqEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaqEnUSGenPage(String var, Object val) {
		PageFaqEnUSGenPage oPageFaqEnUSGenPage = (PageFaqEnUSGenPage)this;
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
					o = definirPageFaqEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaqEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageFaqEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageFaqEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaqEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageFaqEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageFaqEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageFaqEnUSGenPage() {
		if(pageFaq != null)
			pageFaq.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageFaqEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageFaqEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageFaqEnUSGenPage();
		super.html();
	}

	public void htmlPageFaqEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageFaqEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageFaqEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageFaqEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageFaqEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageFaqEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageFaqEnUSGenPage() {
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
		if(!(o instanceof PageFaqEnUSGenPage))
			return false;
		PageFaqEnUSGenPage that = (PageFaqEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageFaqEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
