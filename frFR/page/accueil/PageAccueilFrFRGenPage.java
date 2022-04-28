package org.computate.site.frFR.page.accueil;

import java.lang.String;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
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
public class PageAccueilFrFRGenPage extends PageAccueilFrFRGenPageGen<ArticleFrFRPage> {

	protected void _pageAccueil(Couverture<PageAccueil> c) {
		c.o(new PageAccueil());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageAccueil != null)
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
		else
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Base de données PostgreSQL flexible, intégration de la recherche Solr, normes OpenAPI 3, code Vert.x totalement asynchrone, déployé sur Red Hat OpenShift, pour les meilleures solutions 100% open sources.");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageAccueil != null)
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
		else
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinPageAccueilFrFRGenPage() {
		initPageAccueilFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageAccueilFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/PageAccueilFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyPageAccueilFrFRGenPage() {

		if(StringUtils.isNotBlank(pageH1)) {
			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx(pageH1).g("span");
			} g("h1");
		}
		if(StringUtils.isNotBlank(pageH1)) {
			{ e("h2").f();
				e("span").a("class", " ").f().sx(pageH2).g("span");
			} g("h2");
		}
		if(StringUtils.isNotBlank(pageH3)) {
			{ e("h3").f();
				e("span").a("class", " ").f().sx(pageH3).g("span");
			} g("h3");
		}

		if(pageAccueil != null)
			pageAccueil.htmlBody();

	}

	@Override public void htmlBodyCourtPageAccueilFrFRGenPage() {

		pageAccueil.htmlBodyCourt();
	}
}
