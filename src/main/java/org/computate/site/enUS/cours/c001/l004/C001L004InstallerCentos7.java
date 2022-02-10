package org.computate.site.enUS.cours.c001.l004;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L004InstallerCentos7 extends C001L004InstallerCentos7Gen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L004InstallerCentos7.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7Vals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L004InstallerCentos7_H1);
		addPageRecherche_frFR(C001L004InstallerCentos7_H2);
		addPageRecherche_frFR(C001L004InstallerCentos7Vals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _questionTelechargerCentos7(PageHtml o) {
	}

	protected void _questionCreerUneCleUsb(PageHtml o) {
	}

	protected void _questionDemarrerSystemSurCleUsb(PageHtml o) {
	}

	protected void _questionChoisirLangue(PageHtml o) {
	}

	protected void _questionDateHeure(PageHtml o) {
	}

	protected void _questionReseau(PageHtml o) {
	}

	protected void _questionSelectionLogiciel(PageHtml o) {
	}

	protected void _questionInstallationDestination(PageHtml o) {
	}

	protected void _questionInstaller(PageHtml o) {
	}

	protected void _questionMotsDePasse(PageHtml o) {
	}

	protected void _questionConfigurationInitiale(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
