package org.computate.site.frFR.page.parti; 

import org.computate.site.frFR.chaine.Chaine;
import org.computate.site.frFR.ecrivain.ToutEcrivain;

public class PageParagraphe extends PageParagrapheGen<PagePart> {  

	/**	
	 * indexe: true
	 * stocke: true
	 * Le texte de la texte. **/
	protected void _texte(Chaine o) {
	}
	protected void _texteCourt(Chaine o) {
	}
	public PageParagraphe texteIconeAvant(String type, String nom) {
//		ToutEcrivain w = requeteSite_.getW();
//		texte.iconeAvant(w, type, nom);
//		texteCourt.iconeAvant(w, type, nom);
		return this;
	}
	public PageParagraphe texteIconeApres(String type, String nom) {
//		ToutEcrivain w = requeteSite_.getW();
//		texte.iconeApres(w, type, nom);
//		texteCourt.iconeApres(w, type, nom);
		return this;
	}

	//////////
	// sh //
	//////////

	public void sh() {
		shAvant();
		shMilieu();
		shApres();
	}
	public void shAvant() {
	}
	public void shMilieu() {
		ToutEcrivain w = requeteSite_.getW();
		if(texte.pasVide()) {
			w.s("echo ", texte);
		}
	}
	public void shApres() {
	}

	//////////
	// shHtml //
	//////////

	public void shHtml() {
		shHtmlAvant();
		shHtmlApres();
	}
	public void shHtmlAvant() {
		ToutEcrivain w = requeteSite_.getW();
		w.e("p").f();
	}
	public void shHtmlMilieu() {
		ToutEcrivain w = requeteSite_.getW();
		w.sx(texte);
	}
	public void shHtmlApres() {
		ToutEcrivain w = requeteSite_.getW();
		w.g("p");
	}

	//////////
	// html //
	//////////


	public void htmlBody() {
		ToutEcrivain w = requeteSite_.getW();
		w.e("p").f();
		for(Icone icone : texte.getIconesAvant()) {
			icone.htmlBody();
		}
		w.sx(texte);
		w.g("p");
	}

	public void htmlAvant() {
	}
	public void htmlApres() {
	}

	///////////////
	// htmlBodyCourt //
	///////////////

	public void htmlBodyCourt() {
//		ToutEcrivain w = requeteSite_.getW();
//		w.e("div").a("class", "w3-card ").f();
//			w.e("fieldset").a("class", "htmlBodyCourt-qa-fieldset ").f();
//				w.e("legend").a("class", "h3 htmlBodyCourt-qa-legend ").f();
//					w.e("div").a("class", "").f();
//						for(Icone icone : texte.getIconesAvant()) {
//							icone.htmlBody();
//						}
//						w.e("span").f().sx(texteCourt).g("span");
//					w.g("div");
//				w.g("legend");
//			w.g("fieldset");
//		w.g("div");
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
