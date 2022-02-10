package org.computate.site.enUS.page.apropos;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposGen<DEV> extends Article {

	public static final String PageAPropos_H1 = "Who is Christopher Tate? ";
	public static final String PageAPropos_H2 = "All about me. ";
	public static final String PageAPropos_Titre = "Who is Christopher Tate? All about me. ";
	public static final String PageAPropos_Couleur = "green";
	public static final String PageAPropos_IconeGroupe = "regular";
	public static final String PageAPropos_IconeNom = "male";
	public static final String PageAProposFrFRPage_Uri = "/frFR/apropos";
	public static final String PageAProposFrFRPage_ImageUri = "/png/frFR/apropos-999.png";
	public static final String PageAProposEnUSPage_Uri = "/enUS/about";
	public static final String PageAProposEnUSPage_ImageUri = "/png/enUS/about-999.png";

	//////////////////
	// listeArticle //
	//////////////////

	/**	L'entité « listeArticle »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 */
	protected ListeRecherche<Article> listeArticle = new ListeRecherche<Article>();
	public Couverture<ListeRecherche<Article>> listeArticleCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("listeArticle").o(listeArticle);

	/**	<br/>L'entité « listeArticle »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
	 * <br/>
	 * @param listeArticle est l'entité déjà construit. 
	 **/
	protected abstract void _listeArticle(ListeRecherche<Article> o);

	public ListeRecherche<Article> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ListeRecherche<Article> listeArticle) {
		this.listeArticle = listeArticle;
		this.listeArticleCouverture.dejaInitialise = true;
	}
	protected PageAPropos listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}

	/////////////////
	// ouVenezVous //
	/////////////////

	public static final String ouVenezVousH3I1 = "fas fa-location";
	public static final String ouVenezVousH3I = ouVenezVousH3I1;
	public static final String ouVenezVousH3Span1 = "Where are you from? ";
	public static final String ouVenezVousH3Span = ouVenezVousH3Span1;
	public static final String ouVenezVousH4I1 = "fas fa-globe-americas";
	public static final String ouVenezVousH4I = ouVenezVousH4I1;
	public static final String ouVenezVousH4Span1 = "I am from Utah (and a wanderer at heart). ";
	public static final String ouVenezVousH4Span = ouVenezVousH4Span1;
	public static final String ouVenezVousPDiv1I1 = "fas fa-mountains";
	public static final String ouVenezVousPDiv1I = ouVenezVousPDiv1I1;
	public static final String ouVenezVousPDiv1Span1 = "I love spending time in the great outdoors with my family. ";
	public static final String ouVenezVousPDiv1Span = ouVenezVousPDiv1Span1;
	public static final String ouVenezVousPDiv2I1 = "fas fa-globe-africa";
	public static final String ouVenezVousPDiv2I = ouVenezVousPDiv2I1;
	public static final String ouVenezVousPDiv2Span1 = "I've also lived in Florida, Idaho, Ontario, Quebec and France. ";
	public static final String ouVenezVousPDiv2Span = ouVenezVousPDiv2Span1;
	public static final String ouVenezVousPDiv3I1 = "fas fa-heart-square";
	public static final String ouVenezVousPDiv3I = ouVenezVousPDiv3I1;
	public static final String ouVenezVousPDiv3Span1 = "I love the time I lived and worked in other countries, and the ways open source software brings the world together. ";
	public static final String ouVenezVousPDiv3Span = ouVenezVousPDiv3Span1;
	public static final String ouVenezVousPDiv4I1 = "fas fa-robot";
	public static final String ouVenezVousPDiv4I = ouVenezVousPDiv4I1;
	public static final String ouVenezVousPDiv4Span1 = "I know the challenges of building good software systems in non-English speaking countries. ";
	public static final String ouVenezVousPDiv4Span = ouVenezVousPDiv4Span1;

	/**	L'entité « ouVenezVous »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml ouVenezVous = new PageHtml();
	public Couverture<PageHtml> ouVenezVousCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("ouVenezVous").o(ouVenezVous);

	/**	<br/>L'entité « ouVenezVous »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:ouVenezVous">Trouver l'entité ouVenezVous dans Solr</a>
	 * <br/>
	 * @param ouVenezVous est l'entité déjà construit. 
	 **/
	protected abstract void _ouVenezVous(PageHtml o);

	public PageHtml getOuVenezVous() {
		return ouVenezVous;
	}

	public void setOuVenezVous(PageHtml ouVenezVous) {
		this.ouVenezVous = ouVenezVous;
		this.ouVenezVousCouverture.dejaInitialise = true;
	}
	protected PageAPropos ouVenezVousInit() {
		if(ouVenezVous != null) {
			((PageAPropos)this).avantPagePart(ouVenezVous, "ouVenezVous");
			((PageAPropos)this).avantPagePart(ouVenezVous, "ouVenezVous");
		}
		if(!ouVenezVousCouverture.dejaInitialise) {
			_ouVenezVous(ouVenezVous);
		}
		ouVenezVous.initLoinPourClasse(requeteSite_);
		ouVenezVousCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyOuVenezVous(PageHtml o) {
		{ e("h3").a("class", " ouVenezVousH3 ").f();
			{ e("i").a("class", ouVenezVousH3I1, " site-menu-icon ouVenezVousH3I ").f();
			} g("i");
			{ e("span").a("class", " ouVenezVousH3Span ").f();
				sx(ouVenezVousH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " ouVenezVousH4 ").f();
			{ e("i").a("class", ouVenezVousH4I1, " site-menu-icon ouVenezVousH4I ").f();
			} g("i");
			{ e("span").a("class", " ouVenezVousH4Span ").f();
				sx(ouVenezVousH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " ouVenezVousP ").f();
			{ e("div").a("class", " ouVenezVousPDiv1 ouVenezVousPDiv odd ").f();
				{ e("i").a("class", ouVenezVousPDiv1I1, " site-menu-icon ouVenezVousPDiv1I ").f();
				} g("i");
				{ e("span").a("class", " ouVenezVousPDiv1Span ").f();
					sx(ouVenezVousPDiv1Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " ouVenezVousPDiv2 ouVenezVousPDiv even ").f();
				{ e("i").a("class", ouVenezVousPDiv2I1, " site-menu-icon ouVenezVousPDiv2I ").f();
				} g("i");
				{ e("span").a("class", " ouVenezVousPDiv2Span ").f();
					sx(ouVenezVousPDiv2Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " ouVenezVousPDiv3 ouVenezVousPDiv odd ").f();
				{ e("i").a("class", ouVenezVousPDiv3I1, " site-menu-icon ouVenezVousPDiv3I ").f();
				} g("i");
				{ e("span").a("class", " ouVenezVousPDiv3Span ").f();
					sx(ouVenezVousPDiv3Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " ouVenezVousPDiv4 ouVenezVousPDiv even ").f();
				{ e("i").a("class", ouVenezVousPDiv4I1, " site-menu-icon ouVenezVousPDiv4I ").f();
				} g("i");
				{ e("span").a("class", " ouVenezVousPDiv4Span ").f();
					sx(ouVenezVousPDiv4Span1);
				} g("span");
			} g("div");
		} g("p");
	}
	public void htmlBodyOuVenezVous() {
		ouVenezVous.htmlAvant();
		htmlBodyOuVenezVous(ouVenezVous);
		ouVenezVous.htmlApres();
	}

	//////////////////
	// informatique //
	//////////////////

	public static final String informatiqueH3I1 = "fas fa-book";
	public static final String informatiqueH3I = informatiqueH3I1;
	public static final String informatiqueH3Span1 = "How did you learn computer programming? ";
	public static final String informatiqueH3Span = informatiqueH3Span1;
	public static final String informatiqueH4I1 = "fas fa-save";
	public static final String informatiqueH4I = informatiqueH4I1;
	public static final String informatiqueH4Span1 = "A love for computers all my life. ";
	public static final String informatiqueH4Span = informatiqueH4Span1;
	public static final String informatiquePDiv1I1 = "fas fa-male";
	public static final String informatiquePDiv1I = informatiquePDiv1I1;
	public static final String informatiquePDiv1Span1 = "My dad has been a Lotus Notes database programmer as long as I can remember. ";
	public static final String informatiquePDiv1Span = informatiquePDiv1Span1;
	public static final String informatiquePDiv2I1 = "fas fa-window-alt";
	public static final String informatiquePDiv2I = informatiquePDiv2I1;
	public static final String informatiquePDiv2Span1 = "He always had a nice computer with the latest Microsoft suite at home for the family to use. ";
	public static final String informatiquePDiv2Span = informatiquePDiv2Span1;
	public static final String informatiquePDiv3I1 = "fas fa-keyboard";
	public static final String informatiquePDiv3I = informatiquePDiv3I1;
	public static final String informatiquePDiv3Span1 = "I spent hours every day figuring out everything I could possibly do on the computer. ";
	public static final String informatiquePDiv3Span = informatiquePDiv3Span1;
	public static final String informatiquePDiv4I1 = "fas fa-folders";
	public static final String informatiquePDiv4I = informatiquePDiv4I1;
	public static final String informatiquePDiv4Span1 = "I became familiar with every application, every directory, every file, every menu item, every keyboard shortcut. ";
	public static final String informatiquePDiv4Span = informatiquePDiv4Span1;
	public static final String informatiquePDiv5I1 = "fas fa-database";
	public static final String informatiquePDiv5I = informatiquePDiv5I1;
	public static final String informatiquePDiv5Span1 = "I asked my dad many important questions, like: \"how do I write code?\" \"How do I make a database?\" ";
	public static final String informatiquePDiv5Span = informatiquePDiv5Span1;
	public static final String informatiquePDiv6I1 = "fas fa-book-spells";
	public static final String informatiquePDiv6I = informatiquePDiv6I1;
	public static final String informatiquePDiv6Span1 = "I was then gifted a large Visual Basic manual, and he pointed me to Microsoft Access. ";
	public static final String informatiquePDiv6Span = informatiquePDiv6Span1;

	/**	L'entité « informatique »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml informatique = new PageHtml();
	public Couverture<PageHtml> informatiqueCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("informatique").o(informatique);

	/**	<br/>L'entité « informatique »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:informatique">Trouver l'entité informatique dans Solr</a>
	 * <br/>
	 * @param informatique est l'entité déjà construit. 
	 **/
	protected abstract void _informatique(PageHtml o);

	public PageHtml getInformatique() {
		return informatique;
	}

	public void setInformatique(PageHtml informatique) {
		this.informatique = informatique;
		this.informatiqueCouverture.dejaInitialise = true;
	}
	protected PageAPropos informatiqueInit() {
		if(informatique != null) {
			((PageAPropos)this).avantPagePart(informatique, "informatique");
			((PageAPropos)this).avantPagePart(informatique, "informatique");
		}
		if(!informatiqueCouverture.dejaInitialise) {
			_informatique(informatique);
		}
		informatique.initLoinPourClasse(requeteSite_);
		informatiqueCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyInformatique(PageHtml o) {
		{ e("h3").a("class", " informatiqueH3 ").f();
			{ e("i").a("class", informatiqueH3I1, " site-menu-icon informatiqueH3I ").f();
			} g("i");
			{ e("span").a("class", " informatiqueH3Span ").f();
				sx(informatiqueH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " informatiqueH4 ").f();
			{ e("i").a("class", informatiqueH4I1, " site-menu-icon informatiqueH4I ").f();
			} g("i");
			{ e("span").a("class", " informatiqueH4Span ").f();
				sx(informatiqueH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " informatiqueP ").f();
			{ e("div").a("class", " informatiquePDiv1 informatiquePDiv odd ").f();
				{ e("i").a("class", informatiquePDiv1I1, " site-menu-icon informatiquePDiv1I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv1Span ").f();
					sx(informatiquePDiv1Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " informatiquePDiv2 informatiquePDiv even ").f();
				{ e("i").a("class", informatiquePDiv2I1, " site-menu-icon informatiquePDiv2I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv2Span ").f();
					sx(informatiquePDiv2Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " informatiquePDiv3 informatiquePDiv odd ").f();
				{ e("i").a("class", informatiquePDiv3I1, " site-menu-icon informatiquePDiv3I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv3Span ").f();
					sx(informatiquePDiv3Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " informatiquePDiv4 informatiquePDiv even ").f();
				{ e("i").a("class", informatiquePDiv4I1, " site-menu-icon informatiquePDiv4I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv4Span ").f();
					sx(informatiquePDiv4Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " informatiquePDiv5 informatiquePDiv odd ").f();
				{ e("i").a("class", informatiquePDiv5I1, " site-menu-icon informatiquePDiv5I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv5Span ").f();
					sx(informatiquePDiv5Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " informatiquePDiv6 informatiquePDiv even ").f();
				{ e("i").a("class", informatiquePDiv6I1, " site-menu-icon informatiquePDiv6I ").f();
				} g("i");
				{ e("span").a("class", " informatiquePDiv6Span ").f();
					sx(informatiquePDiv6Span1);
				} g("span");
			} g("div");
		} g("p");
	}
	public void htmlBodyInformatique() {
		informatique.htmlAvant();
		htmlBodyInformatique(informatique);
		informatique.htmlApres();
	}

	////////////
	// emploi //
	////////////

	public static final String emploiH3I1 = "fas fa-briefcase";
	public static final String emploiH3I = emploiH3I1;
	public static final String emploiH3Span1 = "How did you start working as a computer programmer? ";
	public static final String emploiH3Span = emploiH3Span1;
	public static final String emploiH4I1 = "fas fa-rocket";
	public static final String emploiH4I = emploiH4I1;
	public static final String emploiH4Span1 = "I had the drive to finish each project, and be at the next opportunity to grow my career. ";
	public static final String emploiH4Span = emploiH4Span1;
	public static final String emploiPDiv1I1 = "fas fa-calculator";
	public static final String emploiPDiv1I = emploiPDiv1I1;
	public static final String emploiPDiv1Span1 = "I started writing calculator programs and games on my TI-86 calculator. ";
	public static final String emploiPDiv1Span = emploiPDiv1Span1;
	public static final String emploiPDiv2I1 = "fas fa-university";
	public static final String emploiPDiv2I = emploiPDiv2I1;
	public static final String emploiPDiv2Span1 = "I went on to study Computer Science at University. ";
	public static final String emploiPDiv2Span = emploiPDiv2Span1;
	public static final String emploiPDiv3I1 = "fas fa-hands-helping";
	public static final String emploiPDiv3I = emploiPDiv3I1;
	public static final String emploiPDiv3Span1 = "At the same time, I became the part time computer guy for a local humanitarian organization, doing my best to solve world problems with databases. ";
	public static final String emploiPDiv3Span = emploiPDiv3Span1;
	public static final String emploiPDiv4I1 = "fas fa-building";
	public static final String emploiPDiv4I = emploiPDiv4I1;
	public static final String emploiPDiv4Span1 = "After graduation, I started as a Software Consultant and worked on many exciting projects at large companies. ";
	public static final String emploiPDiv4Span = emploiPDiv4Span1;
	public static final String emploiPDiv5I1 = "fas fa-flag-alt";
	public static final String emploiPDiv5I = emploiPDiv5I1;
	public static final String emploiPDiv5Span1 = "After 5 years, I had the opportunity to take a job in France, where I worked with a tiny company, which specialized in open source search technology, specifically Lucene. ";
	public static final String emploiPDiv5Span = emploiPDiv5Span1;
	public static final String emploiPDiv6I1 = "fab fa-linux";
	public static final String emploiPDiv6I = emploiPDiv6I1;
	public static final String emploiPDiv6Span1 = "I then worked with a Linux training company in Utah where I became very familiar with the whys of the origin of Linux. ";
	public static final String emploiPDiv6Span = emploiPDiv6Span1;
	public static final String emploiPDiv7I1 = "fab fa-redhat";
	public static final String emploiPDiv7I = emploiPDiv7I1;
	public static final String emploiPDiv7Span1 = "My love for consulting, my experience, and being at the right place at the right time then led me to Red Hat. ";
	public static final String emploiPDiv7Span = emploiPDiv7Span1;
	public static final String emploiPDiv8I1 = "fas fa-laugh-beam";
	public static final String emploiPDiv8I = emploiPDiv8I1;
	public static final String emploiPDiv8Span1 = "I have found my people, at long last, here at Red Hat and I am here to stay. ";
	public static final String emploiPDiv8Span = emploiPDiv8Span1;

	/**	L'entité « emploi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml emploi = new PageHtml();
	public Couverture<PageHtml> emploiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("emploi").o(emploi);

	/**	<br/>L'entité « emploi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:emploi">Trouver l'entité emploi dans Solr</a>
	 * <br/>
	 * @param emploi est l'entité déjà construit. 
	 **/
	protected abstract void _emploi(PageHtml o);

	public PageHtml getEmploi() {
		return emploi;
	}

	public void setEmploi(PageHtml emploi) {
		this.emploi = emploi;
		this.emploiCouverture.dejaInitialise = true;
	}
	protected PageAPropos emploiInit() {
		if(emploi != null) {
			((PageAPropos)this).avantPagePart(emploi, "emploi");
			((PageAPropos)this).avantPagePart(emploi, "emploi");
		}
		if(!emploiCouverture.dejaInitialise) {
			_emploi(emploi);
		}
		emploi.initLoinPourClasse(requeteSite_);
		emploiCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyEmploi(PageHtml o) {
		{ e("h3").a("class", " emploiH3 ").f();
			{ e("i").a("class", emploiH3I1, " site-menu-icon emploiH3I ").f();
			} g("i");
			{ e("span").a("class", " emploiH3Span ").f();
				sx(emploiH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " emploiH4 ").f();
			{ e("i").a("class", emploiH4I1, " site-menu-icon emploiH4I ").f();
			} g("i");
			{ e("span").a("class", " emploiH4Span ").f();
				sx(emploiH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " emploiP ").f();
			{ e("div").a("class", " emploiPDiv1 emploiPDiv odd ").f();
				{ e("i").a("class", emploiPDiv1I1, " site-menu-icon emploiPDiv1I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv1Span ").f();
					sx(emploiPDiv1Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv2 emploiPDiv even ").f();
				{ e("i").a("class", emploiPDiv2I1, " site-menu-icon emploiPDiv2I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv2Span ").f();
					sx(emploiPDiv2Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv3 emploiPDiv odd ").f();
				{ e("i").a("class", emploiPDiv3I1, " site-menu-icon emploiPDiv3I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv3Span ").f();
					sx(emploiPDiv3Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv4 emploiPDiv even ").f();
				{ e("i").a("class", emploiPDiv4I1, " site-menu-icon emploiPDiv4I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv4Span ").f();
					sx(emploiPDiv4Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv5 emploiPDiv odd ").f();
				{ e("i").a("class", emploiPDiv5I1, " site-menu-icon emploiPDiv5I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv5Span ").f();
					sx(emploiPDiv5Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv6 emploiPDiv even ").f();
				{ e("i").a("class", emploiPDiv6I1, " site-menu-icon emploiPDiv6I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv6Span ").f();
					sx(emploiPDiv6Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv7 emploiPDiv odd ").f();
				{ e("i").a("class", emploiPDiv7I1, " site-menu-icon emploiPDiv7I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv7Span ").f();
					sx(emploiPDiv7Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " emploiPDiv8 emploiPDiv even ").f();
				{ e("i").a("class", emploiPDiv8I1, " site-menu-icon emploiPDiv8I ").f();
				} g("i");
				{ e("span").a("class", " emploiPDiv8Span ").f();
					sx(emploiPDiv8Span1);
				} g("span");
			} g("div");
		} g("p");
	}
	public void htmlBodyEmploi() {
		emploi.htmlAvant();
		htmlBodyEmploi(emploi);
		emploi.htmlApres();
	}

	////////////////
	// opensource //
	////////////////

	public static final String opensourceH3I1 = "fas fa-heart";
	public static final String opensourceH3I = opensourceH3I1;
	public static final String opensourceH3Span1 = "How did you become so passionate about open source? ";
	public static final String opensourceH3Span = opensourceH3Span1;
	public static final String opensourceH4I1 = "fas fa-dove";
	public static final String opensourceH4I = opensourceH4I1;
	public static final String opensourceH4Span1 = "I love the freedom to build upon greatness. ";
	public static final String opensourceH4Span = opensourceH4Span1;
	public static final String opensourcePDiv1I1 = "fas fa-hat-wizard";
	public static final String opensourcePDiv1I = opensourcePDiv1I1;
	public static final String opensourcePDiv1Span1 = "I met my first Linux computer at the University Linux computer lab, where I figured only the noble wizards of computer programming lived and slept. ";
	public static final String opensourcePDiv1Span = opensourcePDiv1Span1;
	public static final String opensourcePDiv2I1 = "fas fa-laptop";
	public static final String opensourcePDiv2I = opensourcePDiv2I1;
	public static final String opensourcePDiv2Span1 = "Around the same time, my cousin introduced me to Linux, and gave me some encouragement to try it myself. ";
	public static final String opensourcePDiv2Span = opensourcePDiv2Span1;
	public static final String opensourcePDiv3I1 = "fas fa-strikethrough";
	public static final String opensourcePDiv3I = opensourcePDiv3I1;
	public static final String opensourcePDiv3Span1 = "One night, after realizing that Microsoft and the .NET Framework would forsake me after graduation with exorbitant fees, I made the switch. ";
	public static final String opensourcePDiv3Span = opensourcePDiv3Span1;
	public static final String opensourcePDiv4I1 = "fas fa-save";
	public static final String opensourcePDiv4I = opensourcePDiv4I1;
	public static final String opensourcePDiv4Span1 = "I backed up my digital life on an expensive zip disk from the bookstore and installed Ubuntu Linux, wiping Microsoft out of my personal life forever. ";
	public static final String opensourcePDiv4Span = opensourcePDiv4Span1;
	public static final String opensourcePDiv5I1 = "fas fa-arrow-alt-square-right";
	public static final String opensourcePDiv5I = opensourcePDiv5I1;
	public static final String opensourcePDiv5Span1 = "I never looked back, and never regretted that decision. ";
	public static final String opensourcePDiv5Span = opensourcePDiv5Span1;

	/**	L'entité « opensource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml opensource = new PageHtml();
	public Couverture<PageHtml> opensourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("opensource").o(opensource);

	/**	<br/>L'entité « opensource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:opensource">Trouver l'entité opensource dans Solr</a>
	 * <br/>
	 * @param opensource est l'entité déjà construit. 
	 **/
	protected abstract void _opensource(PageHtml o);

	public PageHtml getOpensource() {
		return opensource;
	}

	public void setOpensource(PageHtml opensource) {
		this.opensource = opensource;
		this.opensourceCouverture.dejaInitialise = true;
	}
	protected PageAPropos opensourceInit() {
		if(opensource != null) {
			((PageAPropos)this).avantPagePart(opensource, "opensource");
			((PageAPropos)this).avantPagePart(opensource, "opensource");
		}
		if(!opensourceCouverture.dejaInitialise) {
			_opensource(opensource);
		}
		opensource.initLoinPourClasse(requeteSite_);
		opensourceCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyOpensource(PageHtml o) {
		{ e("h3").a("class", " opensourceH3 ").f();
			{ e("i").a("class", opensourceH3I1, " site-menu-icon opensourceH3I ").f();
			} g("i");
			{ e("span").a("class", " opensourceH3Span ").f();
				sx(opensourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " opensourceH4 ").f();
			{ e("i").a("class", opensourceH4I1, " site-menu-icon opensourceH4I ").f();
			} g("i");
			{ e("span").a("class", " opensourceH4Span ").f();
				sx(opensourceH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " opensourceP ").f();
			{ e("div").a("class", " opensourcePDiv1 opensourcePDiv odd ").f();
				{ e("i").a("class", opensourcePDiv1I1, " site-menu-icon opensourcePDiv1I ").f();
				} g("i");
				{ e("span").a("class", " opensourcePDiv1Span ").f();
					sx(opensourcePDiv1Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " opensourcePDiv2 opensourcePDiv even ").f();
				{ e("i").a("class", opensourcePDiv2I1, " site-menu-icon opensourcePDiv2I ").f();
				} g("i");
				{ e("span").a("class", " opensourcePDiv2Span ").f();
					sx(opensourcePDiv2Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " opensourcePDiv3 opensourcePDiv odd ").f();
				{ e("i").a("class", opensourcePDiv3I1, " site-menu-icon opensourcePDiv3I ").f();
				} g("i");
				{ e("span").a("class", " opensourcePDiv3Span ").f();
					sx(opensourcePDiv3Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " opensourcePDiv4 opensourcePDiv even ").f();
				{ e("i").a("class", opensourcePDiv4I1, " site-menu-icon opensourcePDiv4I ").f();
				} g("i");
				{ e("span").a("class", " opensourcePDiv4Span ").f();
					sx(opensourcePDiv4Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " opensourcePDiv5 opensourcePDiv odd ").f();
				{ e("i").a("class", opensourcePDiv5I1, " site-menu-icon opensourcePDiv5I ").f();
				} g("i");
				{ e("span").a("class", " opensourcePDiv5Span ").f();
					sx(opensourcePDiv5Span1);
				} g("span");
			} g("div");
		} g("p");
	}
	public void htmlBodyOpensource() {
		opensource.htmlAvant();
		htmlBodyOpensource(opensource);
		opensource.htmlApres();
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11 = "Tuesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fas fa-male";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "fas fa-images";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 23 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "Who is Christopher Tate? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "All about me. ";
	public static final String recapituler2TableTr2Td3 = recapituler2TableTr2Td31;
	public static final String recapituler2TableTr2Td41 = "By Christopher Tate";
	public static final String recapituler2TableTr2Td4 = recapituler2TableTr2Td41;

	/**	L'entité « recapituler2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler2 = new PageHtml();
	public Couverture<PageHtml> recapituler2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler2").o(recapituler2);

	/**	<br/>L'entité « recapituler2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
	 * <br/>
	 * @param recapituler2 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler2(PageHtml o);

	public PageHtml getRecapituler2() {
		return recapituler2;
	}

	public void setRecapituler2(PageHtml recapituler2) {
		this.recapituler2 = recapituler2;
		this.recapituler2Couverture.dejaInitialise = true;
	}
	protected PageAPropos recapituler2Init() {
		if(recapituler2 != null) {
			((PageAPropos)this).avantPagePart(recapituler2, "recapituler2");
			((PageAPropos)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyRecapituler2(PageHtml o) {
		{ e("table").a("class", " recapituler2Table ").f();
			{ e("tr").a("class", " recapituler2TableTr1 recapituler2TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td1 recapituler2TableTr1Td odd ").f();
					sx(recapituler2TableTr1Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td2 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td2I1, " site-menu-icon recapituler2TableTr1Td2I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td3 recapituler2TableTr1Td odd ").f();
					{ e("i").a("class", recapituler2TableTr1Td3I1, " site-menu-icon recapituler2TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td4 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td4I1, " site-menu-icon recapituler2TableTr1Td4I ").f();
					} g("i");
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler2TableTr2 recapituler2TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td1 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td2 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td3 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td31);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td4 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler2() {
		recapituler2.htmlAvant();
		htmlBodyRecapituler2(recapituler2);
		recapituler2.htmlApres();
	}

	//////////////////
	// recapituler3 //
	//////////////////

	public static final String recapituler3TableTr1Td1I1 = "fas fa-question";
	public static final String recapituler3TableTr1Td1I = recapituler3TableTr1Td1I1;
	public static final String recapituler3TableTr1Td21 = "Questions";
	public static final String recapituler3TableTr1Td2 = recapituler3TableTr1Td21;
	public static final String recapituler3TableTr1Td3I1 = "fas fa-bullhorn";
	public static final String recapituler3TableTr1Td3I = recapituler3TableTr1Td3I1;
	public static final String recapituler3TableTr1Td41 = "Answers";
	public static final String recapituler3TableTr1Td4 = recapituler3TableTr1Td41;
	public static final String recapituler3TableTr2Td1I1 = "fas fa-location";
	public static final String recapituler3TableTr2Td1I = recapituler3TableTr2Td1I1;
	public static final String recapituler3TableTr2Td21 = "Where are you from? ";
	public static final String recapituler3TableTr2Td2 = recapituler3TableTr2Td21;
	public static final String recapituler3TableTr2Td3I1 = "fas fa-globe-americas";
	public static final String recapituler3TableTr2Td3I = recapituler3TableTr2Td3I1;
	public static final String recapituler3TableTr2Td41 = "I am from Utah (and a wanderer at heart). ";
	public static final String recapituler3TableTr2Td4 = recapituler3TableTr2Td41;
	public static final String recapituler3TableTr3Td1I1 = "fas fa-book";
	public static final String recapituler3TableTr3Td1I = recapituler3TableTr3Td1I1;
	public static final String recapituler3TableTr3Td21 = "How did you learn computer programming? ";
	public static final String recapituler3TableTr3Td2 = recapituler3TableTr3Td21;
	public static final String recapituler3TableTr3Td3I1 = "fas fa-save";
	public static final String recapituler3TableTr3Td3I = recapituler3TableTr3Td3I1;
	public static final String recapituler3TableTr3Td41 = "A love for computers all my life. ";
	public static final String recapituler3TableTr3Td4 = recapituler3TableTr3Td41;
	public static final String recapituler3TableTr4Td1I1 = "fas fa-briefcase";
	public static final String recapituler3TableTr4Td1I = recapituler3TableTr4Td1I1;
	public static final String recapituler3TableTr4Td21 = "How did you start working as a programmer? ";
	public static final String recapituler3TableTr4Td2 = recapituler3TableTr4Td21;
	public static final String recapituler3TableTr4Td3I1 = "fas fa-rocket";
	public static final String recapituler3TableTr4Td3I = recapituler3TableTr4Td3I1;
	public static final String recapituler3TableTr4Td41 = "Be at the next opportunity to grow my career. ";
	public static final String recapituler3TableTr4Td4 = recapituler3TableTr4Td41;
	public static final String recapituler3TableTr5Td1I1 = "fas fa-heart";
	public static final String recapituler3TableTr5Td1I = recapituler3TableTr5Td1I1;
	public static final String recapituler3TableTr5Td21 = "How did you become so passionate about open source? ";
	public static final String recapituler3TableTr5Td2 = recapituler3TableTr5Td21;
	public static final String recapituler3TableTr5Td3I1 = "fas fa-dove";
	public static final String recapituler3TableTr5Td3I = recapituler3TableTr5Td3I1;
	public static final String recapituler3TableTr5Td41 = "I love the freedom to build upon greatness. ";
	public static final String recapituler3TableTr5Td4 = recapituler3TableTr5Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
	 * <br/>
	 * @param recapituler3 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler3(PageHtml o);

	public PageHtml getRecapituler3() {
		return recapituler3;
	}

	public void setRecapituler3(PageHtml recapituler3) {
		this.recapituler3 = recapituler3;
		this.recapituler3Couverture.dejaInitialise = true;
	}
	protected PageAPropos recapituler3Init() {
		if(recapituler3 != null) {
			((PageAPropos)this).avantPagePart(recapituler3, "recapituler3");
			((PageAPropos)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyRecapituler3(PageHtml o) {
		{ e("table").a("class", " recapituler3Table ").f();
			{ e("tr").a("class", " recapituler3TableTr1 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr1Td1 recapituler3TableTr1Td odd ").f();
					{ e("i").a("class", recapituler3TableTr1Td1I1, " site-menu-icon recapituler3TableTr1Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr1Td2 recapituler3TableTr1Td even ").f();
					sx(recapituler3TableTr1Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr1Td3 recapituler3TableTr1Td odd ").f();
					{ e("i").a("class", recapituler3TableTr1Td3I1, " site-menu-icon recapituler3TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr1Td4 recapituler3TableTr1Td even ").f();
					sx(recapituler3TableTr1Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr2 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr2Td1 recapituler3TableTr2Td odd ").f();
					{ e("i").a("class", recapituler3TableTr2Td1I1, " site-menu-icon recapituler3TableTr2Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr2Td2 recapituler3TableTr2Td even ").f();
					sx(recapituler3TableTr2Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr2Td3 recapituler3TableTr2Td odd ").f();
					{ e("i").a("class", recapituler3TableTr2Td3I1, " site-menu-icon recapituler3TableTr2Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr2Td4 recapituler3TableTr2Td even ").f();
					sx(recapituler3TableTr2Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr3 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr3Td1 recapituler3TableTr3Td odd ").f();
					{ e("i").a("class", recapituler3TableTr3Td1I1, " site-menu-icon recapituler3TableTr3Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr3Td2 recapituler3TableTr3Td even ").f();
					sx(recapituler3TableTr3Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr3Td3 recapituler3TableTr3Td odd ").f();
					{ e("i").a("class", recapituler3TableTr3Td3I1, " site-menu-icon recapituler3TableTr3Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr3Td4 recapituler3TableTr3Td even ").f();
					sx(recapituler3TableTr3Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr4 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr4Td1 recapituler3TableTr4Td odd ").f();
					{ e("i").a("class", recapituler3TableTr4Td1I1, " site-menu-icon recapituler3TableTr4Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr4Td2 recapituler3TableTr4Td even ").f();
					sx(recapituler3TableTr4Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr4Td3 recapituler3TableTr4Td odd ").f();
					{ e("i").a("class", recapituler3TableTr4Td3I1, " site-menu-icon recapituler3TableTr4Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr4Td4 recapituler3TableTr4Td even ").f();
					sx(recapituler3TableTr4Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr5 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr5Td1 recapituler3TableTr5Td odd ").f();
					{ e("i").a("class", recapituler3TableTr5Td1I1, " site-menu-icon recapituler3TableTr5Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr5Td2 recapituler3TableTr5Td even ").f();
					sx(recapituler3TableTr5Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr5Td3 recapituler3TableTr5Td odd ").f();
					{ e("i").a("class", recapituler3TableTr5Td3I1, " site-menu-icon recapituler3TableTr5Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr5Td4 recapituler3TableTr5Td even ").f();
					sx(recapituler3TableTr5Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler3() {
		recapituler3.htmlAvant();
		htmlBodyRecapituler3(recapituler3);
		recapituler3.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAPropos = false;

	public PageAPropos initLoinPageAPropos(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAPropos) {
			dejaInitialisePageAPropos = true;
			initLoinPageAPropos();
		}
		return (PageAPropos)this;
	}

	public void initLoinPageAPropos() {
		super.initLoinArticle(requeteSite_);
		initPageAPropos();
	}

	public void initPageAPropos() {
		listeArticleInit();
		ouVenezVousInit();
		informatiqueInit();
		emploiInit();
		opensourceInit();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAPropos(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAPropos(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(ouVenezVous != null)
			ouVenezVous.setRequeteSite_(requeteSite_);
		if(informatique != null)
			informatique.setRequeteSite_(requeteSite_);
		if(emploi != null)
			emploi.setRequeteSite_(requeteSite_);
		if(opensource != null)
			opensource.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAPropos(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAPropos(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAPropos(String var) {
		PageAPropos oPageAPropos = (PageAPropos)this;
		switch(var) {
			case "listeArticle":
				return oPageAPropos.listeArticle;
			case "ouVenezVous":
				return oPageAPropos.ouVenezVous;
			case "informatique":
				return oPageAPropos.informatique;
			case "emploi":
				return oPageAPropos.emploi;
			case "opensource":
				return oPageAPropos.opensource;
			case "recapituler2":
				return oPageAPropos.recapituler2;
			case "recapituler3":
				return oPageAPropos.recapituler3;
			default:
				return super.obtenirArticle(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerPageAPropos(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAPropos(String var, Object val) {
		PageAPropos oPageAPropos = (PageAPropos)this;
		switch(var) {
			default:
				return super.attribuerArticle(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirPageAPropos(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAPropos(String var, String val) {
		switch(var) {
			default:
				return super.definirArticle(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
			{
				new File("/usr/local/src/computate.org-static/png/frFR").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/apropos?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				System.out.println("PageAProposFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/about?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/about-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/about-999.png"));
				System.out.println("PageAProposEnUSPage");
				System.out.println(" * ImageLargeur.enUS: " + img.getWidth());
				System.out.println(" * ImageHauteur.enUS: " + img.getHeight());
			}
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.apropos.PageAPropos"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageAPropos o = new PageAPropos();
			o.requeteSitePageAPropos(requeteSite);
			o.initLoinPageAPropos(requeteSite);
			o.indexerPageAPropos();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerPageAPropos();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerPageAPropos(document);
	}

	public void indexerPageAPropos(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageAPropos(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageAPropos() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageAPropos(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageAPropos(SolrInputDocument document) {
		super.indexerArticle(document);

	}

	public void desindexerPageAPropos() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinPageAPropos(siteContexte.getRequeteSite_());
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPageAPropos(solrDocument);
	}
	public void stockerPageAPropos(SolrDocument solrDocument) {
		PageAPropos oPageAPropos = (PageAPropos)this;

		super.stockerArticle(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAPropos();
	}

	public void htmlBodyCourtPageAPropos() {
		if(ouVenezVous != null)
			ouVenezVous.htmlBodyCourt();
		if(informatique != null)
			informatique.htmlBodyCourt();
		if(emploi != null)
			emploi.htmlBodyCourt();
		if(opensource != null)
			opensource.htmlBodyCourt();
		if(recapituler2 != null)
			recapituler2.htmlBodyCourt();
		if(recapituler3 != null)
			recapituler3.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAPropos();
		super.htmlBody();
	}

	public void htmlBodyPageAPropos() {
		((PageAPropos)this).htmlBodyOuVenezVous();
		((PageAPropos)this).htmlBodyInformatique();
		((PageAPropos)this).htmlBodyEmploi();
		((PageAPropos)this).htmlBodyOpensource();
		((PageAPropos)this).htmlBodyRecapituler2();
		((PageAPropos)this).htmlBodyRecapituler3();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof PageAPropos))
			return false;
		PageAPropos that = (PageAPropos)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAPropos {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageAProposVals = new String[] { ouVenezVousH3I1, ouVenezVousH3Span1, ouVenezVousH4I1, ouVenezVousH4Span1, ouVenezVousPDiv1I1, ouVenezVousPDiv1Span1, ouVenezVousPDiv2I1, ouVenezVousPDiv2Span1, ouVenezVousPDiv3I1, ouVenezVousPDiv3Span1, ouVenezVousPDiv4I1, ouVenezVousPDiv4Span1, informatiqueH3I1, informatiqueH3Span1, informatiqueH4I1, informatiqueH4Span1, informatiquePDiv1I1, informatiquePDiv1Span1, informatiquePDiv2I1, informatiquePDiv2Span1, informatiquePDiv3I1, informatiquePDiv3Span1, informatiquePDiv4I1, informatiquePDiv4Span1, informatiquePDiv5I1, informatiquePDiv5Span1, informatiquePDiv6I1, informatiquePDiv6Span1, emploiH3I1, emploiH3Span1, emploiH4I1, emploiH4Span1, emploiPDiv1I1, emploiPDiv1Span1, emploiPDiv2I1, emploiPDiv2Span1, emploiPDiv3I1, emploiPDiv3Span1, emploiPDiv4I1, emploiPDiv4Span1, emploiPDiv5I1, emploiPDiv5Span1, emploiPDiv6I1, emploiPDiv6Span1, emploiPDiv7I1, emploiPDiv7Span1, emploiPDiv8I1, emploiPDiv8Span1, opensourceH3I1, opensourceH3Span1, opensourceH4I1, opensourceH4Span1, opensourcePDiv1I1, opensourcePDiv1Span1, opensourcePDiv2I1, opensourcePDiv2Span1, opensourcePDiv3I1, opensourcePDiv3Span1, opensourcePDiv4I1, opensourcePDiv4Span1, opensourcePDiv5I1, opensourcePDiv5Span1, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr1Td1I1, recapituler3TableTr1Td21, recapituler3TableTr1Td3I1, recapituler3TableTr1Td41, recapituler3TableTr2Td1I1, recapituler3TableTr2Td21, recapituler3TableTr2Td3I1, recapituler3TableTr2Td41, recapituler3TableTr3Td1I1, recapituler3TableTr3Td21, recapituler3TableTr3Td3I1, recapituler3TableTr3Td41, recapituler3TableTr4Td1I1, recapituler3TableTr4Td21, recapituler3TableTr4Td3I1, recapituler3TableTr4Td41, recapituler3TableTr5Td1I1, recapituler3TableTr5Td21, recapituler3TableTr5Td3I1, recapituler3TableTr5Td41 };
}
