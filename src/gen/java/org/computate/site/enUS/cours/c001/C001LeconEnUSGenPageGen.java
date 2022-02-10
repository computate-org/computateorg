package org.computate.site.enUS.cours.c001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.cours.c001.C001EnUSPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001LeconEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconEnUSGenPageGen<DEV> extends C001EnUSPage {

	////////////////////
	// listeC001Lecon //
	////////////////////

	/**	L'entité « listeC001Lecon »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<C001Lecon> listeC001Lecon;
	public Couverture<ListeRecherche<C001Lecon>> listeC001LeconCouverture = new Couverture<ListeRecherche<C001Lecon>>().p(this).c(ListeRecherche.class).var("listeC001Lecon").o(listeC001Lecon);

	/**	<br/>L'entité « listeC001Lecon »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001LeconEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeC001Lecon">Trouver l'entité listeC001Lecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeC001Lecon(Couverture<ListeRecherche<C001Lecon>> c);

	public ListeRecherche<C001Lecon> getListeC001Lecon() {
		return listeC001Lecon;
	}

	public void setListeC001Lecon(ListeRecherche<C001Lecon> listeC001Lecon) {
		this.listeC001Lecon = listeC001Lecon;
		this.listeC001LeconCouverture.dejaInitialise = true;
	}
	protected C001LeconEnUSGenPage listeC001LeconInit() {
		if(!listeC001LeconCouverture.dejaInitialise) {
			_listeC001Lecon(listeC001LeconCouverture);
			if(listeC001Lecon == null)
				setListeC001Lecon(listeC001LeconCouverture.o);
		}
		if(listeC001Lecon != null)
			listeC001Lecon.initLoinPourClasse(requeteSite_);
		listeC001LeconCouverture.dejaInitialise(true);
		return (C001LeconEnUSGenPage)this;
	}

	///////////////
	// c001Lecon //
	///////////////

	/**	L'entité « c001Lecon »
	 *	 is defined as null before being initialized. 
	 */
	protected C001Lecon c001Lecon;
	public Couverture<C001Lecon> c001LeconCouverture = new Couverture<C001Lecon>().p(this).c(C001Lecon.class).var("c001Lecon").o(c001Lecon);

	/**	<br/>L'entité « c001Lecon »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.C001LeconEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001Lecon">Trouver l'entité c001Lecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001Lecon(Couverture<C001Lecon> c);

	public C001Lecon getC001Lecon() {
		return c001Lecon;
	}

	public void setC001Lecon(C001Lecon c001Lecon) {
		this.c001Lecon = c001Lecon;
		this.c001LeconCouverture.dejaInitialise = true;
	}
	protected C001LeconEnUSGenPage c001LeconInit() {
		if(!c001LeconCouverture.dejaInitialise) {
			_c001Lecon(c001LeconCouverture);
			if(c001Lecon == null)
				setC001Lecon(c001LeconCouverture.o);
		}
		if(c001Lecon != null)
			c001Lecon.initLoinPourClasse(requeteSite_);
		c001LeconCouverture.dejaInitialise(true);
		return (C001LeconEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001LeconEnUSGenPage = false;

	public C001LeconEnUSGenPage initLoinC001LeconEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001LeconEnUSGenPage) {
			dejaInitialiseC001LeconEnUSGenPage = true;
			initLoinC001LeconEnUSGenPage();
		}
		return (C001LeconEnUSGenPage)this;
	}

	public void initLoinC001LeconEnUSGenPage() {
		super.initLoinC001EnUSPage(requeteSite_);
		initC001LeconEnUSGenPage();
	}

	public void initC001LeconEnUSGenPage() {
		listeC001LeconInit();
		c001LeconInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001LeconEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001LeconEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001EnUSPage(requeteSite_);
		if(listeC001Lecon != null)
			listeC001Lecon.setRequeteSite_(requeteSite_);
		if(c001Lecon != null)
			c001Lecon.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001LeconEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001LeconEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001LeconEnUSGenPage(String var) {
		C001LeconEnUSGenPage oC001LeconEnUSGenPage = (C001LeconEnUSGenPage)this;
		switch(var) {
			case "listeC001Lecon":
				return oC001LeconEnUSGenPage.listeC001Lecon;
			case "c001Lecon":
				return oC001LeconEnUSGenPage.c001Lecon;
			default:
				return super.obtenirC001EnUSPage(var);
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
				o = attribuerC001LeconEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001LeconEnUSGenPage(String var, Object val) {
		C001LeconEnUSGenPage oC001LeconEnUSGenPage = (C001LeconEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001EnUSPage(var, val);
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
					o = definirC001LeconEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001LeconEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001EnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001LeconEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001LeconEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001LeconEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001LeconEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001LeconEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001LeconEnUSGenPage() {
		if(c001Lecon != null)
			c001Lecon.htmlBody();
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001LeconEnUSGenPage();
		super.html();
	}

	public void htmlC001LeconEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001LeconEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001LeconEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001LeconEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001LeconEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001LeconEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001LeconEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001LeconEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001LeconEnUSGenPage() {
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
		if(!(o instanceof C001LeconEnUSGenPage))
			return false;
		C001LeconEnUSGenPage that = (C001LeconEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001LeconEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
