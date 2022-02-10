package org.computate.site.enUS.page.accueil;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.page.parti.PageParagraphe;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.computate.site.enUS.page.parti.PagePart;
import java.lang.String;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilGen<DEV> extends Article {

	public static final String PageAccueil_H1 = "Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ";
	public static final String PageAccueil_H2 = "Flexible PostgreSQL database, Solr search integration, OpenAPI 3 standards, completely asynchronous Vert.x code, deployed on Red Hat OpenShift, for the very best, 100% open source solutions. ";
	public static final String PageAccueil_Titre = "Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ";
	public static final String PageAccueil_Couleur = "green";
	public static final String PageAccueil_IconeGroupe = "regular";
	public static final String PageAccueil_IconeNom = "book";
	public static final String PageAccueilFrFRPage_Uri = "/frFR";
	public static final String PageAccueilFrFRPage_ImageUri = "/png/frFR-999.png";
	public static final String PageAccueilEnUSPage_Uri = "/";
	public static final String PageAccueilEnUSPage_ImageUri = "/png/-999.png";

	//////////////////
	// pageUri_enUS //
	//////////////////

	/**	L'entité « pageUri_enUS »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUri_enUS;
	public Couverture<String> pageUri_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_enUS").o(pageUri_enUS);

	/**	<br/>L'entité « pageUri_enUS »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri_enUS(Couverture<String> c);

	public String getPageUri_enUS() {
		return pageUri_enUS;
	}

	public void setPageUri_enUS(String pageUri_enUS) {
		this.pageUri_enUS = pageUri_enUS;
		this.pageUri_enUSCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageUri_enUS() {
		return pageUri_enUS;
	}

	public String strPageUri_enUS() {
		return pageUri_enUS == null ? "" : pageUri_enUS;
	}

	public String nomAffichagePageUri_enUS() {
		return null;
	}

	public String htmTooltipPageUri_enUS() {
		return null;
	}

	public String htmPageUri_enUS() {
		return pageUri_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri_enUS());
	}

	//////////////////
	// pageUri_frFR //
	//////////////////

	/**	L'entité « pageUri_frFR »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUri_frFR;
	public Couverture<String> pageUri_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_frFR").o(pageUri_frFR);

	/**	<br/>L'entité « pageUri_frFR »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri_frFR(Couverture<String> c);

	public String getPageUri_frFR() {
		return pageUri_frFR;
	}

	public void setPageUri_frFR(String pageUri_frFR) {
		this.pageUri_frFR = pageUri_frFR;
		this.pageUri_frFRCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageUri_frFR() {
		return pageUri_frFR;
	}

	public String strPageUri_frFR() {
		return pageUri_frFR == null ? "" : pageUri_frFR;
	}

	public String nomAffichagePageUri_frFR() {
		return null;
	}

	public String htmTooltipPageUri_frFR() {
		return null;
	}

	public String htmPageUri_frFR() {
		return pageUri_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri_frFR());
	}

	///////////////////////
	// pageImageUri_enUS //
	///////////////////////

	/**	L'entité « pageImageUri_enUS »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageImageUri_enUS;
	public Couverture<String> pageImageUri_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri_enUS").o(pageImageUri_enUS);

	/**	<br/>L'entité « pageImageUri_enUS »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageImageUri_enUS">Trouver l'entité pageImageUri_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri_enUS(Couverture<String> c);

	public String getPageImageUri_enUS() {
		return pageImageUri_enUS;
	}

	public void setPageImageUri_enUS(String pageImageUri_enUS) {
		this.pageImageUri_enUS = pageImageUri_enUS;
		this.pageImageUri_enUSCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageImageUri_enUSInit() {
		if(!pageImageUri_enUSCouverture.dejaInitialise) {
			_pageImageUri_enUS(pageImageUri_enUSCouverture);
			if(pageImageUri_enUS == null)
				setPageImageUri_enUS(pageImageUri_enUSCouverture.o);
		}
		pageImageUri_enUSCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageImageUri_enUS() {
		return pageImageUri_enUS;
	}

	public String strPageImageUri_enUS() {
		return pageImageUri_enUS == null ? "" : pageImageUri_enUS;
	}

	public String nomAffichagePageImageUri_enUS() {
		return null;
	}

	public String htmTooltipPageImageUri_enUS() {
		return null;
	}

	public String htmPageImageUri_enUS() {
		return pageImageUri_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri_enUS());
	}

	///////////////////////
	// pageImageUri_frFR //
	///////////////////////

	/**	L'entité « pageImageUri_frFR »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageImageUri_frFR;
	public Couverture<String> pageImageUri_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri_frFR").o(pageImageUri_frFR);

	/**	<br/>L'entité « pageImageUri_frFR »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageImageUri_frFR">Trouver l'entité pageImageUri_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri_frFR(Couverture<String> c);

	public String getPageImageUri_frFR() {
		return pageImageUri_frFR;
	}

	public void setPageImageUri_frFR(String pageImageUri_frFR) {
		this.pageImageUri_frFR = pageImageUri_frFR;
		this.pageImageUri_frFRCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageImageUri_frFRInit() {
		if(!pageImageUri_frFRCouverture.dejaInitialise) {
			_pageImageUri_frFR(pageImageUri_frFRCouverture);
			if(pageImageUri_frFR == null)
				setPageImageUri_frFR(pageImageUri_frFRCouverture.o);
		}
		pageImageUri_frFRCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageImageUri_frFR() {
		return pageImageUri_frFR;
	}

	public String strPageImageUri_frFR() {
		return pageImageUri_frFR == null ? "" : pageImageUri_frFR;
	}

	public String nomAffichagePageImageUri_frFR() {
		return null;
	}

	public String htmTooltipPageImageUri_frFR() {
		return null;
	}

	public String htmPageImageUri_frFR() {
		return pageImageUri_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri_frFR());
	}

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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
	protected PageAccueil listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	///////////
	// intro //
	///////////

	public static final String introP1 = "Are you thinking about launching your own website? ";
	public static final String introP2 = "Learn with me, how to create your very own web site the open source way. ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:intro">Trouver l'entité intro dans Solr</a>
	 * <br/>
	 * @param intro est l'entité déjà construit. 
	 **/
	protected abstract void _intro(PageParagraphe o);

	public PageParagraphe getIntro() {
		return intro;
	}

	public void setIntro(PageParagraphe intro) {
		this.intro = intro;
		this.introCouverture.dejaInitialise = true;
	}
	protected PageAccueil introInit() {
		if(intro != null) {
			((PageAccueil)this).avantPagePart(intro, "intro");
			((PageAccueil)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}
	public void htmlBodyIntro(PageParagraphe o) {
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
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
	 * <br/>
	 * @param moi est l'entité déjà construit. 
	 **/
	protected abstract void _moi(PageParagraphe o);

	public PageParagraphe getMoi() {
		return moi;
	}

	public void setMoi(PageParagraphe moi) {
		this.moi = moi;
		this.moiCouverture.dejaInitialise = true;
	}
	protected PageAccueil moiInit() {
		if(moi != null) {
			((PageAccueil)this).avantPagePart(moi, "moi");
			((PageAccueil)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}
	public void htmlBodyMoi(PageParagraphe o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueil = false;

	public PageAccueil initLoinPageAccueil(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueil) {
			dejaInitialisePageAccueil = true;
			initLoinPageAccueil();
		}
		return (PageAccueil)this;
	}

	public void initLoinPageAccueil() {
		super.initLoinArticle(requeteSite_);
		initPageAccueil();
	}

	public void initPageAccueil() {
		pageUri_enUSInit();
		pageUri_frFRInit();
		pageImageUri_enUSInit();
		pageImageUri_frFRInit();
		listeArticleInit();
		introInit();
		moiInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAccueil(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueil(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(intro != null)
			intro.setRequeteSite_(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAccueil(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueil(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueil(String var) {
		PageAccueil oPageAccueil = (PageAccueil)this;
		switch(var) {
			case "pageUri_enUS":
				return oPageAccueil.pageUri_enUS;
			case "pageUri_frFR":
				return oPageAccueil.pageUri_frFR;
			case "pageImageUri_enUS":
				return oPageAccueil.pageImageUri_enUS;
			case "pageImageUri_frFR":
				return oPageAccueil.pageImageUri_frFR;
			case "listeArticle":
				return oPageAccueil.listeArticle;
			case "intro":
				return oPageAccueil.intro;
			case "moi":
				return oPageAccueil.moi;
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
				o = attribuerPageAccueil(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueil(String var, Object val) {
		PageAccueil oPageAccueil = (PageAccueil)this;
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
					o = definirPageAccueil(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueil(String var, String val) {
		switch(var) {
			default:
				return super.definirArticle(var, val);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.accueil.PageAccueil"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageAccueil o = new PageAccueil();
			o.requeteSitePageAccueil(requeteSite);
			o.initLoinPageAccueil(requeteSite);
			o.indexerPageAccueil();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerPageAccueil();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerPageAccueil(document);
	}

	public void indexerPageAccueil(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageAccueil(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageAccueil() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPageAccueil(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPageAccueil(SolrInputDocument document) {
		super.indexerArticle(document);

	}

	public void desindexerPageAccueil() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinPageAccueil(siteContexte.getRequeteSite_());
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
		stockerPageAccueil(solrDocument);
	}
	public void stockerPageAccueil(SolrDocument solrDocument) {
		PageAccueil oPageAccueil = (PageAccueil)this;

		super.stockerArticle(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAccueil();
		super.htmlBody();
	}

	public void htmlBodyPageAccueil() {
		((PageAccueil)this).htmlBodyIntro();
		((PageAccueil)this).htmlBodyMoi();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAccueil();
	}

	public void htmlBodyCourtPageAccueil() {
		if(intro != null)
			intro.htmlBodyCourt();
		if(moi != null)
			moi.htmlBodyCourt();
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
		if(!(o instanceof PageAccueil))
			return false;
		PageAccueil that = (PageAccueil)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueil {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageAccueilVals = new String[] { introP1, introP2, moiP1, moiP2 };
}
