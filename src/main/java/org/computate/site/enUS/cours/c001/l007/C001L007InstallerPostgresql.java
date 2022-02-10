package org.computate.site.enUS.cours.c001.l007;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001L007InstallerPostgresql extends C001L007InstallerPostgresqlGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(7);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L007InstallerPostgresql.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L007InstallerPostgresql_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.C001L007InstallerPostgresql_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L007InstallerPostgresql_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.C001L007InstallerPostgresql_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L007InstallerPostgresqlEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L007InstallerPostgresqlFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L007InstallerPostgresqlEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L007InstallerPostgresqlFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.C001L007InstallerPostgresql_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.C001L007InstallerPostgresql_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresql.C001L007InstallerPostgresqlVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L007InstallerPostgresql_H1);
		addPageRecherche_frFR(C001L007InstallerPostgresql_H2);
		addPageRecherche_frFR(C001L007InstallerPostgresqlVals);
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

	protected void _questionMkdirPostgreSQL(PageHtml o) {
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

	protected void _questionDonnees(PageHtml o) {
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

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
