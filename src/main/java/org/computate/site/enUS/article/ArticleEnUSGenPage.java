package org.computate.site.enUS.article;

import java.lang.String;
import org.apache.solr.common.SolrDocument;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.List;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;


/**
 * Traduire: false
 **/
public class ArticleEnUSGenPage extends ArticleEnUSGenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeArticle(Couverture<ListeRecherche<Article>> c) {
	}

	protected void _article(Couverture<Article> c) {
		if(listeArticle != null && listeArticle.size() == 1)
			c.o(listeArticle.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(article != null)
			c.o("an article");
		else if(listeArticle == null || listeArticle.size() == 0)
			c.o("no article found");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(article != null)
			c.o("");
		else if(listeArticle == null || listeArticle.size() == 0)
			c.o("no article found");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/article");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/article");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/article-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinArticleEnUSGenPage() {
		initArticleEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsArticleEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/ArticleEnUSPage.js").f().g("script");
	}

	protected void _pageUriArticle(Couverture<String> c) {
			c.o("/enUS/article");
	}

	@Override public void htmlScriptArticleEnUSGenPage() {
	}

	public void htmlFormPageArticle(Article o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("course").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("description").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconDescription()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("description").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strArticleDescription()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	public void htmlFormPOSTArticle(Article o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("course").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("description").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconDescription()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("description").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strArticleDescription()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	public void htmlFormPATCHArticle(Article o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("course").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("lesson").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	public void htmlFormRechercheArticle(Article o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("course").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("lesson").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	@Override public void htmlBodyArticleEnUSGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeArticle == null || listeArticle.size() == 0) {
			// contexteAucunNomTrouve : no article found

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("no article found").g("span");
			} g("h1");
		} else if(listeArticle != null && listeArticle.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			// contexteUnNom : an article
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx(pageH1).g("span");
				} g("h1");
				Article o = listeArticle.get(0);
			}
			if(pageH2 != null) {
				{ e("h2").f();
					e("span").a("class", " ").f().sx(pageH2).g("span");
				} g("h2");
			}
			if(pageH3 != null) {
				{ e("h3").f();
					e("span").a("class", " ").f().sx(pageH3).g("span");
				} g("h3");
			}
		} else {
			// contexteNomPluriel : plusiers articles

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("articles").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("course").g("th");
						e("th").f().sx("lesson").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					Map<String, Map<String, List<String>>> highlighting = listeArticle.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeArticle.size(); i++) {
						Article o = listeArticle.getList().get(i);
						Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
						List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
						String uri = o.getPageUri();
						{ e("tr").f();
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getLeconNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getArticleDescription());
								} g("a");
								if(highlightList != null) {
									{ e("div").a("class", "site-highlight ").f();
										s(StringUtils.join(highlightList, " ... "));
									} g("div");
								}
							} g("td");
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		{ e("div").a("class", "").f();
			{ e("form").a("id", "ArticleForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/enUS/article").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_enUS')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "")
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
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		if(listeArticle != null && listeArticle.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			Article o = listeArticle.first();

			{ e("div").a("class", "").f();

				if(o.getPk() != null) {
					{ e("form").a("action", "/api/article").a("id", "ArticleForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageArticle(o);
				}

				if(o != null)
					o.htmlBody();

			} g("div");
		}
		htmlBodyFormsArticleEnUSGenPage();
	}

	public void htmlBodyFormsArticleEnUSGenPage() {
		e("div").f();

		g("div");
	}

}