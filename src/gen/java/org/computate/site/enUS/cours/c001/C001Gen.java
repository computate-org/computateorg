package org.computate.site.enUS.cours.c001;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
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

import java.util.List;
import org.computate.site.enUS.cours.Cours;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001Gen<DEV> extends Cours {

	public static final String C001_UnNom = "a course #1";
	public static final String C001_Ce = "this ";
	public static final String C001_CeNom = "this course #1";
	public static final String C001_Un = "an ";
	public static final String C001_LeNom = "the course #1";
	public static final String C001_NomSingulier = "course #1";
	public static final String C001_NomPluriel = "course #1s";
	public static final String C001_NomActuel = "current course #1";
	public static final String C001_TousNom = "the course #1s";
	public static final String C001_RechercherTousNomPar = "search course #1s by ";
	public static final String C001_H1 = "Build modern asynchronous web applications with the best open source software. ";
	public static final String C001_H2 = "With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. ";
	public static final String C001_Titre = "Build modern asynchronous web applications with the best open source software. ";
	public static final String C001_LesNoms = "the course #1s";
	public static final String C001_AucunNomTrouve = "no course #1 found";
	public static final String C001_NomVar = "course#1";
	public static final String C001_DeNom = "of course #1";
	public static final String C001_Couleur = "green";
	public static final String C001_IconeGroupe = "regular";
	public static final String C001_IconeNom = "university";
	public static final String C001FrFRPage_Uri = "/frFR/cours/001";
	public static final String C001FrFRPage_ImageUri = "/png/frFR/cours/001-999.png";
	public static final String C001EnUSPage_Uri = "/enUS/course/001";
	public static final String C001EnUSPage_ImageUri = "/png/enUS/course/001-999.png";

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001 = false;

	public C001 initLoinC001(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001) {
			dejaInitialiseC001 = true;
			initLoinC001();
		}
		return (C001)this;
	}

	public void initLoinC001() {
		super.initLoinCours(requeteSite_);
		initC001();
	}

	public void initC001() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteCours(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001(String var) {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.obtenirCours(var);
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
				o = attribuerC001(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001(String var, Object val) {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.attribuerCours(var, val);
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
					o = definirC001(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001(String var, String val) {
		switch(var) {
			default:
				return super.definirCours(var, val);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.C001"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001 o = new C001();
			o.requeteSiteC001(requeteSite);
			o.initLoinC001(requeteSite);
			o.indexerC001();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001(document);
	}

	public void indexerC001(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001(SolrInputDocument document) {
		super.indexerCours(document);

	}

	public void desindexerC001() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001(siteContexte.getRequeteSite_());
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
		stockerC001(solrDocument);
	}
	public void stockerC001(SolrDocument solrDocument) {
		C001 oC001 = (C001)this;

		super.stockerCours(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001();
		super.htmlBody();
	}

	public void htmlBodyC001() {
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
		if(!(o instanceof C001))
			return false;
		C001 that = (C001)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001 {");
		sb.append(" }");
		return sb.toString();
	}
}
