package org.computate.site.frFR.cours.c001.l003;

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
public class C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage extends C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L003InstallerMachineVirtuelleVirtualBox(Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c) {
		c.o(new C001L003InstallerMachineVirtuelleVirtualBox());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c.o("Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? ");
		else
			c.o("Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Essayez CentOS 7 sur une machine virtuelle VirtualBox. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c.o("Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? Essayez CentOS 7 sur une machine virtuelle VirtualBox. ");
		else
			c.o("Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? Essayez CentOS 7 sur une machine virtuelle VirtualBox. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? Essayez CentOS 7 sur une machine virtuelle VirtualBox. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1258);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
		initC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {

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

	@Override public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {

		c001L003InstallerMachineVirtuelleVirtualBox.htmlBodyCourt();
	}
}
