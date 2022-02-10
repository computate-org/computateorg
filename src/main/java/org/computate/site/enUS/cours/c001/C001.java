package org.computate.site.enUS.cours.c001;

import java.util.List;
import org.computate.site.enUS.cours.Cours;
import org.computate.site.site.enUS.couverture.Couverture;

public class C001 extends C001Gen<Cours> {

	public static void  main(String[] args) {  
		indexer(); 
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.C001.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.C001.C001_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.C001.C001_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001EnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001FrFRPage_Uri);
	}

	public void  htmlBody() {
		super.htmlBody();
	}
}
