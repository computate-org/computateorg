package org.computate.site.frFR.cours.c001.l009;

import java.lang.String;
import java.lang.Integer;
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
public class C001L009InstallerZookeeperFrFRGenPage extends C001L009InstallerZookeeperFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L009InstallerZookeeper(Couverture<C001L009InstallerZookeeper> c) {
		c.o(new C001L009InstallerZookeeper());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L009InstallerZookeeper != null)
			c.o("Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? ");
		else
			c.o("Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Installer Zookeeper à partir du code source. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L009InstallerZookeeper != null)
			c.o("Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? Installer Zookeeper à partir du code source. ");
		else
			c.o("Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? Installer Zookeeper à partir du code source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. Zookeeper a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. Je vous aiderai à installer la version la plus récente de Zookeeper pour mettre à l'échelle votre site Web de manière open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1523);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L009InstallerZookeeperFrFRGenPage() {
		initC001L009InstallerZookeeperFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L009InstallerZookeeperFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L009InstallerZookeeperFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L009InstallerZookeeperFrFRGenPage() {

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

		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.htmlBody();

	}

	@Override public void htmlBodyCourtC001L009InstallerZookeeperFrFRGenPage() {

		c001L009InstallerZookeeper.htmlBodyCourt();
	}
}
