package org.computate.site.enUS.cours;

import org.apache.solr.common.SolrDocument;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.List;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import java.time.LocalDate;
import java.time.ZonedDateTime;


/**
 * Traduire: false
 **/
public class CoursEnUSGenPage extends CoursEnUSGenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeCours(Couverture<ListeRecherche<Cours>> c) {
	}

	protected void _cours(Couverture<Cours> c) {
		if(listeCours.size() == 1)
			c.o(listeCours.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(cours != null)
			c.o("");
		else if(listeCours.size() == 0)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(cours != null)
			c.o("");
		else if(listeCours.size() == 0)
			c.o("");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinCoursEnUSGenPage() {
		initCoursEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsCoursEnUSGenPage() {
		e("script").a("src", "/static/js/CoursEnUSGenPage.js").f().g("script");
	}

	@Override public void htmlScriptCoursEnUSGenPage() {
	}

	public void htmlFormPageCours(Cours o) {
	}

	public void htmlFormPOSTCours(Cours o) {
	}

	public void htmlFormPATCHCours(Cours o) {
	}

	public void htmlFormRechercheCours(Cours o) {
	}

	@Override public void htmlBodyCoursEnUSGenPage() {

		if(listeCours.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeCours.size() == 1) {
			// 
			Cours o = listeCours.first();

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
					e("span").a("class", " ").f().sx(pageH1).g("span");
				} g("h1");
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
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "CoursForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageCours(o);
				}

				o.htmlBody();

			} g("div");
		} else {
			// plusiers 

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("i");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeCours.size(); i++) {
						Cours o = listeCours.getList().get(i);
						String uri = "/enUS/course/" + o.getPk();
						{ e("tr").f();
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}
		e("div").f();

		g("div");
	}
}