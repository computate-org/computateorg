package org.computate.site.enUS.cours.c001.l003;

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
public class C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage extends C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L003InstallerMachineVirtuelleVirtualBox(Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c) {
		c.o(new C001L003InstallerMachineVirtuelleVirtualBox());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c.o("How do I try CentOS 7 Linux without replacing my operating system? ");
		else
			c.o("How do I try CentOS 7 Linux without replacing my operating system? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Try CentOS 7 on a VirtualBox virtual machine. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c.o("How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. ");
		else
			c.o("How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1253);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
		initC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {

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

		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.htmlBody();

	}

	@Override public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {

		c001L003InstallerMachineVirtuelleVirtualBox.htmlBodyCourt();
	}
}
