package org.computate.site.enUS.cours.c001.l010;

import java.lang.Integer;
import java.lang.String;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enus.config.ConfigSite;

import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
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
public class C001L010InstallerSolrEnUSGenPage extends C001L010InstallerSolrEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L010InstallerSolr(Couverture<C001L010InstallerSolr> c) {
		c.o(new C001L010InstallerSolr());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L010InstallerSolr != null)
			c.o("How do I try out a search engine in my project? ");
		else
			c.o("How do I try out a search engine in my project? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Install Solr from the source code. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L010InstallerSolr != null)
			c.o("How do I try out a search engine in my project? Install Solr from the source code. ");
		else
			c.o("How do I try out a search engine in my project? Install Solr from the source code. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/010-how-to-install-a-recent-version-of-solr-search-engine");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/010-comment-installer-une-version-recente-du-moteur-de-recherche-solr");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Databases and search engines are both valuable resources for serving up data in different ways. Databases are perfect for persistent, normalized user data. Search engines are perfect for transformed, denormalized, searchable versions of the data. Lightning fast indexes, query highlighting, pagination, filters and faceting are just a few of the crucial features you can add to your site with a search engine. I will help you install the most recent version of Solr to make your website searchable the open source way. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/010-how-to-install-a-recent-version-of-solr-search-engine-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1454);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L010InstallerSolrEnUSGenPage() {
		initC001L010InstallerSolrEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L010InstallerSolrEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L010InstallerSolrEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L010InstallerSolrEnUSGenPage() {

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

		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.htmlBody();

	}

	@Override public void htmlBodyCourtC001L010InstallerSolrEnUSGenPage() {

		c001L010InstallerSolr.htmlBodyCourt();
	}
}
