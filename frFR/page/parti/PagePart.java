package org.computate.site.frFR.page.parti; 

import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;

/**
 * MotCle: classeNomSimplePagePart
 */
public abstract class PagePart extends PagePartGen<Cluster> {

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void htmlBody() {
		
	}
	public void htmlBodyCourt() {
		
	}

	protected void _partiVar(Couverture<String> c) {}

	public void shAvantClasseJavaChamp() {
	}

	public void shAvantPageParti() {}
	public void shApresPageParti() {}
	public void shHtmlAvantPageParti() {}
	public void shHtmlApresPageParti() {}
	public void htmlAvantPageParti() {}
	public void htmlApresPageParti() {}
//
//	public void shCmd() {
//		if(requeteSite.pageAchete) {
//			page_.tabLigne(0, "if [ \"$1\" == \"p\" ]; then");
////			page.tabLigne(1, "figlet -f smmono9 '", nomSimple.toString().replace("'", "'\"'\"'"), "'; read");
//			page_.tabLigne(0, "else");
//			page_.tabLigne(1, "if [ \"$1\" == \"p\" ]; then");
//			page_.tabLigne(0, "fi");
//		}
//	}
}
