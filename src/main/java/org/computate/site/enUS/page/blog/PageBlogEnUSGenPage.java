package org.computate.site.enUS.page.blog;

import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
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
public class PageBlogEnUSGenPage extends PageBlogEnUSGenPageGen<ArticleEnUSPage> {

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
		c.o("Search articles in the site computate.org. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageBlog != null)
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
		else
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/blog");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/blog");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/blog-999.png");
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

	@Override public void initLoinPageBlogEnUSGenPage() {
		initPageBlogEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageBlogEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/PageBlogEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyPageBlogEnUSGenPage() {

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

	@Override public void htmlBodyCourtPageBlogEnUSGenPage() {

		pageBlog.htmlBodyCourt();
	}
}
