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
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.PageParagraphe&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageParagrapheGen<DEV> extends PagePart {

	///////////
	// texte //
	///////////

	/**	L'entité « texte »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine texte = new Chaine();
	public Couverture<Chaine> texteCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("texte").o(texte);

	/**	<br/>L'entité « texte »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.PageParagraphe&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:texte">Trouver l'entité texte dans Solr</a>
	 * <br/>
	 * @param texte est l'entité déjà construit. 
	 **/
	protected abstract void _texte(Chaine o);

	public Chaine getTexte() {
		return texte;
	}

	public void setTexte(Chaine texte) {
		this.texte = texte;
		this.texteCouverture.dejaInitialise = true;
	}
	public PageParagraphe setTexte(String o) {
		texte.s(o);
		this.texteCouverture.dejaInitialise = true;
		return (PageParagraphe)this;
	}
	protected PageParagraphe texteInit() {
		if(!texteCouverture.dejaInitialise) {
			_texte(texte);
		}
		texte.initLoinPourClasse(requeteSite_);
		texteCouverture.dejaInitialise(true);
		return (PageParagraphe)this;
	}

	////////////////
	// texteCourt //
	////////////////

	/**	L'entité « texteCourt »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine texteCourt = new Chaine();
	public Couverture<Chaine> texteCourtCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("texteCourt").o(texteCourt);

	/**	<br/>L'entité « texteCourt »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.PageParagraphe&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:texteCourt">Trouver l'entité texteCourt dans Solr</a>
	 * <br/>
	 * @param texteCourt est l'entité déjà construit. 
	 **/
	protected abstract void _texteCourt(Chaine o);

	public Chaine getTexteCourt() {
		return texteCourt;
	}

	public void setTexteCourt(Chaine texteCourt) {
		this.texteCourt = texteCourt;
		this.texteCourtCouverture.dejaInitialise = true;
	}
	public PageParagraphe setTexteCourt(String o) {
		texteCourt.s(o);
		this.texteCourtCouverture.dejaInitialise = true;
		return (PageParagraphe)this;
	}
	protected PageParagraphe texteCourtInit() {
		if(!texteCourtCouverture.dejaInitialise) {
			_texteCourt(texteCourt);
		}
		texteCourt.initLoinPourClasse(requeteSite_);
		texteCourtCouverture.dejaInitialise(true);
		return (PageParagraphe)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageParagraphe = false;

	public PageParagraphe initLoinPageParagraphe(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageParagraphe) {
			dejaInitialisePageParagraphe = true;
			initLoinPageParagraphe();
		}
		return (PageParagraphe)this;
	}

	public void initLoinPageParagraphe() {
		super.initLoinPagePart(requeteSite_);
		initPageParagraphe();
	}

	public void initPageParagraphe() {
		texteInit();
		texteCourtInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageParagraphe(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageParagraphe(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePagePart(requeteSite_);
		if(texte != null)
			texte.setRequeteSite_(requeteSite_);
		if(texteCourt != null)
			texteCourt.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageParagraphe(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageParagraphe(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageParagraphe(String var) {
		PageParagraphe oPageParagraphe = (PageParagraphe)this;
		switch(var) {
			case "texte":
				return oPageParagraphe.texte;
			case "texteCourt":
				return oPageParagraphe.texteCourt;
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
				o = attribuerPageParagraphe(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageParagraphe(String var, Object val) {
		PageParagraphe oPageParagraphe = (PageParagraphe)this;
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
					o = definirPageParagraphe(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageParagraphe(String var, String val) {
		switch(var) {
			default:
				return super.definirPagePart(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageParagraphe();
		super.htmlBody();
	}

	public void htmlBodyPageParagraphe() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageParagraphe();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageParagraphe() {
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
		if(!(o instanceof PageParagraphe))
			return false;
		PageParagraphe that = (PageParagraphe)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageParagraphe {");
		sb.append(" }");
		return sb.toString();
	}
}
