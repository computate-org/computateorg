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

import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class QuestionReponseGen<DEV> extends PagePart {

	///////////////////////
	// questionIconeType //
	///////////////////////

	/**	L'entité « questionIconeType »
	 *	 is defined as null before being initialized. 
	 */
	protected String questionIconeType;
	public Couverture<String> questionIconeTypeCouverture = new Couverture<String>().p(this).c(String.class).var("questionIconeType").o(questionIconeType);

	/**	<br/>L'entité « questionIconeType »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionIconeType">Trouver l'entité questionIconeType dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _questionIconeType(Couverture<String> c);

	public String getQuestionIconeType() {
		return questionIconeType;
	}

	public void setQuestionIconeType(String questionIconeType) {
		this.questionIconeType = questionIconeType;
		this.questionIconeTypeCouverture.dejaInitialise = true;
	}
	protected QuestionReponse questionIconeTypeInit() {
		if(!questionIconeTypeCouverture.dejaInitialise) {
			_questionIconeType(questionIconeTypeCouverture);
			if(questionIconeType == null)
				setQuestionIconeType(questionIconeTypeCouverture.o);
		}
		questionIconeTypeCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrQuestionIconeType() {
		return questionIconeType;
	}

	public String strQuestionIconeType() {
		return questionIconeType == null ? "" : questionIconeType;
	}

	public String nomAffichageQuestionIconeType() {
		return null;
	}

	public String htmTooltipQuestionIconeType() {
		return null;
	}

	public String htmQuestionIconeType() {
		return questionIconeType == null ? "" : StringEscapeUtils.escapeHtml4(strQuestionIconeType());
	}

	//////////////////////
	// questionIconeNom //
	//////////////////////

	/**	L'entité « questionIconeNom »
	 *	 is defined as null before being initialized. 
	 */
	protected String questionIconeNom;
	public Couverture<String> questionIconeNomCouverture = new Couverture<String>().p(this).c(String.class).var("questionIconeNom").o(questionIconeNom);

	/**	<br/>L'entité « questionIconeNom »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionIconeNom">Trouver l'entité questionIconeNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _questionIconeNom(Couverture<String> c);

	public String getQuestionIconeNom() {
		return questionIconeNom;
	}

	public void setQuestionIconeNom(String questionIconeNom) {
		this.questionIconeNom = questionIconeNom;
		this.questionIconeNomCouverture.dejaInitialise = true;
	}
	protected QuestionReponse questionIconeNomInit() {
		if(!questionIconeNomCouverture.dejaInitialise) {
			_questionIconeNom(questionIconeNomCouverture);
			if(questionIconeNom == null)
				setQuestionIconeNom(questionIconeNomCouverture.o);
		}
		questionIconeNomCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrQuestionIconeNom() {
		return questionIconeNom;
	}

	public String strQuestionIconeNom() {
		return questionIconeNom == null ? "" : questionIconeNom;
	}

	public String nomAffichageQuestionIconeNom() {
		return null;
	}

	public String htmTooltipQuestionIconeNom() {
		return null;
	}

	public String htmQuestionIconeNom() {
		return questionIconeNom == null ? "" : StringEscapeUtils.escapeHtml4(strQuestionIconeNom());
	}

	//////////////////////
	// reponseIconeType //
	//////////////////////

	/**	L'entité « reponseIconeType »
	 *	 is defined as null before being initialized. 
	 */
	protected String reponseIconeType;
	public Couverture<String> reponseIconeTypeCouverture = new Couverture<String>().p(this).c(String.class).var("reponseIconeType").o(reponseIconeType);

	/**	<br/>L'entité « reponseIconeType »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponseIconeType">Trouver l'entité reponseIconeType dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _reponseIconeType(Couverture<String> c);

	public String getReponseIconeType() {
		return reponseIconeType;
	}

	public void setReponseIconeType(String reponseIconeType) {
		this.reponseIconeType = reponseIconeType;
		this.reponseIconeTypeCouverture.dejaInitialise = true;
	}
	protected QuestionReponse reponseIconeTypeInit() {
		if(!reponseIconeTypeCouverture.dejaInitialise) {
			_reponseIconeType(reponseIconeTypeCouverture);
			if(reponseIconeType == null)
				setReponseIconeType(reponseIconeTypeCouverture.o);
		}
		reponseIconeTypeCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrReponseIconeType() {
		return reponseIconeType;
	}

	public String strReponseIconeType() {
		return reponseIconeType == null ? "" : reponseIconeType;
	}

	public String nomAffichageReponseIconeType() {
		return null;
	}

	public String htmTooltipReponseIconeType() {
		return null;
	}

	public String htmReponseIconeType() {
		return reponseIconeType == null ? "" : StringEscapeUtils.escapeHtml4(strReponseIconeType());
	}

	/////////////////////
	// reponseIconeNom //
	/////////////////////

	/**	L'entité « reponseIconeNom »
	 *	 is defined as null before being initialized. 
	 */
	protected String reponseIconeNom;
	public Couverture<String> reponseIconeNomCouverture = new Couverture<String>().p(this).c(String.class).var("reponseIconeNom").o(reponseIconeNom);

	/**	<br/>L'entité « reponseIconeNom »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponseIconeNom">Trouver l'entité reponseIconeNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _reponseIconeNom(Couverture<String> c);

	public String getReponseIconeNom() {
		return reponseIconeNom;
	}

	public void setReponseIconeNom(String reponseIconeNom) {
		this.reponseIconeNom = reponseIconeNom;
		this.reponseIconeNomCouverture.dejaInitialise = true;
	}
	protected QuestionReponse reponseIconeNomInit() {
		if(!reponseIconeNomCouverture.dejaInitialise) {
			_reponseIconeNom(reponseIconeNomCouverture);
			if(reponseIconeNom == null)
				setReponseIconeNom(reponseIconeNomCouverture.o);
		}
		reponseIconeNomCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrReponseIconeNom() {
		return reponseIconeNom;
	}

	public String strReponseIconeNom() {
		return reponseIconeNom == null ? "" : reponseIconeNom;
	}

	public String nomAffichageReponseIconeNom() {
		return null;
	}

	public String htmTooltipReponseIconeNom() {
		return null;
	}

	public String htmReponseIconeNom() {
		return reponseIconeNom == null ? "" : StringEscapeUtils.escapeHtml4(strReponseIconeNom());
	}

	//////////////
	// question //
	//////////////

	/**	L'entité « question »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine question = new Chaine();
	public Couverture<Chaine> questionCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("question").o(question);

	/**	<br/>L'entité « question »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:question">Trouver l'entité question dans Solr</a>
	 * <br/>
	 * @param question est l'entité déjà construit. 
	 **/
	protected abstract void _question(Chaine o);

	public Chaine getQuestion() {
		return question;
	}

	public void setQuestion(Chaine question) {
		this.question = question;
		this.questionCouverture.dejaInitialise = true;
	}
	public QuestionReponse setQuestion(String o) {
		question.s(o);
		this.questionCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse questionInit() {
		if(!questionCouverture.dejaInitialise) {
			_question(question);
		}
		question.initLoinPourClasse(requeteSite_);
		questionCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	///////////////////
	// questionCourt //
	///////////////////

	/**	L'entité « questionCourt »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine questionCourt = new Chaine();
	public Couverture<Chaine> questionCourtCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("questionCourt").o(questionCourt);

	/**	<br/>L'entité « questionCourt »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCourt">Trouver l'entité questionCourt dans Solr</a>
	 * <br/>
	 * @param questionCourt est l'entité déjà construit. 
	 **/
	protected abstract void _questionCourt(Chaine o);

	public Chaine getQuestionCourt() {
		return questionCourt;
	}

	public void setQuestionCourt(Chaine questionCourt) {
		this.questionCourt = questionCourt;
		this.questionCourtCouverture.dejaInitialise = true;
	}
	public QuestionReponse setQuestionCourt(String o) {
		questionCourt.s(o);
		this.questionCourtCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse questionCourtInit() {
		if(!questionCourtCouverture.dejaInitialise) {
			_questionCourt(questionCourt);
		}
		questionCourt.initLoinPourClasse(requeteSite_);
		questionCourtCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	/////////////
	// reponse //
	/////////////

	/**	L'entité « reponse »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine reponse = new Chaine();
	public Couverture<Chaine> reponseCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("reponse").o(reponse);

	/**	<br/>L'entité « reponse »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponse">Trouver l'entité reponse dans Solr</a>
	 * <br/>
	 * @param reponse est l'entité déjà construit. 
	 **/
	protected abstract void _reponse(Chaine o);

	public Chaine getReponse() {
		return reponse;
	}

	public void setReponse(Chaine reponse) {
		this.reponse = reponse;
		this.reponseCouverture.dejaInitialise = true;
	}
	public QuestionReponse setReponse(String o) {
		reponse.s(o);
		this.reponseCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse reponseInit() {
		if(!reponseCouverture.dejaInitialise) {
			_reponse(reponse);
		}
		reponse.initLoinPourClasse(requeteSite_);
		reponseCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	//////////////////
	// reponseCourt //
	//////////////////

	/**	L'entité « reponseCourt »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine reponseCourt = new Chaine();
	public Couverture<Chaine> reponseCourtCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("reponseCourt").o(reponseCourt);

	/**	<br/>L'entité « reponseCourt »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponseCourt">Trouver l'entité reponseCourt dans Solr</a>
	 * <br/>
	 * @param reponseCourt est l'entité déjà construit. 
	 **/
	protected abstract void _reponseCourt(Chaine o);

	public Chaine getReponseCourt() {
		return reponseCourt;
	}

	public void setReponseCourt(Chaine reponseCourt) {
		this.reponseCourt = reponseCourt;
		this.reponseCourtCouverture.dejaInitialise = true;
	}
	public QuestionReponse setReponseCourt(String o) {
		reponseCourt.s(o);
		this.reponseCourtCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse reponseCourtInit() {
		if(!reponseCourtCouverture.dejaInitialise) {
			_reponseCourt(reponseCourt);
		}
		reponseCourt.initLoinPourClasse(requeteSite_);
		reponseCourtCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseQuestionReponse = false;

	public QuestionReponse initLoinQuestionReponse(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseQuestionReponse) {
			dejaInitialiseQuestionReponse = true;
			initLoinQuestionReponse();
		}
		return (QuestionReponse)this;
	}

	public void initLoinQuestionReponse() {
		super.initLoinPagePart(requeteSite_);
		initQuestionReponse();
	}

	public void initQuestionReponse() {
		questionIconeTypeInit();
		questionIconeNomInit();
		reponseIconeTypeInit();
		reponseIconeNomInit();
		questionInit();
		questionCourtInit();
		reponseInit();
		reponseCourtInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinQuestionReponse(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteQuestionReponse(RequeteSiteEnUS requeteSite_) {
			super.requeteSitePagePart(requeteSite_);
		if(question != null)
			question.setRequeteSite_(requeteSite_);
		if(questionCourt != null)
			questionCourt.setRequeteSite_(requeteSite_);
		if(reponse != null)
			reponse.setRequeteSite_(requeteSite_);
		if(reponseCourt != null)
			reponseCourt.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteQuestionReponse(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirQuestionReponse(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirQuestionReponse(String var) {
		QuestionReponse oQuestionReponse = (QuestionReponse)this;
		switch(var) {
			case "questionIconeType":
				return oQuestionReponse.questionIconeType;
			case "questionIconeNom":
				return oQuestionReponse.questionIconeNom;
			case "reponseIconeType":
				return oQuestionReponse.reponseIconeType;
			case "reponseIconeNom":
				return oQuestionReponse.reponseIconeNom;
			case "question":
				return oQuestionReponse.question;
			case "questionCourt":
				return oQuestionReponse.questionCourt;
			case "reponse":
				return oQuestionReponse.reponse;
			case "reponseCourt":
				return oQuestionReponse.reponseCourt;
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
				o = attribuerQuestionReponse(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerQuestionReponse(String var, Object val) {
		QuestionReponse oQuestionReponse = (QuestionReponse)this;
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
					o = definirQuestionReponse(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirQuestionReponse(String var, String val) {
		switch(var) {
			default:
				return super.definirPagePart(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyQuestionReponse();
		super.htmlBody();
	}

	public void htmlBodyQuestionReponse() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtQuestionReponse();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtQuestionReponse() {
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
		if(!(o instanceof QuestionReponse))
			return false;
		QuestionReponse that = (QuestionReponse)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("QuestionReponse {");
		sb.append(" }");
		return sb.toString();
	}
}
