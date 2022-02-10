package org.computate.site.enUS.page.faq;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.page.faq.PageFaqEnUSGenPage;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaqEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqEnUSPageGen<DEV> extends PageFaqEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageFaqEnUSPage = false;

	public PageFaqEnUSPage initLoinPageFaqEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaqEnUSPage) {
			dejaInitialisePageFaqEnUSPage = true;
			initLoinPageFaqEnUSPage();
		}
		return (PageFaqEnUSPage)this;
	}

	public void initLoinPageFaqEnUSPage() {
		super.initLoinPageFaqEnUSGenPage(requeteSite_);
		initPageFaqEnUSPage();
	}

	public void initPageFaqEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageFaqEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaqEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePageFaqEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageFaqEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaqEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaqEnUSPage(String var) {
		PageFaqEnUSPage oPageFaqEnUSPage = (PageFaqEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirPageFaqEnUSGenPage(var);
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
				o = attribuerPageFaqEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaqEnUSPage(String var, Object val) {
		PageFaqEnUSPage oPageFaqEnUSPage = (PageFaqEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerPageFaqEnUSGenPage(var, val);
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
					o = definirPageFaqEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaqEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageFaqEnUSGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaqEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyPageFaqEnUSPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageFaqEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageFaqEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageFaqEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageFaqEnUSPage() {
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
		if(!(o instanceof PageFaqEnUSPage))
			return false;
		PageFaqEnUSPage that = (PageFaqEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageFaqEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
