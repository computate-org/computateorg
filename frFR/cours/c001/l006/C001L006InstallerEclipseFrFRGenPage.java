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
			c.o("Comment installer des outils de développement pour développer mon site web ? ");
		else
			c.o("Comment installer des outils de développement pour développer mon site web ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Comment installer l'IDE Eclipse de manière open source. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L006InstallerEclipse != null)
			c.o("Comment installer des outils de développement pour développer mon site web ? Comment installer l'IDE Eclipse de manière open source. ");
		else
			c.o("Comment installer des outils de développement pour développer mon site web ? Comment installer l'IDE Eclipse de manière open source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/006-comment-installer-eclipse");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/006-how-to-install-eclipse");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Pour montrer à quel point Eclipse est important pour le monde du développement open source, de nombreuses grandes entreprises de technologie ont leurs propres IDE basés sur Eclipse. Notamment Red Hat, IBM, Texas Instruments, Adobe, Node, PHP et bien d'autres. Red Hat® Developer Studio est un environnement de développement intégré (IDE) certifié basé sur Eclipse, qui permet de développer, tester et déployer des applications Web élaborées, des applications Web mobiles, des applications transactionnelles d'entreprise et des microservices. Fidèle à la mission de Red Hat, « aider les entreprises à relever les défis auxquels elles sont confrontées de manière open source, » Red Hat est très impliqué dans Eclipse. Je vous aiderai à installer la version la plus récente d'Eclipse pour développer votre site Web de manière open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/006-comment-installer-eclipse-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1423);
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
		e("script").a("src", statiqueUrlBase, "/js/C001L006InstallerEclipseFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L006InstallerEclipseFrFRGenPage() {

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

		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.htmlBody();

	}

	@Override public void htmlBodyCourtC001L006InstallerEclipseFrFRGenPage() {

		c001L006InstallerEclipse.htmlBodyCourt();
	}
}
