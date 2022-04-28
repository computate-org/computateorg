package org.computate.site.frFR.page.faq;  

import java.util.List;

import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.QuestionReponse;
import org.computate.site.frFR.recherche.ListeRecherche;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/faq
 * ApiUriRechercheEnUSPage: /enUS/faq
 * PageRechercheFrFRPage: PageFaqFrFRPage
 * PageRechercheEnUSPage: PageFaqEnUSPage
 * PageSuperRechercheFrFRPage: ArticleFrFRPage
 * PageSuperRechercheEnUSPage: ArticleEnUSPage
 * 
 * H1.frFR: Avez-vous des questions concernant computate.org ? 
 * H1.enUS: Have some questions about computate.org? 
 * 
 * H2.frFR: computate.org foire aux questions (FAQ). 
 * H2.enUS: computate.org frequently asked questions (FAQ). 
 * 
 * Titre.frFR: Avez-vous des questions concernant computate.org ? computate.org foire aux questions (FAQ). 
 * Titre.enUS: Have some questions about computate.org? computate.org frequently asked questions (FAQ). 
 * 
 * Description.frFR: Avez-vous des questions concernant computate.org ? computate.org foire aux questions (FAQ). 
 * Description.enUS: Have some questions about computate.org? computate.org frequently asked questions (FAQ). 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 365
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 373
 **/
public class PageFaq extends PageFaqGen<Article> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageFaq.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.faq.PageFaq.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaqVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageFaq_H1);
		addPageRecherche_frFR(PageFaq_H2);
		addPageRecherche_frFR(PageFaqVals);
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		c.o(PageFaq_H1 + PageFaq_H2);
	}  

	@Override protected void _pageH1(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I.frFR:fas fa-archway
	 * Val.H3Span.frFR:Pourquoi est votre site traduit en français et anglais ? 
	 * Val.H3Span.enUS:Why is your site in French and English? 
	 * Val.H4I.frFR:fas fa-globe-africa
	 * Val.H4Span.frFR:L'internationalisation est importante et le monde mérite la bonne documentation logicielle. 
	 * Val.H4Span.enUS:Internationalization is important and the world deserves good software documentation. 
	 * Val.PDiv1I:fas fa-comments
	 * Val.PDiv1Span.frFR:J'ai passé quatre ans et demi dans les pays francophones et c'est important pour moi de pratiquer mon français. 
	 * Val.PDiv1Span.enUS:I've spent four and a half years in French speaking countries and it's important for me to practice my French. 
	 * Val.PDiv2I:fas fa-heart-square
	 * Val.PDiv2Span.frFR:J'aime les français et les années que j'ai passé en France, j'aime les Québécois et les années que j'ai passé au Québec. 
	 * Val.PDiv2Span.enUS:I love the French and the time I spent in France, and I love the Québécois and the time I spent in Québec. 
	 * Val.PDiv3I:fas fa-robot
	 * Val.PDiv3Span.frFR:Je connais les défis à créer de bons systèmes logiciels où le pays parle une autre langue que l'anglais. 
	 * Val.PDiv3Span.enUS:I know the challenges building good software systems where the country speaks another language besides English. 
	 * Val.PDiv4I:fas fa-window-restore
	 * Val.PDiv4Span.frFR:Computate.org brise ces barrières et fournit une documentation cohérente en français et en anglais et dans d'autres langues à l'avenir. 
	 * Val.PDiv4Span.enUS:Computate.org breaks those barriers and provides a consistent documentation in French and English and other languages in the future. 
	 */ 
	protected void _i18n(PageHtml o) {
	}

	/**
	 * Val.TableTr1Td1.frFR:Mardi 
	 * Val.TableTr1Td1.enUS:Tuesday 
	 * Val.TableTr1Td2I:fas fa-question
	 * Val.TableTr1Td3I:fas fa-megaphone
	 * Val.TableTr1Td4I:fas fa-pen-nib
	 * Val.TableTr2Td1.frFR:23 Avril 2019
	 * Val.TableTr2Td1.enUS:April 23 2019
	 * Val.TableTr2Td2.frFR:FAQ
	 * Val.TableTr2Td2.enUS:FAQ
	 * Val.TableTr2Td3.frFR:computate.org foire aux questions
	 * Val.TableTr2Td3.enUS:computate.org frequently asked questions
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {     
	}

	/**
	 * 
	 * Val.TableTr1Td1I:fas fa-question
	 * Val.TableTr1Td2.frFR:Questions
	 * Val.TableTr1Td2.enUS:Questions
	 * Val.TableTr1Td3I:fas fa-bullhorn
	 * Val.TableTr1Td4.frFR:Reponses
	 * Val.TableTr1Td4.enUS:Answers
	 * 
	 * Val.TableTr2Td1I:fas fa-archway
	 * Val.TableTr2Td2.frFR:Pourquoi est votre site traduit en français ? 
	 * Val.TableTr2Td2.enUS:Why is your site in French? 
	 * Val.TableTr2Td3I:fas fa-book-spells
	 * Val.TableTr2Td4.frFR:L'internationalisation est importante. 
	 * Val.TableTr2Td4.enUS:Internationalization is important. 
	 */  
	protected void _recapituler3(PageHtml o) {      
	}
}
