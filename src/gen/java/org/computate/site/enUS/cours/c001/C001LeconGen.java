package org.computate.site.enUS.cours.c001;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;

import java.util.Date;

import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cours.c001.C001;
import java.util.ArrayList;
import java.util.Locale;
import java.time.ZoneOffset;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;

import java.time.Instant;
import java.time.ZoneId;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import java.time.format.DateTimeFormatter;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconGen<DEV> extends C001 {

	public static final String C001Lecon_UnNom = "a lesson";
	public static final String C001Lecon_Ce = "this ";
	public static final String C001Lecon_CeNom = "this lesson";
	public static final String C001Lecon_Un = "an ";
	public static final String C001Lecon_LeNom = "the lesson";
	public static final String C001Lecon_NomSingulier = "lesson";
	public static final String C001Lecon_NomPluriel = "lessons";
	public static final String C001Lecon_NomActuel = "current lesson";
	public static final String C001Lecon_TousNom = "the lessons";
	public static final String C001Lecon_RechercherTousNomPar = "search lessons by ";
	public static final String C001Lecon_LesNoms = "the lessons";
	public static final String C001Lecon_AucunNomTrouve = "no lesson found";
	public static final String C001Lecon_NomVar = "lesson";
	public static final String C001Lecon_DeNom = "of lesson";
	public static final String C001Lecon_Couleur = "green";
	public static final String C001Lecon_IconeGroupe = "regular";
	public static final String C001Lecon_IconeNom = "book";
	public static final String C001LeconFrFRPage_Uri = "/frFR/cours/001/lecons";
	public static final String C001LeconFrFRPage_ImageUri = "/png/frFR/cours/001/lecons-999.png";
	public static final String C001LeconEnUSPage_Uri = "/enUS/course/001/lessons";
	public static final String C001LeconEnUSPage_ImageUri = "/png/enUS/course/001/lessons-999.png";

	///////////////
	// leconCree //
	///////////////

	/**	L'entité « leconCree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime leconCree;
	public Couverture<LocalDateTime> leconCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("leconCree").o(leconCree);

	/**	<br/>L'entité « leconCree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:leconCree">Trouver l'entité leconCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _leconCree(Couverture<LocalDateTime> c);

	public LocalDateTime getLeconCree() {
		return leconCree;
	}

	public void setLeconCree(LocalDateTime leconCree) {
		this.leconCree = leconCree;
		this.leconCreeCouverture.dejaInitialise = true;
	}
	public C001Lecon setLeconCree(Instant o) {
		this.leconCree = LocalDateTime.from(o);
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public C001Lecon setLeconCree(String o) {
		this.leconCree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	public C001Lecon setLeconCree(Date o) {
		this.leconCree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	protected C001Lecon leconCreeInit() {
		if(!leconCreeCouverture.dejaInitialise) {
			_leconCree(leconCreeCouverture);
			if(leconCree == null)
				setLeconCree(leconCreeCouverture.o);
		}
		leconCreeCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	public Date solrLeconCree() {
		return leconCree == null ? null : Date.from(leconCree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strLeconCree() {
		return leconCree == null ? "" : leconCree.toString();
	}

	public String nomAffichageLeconCree() {
		return null;
	}

	public String htmTooltipLeconCree() {
		return null;
	}

	public String htmLeconCree() {
		return leconCree == null ? "" : StringEscapeUtils.escapeHtml4(strLeconCree());
	}

	/////////////////
	// leconsACote //
	/////////////////

	/**	L'entité « leconsACote »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 */
	protected ListeRecherche<Article> leconsACote = new ListeRecherche<Article>();
	public Couverture<ListeRecherche<Article>> leconsACoteCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("leconsACote").o(leconsACote);

	/**	<br/>L'entité « leconsACote »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:leconsACote">Trouver l'entité leconsACote dans Solr</a>
	 * <br/>
	 * @param leconsACote est l'entité déjà construit. 
	 **/
	protected abstract void _leconsACote(ListeRecherche<Article> o);

	public ListeRecherche<Article> getLeconsACote() {
		return leconsACote;
	}

	public void setLeconsACote(ListeRecherche<Article> leconsACote) {
		this.leconsACote = leconsACote;
		this.leconsACoteCouverture.dejaInitialise = true;
	}
	protected C001Lecon leconsACoteInit() {
		if(!leconsACoteCouverture.dejaInitialise) {
			_leconsACote(leconsACote);
		}
		leconsACote.initLoinPourClasse(requeteSite_);
		leconsACoteCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001Lecon = false;

	public C001Lecon initLoinC001Lecon(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001Lecon) {
			dejaInitialiseC001Lecon = true;
			initLoinC001Lecon();
		}
		return (C001Lecon)this;
	}

	public void initLoinC001Lecon() {
		super.initLoinC001(requeteSite_);
		initC001Lecon();
	}

	public void initC001Lecon() {
		leconCreeInit();
		leconsACoteInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001Lecon(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001Lecon(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001(requeteSite_);
		if(leconsACote != null)
			leconsACote.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001Lecon(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001Lecon(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001Lecon(String var) {
		C001Lecon oC001Lecon = (C001Lecon)this;
		switch(var) {
			case "leconCree":
				return oC001Lecon.leconCree;
			case "leconsACote":
				return oC001Lecon.leconsACote;
			default:
				return super.obtenirC001(var);
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
				o = attribuerC001Lecon(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001Lecon(String var, Object val) {
		C001Lecon oC001Lecon = (C001Lecon)this;
		switch(var) {
			default:
				return super.attribuerC001(var, val);
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
					o = definirC001Lecon(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001Lecon(String var, String val) {
		switch(var) {
			default:
				return super.definirC001(var, val);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.C001Lecon"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001Lecon o = new C001Lecon();
			o.requeteSiteC001Lecon(requeteSite);
			o.initLoinC001Lecon(requeteSite);
			o.indexerC001Lecon();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001Lecon();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001Lecon(document);
	}

	public void indexerC001Lecon(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001Lecon(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001Lecon() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001Lecon(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001Lecon(SolrInputDocument document) {
		if(leconCree != null) {
			document.addField("leconCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(leconCree.atOffset(ZoneOffset.UTC)));
			document.addField("leconCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(leconCree.atOffset(ZoneOffset.UTC)));
		}
		super.indexerC001(document);

	}

	public void desindexerC001Lecon() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001Lecon(siteContexte.getRequeteSite_());
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
		stockerC001Lecon(solrDocument);
	}
	public void stockerC001Lecon(SolrDocument solrDocument) {
		C001Lecon oC001Lecon = (C001Lecon)this;

		Date leconCree = (Date)solrDocument.get("leconCree_stored_date");
		if(leconCree != null)
			oC001Lecon.setLeconCree(leconCree);

		super.stockerC001(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001Lecon();
		super.htmlBody();
	}

	public void htmlBodyC001Lecon() {
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
		if(!(o instanceof C001Lecon))
			return false;
		C001Lecon that = (C001Lecon)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001Lecon {");
		sb.append(" }");
		return sb.toString();
	}
}
