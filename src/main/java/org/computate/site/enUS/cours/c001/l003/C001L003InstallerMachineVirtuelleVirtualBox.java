package org.computate.site.enUS.cours.c001.l003;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.Cmd;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L003InstallerMachineVirtuelleVirtualBox extends C001L003InstallerMachineVirtuelleVirtualBoxGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(3);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _ecraser(PageHtml o) {      
	}

	protected void _commentInstaller(PageHtml o) {
	}

	protected void _telecharger(PageHtml o) {
	}

	protected void _deplacerDepot(PageHtml o) {
	}

	protected void _yumSearch(PageHtml o) {
	}

	protected void _yumInstallPaquets(PageHtml o) {
	}

	protected void _telechargerIso(PageHtml o) {
	}

	protected void _verifierIso(PageHtml o) {
	}

	protected void _creerMachineVirtuelle(PageHtml o) {
	}

	protected void _erreurKernel(PageHtml o) {
	}

	@Override()
	public void  htmlBodyErreurKernel(PageHtml o) {
		{ e("h3").a("class", " erreurKernelH3 ").f();
			{ e("i").a("class", erreurKernelH3I1, " site-menu-icon erreurKernelH3I ").f();
			} g("i");
			{ e("span").a("class", " erreurKernelH3Span ").f();
				sx(erreurKernelH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " erreurKernelH4 ").f();
			{ e("i").a("class", erreurKernelH4I1, " site-menu-icon erreurKernelH4I ").f();
			} g("i");
			{ e("span").a("class", " erreurKernelH4Span ").f();
				sx(erreurKernelH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " erreurKernelP ").f();
			{ e("span").a("class", " erreurKernelPSpan1 erreurKernelPSpan odd ").f();
				sx(erreurKernelPSpan11);
			} g("span");
		} g("p");
		{ e("div").a("class", " erreurKernelDiv ").a("style", "background-color: #efebe7; padding: 10px; margin: 5px; border: 1px #efebe7; solid; color: black; font-family: arial; font-size: 12px; ").f();
			{ e("p").a("class", " erreurKernelDivP1 erreurKernelDivP odd ").a("style", "font-weight: bold; ").f();
				sx(erreurKernelDivP11);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP2 erreurKernelDivP even ").a("style", "font-weight: bold; ").f();
				sx(erreurKernelDivP21);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP3 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP31);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP4 erreurKernelDivP even ").a("style", "color: #0000ff; ").f();
				sx(erreurKernelDivP41);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP5 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP51);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP6 erreurKernelDivP even ").f();
				sx(erreurKernelDivP61);
			} g("p");
		} g("div");
	}

	protected void _cmdSbinVboxconfig1(PageHtml o) {
	}

	protected void _cmdErreurKernel(PageHtml o) {
	}

	protected void _cmdSbinVboxconfig2(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {      
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
