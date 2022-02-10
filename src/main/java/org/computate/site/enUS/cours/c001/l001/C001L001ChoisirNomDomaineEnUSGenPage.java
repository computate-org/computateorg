package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.QuestionReponse;
import java.util.List;
import java.lang.String;
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


/**
 * Traduire: false
 **/
public class C001L001ChoisirNomDomaineEnUSGenPage extends C001L001ChoisirNomDomaineEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L001ChoisirNomDomaine(Couverture<C001L001ChoisirNomDomaine> c) {
		c.o(new C001L001ChoisirNomDomaine());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("What is the first step to creating my own website? ");
		else
			c.o("What is the first step to creating my own website? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Choose a domain name. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("What is the first step to creating my own website? Choose a domain name. ");
		else
			c.o("What is the first step to creating my own website? Choose a domain name. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/001-choose-domain-name");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/001-choisir-nom-domaine");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("What is the first step to creating my own website? Choose a domain name. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/001-choose-domain-name-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(781);
	}

	@Override protected void _pageVideoId(Couverture<String> c) {
			c.o("sBcDnQj9_QM");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001L001ChoisirNomDomaineEnUSGenPage() {
		initC001L001ChoisirNomDomaineEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L001ChoisirNomDomaineEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L001ChoisirNomDomaineEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L001ChoisirNomDomaineEnUSGenPage() {

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
		{ e("div").a("class", "site-video-box ").f();
			e("iframe").a("class", "site-video-embed ").a("width", "560").a("height", "315").a("src", pageVideoUrlEmbed).a("frameborder", "0").a("allow", "autoplay; encrypted-media").a("allowfullscreen", "").f().g("iframe");
		} g("div");

		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.htmlBody();

	}

	@Override public void htmlBodyCourtC001L001ChoisirNomDomaineEnUSGenPage() {

		c001L001ChoisirNomDomaine.htmlBodyCourt();
	}
}
