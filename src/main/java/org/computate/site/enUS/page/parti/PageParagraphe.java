package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.chaine.Chaine;
import org.computate.site.enUS.ecrivain.ToutEcrivain;

public class PageParagraphe extends PageParagrapheGen<PagePart> {

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

	public void  sh() {
		shAvant();
		shMilieu();
		shApres();
	}

	public void  shAvant() {
	}

	public void  shMilieu() {
		ToutEcrivain w = requeteSite_.getW();
		if(texte.pasVide()) {
			w.s("echo ", texte);
		}
	}

	public void  shApres() {
	}

	public void  shHtml() {
		shHtmlAvant();
		shHtmlApres();
	}

	public void  shHtmlAvant() {
		ToutEcrivain w = requeteSite_.getW();
		w.e("p").f();
	}

	public void  shHtmlMilieu() {
		ToutEcrivain w = requeteSite_.getW();
		w.sx(texte);
	}

	public void  shHtmlApres() {
		ToutEcrivain w = requeteSite_.getW();
		w.g("p");
	}

	public void  htmlBody() {
		ToutEcrivain w = requeteSite_.getW();
		w.e("p").f();
		for(Icone icone : texte.getIconesAvant()) {
			icone.htmlBody();
		}
		w.sx(texte);
		w.g("p");
	}

	public void  htmlBodyCourt() {
		ToutEcrivain w = requeteSite_.getW();
		w.e("div").a("class", "w3-card ").f();
			w.e("fieldset").a("class", "htmlBodyCourt-qa-fieldset ").f();
				w.e("legend").a("class", "h3 htmlBodyCourt-qa-legend ").f();
					w.e("div").a("class", "").f();
						for(Icone icone : texte.getIconesAvant()) {
							icone.htmlBody();
						}
						w.e("span").f().sx(texteCourt).g("span");
					w.g("div");
				w.g("legend");
			w.g("fieldset");
		w.g("div");
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
