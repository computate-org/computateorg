package org.computate.site.enUS.cours.c001.l008;

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
public class C001L008CreerCertificatEnUSGenPage extends C001L008CreerCertificatEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L008CreerCertificat(Couverture<C001L008CreerCertificat> c) {
		c.o(new C001L008CreerCertificat());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L008CreerCertificat != null)
			c.o("What can I do once I have purchased a domain name? ");
		else
			c.o("What can I do once I have purchased a domain name? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Obtain a valid TLS certificate for free, for security and credibility. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L008CreerCertificat != null)
			c.o("Obtain a valid TLS certificate for free, for security and credibility. ");
		else
			c.o("Obtain a valid TLS certificate for free, for security and credibility. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/008-how-to-obtain-free-tls-certificates");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("First, congratulations on obtaining your own domain name to launch your site. Along with a domain name, you will also want to obtain a TLS certificate. The good news is that it is completely free, thanks to open source technology. With a certificate you can secure communications to your site. You can sign your code and ensure that it is valid when deployed on the cloud. You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1111);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L008CreerCertificatEnUSGenPage() {
		initC001L008CreerCertificatEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L008CreerCertificatEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L008CreerCertificatEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L008CreerCertificatEnUSGenPage() {

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

		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.htmlBody();

	}

	@Override public void htmlBodyCourtC001L008CreerCertificatEnUSGenPage() {

		c001L008CreerCertificat.htmlBodyCourt();
	}
}
