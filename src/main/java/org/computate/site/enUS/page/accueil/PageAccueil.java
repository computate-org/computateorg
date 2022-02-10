package org.computate.site.enUS.page.accueil;

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.cours.Cours;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;

import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;

public class PageAccueil extends PageAccueilGen<Article> {

	public static void  main(String[] args) {  
		indexer(); 
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(PageAccueil.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.accueil.PageAccueil.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(PageAccueil_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.accueil.PageAccueil.PageAccueil_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(PageAccueil_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.accueil.PageAccueil.PageAccueil_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAccueilEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAccueilFrFRPage_Uri);
	}

	protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(PageAccueilEnUSPage_ImageUri);
	}

	protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(PageAccueilFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.accueil.PageAccueil.PageAccueil_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.accueil.PageAccueil.PageAccueil_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.accueil.PageAccueil.PageAccueilVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAccueil_H1);
		addPageRecherche_frFR(PageAccueil_H2);
		addPageRecherche_frFR(PageAccueilVals);
	}

	@Override()
	protected void  _pageTitre(Couverture<String> c) {
		c.o(PageAccueil_H1 + PageAccueil_H2);
	}

	@Override()
	protected void  _pageH1(Couverture<String> c) {
		c.o(PageAccueil_H1);
	}

	@Override()
	protected void  _pageH2(Couverture<String> c) {
		c.o(PageAccueil_H2);
	}

	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("coursNumero_indexed_int", ORDER.desc);
		o.addSort("leconNumero_indexed_int", ORDER.desc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	public void  htmlBody() {  
		OperationRequest operationRequete = requeteSite_.getOperationRequete();

		{ e("div").a("class", "").f();
			{ e("form").a("id", "ArticleForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/enUS/article").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_enUS')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "search articles")
						.a("title", "")
						.a("class", "recherchePageRecherche_enUS w3-input w3-border w3-bar-item ")
						.a("name", "pageRecherche_enUS")
						.a("id", "recherchePageRecherche_enUS");
					operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
						String entiteVar = null;
						String valeurIndexe = null;
						String paramNom = paramRequete.getKey();
						Object paramValeursObjet = paramRequete.getValue();
						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

						try {
							for(Object paramObjet : paramObjets) {
								switch(paramNom) {
									case "q":
										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
										if("pageRecherche_enUS".equals(entiteVar))
											a("value", URLDecoder.decode(valeurIndexe, "UTF-8"));
								}
							}
						} catch(Exception e) {
							ExceptionUtils.rethrow(e);
						}
					});
					fg();
					{ e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-vivid-greenish-blue ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		{ e("h1").f();
				e("i").a("class", Article.Article_IconeGroupe, " ", Article.Article_IconeNom, " site-menu-icon ").f().g("i");
			e("span").a("class", " ").f().sx("articles").g("span");
		} g("h1");
		{ e("div").a("class", "w3-row ").f();
			Map<String, Map<String, List<String>>> highlighting = listeArticle.getQueryResponse().getHighlighting();
			for(int i = 0; i < listeArticle.size(); i++) {
				Article o = listeArticle.getList().get(i);
				Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
				List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
				String uri = o.getPageUri();
				{ e("div").a("class", "w3-half w3-mobile ").f();
					{ e("div").a("class", "w3-card-4 w3-margin w3-white ").f();
						{ e("a").a("href", uri).f();
							{ e("div").a("class", "w3-container w3-responsive ").f();
								{ e("h3").a("class", "w3-margin-top ").f();
									sx(o.getArticleH1());
								} g("h3");
								{ e("div").a("class", "site-highlight w3-opacity ").f();
									sx(requeteSite_.getConfigSite_().getSiteUrlBase(), o.getPageUri());
								} g("div");
								{ e("h4").a("class", "w3-margin-top w3-margin-bottom ").f();
									sx(o.getArticleH2());
								} g("h4");
							} g("div");
							if(o.getPageImageUri() != null)
								e("img").a("alt", "").a("src", statiqueUrlBase, "/", o.getPageImageUri()).a("class", "w3-image ").fg();
						} g("a");
					} g("div");
				} g("div");
			}
		} g("div");
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}
}
