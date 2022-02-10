package org.computate.site.enUS.cluster;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.ClusterEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ClusterEnUSGenPageGen<DEV> extends MiseEnPage {

	//////////////////
	// listeCluster //
	//////////////////

	/**	L'entité « listeCluster »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<Cluster> listeCluster;
	public Couverture<ListeRecherche<Cluster>> listeClusterCouverture = new Couverture<ListeRecherche<Cluster>>().p(this).c(ListeRecherche.class).var("listeCluster").o(listeCluster);

	/**	<br/>L'entité « listeCluster »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.ClusterEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeCluster">Trouver l'entité listeCluster dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeCluster(Couverture<ListeRecherche<Cluster>> c);

	public ListeRecherche<Cluster> getListeCluster() {
		return listeCluster;
	}

	public void setListeCluster(ListeRecherche<Cluster> listeCluster) {
		this.listeCluster = listeCluster;
		this.listeClusterCouverture.dejaInitialise = true;
	}
	protected ClusterEnUSGenPage listeClusterInit() {
		if(!listeClusterCouverture.dejaInitialise) {
			_listeCluster(listeClusterCouverture);
			if(listeCluster == null)
				setListeCluster(listeClusterCouverture.o);
		}
		if(listeCluster != null)
			listeCluster.initLoinPourClasse(requeteSite_);
		listeClusterCouverture.dejaInitialise(true);
		return (ClusterEnUSGenPage)this;
	}

	/////////////
	// cluster //
	/////////////

	/**	L'entité « cluster »
	 *	 is defined as null before being initialized. 
	 */
	protected Cluster cluster;
	public Couverture<Cluster> clusterCouverture = new Couverture<Cluster>().p(this).c(Cluster.class).var("cluster").o(cluster);

	/**	<br/>L'entité « cluster »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.ClusterEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cluster">Trouver l'entité cluster dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cluster(Couverture<Cluster> c);

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
		this.clusterCouverture.dejaInitialise = true;
	}
	protected ClusterEnUSGenPage clusterInit() {
		if(!clusterCouverture.dejaInitialise) {
			_cluster(clusterCouverture);
			if(cluster == null)
				setCluster(clusterCouverture.o);
		}
		if(cluster != null)
			cluster.initLoinPourClasse(requeteSite_);
		clusterCouverture.dejaInitialise(true);
		return (ClusterEnUSGenPage)this;
	}

	////////////////////
	// pageUriCluster //
	////////////////////

	/**	L'entité « pageUriCluster »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriCluster;
	public Couverture<String> pageUriClusterCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriCluster").o(pageUriCluster);

	/**	<br/>L'entité « pageUriCluster »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.ClusterEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUriCluster">Trouver l'entité pageUriCluster dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriCluster(Couverture<String> c);

	public String getPageUriCluster() {
		return pageUriCluster;
	}

	public void setPageUriCluster(String pageUriCluster) {
		this.pageUriCluster = pageUriCluster;
		this.pageUriClusterCouverture.dejaInitialise = true;
	}
	protected ClusterEnUSGenPage pageUriClusterInit() {
		if(!pageUriClusterCouverture.dejaInitialise) {
			_pageUriCluster(pageUriClusterCouverture);
			if(pageUriCluster == null)
				setPageUriCluster(pageUriClusterCouverture.o);
		}
		pageUriClusterCouverture.dejaInitialise(true);
		return (ClusterEnUSGenPage)this;
	}

	public String solrPageUriCluster() {
		return pageUriCluster;
	}

	public String strPageUriCluster() {
		return pageUriCluster == null ? "" : pageUriCluster;
	}

	public String nomAffichagePageUriCluster() {
		return null;
	}

	public String htmTooltipPageUriCluster() {
		return null;
	}

	public String htmPageUriCluster() {
		return pageUriCluster == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriCluster());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseClusterEnUSGenPage = false;

	public ClusterEnUSGenPage initLoinClusterEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseClusterEnUSGenPage) {
			dejaInitialiseClusterEnUSGenPage = true;
			initLoinClusterEnUSGenPage();
		}
		return (ClusterEnUSGenPage)this;
	}

	public void initLoinClusterEnUSGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initClusterEnUSGenPage();
	}

	public void initClusterEnUSGenPage() {
		listeClusterInit();
		clusterInit();
		pageUriClusterInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinClusterEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteClusterEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeCluster != null)
			listeCluster.setRequeteSite_(requeteSite_);
		if(cluster != null)
			cluster.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteClusterEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirClusterEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirClusterEnUSGenPage(String var) {
		ClusterEnUSGenPage oClusterEnUSGenPage = (ClusterEnUSGenPage)this;
		switch(var) {
			case "listeCluster":
				return oClusterEnUSGenPage.listeCluster;
			case "cluster":
				return oClusterEnUSGenPage.cluster;
			case "pageUriCluster":
				return oClusterEnUSGenPage.pageUriCluster;
			default:
				return super.obtenirMiseEnPage(var);
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
				o = attribuerClusterEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerClusterEnUSGenPage(String var, Object val) {
		ClusterEnUSGenPage oClusterEnUSGenPage = (ClusterEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerMiseEnPage(var, val);
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
					o = definirClusterEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirClusterEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsClusterEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsClusterEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptClusterEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptClusterEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyClusterEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyClusterEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlClusterEnUSGenPage();
		super.html();
	}

	public void htmlClusterEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaClusterEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaClusterEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesClusterEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesClusterEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleClusterEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleClusterEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtClusterEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtClusterEnUSGenPage() {
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
		if(!(o instanceof ClusterEnUSGenPage))
			return false;
		ClusterEnUSGenPage that = (ClusterEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ClusterEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
