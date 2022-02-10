package org.computate.site.enUS.cours.c001.l004;

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
public class C001L004InstallerCentos7EnUSGenPage extends C001L004InstallerCentos7EnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L004InstallerCentos7(Couverture<C001L004InstallerCentos7> c) {
		c.o(new C001L004InstallerCentos7());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L004InstallerCentos7 != null)
			c.o("How do I install the operating system to start developing my website? ");
		else
			c.o("How do I install the operating system to start developing my website? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Every step to install the CentOS 7 operating system. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L004InstallerCentos7 != null)
			c.o("How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. ");
		else
			c.o("How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/004-how-to-install-centos7");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/004-comment-installer-centos7");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/004-how-to-install-centos7-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1479);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L004InstallerCentos7EnUSGenPage() {
		initC001L004InstallerCentos7EnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L004InstallerCentos7EnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L004InstallerCentos7EnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L004InstallerCentos7EnUSGenPage() {

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

		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.htmlBody();

	}

	@Override public void htmlBodyCourtC001L004InstallerCentos7EnUSGenPage() {

		c001L004InstallerCentos7.htmlBodyCourt();
	}
}
