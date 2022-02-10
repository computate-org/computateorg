package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;

import org.computate.site.site.enUS.chaine.Chaine;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.page.MiseEnPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.Icone&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class IconeGen<DEV> extends PagePart {

	//////////
	// type //
	//////////

	/**	L'entité « type »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine type = new Chaine();
	public Couverture<Chaine> typeCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("type").o(type);

	/**	<br/>L'entité « type »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.Icone&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:type">Trouver l'entité type dans Solr</a>
	 * <br/>
	 * @param type est l'entité déjà construit. 
	 **/
	protected abstract void _type(Chaine o);

	public Chaine getType() {
		return type;
	}

	public void setType(Chaine type) {
		this.type = type;
		this.typeCouverture.dejaInitialise = true;
	}
	public Icone setType(String o) {
		type.s(o);
		this.typeCouverture.dejaInitialise = true;
		return (Icone)this;
	}
	protected Icone typeInit() {
		if(!typeCouverture.dejaInitialise) {
			_type(type);
		}
		type.initLoinPourClasse(requeteSite_);
		typeCouverture.dejaInitialise(true);
		return (Icone)this;
	}

	/////////
	// nom //
	/////////

	/**	L'entité « nom »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine nom = new Chaine();
	public Couverture<Chaine> nomCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("nom").o(nom);

	/**	<br/>L'entité « nom »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.Icone&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nom">Trouver l'entité nom dans Solr</a>
	 * <br/>
	 * @param nom est l'entité déjà construit. 
	 **/
	protected abstract void _nom(Chaine o);

	public Chaine getNom() {
		return nom;
	}

	public void setNom(Chaine nom) {
		this.nom = nom;
		this.nomCouverture.dejaInitialise = true;
	}
	public Icone setNom(String o) {
		nom.s(o);
		this.nomCouverture.dejaInitialise = true;
		return (Icone)this;
	}
	protected Icone nomInit() {
		if(!nomCouverture.dejaInitialise) {
			_nom(nom);
		}
		nom.initLoinPourClasse(requeteSite_);
		nomCouverture.dejaInitialise(true);
		return (Icone)this;
	}

	///////////
	// page_ //
	///////////

	/**	L'entité « page_ »
	 *	 is defined as null before being initialized. 
	 */
	protected MiseEnPage page_;
	public Couverture<MiseEnPage> page_Couverture = new Couverture<MiseEnPage>().p(this).c(MiseEnPage.class).var("page_").o(page_);

	/**	<br/>L'entité « page_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.Icone&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:page_">Trouver l'entité page_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _page_(Couverture<MiseEnPage> c);

	public MiseEnPage getPage_() {
		return page_;
	}

	public void setPage_(MiseEnPage page_) {
		this.page_ = page_;
		this.page_Couverture.dejaInitialise = true;
	}
	protected Icone page_Init() {
		if(!page_Couverture.dejaInitialise) {
			_page_(page_Couverture);
			if(page_ == null)
				setPage_(page_Couverture.o);
		}
		page_Couverture.dejaInitialise(true);
		return (Icone)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseIcone = false;

	public Icone initLoinIcone(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseIcone) {
			dejaInitialiseIcone = true;
			initLoinIcone();
		}
		return (Icone)this;
	}

	public void initLoinIcone() {
		super.initLoinPagePart(requeteSite_);
		initIcone();
	}

	public void initIcone() {
		typeInit();
		nomInit();
		page_Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinIcone(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteIcone(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePagePart(requeteSite_);
		if(type != null)
			type.setRequeteSite_(requeteSite_);
		if(nom != null)
			nom.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteIcone(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirIcone(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirIcone(String var) {
		Icone oIcone = (Icone)this;
		switch(var) {
			case "type":
				return oIcone.type;
			case "nom":
				return oIcone.nom;
			case "page_":
				return oIcone.page_;
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
				o = attribuerIcone(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerIcone(String var, Object val) {
		Icone oIcone = (Icone)this;
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
					o = definirIcone(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirIcone(String var, String val) {
		switch(var) {
			default:
				return super.definirPagePart(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyIcone();
		super.htmlBody();
	}

	public void htmlBodyIcone() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtIcone();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtIcone() {
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
		if(!(o instanceof Icone))
			return false;
		Icone that = (Icone)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("Icone {");
		sb.append(" }");
		return sb.toString();
	}
}
