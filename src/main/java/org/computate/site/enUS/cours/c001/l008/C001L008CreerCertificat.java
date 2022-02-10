package org.computate.site.enUS.cours.c001.l008;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L008CreerCertificat extends C001L008CreerCertificatGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(8);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L008CreerCertificat.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificatVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L008CreerCertificat_H1);
		addPageRecherche_frFR(C001L008CreerCertificat_H2);
		addPageRecherche_frFR(C001L008CreerCertificatVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}

	@Override()
	public void  htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
		if(utilisateurSite != null) {
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "siteNomDomaineForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_siteNomDomaine").a("class", "").f().sx("nom de domaine").g("label");
	
					e("input")
						.a("type", "text")
						.a("placeholder", "nom de domaine")
						.a("title", "Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. ")
						.a("class", "setSiteNomDomaine w3-input w3-border ")
						.a("name", "setSiteNomDomaine")
						.a("id", "Page_siteNomDomaine")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#siteNomDomaineForm')); ")
						.a("value", utilisateurSite.strSiteNomDomaine())
					.fg();
	
				} g("form");
			} g("div");
		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrv(PageHtml o) {
	}

	protected void _questionCertbot(PageHtml o) {
	}

	protected void _questionCopier(PageHtml o) {
	}

	protected void _questionRacineCa(PageHtml o) {
	}

	protected void _questionCertificatsFusionnes(PageHtml o) {
	}

	protected void _questionPkcs12(PageHtml o) {
	}

	protected void _questionKeystore(PageHtml o) {
	}

	protected void _questionGenSecKey(PageHtml o) {
	}

	protected void _fin(PageHtml o) {
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
