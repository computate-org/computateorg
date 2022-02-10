package org.computate.site.enUS.utilisateur;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.site.enus.model.base.ClusterEnUSPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.enUS.user.UtilisateurSiteEnUSGenPage;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;

import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class UtilisateurSiteEnUSGenPageGen<DEV> extends ClusterEnUSPage {

	//////////////////////////
	// listeUtilisateurSite //
	//////////////////////////

	/**	L'entité « listeUtilisateurSite »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<UtilisateurSite> listeUtilisateurSite;
	public Couverture<ListeRecherche<UtilisateurSite>> listeUtilisateurSiteCouverture = new Couverture<ListeRecherche<UtilisateurSite>>().p(this).c(ListeRecherche.class).var("listeUtilisateurSite").o(listeUtilisateurSite);

	/**	<br/>L'entité « listeUtilisateurSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeUtilisateurSite">Trouver l'entité listeUtilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeUtilisateurSite(Couverture<ListeRecherche<UtilisateurSite>> c);

	public ListeRecherche<UtilisateurSite> getListeUtilisateurSite() {
		return listeUtilisateurSite;
	}

	public void setListeUtilisateurSite(ListeRecherche<UtilisateurSite> listeUtilisateurSite) {
		this.listeUtilisateurSite = listeUtilisateurSite;
		this.listeUtilisateurSiteCouverture.dejaInitialise = true;
	}
	protected UtilisateurSiteEnUSGenPage listeUtilisateurSiteInit() {
		if(!listeUtilisateurSiteCouverture.dejaInitialise) {
			_listeUtilisateurSite(listeUtilisateurSiteCouverture);
			if(listeUtilisateurSite == null)
				setListeUtilisateurSite(listeUtilisateurSiteCouverture.o);
		}
		if(listeUtilisateurSite != null)
			listeUtilisateurSite.initLoinPourClasse(requeteSite_);
		listeUtilisateurSiteCouverture.dejaInitialise(true);
		return (UtilisateurSiteEnUSGenPage)this;
	}

	/////////////////////
	// utilisateurSite //
	/////////////////////

	/**	L'entité « utilisateurSite »
	 *	 is defined as null before being initialized. 
	 */
	protected UtilisateurSite utilisateurSite;
	public Couverture<UtilisateurSite> utilisateurSiteCouverture = new Couverture<UtilisateurSite>().p(this).c(UtilisateurSite.class).var("utilisateurSite").o(utilisateurSite);

	/**	<br/>L'entité « utilisateurSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurSite">Trouver l'entité utilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSite(Couverture<UtilisateurSite> c);

	public UtilisateurSite getUtilisateurSite() {
		return utilisateurSite;
	}

	public void setUtilisateurSite(UtilisateurSite utilisateurSite) {
		this.utilisateurSite = utilisateurSite;
		this.utilisateurSiteCouverture.dejaInitialise = true;
	}
	protected UtilisateurSiteEnUSGenPage utilisateurSiteInit() {
		if(!utilisateurSiteCouverture.dejaInitialise) {
			_utilisateurSite(utilisateurSiteCouverture);
			if(utilisateurSite == null)
				setUtilisateurSite(utilisateurSiteCouverture.o);
		}
		if(utilisateurSite != null)
			utilisateurSite.initLoinPourClasse(requeteSite_);
		utilisateurSiteCouverture.dejaInitialise(true);
		return (UtilisateurSiteEnUSGenPage)this;
	}

	////////////////////////////
	// pageUriUtilisateurSite //
	////////////////////////////

	/**	L'entité « pageUriUtilisateurSite »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriUtilisateurSite;
	public Couverture<String> pageUriUtilisateurSiteCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriUtilisateurSite").o(pageUriUtilisateurSite);

	/**	<br/>L'entité « pageUriUtilisateurSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUriUtilisateurSite">Trouver l'entité pageUriUtilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriUtilisateurSite(Couverture<String> c);

	public String getPageUriUtilisateurSite() {
		return pageUriUtilisateurSite;
	}

	public void setPageUriUtilisateurSite(String pageUriUtilisateurSite) {
		this.pageUriUtilisateurSite = pageUriUtilisateurSite;
		this.pageUriUtilisateurSiteCouverture.dejaInitialise = true;
	}
	protected UtilisateurSiteEnUSGenPage pageUriUtilisateurSiteInit() {
		if(!pageUriUtilisateurSiteCouverture.dejaInitialise) {
			_pageUriUtilisateurSite(pageUriUtilisateurSiteCouverture);
			if(pageUriUtilisateurSite == null)
				setPageUriUtilisateurSite(pageUriUtilisateurSiteCouverture.o);
		}
		pageUriUtilisateurSiteCouverture.dejaInitialise(true);
		return (UtilisateurSiteEnUSGenPage)this;
	}

	public String solrPageUriUtilisateurSite() {
		return pageUriUtilisateurSite;
	}

	public String strPageUriUtilisateurSite() {
		return pageUriUtilisateurSite == null ? "" : pageUriUtilisateurSite;
	}

	public String nomAffichagePageUriUtilisateurSite() {
		return null;
	}

	public String htmTooltipPageUriUtilisateurSite() {
		return null;
	}

	public String htmPageUriUtilisateurSite() {
		return pageUriUtilisateurSite == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriUtilisateurSite());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseUtilisateurSiteEnUSGenPage = false;

	public UtilisateurSiteEnUSGenPage initLoinUtilisateurSiteEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseUtilisateurSiteEnUSGenPage) {
			dejaInitialiseUtilisateurSiteEnUSGenPage = true;
			initLoinUtilisateurSiteEnUSGenPage();
		}
		return (UtilisateurSiteEnUSGenPage)this;
	}

	public void initLoinUtilisateurSiteEnUSGenPage() {
		super.initLoinClusterEnUSPage(requeteSite_);
		initUtilisateurSiteEnUSGenPage();
	}

	public void initUtilisateurSiteEnUSGenPage() {
		listeUtilisateurSiteInit();
		utilisateurSiteInit();
		pageUriUtilisateurSiteInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinUtilisateurSiteEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteUtilisateurSiteEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteClusterEnUSPage(requeteSite_);
		if(listeUtilisateurSite != null)
			listeUtilisateurSite.setRequeteSite_(requeteSite_);
		if(utilisateurSite != null)
			utilisateurSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteUtilisateurSiteEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirUtilisateurSiteEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirUtilisateurSiteEnUSGenPage(String var) {
		UtilisateurSiteEnUSGenPage oUtilisateurSiteEnUSGenPage = (UtilisateurSiteEnUSGenPage)this;
		switch(var) {
			case "listeUtilisateurSite":
				return oUtilisateurSiteEnUSGenPage.listeUtilisateurSite;
			case "utilisateurSite":
				return oUtilisateurSiteEnUSGenPage.utilisateurSite;
			case "pageUriUtilisateurSite":
				return oUtilisateurSiteEnUSGenPage.pageUriUtilisateurSite;
			default:
				return super.obtenirClusterEnUSPage(var);
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
				o = attribuerUtilisateurSiteEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerUtilisateurSiteEnUSGenPage(String var, Object val) {
		UtilisateurSiteEnUSGenPage oUtilisateurSiteEnUSGenPage = (UtilisateurSiteEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerClusterEnUSPage(var, val);
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
					o = definirUtilisateurSiteEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirUtilisateurSiteEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirClusterEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsUtilisateurSiteEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsUtilisateurSiteEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptUtilisateurSiteEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptUtilisateurSiteEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyUtilisateurSiteEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyUtilisateurSiteEnUSGenPage() {
		if(utilisateurSite != null)
			utilisateurSite.htmlBody();
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlUtilisateurSiteEnUSGenPage();
		super.html();
	}

	public void htmlUtilisateurSiteEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaUtilisateurSiteEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaUtilisateurSiteEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesUtilisateurSiteEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesUtilisateurSiteEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleUtilisateurSiteEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleUtilisateurSiteEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtUtilisateurSiteEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtUtilisateurSiteEnUSGenPage() {
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
		if(!(o instanceof UtilisateurSiteEnUSGenPage))
			return false;
		UtilisateurSiteEnUSGenPage that = (UtilisateurSiteEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("UtilisateurSiteEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
