package org.computate.site.enUS.cours.c001.l001;

import java.lang.String;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.MiseEnPage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


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
			c.o("a lesson");
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
		e("script").a("src", "/static/js/C001L001ChoisirNomDomaineEnUSGenPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L001ChoisirNomDomaineEnUSGenPage() {

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
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
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				c001L001ChoisirNomDomaine.htmlBody();

			} g("div");
	}
}
