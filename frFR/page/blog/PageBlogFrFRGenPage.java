package org.computate.site.frFR.page.blog;

import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.article.Article;
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
public class PageBlogFrFRGenPage extends PageBlogFrFRGenPageGen<ArticleFrFRPage> {

	protected void _pageBlog(Couverture<PageBlog> c) {
		c.o(new PageBlog());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageBlog != null)
			c.o("computate.org blog: ");
		else
			c.o("computate.org blog: ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Rechercher articles dans le site computate.org. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageBlog != null)
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
		else
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/blog");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/blog");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/blog-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(616);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinPageBlogFrFRGenPage() {
		initPageBlogFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageBlogFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/PageBlogFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyPageBlogFrFRGenPage() {

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

		if(pageBlog != null)
			pageBlog.htmlBody();

	}

	@Override public void htmlBodyCourtPageBlogFrFRGenPage() {

		pageBlog.htmlBodyCourt();
	}
}
