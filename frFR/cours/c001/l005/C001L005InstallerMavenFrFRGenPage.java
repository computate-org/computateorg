package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
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
public class C001L005InstallerMavenFrFRGenPage extends C001L005InstallerMavenFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L005InstallerMaven(Couverture<C001L005InstallerMaven> c) {
		c.o(new C001L005InstallerMaven());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L005InstallerMaven != null)
			c.o("Comment installer la dernière version de maven ? ");
		else
			c.o("Comment installer la dernière version de maven ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Installer maven à partir du code source. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L005InstallerMaven != null)
			c.o("Comment installer la dernière version de maven ? Installer maven à partir du code source. ");
		else
			c.o("Comment installer la dernière version de maven ? Installer maven à partir du code source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/004-how-to-install-the-latest-version-of-maven");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("La plupart des entreprises utilisent aujourd'hui Java pour créer leurs applications et microservices, y compris les gouvernements, les banques, la comptabilité et les entreprises. La création d’applications Java commence par l’installation de Maven. La version par défaut de Maven sur votre distribution Linux est peut être obsolète pour installer certains logiciels open source. Je vous aiderai à installer la version la plus récente de Maven pour développer votre site Web de manière open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1470);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L005InstallerMavenFrFRGenPage() {
		initC001L005InstallerMavenFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L005InstallerMavenFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L005InstallerMavenFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L005InstallerMavenFrFRGenPage() {

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

		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.htmlBody();

	}

	@Override public void htmlBodyCourtC001L005InstallerMavenFrFRGenPage() {

		c001L005InstallerMaven.htmlBodyCourt();
	}
}
