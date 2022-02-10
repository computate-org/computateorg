package org.computate.site.enUS.page.blog;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.page.blog.PageBlogEnUSGenPage;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlogEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageBlogEnUSPageGen<DEV> extends PageBlogEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageBlogEnUSPage = false;

	public PageBlogEnUSPage initLoinPageBlogEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageBlogEnUSPage) {
			dejaInitialisePageBlogEnUSPage = true;
			initLoinPageBlogEnUSPage();
		}
		return (PageBlogEnUSPage)this;
	}

	public void initLoinPageBlogEnUSPage() {
		super.initLoinPageBlogEnUSGenPage(requeteSite_);
		initPageBlogEnUSPage();
	}

	public void initPageBlogEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageBlogEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageBlogEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePageBlogEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageBlogEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageBlogEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageBlogEnUSPage(String var) {
		PageBlogEnUSPage oPageBlogEnUSPage = (PageBlogEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirPageBlogEnUSGenPage(var);
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
				o = attribuerPageBlogEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageBlogEnUSPage(String var, Object val) {
		PageBlogEnUSPage oPageBlogEnUSPage = (PageBlogEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerPageBlogEnUSGenPage(var, val);
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
					o = definirPageBlogEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageBlogEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageBlogEnUSGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageBlogEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyPageBlogEnUSPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageBlogEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageBlogEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageBlogEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageBlogEnUSPage() {
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
		if(!(o instanceof PageBlogEnUSPage))
			return false;
		PageBlogEnUSPage that = (PageBlogEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageBlogEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
