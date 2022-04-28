package org.computate.site.frFR.page.apropos;  

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
 * ApiUriRechercheFrFRPage: /frFR/apropos
 * ApiUriRechercheEnUSPage: /enUS/about
 * PageRechercheFrFRPage: PageAProposFrFRPage
 * PageRechercheEnUSPage: PageAProposEnUSPage
 * PageSuperRechercheFrFRPage: ArticleFrFRPage
 * PageSuperRechercheEnUSPage: ArticleEnUSPage
 * 
 * H1.frFR: Qui est Christopher Tate ? 
 * H1.enUS: Who is Christopher Tate? 
 * 
 * H2.frFR: Tout à propos de moi. 
 * H2.enUS: All about me. 
 * 
 * Titre.frFR: Qui est Christopher Tate ? Tout à propos de moi. 
 * Titre.enUS: Who is Christopher Tate? All about me. 
 * 
 * Description.frFR: Qui est Christopher Tate ? Tout à propos de moi. 
 * Description.enUS: Who is Christopher Tate? All about me. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: male
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 820
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 641
*/ 
public class PageAPropos extends PageAProposGen<Article> {   

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageAPropos.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.apropos.PageAPropos.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAProposVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAPropos_H1);
		addPageRecherche_frFR(PageAPropos_H2);
		addPageRecherche_frFR(PageAProposVals);
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		c.o(PageAPropos_H1 + PageAPropos_H2);
	}  

	@Override protected void _pageH1(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o(PageAPropos_H2);
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
	 * Val.H3I:fas fa-location
	 * Val.H3Span.frFR:D'où venez-vous ? 
	 * Val.H3Span.enUS:Where are you from? 
	 * Val.H4I:fas fa-globe-americas
	 * Val.H4Span.frFR:Je suis un Américain d'Utah (qui adore se balader). 
	 * Val.H4Span.enUS:I am from Utah (and a wanderer at heart). 
	 * Val.PDiv1I:fas fa-mountains
	 * Val.PDiv1Span.frFR:J'aime faire de la randonnée dans des montagnes avec ma famille. 
	 * Val.PDiv1Span.enUS:I love spending time in the great outdoors with my family. 
	 * Val.PDiv2I:fas fa-globe-africa
	 * Val.PDiv2Span.frFR:J'ai aussi vécu en Floride, en Idaho, en Ontario, au Québec et en France.
	 * Val.PDiv2Span.enUS:I've also lived in Florida, Idaho, Ontario, Quebec and France. 
	 * Val.PDiv3I:fas fa-heart-square
	 * Val.PDiv3Span.frFR:J'adore le temps que j'ai vécu et travaillé dans d'autres pays et la manière dont les logiciels open source rapprochent le monde.
	 * Val.PDiv3Span.enUS:I love the time I lived and worked in other countries, and the ways open source software brings the world together. 
	 * Val.PDiv4I:fas fa-robot
	 * Val.PDiv4Span.frFR:Je connais les défis à créer de bons systèmes logiciels où le pays parle une autre langue que l'anglais. 
	 * Val.PDiv4Span.enUS:I know the challenges of building good software systems in non-English speaking countries. 
	 */ 
	protected void _ouVenezVous(PageHtml o) {
	}
	public void htmlBodyOuVenezVous(PageHtml o) { 
		e("p").f();
			e("div").a("class", "w3-row w3-mobile ").f();
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho-winter.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho-winter.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains2.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains2.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/quebec.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/quebec.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/france.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/france.jpg").fg();
					g("a");
				g("div");
			g("div");
		g("p");
		super.htmlBodyOuVenezVous(o);
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-book
	 * Val.H3Span.frFR:Comment vous avez appris l'informatique ? 
	 * Val.H3Span.enUS:How did you learn computer programming? 
	 * Val.H4I:fas fa-save
	 * Val.H4Span.frFR:Une passion pour les ordinateurs toute ma vie. 
	 * Val.H4Span.enUS:A love for computers all my life. 
	 * Val.PDiv1I:fas fa-male
	 * Val.PDiv1Span.frFR:Tant que je connaissais mon père, il était programmeur de bases de données Lotus Notes. 
	 * Val.PDiv1Span.enUS:My dad has been a Lotus Notes database programmer as long as I can remember. 
	 * Val.PDiv2I:fas fa-window-alt
	 * Val.PDiv2Span.frFR:Il avait toujours à la maison, un bon ordinateur avec la dernière suite Microsoft à la maison.
	 * Val.PDiv2Span.enUS:He always had a nice computer with the latest Microsoft suite at home for the family to use. 
	 * Val.PDiv3I:fas fa-keyboard
	 * Val.PDiv3Span.frFR:Je passais des heures, chaque jour, à imaginer tout ce que je pouvais faire sur l'ordinateur.
	 * Val.PDiv3Span.enUS:I spent hours every day figuring out everything I could possibly do on the computer. 
	 * Val.PDiv4I:fas fa-folders
	 * Val.PDiv4Span.frFR:Chaque appli, chaque répertoire, chaque fichier, chaque élément de menu, chaque raccourci clavier, je les connais bien.
	 * Val.PDiv4Span.enUS:I became familiar with every application, every directory, every file, every menu item, every keyboard shortcut. 
	 * Val.PDiv5I:fas fa-database
	 * Val.PDiv5Span.frFR:J'ai posé à mon père de nombreuses questions importantes, comme comment écrire du code? Comment créer une base de données?
	 * Val.PDiv5Span.enUS:I asked my dad many important questions, like: "how do I write code?" "How do I make a database?" 
	 * Val.PDiv6I:fas fa-book-spells
	 * Val.PDiv6Span.frFR:J'ai reçu un grand manuel Visual Basic et il m'a indiqué Microsoft Access.
	 * Val.PDiv6Span.enUS:I was then gifted a large Visual Basic manual, and he pointed me to Microsoft Access. 
	 */ 
	protected void _informatique(PageHtml o) {
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-briefcase
	 * Val.H3Span.frFR:Comment avez-vous commencé à travailler en tant que programmeur en informatique ? 
	 * Val.H3Span.enUS:How did you start working as a computer programmer? 
	 * Val.H4I:fas fa-rocket
	 * Val.H4Span.frFR:J'avais la poussée de terminer chaque projet et d’être à la prochaine occasion de faire évoluer ma carrière. 
	 * Val.H4Span.enUS:I had the drive to finish each project, and be at the next opportunity to grow my career. 
	 * Val.PDiv1I:fas fa-calculator
	 * Val.PDiv1Span.frFR:J'ai commencé à écrire des programmes et des jeux sur ma calculatrice TI-86.
	 * Val.PDiv1Span.enUS:I started writing calculator programs and games on my TI-86 calculator. 
	 * Val.PDiv2I:fas fa-university
	 * Val.PDiv2Span.frFR:Je savais, à partir de l'université, que j'étudierais l'informatique.
	 * Val.PDiv2Span.enUS:I went on to study Computer Science at University. 
	 * Val.PDiv3I:fas fa-hands-helping
	 * Val.PDiv3Span.frFR:Au même temps, je suis devenu informaticien à temps partiel pour une société humanitaire locale, faisant mon mieux à résoudre des problèmes mondiaux avec une bases de données.
	 * Val.PDiv3Span.enUS:At the same time, I became the part time computer guy for a local humanitarian organization, doing my best to solve world problems with databases. 
	 * Val.PDiv4I:fas fa-building
	 * Val.PDiv4Span.frFR:Après avoir obtenu mon diplôme en Informatique, j'ai commencé en tant que consultant en logiciels; j'ai travaillé sur de nombreux projets passionnants dans de grandes entreprises.
	 * Val.PDiv4Span.enUS:After graduation, I started as a Software Consultant and worked on many exciting projects at large companies. 
	 * Val.PDiv5I:fas fa-flag-alt
	 * Val.PDiv5Span.frFR:Après 5 ans, j'ai chercher un travail en France, où j'ai travaillé avec une très petite société spécialisée dans les technologies de recherche open source, notamment Lucene.
	 * Val.PDiv5Span.enUS:After 5 years, I had the opportunity to take a job in France, where I worked with a tiny company, which specialized in open source search technology, specifically Lucene. 
	 * Val.PDiv6I:fab fa-linux
	 * Val.PDiv6Span.frFR:Et ensuite, dans une entreprise de formation Linux en Utah, où je me suis familiarisé avec les principes de l'origine de Linux.
	 * Val.PDiv6Span.enUS:I then worked with a Linux training company in Utah where I became very familiar with the whys of the origin of Linux. 
	 * Val.PDiv7I:fab fa-redhat
	 * Val.PDiv7Span.frFR:Mon amour pour le conseil, mon expérience, et le fait d'être au bon endroit au bon moment m'ont ensuite conduit à Red Hat.
	 * Val.PDiv7Span.enUS:My love for consulting, my experience, and being at the right place at the right time then led me to Red Hat. 
	 * Val.PDiv8I:fas fa-laugh-beam
	 * Val.PDiv8Span.frFR:J'ai enfin trouvé mes collegues similaires ici chez Red Hat, et je suis là pour rester.
	 * Val.PDiv8Span.enUS:I have found my people, at long last, here at Red Hat and I am here to stay. 
	 */ 
	protected void _emploi(PageHtml o) {
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-heart
	 * Val.H3Span.frFR:Comment êtes-vous devenu si passionné par l'open source? 
	 * Val.H3Span.enUS:How did you become so passionate about open source? 
	 * Val.H4I:fas fa-dove
	 * Val.H4Span.frFR:J'aime la liberté de construire sur la merveille. 
	 * Val.H4Span.enUS:I love the freedom to build upon greatness. 
	 * Val.PDiv1I:fas fa-hat-wizard
	 * Val.PDiv1Span.frFR:J'ai rencontré mon premier ordinateur Linux au laboratoire d'informatique Linux à l'Université, où je pensais que seuls les nobles magiciens de la programmation informatique vivaient et dormaient. 
	 * Val.PDiv1Span.enUS:I met my first Linux computer at the University Linux computer lab, where I figured only the noble wizards of computer programming lived and slept. 
	 * Val.PDiv2I:fas fa-laptop
	 * Val.PDiv2Span.frFR:Au même temps, mon cousin utilisé Linux et m'a encouragé à l'essayer moi-même. 
	 * Val.PDiv2Span.enUS:Around the same time, my cousin introduced me to Linux, and gave me some encouragement to try it myself. 
	 * Val.PDiv3I:fas fa-strikethrough
	 * Val.PDiv3Span.frFR:Une nuit, après avoir réalisé que Microsoft et le .NET Framework m'abandonnaient après l'obtention de mon diplôme avec des frais exorbitants, j'ai changé. 
	 * Val.PDiv3Span.enUS:One night, after realizing that Microsoft and the .NET Framework would forsake me after graduation with exorbitant fees, I made the switch. 
	 * Val.PDiv4I:fas fa-save
	 * Val.PDiv4Span.frFR:J'ai sauvegardé ma vie numérique sur un disque zip coûteux de la librairie, installé Ubuntu Linux et effacé Microsoft de ma vie personnelle pour toujours. 
	 * Val.PDiv4Span.enUS:I backed up my digital life on an expensive zip disk from the bookstore and installed Ubuntu Linux, wiping Microsoft out of my personal life forever. 
	 * Val.PDiv5I:fas fa-arrow-alt-square-right
	 * Val.PDiv5Span.frFR:Je n'ai jamais regardé en arrière et jamais regretté cette décision. 
	 * Val.PDiv5Span.enUS:I never looked back, and never regretted that decision. 
	 */ 
	protected void _opensource(PageHtml o) {
	}

	/**
	 * Val.TableTr1Td1.frFR:Mardi 
	 * Val.TableTr1Td1.enUS:Tuesday 
	 * Val.TableTr1Td2I:fas fa-male
	 * Val.TableTr1Td3I:fas fa-images
	 * Val.TableTr1Td4I:fas fa-pen-nib
	 * Val.TableTr2Td1.frFR:23 Avril 2019
	 * Val.TableTr2Td1.enUS:April 23 2019
	 * Val.TableTr2Td2.frFR:Qui est Christopher Tate ? 
	 * Val.TableTr2Td2.enUS:Who is Christopher Tate? 
	 * Val.TableTr2Td3.frFR:Tout à propos de moi. 
	 * Val.TableTr2Td3.enUS:All about me. 
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
	 * Val.TableTr2Td1I:fas fa-location
	 * Val.TableTr2Td2.frFR:D'où venez-vous ? 
	 * Val.TableTr2Td2.enUS:Where are you from? 
	 * Val.TableTr2Td3I:fas fa-globe-americas
	 * Val.TableTr2Td4.frFR:Je suis un Américain d'Utah (qui adore se balader). 
	 * Val.TableTr2Td4.enUS:I am from Utah (and a wanderer at heart). 
	 * 
	 * Val.TableTr3Td1I:fas fa-book
	 * Val.TableTr3Td2.frFR:Comment vous avez appris l'informatique ? 
	 * Val.TableTr3Td2.enUS:How did you learn computer programming? 
	 * Val.TableTr3Td3I:fas fa-save
	 * Val.TableTr3Td4.frFR:Une passion pour les ordinateurs toute ma vie. 
	 * Val.TableTr3Td4.enUS:A love for computers all my life. 
	 * 
	 * Val.TableTr4Td1I:fas fa-briefcase
	 * Val.TableTr4Td2.frFR:Comment avez-vous commencé en informatique ? 
	 * Val.TableTr4Td2.enUS:How did you start working as a programmer? 
	 * Val.TableTr4Td3I:fas fa-rocket
	 * Val.TableTr4Td4.frFR:D’être à la prochaine occasion de faire évoluer ma carrière. 
	 * Val.TableTr4Td4.enUS:Be at the next opportunity to grow my career. 
	 * 
	 * Val.TableTr5Td1I:fas fa-heart
	 * Val.TableTr5Td2.frFR:Comment êtes-vous devenu si passionné par l'open source? 
	 * Val.TableTr5Td2.enUS:How did you become so passionate about open source? 
	 * Val.TableTr5Td3I:fas fa-dove
	 * Val.TableTr5Td4.frFR:J'aime la liberté de construire sur la merveille. 
	 * Val.TableTr5Td4.enUS:I love the freedom to build upon greatness. 
	 */  
	protected void _recapituler3(PageHtml o) {      
	}
}
