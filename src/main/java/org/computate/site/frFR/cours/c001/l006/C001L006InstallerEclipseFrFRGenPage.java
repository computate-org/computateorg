package org.computate.site.frFR.cours.c001.l006;

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
public class C001L006InstallerEclipseFrFRGenPage extends C001L006InstallerEclipseFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L006InstallerEclipse(Couverture<C001L006InstallerEclipse> c) {
		c.o(new C001L006InstallerEclipse());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L006InstallerEclipse != null)
			c.o("Comment installer des outils de développement pour développer mon site web ?");
		else
			c.o("Comment installer des outils de développement pour développer mon site web ?");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Comment installer l'IDE Eclipse de manière open source. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L006InstallerEclipse != null)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/004-comment-installer-eclipse");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/004-how-to-install-eclipse");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/004-comment-installer-eclipse-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1749);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L006InstallerEclipseFrFRGenPage() {
		initC001L006InstallerEclipseFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L006InstallerEclipseFrFRGenPage() {
		e("script").a("src", "/static/js/C001L006InstallerEclipseFrFRGenPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L006InstallerEclipseFrFRGenPage() {

		if(pageH1 != null) {
			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx(pageH1).g("span");
			} g("h1");
		}
		if(pageH2 != null) {
			{ e("h2").f();
				e("span").a("class", " ").f().sx(pageH2).g("span");
			} g("h2");
		}
		if(pageH3 != null) {
			{ e("h3").f();
				e("span").a("class", " ").f().sx(pageH3).g("span");
			} g("h3");
		}

		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.htmlBody();

	}

	@Override public void htmlBodyCourtC001L006InstallerEclipseFrFRGenPage() {

		c001L006InstallerEclipse.htmlBodyCourt();
	}
}
