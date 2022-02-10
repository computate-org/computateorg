package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.site.enUS.chaine.Chaine;
import org.computate.site.site.enUS.couverture.Couverture;

public class Icone extends IconeGen<PagePart> {

	protected void _type(Chaine o) {
	}

	protected void _nom(Chaine o) {
	}

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void  htmlBody() {
	}

	@Override()
	public void  htmlBodyCourt() {
		// TODO Auto-generated method stub
		
	}

	public void  codeAvant() { 
	}

	public void  codeMilieu() {
	}

	public void  codeApres() {
	}

	public void  code() {
		codeAvant();
		codeMilieu();
		codeApres();
	}
}
