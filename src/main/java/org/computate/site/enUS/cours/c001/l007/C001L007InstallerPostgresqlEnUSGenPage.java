package org.computate.site.enUS.cours.c001.l007;

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
public class C001L007InstallerPostgresqlEnUSGenPage extends C001L007InstallerPostgresqlEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L007InstallerPostgresql(Couverture<C001L007InstallerPostgresql> c) {
		c.o(new C001L007InstallerPostgresql());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L007InstallerPostgresql != null)
			c.o("How do I install the latest version of PostgreSQL. ");
		else
			c.o("How do I install the latest version of PostgreSQL. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Install PostgreSQL from the source code. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L007InstallerPostgresql != null)
			c.o("How do I install the latest version of PostgreSQL. Install PostgreSQL from the source code. ");
		else
			c.o("How do I install the latest version of PostgreSQL. Install PostgreSQL from the source code. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/007-how-to-install-the-latest-version-of-postgresql");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/007-comment-installer-la-derniere-version-de-postgresql");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("When backed by a database, your website does not need to be static content only. You can create users with roles to add content and customize the site. The best part is, the very best database on the planet is PostgreSQL, and it's open source. I will help you install the most recent version of PostgreSQL to develop your website the open source way. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/007-how-to-install-the-latest-version-of-postgresql-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1702);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L007InstallerPostgresqlEnUSGenPage() {
		initC001L007InstallerPostgresqlEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L007InstallerPostgresqlEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L007InstallerPostgresqlEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L007InstallerPostgresqlEnUSGenPage() {

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

		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.htmlBody();

	}

	@Override public void htmlBodyCourtC001L007InstallerPostgresqlEnUSGenPage() {

		c001L007InstallerPostgresql.htmlBodyCourt();
	}
}
