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
import io.vertx.core.json.JsonObject;
import java.lang.String;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
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

	public static final String C001L001ChooseDomainName_Uri_frFR = "/frFR/cours/001/001-choisir-nom-domaine";
	public static final String C001L001ChooseDomainName_Description_frFR = "Quel est l'étape première pour créer mon propre site Web ? Choisir un nom de domaine. ";
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

	public static final String C001L001ChooseDomainName_Uri_enUS = "/enUS/course/001/001-choose-domain-name";
	public static final String C001L001ChooseDomainName_Description_enUS = "What is the first step to creating my own website? Choose a domain name. ";
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

	/**		<p class="introP  ">
			{{ C001L001ChooseDomainName['introP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['introP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['introP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['introP2_{{ lang }}'] }}
		</p>
	 The entity intro
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject intro = new JsonObject();

	/**	<br> The entity intro
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:intro">Find the entity intro in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _intro(JsonObject o);

	public JsonObject getIntro() {
		return intro;
	}

	public void setIntro(JsonObject intro) {
		this.intro = intro;
	}
	@JsonIgnore
	public void setIntro(String o) {
		this.intro = C001L001ChooseDomainName.staticSetIntro(siteRequest_, o);
	}
	public static JsonObject staticSetIntro(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName introInit() {
		_intro(intro);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchIntro(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrIntro(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIntro(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrIntro(siteRequest_, C001L001ChooseDomainName.staticSearchIntro(siteRequest_, C001L001ChooseDomainName.staticSetIntro(siteRequest_, o)));
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

	/**		<p class="moiP  ">
			{{ C001L001ChooseDomainName['moiP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['moiP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['moiP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['moiP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['moiP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['moiP3_{{ lang }}'] }}
		</p>
	 The entity moi
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject moi = new JsonObject();

	/**	<br> The entity moi
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:moi">Find the entity moi in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _moi(JsonObject o);

	public JsonObject getMoi() {
		return moi;
	}

	public void setMoi(JsonObject moi) {
		this.moi = moi;
	}
	@JsonIgnore
	public void setMoi(String o) {
		this.moi = C001L001ChooseDomainName.staticSetMoi(siteRequest_, o);
	}
	public static JsonObject staticSetMoi(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName moiInit() {
		_moi(moi);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchMoi(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrMoi(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqMoi(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrMoi(siteRequest_, C001L001ChooseDomainName.staticSearchMoi(siteRequest_, C001L001ChooseDomainName.staticSetMoi(siteRequest_, o)));
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

	/**		<h3 class="aLAvanceH3  ">
			<span class="aLAvanceH3Span  ">
				{{ C001L001ChooseDomainName['aLAvanceH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="aLAvanceH4  ">
			<span class="aLAvanceH4Span  ">
				{{ C001L001ChooseDomainName['aLAvanceH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="aLAvanceP  ">
			{{ C001L001ChooseDomainName['aLAvanceP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP4_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP5_{{ lang }}'] }}
		</p>
		<h3 class="aLAvanceH3  ">
			<i class="aLAvanceH3I1 site-menu-icon aLAvanceH3I  ">
			</i>
			<span class="aLAvanceH3Span  ">
				{{ C001L001ChooseDomainName['aLAvanceH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="aLAvanceH4  ">
			<i class="aLAvanceH4I1 site-menu-icon aLAvanceH4I  ">
			</i>
			<span class="aLAvanceH4Span  ">
				{{ C001L001ChooseDomainName['aLAvanceH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="aLAvanceP  ">
			{{ C001L001ChooseDomainName['aLAvanceP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP4_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['aLAvanceP5_{{ lang }}'] }}
		</p>
	 The entity aLAvance
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject aLAvance = new JsonObject();

	/**	<br> The entity aLAvance
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:aLAvance">Find the entity aLAvance in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _aLAvance(JsonObject o);

	public JsonObject getALAvance() {
		return aLAvance;
	}

	public void setALAvance(JsonObject aLAvance) {
		this.aLAvance = aLAvance;
	}
	@JsonIgnore
	public void setALAvance(String o) {
		this.aLAvance = C001L001ChooseDomainName.staticSetALAvance(siteRequest_, o);
	}
	public static JsonObject staticSetALAvance(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName aLAvanceInit() {
		_aLAvance(aLAvance);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchALAvance(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrALAvance(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqALAvance(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrALAvance(siteRequest_, C001L001ChooseDomainName.staticSearchALAvance(siteRequest_, C001L001ChooseDomainName.staticSetALAvance(siteRequest_, o)));
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

	/**		<h3 class="acheterH3  ">
			<span class="acheterH3Span  ">
				{{ C001L001ChooseDomainName['acheterH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="acheterH4  ">
			<span class="acheterH4Span  ">
				{{ C001L001ChooseDomainName['acheterH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="acheterP  ">
			<span class="acheterPSpan1 acheterPSpan odd  ">
				{{ C001L001ChooseDomainName['acheterPSpan11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['acheterPSpan12_{{ lang }}'] }}
				<a class="acheterPSpan1A  " href="acheterPSpan1A1">
					{{ C001L001ChooseDomainName['acheterPSpan1A1_{{ lang }}'] }}
				</a>
			</span>
			<span class="acheterPSpan2 acheterPSpan even  ">
				{{ C001L001ChooseDomainName['acheterPSpan21_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['acheterPSpan22_{{ lang }}'] }}
				<a class="acheterPSpan2A  " href="acheterPSpan2A1">
					{{ C001L001ChooseDomainName['acheterPSpan2A1_{{ lang }}'] }}
				</a>
			</span>
			<span class="acheterPSpan3 acheterPSpan odd  ">
				{{ C001L001ChooseDomainName['acheterPSpan31_{{ lang }}'] }}
			</span>
		</p>
		<h3 class="acheterH3  ">
			<i class="acheterH3I1 site-menu-icon acheterH3I  ">
			</i>
			<span class="acheterH3Span  ">
				{{ C001L001ChooseDomainName['acheterH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="acheterH4  ">
			<i class="acheterH4I1 site-menu-icon acheterH4I  ">
			</i>
			<span class="acheterH4Span  ">
				{{ C001L001ChooseDomainName['acheterH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="acheterP  ">
			<span class="acheterPSpan1 acheterPSpan odd  ">
				{{ C001L001ChooseDomainName['acheterPSpan11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['acheterPSpan12_{{ lang }}'] }}
				<a class="acheterPSpan1A1 acheterPSpan1A odd  " href="acheterPSpan1A11">
					{{ C001L001ChooseDomainName['acheterPSpan1A11_{{ lang }}'] }}
				</a>
			</span>
			<span class="acheterPSpan2 acheterPSpan even  ">
				{{ C001L001ChooseDomainName['acheterPSpan21_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['acheterPSpan22_{{ lang }}'] }}
				<a class="acheterPSpan2A2 acheterPSpan2A even  " href="acheterPSpan2A21">
					{{ C001L001ChooseDomainName['acheterPSpan2A21_{{ lang }}'] }}
				</a>
			</span>
			<span class="acheterPSpan3 acheterPSpan odd  ">
				{{ C001L001ChooseDomainName['acheterPSpan31_{{ lang }}'] }}
			</span>
		</p>
	 The entity acheter
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject acheter = new JsonObject();

	/**	<br> The entity acheter
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:acheter">Find the entity acheter in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _acheter(JsonObject o);

	public JsonObject getAcheter() {
		return acheter;
	}

	public void setAcheter(JsonObject acheter) {
		this.acheter = acheter;
	}
	@JsonIgnore
	public void setAcheter(String o) {
		this.acheter = C001L001ChooseDomainName.staticSetAcheter(siteRequest_, o);
	}
	public static JsonObject staticSetAcheter(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName acheterInit() {
		_acheter(acheter);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchAcheter(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrAcheter(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAcheter(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrAcheter(siteRequest_, C001L001ChooseDomainName.staticSearchAcheter(siteRequest_, C001L001ChooseDomainName.staticSetAcheter(siteRequest_, o)));
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

	/**		<h3 class="appelerH3  ">
			<span class="appelerH3Span  ">
				{{ C001L001ChooseDomainName['appelerH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="appelerH4  ">
			<span class="appelerH4Span  ">
				{{ C001L001ChooseDomainName['appelerH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="appelerP  ">
			{{ C001L001ChooseDomainName['appelerP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP4_{{ lang }}'] }}
		</p>
		<h3 class="appelerH3  ">
			<i class="appelerH3I1 site-menu-icon appelerH3I  ">
			</i>
			<span class="appelerH3Span  ">
				{{ C001L001ChooseDomainName['appelerH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="appelerH4  ">
			<i class="appelerH4I1 site-menu-icon appelerH4I  ">
			</i>
			<span class="appelerH4Span  ">
				{{ C001L001ChooseDomainName['appelerH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="appelerP  ">
			{{ C001L001ChooseDomainName['appelerP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['appelerP4_{{ lang }}'] }}
		</p>
	 The entity appeler
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject appeler = new JsonObject();

	/**	<br> The entity appeler
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:appeler">Find the entity appeler in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _appeler(JsonObject o);

	public JsonObject getAppeler() {
		return appeler;
	}

	public void setAppeler(JsonObject appeler) {
		this.appeler = appeler;
	}
	@JsonIgnore
	public void setAppeler(String o) {
		this.appeler = C001L001ChooseDomainName.staticSetAppeler(siteRequest_, o);
	}
	public static JsonObject staticSetAppeler(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName appelerInit() {
		_appeler(appeler);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchAppeler(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrAppeler(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAppeler(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrAppeler(siteRequest_, C001L001ChooseDomainName.staticSearchAppeler(siteRequest_, C001L001ChooseDomainName.staticSetAppeler(siteRequest_, o)));
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

	/**		<h3 class="apres1H3  ">
			<span class="apres1H3Span  ">
				{{ C001L001ChooseDomainName['apres1H3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="apres1H4  ">
			<span class="apres1H4Span  ">
				{{ C001L001ChooseDomainName['apres1H4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="apres1P  ">
			<span class="apres1PSpan1 apres1PSpan odd  ">
				{{ C001L001ChooseDomainName['apres1PSpan11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres1PSpan12_{{ lang }}'] }}
				<a class="apres1PSpan1A  " href="apres1PSpan1A1">
					{{ C001L001ChooseDomainName['apres1PSpan1A1_{{ lang }}'] }}
				</a>
			</span>
			<span class="apres1PSpan2 apres1PSpan even  ">
				{{ C001L001ChooseDomainName['apres1PSpan21_{{ lang }}'] }}
			</span>
		</p>
		<h3 class="apres1H3  ">
			<i class="apres1H3I1 site-menu-icon apres1H3I  ">
			</i>
			<span class="apres1H3Span  ">
				{{ C001L001ChooseDomainName['apres1H3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="apres1H4  ">
			<i class="apres1H4I1 site-menu-icon apres1H4I  ">
			</i>
			<span class="apres1H4Span  ">
				{{ C001L001ChooseDomainName['apres1H4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="apres1P  ">
			<span class="apres1PSpan1 apres1PSpan odd  ">
				{{ C001L001ChooseDomainName['apres1PSpan11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres1PSpan12_{{ lang }}'] }}
				<a class="apres1PSpan1A  " href="apres1PSpan1A1">
					{{ C001L001ChooseDomainName['apres1PSpan1A1_{{ lang }}'] }}
				</a>
			</span>
			<span class="apres1PSpan2 apres1PSpan even  ">
				{{ C001L001ChooseDomainName['apres1PSpan21_{{ lang }}'] }}
			</span>
		</p>
	 The entity apres1
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject apres1 = new JsonObject();

	/**	<br> The entity apres1
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres1">Find the entity apres1 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres1(JsonObject o);

	public JsonObject getApres1() {
		return apres1;
	}

	public void setApres1(JsonObject apres1) {
		this.apres1 = apres1;
	}
	@JsonIgnore
	public void setApres1(String o) {
		this.apres1 = C001L001ChooseDomainName.staticSetApres1(siteRequest_, o);
	}
	public static JsonObject staticSetApres1(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName apres1Init() {
		_apres1(apres1);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchApres1(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrApres1(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApres1(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrApres1(siteRequest_, C001L001ChooseDomainName.staticSearchApres1(siteRequest_, C001L001ChooseDomainName.staticSetApres1(siteRequest_, o)));
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

	/**		<ul class="apres2Ul  ">
			<li class="apres2UlLi1 apres2UlLi odd  ">
				{{ C001L001ChooseDomainName['apres2UlLi11_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi2 apres2UlLi even  ">
				{{ C001L001ChooseDomainName['apres2UlLi21_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi3 apres2UlLi odd  ">
				{{ C001L001ChooseDomainName['apres2UlLi31_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres2UlLi32_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres2UlLi33_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi4 apres2UlLi even  ">
				{{ C001L001ChooseDomainName['apres2UlLi41_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi1 apres2UlLi odd  ">
				{{ C001L001ChooseDomainName['apres2UlLi11_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi2 apres2UlLi even  ">
				{{ C001L001ChooseDomainName['apres2UlLi21_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi3 apres2UlLi odd  ">
				{{ C001L001ChooseDomainName['apres2UlLi31_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres2UlLi32_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres2UlLi33_{{ lang }}'] }}
			</li>
			<li class="apres2UlLi4 apres2UlLi even  ">
				{{ C001L001ChooseDomainName['apres2UlLi41_{{ lang }}'] }}
			</li>
		</ul>
	 The entity apres2
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject apres2 = new JsonObject();

	/**	<br> The entity apres2
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres2">Find the entity apres2 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres2(JsonObject o);

	public JsonObject getApres2() {
		return apres2;
	}

	public void setApres2(JsonObject apres2) {
		this.apres2 = apres2;
	}
	@JsonIgnore
	public void setApres2(String o) {
		this.apres2 = C001L001ChooseDomainName.staticSetApres2(siteRequest_, o);
	}
	public static JsonObject staticSetApres2(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName apres2Init() {
		_apres2(apres2);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchApres2(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrApres2(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApres2(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrApres2(siteRequest_, C001L001ChooseDomainName.staticSearchApres2(siteRequest_, C001L001ChooseDomainName.staticSetApres2(siteRequest_, o)));
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

	/**		<ul class="apres3Ul  ">
			<li class="apres3UlLi1 apres3UlLi odd  ">
				{{ C001L001ChooseDomainName['apres3UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres3UlLi12_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres3UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres3UlLi12_{{ lang }}'] }}
			</li>
		</ul>
	 The entity apres3
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject apres3 = new JsonObject();

	/**	<br> The entity apres3
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres3">Find the entity apres3 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres3(JsonObject o);

	public JsonObject getApres3() {
		return apres3;
	}

	public void setApres3(JsonObject apres3) {
		this.apres3 = apres3;
	}
	@JsonIgnore
	public void setApres3(String o) {
		this.apres3 = C001L001ChooseDomainName.staticSetApres3(siteRequest_, o);
	}
	public static JsonObject staticSetApres3(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName apres3Init() {
		_apres3(apres3);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchApres3(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrApres3(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApres3(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrApres3(siteRequest_, C001L001ChooseDomainName.staticSearchApres3(siteRequest_, C001L001ChooseDomainName.staticSetApres3(siteRequest_, o)));
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

	/**		<ul class="apres4Ul  ">
			<li class="apres4UlLi1 apres4UlLi odd  ">
				{{ C001L001ChooseDomainName['apres4UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres4UlLi12_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres4UlLi13_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres4UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres4UlLi12_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres4UlLi13_{{ lang }}'] }}
			</li>
		</ul>
	 The entity apres4
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject apres4 = new JsonObject();

	/**	<br> The entity apres4
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres4">Find the entity apres4 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres4(JsonObject o);

	public JsonObject getApres4() {
		return apres4;
	}

	public void setApres4(JsonObject apres4) {
		this.apres4 = apres4;
	}
	@JsonIgnore
	public void setApres4(String o) {
		this.apres4 = C001L001ChooseDomainName.staticSetApres4(siteRequest_, o);
	}
	public static JsonObject staticSetApres4(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName apres4Init() {
		_apres4(apres4);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchApres4(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrApres4(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApres4(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrApres4(siteRequest_, C001L001ChooseDomainName.staticSearchApres4(siteRequest_, C001L001ChooseDomainName.staticSetApres4(siteRequest_, o)));
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

	/**		<ul class="apres5Ul  ">
			<li class="apres5UlLi1 apres5UlLi odd  ">
				{{ C001L001ChooseDomainName['apres5UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi12_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi13_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi14_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi11_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi12_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi13_{{ lang }}'] }}
				{{ C001L001ChooseDomainName['apres5UlLi14_{{ lang }}'] }}
			</li>
		</ul>
	 The entity apres5
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject apres5 = new JsonObject();

	/**	<br> The entity apres5
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:apres5">Find the entity apres5 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _apres5(JsonObject o);

	public JsonObject getApres5() {
		return apres5;
	}

	public void setApres5(JsonObject apres5) {
		this.apres5 = apres5;
	}
	@JsonIgnore
	public void setApres5(String o) {
		this.apres5 = C001L001ChooseDomainName.staticSetApres5(siteRequest_, o);
	}
	public static JsonObject staticSetApres5(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName apres5Init() {
		_apres5(apres5);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchApres5(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrApres5(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqApres5(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrApres5(siteRequest_, C001L001ChooseDomainName.staticSearchApres5(siteRequest_, C001L001ChooseDomainName.staticSetApres5(siteRequest_, o)));
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

	/**		<h3 class="plusTardH3  ">
			<span class="plusTardH3Span  ">
				{{ C001L001ChooseDomainName['plusTardH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="plusTardH4  ">
			<span class="plusTardH4Span  ">
				{{ C001L001ChooseDomainName['plusTardH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="plusTardP  ">
			{{ C001L001ChooseDomainName['plusTardP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP4_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP5_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP6_{{ lang }}'] }}
		</p>
		<h3 class="plusTardH3  ">
			<i class="plusTardH3I1 site-menu-icon plusTardH3I  ">
			</i>
			<span class="plusTardH3Span  ">
				{{ C001L001ChooseDomainName['plusTardH3Span1_{{ lang }}'] }}
			</span>
		</h3>
		<h4 class="plusTardH4  ">
			<i class="plusTardH4I1 site-menu-icon plusTardH4I  ">
			</i>
			<span class="plusTardH4Span  ">
				{{ C001L001ChooseDomainName['plusTardH4Span1_{{ lang }}'] }}
			</span>
		</h4>
		<p class="plusTardP  ">
			{{ C001L001ChooseDomainName['plusTardP1_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP2_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP3_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP4_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP5_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['plusTardP6_{{ lang }}'] }}
		</p>
	 The entity plusTard
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject plusTard = new JsonObject();

	/**	<br> The entity plusTard
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:plusTard">Find the entity plusTard in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _plusTard(JsonObject o);

	public JsonObject getPlusTard() {
		return plusTard;
	}

	public void setPlusTard(JsonObject plusTard) {
		this.plusTard = plusTard;
	}
	@JsonIgnore
	public void setPlusTard(String o) {
		this.plusTard = C001L001ChooseDomainName.staticSetPlusTard(siteRequest_, o);
	}
	public static JsonObject staticSetPlusTard(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName plusTardInit() {
		_plusTard(plusTard);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchPlusTard(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrPlusTard(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPlusTard(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrPlusTard(siteRequest_, C001L001ChooseDomainName.staticSearchPlusTard(siteRequest_, C001L001ChooseDomainName.staticSetPlusTard(siteRequest_, o)));
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31_frFR = "À récapituler : ";
	public static final String recapituler1H3_frFR = recapituler1H31_frFR;
	public static final String recapituler1H31_enUS = "To review: ";
	public static final String recapituler1H3_enUS = recapituler1H31_enUS;

	/**		<h3 class="recapituler1H3  ">
			{{ C001L001ChooseDomainName['recapituler1H31_{{ lang }}'] }}
			{{ C001L001ChooseDomainName['recapituler1H31_{{ lang }}'] }}
		</h3>
	 The entity recapituler1
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject recapituler1 = new JsonObject();

	/**	<br> The entity recapituler1
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler1">Find the entity recapituler1 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler1(JsonObject o);

	public JsonObject getRecapituler1() {
		return recapituler1;
	}

	public void setRecapituler1(JsonObject recapituler1) {
		this.recapituler1 = recapituler1;
	}
	@JsonIgnore
	public void setRecapituler1(String o) {
		this.recapituler1 = C001L001ChooseDomainName.staticSetRecapituler1(siteRequest_, o);
	}
	public static JsonObject staticSetRecapituler1(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName recapituler1Init() {
		_recapituler1(recapituler1);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchRecapituler1(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrRecapituler1(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRecapituler1(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrRecapituler1(siteRequest_, C001L001ChooseDomainName.staticSearchRecapituler1(siteRequest_, C001L001ChooseDomainName.staticSetRecapituler1(siteRequest_, o)));
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

	/**		<table class="recapituler2Table  ">
			<tr class="recapituler2TableTr1 recapituler2TableTr odd  ">
				<td class="w3-mobile recapituler2TableTr1Td1 recapituler2TableTr1Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr1Td11_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler2TableTr2 recapituler2TableTr even  ">
				<td class="w3-mobile recapituler2TableTr2Td1 recapituler2TableTr2Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td11_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td2 recapituler2TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td3 recapituler2TableTr2Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td31_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td4 recapituler2TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler2TableTr1 recapituler2TableTr odd  ">
				<td class="w3-mobile recapituler2TableTr1Td1 recapituler2TableTr1Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr1Td11_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr1Td2 recapituler2TableTr1Td even  ">
					<i class="recapituler2TableTr1Td2I1 site-menu-icon recapituler2TableTr1Td2I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler2TableTr1Td3 recapituler2TableTr1Td odd  ">
					<i class="recapituler2TableTr1Td3I1 site-menu-icon recapituler2TableTr1Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler2TableTr1Td4 recapituler2TableTr1Td even  ">
					<i class="recapituler2TableTr1Td4I1 site-menu-icon recapituler2TableTr1Td4I  ">
					</i>
				</td>
			</tr>
			<tr class="recapituler2TableTr2 recapituler2TableTr even  ">
				<td class="w3-mobile recapituler2TableTr2Td1 recapituler2TableTr2Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td11_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td2 recapituler2TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td3 recapituler2TableTr2Td odd  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td31_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler2TableTr2Td4 recapituler2TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler2TableTr2Td41_{{ lang }}'] }}
				</td>
			</tr>
		</table>
	 The entity recapituler2
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject recapituler2 = new JsonObject();

	/**	<br> The entity recapituler2
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler2">Find the entity recapituler2 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler2(JsonObject o);

	public JsonObject getRecapituler2() {
		return recapituler2;
	}

	public void setRecapituler2(JsonObject recapituler2) {
		this.recapituler2 = recapituler2;
	}
	@JsonIgnore
	public void setRecapituler2(String o) {
		this.recapituler2 = C001L001ChooseDomainName.staticSetRecapituler2(siteRequest_, o);
	}
	public static JsonObject staticSetRecapituler2(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName recapituler2Init() {
		_recapituler2(recapituler2);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchRecapituler2(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrRecapituler2(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRecapituler2(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrRecapituler2(siteRequest_, C001L001ChooseDomainName.staticSearchRecapituler2(siteRequest_, C001L001ChooseDomainName.staticSetRecapituler2(siteRequest_, o)));
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

	/**		<table class="recapituler3Table  ">
			<tr class="recapituler3TableTr1 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr1Td2 recapituler3TableTr1Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr1Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr1Td4 recapituler3TableTr1Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr1Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr2 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr2Td2 recapituler3TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr2Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr2Td4 recapituler3TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr2Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr3 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr3Td2 recapituler3TableTr3Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr3Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr3Td4 recapituler3TableTr3Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr3Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr4 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr4Td2 recapituler3TableTr4Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr4Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr4Td4 recapituler3TableTr4Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr4Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr5 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr5Td2 recapituler3TableTr5Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr5Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr5Td4 recapituler3TableTr5Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr5Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr6 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr6Td2 recapituler3TableTr6Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr6Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr6Td4 recapituler3TableTr6Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr6Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr1 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr1Td1 recapituler3TableTr1Td odd  ">
					<i class="recapituler3TableTr1Td1I1 site-menu-icon recapituler3TableTr1Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr1Td2 recapituler3TableTr1Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr1Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr1Td3 recapituler3TableTr1Td odd  ">
					<i class="recapituler3TableTr1Td3I1 site-menu-icon recapituler3TableTr1Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr1Td4 recapituler3TableTr1Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr1Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr2 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr2Td1 recapituler3TableTr2Td odd  ">
					<i class="recapituler3TableTr2Td1I1 site-menu-icon recapituler3TableTr2Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr2Td2 recapituler3TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr2Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr2Td3 recapituler3TableTr2Td odd  ">
					<i class="recapituler3TableTr2Td3I1 site-menu-icon recapituler3TableTr2Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr2Td4 recapituler3TableTr2Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr2Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr3 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr3Td1 recapituler3TableTr3Td odd  ">
					<i class="recapituler3TableTr3Td1I1 site-menu-icon recapituler3TableTr3Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr3Td2 recapituler3TableTr3Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr3Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr3Td3 recapituler3TableTr3Td odd  ">
					<i class="recapituler3TableTr3Td3I1 site-menu-icon recapituler3TableTr3Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr3Td4 recapituler3TableTr3Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr3Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr4 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr4Td1 recapituler3TableTr4Td odd  ">
					<i class="recapituler3TableTr4Td1I1 site-menu-icon recapituler3TableTr4Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr4Td2 recapituler3TableTr4Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr4Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr4Td3 recapituler3TableTr4Td odd  ">
					<i class="recapituler3TableTr4Td3I1 site-menu-icon recapituler3TableTr4Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr4Td4 recapituler3TableTr4Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr4Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr5 recapituler3TableTr odd  ">
				<td class="w3-mobile recapituler3TableTr5Td1 recapituler3TableTr5Td odd  ">
					<i class="recapituler3TableTr5Td1I1 site-menu-icon recapituler3TableTr5Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr5Td2 recapituler3TableTr5Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr5Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr5Td3 recapituler3TableTr5Td odd  ">
					<i class="recapituler3TableTr5Td3I1 site-menu-icon recapituler3TableTr5Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr5Td4 recapituler3TableTr5Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr5Td41_{{ lang }}'] }}
				</td>
			</tr>
			<tr class="recapituler3TableTr6 recapituler3TableTr even  ">
				<td class="w3-mobile recapituler3TableTr6Td1 recapituler3TableTr6Td odd  ">
					<i class="recapituler3TableTr6Td1I1 site-menu-icon recapituler3TableTr6Td1I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr6Td2 recapituler3TableTr6Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr6Td21_{{ lang }}'] }}
				</td>
				<td class="w3-mobile recapituler3TableTr6Td3 recapituler3TableTr6Td odd  ">
					<i class="recapituler3TableTr6Td3I1 site-menu-icon recapituler3TableTr6Td3I  ">
					</i>
				</td>
				<td class="w3-mobile recapituler3TableTr6Td4 recapituler3TableTr6Td even  ">
					{{ C001L001ChooseDomainName['recapituler3TableTr6Td41_{{ lang }}'] }}
				</td>
			</tr>
		</table>
	 The entity recapituler3
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonObject recapituler3 = new JsonObject();

	/**	<br> The entity recapituler3
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName&fq=entiteVar_enUS_indexed_string:recapituler3">Find the entity recapituler3 in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _recapituler3(JsonObject o);

	public JsonObject getRecapituler3() {
		return recapituler3;
	}

	public void setRecapituler3(JsonObject recapituler3) {
		this.recapituler3 = recapituler3;
	}
	@JsonIgnore
	public void setRecapituler3(String o) {
		this.recapituler3 = C001L001ChooseDomainName.staticSetRecapituler3(siteRequest_, o);
	}
	public static JsonObject staticSetRecapituler3(SiteRequestEnUS siteRequest_, String o) {
		if(o != null) {
				return new JsonObject(o);
		}
		return null;
	}
	protected C001L001ChooseDomainName recapituler3Init() {
		_recapituler3(recapituler3);
		return (C001L001ChooseDomainName)this;
	}

	public static JsonObject staticSearchRecapituler3(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o;
	}

	public static String staticSearchStrRecapituler3(SiteRequestEnUS siteRequest_, JsonObject o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRecapituler3(SiteRequestEnUS siteRequest_, String o) {
		return C001L001ChooseDomainName.staticSearchStrRecapituler3(siteRequest_, C001L001ChooseDomainName.staticSearchRecapituler3(siteRequest_, C001L001ChooseDomainName.staticSetRecapituler3(siteRequest_, o)));
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
		case "intro":
			return C001L001ChooseDomainName.staticSetIntro(siteRequest_, o);
		case "moi":
			return C001L001ChooseDomainName.staticSetMoi(siteRequest_, o);
		case "aLAvance":
			return C001L001ChooseDomainName.staticSetALAvance(siteRequest_, o);
		case "acheter":
			return C001L001ChooseDomainName.staticSetAcheter(siteRequest_, o);
		case "appeler":
			return C001L001ChooseDomainName.staticSetAppeler(siteRequest_, o);
		case "apres1":
			return C001L001ChooseDomainName.staticSetApres1(siteRequest_, o);
		case "apres2":
			return C001L001ChooseDomainName.staticSetApres2(siteRequest_, o);
		case "apres3":
			return C001L001ChooseDomainName.staticSetApres3(siteRequest_, o);
		case "apres4":
			return C001L001ChooseDomainName.staticSetApres4(siteRequest_, o);
		case "apres5":
			return C001L001ChooseDomainName.staticSetApres5(siteRequest_, o);
		case "plusTard":
			return C001L001ChooseDomainName.staticSetPlusTard(siteRequest_, o);
		case "recapituler1":
			return C001L001ChooseDomainName.staticSetRecapituler1(siteRequest_, o);
		case "recapituler2":
			return C001L001ChooseDomainName.staticSetRecapituler2(siteRequest_, o);
		case "recapituler3":
			return C001L001ChooseDomainName.staticSetRecapituler3(siteRequest_, o);
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
		case "intro":
			return C001L001ChooseDomainName.staticSearchIntro(siteRequest_, (JsonObject)o);
		case "moi":
			return C001L001ChooseDomainName.staticSearchMoi(siteRequest_, (JsonObject)o);
		case "aLAvance":
			return C001L001ChooseDomainName.staticSearchALAvance(siteRequest_, (JsonObject)o);
		case "acheter":
			return C001L001ChooseDomainName.staticSearchAcheter(siteRequest_, (JsonObject)o);
		case "appeler":
			return C001L001ChooseDomainName.staticSearchAppeler(siteRequest_, (JsonObject)o);
		case "apres1":
			return C001L001ChooseDomainName.staticSearchApres1(siteRequest_, (JsonObject)o);
		case "apres2":
			return C001L001ChooseDomainName.staticSearchApres2(siteRequest_, (JsonObject)o);
		case "apres3":
			return C001L001ChooseDomainName.staticSearchApres3(siteRequest_, (JsonObject)o);
		case "apres4":
			return C001L001ChooseDomainName.staticSearchApres4(siteRequest_, (JsonObject)o);
		case "apres5":
			return C001L001ChooseDomainName.staticSearchApres5(siteRequest_, (JsonObject)o);
		case "plusTard":
			return C001L001ChooseDomainName.staticSearchPlusTard(siteRequest_, (JsonObject)o);
		case "recapituler1":
			return C001L001ChooseDomainName.staticSearchRecapituler1(siteRequest_, (JsonObject)o);
		case "recapituler2":
			return C001L001ChooseDomainName.staticSearchRecapituler2(siteRequest_, (JsonObject)o);
		case "recapituler3":
			return C001L001ChooseDomainName.staticSearchRecapituler3(siteRequest_, (JsonObject)o);
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
		case "intro":
			return C001L001ChooseDomainName.staticSearchStrIntro(siteRequest_, (JsonObject)o);
		case "moi":
			return C001L001ChooseDomainName.staticSearchStrMoi(siteRequest_, (JsonObject)o);
		case "aLAvance":
			return C001L001ChooseDomainName.staticSearchStrALAvance(siteRequest_, (JsonObject)o);
		case "acheter":
			return C001L001ChooseDomainName.staticSearchStrAcheter(siteRequest_, (JsonObject)o);
		case "appeler":
			return C001L001ChooseDomainName.staticSearchStrAppeler(siteRequest_, (JsonObject)o);
		case "apres1":
			return C001L001ChooseDomainName.staticSearchStrApres1(siteRequest_, (JsonObject)o);
		case "apres2":
			return C001L001ChooseDomainName.staticSearchStrApres2(siteRequest_, (JsonObject)o);
		case "apres3":
			return C001L001ChooseDomainName.staticSearchStrApres3(siteRequest_, (JsonObject)o);
		case "apres4":
			return C001L001ChooseDomainName.staticSearchStrApres4(siteRequest_, (JsonObject)o);
		case "apres5":
			return C001L001ChooseDomainName.staticSearchStrApres5(siteRequest_, (JsonObject)o);
		case "plusTard":
			return C001L001ChooseDomainName.staticSearchStrPlusTard(siteRequest_, (JsonObject)o);
		case "recapituler1":
			return C001L001ChooseDomainName.staticSearchStrRecapituler1(siteRequest_, (JsonObject)o);
		case "recapituler2":
			return C001L001ChooseDomainName.staticSearchStrRecapituler2(siteRequest_, (JsonObject)o);
		case "recapituler3":
			return C001L001ChooseDomainName.staticSearchStrRecapituler3(siteRequest_, (JsonObject)o);
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
		case "intro":
			return C001L001ChooseDomainName.staticSearchFqIntro(siteRequest_, o);
		case "moi":
			return C001L001ChooseDomainName.staticSearchFqMoi(siteRequest_, o);
		case "aLAvance":
			return C001L001ChooseDomainName.staticSearchFqALAvance(siteRequest_, o);
		case "acheter":
			return C001L001ChooseDomainName.staticSearchFqAcheter(siteRequest_, o);
		case "appeler":
			return C001L001ChooseDomainName.staticSearchFqAppeler(siteRequest_, o);
		case "apres1":
			return C001L001ChooseDomainName.staticSearchFqApres1(siteRequest_, o);
		case "apres2":
			return C001L001ChooseDomainName.staticSearchFqApres2(siteRequest_, o);
		case "apres3":
			return C001L001ChooseDomainName.staticSearchFqApres3(siteRequest_, o);
		case "apres4":
			return C001L001ChooseDomainName.staticSearchFqApres4(siteRequest_, o);
		case "apres5":
			return C001L001ChooseDomainName.staticSearchFqApres5(siteRequest_, o);
		case "plusTard":
			return C001L001ChooseDomainName.staticSearchFqPlusTard(siteRequest_, o);
		case "recapituler1":
			return C001L001ChooseDomainName.staticSearchFqRecapituler1(siteRequest_, o);
		case "recapituler2":
			return C001L001ChooseDomainName.staticSearchFqRecapituler2(siteRequest_, o);
		case "recapituler3":
			return C001L001ChooseDomainName.staticSearchFqRecapituler3(siteRequest_, o);
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
			return "JsonObject";
		case VAR_moi:
			return "JsonObject";
		case VAR_aLAvance:
			return "JsonObject";
		case VAR_acheter:
			return "JsonObject";
		case VAR_appeler:
			return "JsonObject";
		case VAR_apres1:
			return "JsonObject";
		case VAR_apres2:
			return "JsonObject";
		case VAR_apres3:
			return "JsonObject";
		case VAR_apres4:
			return "JsonObject";
		case VAR_apres5:
			return "JsonObject";
		case VAR_plusTard:
			return "JsonObject";
		case VAR_recapituler1:
			return "JsonObject";
		case VAR_recapituler2:
			return "JsonObject";
		case VAR_recapituler3:
			return "JsonObject";
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
