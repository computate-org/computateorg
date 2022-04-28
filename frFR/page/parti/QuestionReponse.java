package org.computate.site.frFR.page.parti; 

import org.computate.site.frFR.chaine.Chaine;
import org.computate.site.frFR.couverture.Couverture;

public class QuestionReponse extends QuestionReponseGen<PagePart> {  

	protected void _questionIconeType(Couverture<String> c) {
	}

	protected void _questionIconeNom(Couverture<String> c) {
	}

	protected void _reponseIconeType(Couverture<String> c) {
	}

	protected void _reponseIconeNom(Couverture<String> c) {
	}

	public void questionIcone(String type, String nom) {
		setQuestionIconeType(type);
		setQuestionIconeNom(nom);
	}

	public void reponseIcone(String type, String nom) {
		setReponseIconeType(type);
		setReponseIconeNom(nom);
	}

	/**	Le texte de la question. 
	 * indexe: true
	 * stocke: true
	 **/
	protected void _question(Chaine o) { 
	}
	protected void _questionCourt(Chaine o) {
	}

	/**	Le texte de la réponse. 
	 * indexe: true
	 * stocke: true
	 **/
	protected void _reponse(Chaine o) {
	}
	protected void _reponseCourt(Chaine o) {
	}
//
//	protected void _iconeQuestion(Chaine o) {
//	}
//
//	protected void _iconeReponse(Chaine o) {
//	}

	//////////
	// sh //
	//////////

	public void shAvant() {
	}
	public void shMilieu() {
	}
	public void shApres() {
	}
	public void sh() {
		shAvant();
		shMilieu();
		shApres();
	}

	//////////
	// shHtml //
	//////////

	public void shHtmlAvant() {
	}
	public void shHtmlMilieu() {
	}
	public void shHtmlApres() {
	}
	public void shHtml() {
		shHtmlAvant();
		shHtmlMilieu();
		shHtmlApres();
	}

	//////////
	// html //
	//////////

	public void htmlAvant() {
		e("div").f();
			e("div").f();
				e("h3").a("class", "site-questionreponse-h3 ").f();
					if(questionIconeNom != null && questionIconeType != null)
						e("i").a("class", questionIconeType, " fa-", questionIconeNom, " site-menu-icon ").f().g("i");
//					for(Icone icone : question.getIconesAvant()) {
//						icone.htmlBody();
//					}
					e("span").f().sx(question).g("span");
				g("h3");
			g("div");
			e("h4").f();
//				for(Icone icone : reponse.getIconesAvant()) {
//					icone.htmlBody();
//				}
				if(reponseIconeNom != null && reponseIconeType != null)
					e("i").a("class", reponseIconeType, " fa-", reponseIconeNom, " site-menu-icon ").f().g("i");
				e("span").f().sx(reponse).g("span");
			g("h4");
		g("div");
	}
	public void htmlMilieu() {
	}
	public void htmlApres() {
	}
	public void htmlBody() {
		htmlAvant();
		htmlMilieu();
		htmlApres();
	}

	///////////////
	// htmlBodyCourt //
	///////////////

	public void htmlBodyCourt() {
		{ e("div").a("class", "w3-half ").f();
			{ e("div").a("class", "w3-card w3-padding w3-white w3-margin-top w3-margin-right ").a("style", "min-height: 8em; ").f();
				{ e("h3").a("class", "h3 htmlBodyCourt-qa-legend ").f();
					{ e("div").a("class", "").f();
						if(questionIconeNom != null && questionIconeType != null)
							e("i").a("class", questionIconeType, " fa-", questionIconeNom, " site-menu-icon ").f().g("i");
	//						for(Icone icone : question.getIconesAvant()) {
	//							icone.htmlBody();
	//						}
						e("span").f().sx(questionCourt).g("span");
					} g("div");
				} g("h3");
				{ e("h4").a("class", "htmlBodyCourt-qa-h4 ").f();
	//					for(Icone icone : reponse.getIconesAvant()) {
	//						icone.htmlBody();
	//					}
					if(reponseIconeNom != null && reponseIconeType != null)
						e("i").a("class", reponseIconeType, " fa-", reponseIconeNom, " site-menu-icon ").f().g("i");
					e("span").f().sx(reponseCourt).g("span");
				} g("h4");
			} g("div");
		} g("div");
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
