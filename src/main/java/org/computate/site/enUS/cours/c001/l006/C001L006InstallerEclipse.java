package org.computate.site.enUS.cours.c001.l006;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L006InstallerEclipse extends C001L006InstallerEclipseGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(6);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L006InstallerEclipse.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipseVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L006InstallerEclipse_H1);
		addPageRecherche_frFR(C001L006InstallerEclipse_H2);
		addPageRecherche_frFR(C001L006InstallerEclipseVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrc(PageHtml o) {
	}

	protected void _questionMkdirEclipse(PageHtml o) {
	}

	protected void _questionClonerSource(PageHtml o) {
	}

	protected void _questionListerTags(PageHtml o) {
	}

	protected void _questionCheckoutTag(PageHtml o) {
	}

	protected void _questionSousModules(PageHtml o) {
	}

	protected void _questionConstruireSource(PageHtml o) {
	}

	protected void _questionErreur(PageHtml o) {
	}

	protected void _questionCopierSource(PageHtml o) {
	}

	protected void _questionSauvegardeRemplacer(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
