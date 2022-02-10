package org.computate.site.enUS.page.faq;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqGen<DEV> extends Article {

	public static final String PageFaq_H1 = "Have some questions about computate.org? ";
	public static final String PageFaq_H2 = "computate.org frequently asked questions (FAQ). ";
	public static final String PageFaq_Titre = "Have some questions about computate.org? computate.org frequently asked questions (FAQ). ";
	public static final String PageFaq_Couleur = "green";
	public static final String PageFaq_IconeGroupe = "regular";
	public static final String PageFaq_IconeNom = "question";
	public static final String PageFaqFrFRPage_Uri = "/frFR/faq";
	public static final String PageFaqFrFRPage_ImageUri = "/png/frFR/faq-999.png";
	public static final String PageFaqEnUSPage_Uri = "/enUS/faq";
	public static final String PageFaqEnUSPage_ImageUri = "/png/enUS/faq-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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
	protected PageFaq listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageFaq)this;
	}

	//////////
	// i18n //
	//////////

	public static final String i18nH3Span1 = "Why is your site in French and English? ";
	public static final String i18nH3Span = i18nH3Span1;
	public static final String i18nH4Span1 = "Internationalization is important and the world deserves good software documentation. ";
	public static final String i18nH4Span = i18nH4Span1;
	public static final String i18nPDiv1I1 = "fas fa-comments";
	public static final String i18nPDiv1I = i18nPDiv1I1;
	public static final String i18nPDiv1Span1 = "I've spent four and a half years in French speaking countries and it's important for me to practice my French. ";
	public static final String i18nPDiv1Span = i18nPDiv1Span1;
	public static final String i18nPDiv2I1 = "fas fa-heart-square";
	public static final String i18nPDiv2I = i18nPDiv2I1;
	public static final String i18nPDiv2Span1 = "I love the French and the time I spent in France, and I love the Québécois and the time I spent in Québec. ";
	public static final String i18nPDiv2Span = i18nPDiv2Span1;
	public static final String i18nPDiv3I1 = "fas fa-robot";
	public static final String i18nPDiv3I = i18nPDiv3I1;
	public static final String i18nPDiv3Span1 = "I know the challenges building good software systems where the country speaks another language besides English. ";
	public static final String i18nPDiv3Span = i18nPDiv3Span1;
	public static final String i18nPDiv4I1 = "fas fa-window-restore";
	public static final String i18nPDiv4I = i18nPDiv4I1;
	public static final String i18nPDiv4Span1 = "Computate.org breaks those barriers and provides a consistent documentation in French and English and other languages in the future. ";
	public static final String i18nPDiv4Span = i18nPDiv4Span1;

	/**	L'entité « i18n »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml i18n = new PageHtml();
	public Couverture<PageHtml> i18nCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("i18n").o(i18n);

	/**	<br/>L'entité « i18n »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:i18n">Trouver l'entité i18n dans Solr</a>
	 * <br/>
	 * @param i18n est l'entité déjà construit. 
	 **/
	protected abstract void _i18n(PageHtml o);

	public PageHtml getI18n() {
		return i18n;
	}

	public void setI18n(PageHtml i18n) {
		this.i18n = i18n;
		this.i18nCouverture.dejaInitialise = true;
	}
	protected PageFaq i18nInit() {
		if(i18n != null) {
			((PageFaq)this).avantPagePart(i18n, "i18n");
			((PageFaq)this).avantPagePart(i18n, "i18n");
		}
		if(!i18nCouverture.dejaInitialise) {
			_i18n(i18n);
		}
		i18n.initLoinPourClasse(requeteSite_);
		i18nCouverture.dejaInitialise(true);
		return (PageFaq)this;
	}
	public void htmlBodyI18n(PageHtml o) {
		{ e("h3").a("class", " i18nH3 ").f();
			{ e("span").a("class", " i18nH3Span ").f();
				sx(i18nH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " i18nH4 ").f();
			{ e("span").a("class", " i18nH4Span ").f();
				sx(i18nH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " i18nP ").f();
			{ e("div").a("class", " i18nPDiv1 i18nPDiv odd ").f();
				{ e("i").a("class", i18nPDiv1I1, " site-menu-icon i18nPDiv1I ").f();
				} g("i");
				{ e("span").a("class", " i18nPDiv1Span ").f();
					sx(i18nPDiv1Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " i18nPDiv2 i18nPDiv even ").f();
				{ e("i").a("class", i18nPDiv2I1, " site-menu-icon i18nPDiv2I ").f();
				} g("i");
				{ e("span").a("class", " i18nPDiv2Span ").f();
					sx(i18nPDiv2Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " i18nPDiv3 i18nPDiv odd ").f();
				{ e("i").a("class", i18nPDiv3I1, " site-menu-icon i18nPDiv3I ").f();
				} g("i");
				{ e("span").a("class", " i18nPDiv3Span ").f();
					sx(i18nPDiv3Span1);
				} g("span");
			} g("div");
			{ e("div").a("class", " i18nPDiv4 i18nPDiv even ").f();
				{ e("i").a("class", i18nPDiv4I1, " site-menu-icon i18nPDiv4I ").f();
				} g("i");
				{ e("span").a("class", " i18nPDiv4Span ").f();
					sx(i18nPDiv4Span1);
				} g("span");
			} g("div");
		} g("p");
	}
	public void htmlBodyI18n() {
		i18n.htmlAvant();
		htmlBodyI18n(i18n);
		i18n.htmlApres();
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11 = "Tuesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fas fa-question";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "fas fa-megaphone";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 23 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "FAQ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "computate.org frequently asked questions";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected PageFaq recapituler2Init() {
		if(recapituler2 != null) {
			((PageFaq)this).avantPagePart(recapituler2, "recapituler2");
			((PageFaq)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (PageFaq)this;
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
	public static final String recapituler3TableTr2Td1I1 = "fas fa-archway";
	public static final String recapituler3TableTr2Td1I = recapituler3TableTr2Td1I1;
	public static final String recapituler3TableTr2Td21 = "Why is your site in French? ";
	public static final String recapituler3TableTr2Td2 = recapituler3TableTr2Td21;
	public static final String recapituler3TableTr2Td3I1 = "fas fa-book-spells";
	public static final String recapituler3TableTr2Td3I = recapituler3TableTr2Td3I1;
	public static final String recapituler3TableTr2Td41 = "Internationalization is important. ";
	public static final String recapituler3TableTr2Td4 = recapituler3TableTr2Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected PageFaq recapituler3Init() {
		if(recapituler3 != null) {
			((PageFaq)this).avantPagePart(recapituler3, "recapituler3");
			((PageFaq)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (PageFaq)this;
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

	protected boolean dejaInitialisePageFaq = false;

	public PageFaq initLoinPageFaq(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaq) {
			dejaInitialisePageFaq = true;
			initLoinPageFaq();
		}
		return (PageFaq)this;
	}

	public void initLoinPageFaq() {
		super.initLoinArticle(requeteSite_);
		initPageFaq();
	}

	public void initPageFaq() {
		listeArticleInit();
		i18nInit();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageFaq(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaq(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(i18n != null)
			i18n.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageFaq(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaq(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaq(String var) {
		PageFaq oPageFaq = (PageFaq)this;
		switch(var) {
			case "listeArticle":
				return oPageFaq.listeArticle;
			case "i18n":
				return oPageFaq.i18n;
			case "recapituler2":
				return oPageFaq.recapituler2;
			case "recapituler3":
				return oPageFaq.recapituler3;
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
				o = attribuerPageFaq(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaq(String var, Object val) {
		PageFaq oPageFaq = (PageFaq)this;
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
					o = definirPageFaq(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaq(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/faq?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/faq-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/faq-999.png"));
				System.out.println("PageFaqFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/faq?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/faq-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/faq-999.png"));
				System.out.println("PageFaqEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.faq.PageFaq"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageFaq o = new PageFaq();
			o.requeteSitePageFaq(requeteSite);
			o.initLoinPageFaq(requeteSite);
			o.indexerPageFaq();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerPageFaq();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerPageFaq(document);
	}

	public void indexerPageFaq(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageFaq(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageFaq() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageFaq(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageFaq(SolrInputDocument document) {
		super.indexerArticle(document);

	}

	public void desindexerPageFaq() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinPageFaq(siteContexte.getRequeteSite_());
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
		stockerPageFaq(solrDocument);
	}
	public void stockerPageFaq(SolrDocument solrDocument) {
		PageFaq oPageFaq = (PageFaq)this;

		super.stockerArticle(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageFaq();
	}

	public void htmlBodyCourtPageFaq() {
		if(i18n != null)
			i18n.htmlBodyCourt();
		if(recapituler2 != null)
			recapituler2.htmlBodyCourt();
		if(recapituler3 != null)
			recapituler3.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaq();
		super.htmlBody();
	}

	public void htmlBodyPageFaq() {
		((PageFaq)this).htmlBodyI18n();
		((PageFaq)this).htmlBodyRecapituler2();
		((PageFaq)this).htmlBodyRecapituler3();
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
		if(!(o instanceof PageFaq))
			return false;
		PageFaq that = (PageFaq)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageFaq {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageFaqVals = new String[] { i18nH3Span1, i18nH4Span1, i18nPDiv1I1, i18nPDiv1Span1, i18nPDiv2I1, i18nPDiv2Span1, i18nPDiv3I1, i18nPDiv3Span1, i18nPDiv4I1, i18nPDiv4Span1, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr1Td1I1, recapituler3TableTr1Td21, recapituler3TableTr1Td3I1, recapituler3TableTr1Td41, recapituler3TableTr2Td1I1, recapituler3TableTr2Td21, recapituler3TableTr2Td3I1, recapituler3TableTr2Td41 };
}
