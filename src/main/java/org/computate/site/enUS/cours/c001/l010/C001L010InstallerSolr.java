package org.computate.site.enUS.cours.c001.l010;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L010InstallerSolr extends C001L010InstallerSolrGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(10);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L010InstallerSolr.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolr_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolr_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L010InstallerSolrEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolrFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L010InstallerSolrEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolrFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolrVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L010InstallerSolr_H1);
		addPageRecherche_frFR(C001L010InstallerSolr_H2);
		addPageRecherche_frFR(C001L010InstallerSolrVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _zookeeperPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10281);
		else
			c.o(utilisateurSite.getZookeeperPortClient());
	}

	protected void _solrVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("7.1.0");
		else
			c.o(utilisateurSite.getSolrVersion());
	}

	protected void _solrPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10380);
		else
			c.o(utilisateurSite.getSolrPortClient());
	}

	protected void _solrTag(Couverture<String> c) {
		c.o("release-" + solrVersion);
	}

	protected void _solrConfigset(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("computate");
		else
			c.o(utilisateurSite.getSolrConfigset());
	}

	protected void _solrCollection(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("site");
		else
			c.o(utilisateurSite.getSolrCollection());
	}

	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}

	@Override()
	public void  htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
		if(utilisateurSite != null) {
			{ e("div").a("class", "w3-cell-row ").f();
				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
					{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperPortClientForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_zookeeperPortClient").a("class", "").f().sx("port client de Zookeeper").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "port client de Zookeeper")
							.a("class", "setZookeeperPortClient w3-input w3-border ")
							.a("name", "setZookeeperPortClient")
							.a("id", "Page_zookeeperPortClient")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#zookeeperPortClientForm')); ")
							.a("value", strZookeeperPortClient())
						.fg();
	
					} g("form");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell-row ").f();
				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
					{ e("form").a("action", "/api/site/utilisateur").a("id", "solrVersionForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_solrVersion").a("class", "").f().sx("version de Solr").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "version de Solr")
							.a("class", "setSolrVersion w3-input w3-border ")
							.a("name", "setSolrVersion")
							.a("id", "Page_solrVersion")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrVersionForm')); ")
							.a("value", strSolrVersion())
						.fg();
	
					} g("form");
				} g("div");
				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
					{ e("form").a("action", "/api/site/utilisateur").a("id", "solrPortClientForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_solrPortClient").a("class", "").f().sx("port client de Solr").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "port client de Solr")
							.a("class", "setSolrPortClient w3-input w3-border ")
							.a("name", "setSolrPortClient")
							.a("id", "Page_solrPortClient")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrPortClientForm')); ")
							.a("value", strSolrPortClient())
						.fg();
	
					} g("form");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell-row ").f();
				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
					{ e("form").a("action", "/api/site/utilisateur").a("id", "solrConfigsetForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_solrConfigset").a("class", "").f().sx("Configset Solr").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "Configset Solr")
							.a("class", "setSolrConfigset w3-input w3-border ")
							.a("name", "setSolrConfigset")
							.a("id", "Page_solrConfigset")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrConfigsetForm')); ")
							.a("value", strSolrConfigset())
						.fg();
	
					} g("form");
				} g("div");
				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
					{ e("form").a("action", "/api/site/utilisateur").a("id", "solrCollectionForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_solrCollection").a("class", "").f().sx("Collection Solr").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "Collection Solr")
							.a("class", "setSolrCollection w3-input w3-border ")
							.a("name", "setSolrCollection")
							.a("id", "Page_solrCollection")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrCollectionForm')); ")
							.a("value", strSolrCollection())
						.fg();
	
					} g("form");
				} g("div");
			} g("div");
		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrc(PageHtml o) {
	}

	protected void _questionClonerSource(PageHtml o) {
	}

	protected void _questionConstruireSource(PageHtml o) {
	}

	protected void _questionMkdirServeur(PageHtml o) {
	}

	protected void _questionConfigurer(PageHtml o) {
	}

	protected void _questionConfigurerConfigset(PageHtml o) {
	}

	protected void _questionConfigsetZookeeper(PageHtml o) {
	}

	protected void _questionService(PageHtml o) {
	}

	protected void _questionSystemctlDaemonReload(PageHtml o) {
	}

	protected void _questionSystemctlEnable(PageHtml o) {
	}

	protected void _questionSystemctlStart(PageHtml o) {
	}

	protected void _questionSystemctlStatus(PageHtml o) {
	}

	protected void _questionCollectionsSolr(PageHtml o) {
	}

	protected void _questionLiens(PageHtml o) {
	}

	@Override()
	public void  htmlBodyQuestionLiens(PageHtml o) {
		String urlBase = "http://localhost:" + solrPortClient;
		{ e("h3").a("class", " questionLiensH3 ").f();
			{ e("i").a("class", questionLiensH3I1, " site-menu-icon questionLiensH3I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH3Span ").f();
				sx(questionLiensH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionLiensH4 ").f();
			{ e("i").a("class", questionLiensH4I1, " site-menu-icon questionLiensH4I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH4Span ").f();
				sx(questionLiensH4Span1);
			} g("span");
		} g("h4");
		{ e("ul").a("class", " questionLiensUl ").f();
			{ e("li").a("class", " questionLiensUlLi1 questionLiensUlLi odd ").f();
				{ e("a").a("class", " questionLiensUlLi1A ").a("href", urlBase, "/solr/#/").f();
					sx(urlBase, "/solr/#/");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi1Span ").f();
					sx(questionLiensUlLi1Span1);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionLiensUlLi2 questionLiensUlLi even ").f();
				{ e("a").a("class", " questionLiensUlLi2A ").a("href", urlBase + "/solr/#/", solrCollection, "/query").f();
					sx(urlBase + "/solr/#/", solrCollection, "/query");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi2Span ").f();
					sx(questionLiensUlLi2Span1);
				} g("span");
			} g("li");
		} g("ul");
	}

	protected void _recapituler1(PageHtml o) {      
	}

	@Override()
	public void  htmlBodyRecapituler1(PageHtml o) {
		g("div");
		super.htmlBodyRecapituler1(o);
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
