package org.computate.site.enUS.cours.c001.l009;

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
public class C001L009InstallerZookeeperEnUSGenPage extends C001L009InstallerZookeeperEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L009InstallerZookeeper(Couverture<C001L009InstallerZookeeper> c) {
		c.o(new C001L009InstallerZookeeper());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L009InstallerZookeeper != null)
			c.o("How do I try out clustered configuration, requests, events and shared data sources in development? ");
		else
			c.o("How do I try out clustered configuration, requests, events and shared data sources in development? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Install Zookeeper from the source code. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L009InstallerZookeeper != null)
			c.o("How do I try out clustered configuration, requests, events and shared data sources in development? ");
		else
			c.o("How do I try out clustered configuration, requests, events and shared data sources in development? ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("A web application that is built to scale should be built using a centralized cluster manager like Zookeper. There is a lot of work that has gone into Zookeeper that fix the bugs and race conditions that are inevitable in distributed applications. You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. I will help you install the most recent version of Zookeeper to scale your website the open source way. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1981);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L009InstallerZookeeperEnUSGenPage() {
		initC001L009InstallerZookeeperEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L009InstallerZookeeperEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L009InstallerZookeeperEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L009InstallerZookeeperEnUSGenPage() {

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

	@Override public void htmlBodyCourtC001L009InstallerZookeeperEnUSGenPage() {

		c001L009InstallerZookeeper.htmlBodyCourt();
	}
}
