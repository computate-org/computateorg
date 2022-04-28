package org.computate.site.frFR.site;

import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirSystemeExploitation;
import org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox;
import org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7;
import org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven;
import org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipse;
import org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresql;
import org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper;
import org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolr;
import org.computate.site.frFR.page.accueil.PageAccueil;
import org.computate.site.frFR.page.apropos.PageAPropos;
import org.computate.site.frFR.page.faq.PageFaq;

/**
 * Traduire: false
 */
public class SiteIndexer {

	public static void main(String[] args) {  
		SiteIndexer.main();
	}

	public static void main() {  
		PageAccueil.indexer();
		PageAPropos.indexer();
		PageFaq.indexer();
//		C001.indexer();
		C001L001ChoisirNomDomaine.indexer();
		C001L002ChoisirSystemeExploitation.indexer();
		C001L003InstallerMachineVirtuelleVirtualBox.indexer();
		C001L004InstallerCentos7.indexer();
		C001L005InstallerMaven.indexer();
		C001L006InstallerEclipse.indexer();
		C001L007InstallerPostgresql.indexer();
		C001L008CreerCertificat.indexer();
		C001L009InstallerZookeeper.indexer();
		C001L010InstallerSolr.indexer();
	} 
}
