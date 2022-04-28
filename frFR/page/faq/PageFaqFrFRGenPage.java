package org.computate.site.frFR.page.faq;

import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.page.parti.PageHtml;
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
public class PageFaqFrFRGenPage extends PageFaqFrFRGenPageGen<ArticleFrFRPage> {

	protected void _pageFaq(Couverture<PageFaq> c) {
		c.o(new PageFaq());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageFaq != null)
			c.o("Avez-vous des questions concernant computate.org ? ");
		else
			c.o("Avez-vous des questions concernant computate.org ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("computate.org foire aux questions (FAQ). ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageFaq != null)
			c.o("Avez-vous des questions concernant computate.org ? computate.org foire aux questions (FAQ). ");
		else
			c.o("Avez-vous des questions concernant computate.org ? computate.org foire aux questions (FAQ). ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/faq");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/faq");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Avez-vous des questions concernant computate.org ? computate.org foire aux questions (FAQ). ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/faq-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(365);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinPageFaqFrFRGenPage() {
		initPageFaqFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageFaqFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/PageFaqFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyPageFaqFrFRGenPage() {

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

		if(pageFaq != null)
			pageFaq.htmlBody();

	}

	@Override public void htmlBodyCourtPageFaqFrFRGenPage() {

		pageFaq.htmlBodyCourt();
	}
}
