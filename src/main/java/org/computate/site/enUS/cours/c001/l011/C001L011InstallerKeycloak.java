package org.computate.site.enUS.cours.c001.l011;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L011InstallerKeycloak extends C001L011InstallerKeycloakGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(11);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L011InstallerKeycloak.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloak_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloak_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloakVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L011InstallerKeycloak_H1);
		addPageRecherche_frFR(C001L011InstallerKeycloak_H2);
		addPageRecherche_frFR(C001L011InstallerKeycloakVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _keycloakVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("4.8.3");
//		else
//			c.o(utilisateurSite.getKeycloakVersion());
	}

	protected void _keycloakPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10380);
//		else
//			c.o(utilisateurSite.getKeycloakPortClient());
	}

	protected void _keycloakTag(Couverture<String> c) {
		c.o(keycloakVersion + ".Final");
	}

	protected void _keycloakConfigset(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("computate");
//		else
//			c.o(utilisateurSite.getKeycloakConfigset());
	}

	protected void _keycloakCollection(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("site");
//		else
//			c.o(utilisateurSite.getKeycloakCollection());
	}

	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}

	@Override()
	public void  htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
//		if(utilisateurSite != null) {
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakPortClientForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakPortClient").a("class", "").f().sx("port client de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "port client de Keycloak")
//							.a("class", "setKeycloakPortClient w3-input w3-border ")
//							.a("name", "setKeycloakPortClient")
//							.a("id", "Page_keycloakPortClient")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakPortClientForm')); ")
//							.a("value", strKeycloakPortClient())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakVersionForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakVersion").a("class", "").f().sx("version de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "version de Keycloak")
//							.a("class", "setKeycloakVersion w3-input w3-border ")
//							.a("name", "setKeycloakVersion")
//							.a("id", "Page_keycloakVersion")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakVersionForm')); ")
//							.a("value", strKeycloakVersion())
//						.fg();
//	
//					} g("form");
//				} g("div");
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakPortClientForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakPortClient").a("class", "").f().sx("port client de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "port client de Keycloak")
//							.a("class", "setKeycloakPortClient w3-input w3-border ")
//							.a("name", "setKeycloakPortClient")
//							.a("id", "Page_keycloakPortClient")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakPortClientForm')); ")
//							.a("value", strKeycloakPortClient())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakConfigsetForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakConfigset").a("class", "").f().sx("Configset Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "Configset Keycloak")
//							.a("class", "setKeycloakConfigset w3-input w3-border ")
//							.a("name", "setKeycloakConfigset")
//							.a("id", "Page_keycloakConfigset")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakConfigsetForm')); ")
//							.a("value", strKeycloakConfigset())
//						.fg();
//	
//					} g("form");
//				} g("div");
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakCollectionForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakCollection").a("class", "").f().sx("Collection Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "Collection Keycloak")
//							.a("class", "setKeycloakCollection w3-input w3-border ")
//							.a("name", "setKeycloakCollection")
//							.a("id", "Page_keycloakCollection")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakCollectionForm')); ")
//							.a("value", strKeycloakCollection())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrc(PageHtml o) {
	}

	protected void _questionClonerSource(PageHtml o) {
	}

	protected void _questionListerTags(PageHtml o) {
	}

	protected void _questionCheckoutTag(PageHtml o) {
	}

	protected void _questionConstruireSource(PageHtml o) {
	}

	protected void _questionMkdirServeur(PageHtml o) {
	}

	protected void _questionConfigurer(PageHtml o) {
	}

	protected void _questionConfigurerConfigset(PageHtml o) {
	}

	protected void _questionConfigsetKeycloak(PageHtml o) {
	}

	protected void _questionService(PageHtml o) {
	}

	protected void _questionSystemctlDaemonReload(PageHtml o) {
	}

	protected void _questionSystemctlEnable(PageHtml o) {
	}

	protected void _questionSystemctlStart(PageHtml o) {
	}

	protected void _questionSystemctlStatus(PageHtml o) {
	}

	protected void _questionCollectionsKeycloak(PageHtml o) {
	}

	protected void _questionLiens(PageHtml o) {
	}

	@Override()
	public void  htmlBodyQuestionLiens(PageHtml o) {
		String urlBase = "http://localhost:" + keycloakPortClient;
		{ e("h3").a("class", " questionLiensH3 ").f();
			{ e("i").a("class", questionLiensH3I1, " site-menu-icon questionLiensH3I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH3Span ").f();
				sx(questionLiensH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionLiensH4 ").f();
			{ e("i").a("class", questionLiensH4I1, " site-menu-icon questionLiensH4I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH4Span ").f();
				sx(questionLiensH4Span1);
			} g("span");
		} g("h4");
		{ e("ul").a("class", " questionLiensUl ").f();
			{ e("li").a("class", " questionLiensUlLi1 questionLiensUlLi odd ").f();
				{ e("a").a("class", " questionLiensUlLi1A ").a("href", urlBase, "/keycloak/#/").f();
					sx(urlBase, "/keycloak/#/");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi1Span ").f();
					sx(questionLiensUlLi1Span1);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionLiensUlLi2 questionLiensUlLi even ").f();
				{ e("a").a("class", " questionLiensUlLi2A ").a("href", urlBase + "/keycloak/#/", keycloakCollection, "/query").f();
					sx(urlBase + "/keycloak/#/", keycloakCollection, "/query");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi2Span ").f();
					sx(questionLiensUlLi2Span1);
				} g("span");
			} g("li");
		} g("ul");
	}

	protected void _recapituler1(PageHtml o) {      
	}

	@Override()
	public void  htmlBodyRecapituler1(PageHtml o) {
		g("div");
		super.htmlBodyRecapituler1(o);
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
