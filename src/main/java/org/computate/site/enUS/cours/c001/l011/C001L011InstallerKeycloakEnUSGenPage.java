package org.computate.site.enUS.cours.c001.l011;

import java.lang.String;
import java.lang.Integer;
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
public class C001L011InstallerKeycloakEnUSGenPage extends C001L011InstallerKeycloakEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L011InstallerKeycloak(Couverture<C001L011InstallerKeycloak> c) {
		c.o(new C001L011InstallerKeycloak());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L011InstallerKeycloak != null)
			c.o("How do I try out some user management software for single sign on applications? ");
		else
			c.o("How do I try out some user management software for single sign on applications? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Install Keycloak from the source code. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L011InstallerKeycloak != null)
			c.o("Description.frFR:");
		else
			c.o("Description.frFR:");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("PageSimple: true");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak-999.png");
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

	@Override public void initLoinC001L011InstallerKeycloakEnUSGenPage() {
		initC001L011InstallerKeycloakEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L011InstallerKeycloakEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L011InstallerKeycloakEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L011InstallerKeycloakEnUSGenPage() {

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

		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.htmlBody();

	}

	@Override public void htmlBodyCourtC001L011InstallerKeycloakEnUSGenPage() {

		c001L011InstallerKeycloak.htmlBodyCourt();
	}
}
