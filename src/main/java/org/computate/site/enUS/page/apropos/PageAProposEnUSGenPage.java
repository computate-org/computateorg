package org.computate.site.enUS.page.apropos;

import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enus.article.Article;
import org.computate.site.enus.article.ArticleEnUSPage;
import org.computate.site.enus.config.ConfigSite;

import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;

import org.computate.site.enUS.page.MiseEnPage;
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
public class PageAProposEnUSGenPage extends PageAProposEnUSGenPageGen<ArticleEnUSPage> {

	protected void _pageAPropos(Couverture<PageAPropos> c) {
		c.o(new PageAPropos());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageAPropos != null)
			c.o("Who is Christopher Tate? ");
		else
			c.o("Who is Christopher Tate? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("All about me. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageAPropos != null)
			c.o("Who is Christopher Tate? All about me. ");
		else
			c.o("Who is Christopher Tate? All about me. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/about");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/apropos");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Who is Christopher Tate? All about me. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/about-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(641);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("male");
	}

	@Override public void initLoinPageAProposEnUSGenPage() {
		initPageAProposEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageAProposEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/PageAProposEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyPageAProposEnUSGenPage() {

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

		if(pageAPropos != null)
			pageAPropos.htmlBody();

	}

	@Override public void htmlBodyCourtPageAProposEnUSGenPage() {

		pageAPropos.htmlBodyCourt();
	}
}
