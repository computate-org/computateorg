package org.computate.site.enUS.cluster;

import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.site.enus.model.base.ClusterEnUSGenPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.ClusterEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ClusterEnUSPageGen<DEV> extends ClusterEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseClusterEnUSPage = false;

	public ClusterEnUSPage initLoinClusterEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseClusterEnUSPage) {
			dejaInitialiseClusterEnUSPage = true;
			initLoinClusterEnUSPage();
		}
		return (ClusterEnUSPage)this;
	}

	public void initLoinClusterEnUSPage() {
		super.initLoinClusterEnUSGenPage(requeteSite_);
		initClusterEnUSPage();
	}

	public void initClusterEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinClusterEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteClusterEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteClusterEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteClusterEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirClusterEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirClusterEnUSPage(String var) {
		ClusterEnUSPage oClusterEnUSPage = (ClusterEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirClusterEnUSGenPage(var);
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
				o = attribuerClusterEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerClusterEnUSPage(String var, Object val) {
		ClusterEnUSPage oClusterEnUSPage = (ClusterEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerClusterEnUSGenPage(var, val);
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
					o = definirClusterEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirClusterEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirClusterEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsClusterEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsClusterEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptClusterEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptClusterEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyClusterEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyClusterEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlClusterEnUSPage();
		super.html();
	}

	public void htmlClusterEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaClusterEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaClusterEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesClusterEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesClusterEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleClusterEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleClusterEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtClusterEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtClusterEnUSPage() {
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
		if(!(o instanceof ClusterEnUSPage))
			return false;
		ClusterEnUSPage that = (ClusterEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ClusterEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
