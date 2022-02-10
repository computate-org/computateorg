package org.computate.site.enUS.page.apropos;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.page.apropos.PageAProposEnUSGenPage;
import org.computate.site.enUS.request.RequeteSiteEnUS;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAProposEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposEnUSPageGen<DEV> extends PageAProposEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAProposEnUSPage = false;

	public PageAProposEnUSPage initLoinPageAProposEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAProposEnUSPage) {
			dejaInitialisePageAProposEnUSPage = true;
			initLoinPageAProposEnUSPage();
		}
		return (PageAProposEnUSPage)this;
	}

	public void initLoinPageAProposEnUSPage() {
		super.initLoinPageAProposEnUSGenPage(requeteSite_);
		initPageAProposEnUSPage();
	}

	public void initPageAProposEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAProposEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAProposEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePageAProposEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAProposEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAProposEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAProposEnUSPage(String var) {
		PageAProposEnUSPage oPageAProposEnUSPage = (PageAProposEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirPageAProposEnUSGenPage(var);
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
				o = attribuerPageAProposEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAProposEnUSPage(String var, Object val) {
		PageAProposEnUSPage oPageAProposEnUSPage = (PageAProposEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerPageAProposEnUSGenPage(var, val);
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
					o = definirPageAProposEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAProposEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageAProposEnUSGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAProposEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyPageAProposEnUSPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAProposEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAProposEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAProposEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAProposEnUSPage() {
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
		if(!(o instanceof PageAProposEnUSPage))
			return false;
		PageAProposEnUSPage that = (PageAProposEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAProposEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
