package org.computate.site.frFR.cours.c001;

import org.computate.site.frFR.cours.CoursFrFRPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;
import java.util.List;


/**
 * Traduire: false
 **/
public class C001FrFRGenPage extends C001FrFRGenPageGen<CoursFrFRPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001(Couverture<ListeRecherche<C001>> c) {
	}

	protected void _c001(Couverture<C001> c) {
		if(listeC001 != null && listeC001.size() == 1)
			c.o(listeC001.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001 != null)
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
		else if(listeC001 == null || listeC001.size() == 0)
			c.o("aucun cours n ° 1 trouvé");
		else
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001 != null)
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
		else if(listeC001 == null || listeC001.size() == 0)
			c.o("aucun cours n ° 1 trouvé");
		else
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinC001FrFRGenPage() {
		initC001FrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001FrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001FrFRPage.js").f().g("script");
	}

	@Override public void htmlScriptC001FrFRGenPage() {
	}

	public void htmlFormPageC001(C001 o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("cours").g("label");
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

	public void htmlFormPOSTC001(C001 o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("cours").g("label");
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

	public void htmlFormPATCHC001(C001 o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("cours").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("leçon").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	public void htmlFormRechercheC001(C001 o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("cours").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCoursNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("leçon").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strLeconNumero()).g("span");
				} g("div");
			} g("div");
		} g("div");
	}

	@Override public void htmlBodyC001FrFRGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeC001 == null || listeC001.size() == 0) {
			// contexteAucunNomTrouve : aucun cours n ° 1 trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("aucun cours n ° 1 trouvé").g("span");
			} g("h1");
		} else if(listeC001 != null && listeC001.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			// contexteUnNom : un cours n ° 1
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx(pageH1).g("span");
				} g("h1");
				C001 o = listeC001.get(0);
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
			// contexteNomPluriel : plusiers courses

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("courses").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("cours").g("th");
						e("th").f().sx("leçon").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					Map<String, Map<String, List<String>>> highlighting = listeC001.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeC001.size(); i++) {
						C001 o = listeC001.getList().get(i);
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
			{ e("form").a("id", "C001Form").a("style", "display: inline-block; ").a("method", "GET").a("action", "/frFR/cours/001").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_frFR')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "rechercher courses")
						.a("title", "")
						.a("class", "recherchePageRecherche_frFR w3-input w3-border w3-bar-item ")
						.a("name", "pageRecherche_frFR")
						.a("id", "recherchePageRecherche_frFR");
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
										if("pageRecherche_frFR".equals(entiteVar))
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

		if(listeC001 != null && listeC001.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			C001 o = listeC001.first();

			{ e("div").a("class", "").f();

				if(o.getPk() != null) {
					{ e("form").a("action", "").a("id", "C001Form").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001(o);
				}

				if(o != null)
					o.htmlBody();

			} g("div");
		}
		htmlBodyFormsC001FrFRGenPage();
	}

	public void htmlBodyFormsC001FrFRGenPage() {
		e("div").f();

		g("div");
	}

}
