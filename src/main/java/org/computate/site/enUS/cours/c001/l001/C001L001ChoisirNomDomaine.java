package org.computate.site.enUS.cours.c001.l001;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L001ChoisirNomDomaine extends C001L001ChoisirNomDomaineGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(1);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L001ChoisirNomDomaine.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaine_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaine_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaineVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L001ChoisirNomDomaine_H1);
		addPageRecherche_frFR(C001L001ChoisirNomDomaine_H2);
		addPageRecherche_frFR(C001L001ChoisirNomDomaineVals);
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _intro(PageHtml o) {
	}

	protected void _moi(PageHtml o) {
	}

	protected void _aLAvance(PageHtml o) {      
	}

	protected void _acheter(PageHtml o) {      
	}

	protected void _appeler(PageHtml o) {      
	}

	protected void _apres1(PageHtml o) {      
	}

	protected void _apres2(PageHtml o) {      
	}

	public void  htmlBodyApres2() { 
	}

	protected void _apres3(PageHtml o) {      
	}

	protected void _apres4(PageHtml o) {      
	}

	protected void _apres5(PageHtml o) {      
	}

	protected void _plusTard(QuestionReponse o) {      
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {      
	}

	protected void _recapituler3(PageHtml o) {      
	}

	protected void _leconRecherche_frFR(List<String> l) {
		
	}

	protected void _leconRecherche_enUS(List<String> l) {
		
	}
}
