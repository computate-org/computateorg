package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import java.lang.String;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.enUS.request.RequeteSiteEnUS;

import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineGen<DEV> extends C001Lecon {

	public static final String C001L001ChoisirNomDomaine_UnNom = "a lesson";
	public static final String C001L001ChoisirNomDomaine_Ce = "this ";
	public static final String C001L001ChoisirNomDomaine_CeNom = "this lesson";
	public static final String C001L001ChoisirNomDomaine_Un = "an ";
	public static final String C001L001ChoisirNomDomaine_LeNom = "the lesson";
	public static final String C001L001ChoisirNomDomaine_NomSingulier = "lesson";
	public static final String C001L001ChoisirNomDomaine_NomPluriel = "lessons";
	public static final String C001L001ChoisirNomDomaine_NomActuel = "current lesson";
	public static final String C001L001ChoisirNomDomaine_TousNom = "the lessons";
	public static final String C001L001ChoisirNomDomaine_RechercherTousNomPar = "search lessons by ";
	public static final String C001L001ChoisirNomDomaine_H1 = "What is the first step to creating my own website? ";
	public static final String C001L001ChoisirNomDomaine_H2 = "Choose a domain name. ";
	public static final String C001L001ChoisirNomDomaine_Titre = "What is the first step to creating my own website? Choose a domain name. ";
	public static final String C001L001ChoisirNomDomaine_LesNoms = "the lessons";
	public static final String C001L001ChoisirNomDomaine_AucunNomTrouve = "no lesson found";
	public static final String C001L001ChoisirNomDomaine_NomVar = "lesson";
	public static final String C001L001ChoisirNomDomaine_DeNom = "of lesson";
	public static final String C001L001ChoisirNomDomaine_Couleur = "green";
	public static final String C001L001ChoisirNomDomaine_IconeGroupe = "regular";
	public static final String C001L001ChoisirNomDomaine_IconeNom = "book";
	public static final String C001L001ChoisirNomDomaineFrFRPage_Uri = "/frFR/cours/001/001-choisir-nom-domaine";
	public static final String C001L001ChoisirNomDomaineFrFRPage_ImageUri = "/png/frFR/cours/001/001-choisir-nom-domaine-999.png";
	public static final String C001L001ChoisirNomDomaineEnUSPage_Uri = "/enUS/course/001/001-choose-domain-name";
	public static final String C001L001ChoisirNomDomaineEnUSPage_ImageUri = "/png/enUS/course/001/001-choose-domain-name-999.png";

	///////////
	// intro //
	///////////

	public static final String introP1 = "Are you thinking about launching your own website? ";
	public static final String introP2 = "Are you wondering what the very first step is to creating your own website? ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml intro = new PageHtml();
	public Couverture<PageHtml> introCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:intro">Trouver l'entité intro dans Solr</a>
	 * <br/>
	 * @param intro est l'entité déjà construit. 
	 **/
	protected abstract void _intro(PageHtml o);

	public PageHtml getIntro() {
		return intro;
	}

	public void setIntro(PageHtml intro) {
		this.intro = intro;
		this.introCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine introInit() {
		if(intro != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(intro, "intro");
			((C001L001ChoisirNomDomaine)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyIntro(PageHtml o) {
		{ e("p").a("class", " introP ").f();
			sx(introP1);
			sx(introP2);
		} g("p");
	}
	public void htmlBodyIntro() {
		intro.htmlAvant();
		htmlBodyIntro(intro);
		intro.htmlApres();
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP3 = "The first thing you should do is choose your domain name so you can get started in the right direction. ";
	public static final String moiP = moiP1 + moiP2 + moiP3;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
	 * <br/>
	 * @param moi est l'entité déjà construit. 
	 **/
	protected abstract void _moi(PageHtml o);

	public PageHtml getMoi() {
		return moi;
	}

	public void setMoi(PageHtml moi) {
		this.moi = moi;
		this.moiCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine moiInit() {
		if(moi != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(moi, "moi");
			((C001L001ChoisirNomDomaine)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	//////////////
	// aLAvance //
	//////////////

	public static final String aLAvanceH3I1 = "fas fa-history";
	public static final String aLAvanceH3I = aLAvanceH3I1;
	public static final String aLAvanceH3Span1 = "Is it important to purchase a domain name ahead of time? ";
	public static final String aLAvanceH3Span = aLAvanceH3Span1;
	public static final String aLAvanceH4I1 = "fas fa-map-pin";
	public static final String aLAvanceH4I = aLAvanceH4I1;
	public static final String aLAvanceH4Span1 = "You need to know now what your site will be called so you don't get lost. ";
	public static final String aLAvanceH4Span = aLAvanceH4Span1;
	public static final String aLAvanceP1 = "You can start today with your very own computer building your own website, but you must figure out what it will be called. ";
	public static final String aLAvanceP2 = "The fate of the name of your computer depends on it. ";
	public static final String aLAvanceP3 = "The directories where you will be putting your website are waiting for it. ";
	public static final String aLAvanceP4 = "All the applications that are part of the website will need to know it. ";
	public static final String aLAvanceP5 = "So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. ";
	public static final String aLAvanceP = aLAvanceP1 + aLAvanceP2 + aLAvanceP3 + aLAvanceP4 + aLAvanceP5;

	/**	L'entité « aLAvance »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml aLAvance = new PageHtml();
	public Couverture<PageHtml> aLAvanceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("aLAvance").o(aLAvance);

	/**	<br/>L'entité « aLAvance »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:aLAvance">Trouver l'entité aLAvance dans Solr</a>
	 * <br/>
	 * @param aLAvance est l'entité déjà construit. 
	 **/
	protected abstract void _aLAvance(PageHtml o);

	public PageHtml getALAvance() {
		return aLAvance;
	}

	public void setALAvance(PageHtml aLAvance) {
		this.aLAvance = aLAvance;
		this.aLAvanceCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine aLAvanceInit() {
		if(aLAvance != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(aLAvance, "aLAvance");
			((C001L001ChoisirNomDomaine)this).avantPagePart(aLAvance, "aLAvance");
		}
		if(!aLAvanceCouverture.dejaInitialise) {
			_aLAvance(aLAvance);
		}
		aLAvance.initLoinPourClasse(requeteSite_);
		aLAvanceCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyALAvance(PageHtml o) {
		{ e("h3").a("class", " aLAvanceH3 ").f();
			{ e("i").a("class", aLAvanceH3I1, " site-menu-icon aLAvanceH3I ").f();
			} g("i");
			{ e("span").a("class", " aLAvanceH3Span ").f();
				sx(aLAvanceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " aLAvanceH4 ").f();
			{ e("i").a("class", aLAvanceH4I1, " site-menu-icon aLAvanceH4I ").f();
			} g("i");
			{ e("span").a("class", " aLAvanceH4Span ").f();
				sx(aLAvanceH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " aLAvanceP ").f();
			sx(aLAvanceP1);
			sx(aLAvanceP2);
			sx(aLAvanceP3);
			sx(aLAvanceP4);
			sx(aLAvanceP5);
		} g("p");
	}
	public void htmlBodyALAvance() {
		aLAvance.htmlAvant();
		htmlBodyALAvance(aLAvance);
		aLAvance.htmlApres();
	}

	/////////////
	// acheter //
	/////////////

	public static final String acheterH3I1 = "fas fa-credit-card";
	public static final String acheterH3I = acheterH3I1;
	public static final String acheterH3Span1 = "Where can I purchase a domain name? ";
	public static final String acheterH3Span = acheterH3Span1;
	public static final String acheterH4I1 = "fas fa-building";
	public static final String acheterH4I = acheterH4I1;
	public static final String acheterH4Span1 = "There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. ";
	public static final String acheterH4Span = acheterH4Span1;
	public static final String acheterPSpan11 = "I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. ";
	public static final String acheterPSpan12 = "But I can tell you where I purchased mine 12 years ago, which is ";
	public static final String acheterPSpan1 = acheterPSpan11 + acheterPSpan12;
	public static final String acheterPSpan1A11 = "https://secure.brinkster.com/Domains/";
	public static final String acheterPSpan1A1 = acheterPSpan1A11;
	public static final String acheterPSpan21 = ". But brinkster.com is not the cheapest ($19.83 this year). ";
	public static final String acheterPSpan22 = "You may also want to try ";
	public static final String acheterPSpan2 = acheterPSpan21 + acheterPSpan22;
	public static final String acheterPSpan2A21 = "https://www.gandi.net/en";
	public static final String acheterPSpan2A2 = acheterPSpan2A21;
	public static final String acheterPSpan31 = ". Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. ";
	public static final String acheterPSpan3 = acheterPSpan31;

	/**	L'entité « acheter »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml acheter = new PageHtml();
	public Couverture<PageHtml> acheterCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("acheter").o(acheter);

	/**	<br/>L'entité « acheter »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:acheter">Trouver l'entité acheter dans Solr</a>
	 * <br/>
	 * @param acheter est l'entité déjà construit. 
	 **/
	protected abstract void _acheter(PageHtml o);

	public PageHtml getAcheter() {
		return acheter;
	}

	public void setAcheter(PageHtml acheter) {
		this.acheter = acheter;
		this.acheterCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine acheterInit() {
		if(acheter != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(acheter, "acheter");
			((C001L001ChoisirNomDomaine)this).avantPagePart(acheter, "acheter");
		}
		if(!acheterCouverture.dejaInitialise) {
			_acheter(acheter);
		}
		acheter.initLoinPourClasse(requeteSite_);
		acheterCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyAcheter(PageHtml o) {
		{ e("h3").a("class", " acheterH3 ").f();
			{ e("i").a("class", acheterH3I1, " site-menu-icon acheterH3I ").f();
			} g("i");
			{ e("span").a("class", " acheterH3Span ").f();
				sx(acheterH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " acheterH4 ").f();
			{ e("i").a("class", acheterH4I1, " site-menu-icon acheterH4I ").f();
			} g("i");
			{ e("span").a("class", " acheterH4Span ").f();
				sx(acheterH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " acheterP ").f();
			{ e("span").a("class", " acheterPSpan1 acheterPSpan odd ").f();
				sx(acheterPSpan11);
				sx(acheterPSpan12);
				{ e("a").a("class", " acheterPSpan1A1 acheterPSpan1A odd ").a("href", acheterPSpan1A11).f();
					sx(acheterPSpan1A11);
				} g("a");
			} g("span");
			{ e("span").a("class", " acheterPSpan2 acheterPSpan even ").f();
				sx(acheterPSpan21);
				sx(acheterPSpan22);
				{ e("a").a("class", " acheterPSpan2A2 acheterPSpan2A even ").a("href", acheterPSpan2A21).f();
					sx(acheterPSpan2A21);
				} g("a");
			} g("span");
			{ e("span").a("class", " acheterPSpan3 acheterPSpan odd ").f();
				sx(acheterPSpan31);
			} g("span");
		} g("p");
	}
	public void htmlBodyAcheter() {
		acheter.htmlAvant();
		htmlBodyAcheter(acheter);
		acheter.htmlApres();
	}

	/////////////
	// appeler //
	/////////////

	public static final String appelerH3I1 = "fab fa-wpforms";
	public static final String appelerH3I = appelerH3I1;
	public static final String appelerH3Span1 = "What do I choose for a domain name? ";
	public static final String appelerH3Span = appelerH3Span1;
	public static final String appelerH4I1 = "fas fa-bullhorn";
	public static final String appelerH4I = appelerH4I1;
	public static final String appelerH4Span1 = "Find a domain name that will reach your audience. ";
	public static final String appelerH4Span = appelerH4Span1;
	public static final String appelerP1 = "I don't know your passion, but find a domain name that will reach your audience. ";
	public static final String appelerP2 = "It's good if it is short and sweet. ";
	public static final String appelerP3 = "Whether it is a .com, or .org, or .net or whatever is up to you too. ";
	public static final String appelerP4 = "Just make it a place you will be proud of someday! ";
	public static final String appelerP = appelerP1 + appelerP2 + appelerP3 + appelerP4;

	/**	L'entité « appeler »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml appeler = new PageHtml();
	public Couverture<PageHtml> appelerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("appeler").o(appeler);

	/**	<br/>L'entité « appeler »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:appeler">Trouver l'entité appeler dans Solr</a>
	 * <br/>
	 * @param appeler est l'entité déjà construit. 
	 **/
	protected abstract void _appeler(PageHtml o);

	public PageHtml getAppeler() {
		return appeler;
	}

	public void setAppeler(PageHtml appeler) {
		this.appeler = appeler;
		this.appelerCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine appelerInit() {
		if(appeler != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(appeler, "appeler");
			((C001L001ChoisirNomDomaine)this).avantPagePart(appeler, "appeler");
		}
		if(!appelerCouverture.dejaInitialise) {
			_appeler(appeler);
		}
		appeler.initLoinPourClasse(requeteSite_);
		appelerCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyAppeler(PageHtml o) {
		{ e("h3").a("class", " appelerH3 ").f();
			{ e("i").a("class", appelerH3I1, " site-menu-icon appelerH3I ").f();
			} g("i");
			{ e("span").a("class", " appelerH3Span ").f();
				sx(appelerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " appelerH4 ").f();
			{ e("i").a("class", appelerH4I1, " site-menu-icon appelerH4I ").f();
			} g("i");
			{ e("span").a("class", " appelerH4Span ").f();
				sx(appelerH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " appelerP ").f();
			sx(appelerP1);
			sx(appelerP2);
			sx(appelerP3);
			sx(appelerP4);
		} g("p");
	}
	public void htmlBodyAppeler() {
		appeler.htmlAvant();
		htmlBodyAppeler(appeler);
		appeler.htmlApres();
	}

	////////////
	// apres1 //
	////////////

	public static final String apres1H3I1 = "fas fa-cart-plus";
	public static final String apres1H3I = apres1H3I1;
	public static final String apres1H3Span1 = "What do I do after I bought a domain name? ";
	public static final String apres1H3Span = apres1H3Span1;
	public static final String apres1H4I1 = "fas fa-clipboard-check";
	public static final String apres1H4I = apres1H4I1;
	public static final String apres1H4Span1 = "Manage your domain. ";
	public static final String apres1H4Span = apres1H4Span1;
	public static final String apres1PSpan11 = "Let me show you what it's like to manage a domain name. ";
	public static final String apres1PSpan12 = "I will log into my own registrar's site, ";
	public static final String apres1PSpan1 = apres1PSpan11 + apres1PSpan12;
	public static final String apres1PSpan1A1 = "https://secure.brinkster.com/";
	public static final String apres1PSpan1A = apres1PSpan1A1;
	public static final String apres1PSpan21 = ". ";
	public static final String apres1PSpan2 = apres1PSpan21;

	/**	L'entité « apres1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres1 = new PageHtml();
	public Couverture<PageHtml> apres1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres1").o(apres1);

	/**	<br/>L'entité « apres1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres1">Trouver l'entité apres1 dans Solr</a>
	 * <br/>
	 * @param apres1 est l'entité déjà construit. 
	 **/
	protected abstract void _apres1(PageHtml o);

	public PageHtml getApres1() {
		return apres1;
	}

	public void setApres1(PageHtml apres1) {
		this.apres1 = apres1;
		this.apres1Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres1Init() {
		if(apres1 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres1, "apres1");
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres1, "apres1");
		}
		if(!apres1Couverture.dejaInitialise) {
			_apres1(apres1);
		}
		apres1.initLoinPourClasse(requeteSite_);
		apres1Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyApres1(PageHtml o) {
		{ e("h3").a("class", " apres1H3 ").f();
			{ e("i").a("class", apres1H3I1, " site-menu-icon apres1H3I ").f();
			} g("i");
			{ e("span").a("class", " apres1H3Span ").f();
				sx(apres1H3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " apres1H4 ").f();
			{ e("i").a("class", apres1H4I1, " site-menu-icon apres1H4I ").f();
			} g("i");
			{ e("span").a("class", " apres1H4Span ").f();
				sx(apres1H4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " apres1P ").f();
			{ e("span").a("class", " apres1PSpan1 apres1PSpan odd ").f();
				sx(apres1PSpan11);
				sx(apres1PSpan12);
				{ e("a").a("class", " apres1PSpan1A ").a("href", apres1PSpan1A1).f();
					sx(apres1PSpan1A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " apres1PSpan2 apres1PSpan even ").f();
				sx(apres1PSpan21);
			} g("span");
		} g("p");
	}
	public void htmlBodyApres1() {
		apres1.htmlAvant();
		htmlBodyApres1(apres1);
		apres1.htmlApres();
	}

	////////////
	// apres2 //
	////////////

	public static final String apres2UlLi11 = "I click on \"Login\". ";
	public static final String apres2UlLi1 = apres2UlLi11;
	public static final String apres2UlLi21 = "I click again on \"Login\". ";
	public static final String apres2UlLi2 = apres2UlLi21;
	public static final String apres2UlLi31 = "I click on \"DOMAIN NAMES\". ";
	public static final String apres2UlLi32 = "And there you can see my domain names that are still alive, and those that are dead. ";
	public static final String apres2UlLi33 = "So domains expire yearly, and they can be renewed each year. ";
	public static final String apres2UlLi3 = apres2UlLi31 + apres2UlLi32 + apres2UlLi33;
	public static final String apres2UlLi41 = "I can also manage my site, so I will click on \"Manage\". ";
	public static final String apres2UlLi4 = apres2UlLi41;

	/**	L'entité « apres2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres2 = new PageHtml();
	public Couverture<PageHtml> apres2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres2").o(apres2);

	/**	<br/>L'entité « apres2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres2">Trouver l'entité apres2 dans Solr</a>
	 * <br/>
	 * @param apres2 est l'entité déjà construit. 
	 **/
	protected abstract void _apres2(PageHtml o);

	public PageHtml getApres2() {
		return apres2;
	}

	public void setApres2(PageHtml apres2) {
		this.apres2 = apres2;
		this.apres2Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres2Init() {
		if(apres2 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres2, "apres2");
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres2, "apres2");
		}
		if(!apres2Couverture.dejaInitialise) {
			_apres2(apres2);
		}
		apres2.initLoinPourClasse(requeteSite_);
		apres2Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyApres2(PageHtml o) {
		{ e("ul").a("class", " apres2Ul ").f();
			{ e("li").a("class", " apres2UlLi1 apres2UlLi odd ").f();
				sx(apres2UlLi11);
			} g("li");
			{ e("li").a("class", " apres2UlLi2 apres2UlLi even ").f();
				sx(apres2UlLi21);
			} g("li");
			{ e("li").a("class", " apres2UlLi3 apres2UlLi odd ").f();
				sx(apres2UlLi31);
				sx(apres2UlLi32);
				sx(apres2UlLi33);
			} g("li");
			{ e("li").a("class", " apres2UlLi4 apres2UlLi even ").f();
				sx(apres2UlLi41);
			} g("li");
		} g("ul");
	}
	public void htmlBodyApres2() {
		apres2.htmlAvant();
		htmlBodyApres2(apres2);
		apres2.htmlApres();
	}

	////////////
	// apres3 //
	////////////

	public static final String apres3UlLi11 = "If I click on \"Update Domain Registrant Information\" I can update my name and address information to make sure I receive spam from everyone on the Web who noticed I created a new domain. ";
	public static final String apres3UlLi12 = "I would recommend a P.O. Box for your business, rather than your home address, for more privacy. ";
	public static final String apres3UlLi1 = apres3UlLi11 + apres3UlLi12;

	/**	L'entité « apres3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres3 = new PageHtml();
	public Couverture<PageHtml> apres3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres3").o(apres3);

	/**	<br/>L'entité « apres3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres3">Trouver l'entité apres3 dans Solr</a>
	 * <br/>
	 * @param apres3 est l'entité déjà construit. 
	 **/
	protected abstract void _apres3(PageHtml o);

	public PageHtml getApres3() {
		return apres3;
	}

	public void setApres3(PageHtml apres3) {
		this.apres3 = apres3;
		this.apres3Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres3Init() {
		if(apres3 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres3, "apres3");
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres3, "apres3");
		}
		if(!apres3Couverture.dejaInitialise) {
			_apres3(apres3);
		}
		apres3.initLoinPourClasse(requeteSite_);
		apres3Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyApres3(PageHtml o) {
		{ e("ul").a("class", " apres3Ul ").f();
			{ e("li").a("class", " apres3UlLi1 apres3UlLi odd ").f();
				sx(apres3UlLi11);
				sx(apres3UlLi12);
			} g("li");
		} g("ul");
	}
	public void htmlBodyApres3() {
		apres3.htmlAvant();
		htmlBodyApres3(apres3);
		apres3.htmlApres();
	}

	////////////
	// apres4 //
	////////////

	public static final String apres4UlLi11 = "If I go back and click on \"Update Name Servers\" I can point my website to a different DNS company than my registrar, brinkster.com. ";
	public static final String apres4UlLi12 = "This is handy for me, because I actually use my email SMTP provider fastmail.com as my DNS provider, so I put in the name servers of my DNS provider there. ";
	public static final String apres4UlLi13 = "You don't need a different DNS provider, you can usually use your registrar for email as well, but I choose fastmail for their privacy and excellent email interface. ";
	public static final String apres4UlLi1 = apres4UlLi11 + apres4UlLi12 + apres4UlLi13;

	/**	L'entité « apres4 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres4 = new PageHtml();
	public Couverture<PageHtml> apres4Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres4").o(apres4);

	/**	<br/>L'entité « apres4 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres4">Trouver l'entité apres4 dans Solr</a>
	 * <br/>
	 * @param apres4 est l'entité déjà construit. 
	 **/
	protected abstract void _apres4(PageHtml o);

	public PageHtml getApres4() {
		return apres4;
	}

	public void setApres4(PageHtml apres4) {
		this.apres4 = apres4;
		this.apres4Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres4Init() {
		if(apres4 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres4, "apres4");
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres4, "apres4");
		}
		if(!apres4Couverture.dejaInitialise) {
			_apres4(apres4);
		}
		apres4.initLoinPourClasse(requeteSite_);
		apres4Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyApres4(PageHtml o) {
		{ e("ul").a("class", " apres4Ul ").f();
			{ e("li").a("class", " apres4UlLi1 apres4UlLi odd ").f();
				sx(apres4UlLi11);
				sx(apres4UlLi12);
				sx(apres4UlLi13);
			} g("li");
		} g("ul");
	}
	public void htmlBodyApres4() {
		apres4.htmlAvant();
		htmlBodyApres4(apres4);
		apres4.htmlApres();
	}

	////////////
	// apres5 //
	////////////

	public static final String apres5UlLi11 = "In a future lesson, we'll talk about creating a static IP address so that users can find your web server, on your computer, at your domain. ";
	public static final String apres5UlLi12 = "When you have this, you can ask the support team at your registrar, to create for you some \"A records\" at your static IP. ";
	public static final String apres5UlLi13 = "For example, I would ask for two A records to be created for \"computate.org\" and \"*.computate.org\" to my static IP address. ";
	public static final String apres5UlLi14 = "But since I use fastmail for my DNS, I can actually create my own A records for any of my domains in my account, which is nice. ";
	public static final String apres5UlLi1 = apres5UlLi11 + apres5UlLi12 + apres5UlLi13 + apres5UlLi14;

	/**	L'entité « apres5 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres5 = new PageHtml();
	public Couverture<PageHtml> apres5Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres5").o(apres5);

	/**	<br/>L'entité « apres5 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres5">Trouver l'entité apres5 dans Solr</a>
	 * <br/>
	 * @param apres5 est l'entité déjà construit. 
	 **/
	protected abstract void _apres5(PageHtml o);

	public PageHtml getApres5() {
		return apres5;
	}

	public void setApres5(PageHtml apres5) {
		this.apres5 = apres5;
		this.apres5Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres5Init() {
		if(apres5 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres5, "apres5");
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres5, "apres5");
		}
		if(!apres5Couverture.dejaInitialise) {
			_apres5(apres5);
		}
		apres5.initLoinPourClasse(requeteSite_);
		apres5Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyApres5(PageHtml o) {
		{ e("ul").a("class", " apres5Ul ").f();
			{ e("li").a("class", " apres5UlLi1 apres5UlLi odd ").f();
				sx(apres5UlLi11);
				sx(apres5UlLi12);
				sx(apres5UlLi13);
				sx(apres5UlLi14);
			} g("li");
		} g("ul");
	}
	public void htmlBodyApres5() {
		apres5.htmlAvant();
		htmlBodyApres5(apres5);
		apres5.htmlApres();
	}

	//////////////
	// plusTard //
	//////////////

	public static final String plusTardH3I1 = "fas fa-fast-forward";
	public static final String plusTardH3I = plusTardH3I1;
	public static final String plusTardH3Span1 = "Can I start developing my website locally before deciding on my domain name? ";
	public static final String plusTardH3Span = plusTardH3Span1;
	public static final String plusTardH4I1 = "fas fa-list-ol";
	public static final String plusTardH4I = plusTardH4I1;
	public static final String plusTardH4Span1 = "The hostname of your computer will depend on your domain name. ";
	public static final String plusTardH4Span = plusTardH4Span1;
	public static final String plusTardP1 = "If you don't know your domain name, it's going to bite you later. ";
	public static final String plusTardP2 = "Having a hostname that is a subdomain of your domain name makes it easier to develop and bring your site live. ";
	public static final String plusTardP3 = "You can give your computers hostnames that are subdomains of your own domain name to make it easy to develop and view your site locally and publicly from the same URL. ";
	public static final String plusTardP4 = "I like creating a directory for your domain name for storing SSL certs and other domain specific files together in the same place to be synced to all your computers. ";
	public static final String plusTardP5 = "So instead of making it harder on yourself, take this exciting opportunity to buy your domain name, it's less than $20 per year! ";
	public static final String plusTardP6 = "Now you can continue to launch your own successful website on your own computer. ";
	public static final String plusTardP = plusTardP1 + plusTardP2 + plusTardP3 + plusTardP4 + plusTardP5 + plusTardP6;

	/**	L'entité « plusTard »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse plusTard = new QuestionReponse();
	public Couverture<QuestionReponse> plusTardCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("plusTard").o(plusTard);

	/**	<br/>L'entité « plusTard »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:plusTard">Trouver l'entité plusTard dans Solr</a>
	 * <br/>
	 * @param plusTard est l'entité déjà construit. 
	 **/
	protected abstract void _plusTard(QuestionReponse o);

	public QuestionReponse getPlusTard() {
		return plusTard;
	}

	public void setPlusTard(QuestionReponse plusTard) {
		this.plusTard = plusTard;
		this.plusTardCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine plusTardInit() {
		if(plusTard != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(plusTard, "plusTard");
			((C001L001ChoisirNomDomaine)this).avantPagePart(plusTard, "plusTard");
		}
		if(!plusTardCouverture.dejaInitialise) {
			_plusTard(plusTard);
		}
		plusTard.initLoinPourClasse(requeteSite_);
		plusTardCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyPlusTard(QuestionReponse o) {
		{ e("h3").a("class", " plusTardH3 ").f();
			{ e("i").a("class", plusTardH3I1, " site-menu-icon plusTardH3I ").f();
			} g("i");
			{ e("span").a("class", " plusTardH3Span ").f();
				sx(plusTardH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " plusTardH4 ").f();
			{ e("i").a("class", plusTardH4I1, " site-menu-icon plusTardH4I ").f();
			} g("i");
			{ e("span").a("class", " plusTardH4Span ").f();
				sx(plusTardH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " plusTardP ").f();
			sx(plusTardP1);
			sx(plusTardP2);
			sx(plusTardP3);
			sx(plusTardP4);
			sx(plusTardP5);
			sx(plusTardP6);
		} g("p");
	}
	public void htmlBodyPlusTard() {
		plusTard.htmlAvant();
		htmlBodyPlusTard(plusTard);
		plusTard.htmlApres();
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31 = "To review: ";
	public static final String recapituler1H3 = recapituler1H31;

	/**	L'entité « recapituler1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler1 = new PageHtml();
	public Couverture<PageHtml> recapituler1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler1").o(recapituler1);

	/**	<br/>L'entité « recapituler1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
	 * <br/>
	 * @param recapituler1 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler1(PageHtml o);

	public PageHtml getRecapituler1() {
		return recapituler1;
	}

	public void setRecapituler1(PageHtml recapituler1) {
		this.recapituler1 = recapituler1;
		this.recapituler1Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine recapituler1Init() {
		if(recapituler1 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler1, "recapituler1");
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}
	public void htmlBodyRecapituler1(PageHtml o) {
		{ e("h3").a("class", " recapituler1H3 ").f();
			sx(recapituler1H31);
		} g("h3");
	}
	public void htmlBodyRecapituler1() {
		recapituler1.htmlAvant();
		htmlBodyRecapituler1(recapituler1);
		recapituler1.htmlApres();
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11 = "Tuesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fas fa-question";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "fas fa-hand-receiving";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 23 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "First step to create a website? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Choose a domain name. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L001ChoisirNomDomaine recapituler2Init() {
		if(recapituler2 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler2, "recapituler2");
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
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
	public static final String recapituler3TableTr2Td1I1 = "fas fa-history";
	public static final String recapituler3TableTr2Td1I = recapituler3TableTr2Td1I1;
	public static final String recapituler3TableTr2Td21 = "Should I buy it ahead of time? ";
	public static final String recapituler3TableTr2Td2 = recapituler3TableTr2Td21;
	public static final String recapituler3TableTr2Td3I1 = "fas fa-map-pin";
	public static final String recapituler3TableTr2Td3I = recapituler3TableTr2Td3I1;
	public static final String recapituler3TableTr2Td41 = "Know what your site will be called. ";
	public static final String recapituler3TableTr2Td4 = recapituler3TableTr2Td41;
	public static final String recapituler3TableTr3Td1I1 = "fas fa-credit-card";
	public static final String recapituler3TableTr3Td1I = recapituler3TableTr3Td1I1;
	public static final String recapituler3TableTr3Td21 = "Where can I purchase a domain name? ";
	public static final String recapituler3TableTr3Td2 = recapituler3TableTr3Td21;
	public static final String recapituler3TableTr3Td3I1 = "fas fa-building";
	public static final String recapituler3TableTr3Td3I = recapituler3TableTr3Td3I1;
	public static final String recapituler3TableTr3Td41 = "Try brinkster.com or gandi.net. ";
	public static final String recapituler3TableTr3Td4 = recapituler3TableTr3Td41;
	public static final String recapituler3TableTr4Td1I1 = "fab fa-wpforms";
	public static final String recapituler3TableTr4Td1I = recapituler3TableTr4Td1I1;
	public static final String recapituler3TableTr4Td21 = "What do I choose for a domain name? ";
	public static final String recapituler3TableTr4Td2 = recapituler3TableTr4Td21;
	public static final String recapituler3TableTr4Td3I1 = "fas fa-bullhorn";
	public static final String recapituler3TableTr4Td3I = recapituler3TableTr4Td3I1;
	public static final String recapituler3TableTr4Td41 = "Reach your audience. ";
	public static final String recapituler3TableTr4Td4 = recapituler3TableTr4Td41;
	public static final String recapituler3TableTr5Td1I1 = "fas fa-cart-plus";
	public static final String recapituler3TableTr5Td1I = recapituler3TableTr5Td1I1;
	public static final String recapituler3TableTr5Td21 = "What do I do after I've bought a domain name? ";
	public static final String recapituler3TableTr5Td2 = recapituler3TableTr5Td21;
	public static final String recapituler3TableTr5Td3I1 = "fas fa-clipboard-check";
	public static final String recapituler3TableTr5Td3I = recapituler3TableTr5Td3I1;
	public static final String recapituler3TableTr5Td41 = "Manage your domain. ";
	public static final String recapituler3TableTr5Td4 = recapituler3TableTr5Td41;
	public static final String recapituler3TableTr6Td1I1 = "fas fa-fast-forward";
	public static final String recapituler3TableTr6Td1I = recapituler3TableTr6Td1I1;
	public static final String recapituler3TableTr6Td21 = "Can I pick a domain name later? ";
	public static final String recapituler3TableTr6Td2 = recapituler3TableTr6Td21;
	public static final String recapituler3TableTr6Td3I1 = "fas fa-list-ol";
	public static final String recapituler3TableTr6Td3I = recapituler3TableTr6Td3I1;
	public static final String recapituler3TableTr6Td41 = "Your computer hostname will depend on it. ";
	public static final String recapituler3TableTr6Td4 = recapituler3TableTr6Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L001ChoisirNomDomaine recapituler3Init() {
		if(recapituler3 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler3, "recapituler3");
			((C001L001ChoisirNomDomaine)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
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
			{ e("tr").a("class", " recapituler3TableTr6 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr6Td1 recapituler3TableTr6Td odd ").f();
					{ e("i").a("class", recapituler3TableTr6Td1I1, " site-menu-icon recapituler3TableTr6Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr6Td2 recapituler3TableTr6Td even ").f();
					sx(recapituler3TableTr6Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr6Td3 recapituler3TableTr6Td odd ").f();
					{ e("i").a("class", recapituler3TableTr6Td3I1, " site-menu-icon recapituler3TableTr6Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr6Td4 recapituler3TableTr6Td even ").f();
					sx(recapituler3TableTr6Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler3() {
		recapituler3.htmlAvant();
		htmlBodyRecapituler3(recapituler3);
		recapituler3.htmlApres();
	}

	/////////////////////////
	// leconRecherche_frFR //
	/////////////////////////

	/**	L'entité « leconRecherche_frFR »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> leconRecherche_frFR = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> leconRecherche_frFRCouverture = new Couverture<List<String>>().p(this).c(List.class).var("leconRecherche_frFR").o(leconRecherche_frFR);

	/**	<br/>L'entité « leconRecherche_frFR »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:leconRecherche_frFR">Trouver l'entité leconRecherche_frFR dans Solr</a>
	 * <br/>
	 * @param leconRecherche_frFR est l'entité déjà construit. 
	 **/
	protected abstract void _leconRecherche_frFR(List<String> l);

	public List<String> getLeconRecherche_frFR() {
		return leconRecherche_frFR;
	}

	public void setLeconRecherche_frFR(List<String> leconRecherche_frFR) {
		this.leconRecherche_frFR = leconRecherche_frFR;
		this.leconRecherche_frFRCouverture.dejaInitialise = true;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_frFR(String...objets) {
		for(String o : objets) {
			addLeconRecherche_frFR(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_frFR(String o) {
		if(o != null && !leconRecherche_frFR.contains(o))
			this.leconRecherche_frFR.add(o);
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine setLeconRecherche_frFR(JsonArray objets) {
		leconRecherche_frFR.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLeconRecherche_frFR(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	protected C001L001ChoisirNomDomaine leconRecherche_frFRInit() {
		if(!leconRecherche_frFRCouverture.dejaInitialise) {
			_leconRecherche_frFR(leconRecherche_frFR);
		}
		leconRecherche_frFRCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	public List<String> solrLeconRecherche_frFR() {
		return leconRecherche_frFR;
	}

	public String strLeconRecherche_frFR() {
		return leconRecherche_frFR == null ? "" : leconRecherche_frFR.toString();
	}

	public String nomAffichageLeconRecherche_frFR() {
		return null;
	}

	public String htmTooltipLeconRecherche_frFR() {
		return null;
	}

	public String htmLeconRecherche_frFR() {
		return leconRecherche_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strLeconRecherche_frFR());
	}

	/////////////////////////
	// leconRecherche_enUS //
	/////////////////////////

	/**	L'entité « leconRecherche_enUS »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> leconRecherche_enUS = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> leconRecherche_enUSCouverture = new Couverture<List<String>>().p(this).c(List.class).var("leconRecherche_enUS").o(leconRecherche_enUS);

	/**	<br/>L'entité « leconRecherche_enUS »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:leconRecherche_enUS">Trouver l'entité leconRecherche_enUS dans Solr</a>
	 * <br/>
	 * @param leconRecherche_enUS est l'entité déjà construit. 
	 **/
	protected abstract void _leconRecherche_enUS(List<String> l);

	public List<String> getLeconRecherche_enUS() {
		return leconRecherche_enUS;
	}

	public void setLeconRecherche_enUS(List<String> leconRecherche_enUS) {
		this.leconRecherche_enUS = leconRecherche_enUS;
		this.leconRecherche_enUSCouverture.dejaInitialise = true;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_enUS(String...objets) {
		for(String o : objets) {
			addLeconRecherche_enUS(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_enUS(String o) {
		if(o != null && !leconRecherche_enUS.contains(o))
			this.leconRecherche_enUS.add(o);
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine setLeconRecherche_enUS(JsonArray objets) {
		leconRecherche_enUS.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLeconRecherche_enUS(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	protected C001L001ChoisirNomDomaine leconRecherche_enUSInit() {
		if(!leconRecherche_enUSCouverture.dejaInitialise) {
			_leconRecherche_enUS(leconRecherche_enUS);
		}
		leconRecherche_enUSCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	public List<String> solrLeconRecherche_enUS() {
		return leconRecherche_enUS;
	}

	public String strLeconRecherche_enUS() {
		return leconRecherche_enUS == null ? "" : leconRecherche_enUS.toString();
	}

	public String nomAffichageLeconRecherche_enUS() {
		return null;
	}

	public String htmTooltipLeconRecherche_enUS() {
		return null;
	}

	public String htmLeconRecherche_enUS() {
		return leconRecherche_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strLeconRecherche_enUS());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaine = false;

	public C001L001ChoisirNomDomaine initLoinC001L001ChoisirNomDomaine(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaine) {
			dejaInitialiseC001L001ChoisirNomDomaine = true;
			initLoinC001L001ChoisirNomDomaine();
		}
		return (C001L001ChoisirNomDomaine)this;
	}

	public void initLoinC001L001ChoisirNomDomaine() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L001ChoisirNomDomaine();
	}

	public void initC001L001ChoisirNomDomaine() {
		introInit();
		moiInit();
		aLAvanceInit();
		acheterInit();
		appelerInit();
		apres1Init();
		apres2Init();
		apres3Init();
		apres4Init();
		apres5Init();
		plusTardInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
		leconRecherche_frFRInit();
		leconRecherche_enUSInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaine(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(intro != null)
			intro.setRequeteSite_(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(aLAvance != null)
			aLAvance.setRequeteSite_(requeteSite_);
		if(acheter != null)
			acheter.setRequeteSite_(requeteSite_);
		if(appeler != null)
			appeler.setRequeteSite_(requeteSite_);
		if(apres1 != null)
			apres1.setRequeteSite_(requeteSite_);
		if(apres2 != null)
			apres2.setRequeteSite_(requeteSite_);
		if(apres3 != null)
			apres3.setRequeteSite_(requeteSite_);
		if(apres4 != null)
			apres4.setRequeteSite_(requeteSite_);
		if(apres5 != null)
			apres5.setRequeteSite_(requeteSite_);
		if(plusTard != null)
			plusTard.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaine(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaine(String var) {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;
		switch(var) {
			case "intro":
				return oC001L001ChoisirNomDomaine.intro;
			case "moi":
				return oC001L001ChoisirNomDomaine.moi;
			case "aLAvance":
				return oC001L001ChoisirNomDomaine.aLAvance;
			case "acheter":
				return oC001L001ChoisirNomDomaine.acheter;
			case "appeler":
				return oC001L001ChoisirNomDomaine.appeler;
			case "apres1":
				return oC001L001ChoisirNomDomaine.apres1;
			case "apres2":
				return oC001L001ChoisirNomDomaine.apres2;
			case "apres3":
				return oC001L001ChoisirNomDomaine.apres3;
			case "apres4":
				return oC001L001ChoisirNomDomaine.apres4;
			case "apres5":
				return oC001L001ChoisirNomDomaine.apres5;
			case "plusTard":
				return oC001L001ChoisirNomDomaine.plusTard;
			case "recapituler1":
				return oC001L001ChoisirNomDomaine.recapituler1;
			case "recapituler2":
				return oC001L001ChoisirNomDomaine.recapituler2;
			case "recapituler3":
				return oC001L001ChoisirNomDomaine.recapituler3;
			case "leconRecherche_frFR":
				return oC001L001ChoisirNomDomaine.leconRecherche_frFR;
			case "leconRecherche_enUS":
				return oC001L001ChoisirNomDomaine.leconRecherche_enUS;
			default:
				return super.obtenirC001Lecon(var);
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
				o = attribuerC001L001ChoisirNomDomaine(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaine(String var, Object val) {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;
		switch(var) {
			default:
				return super.attribuerC001Lecon(var, val);
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
					o = definirC001L001ChoisirNomDomaine(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaine(String var, String val) {
		switch(var) {
			default:
				return super.definirC001Lecon(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
			{
				new File("/usr/local/src/computate.org-static/png/frFR/cours/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/001-choisir-nom-domaine?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/001-choisir-nom-domaine-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/001-choisir-nom-domaine-999.png"));
				System.out.println("C001L001ChoisirNomDomaineFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/001-choose-domain-name?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/001-choose-domain-name-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/001-choose-domain-name-999.png"));
				System.out.println("C001L001ChoisirNomDomaineEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L001ChoisirNomDomaine o = new C001L001ChoisirNomDomaine();
			o.requeteSiteC001L001ChoisirNomDomaine(requeteSite);
			o.initLoinC001L001ChoisirNomDomaine(requeteSite);
			o.indexerC001L001ChoisirNomDomaine();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L001ChoisirNomDomaine();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L001ChoisirNomDomaine(document);
	}

	public void indexerC001L001ChoisirNomDomaine(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L001ChoisirNomDomaine(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L001ChoisirNomDomaine() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L001ChoisirNomDomaine(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L001ChoisirNomDomaine(SolrInputDocument document) {
		if(leconRecherche_frFR != null) {
			for(String o : leconRecherche_frFR) {
				document.addField("leconRecherche_frFR_text_frFR", o);
			}
		}
		if(leconRecherche_enUS != null) {
			for(String o : leconRecherche_enUS) {
				document.addField("leconRecherche_enUS_text_enUS", o);
			}
		}
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L001ChoisirNomDomaine() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L001ChoisirNomDomaine(siteContexte.getRequeteSite_());
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
		stockerC001L001ChoisirNomDomaine(solrDocument);
	}
	public void stockerC001L001ChoisirNomDomaine(SolrDocument solrDocument) {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;

		List<String> leconRecherche_frFR = (List<String>)solrDocument.get("leconRecherche_frFR_stored_strings");
		if(leconRecherche_frFR != null)
			oC001L001ChoisirNomDomaine.leconRecherche_frFR.addAll(leconRecherche_frFR);

		List<String> leconRecherche_enUS = (List<String>)solrDocument.get("leconRecherche_enUS_stored_strings");
		if(leconRecherche_enUS != null)
			oC001L001ChoisirNomDomaine.leconRecherche_enUS.addAll(leconRecherche_enUS);

		super.stockerC001Lecon(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaine();
		super.htmlBody();
	}

	public void htmlBodyC001L001ChoisirNomDomaine() {
		((C001L001ChoisirNomDomaine)this).htmlBodyIntro();
		((C001L001ChoisirNomDomaine)this).htmlBodyMoi();
		((C001L001ChoisirNomDomaine)this).htmlBodyALAvance();
		((C001L001ChoisirNomDomaine)this).htmlBodyAcheter();
		((C001L001ChoisirNomDomaine)this).htmlBodyAppeler();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres1();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres2();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres3();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres4();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres5();
		((C001L001ChoisirNomDomaine)this).htmlBodyPlusTard();
		((C001L001ChoisirNomDomaine)this).htmlBodyRecapituler1();
		((C001L001ChoisirNomDomaine)this).htmlBodyRecapituler2();
		((C001L001ChoisirNomDomaine)this).htmlBodyRecapituler3();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L001ChoisirNomDomaine();
	}

	public void htmlBodyCourtC001L001ChoisirNomDomaine() {
		if(intro != null)
			intro.htmlBodyCourt();
		if(moi != null)
			moi.htmlBodyCourt();
		if(aLAvance != null)
			aLAvance.htmlBodyCourt();
		if(acheter != null)
			acheter.htmlBodyCourt();
		if(appeler != null)
			appeler.htmlBodyCourt();
		if(apres1 != null)
			apres1.htmlBodyCourt();
		if(apres2 != null)
			apres2.htmlBodyCourt();
		if(apres3 != null)
			apres3.htmlBodyCourt();
		if(apres4 != null)
			apres4.htmlBodyCourt();
		if(apres5 != null)
			apres5.htmlBodyCourt();
		if(plusTard != null)
			plusTard.htmlBodyCourt();
		if(recapituler1 != null)
			recapituler1.htmlBodyCourt();
		if(recapituler2 != null)
			recapituler2.htmlBodyCourt();
		if(recapituler3 != null)
			recapituler3.htmlBodyCourt();
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
		if(!(o instanceof C001L001ChoisirNomDomaine))
			return false;
		C001L001ChoisirNomDomaine that = (C001L001ChoisirNomDomaine)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaine {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L001ChoisirNomDomaineVals = new String[] { introP1, introP2, moiP1, moiP2, moiP3, aLAvanceH3I1, aLAvanceH3Span1, aLAvanceH4I1, aLAvanceH4Span1, aLAvanceP1, aLAvanceP2, aLAvanceP3, aLAvanceP4, aLAvanceP5, acheterH3I1, acheterH3Span1, acheterH4I1, acheterH4Span1, acheterPSpan11, acheterPSpan12, acheterPSpan1A11, acheterPSpan21, acheterPSpan22, acheterPSpan2A21, acheterPSpan31, appelerH3I1, appelerH3Span1, appelerH4I1, appelerH4Span1, appelerP1, appelerP2, appelerP3, appelerP4, apres1H3I1, apres1H3Span1, apres1H4I1, apres1H4Span1, apres1PSpan11, apres1PSpan12, apres1PSpan1A1, apres1PSpan21, apres2UlLi11, apres2UlLi21, apres2UlLi31, apres2UlLi32, apres2UlLi33, apres2UlLi41, apres3UlLi11, apres3UlLi12, apres4UlLi11, apres4UlLi12, apres4UlLi13, apres5UlLi11, apres5UlLi12, apres5UlLi13, apres5UlLi14, plusTardH3I1, plusTardH3Span1, plusTardH4I1, plusTardH4Span1, plusTardP1, plusTardP2, plusTardP3, plusTardP4, plusTardP5, plusTardP6, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr1Td1I1, recapituler3TableTr1Td21, recapituler3TableTr1Td3I1, recapituler3TableTr1Td41, recapituler3TableTr2Td1I1, recapituler3TableTr2Td21, recapituler3TableTr2Td3I1, recapituler3TableTr2Td41, recapituler3TableTr3Td1I1, recapituler3TableTr3Td21, recapituler3TableTr3Td3I1, recapituler3TableTr3Td41, recapituler3TableTr4Td1I1, recapituler3TableTr4Td21, recapituler3TableTr4Td3I1, recapituler3TableTr4Td41, recapituler3TableTr5Td1I1, recapituler3TableTr5Td21, recapituler3TableTr5Td3I1, recapituler3TableTr5Td41, recapituler3TableTr6Td1I1, recapituler3TableTr6Td21, recapituler3TableTr6Td3I1, recapituler3TableTr6Td41 };
}
