package org.computate.site.frFR.cours.c001.l008;

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
public class C001L008CreerCertificatFrFRGenPage extends C001L008CreerCertificatFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L008CreerCertificat(Couverture<C001L008CreerCertificat> c) {
		c.o(new C001L008CreerCertificat());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L008CreerCertificat != null)
			c.o("Que puis-je faire une fois que j'ai acheté un nom de domaine ? ");
		else
			c.o("Que puis-je faire une fois que j'ai acheté un nom de domaine ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L008CreerCertificat != null)
			c.o("Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ");
		else
			c.o("Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/008-how-to-obtain-free-tls-certificates");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. Avec un certificat vous pouvez sécuriser les communications vers votre site. Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1152);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L008CreerCertificatFrFRGenPage() {
		initC001L008CreerCertificatFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L008CreerCertificatFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L008CreerCertificatFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L008CreerCertificatFrFRGenPage() {

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

	@Override public void htmlBodyCourtC001L008CreerCertificatFrFRGenPage() {

		c001L008CreerCertificat.htmlBodyCourt();
	}
}
