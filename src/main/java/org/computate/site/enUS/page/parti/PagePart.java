package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;

public abstract class PagePart extends PagePartGen<Cluster> {

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void  htmlBody() {
		
	}

	public void  htmlBodyCourt() {
		
	}

	protected void _partiVar(Couverture<String> c) {}

	public void  shAvantClasseJavaChamp() {
	}

	public void  shAvantPageParti() {}

	public void  shApresPageParti() {}

	public void  shHtmlAvantPageParti() {}

	public void  shHtmlApresPageParti() {}

	public void  htmlAvantPageParti() {}

	public void  htmlApresPageParti() {}
}
