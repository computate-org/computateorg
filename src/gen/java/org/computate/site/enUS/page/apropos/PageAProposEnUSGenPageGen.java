package org.computate.site.enUS.page.apropos;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.enUS.page.apropos.PageAPropos;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enus.article.ArticleEnUSPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAProposEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposEnUSGenPageGen<DEV> extends ArticleEnUSPage {

	/////////////////
	// pageAPropos //
	/////////////////

	/**	L'entité « pageAPropos »
	 *	 is defined as null before being initialized. 
	 */
	protected PageAPropos pageAPropos;
	public Couverture<PageAPropos> pageAProposCouverture = new Couverture<PageAPropos>().p(this).c(PageAPropos.class).var("pageAPropos").o(pageAPropos);

	/**	<br/>L'entité « pageAPropos »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAProposEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageAPropos">Trouver l'entité pageAPropos dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAPropos(Couverture<PageAPropos> c);

	public PageAPropos getPageAPropos() {
		return pageAPropos;
	}

	public void setPageAPropos(PageAPropos pageAPropos) {
		this.pageAPropos = pageAPropos;
		this.pageAProposCouverture.dejaInitialise = true;
	}
	protected PageAProposEnUSGenPage pageAProposInit() {
		if(!pageAProposCouverture.dejaInitialise) {
			_pageAPropos(pageAProposCouverture);
			if(pageAPropos == null)
				setPageAPropos(pageAProposCouverture.o);
		}
		if(pageAPropos != null)
			pageAPropos.initLoinPourClasse(requeteSite_);
		pageAProposCouverture.dejaInitialise(true);
		return (PageAProposEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAProposEnUSGenPage = false;

	public PageAProposEnUSGenPage initLoinPageAProposEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAProposEnUSGenPage) {
			dejaInitialisePageAProposEnUSGenPage = true;
			initLoinPageAProposEnUSGenPage();
		}
		return (PageAProposEnUSGenPage)this;
	}

	public void initLoinPageAProposEnUSGenPage() {
		super.initLoinArticleEnUSPage(requeteSite_);
		initPageAProposEnUSGenPage();
	}

	public void initPageAProposEnUSGenPage() {
		pageAProposInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAProposEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAProposEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticleEnUSPage(requeteSite_);
		if(pageAPropos != null)
			pageAPropos.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAProposEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAProposEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAProposEnUSGenPage(String var) {
		PageAProposEnUSGenPage oPageAProposEnUSGenPage = (PageAProposEnUSGenPage)this;
		switch(var) {
			case "pageAPropos":
				return oPageAProposEnUSGenPage.pageAPropos;
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
				o = attribuerPageAProposEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAProposEnUSGenPage(String var, Object val) {
		PageAProposEnUSGenPage oPageAProposEnUSGenPage = (PageAProposEnUSGenPage)this;
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
					o = definirPageAProposEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAProposEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAProposEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAProposEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAProposEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageAProposEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAProposEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAProposEnUSGenPage() {
		if(pageAPropos != null)
			pageAPropos.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageAProposEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageAProposEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageAProposEnUSGenPage();
		super.html();
	}

	public void htmlPageAProposEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageAProposEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageAProposEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageAProposEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageAProposEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageAProposEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageAProposEnUSGenPage() {
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
		if(!(o instanceof PageAProposEnUSGenPage))
			return false;
		PageAProposEnUSGenPage that = (PageAProposEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAProposEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
