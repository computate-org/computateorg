package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.PageHtml&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageHtmlGen<DEV> extends PagePart {

	public PageHtmlGen() {
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageHtml = false;

	public PageHtml initLoinPageHtml(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageHtml) {
			dejaInitialisePageHtml = true;
			initLoinPageHtml();
		}
		return (PageHtml)this;
	}

	public void initLoinPageHtml() {
		super.initLoinPagePart(requeteSite_);
		initPageHtml();
	}

	public void initPageHtml() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageHtml(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageHtml(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePagePart(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageHtml(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageHtml(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageHtml(String var) {
		PageHtml oPageHtml = (PageHtml)this;
		switch(var) {
			default:
				return super.obtenirPagePart(var);
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
				o = attribuerPageHtml(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageHtml(String var, Object val) {
		PageHtml oPageHtml = (PageHtml)this;
		switch(var) {
			default:
				return super.attribuerPagePart(var, val);
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
					o = definirPageHtml(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageHtml(String var, String val) {
		switch(var) {
			default:
				return super.definirPagePart(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageHtml();
		super.htmlBody();
	}

	public void htmlBodyPageHtml() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageHtml();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageHtml() {
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
		if(!(o instanceof PageHtml))
			return false;
		PageHtml that = (PageHtml)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageHtml {");
		sb.append(" }");
		return sb.toString();
	}
}
