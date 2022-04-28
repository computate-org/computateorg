package org.computate.site.frFR.cours.c001;        

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.recherche.ListeRecherche;

import io.vertx.ext.web.api.OperationRequest;

/**     
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/lecons
 * ApiUriRechercheEnUSPage: /enUS/course/001/lessons
 * PageRechercheFrFRPage: C001LeconFrFRPage
 * PageRechercheEnUSPage: C001LeconEnUSPage
 * PageSuperRechercheFrFRPage: C001FrFRPage
 * PageSuperRechercheEnUSPage: C001EnUSPage
 * UnNom.frFR: un leçon
 * UnNom.enUS: a lesson
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
*/   
public class C001Lecon extends C001LeconGen<C001> {  

	@Override
	protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001Lecon.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.C001Lecon.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _leconCree(Couverture<LocalDateTime> c) {
	}

	@Override protected void _leconNumero(Couverture<Integer> c) {
	}

	@Override protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(leconCree);
	}

	@Override protected void _estLecon(Couverture<Boolean> c) {
		c.o(true);
	}

	@Override protected void _estCours(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 */ 
	protected void _leconsACote(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.setRows(2);
		o.addFilterQuery("leconNumero_indexed_int:(" + (leconNumero - 1) + " OR " + (leconNumero + 1) + ")");
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars(C001Lecon.class.getCanonicalName()));
		o.addSort("leconNumero_indexed_int", ORDER.asc);
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 * r: rechercher articles
	 * r.enUS: search articles
	 * r: leçon
	 * r.enUS: lesson
	 * r: cours
	 * r.enUS: course
	 * r: Articles précédents et suivants. 
	 * r.enUS: Previous and next articles. 
	 * r: Article précédent. 
	 * r.enUS: Previous article. 
	 * r: Article suivant. 
	 * r.enUS: Next article. 
	 */
	public void htmlBody() {
		OperationRequest operationRequete = requeteSite_.getOperationRequete();

		super.htmlBody();
//		{ e("div").a("class", "").f();
//			{ e("form").a("id", "ArticleForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/frFR/article").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_frFR')); return false; ").f();
//				{ e("div").a("class", "w3-bar ").f();
//					e("input").a("type", "text")
//						.a("placeholder", "rechercher articles")
//						.a("title", "")
//						.a("class", "recherchePageRecherche_frFR w3-input w3-border w3-bar-item ")
//						.a("name", "pageRecherche_frFR")
//						.a("id", "recherchePageRecherche_frFR");
//					operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
//						String entiteVar = null;
//						String valeurIndexe = null;
//						String paramNom = paramRequete.getKey();
//						Object paramValeursObjet = paramRequete.getValue();
//						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);
//
//						try {
//							for(Object paramObjet : paramObjets) {
//								switch(paramNom) {
//									case "q":
//										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
//										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
//										if("pageRecherche_frFR".equals(entiteVar))
//											a("value", URLDecoder.decode(valeurIndexe, "UTF-8"));
//								}
//							}
//						} catch(Exception e) {
//							ExceptionUtils.rethrow(e);
//						}
//					});
//					fg();
//					{ e("button")
//						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-vivid-greenish-blue ")
//						.f();
//						e("i").a("class", "fas fa-search ").f().g("i");
//					} g("button");
//				} g("div");
//			} g("form");
//		} g("div");

		{ e("h1").a("class", "w3-margin-top ").f();
			e("i").a("class", "far fa-book site-menu-icon ").f().g("i");
			if(leconsACote.size() == 1 && leconsACote.getList().get(0).getLeconNumero() < leconNumero)
				e("span").a("class", " ").f().sx("Article précédent. ").g("span");
			else if(leconsACote.size() == 1 && leconsACote.getList().get(0).getLeconNumero() > leconNumero)
				e("span").a("class", " ").f().sx("Article suivant. ").g("span");
			else
				e("span").a("class", " ").f().sx("Articles précédents et suivants. ").g("span");
		} g("h1");
		{ e("div").a("class", "w3-row ").f();
			Map<String, Map<String, List<String>>> highlighting = leconsACote.getQueryResponse().getHighlighting();
			for(int i = 0; i < leconsACote.size(); i++) {
				Article o = leconsACote.getList().get(i);
				Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
				List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
				String uri = o.getPageUri();
				{ e("div").a("class", "w3-half w3-mobile ").f();
					{ e("div").a("class", "w3-card-4 w3-margin w3-white ").f();
						{ e("a").a("href", uri).f();
							{ e("span").a("class", "w3-container w3-responsive ").f();
								{ e("h3").a("class", "w3-margin-top ").f();
									sx(o.getArticleH1());
								} g("h3");
								{ e("div").a("class", "site-highlight w3-opacity ").f();
									sx(requeteSite_.getConfigSite_().getSiteUrlBase(), o.getPageUri());
								} g("div");
								{ e("h4").a("class", "w3-margin-top w3-margin-bottom ").f();
									sx(o.getArticleH2());
								} g("h4");
							} g("span");
							if(o.getPageImageUri() != null)
								e("img").a("src", statiqueUrlBase, "/", o.getPageImageUri()).a("class", "w3-image ").fg();
						} g("a");
					} g("div");
				} g("div");
			}
		} g("div");
	}
}
