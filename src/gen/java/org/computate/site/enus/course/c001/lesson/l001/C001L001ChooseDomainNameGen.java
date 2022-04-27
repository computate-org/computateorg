package org.computate.site.enus.course.c001.lesson.l001;

import org.computate.site.enus.request.SiteRequestEnUS;
import org.computate.site.enus.model.base.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.site.enus.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import org.computate.site.enus.course.c001.lesson.C001Lesson;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.QuestionReponse;
import java.lang.String;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.CommandLine;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName">Find the class C001L001ChooseDomainName in Solr. </a>
 * <br><br>Delete the class C001L001ChooseDomainName in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.course.c001.lesson.l001 in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class C001L001ChooseDomainNameGen<DEV> extends C001Lesson {
	protected static final Logger LOG = LoggerFactory.getLogger(C001L001ChooseDomainName.class);

	public static final String C001L001ChooseDomainName_AName_frFR = "un leçon";
	public static final String C001L001ChooseDomainName_This_frFR = "ce ";
	public static final String C001L001ChooseDomainName_ThisName_frFR = "ce leçon";
	public static final String C001L001ChooseDomainName_A_frFR = "un ";
	public static final String C001L001ChooseDomainName_TheName_frFR = "le leçon";
	public static final String C001L001ChooseDomainName_NameSingular_frFR = "leçon";
	public static final String C001L001ChooseDomainName_NamePlural_frFR = "lessons";
	public static final String C001L001ChooseDomainName_NameActual_frFR = "leçon actuel";
	public static final String C001L001ChooseDomainName_AllName_frFR = "tous les lessons";
	public static final String C001L001ChooseDomainName_SearchAllNameBy_frFR = "rechercher lessons par ";
	public static final String C001L001ChooseDomainName_SearchAllName_frFR = "rechercher lessons";
	public static final String C001L001ChooseDomainName_H1_frFR = "Quel est l'étape première pour créer mon propre site Web ? ";
	public static final String C001L001ChooseDomainName_H2_frFR = "Choisir un nom de domaine. ";
	public static final String C001L001ChooseDomainName_Title_frFR = "Quel est l'étape première pour créer mon propre site Web ? Choisir un nom de domaine. ";
	public static final String C001L001ChooseDomainName_ThePluralName_frFR = "les lessons";
	public static final String C001L001ChooseDomainName_NoNameFound_frFR = "aucun leçon trouvé";
	public static final String C001L001ChooseDomainName_NameVar_frFR = "leçon";
	public static final String C001L001ChooseDomainName_OfName_frFR = "de leçon";
	public static final String C001L001ChooseDomainName_NameAdjectiveSingular_frFR = "leçon";
	public static final String C001L001ChooseDomainName_NameAdjectivePlural_frFR = "lessons";

	public static final String C001L001ChooseDomainName_AName_enUS = "a lesson";
	public static final String C001L001ChooseDomainName_This_enUS = "this ";
	public static final String C001L001ChooseDomainName_ThisName_enUS = "this lesson";
	public static final String C001L001ChooseDomainName_A_enUS = "a ";
	public static final String C001L001ChooseDomainName_TheName_enUS = "the lesson";
	public static final String C001L001ChooseDomainName_NameSingular_enUS = "lesson";
	public static final String C001L001ChooseDomainName_NamePlural_enUS = "lessons";
	public static final String C001L001ChooseDomainName_NameActual_enUS = "current lesson";
	public static final String C001L001ChooseDomainName_AllName_enUS = "all the lessons";
	public static final String C001L001ChooseDomainName_SearchAllNameBy_enUS = "search lessons by ";
	public static final String C001L001ChooseDomainName_H1_enUS = "What is the first step to creating my own website? ";
	public static final String C001L001ChooseDomainName_H2_enUS = "Choose a domain name. ";
	public static final String C001L001ChooseDomainName_Title_enUS = "What is the first step to creating my own website? Choose a domain name. ";
	public static final String C001L001ChooseDomainName_ThePluralName_enUS = "the lessons";
	public static final String C001L001ChooseDomainName_NoNameFound_enUS = "no lesson found";
	public static final String C001L001ChooseDomainName_NameVar_enUS = "lesson";
	public static final String C001L001ChooseDomainName_OfName_enUS = "of lesson";
	public static final String C001L001ChooseDomainName_ANameAdjective_enUS = "a lesson";
	public static final String C001L001ChooseDomainName_NameAdjectiveSingular_enUS = "lesson";
	public static final String C001L001ChooseDomainName_NameAdjectivePlural_enUS = "lessons";

	public static final String C001L001ChooseDomainName_Color = "green";
	public static final String C001L001ChooseDomainName_IconGroup = "regular";
	public static final String C001L001ChooseDomainName_IconName = "book";

	///////////
	// intro //
	///////////

	public static final String introP1_frFR = "Envisagez-vous de créer un site Web à vous ? ";
	public static final String introP2_frFR = "Peut-être vous demandez-vous quelle est la première étape de la création de votre site Web ? ";
	public static final String introP_frFR = introP1_frFR + introP2_frFR;
	public static final String introP1_enUS = "Are you thinking about launching your own website? ";
	public static final String introP2_enUS = "Are you wondering what the very first step is to creating your own website? ";
	public static final String introP_enUS = introP1_enUS + introP2_enUS;

	/**	 The entity intro
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml intro = new PageHtml();

	/**	<br> The entity intro
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:intro">Find the entity intro in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _intro(PageHtml o);

	public PageHtml getIntro() {
		return intro;
	}

	public void setIntro(PageHtml intro) {
		this.intro = intro;
	}
	public static PageHtml staticSetIntro(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName introInit() {
		_intro(intro);
		return (C001L001ChooseDomainName)this;
	}

	/////////
	// moi //
	/////////

	public static final String moiP1_frFR = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2_frFR = "Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. ";
	public static final String moiP3_frFR = "La première chose à faire est de choisir votre nom de domaine, afin que vous puissiez commencer dans la bonne direction. ";
	public static final String moiP_frFR = moiP1_frFR + moiP2_frFR + moiP3_frFR;
	public static final String moiP1_enUS = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2_enUS = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP3_enUS = "The first thing you should do is choose your domain name so you can get started in the right direction. ";
	public static final String moiP_enUS = moiP1_enUS + moiP2_enUS + moiP3_enUS;

	/**	 The entity moi
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml moi = new PageHtml();

	/**	<br> The entity moi
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:moi">Find the entity moi in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _moi(PageHtml o);

	public PageHtml getMoi() {
		return moi;
	}

	public void setMoi(PageHtml moi) {
		this.moi = moi;
	}
	public static PageHtml staticSetMoi(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName moiInit() {
		_moi(moi);
		return (C001L001ChooseDomainName)this;
	}

	//////////////
	// aLAvance //
	//////////////

	public static final String aLAvanceH3Span1_frFR = "Est-t-il important d'acheter un nom de domaine à l'avance ? ";
	public static final String aLAvanceH3Span_frFR = aLAvanceH3Span1_frFR;
	public static final String aLAvanceH4Span1_frFR = "Vous devez savoir maintenant comment vous appelez votre site, afin que vous ne seriez pas perdu. ";
	public static final String aLAvanceH4Span_frFR = aLAvanceH4Span1_frFR;
	public static final String aLAvanceP1_frFR = "Vous pouvez commencer aujourd'hui avec votre propre ordinateur à construire votre propre site Web, mais vous devez comprendre ce que le site s'appele. ";
	public static final String aLAvanceP2_frFR = "Le destin du nom de votre ordinateur en dépend. ";
	public static final String aLAvanceP3_frFR = "Les répertoires où vous mettez votre site Web l'attendent. ";
	public static final String aLAvanceP4_frFR = "Toutes les applications qui font partie du site Web devront le connaître. ";
	public static final String aLAvanceP5_frFR = "Alors, passez du temps et pensez au .com, .fr ou .nimporte qui représentera votre vision, puis revenez ici et je vais vous aider à partir de là. ";
	public static final String aLAvanceP_frFR = aLAvanceP1_frFR + aLAvanceP2_frFR + aLAvanceP3_frFR + aLAvanceP4_frFR + aLAvanceP5_frFR;
	public static final String aLAvanceH3I1_enUS = "fas fa-history";
	public static final String aLAvanceH3I_enUS = aLAvanceH3I1_enUS;
	public static final String aLAvanceH3Span1_enUS = "Is it important to purchase a domain name ahead of time? ";
	public static final String aLAvanceH3Span_enUS = aLAvanceH3Span1_enUS;
	public static final String aLAvanceH4I1_enUS = "fas fa-map-pin";
	public static final String aLAvanceH4I_enUS = aLAvanceH4I1_enUS;
	public static final String aLAvanceH4Span1_enUS = "You need to know now what your site will be called so you don't get lost. ";
	public static final String aLAvanceH4Span_enUS = aLAvanceH4Span1_enUS;
	public static final String aLAvanceP1_enUS = "You can start today with your very own computer building your own website, but you must figure out what it will be called. ";
	public static final String aLAvanceP2_enUS = "The fate of the name of your computer depends on it. ";
	public static final String aLAvanceP3_enUS = "The directories where you will be putting your website are waiting for it. ";
	public static final String aLAvanceP4_enUS = "All the applications that are part of the website will need to know it. ";
	public static final String aLAvanceP5_enUS = "So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. ";
	public static final String aLAvanceP_enUS = aLAvanceP1_enUS + aLAvanceP2_enUS + aLAvanceP3_enUS + aLAvanceP4_enUS + aLAvanceP5_enUS;

	/**	 The entity aLAvance
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml aLAvance = new PageHtml();

	/**	<br> The entity aLAvance
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:aLAvance">Find the entity aLAvance in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _aLAvance(PageHtml o);

	public PageHtml getALAvance() {
		return aLAvance;
	}

	public void setALAvance(PageHtml aLAvance) {
		this.aLAvance = aLAvance;
	}
	public static PageHtml staticSetALAvance(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName aLAvanceInit() {
		_aLAvance(aLAvance);
		return (C001L001ChooseDomainName)this;
	}

	/////////////
	// acheter //
	/////////////

	public static final String acheterH3Span1_frFR = "Où puis-je acheter un nom de domaine ? ";
	public static final String acheterH3Span_frFR = acheterH3Span1_frFR;
	public static final String acheterH4Span1_frFR = "Il y a tellement d'enregistreurs de noms de domaine à choisir, mais vous pouvez essayer brinkster.com ou gandi.net. ";
	public static final String acheterH4Span_frFR = acheterH4Span1_frFR;
	public static final String acheterPSpan11_frFR = "Je ne peux pas vous dire où l'endroit le moins cher ou le lieu le plus digne de confiance est d'acheter le nom de domaine de votre site. ";
	public static final String acheterPSpan12_frFR = "Mais je peux vous dire où j'ai acheté le mien il y a 12 ans, c'est ";
	public static final String acheterPSpan1_frFR = acheterPSpan11_frFR + acheterPSpan12_frFR;
	public static final String acheterPSpan1A1_frFR = "https://secure.brinkster.com/Domains/";
	public static final String acheterPSpan1A_frFR = acheterPSpan1A1_frFR;
	public static final String acheterPSpan21_frFR = ". Mais brinkster.com n'est pas le moins chèr ($ 19.83 cette année). ";
	public static final String acheterPSpan22_frFR = "Peut-être vous voulez essayer ";
	public static final String acheterPSpan2_frFR = acheterPSpan21_frFR + acheterPSpan22_frFR;
	public static final String acheterPSpan2A1_frFR = "https://www.gandi.net/fr";
	public static final String acheterPSpan2A_frFR = acheterPSpan2A1_frFR;
	public static final String acheterPSpan31_frFR = ". Leurs prix varient, mais ils ont des noms de domaine publicitaire à un bon prix, et beaucoup d'autres options à choisir. ";
	public static final String acheterPSpan3_frFR = acheterPSpan31_frFR;
	public static final String acheterH3I1_enUS = "fas fa-credit-card";
	public static final String acheterH3I_enUS = acheterH3I1_enUS;
	public static final String acheterH3Span1_enUS = "Where can I purchase a domain name? ";
	public static final String acheterH3Span_enUS = acheterH3Span1_enUS;
	public static final String acheterH4I1_enUS = "fas fa-building";
	public static final String acheterH4I_enUS = acheterH4I1_enUS;
	public static final String acheterH4Span1_enUS = "There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. ";
	public static final String acheterH4Span_enUS = acheterH4Span1_enUS;
	public static final String acheterPSpan11_enUS = "I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. ";
	public static final String acheterPSpan12_enUS = "But I can tell you where I purchased mine 12 years ago, which is ";
	public static final String acheterPSpan1_enUS = acheterPSpan11_enUS + acheterPSpan12_enUS;
	public static final String acheterPSpan1A11_enUS = "https://secure.brinkster.com/Domains/";
	public static final String acheterPSpan1A1_enUS = acheterPSpan1A11_enUS;
	public static final String acheterPSpan21_enUS = ". But brinkster.com is not the cheapest ($19.83 this year). ";
	public static final String acheterPSpan22_enUS = "You may also want to try ";
	public static final String acheterPSpan2_enUS = acheterPSpan21_enUS + acheterPSpan22_enUS;
	public static final String acheterPSpan2A21_enUS = "https://www.gandi.net/en";
	public static final String acheterPSpan2A2_enUS = acheterPSpan2A21_enUS;
	public static final String acheterPSpan31_enUS = ". Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. ";
	public static final String acheterPSpan3_enUS = acheterPSpan31_enUS;

	/**	 The entity acheter
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml acheter = new PageHtml();

	/**	<br> The entity acheter
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:acheter">Find the entity acheter in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _acheter(PageHtml o);

	public PageHtml getAcheter() {
		return acheter;
	}

	public void setAcheter(PageHtml acheter) {
		this.acheter = acheter;
	}
	public static PageHtml staticSetAcheter(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName acheterInit() {
		_acheter(acheter);
		return (C001L001ChooseDomainName)this;
	}

	/////////////
	// appeler //
	/////////////

	public static final String appelerH3Span1_frFR = "Qu'est-ce que je choisis comme un nom de domaine ? ";
	public static final String appelerH3Span_frFR = appelerH3Span1_frFR;
	public static final String appelerH4Span1_frFR = "Trouver un nom de domaine qui atteindra votre public. ";
	public static final String appelerH4Span_frFR = appelerH4Span1_frFR;
	public static final String appelerP1_frFR = "Je ne connais pas votre passion, mais trouvez un nom de domaine qui atteindra votre public. ";
	public static final String appelerP2_frFR = "C'est bon si c'est court. ";
	public static final String appelerP3_frFR = "Que ce soit un .com, ou .org, ou .fr, tout dépend de vous aussi. ";
	public static final String appelerP4_frFR = "Créez un endroit dont vous serez fier un jour ! ";
	public static final String appelerP_frFR = appelerP1_frFR + appelerP2_frFR + appelerP3_frFR + appelerP4_frFR;
	public static final String appelerH3I1_enUS = "fab fa-wpforms";
	public static final String appelerH3I_enUS = appelerH3I1_enUS;
	public static final String appelerH3Span1_enUS = "What do I choose for a domain name? ";
	public static final String appelerH3Span_enUS = appelerH3Span1_enUS;
	public static final String appelerH4I1_enUS = "fas fa-bullhorn";
	public static final String appelerH4I_enUS = appelerH4I1_enUS;
	public static final String appelerH4Span1_enUS = "Find a domain name that will reach your audience. ";
	public static final String appelerH4Span_enUS = appelerH4Span1_enUS;
	public static final String appelerP1_enUS = "I don't know your passion, but find a domain name that will reach your audience. ";
	public static final String appelerP2_enUS = "It's good if it is short and sweet. ";
	public static final String appelerP3_enUS = "Whether it is a .com, or .org, or .net or whatever is up to you too. ";
	public static final String appelerP4_enUS = "Just make it a place you will be proud of someday! ";
	public static final String appelerP_enUS = appelerP1_enUS + appelerP2_enUS + appelerP3_enUS + appelerP4_enUS;

	/**	 The entity appeler
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml appeler = new PageHtml();

	/**	<br> The entity appeler
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:appeler">Find the entity appeler in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _appeler(PageHtml o);

	public PageHtml getAppeler() {
		return appeler;
	}

	public void setAppeler(PageHtml appeler) {
		this.appeler = appeler;
	}
	public static PageHtml staticSetAppeler(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName appelerInit() {
		_appeler(appeler);
		return (C001L001ChooseDomainName)this;
	}

	////////////
	// apres1 //
	////////////

	public static final String apres1H3Span1_frFR = "Qu'est-ce que je fais après j'ai acheté un nom de domaine ? ";
	public static final String apres1H3Span_frFR = apres1H3Span1_frFR;
	public static final String apres1H4Span1_frFR = "Gérer votre domaine. ";
	public static final String apres1H4Span_frFR = apres1H4Span1_frFR;
	public static final String apres1PSpan11_frFR = "Laissez-moi vous montrer comment gérer un nom de domaine. ";
	public static final String apres1PSpan12_frFR = "Je vais me connecter au site de mon propre enregistreur, ";
	public static final String apres1PSpan1_frFR = apres1PSpan11_frFR + apres1PSpan12_frFR;
	public static final String apres1PSpan1A1_frFR = "https://secure.brinkster.com/";
	public static final String apres1PSpan1A_frFR = apres1PSpan1A1_frFR;
	public static final String apres1PSpan21_frFR = ". ";
	public static final String apres1PSpan2_frFR = apres1PSpan21_frFR;
	public static final String apres1H3I1_enUS = "fas fa-cart-plus";
	public static final String apres1H3I_enUS = apres1H3I1_enUS;
	public static final String apres1H3Span1_enUS = "What do I do after I bought a domain name? ";
	public static final String apres1H3Span_enUS = apres1H3Span1_enUS;
	public static final String apres1H4I1_enUS = "fas fa-clipboard-check";
	public static final String apres1H4I_enUS = apres1H4I1_enUS;
	public static final String apres1H4Span1_enUS = "Manage your domain. ";
	public static final String apres1H4Span_enUS = apres1H4Span1_enUS;
	public static final String apres1PSpan11_enUS = "Let me show you what it's like to manage a domain name. ";
	public static final String apres1PSpan12_enUS = "I will log into my own registrar's site, ";
	public static final String apres1PSpan1_enUS = apres1PSpan11_enUS + apres1PSpan12_enUS;
	public static final String apres1PSpan1A1_enUS = "https://secure.brinkster.com/";
	public static final String apres1PSpan1A_enUS = apres1PSpan1A1_enUS;
	public static final String apres1PSpan21_enUS = ". ";
	public static final String apres1PSpan2_enUS = apres1PSpan21_enUS;

	/**	 The entity apres1
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml apres1 = new PageHtml();

	/**	<br> The entity apres1
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres1">Find the entity apres1 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres1(PageHtml o);

	public PageHtml getApres1() {
		return apres1;
	}

	public void setApres1(PageHtml apres1) {
		this.apres1 = apres1;
	}
	public static PageHtml staticSetApres1(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName apres1Init() {
		_apres1(apres1);
		return (C001L001ChooseDomainName)this;
	}

	////////////
	// apres2 //
	////////////

	public static final String apres2UlLi11_frFR = "Je clique sur « Login ». ";
	public static final String apres2UlLi1_frFR = apres2UlLi11_frFR;
	public static final String apres2UlLi21_frFR = "Je clique encore sur « Login ». ";
	public static final String apres2UlLi2_frFR = apres2UlLi21_frFR;
	public static final String apres2UlLi31_frFR = "Je clique sur « DOMAIN NAMES ». ";
	public static final String apres2UlLi32_frFR = "Et là vous pouvez voir mes noms de domaine qui sont encore vivants, et ceux qui sont morts. ";
	public static final String apres2UlLi33_frFR = "Ainsi, les domaines expirent chaque année et peuvent être renouvelés chaque année. ";
	public static final String apres2UlLi3_frFR = apres2UlLi31_frFR + apres2UlLi32_frFR + apres2UlLi33_frFR;
	public static final String apres2UlLi41_frFR = "Je peux également gérer mon site, je clique sur « Manage ». ";
	public static final String apres2UlLi4_frFR = apres2UlLi41_frFR;
	public static final String apres2UlLi11_enUS = "I click on \"Login\". ";
	public static final String apres2UlLi1_enUS = apres2UlLi11_enUS;
	public static final String apres2UlLi21_enUS = "I click again on \"Login\". ";
	public static final String apres2UlLi2_enUS = apres2UlLi21_enUS;
	public static final String apres2UlLi31_enUS = "I click on \"DOMAIN NAMES\". ";
	public static final String apres2UlLi32_enUS = "And there you can see my domain names that are still alive, and those that are dead. ";
	public static final String apres2UlLi33_enUS = "So domains expire yearly, and they can be renewed each year. ";
	public static final String apres2UlLi3_enUS = apres2UlLi31_enUS + apres2UlLi32_enUS + apres2UlLi33_enUS;
	public static final String apres2UlLi41_enUS = "I can also manage my site, so I will click on \"Manage\". ";
	public static final String apres2UlLi4_enUS = apres2UlLi41_enUS;

	/**	 The entity apres2
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml apres2 = new PageHtml();

	/**	<br> The entity apres2
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres2">Find the entity apres2 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres2(PageHtml o);

	public PageHtml getApres2() {
		return apres2;
	}

	public void setApres2(PageHtml apres2) {
		this.apres2 = apres2;
	}
	public static PageHtml staticSetApres2(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName apres2Init() {
		_apres2(apres2);
		return (C001L001ChooseDomainName)this;
	}

	////////////
	// apres3 //
	////////////

	public static final String apres3UlLi11_frFR = "Si je clique sur « Update Domain Registrant Information », je peux mettre à jour mon nom et mon adresse pour m'assurer que je reçois du spam de tous les internautes qui ont remarqué que j'ai créé un nouveau domaine. ";
	public static final String apres3UlLi12_frFR = "Je recommanderais un Boîte à la poste pour votre entreprise, plutôt que votre adresse personnelle, pour plus d'intimité. ";
	public static final String apres3UlLi1_frFR = apres3UlLi11_frFR + apres3UlLi12_frFR;
	public static final String apres3UlLi11_enUS = "If I click on \"Update Domain Registrant Information\" I can update my name and address information to make sure I receive spam from everyone on the Web who noticed I created a new domain. ";
	public static final String apres3UlLi12_enUS = "I would recommend a P.O. Box for your business, rather than your home address, for more privacy. ";
	public static final String apres3UlLi1_enUS = apres3UlLi11_enUS + apres3UlLi12_enUS;

	/**	 The entity apres3
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml apres3 = new PageHtml();

	/**	<br> The entity apres3
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres3">Find the entity apres3 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres3(PageHtml o);

	public PageHtml getApres3() {
		return apres3;
	}

	public void setApres3(PageHtml apres3) {
		this.apres3 = apres3;
	}
	public static PageHtml staticSetApres3(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName apres3Init() {
		_apres3(apres3);
		return (C001L001ChooseDomainName)this;
	}

	////////////
	// apres4 //
	////////////

	public static final String apres4UlLi11_frFR = "Si je reviens et clique sur « Update Name Servers », je peux rediriger mon site vers une autre société DNS que mon registraire, brinkster.com. ";
	public static final String apres4UlLi12_frFR = "C'est pratique pour moi, car j'utilise en fait mon fournisseur de messagerie SMTP fastmail.com comme fournisseur DNS, donc j'ai mis les serveurs de noms de mon fournisseur DNS là-bas. ";
	public static final String apres4UlLi13_frFR = "Vous n'avez pas besoin d'un fournisseur de DNS différent, vous pouvez également utiliser votre bureau d'enregistrement pour le courrier électronique, mais j'ai choisi Fastmail pour leur confidentialité et leur excellente interface de messagerie. ";
	public static final String apres4UlLi1_frFR = apres4UlLi11_frFR + apres4UlLi12_frFR + apres4UlLi13_frFR;
	public static final String apres4UlLi11_enUS = "If I go back and click on \"Update Name Servers\" I can point my website to a different DNS company than my registrar, brinkster.com. ";
	public static final String apres4UlLi12_enUS = "This is handy for me, because I actually use my email SMTP provider fastmail.com as my DNS provider, so I put in the name servers of my DNS provider there. ";
	public static final String apres4UlLi13_enUS = "You don't need a different DNS provider, you can usually use your registrar for email as well, but I choose fastmail for their privacy and excellent email interface. ";
	public static final String apres4UlLi1_enUS = apres4UlLi11_enUS + apres4UlLi12_enUS + apres4UlLi13_enUS;

	/**	 The entity apres4
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml apres4 = new PageHtml();

	/**	<br> The entity apres4
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres4">Find the entity apres4 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres4(PageHtml o);

	public PageHtml getApres4() {
		return apres4;
	}

	public void setApres4(PageHtml apres4) {
		this.apres4 = apres4;
	}
	public static PageHtml staticSetApres4(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName apres4Init() {
		_apres4(apres4);
		return (C001L001ChooseDomainName)this;
	}

	////////////
	// apres5 //
	////////////

	public static final String apres5UlLi11_frFR = "Dans un futur leçon, nous parlerons de la création d'une adresse IP statique afin que les utilisateurs puissent trouver votre serveur Web, sur votre ordinateur, sur votre domaine. ";
	public static final String apres5UlLi12_frFR = "Lorsque vous avez cela, vous pouvez demander à l'équipe de support de votre enregistreur, de créer pour vous des « enregistrements A » sur votre adresse IP statique. ";
	public static final String apres5UlLi13_frFR = "Par exemple, je demanderais que deux enregistrements A soient créés pour « computate.org » et « *.computate.org » sur mon adresse IP statique. ";
	public static final String apres5UlLi14_frFR = "Mais comme j'utilise fastmail pour mon DNS, je peux créer mes propres enregistrements A pour chacun de mes domaines dans mon compte, ce qui est utile. ";
	public static final String apres5UlLi1_frFR = apres5UlLi11_frFR + apres5UlLi12_frFR + apres5UlLi13_frFR + apres5UlLi14_frFR;
	public static final String apres5UlLi11_enUS = "In a future lesson, we'll talk about creating a static IP address so that users can find your web server, on your computer, at your domain. ";
	public static final String apres5UlLi12_enUS = "When you have this, you can ask the support team at your registrar, to create for you some \"A records\" at your static IP. ";
	public static final String apres5UlLi13_enUS = "For example, I would ask for two A records to be created for \"computate.org\" and \"*.computate.org\" to my static IP address. ";
	public static final String apres5UlLi14_enUS = "But since I use fastmail for my DNS, I can actually create my own A records for any of my domains in my account, which is nice. ";
	public static final String apres5UlLi1_enUS = apres5UlLi11_enUS + apres5UlLi12_enUS + apres5UlLi13_enUS + apres5UlLi14_enUS;

	/**	 The entity apres5
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml apres5 = new PageHtml();

	/**	<br> The entity apres5
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres5">Find the entity apres5 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres5(PageHtml o);

	public PageHtml getApres5() {
		return apres5;
	}

	public void setApres5(PageHtml apres5) {
		this.apres5 = apres5;
	}
	public static PageHtml staticSetApres5(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName apres5Init() {
		_apres5(apres5);
		return (C001L001ChooseDomainName)this;
	}

	//////////////
	// plusTard //
	//////////////

	public static final String plusTardH3Span1_frFR = "Puis-je commencer à développer mon site localement avant de choisir mon nom de domaine ? ";
	public static final String plusTardH3Span_frFR = plusTardH3Span1_frFR;
	public static final String plusTardH4Span1_frFR = "Le nom d'hôte de votre ordinateur dépendra de votre nom de domaine. ";
	public static final String plusTardH4Span_frFR = plusTardH4Span1_frFR;
	public static final String plusTardP1_frFR = "Si vous ne connaissez pas votre nom de domaine, cela vous gâchera plus tard. ";
	public static final String plusTardP2_frFR = "Avoir un nom d'hôte qui est un sous-domaine de votre nom de domaine facilite le développement et la mise en ligne de votre site. ";
	public static final String plusTardP3_frFR = "Vous pouvez attribuer à vos ordinateurs des noms d'hôtes qui sont des sous-domaines de votre propre nom de domaine afin de faciliter le développement et l'affichage local et public de votre site à partir de la même URL. ";
	public static final String plusTardP4_frFR = "J'aime créer un répertoire pour votre nom de domaine pour stocker des certificats SSL et d'autres fichiers spécifiques au domaine au même endroit pour être synchronisé avec tous vos ordinateurs. ";
	public static final String plusTardP5_frFR = "Alors, au lieu de vous compliquer la vie, profitez de cette opportunité pour acheter votre nom de domaine, c'est moins de 20 euros par an! ";
	public static final String plusTardP6_frFR = "Vous pouvez maintenant continuer à lancer votre propre site Web avec succès sur votre propre ordinateur. ";
	public static final String plusTardP_frFR = plusTardP1_frFR + plusTardP2_frFR + plusTardP3_frFR + plusTardP4_frFR + plusTardP5_frFR + plusTardP6_frFR;
	public static final String plusTardH3I1_enUS = "fas fa-fast-forward";
	public static final String plusTardH3I_enUS = plusTardH3I1_enUS;
	public static final String plusTardH3Span1_enUS = "Can I start developing my website locally before deciding on my domain name? ";
	public static final String plusTardH3Span_enUS = plusTardH3Span1_enUS;
	public static final String plusTardH4I1_enUS = "fas fa-list-ol";
	public static final String plusTardH4I_enUS = plusTardH4I1_enUS;
	public static final String plusTardH4Span1_enUS = "The hostname of your computer will depend on your domain name. ";
	public static final String plusTardH4Span_enUS = plusTardH4Span1_enUS;
	public static final String plusTardP1_enUS = "If you don't know your domain name, it's going to bite you later. ";
	public static final String plusTardP2_enUS = "Having a hostname that is a subdomain of your domain name makes it easier to develop and bring your site live. ";
	public static final String plusTardP3_enUS = "You can give your computers hostnames that are subdomains of your own domain name to make it easy to develop and view your site locally and publicly from the same URL. ";
	public static final String plusTardP4_enUS = "I like creating a directory for your domain name for storing SSL certs and other domain specific files together in the same place to be synced to all your computers. ";
	public static final String plusTardP5_enUS = "So instead of making it harder on yourself, take this exciting opportunity to buy your domain name, it's less than $20 per year! ";
	public static final String plusTardP6_enUS = "Now you can continue to launch your own successful website on your own computer. ";
	public static final String plusTardP_enUS = plusTardP1_enUS + plusTardP2_enUS + plusTardP3_enUS + plusTardP4_enUS + plusTardP5_enUS + plusTardP6_enUS;

	/**	 The entity plusTard
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected QuestionReponse plusTard = new QuestionReponse();

	/**	<br> The entity plusTard
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:plusTard">Find the entity plusTard in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _plusTard(QuestionReponse o);

	public QuestionReponse getPlusTard() {
		return plusTard;
	}

	public void setPlusTard(QuestionReponse plusTard) {
		this.plusTard = plusTard;
	}
	public static QuestionReponse staticSetPlusTard(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName plusTardInit() {
		_plusTard(plusTard);
		return (C001L001ChooseDomainName)this;
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31_frFR = "À récapituler : ";
	public static final String recapituler1H3_frFR = recapituler1H31_frFR;
	public static final String recapituler1H31_enUS = "To review: ";
	public static final String recapituler1H3_enUS = recapituler1H31_enUS;

	/**	 The entity recapituler1
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml recapituler1 = new PageHtml();

	/**	<br> The entity recapituler1
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler1">Find the entity recapituler1 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler1(PageHtml o);

	public PageHtml getRecapituler1() {
		return recapituler1;
	}

	public void setRecapituler1(PageHtml recapituler1) {
		this.recapituler1 = recapituler1;
	}
	public static PageHtml staticSetRecapituler1(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName recapituler1Init() {
		_recapituler1(recapituler1);
		return (C001L001ChooseDomainName)this;
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11_frFR = "Mardi ";
	public static final String recapituler2TableTr1Td1_frFR = recapituler2TableTr1Td11_frFR;
	public static final String recapituler2TableTr2Td11_frFR = "23 Avril 2019";
	public static final String recapituler2TableTr2Td1_frFR = recapituler2TableTr2Td11_frFR;
	public static final String recapituler2TableTr2Td21_frFR = "Première étape pour créer un site web ? ";
	public static final String recapituler2TableTr2Td2_frFR = recapituler2TableTr2Td21_frFR;
	public static final String recapituler2TableTr2Td31_frFR = "Choisir un nom de domaine. ";
	public static final String recapituler2TableTr2Td3_frFR = recapituler2TableTr2Td31_frFR;
	public static final String recapituler2TableTr2Td41_frFR = "Par Christophe Tate";
	public static final String recapituler2TableTr2Td4_frFR = recapituler2TableTr2Td41_frFR;
	public static final String recapituler2TableTr1Td11_enUS = "Tuesday ";
	public static final String recapituler2TableTr1Td1_enUS = recapituler2TableTr1Td11_enUS;
	public static final String recapituler2TableTr1Td2I1_enUS = "fas fa-question";
	public static final String recapituler2TableTr1Td2I_enUS = recapituler2TableTr1Td2I1_enUS;
	public static final String recapituler2TableTr1Td3I1_enUS = "fas fa-hand-receiving";
	public static final String recapituler2TableTr1Td3I_enUS = recapituler2TableTr1Td3I1_enUS;
	public static final String recapituler2TableTr1Td4I1_enUS = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I_enUS = recapituler2TableTr1Td4I1_enUS;
	public static final String recapituler2TableTr2Td11_enUS = "April 23 2019";
	public static final String recapituler2TableTr2Td1_enUS = recapituler2TableTr2Td11_enUS;
	public static final String recapituler2TableTr2Td21_enUS = "First step to create a website? ";
	public static final String recapituler2TableTr2Td2_enUS = recapituler2TableTr2Td21_enUS;
	public static final String recapituler2TableTr2Td31_enUS = "Choose a domain name. ";
	public static final String recapituler2TableTr2Td3_enUS = recapituler2TableTr2Td31_enUS;
	public static final String recapituler2TableTr2Td41_enUS = "By Christopher Tate";
	public static final String recapituler2TableTr2Td4_enUS = recapituler2TableTr2Td41_enUS;

	/**	 The entity recapituler2
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml recapituler2 = new PageHtml();

	/**	<br> The entity recapituler2
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler2">Find the entity recapituler2 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler2(PageHtml o);

	public PageHtml getRecapituler2() {
		return recapituler2;
	}

	public void setRecapituler2(PageHtml recapituler2) {
		this.recapituler2 = recapituler2;
	}
	public static PageHtml staticSetRecapituler2(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName recapituler2Init() {
		_recapituler2(recapituler2);
		return (C001L001ChooseDomainName)this;
	}

	//////////////////
	// recapituler3 //
	//////////////////

	public static final String recapituler3TableTr1Td21_frFR = "Questions";
	public static final String recapituler3TableTr1Td2_frFR = recapituler3TableTr1Td21_frFR;
	public static final String recapituler3TableTr1Td41_frFR = "Reponses";
	public static final String recapituler3TableTr1Td4_frFR = recapituler3TableTr1Td41_frFR;
	public static final String recapituler3TableTr2Td21_frFR = "Devrais je l'acheter à l'avance ? ";
	public static final String recapituler3TableTr2Td2_frFR = recapituler3TableTr2Td21_frFR;
	public static final String recapituler3TableTr2Td41_frFR = "Savoir maintenant comment vous appelez votre site. ";
	public static final String recapituler3TableTr2Td4_frFR = recapituler3TableTr2Td41_frFR;
	public static final String recapituler3TableTr3Td21_frFR = "Où puis-je acheter un nom de domaine ? ";
	public static final String recapituler3TableTr3Td2_frFR = recapituler3TableTr3Td21_frFR;
	public static final String recapituler3TableTr3Td41_frFR = "Essayez brinkster.com ou gandi.net. ";
	public static final String recapituler3TableTr3Td4_frFR = recapituler3TableTr3Td41_frFR;
	public static final String recapituler3TableTr4Td21_frFR = "Qu'est-ce que je choisis comme un nom de domaine ? ";
	public static final String recapituler3TableTr4Td2_frFR = recapituler3TableTr4Td21_frFR;
	public static final String recapituler3TableTr4Td41_frFR = "Atteindra votre public. ";
	public static final String recapituler3TableTr4Td4_frFR = recapituler3TableTr4Td41_frFR;
	public static final String recapituler3TableTr5Td21_frFR = "Quoi faire après j'ai acheté un nom de domaine ? ";
	public static final String recapituler3TableTr5Td2_frFR = recapituler3TableTr5Td21_frFR;
	public static final String recapituler3TableTr5Td41_frFR = "Gérer votre domaine. ";
	public static final String recapituler3TableTr5Td4_frFR = recapituler3TableTr5Td41_frFR;
	public static final String recapituler3TableTr6Td21_frFR = "Puis-je choisir un nom de domaine plus tard ? ";
	public static final String recapituler3TableTr6Td2_frFR = recapituler3TableTr6Td21_frFR;
	public static final String recapituler3TableTr6Td41_frFR = "Le nom d'hôte de votre ordinateur le dépendra. ";
	public static final String recapituler3TableTr6Td4_frFR = recapituler3TableTr6Td41_frFR;
	public static final String recapituler3TableTr1Td1I1_enUS = "fas fa-question";
	public static final String recapituler3TableTr1Td1I_enUS = recapituler3TableTr1Td1I1_enUS;
	public static final String recapituler3TableTr1Td21_enUS = "Questions";
	public static final String recapituler3TableTr1Td2_enUS = recapituler3TableTr1Td21_enUS;
	public static final String recapituler3TableTr1Td3I1_enUS = "fas fa-bullhorn";
	public static final String recapituler3TableTr1Td3I_enUS = recapituler3TableTr1Td3I1_enUS;
	public static final String recapituler3TableTr1Td41_enUS = "Answers";
	public static final String recapituler3TableTr1Td4_enUS = recapituler3TableTr1Td41_enUS;
	public static final String recapituler3TableTr2Td1I1_enUS = "fas fa-history";
	public static final String recapituler3TableTr2Td1I_enUS = recapituler3TableTr2Td1I1_enUS;
	public static final String recapituler3TableTr2Td21_enUS = "Should I buy it ahead of time? ";
	public static final String recapituler3TableTr2Td2_enUS = recapituler3TableTr2Td21_enUS;
	public static final String recapituler3TableTr2Td3I1_enUS = "fas fa-map-pin";
	public static final String recapituler3TableTr2Td3I_enUS = recapituler3TableTr2Td3I1_enUS;
	public static final String recapituler3TableTr2Td41_enUS = "Know what your site will be called. ";
	public static final String recapituler3TableTr2Td4_enUS = recapituler3TableTr2Td41_enUS;
	public static final String recapituler3TableTr3Td1I1_enUS = "fas fa-credit-card";
	public static final String recapituler3TableTr3Td1I_enUS = recapituler3TableTr3Td1I1_enUS;
	public static final String recapituler3TableTr3Td21_enUS = "Where can I purchase a domain name? ";
	public static final String recapituler3TableTr3Td2_enUS = recapituler3TableTr3Td21_enUS;
	public static final String recapituler3TableTr3Td3I1_enUS = "fas fa-building";
	public static final String recapituler3TableTr3Td3I_enUS = recapituler3TableTr3Td3I1_enUS;
	public static final String recapituler3TableTr3Td41_enUS = "Try brinkster.com or gandi.net. ";
	public static final String recapituler3TableTr3Td4_enUS = recapituler3TableTr3Td41_enUS;
	public static final String recapituler3TableTr4Td1I1_enUS = "fab fa-wpforms";
	public static final String recapituler3TableTr4Td1I_enUS = recapituler3TableTr4Td1I1_enUS;
	public static final String recapituler3TableTr4Td21_enUS = "What do I choose for a domain name? ";
	public static final String recapituler3TableTr4Td2_enUS = recapituler3TableTr4Td21_enUS;
	public static final String recapituler3TableTr4Td3I1_enUS = "fas fa-bullhorn";
	public static final String recapituler3TableTr4Td3I_enUS = recapituler3TableTr4Td3I1_enUS;
	public static final String recapituler3TableTr4Td41_enUS = "Reach your audience. ";
	public static final String recapituler3TableTr4Td4_enUS = recapituler3TableTr4Td41_enUS;
	public static final String recapituler3TableTr5Td1I1_enUS = "fas fa-cart-plus";
	public static final String recapituler3TableTr5Td1I_enUS = recapituler3TableTr5Td1I1_enUS;
	public static final String recapituler3TableTr5Td21_enUS = "What do I do after I've bought a domain name? ";
	public static final String recapituler3TableTr5Td2_enUS = recapituler3TableTr5Td21_enUS;
	public static final String recapituler3TableTr5Td3I1_enUS = "fas fa-clipboard-check";
	public static final String recapituler3TableTr5Td3I_enUS = recapituler3TableTr5Td3I1_enUS;
	public static final String recapituler3TableTr5Td41_enUS = "Manage your domain. ";
	public static final String recapituler3TableTr5Td4_enUS = recapituler3TableTr5Td41_enUS;
	public static final String recapituler3TableTr6Td1I1_enUS = "fas fa-fast-forward";
	public static final String recapituler3TableTr6Td1I_enUS = recapituler3TableTr6Td1I1_enUS;
	public static final String recapituler3TableTr6Td21_enUS = "Can I pick a domain name later? ";
	public static final String recapituler3TableTr6Td2_enUS = recapituler3TableTr6Td21_enUS;
	public static final String recapituler3TableTr6Td3I1_enUS = "fas fa-list-ol";
	public static final String recapituler3TableTr6Td3I_enUS = recapituler3TableTr6Td3I1_enUS;
	public static final String recapituler3TableTr6Td41_enUS = "Your computer hostname will depend on it. ";
	public static final String recapituler3TableTr6Td4_enUS = recapituler3TableTr6Td41_enUS;

	/**	 The entity recapituler3
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PageHtml recapituler3 = new PageHtml();

	/**	<br> The entity recapituler3
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler3">Find the entity recapituler3 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler3(PageHtml o);

	public PageHtml getRecapituler3() {
		return recapituler3;
	}

	public void setRecapituler3(PageHtml recapituler3) {
		this.recapituler3 = recapituler3;
	}
	public static PageHtml staticSetRecapituler3(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainName recapituler3Init() {
		_recapituler3(recapituler3);
		return (C001L001ChooseDomainName)this;
	}

	///////////////////////
	// lessonSearch_frFR //
	///////////////////////

	/**	 The entity lessonSearch_frFR
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> lessonSearch_frFR = new ArrayList<String>();

	/**	<br> The entity lessonSearch_frFR
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:lessonSearch_frFR">Find the entity lessonSearch_frFR in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _lessonSearch_frFR(List<String> l);

	public List<String> getLessonSearch_frFR() {
		return lessonSearch_frFR;
	}

	public void setLessonSearch_frFR(List<String> lessonSearch_frFR) {
		this.lessonSearch_frFR = lessonSearch_frFR;
	}
	public static String staticSetLessonSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public C001L001ChooseDomainName addLessonSearch_frFR(String...objets) {
		for(String o : objets) {
			addLessonSearch_frFR(o);
		}
		return (C001L001ChooseDomainName)this;
	}
	public C001L001ChooseDomainName addLessonSearch_frFR(String o) {
		if(o != null)
			this.lessonSearch_frFR.add(o);
		return (C001L001ChooseDomainName)this;
	}
	@JsonIgnore
	public void setLessonSearch_frFR(JsonArray objets) {
		lessonSearch_frFR.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLessonSearch_frFR(o);
		}
	}
	protected C001L001ChooseDomainName lessonSearch_frFRInit() {
		_lessonSearch_frFR(lessonSearch_frFR);
		return (C001L001ChooseDomainName)this;
	}

	public static String staticSearchLessonSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLessonSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLessonSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrLessonSearch_frFR(siteRequest_, C001L001ChooseDomainName.staticSearchLessonSearch_frFR(siteRequest_, C001L001ChooseDomainName.staticSetLessonSearch_frFR(siteRequest_, o)));
	}

	///////////////////////
	// lessonSearch_enUS //
	///////////////////////

	/**	 The entity lessonSearch_enUS
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> lessonSearch_enUS = new ArrayList<String>();

	/**	<br> The entity lessonSearch_enUS
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:lessonSearch_enUS">Find the entity lessonSearch_enUS in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _lessonSearch_enUS(List<String> l);

	public List<String> getLessonSearch_enUS() {
		return lessonSearch_enUS;
	}

	public void setLessonSearch_enUS(List<String> lessonSearch_enUS) {
		this.lessonSearch_enUS = lessonSearch_enUS;
	}
	public static String staticSetLessonSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public C001L001ChooseDomainName addLessonSearch_enUS(String...objets) {
		for(String o : objets) {
			addLessonSearch_enUS(o);
		}
		return (C001L001ChooseDomainName)this;
	}
	public C001L001ChooseDomainName addLessonSearch_enUS(String o) {
		if(o != null)
			this.lessonSearch_enUS.add(o);
		return (C001L001ChooseDomainName)this;
	}
	@JsonIgnore
	public void setLessonSearch_enUS(JsonArray objets) {
		lessonSearch_enUS.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLessonSearch_enUS(o);
		}
	}
	protected C001L001ChooseDomainName lessonSearch_enUSInit() {
		_lessonSearch_enUS(lessonSearch_enUS);
		return (C001L001ChooseDomainName)this;
	}

	public static String staticSearchLessonSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLessonSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLessonSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrLessonSearch_enUS(siteRequest_, C001L001ChooseDomainName.staticSearchLessonSearch_enUS(siteRequest_, C001L001ChooseDomainName.staticSetLessonSearch_enUS(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001L001ChooseDomainName(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001L001ChooseDomainName();
	}

	public Future<Void> promiseDeepC001L001ChooseDomainName() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001L001ChooseDomainName(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepC001Lesson(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001L001ChooseDomainName(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				introInit();
				moiInit();
				aLAvanceInit();
				acheterInit();
				appelerInit();
				apres1Init();
				apres2Init();
				apres3Init();
				apres4Init();
				apres5Init();
				plusTardInit();
				recapituler1Init();
				recapituler2Init();
				recapituler3Init();
				lessonSearch_frFRInit();
				lessonSearch_enUSInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepC001L001ChooseDomainName(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001L001ChooseDomainName(SiteRequestEnUS siteRequest_) {
			super.siteRequestC001Lesson(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001L001ChooseDomainName(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001L001ChooseDomainName(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainC001L001ChooseDomainName(String var) {
		C001L001ChooseDomainName oC001L001ChooseDomainName = (C001L001ChooseDomainName)this;
		switch(var) {
			case "intro":
				return oC001L001ChooseDomainName.intro;
			case "moi":
				return oC001L001ChooseDomainName.moi;
			case "aLAvance":
				return oC001L001ChooseDomainName.aLAvance;
			case "acheter":
				return oC001L001ChooseDomainName.acheter;
			case "appeler":
				return oC001L001ChooseDomainName.appeler;
			case "apres1":
				return oC001L001ChooseDomainName.apres1;
			case "apres2":
				return oC001L001ChooseDomainName.apres2;
			case "apres3":
				return oC001L001ChooseDomainName.apres3;
			case "apres4":
				return oC001L001ChooseDomainName.apres4;
			case "apres5":
				return oC001L001ChooseDomainName.apres5;
			case "plusTard":
				return oC001L001ChooseDomainName.plusTard;
			case "recapituler1":
				return oC001L001ChooseDomainName.recapituler1;
			case "recapituler2":
				return oC001L001ChooseDomainName.recapituler2;
			case "recapituler3":
				return oC001L001ChooseDomainName.recapituler3;
			case "lessonSearch_frFR":
				return oC001L001ChooseDomainName.lessonSearch_frFR;
			case "lessonSearch_enUS":
				return oC001L001ChooseDomainName.lessonSearch_enUS;
			default:
				return super.obtainC001Lesson(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateC001L001ChooseDomainName(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001L001ChooseDomainName(String var, Object val) {
		C001L001ChooseDomainName oC001L001ChooseDomainName = (C001L001ChooseDomainName)this;
		switch(var) {
			default:
				return super.relateC001Lesson(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001L001ChooseDomainName(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001L001ChooseDomainName(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "lessonSearch_frFR":
			return C001L001ChooseDomainName.staticSetLessonSearch_frFR(siteRequest_, o);
		case "lessonSearch_enUS":
			return C001L001ChooseDomainName.staticSetLessonSearch_enUS(siteRequest_, o);
			default:
				return C001Lesson.staticSetC001Lesson(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001L001ChooseDomainName(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001L001ChooseDomainName(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "lessonSearch_frFR":
			return C001L001ChooseDomainName.staticSearchLessonSearch_frFR(siteRequest_, (String)o);
		case "lessonSearch_enUS":
			return C001L001ChooseDomainName.staticSearchLessonSearch_enUS(siteRequest_, (String)o);
			default:
				return C001Lesson.staticSearchC001Lesson(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001L001ChooseDomainName(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001L001ChooseDomainName(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "lessonSearch_frFR":
			return C001L001ChooseDomainName.staticSearchStrLessonSearch_frFR(siteRequest_, (String)o);
		case "lessonSearch_enUS":
			return C001L001ChooseDomainName.staticSearchStrLessonSearch_enUS(siteRequest_, (String)o);
			default:
				return C001Lesson.staticSearchStrC001Lesson(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001L001ChooseDomainName(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001L001ChooseDomainName(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "lessonSearch_frFR":
			return C001L001ChooseDomainName.staticSearchFqLessonSearch_frFR(siteRequest_, o);
		case "lessonSearch_enUS":
			return C001L001ChooseDomainName.staticSearchFqLessonSearch_enUS(siteRequest_, o);
			default:
				return C001Lesson.staticSearchFqC001Lesson(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateC001L001ChooseDomainName(doc);
	}
	public void populateC001L001ChooseDomainName(SolrResponse.Doc doc) {
		C001L001ChooseDomainName oC001L001ChooseDomainName = (C001L001ChooseDomainName)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateC001Lesson(doc);
	}

	public void indexC001L001ChooseDomainName(JsonObject doc) {
		super.indexC001Lesson(doc);

	}

	public static String varStoredC001L001ChooseDomainName(String entityVar) {
		switch(entityVar) {
			default:
				return C001Lesson.varStoredC001Lesson(entityVar);
		}
	}

	public static String varIndexedC001L001ChooseDomainName(String entityVar) {
		switch(entityVar) {
			default:
				return C001Lesson.varIndexedC001Lesson(entityVar);
		}
	}

	public static String varSearchC001L001ChooseDomainName(String entityVar) {
		switch(entityVar) {
			default:
				return C001Lesson.varSearchC001Lesson(entityVar);
		}
	}

	public static String varSuggestedC001L001ChooseDomainName(String entityVar) {
		switch(entityVar) {
			default:
				return C001Lesson.varSuggestedC001Lesson(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeC001L001ChooseDomainName(doc);
	}
	public void storeC001L001ChooseDomainName(SolrResponse.Doc doc) {
		C001L001ChooseDomainName oC001L001ChooseDomainName = (C001L001ChooseDomainName)this;


		super.storeC001Lesson(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestC001L001ChooseDomainName() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof C001L001ChooseDomainName) {
			C001L001ChooseDomainName original = (C001L001ChooseDomainName)o;
			super.apiRequestC001Lesson();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String[] C001L001ChooseDomainNameVals = new String[] { introP1_frFR, introP2_frFR, introP1_enUS, introP2_enUS, moiP1_frFR, moiP2_frFR, moiP3_frFR, moiP1_enUS, moiP2_enUS, moiP3_enUS, aLAvanceH3Span1_frFR, aLAvanceH4Span1_frFR, aLAvanceP1_frFR, aLAvanceP2_frFR, aLAvanceP3_frFR, aLAvanceP4_frFR, aLAvanceP5_frFR, aLAvanceH3I1_enUS, aLAvanceH3Span1_enUS, aLAvanceH4I1_enUS, aLAvanceH4Span1_enUS, aLAvanceP1_enUS, aLAvanceP2_enUS, aLAvanceP3_enUS, aLAvanceP4_enUS, aLAvanceP5_enUS, acheterH3Span1_frFR, acheterH4Span1_frFR, acheterPSpan11_frFR, acheterPSpan12_frFR, acheterPSpan1A1_frFR, acheterPSpan21_frFR, acheterPSpan22_frFR, acheterPSpan2A1_frFR, acheterPSpan31_frFR, acheterH3I1_enUS, acheterH3Span1_enUS, acheterH4I1_enUS, acheterH4Span1_enUS, acheterPSpan11_enUS, acheterPSpan12_enUS, acheterPSpan1A11_enUS, acheterPSpan21_enUS, acheterPSpan22_enUS, acheterPSpan2A21_enUS, acheterPSpan31_enUS, appelerH3Span1_frFR, appelerH4Span1_frFR, appelerP1_frFR, appelerP2_frFR, appelerP3_frFR, appelerP4_frFR, appelerH3I1_enUS, appelerH3Span1_enUS, appelerH4I1_enUS, appelerH4Span1_enUS, appelerP1_enUS, appelerP2_enUS, appelerP3_enUS, appelerP4_enUS, apres1H3Span1_frFR, apres1H4Span1_frFR, apres1PSpan11_frFR, apres1PSpan12_frFR, apres1PSpan1A1_frFR, apres1PSpan21_frFR, apres1H3I1_enUS, apres1H3Span1_enUS, apres1H4I1_enUS, apres1H4Span1_enUS, apres1PSpan11_enUS, apres1PSpan12_enUS, apres1PSpan1A1_enUS, apres1PSpan21_enUS, apres2UlLi11_frFR, apres2UlLi21_frFR, apres2UlLi31_frFR, apres2UlLi32_frFR, apres2UlLi33_frFR, apres2UlLi41_frFR, apres2UlLi11_enUS, apres2UlLi21_enUS, apres2UlLi31_enUS, apres2UlLi32_enUS, apres2UlLi33_enUS, apres2UlLi41_enUS, apres3UlLi11_frFR, apres3UlLi12_frFR, apres3UlLi11_enUS, apres3UlLi12_enUS, apres4UlLi11_frFR, apres4UlLi12_frFR, apres4UlLi13_frFR, apres4UlLi11_enUS, apres4UlLi12_enUS, apres4UlLi13_enUS, apres5UlLi11_frFR, apres5UlLi12_frFR, apres5UlLi13_frFR, apres5UlLi14_frFR, apres5UlLi11_enUS, apres5UlLi12_enUS, apres5UlLi13_enUS, apres5UlLi14_enUS, plusTardH3Span1_frFR, plusTardH4Span1_frFR, plusTardP1_frFR, plusTardP2_frFR, plusTardP3_frFR, plusTardP4_frFR, plusTardP5_frFR, plusTardP6_frFR, plusTardH3I1_enUS, plusTardH3Span1_enUS, plusTardH4I1_enUS, plusTardH4Span1_enUS, plusTardP1_enUS, plusTardP2_enUS, plusTardP3_enUS, plusTardP4_enUS, plusTardP5_enUS, plusTardP6_enUS, recapituler1H31_frFR, recapituler1H31_enUS, recapituler2TableTr1Td11_frFR, recapituler2TableTr2Td11_frFR, recapituler2TableTr2Td21_frFR, recapituler2TableTr2Td31_frFR, recapituler2TableTr2Td41_frFR, recapituler2TableTr1Td11_enUS, recapituler2TableTr1Td2I1_enUS, recapituler2TableTr1Td3I1_enUS, recapituler2TableTr1Td4I1_enUS, recapituler2TableTr2Td11_enUS, recapituler2TableTr2Td21_enUS, recapituler2TableTr2Td31_enUS, recapituler2TableTr2Td41_enUS, recapituler3TableTr1Td21_frFR, recapituler3TableTr1Td41_frFR, recapituler3TableTr2Td21_frFR, recapituler3TableTr2Td41_frFR, recapituler3TableTr3Td21_frFR, recapituler3TableTr3Td41_frFR, recapituler3TableTr4Td21_frFR, recapituler3TableTr4Td41_frFR, recapituler3TableTr5Td21_frFR, recapituler3TableTr5Td41_frFR, recapituler3TableTr6Td21_frFR, recapituler3TableTr6Td41_frFR, recapituler3TableTr1Td1I1_enUS, recapituler3TableTr1Td21_enUS, recapituler3TableTr1Td3I1_enUS, recapituler3TableTr1Td41_enUS, recapituler3TableTr2Td1I1_enUS, recapituler3TableTr2Td21_enUS, recapituler3TableTr2Td3I1_enUS, recapituler3TableTr2Td41_enUS, recapituler3TableTr3Td1I1_enUS, recapituler3TableTr3Td21_enUS, recapituler3TableTr3Td3I1_enUS, recapituler3TableTr3Td41_enUS, recapituler3TableTr4Td1I1_enUS, recapituler3TableTr4Td21_enUS, recapituler3TableTr4Td3I1_enUS, recapituler3TableTr4Td41_enUS, recapituler3TableTr5Td1I1_enUS, recapituler3TableTr5Td21_enUS, recapituler3TableTr5Td3I1_enUS, recapituler3TableTr5Td41_enUS, recapituler3TableTr6Td1I1_enUS, recapituler3TableTr6Td21_enUS, recapituler3TableTr6Td3I1_enUS, recapituler3TableTr6Td41_enUS };

	public static final String CLASS_SIMPLE_NAME = "C001L001ChooseDomainName";
	public static final String VAR_intro = "intro";
	public static final String VAR_moi = "moi";
	public static final String VAR_aLAvance = "aLAvance";
	public static final String VAR_acheter = "acheter";
	public static final String VAR_appeler = "appeler";
	public static final String VAR_apres1 = "apres1";
	public static final String VAR_apres2 = "apres2";
	public static final String VAR_apres3 = "apres3";
	public static final String VAR_apres4 = "apres4";
	public static final String VAR_apres5 = "apres5";
	public static final String VAR_plusTard = "plusTard";
	public static final String VAR_recapituler1 = "recapituler1";
	public static final String VAR_recapituler2 = "recapituler2";
	public static final String VAR_recapituler3 = "recapituler3";
	public static final String VAR_lessonSearch_frFR = "lessonSearch_frFR";
	public static final String VAR_lessonSearch_enUS = "lessonSearch_enUS";

	public static List<String> varsQForClass() {
		return C001L001ChooseDomainName.varsQC001L001ChooseDomainName(new ArrayList<String>());
	}
	public static List<String> varsQC001L001ChooseDomainName(List<String> vars) {
		C001Lesson.varsQC001Lesson(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return C001L001ChooseDomainName.varsFqC001L001ChooseDomainName(new ArrayList<String>());
	}
	public static List<String> varsFqC001L001ChooseDomainName(List<String> vars) {
		C001Lesson.varsFqC001Lesson(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return C001L001ChooseDomainName.varsRangeC001L001ChooseDomainName(new ArrayList<String>());
	}
	public static List<String> varsRangeC001L001ChooseDomainName(List<String> vars) {
		C001Lesson.varsRangeC001Lesson(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_intro = "";
	public static final String DISPLAY_NAME_moi = "";
	public static final String DISPLAY_NAME_aLAvance = "";
	public static final String DISPLAY_NAME_acheter = "";
	public static final String DISPLAY_NAME_appeler = "";
	public static final String DISPLAY_NAME_apres1 = "";
	public static final String DISPLAY_NAME_apres2 = "";
	public static final String DISPLAY_NAME_apres3 = "";
	public static final String DISPLAY_NAME_apres4 = "";
	public static final String DISPLAY_NAME_apres5 = "";
	public static final String DISPLAY_NAME_plusTard = "";
	public static final String DISPLAY_NAME_recapituler1 = "";
	public static final String DISPLAY_NAME_recapituler2 = "";
	public static final String DISPLAY_NAME_recapituler3 = "";
	public static final String DISPLAY_NAME_lessonSearch_frFR = "";
	public static final String DISPLAY_NAME_lessonSearch_enUS = "";

	public static String displayNameForClass(String var) {
		return C001L001ChooseDomainName.displayNameC001L001ChooseDomainName(var);
	}
	public static String displayNameC001L001ChooseDomainName(String var) {
		switch(var) {
		case VAR_intro:
			return DISPLAY_NAME_intro;
		case VAR_moi:
			return DISPLAY_NAME_moi;
		case VAR_aLAvance:
			return DISPLAY_NAME_aLAvance;
		case VAR_acheter:
			return DISPLAY_NAME_acheter;
		case VAR_appeler:
			return DISPLAY_NAME_appeler;
		case VAR_apres1:
			return DISPLAY_NAME_apres1;
		case VAR_apres2:
			return DISPLAY_NAME_apres2;
		case VAR_apres3:
			return DISPLAY_NAME_apres3;
		case VAR_apres4:
			return DISPLAY_NAME_apres4;
		case VAR_apres5:
			return DISPLAY_NAME_apres5;
		case VAR_plusTard:
			return DISPLAY_NAME_plusTard;
		case VAR_recapituler1:
			return DISPLAY_NAME_recapituler1;
		case VAR_recapituler2:
			return DISPLAY_NAME_recapituler2;
		case VAR_recapituler3:
			return DISPLAY_NAME_recapituler3;
		case VAR_lessonSearch_frFR:
			return DISPLAY_NAME_lessonSearch_frFR;
		case VAR_lessonSearch_enUS:
			return DISPLAY_NAME_lessonSearch_enUS;
		default:
			return C001Lesson.displayNameC001Lesson(var);
		}
	}

	public static String descriptionC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.descriptionC001Lesson(var);
		}
	}

	public static String classSimpleNameC001L001ChooseDomainName(String var) {
		switch(var) {
		case VAR_intro:
			return "PageHtml";
		case VAR_moi:
			return "PageHtml";
		case VAR_aLAvance:
			return "PageHtml";
		case VAR_acheter:
			return "PageHtml";
		case VAR_appeler:
			return "PageHtml";
		case VAR_apres1:
			return "PageHtml";
		case VAR_apres2:
			return "PageHtml";
		case VAR_apres3:
			return "PageHtml";
		case VAR_apres4:
			return "PageHtml";
		case VAR_apres5:
			return "PageHtml";
		case VAR_plusTard:
			return "QuestionReponse";
		case VAR_recapituler1:
			return "PageHtml";
		case VAR_recapituler2:
			return "PageHtml";
		case VAR_recapituler3:
			return "PageHtml";
		case VAR_lessonSearch_frFR:
			return "List";
		case VAR_lessonSearch_enUS:
			return "List";
			default:
				return C001Lesson.classSimpleNameC001Lesson(var);
		}
	}

	public static Integer htmlColumnC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.htmlColumnC001Lesson(var);
		}
	}

	public static Integer htmlRowC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.htmlRowC001Lesson(var);
		}
	}

	public static Integer htmlCellC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.htmlCellC001Lesson(var);
		}
	}

	public static Integer lengthMinC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.lengthMinC001Lesson(var);
		}
	}

	public static Integer lengthMaxC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.lengthMaxC001Lesson(var);
		}
	}

	public static Integer maxC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.maxC001Lesson(var);
		}
	}

	public static Integer minC001L001ChooseDomainName(String var) {
		switch(var) {
			default:
				return C001Lesson.minC001Lesson(var);
		}
	}
}
