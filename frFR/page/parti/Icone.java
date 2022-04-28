package org.computate.site.frFR.page.parti;   

import org.computate.site.frFR.chaine.Chaine;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;

public class Icone extends IconeGen<PagePart> {  

	protected void _type(Chaine o) {
	}
	protected void _nom(Chaine o) {
	}

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void htmlBody() {
	}

	@Override
	public void htmlBodyCourt() {
		// TODO Auto-generated method stub
		
	}

	//////////
	// code //
	//////////

	public void codeAvant() { 
	}
	public void codeMilieu() {
	}
	public void codeApres() {
	}
	public void code() {
		codeAvant();
		codeMilieu();
		codeApres();
	}
}
