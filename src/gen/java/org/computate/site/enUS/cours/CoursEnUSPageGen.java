package org.computate.site.enUS.cours;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.CoursEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.CoursEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursEnUSPageGen<DEV> extends CoursEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursEnUSPage = false;

	public CoursEnUSPage initLoinCoursEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursEnUSPage) {
			dejaInitialiseCoursEnUSPage = true;
			initLoinCoursEnUSPage();
		}
		return (CoursEnUSPage)this;
	}

	public void initLoinCoursEnUSPage() {
		super.initLoinCoursEnUSGenPage(requeteSite_);
		initCoursEnUSPage();
	}

	public void initCoursEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinCoursEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteCoursEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteCoursEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursEnUSPage(String var) {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirCoursEnUSGenPage(var);
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
				o = attribuerCoursEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursEnUSPage(String var, Object val) {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerCoursEnUSGenPage(var, val);
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
					o = definirCoursEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirCoursEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsCoursEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptCoursEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyCoursEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlCoursEnUSPage();
		super.html();
	}

	public void htmlCoursEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaCoursEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaCoursEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesCoursEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesCoursEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleCoursEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleCoursEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCoursEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCoursEnUSPage() {
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
		if(!(o instanceof CoursEnUSPage))
			return false;
		CoursEnUSPage that = (CoursEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
