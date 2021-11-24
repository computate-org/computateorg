package org.computate.site.frfr.requete;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.vertx.ext.web.client.WebClient;
import org.slf4j.LoggerFactory;
import io.vertx.core.MultiMap;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import io.vertx.sqlclient.SqlConnection;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import org.computate.site.frfr.requete.api.RequeteApi;
import io.vertx.ext.web.api.service.ServiceRequest;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import io.vertx.ext.auth.User;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true">Trouver la classe requeteVars dans Solr. </a>
 * <br/>
 **/
public abstract class RequeteSiteFrFRGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(RequeteSiteFrFR.class);

	////////////
	// config //
	////////////

	/**	 L'entité config
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject config;

	/**	<br/> L'entité config
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:config">Trouver l'entité config dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _config(Couverture<JsonObject> c);

	public JsonObject getConfig() {
		return config;
	}

	public void setConfig(JsonObject config) {
		this.config = config;
	}
	public static JsonObject staticSetConfig(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR configInit() {
		Couverture<JsonObject> configCouverture = new Couverture<JsonObject>().var("config");
		if(config == null) {
			_config(configCouverture);
			setConfig(configCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	 L'entité requeteSite_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected RequeteSiteFrFR requeteSite_;

	/**	<br/> L'entité requeteSite_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteSite_(Couverture<RequeteSiteFrFR> c);

	public RequeteSiteFrFR getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSiteFrFR requeteSite_) {
		this.requeteSite_ = requeteSite_;
	}
	public static RequeteSiteFrFR staticSetRequeteSite_(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR requeteSite_Init() {
		Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().var("requeteSite_");
		if(requeteSite_ == null) {
			_requeteSite_(requeteSite_Couverture);
			setRequeteSite_(requeteSite_Couverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////
	// clientWeb //
	///////////////

	/**	 L'entité clientWeb
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected WebClient clientWeb;

	/**	<br/> L'entité clientWeb
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:clientWeb">Trouver l'entité clientWeb dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _clientWeb(Couverture<WebClient> c);

	public WebClient getClientWeb() {
		return clientWeb;
	}

	public void setClientWeb(WebClient clientWeb) {
		this.clientWeb = clientWeb;
	}
	public static WebClient staticSetClientWeb(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR clientWebInit() {
		Couverture<WebClient> clientWebCouverture = new Couverture<WebClient>().var("clientWeb");
		if(clientWeb == null) {
			_clientWeb(clientWebCouverture);
			setClientWeb(clientWebCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	/////////////////
	// requeteApi_ //
	/////////////////

	/**	 L'entité requeteApi_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected RequeteApi requeteApi_;

	/**	<br/> L'entité requeteApi_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteApi_">Trouver l'entité requeteApi_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteApi_(Couverture<RequeteApi> c);

	public RequeteApi getRequeteApi_() {
		return requeteApi_;
	}

	public void setRequeteApi_(RequeteApi requeteApi_) {
		this.requeteApi_ = requeteApi_;
	}
	public static RequeteApi staticSetRequeteApi_(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR requeteApi_Init() {
		Couverture<RequeteApi> requeteApi_Couverture = new Couverture<RequeteApi>().var("requeteApi_");
		if(requeteApi_ == null) {
			_requeteApi_(requeteApi_Couverture);
			setRequeteApi_(requeteApi_Couverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////
	// objetJson //
	///////////////

	/**	 L'entité objetJson
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject objetJson;

	/**	<br/> L'entité objetJson
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:objetJson">Trouver l'entité objetJson dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _objetJson(Couverture<JsonObject> c);

	public JsonObject getObjetJson() {
		return objetJson;
	}

	public void setObjetJson(JsonObject objetJson) {
		this.objetJson = objetJson;
	}
	public static JsonObject staticSetObjetJson(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR objetJsonInit() {
		Couverture<JsonObject> objetJsonCouverture = new Couverture<JsonObject>().var("objetJson");
		if(objetJson == null) {
			_objetJson(objetJsonCouverture);
			setObjetJson(objetJsonCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////////
	// rechercheSolr //
	///////////////////

	/**	 L'entité rechercheSolr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SolrQuery rechercheSolr;

	/**	<br/> L'entité rechercheSolr
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:rechercheSolr">Trouver l'entité rechercheSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _rechercheSolr(Couverture<SolrQuery> c);

	public SolrQuery getRechercheSolr() {
		return rechercheSolr;
	}

	public void setRechercheSolr(SolrQuery rechercheSolr) {
		this.rechercheSolr = rechercheSolr;
	}
	public static SolrQuery staticSetRechercheSolr(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR rechercheSolrInit() {
		Couverture<SolrQuery> rechercheSolrCouverture = new Couverture<SolrQuery>().var("rechercheSolr");
		if(rechercheSolr == null) {
			_rechercheSolr(rechercheSolrCouverture);
			setRechercheSolr(rechercheSolrCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	////////////////////
	// requeteService //
	////////////////////

	/**	 L'entité requeteService
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected ServiceRequest requeteService;

	/**	<br/> L'entité requeteService
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteService">Trouver l'entité requeteService dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteService(Couverture<ServiceRequest> c);

	public ServiceRequest getRequeteService() {
		return requeteService;
	}

	public void setRequeteService(ServiceRequest requeteService) {
		this.requeteService = requeteService;
	}
	public static ServiceRequest staticSetRequeteService(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR requeteServiceInit() {
		Couverture<ServiceRequest> requeteServiceCouverture = new Couverture<ServiceRequest>().var("requeteService");
		if(requeteService == null) {
			_requeteService(requeteServiceCouverture);
			setRequeteService(requeteServiceCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	/////////////////
	// utilisateur //
	/////////////////

	/**	 L'entité utilisateur
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected User utilisateur;

	/**	<br/> L'entité utilisateur
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateur">Trouver l'entité utilisateur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateur(Couverture<User> c);

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	public static User staticSetUtilisateur(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR utilisateurInit() {
		Couverture<User> utilisateurCouverture = new Couverture<User>().var("utilisateur");
		if(utilisateur == null) {
			_utilisateur(utilisateurCouverture);
			setUtilisateur(utilisateurCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////////
	// utilisateurId //
	///////////////////

	/**	 L'entité utilisateurId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurId;

	/**	<br/> L'entité utilisateurId
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurId">Trouver l'entité utilisateurId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurId(Couverture<String> c);

	public String getUtilisateurId() {
		return utilisateurId;
	}
	public void setUtilisateurId(String o) {
		this.utilisateurId = RequeteSiteFrFR.staticSetUtilisateurId(requeteSite_, o);
	}
	public static String staticSetUtilisateurId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR utilisateurIdInit() {
		Couverture<String> utilisateurIdCouverture = new Couverture<String>().var("utilisateurId");
		if(utilisateurId == null) {
			_utilisateurId(utilisateurIdCouverture);
			setUtilisateurId(utilisateurIdCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurId(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurId(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurId(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurId(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurId(requeteSite_, o)));
	}

	////////////////////
	// utilisateurCle //
	////////////////////

	/**	 L'entité utilisateurCle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long utilisateurCle;

	/**	<br/> L'entité utilisateurCle
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurCle">Trouver l'entité utilisateurCle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurCle(Couverture<Long> c);

	public Long getUtilisateurCle() {
		return utilisateurCle;
	}

	public void setUtilisateurCle(Long utilisateurCle) {
		this.utilisateurCle = utilisateurCle;
	}
	@JsonIgnore
	public void setUtilisateurCle(String o) {
		this.utilisateurCle = RequeteSiteFrFR.staticSetUtilisateurCle(requeteSite_, o);
	}
	public static Long staticSetUtilisateurCle(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected RequeteSiteFrFR utilisateurCleInit() {
		Couverture<Long> utilisateurCleCouverture = new Couverture<Long>().var("utilisateurCle");
		if(utilisateurCle == null) {
			_utilisateurCle(utilisateurCleCouverture);
			setUtilisateurCle(utilisateurCleCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static Long staticSolrUtilisateurCle(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrUtilisateurCle(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurCle(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurCle(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurCle(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurCle(requeteSite_, o)));
	}

	///////////////
	// sessionId //
	///////////////

	/**	 L'entité sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;

	/**	<br/> L'entité sessionId
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:sessionId">Trouver l'entité sessionId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _sessionId(Couverture<String> c);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = RequeteSiteFrFR.staticSetSessionId(requeteSite_, o);
	}
	public static String staticSetSessionId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR sessionIdInit() {
		Couverture<String> sessionIdCouverture = new Couverture<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdCouverture);
			setSessionId(sessionIdCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrSessionId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrSessionId(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqSessionId(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrSessionId(requeteSite_, RequeteSiteFrFR.staticSolrSessionId(requeteSite_, RequeteSiteFrFR.staticSetSessionId(requeteSite_, o)));
	}

	////////////////////
	// sessionIdAvant //
	////////////////////

	/**	 L'entité sessionIdAvant
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionIdAvant;

	/**	<br/> L'entité sessionIdAvant
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:sessionIdAvant">Trouver l'entité sessionIdAvant dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _sessionIdAvant(Couverture<String> c);

	public String getSessionIdAvant() {
		return sessionIdAvant;
	}
	public void setSessionIdAvant(String o) {
		this.sessionIdAvant = RequeteSiteFrFR.staticSetSessionIdAvant(requeteSite_, o);
	}
	public static String staticSetSessionIdAvant(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR sessionIdAvantInit() {
		Couverture<String> sessionIdAvantCouverture = new Couverture<String>().var("sessionIdAvant");
		if(sessionIdAvant == null) {
			_sessionIdAvant(sessionIdAvantCouverture);
			setSessionIdAvant(sessionIdAvantCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrSessionIdAvant(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrSessionIdAvant(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqSessionIdAvant(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrSessionIdAvant(requeteSite_, RequeteSiteFrFR.staticSolrSessionIdAvant(requeteSite_, RequeteSiteFrFR.staticSetSessionIdAvant(requeteSite_, o)));
	}

	////////////////////
	// utilisateurNom //
	////////////////////

	/**	 L'entité utilisateurNom
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurNom;

	/**	<br/> L'entité utilisateurNom
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNom">Trouver l'entité utilisateurNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNom(Couverture<String> c);

	public String getUtilisateurNom() {
		return utilisateurNom;
	}
	public void setUtilisateurNom(String o) {
		this.utilisateurNom = RequeteSiteFrFR.staticSetUtilisateurNom(requeteSite_, o);
	}
	public static String staticSetUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR utilisateurNomInit() {
		Couverture<String> utilisateurNomCouverture = new Couverture<String>().var("utilisateurNom");
		if(utilisateurNom == null) {
			_utilisateurNom(utilisateurNomCouverture);
			setUtilisateurNom(utilisateurNomCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurNom(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurNom(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurNom(requeteSite_, o)));
	}

	///////////////////////////
	// utilisateurNomFamille //
	///////////////////////////

	/**	 L'entité utilisateurNomFamille
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurNomFamille;

	/**	<br/> L'entité utilisateurNomFamille
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNomFamille">Trouver l'entité utilisateurNomFamille dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNomFamille(Couverture<String> c);

	public String getUtilisateurNomFamille() {
		return utilisateurNomFamille;
	}
	public void setUtilisateurNomFamille(String o) {
		this.utilisateurNomFamille = RequeteSiteFrFR.staticSetUtilisateurNomFamille(requeteSite_, o);
	}
	public static String staticSetUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR utilisateurNomFamilleInit() {
		Couverture<String> utilisateurNomFamilleCouverture = new Couverture<String>().var("utilisateurNomFamille");
		if(utilisateurNomFamille == null) {
			_utilisateurNomFamille(utilisateurNomFamilleCouverture);
			setUtilisateurNomFamille(utilisateurNomFamilleCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurNomFamille(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurNomFamille(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurNomFamille(requeteSite_, o)));
	}

	///////////////////////
	// utilisateurPrenom //
	///////////////////////

	/**	 L'entité utilisateurPrenom
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurPrenom;

	/**	<br/> L'entité utilisateurPrenom
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurPrenom">Trouver l'entité utilisateurPrenom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurPrenom(Couverture<String> c);

	public String getUtilisateurPrenom() {
		return utilisateurPrenom;
	}
	public void setUtilisateurPrenom(String o) {
		this.utilisateurPrenom = RequeteSiteFrFR.staticSetUtilisateurPrenom(requeteSite_, o);
	}
	public static String staticSetUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR utilisateurPrenomInit() {
		Couverture<String> utilisateurPrenomCouverture = new Couverture<String>().var("utilisateurPrenom");
		if(utilisateurPrenom == null) {
			_utilisateurPrenom(utilisateurPrenomCouverture);
			setUtilisateurPrenom(utilisateurPrenomCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurPrenom(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurPrenom(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurPrenom(requeteSite_, o)));
	}

	///////////////////////////
	// utilisateurNomComplet //
	///////////////////////////

	/**	 L'entité utilisateurNomComplet
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurNomComplet;

	/**	<br/> L'entité utilisateurNomComplet
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNomComplet">Trouver l'entité utilisateurNomComplet dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNomComplet(Couverture<String> c);

	public String getUtilisateurNomComplet() {
		return utilisateurNomComplet;
	}
	public void setUtilisateurNomComplet(String o) {
		this.utilisateurNomComplet = RequeteSiteFrFR.staticSetUtilisateurNomComplet(requeteSite_, o);
	}
	public static String staticSetUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR utilisateurNomCompletInit() {
		Couverture<String> utilisateurNomCompletCouverture = new Couverture<String>().var("utilisateurNomComplet");
		if(utilisateurNomComplet == null) {
			_utilisateurNomComplet(utilisateurNomCompletCouverture);
			setUtilisateurNomComplet(utilisateurNomCompletCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurNomComplet(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurNomComplet(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurNomComplet(requeteSite_, o)));
	}

	//////////////
	// userMail //
	//////////////

	/**	 L'entité userMail
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userMail;

	/**	<br/> L'entité userMail
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:userMail">Trouver l'entité userMail dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _userMail(Couverture<String> c);

	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String o) {
		this.userMail = RequeteSiteFrFR.staticSetUserMail(requeteSite_, o);
	}
	public static String staticSetUserMail(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR userMailInit() {
		Couverture<String> userMailCouverture = new Couverture<String>().var("userMail");
		if(userMail == null) {
			_userMail(userMailCouverture);
			setUserMail(userMailCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUserMail(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUserMail(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUserMail(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUserMail(requeteSite_, RequeteSiteFrFR.staticSolrUserMail(requeteSite_, RequeteSiteFrFR.staticSetUserMail(requeteSite_, o)));
	}

	/////////////////////////////
	// utilisateurRolesRoyaume //
	/////////////////////////////

	/**	 L'entité utilisateurRolesRoyaume
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> utilisateurRolesRoyaume = new ArrayList<String>();

	/**	<br/> L'entité utilisateurRolesRoyaume
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurRolesRoyaume">Trouver l'entité utilisateurRolesRoyaume dans Solr</a>
	 * <br/>
	 * @param utilisateurRolesRoyaume est l'entité déjà construit. 
	 **/
	protected abstract void _utilisateurRolesRoyaume(List<String> o);

	public List<String> getUtilisateurRolesRoyaume() {
		return utilisateurRolesRoyaume;
	}

	public void setUtilisateurRolesRoyaume(List<String> utilisateurRolesRoyaume) {
		this.utilisateurRolesRoyaume = utilisateurRolesRoyaume;
	}
	public static String staticSetUtilisateurRolesRoyaume(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	public RequeteSiteFrFR addUtilisateurRolesRoyaume(String...objets) {
		for(String o : objets) {
			addUtilisateurRolesRoyaume(o);
		}
		return (RequeteSiteFrFR)this;
	}
	public RequeteSiteFrFR addUtilisateurRolesRoyaume(String o) {
		if(o != null)
			this.utilisateurRolesRoyaume.add(o);
		return (RequeteSiteFrFR)this;
	}
	@JsonIgnore
	public void setUtilisateurRolesRoyaume(JsonArray objets) {
		utilisateurRolesRoyaume.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addUtilisateurRolesRoyaume(o);
		}
	}
	protected RequeteSiteFrFR utilisateurRolesRoyaumeInit() {
		_utilisateurRolesRoyaume(utilisateurRolesRoyaume);
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurRolesRoyaume(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurRolesRoyaume(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurRolesRoyaume(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurRolesRoyaume(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurRolesRoyaume(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurRolesRoyaume(requeteSite_, o)));
	}

	//////////////////////////
	// utilisateurRessource //
	//////////////////////////

	/**	 L'entité utilisateurRessource
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject utilisateurRessource;

	/**	<br/> L'entité utilisateurRessource
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurRessource">Trouver l'entité utilisateurRessource dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurRessource(Couverture<JsonObject> c);

	public JsonObject getUtilisateurRessource() {
		return utilisateurRessource;
	}

	public void setUtilisateurRessource(JsonObject utilisateurRessource) {
		this.utilisateurRessource = utilisateurRessource;
	}
	public static JsonObject staticSetUtilisateurRessource(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR utilisateurRessourceInit() {
		Couverture<JsonObject> utilisateurRessourceCouverture = new Couverture<JsonObject>().var("utilisateurRessource");
		if(utilisateurRessource == null) {
			_utilisateurRessource(utilisateurRessourceCouverture);
			setUtilisateurRessource(utilisateurRessourceCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////////////////////
	// utilisateurRolesRessource //
	///////////////////////////////

	/**	 L'entité utilisateurRolesRessource
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> utilisateurRolesRessource = new ArrayList<String>();

	/**	<br/> L'entité utilisateurRolesRessource
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurRolesRessource">Trouver l'entité utilisateurRolesRessource dans Solr</a>
	 * <br/>
	 * @param utilisateurRolesRessource est l'entité déjà construit. 
	 **/
	protected abstract void _utilisateurRolesRessource(List<String> o);

	public List<String> getUtilisateurRolesRessource() {
		return utilisateurRolesRessource;
	}

	public void setUtilisateurRolesRessource(List<String> utilisateurRolesRessource) {
		this.utilisateurRolesRessource = utilisateurRolesRessource;
	}
	public static String staticSetUtilisateurRolesRessource(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	public RequeteSiteFrFR addUtilisateurRolesRessource(String...objets) {
		for(String o : objets) {
			addUtilisateurRolesRessource(o);
		}
		return (RequeteSiteFrFR)this;
	}
	public RequeteSiteFrFR addUtilisateurRolesRessource(String o) {
		if(o != null)
			this.utilisateurRolesRessource.add(o);
		return (RequeteSiteFrFR)this;
	}
	@JsonIgnore
	public void setUtilisateurRolesRessource(JsonArray objets) {
		utilisateurRolesRessource.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addUtilisateurRolesRessource(o);
		}
	}
	protected RequeteSiteFrFR utilisateurRolesRessourceInit() {
		_utilisateurRolesRessource(utilisateurRolesRessource);
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrUtilisateurRolesRessource(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUtilisateurRolesRessource(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUtilisateurRolesRessource(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrUtilisateurRolesRessource(requeteSite_, RequeteSiteFrFR.staticSolrUtilisateurRolesRessource(requeteSite_, RequeteSiteFrFR.staticSetUtilisateurRolesRessource(requeteSite_, o)));
	}

	//////////////////////
	// utilisateurSite_ //
	//////////////////////

	/**	 L'entité utilisateurSite_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected UtilisateurSite utilisateurSite_;

	/**	<br/> L'entité utilisateurSite_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurSite_">Trouver l'entité utilisateurSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSite_(Couverture<UtilisateurSite> c);

	public UtilisateurSite getUtilisateurSite_() {
		return utilisateurSite_;
	}

	public void setUtilisateurSite_(UtilisateurSite utilisateurSite_) {
		this.utilisateurSite_ = utilisateurSite_;
	}
	public static UtilisateurSite staticSetUtilisateurSite_(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR utilisateurSite_Init() {
		Couverture<UtilisateurSite> utilisateurSite_Couverture = new Couverture<UtilisateurSite>().var("utilisateurSite_");
		if(utilisateurSite_ == null) {
			_utilisateurSite_(utilisateurSite_Couverture);
			setUtilisateurSite_(utilisateurSite_Couverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	//////////////////
	// documentSolr //
	//////////////////

	/**	 L'entité documentSolr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SolrDocument documentSolr;

	/**	<br/> L'entité documentSolr
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:documentSolr">Trouver l'entité documentSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _documentSolr(Couverture<SolrDocument> c);

	public SolrDocument getDocumentSolr() {
		return documentSolr;
	}

	public void setDocumentSolr(SolrDocument documentSolr) {
		this.documentSolr = documentSolr;
	}
	public static SolrDocument staticSetDocumentSolr(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR documentSolrInit() {
		Couverture<SolrDocument> documentSolrCouverture = new Couverture<SolrDocument>().var("documentSolr");
		if(documentSolr == null) {
			_documentSolr(documentSolrCouverture);
			setDocumentSolr(documentSolrCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	///////////////
	// pageAdmin //
	///////////////

	/**	 L'entité pageAdmin
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean pageAdmin;

	/**	<br/> L'entité pageAdmin
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageAdmin">Trouver l'entité pageAdmin dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAdmin(Couverture<Boolean> c);

	public Boolean getPageAdmin() {
		return pageAdmin;
	}

	public void setPageAdmin(Boolean pageAdmin) {
		this.pageAdmin = pageAdmin;
	}
	@JsonIgnore
	public void setPageAdmin(String o) {
		this.pageAdmin = RequeteSiteFrFR.staticSetPageAdmin(requeteSite_, o);
	}
	public static Boolean staticSetPageAdmin(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected RequeteSiteFrFR pageAdminInit() {
		Couverture<Boolean> pageAdminCouverture = new Couverture<Boolean>().var("pageAdmin");
		if(pageAdmin == null) {
			_pageAdmin(pageAdminCouverture);
			setPageAdmin(pageAdminCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static Boolean staticSolrPageAdmin(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o;
	}

	public static String staticSolrStrPageAdmin(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqPageAdmin(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrPageAdmin(requeteSite_, RequeteSiteFrFR.staticSolrPageAdmin(requeteSite_, RequeteSiteFrFR.staticSetPageAdmin(requeteSite_, o)));
	}

	///////////////
	// requetePk //
	///////////////

	/**	 L'entité requetePk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long requetePk;

	/**	<br/> L'entité requetePk
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requetePk">Trouver l'entité requetePk dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requetePk(Couverture<Long> c);

	public Long getRequetePk() {
		return requetePk;
	}

	public void setRequetePk(Long requetePk) {
		this.requetePk = requetePk;
	}
	@JsonIgnore
	public void setRequetePk(String o) {
		this.requetePk = RequeteSiteFrFR.staticSetRequetePk(requeteSite_, o);
	}
	public static Long staticSetRequetePk(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected RequeteSiteFrFR requetePkInit() {
		Couverture<Long> requetePkCouverture = new Couverture<Long>().var("requetePk");
		if(requetePk == null) {
			_requetePk(requetePkCouverture);
			setRequetePk(requetePkCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static Long staticSolrRequetePk(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrRequetePk(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqRequetePk(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrRequetePk(requeteSite_, RequeteSiteFrFR.staticSolrRequetePk(requeteSite_, RequeteSiteFrFR.staticSetRequetePk(requeteSite_, o)));
	}

	////////////////
	// requeteUri //
	////////////////

	/**	 L'entité requeteUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String requeteUri;

	/**	<br/> L'entité requeteUri
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteUri">Trouver l'entité requeteUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteUri(Couverture<String> c);

	public String getRequeteUri() {
		return requeteUri;
	}
	public void setRequeteUri(String o) {
		this.requeteUri = RequeteSiteFrFR.staticSetRequeteUri(requeteSite_, o);
	}
	public static String staticSetRequeteUri(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR requeteUriInit() {
		Couverture<String> requeteUriCouverture = new Couverture<String>().var("requeteUri");
		if(requeteUri == null) {
			_requeteUri(requeteUriCouverture);
			setRequeteUri(requeteUriCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrRequeteUri(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrRequeteUri(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqRequeteUri(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrRequeteUri(requeteSite_, RequeteSiteFrFR.staticSolrRequeteUri(requeteSite_, RequeteSiteFrFR.staticSetRequeteUri(requeteSite_, o)));
	}

	////////////////////
	// requeteMethode //
	////////////////////

	/**	 L'entité requeteMethode
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String requeteMethode;

	/**	<br/> L'entité requeteMethode
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteMethode">Trouver l'entité requeteMethode dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteMethode(Couverture<String> c);

	public String getRequeteMethode() {
		return requeteMethode;
	}
	public void setRequeteMethode(String o) {
		this.requeteMethode = RequeteSiteFrFR.staticSetRequeteMethode(requeteSite_, o);
	}
	public static String staticSetRequeteMethode(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteSiteFrFR requeteMethodeInit() {
		Couverture<String> requeteMethodeCouverture = new Couverture<String>().var("requeteMethode");
		if(requeteMethode == null) {
			_requeteMethode(requeteMethodeCouverture);
			setRequeteMethode(requeteMethodeCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	public static String staticSolrRequeteMethode(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrRequeteMethode(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqRequeteMethode(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteSiteFrFR.staticSolrStrRequeteMethode(requeteSite_, RequeteSiteFrFR.staticSolrRequeteMethode(requeteSite_, RequeteSiteFrFR.staticSetRequeteMethode(requeteSite_, o)));
	}

	//////////////////
	// connexionSql //
	//////////////////

	/**	 L'entité connexionSql
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SqlConnection connexionSql;

	/**	<br/> L'entité connexionSql
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:connexionSql">Trouver l'entité connexionSql dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _connexionSql(Couverture<SqlConnection> c);

	public SqlConnection getConnexionSql() {
		return connexionSql;
	}

	public void setConnexionSql(SqlConnection connexionSql) {
		this.connexionSql = connexionSql;
	}
	public static SqlConnection staticSetConnexionSql(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR connexionSqlInit() {
		Couverture<SqlConnection> connexionSqlCouverture = new Couverture<SqlConnection>().var("connexionSql");
		if(connexionSql == null) {
			_connexionSql(connexionSqlCouverture);
			setConnexionSql(connexionSqlCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	////////////////////
	// requeteEnTetes //
	////////////////////

	/**	 L'entité requeteEnTetes
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected MultiMap requeteEnTetes;

	/**	<br/> L'entité requeteEnTetes
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteEnTetes">Trouver l'entité requeteEnTetes dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteEnTetes(Couverture<MultiMap> c);

	public MultiMap getRequeteEnTetes() {
		return requeteEnTetes;
	}

	public void setRequeteEnTetes(MultiMap requeteEnTetes) {
		this.requeteEnTetes = requeteEnTetes;
	}
	public static MultiMap staticSetRequeteEnTetes(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR requeteEnTetesInit() {
		Couverture<MultiMap> requeteEnTetesCouverture = new Couverture<MultiMap>().var("requeteEnTetes");
		if(requeteEnTetes == null) {
			_requeteEnTetes(requeteEnTetesCouverture);
			setRequeteEnTetes(requeteEnTetesCouverture.o);
		}
		return (RequeteSiteFrFR)this;
	}

	/////////////////
	// requeteVars //
	/////////////////

	/**	 L'entité requeteVars
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Map<String, String>(). 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Map<String, String> requeteVars = new HashMap<String, String>();

	/**	<br/> L'entité requeteVars
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Map<String, String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.RequeteSiteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteVars">Trouver l'entité requeteVars dans Solr</a>
	 * <br/>
	 * @param requeteVars est l'entité déjà construit. 
	 **/
	protected abstract void _requeteVars(Map<String, String> m);

	public Map<String, String> getRequeteVars() {
		return requeteVars;
	}

	public void setRequeteVars(Map<String, String> requeteVars) {
		this.requeteVars = requeteVars;
	}
	public static Map<String, String> staticSetRequeteVars(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteSiteFrFR requeteVarsInit() {
		_requeteVars(requeteVars);
		return (RequeteSiteFrFR)this;
	}

	//////////////
	// initLoin //
	//////////////

	public RequeteSiteFrFR initLoinRequeteSiteFrFR(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		initLoinRequeteSiteFrFR();
		return (RequeteSiteFrFR)this;
	}

	public void initLoinRequeteSiteFrFR() {
		initRequeteSiteFrFR();
	}

	public void initRequeteSiteFrFR() {
				configInit();
				requeteSite_Init();
				clientWebInit();
				requeteApi_Init();
				objetJsonInit();
				rechercheSolrInit();
				requeteServiceInit();
				utilisateurInit();
				utilisateurIdInit();
				utilisateurCleInit();
				sessionIdInit();
				sessionIdAvantInit();
				utilisateurNomInit();
				utilisateurNomFamilleInit();
				utilisateurPrenomInit();
				utilisateurNomCompletInit();
				userMailInit();
				utilisateurRolesRoyaumeInit();
				utilisateurRessourceInit();
				utilisateurRolesRessourceInit();
				utilisateurSite_Init();
				documentSolrInit();
				pageAdminInit();
				requetePkInit();
				requeteUriInit();
				requeteMethodeInit();
				connexionSqlInit();
				requeteEnTetesInit();
				requeteVarsInit();
	}

	public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinRequeteSiteFrFR(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteRequeteSiteFrFR(RequeteSiteFrFR requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteRequeteSiteFrFR(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirRequeteSiteFrFR(v);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.obtenirPourClasse(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtenirRequeteSiteFrFR(String var) {
		RequeteSiteFrFR oRequeteSiteFrFR = (RequeteSiteFrFR)this;
		switch(var) {
			case "config":
				return oRequeteSiteFrFR.config;
			case "requeteSite_":
				return oRequeteSiteFrFR.requeteSite_;
			case "clientWeb":
				return oRequeteSiteFrFR.clientWeb;
			case "requeteApi_":
				return oRequeteSiteFrFR.requeteApi_;
			case "objetJson":
				return oRequeteSiteFrFR.objetJson;
			case "rechercheSolr":
				return oRequeteSiteFrFR.rechercheSolr;
			case "requeteService":
				return oRequeteSiteFrFR.requeteService;
			case "utilisateur":
				return oRequeteSiteFrFR.utilisateur;
			case "utilisateurId":
				return oRequeteSiteFrFR.utilisateurId;
			case "utilisateurCle":
				return oRequeteSiteFrFR.utilisateurCle;
			case "sessionId":
				return oRequeteSiteFrFR.sessionId;
			case "sessionIdAvant":
				return oRequeteSiteFrFR.sessionIdAvant;
			case "utilisateurNom":
				return oRequeteSiteFrFR.utilisateurNom;
			case "utilisateurNomFamille":
				return oRequeteSiteFrFR.utilisateurNomFamille;
			case "utilisateurPrenom":
				return oRequeteSiteFrFR.utilisateurPrenom;
			case "utilisateurNomComplet":
				return oRequeteSiteFrFR.utilisateurNomComplet;
			case "userMail":
				return oRequeteSiteFrFR.userMail;
			case "utilisateurRolesRoyaume":
				return oRequeteSiteFrFR.utilisateurRolesRoyaume;
			case "utilisateurRessource":
				return oRequeteSiteFrFR.utilisateurRessource;
			case "utilisateurRolesRessource":
				return oRequeteSiteFrFR.utilisateurRolesRessource;
			case "utilisateurSite_":
				return oRequeteSiteFrFR.utilisateurSite_;
			case "documentSolr":
				return oRequeteSiteFrFR.documentSolr;
			case "pageAdmin":
				return oRequeteSiteFrFR.pageAdmin;
			case "requetePk":
				return oRequeteSiteFrFR.requetePk;
			case "requeteUri":
				return oRequeteSiteFrFR.requeteUri;
			case "requeteMethode":
				return oRequeteSiteFrFR.requeteMethode;
			case "connexionSql":
				return oRequeteSiteFrFR.connexionSql;
			case "requeteEnTetes":
				return oRequeteSiteFrFR.requeteEnTetes;
			case "requeteVars":
				return oRequeteSiteFrFR.requeteVars;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerRequeteSiteFrFR(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerRequeteSiteFrFR(String var, Object val) {
		RequeteSiteFrFR oRequeteSiteFrFR = (RequeteSiteFrFR)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSetRequeteSiteFrFR(entiteVar,  requeteSite_, o);
	}
	public static Object staticSetRequeteSiteFrFR(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "utilisateurId":
			return RequeteSiteFrFR.staticSetUtilisateurId(requeteSite_, o);
		case "utilisateurCle":
			return RequeteSiteFrFR.staticSetUtilisateurCle(requeteSite_, o);
		case "sessionId":
			return RequeteSiteFrFR.staticSetSessionId(requeteSite_, o);
		case "sessionIdAvant":
			return RequeteSiteFrFR.staticSetSessionIdAvant(requeteSite_, o);
		case "utilisateurNom":
			return RequeteSiteFrFR.staticSetUtilisateurNom(requeteSite_, o);
		case "utilisateurNomFamille":
			return RequeteSiteFrFR.staticSetUtilisateurNomFamille(requeteSite_, o);
		case "utilisateurPrenom":
			return RequeteSiteFrFR.staticSetUtilisateurPrenom(requeteSite_, o);
		case "utilisateurNomComplet":
			return RequeteSiteFrFR.staticSetUtilisateurNomComplet(requeteSite_, o);
		case "userMail":
			return RequeteSiteFrFR.staticSetUserMail(requeteSite_, o);
		case "utilisateurRolesRoyaume":
			return RequeteSiteFrFR.staticSetUtilisateurRolesRoyaume(requeteSite_, o);
		case "utilisateurRolesRessource":
			return RequeteSiteFrFR.staticSetUtilisateurRolesRessource(requeteSite_, o);
		case "pageAdmin":
			return RequeteSiteFrFR.staticSetPageAdmin(requeteSite_, o);
		case "requetePk":
			return RequeteSiteFrFR.staticSetRequetePk(requeteSite_, o);
		case "requeteUri":
			return RequeteSiteFrFR.staticSetRequeteUri(requeteSite_, o);
		case "requeteMethode":
			return RequeteSiteFrFR.staticSetRequeteMethode(requeteSite_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrRequeteSiteFrFR(entiteVar,  requeteSite_, o);
	}
	public static Object staticSolrRequeteSiteFrFR(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "utilisateurId":
			return RequeteSiteFrFR.staticSolrUtilisateurId(requeteSite_, (String)o);
		case "utilisateurCle":
			return RequeteSiteFrFR.staticSolrUtilisateurCle(requeteSite_, (Long)o);
		case "sessionId":
			return RequeteSiteFrFR.staticSolrSessionId(requeteSite_, (String)o);
		case "sessionIdAvant":
			return RequeteSiteFrFR.staticSolrSessionIdAvant(requeteSite_, (String)o);
		case "utilisateurNom":
			return RequeteSiteFrFR.staticSolrUtilisateurNom(requeteSite_, (String)o);
		case "utilisateurNomFamille":
			return RequeteSiteFrFR.staticSolrUtilisateurNomFamille(requeteSite_, (String)o);
		case "utilisateurPrenom":
			return RequeteSiteFrFR.staticSolrUtilisateurPrenom(requeteSite_, (String)o);
		case "utilisateurNomComplet":
			return RequeteSiteFrFR.staticSolrUtilisateurNomComplet(requeteSite_, (String)o);
		case "userMail":
			return RequeteSiteFrFR.staticSolrUserMail(requeteSite_, (String)o);
		case "utilisateurRolesRoyaume":
			return RequeteSiteFrFR.staticSolrUtilisateurRolesRoyaume(requeteSite_, (String)o);
		case "utilisateurRolesRessource":
			return RequeteSiteFrFR.staticSolrUtilisateurRolesRessource(requeteSite_, (String)o);
		case "pageAdmin":
			return RequeteSiteFrFR.staticSolrPageAdmin(requeteSite_, (Boolean)o);
		case "requetePk":
			return RequeteSiteFrFR.staticSolrRequetePk(requeteSite_, (Long)o);
		case "requeteUri":
			return RequeteSiteFrFR.staticSolrRequeteUri(requeteSite_, (String)o);
		case "requeteMethode":
			return RequeteSiteFrFR.staticSolrRequeteMethode(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrStrRequeteSiteFrFR(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrStrRequeteSiteFrFR(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "utilisateurId":
			return RequeteSiteFrFR.staticSolrStrUtilisateurId(requeteSite_, (String)o);
		case "utilisateurCle":
			return RequeteSiteFrFR.staticSolrStrUtilisateurCle(requeteSite_, (Long)o);
		case "sessionId":
			return RequeteSiteFrFR.staticSolrStrSessionId(requeteSite_, (String)o);
		case "sessionIdAvant":
			return RequeteSiteFrFR.staticSolrStrSessionIdAvant(requeteSite_, (String)o);
		case "utilisateurNom":
			return RequeteSiteFrFR.staticSolrStrUtilisateurNom(requeteSite_, (String)o);
		case "utilisateurNomFamille":
			return RequeteSiteFrFR.staticSolrStrUtilisateurNomFamille(requeteSite_, (String)o);
		case "utilisateurPrenom":
			return RequeteSiteFrFR.staticSolrStrUtilisateurPrenom(requeteSite_, (String)o);
		case "utilisateurNomComplet":
			return RequeteSiteFrFR.staticSolrStrUtilisateurNomComplet(requeteSite_, (String)o);
		case "userMail":
			return RequeteSiteFrFR.staticSolrStrUserMail(requeteSite_, (String)o);
		case "utilisateurRolesRoyaume":
			return RequeteSiteFrFR.staticSolrStrUtilisateurRolesRoyaume(requeteSite_, (String)o);
		case "utilisateurRolesRessource":
			return RequeteSiteFrFR.staticSolrStrUtilisateurRolesRessource(requeteSite_, (String)o);
		case "pageAdmin":
			return RequeteSiteFrFR.staticSolrStrPageAdmin(requeteSite_, (Boolean)o);
		case "requetePk":
			return RequeteSiteFrFR.staticSolrStrRequetePk(requeteSite_, (Long)o);
		case "requeteUri":
			return RequeteSiteFrFR.staticSolrStrRequeteUri(requeteSite_, (String)o);
		case "requeteMethode":
			return RequeteSiteFrFR.staticSolrStrRequeteMethode(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSolrFqRequeteSiteFrFR(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrFqRequeteSiteFrFR(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "utilisateurId":
			return RequeteSiteFrFR.staticSolrFqUtilisateurId(requeteSite_, o);
		case "utilisateurCle":
			return RequeteSiteFrFR.staticSolrFqUtilisateurCle(requeteSite_, o);
		case "sessionId":
			return RequeteSiteFrFR.staticSolrFqSessionId(requeteSite_, o);
		case "sessionIdAvant":
			return RequeteSiteFrFR.staticSolrFqSessionIdAvant(requeteSite_, o);
		case "utilisateurNom":
			return RequeteSiteFrFR.staticSolrFqUtilisateurNom(requeteSite_, o);
		case "utilisateurNomFamille":
			return RequeteSiteFrFR.staticSolrFqUtilisateurNomFamille(requeteSite_, o);
		case "utilisateurPrenom":
			return RequeteSiteFrFR.staticSolrFqUtilisateurPrenom(requeteSite_, o);
		case "utilisateurNomComplet":
			return RequeteSiteFrFR.staticSolrFqUtilisateurNomComplet(requeteSite_, o);
		case "userMail":
			return RequeteSiteFrFR.staticSolrFqUserMail(requeteSite_, o);
		case "utilisateurRolesRoyaume":
			return RequeteSiteFrFR.staticSolrFqUtilisateurRolesRoyaume(requeteSite_, o);
		case "utilisateurRolesRessource":
			return RequeteSiteFrFR.staticSolrFqUtilisateurRolesRessource(requeteSite_, o);
		case "pageAdmin":
			return RequeteSiteFrFR.staticSolrFqPageAdmin(requeteSite_, o);
		case "requetePk":
			return RequeteSiteFrFR.staticSolrFqRequetePk(requeteSite_, o);
		case "requeteUri":
			return RequeteSiteFrFR.staticSolrFqRequeteUri(requeteSite_, o);
		case "requeteMethode":
			return RequeteSiteFrFR.staticSolrFqRequeteMethode(requeteSite_, o);
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirRequeteSiteFrFR(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirRequeteSiteFrFR(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiRequeteSiteFrFR() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof RequeteSiteFrFR) {
			RequeteSiteFrFR original = (RequeteSiteFrFR)o;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String VAR_config = "config";
	public static final String VAR_requeteSite_ = "requeteSite_";
	public static final String VAR_clientWeb = "clientWeb";
	public static final String VAR_requeteApi_ = "requeteApi_";
	public static final String VAR_objetJson = "objetJson";
	public static final String VAR_rechercheSolr = "rechercheSolr";
	public static final String VAR_requeteService = "requeteService";
	public static final String VAR_utilisateur = "utilisateur";
	public static final String VAR_utilisateurId = "utilisateurId";
	public static final String VAR_utilisateurCle = "utilisateurCle";
	public static final String VAR_sessionId = "sessionId";
	public static final String VAR_sessionIdAvant = "sessionIdAvant";
	public static final String VAR_utilisateurNom = "utilisateurNom";
	public static final String VAR_utilisateurNomFamille = "utilisateurNomFamille";
	public static final String VAR_utilisateurPrenom = "utilisateurPrenom";
	public static final String VAR_utilisateurNomComplet = "utilisateurNomComplet";
	public static final String VAR_userMail = "userMail";
	public static final String VAR_utilisateurRolesRoyaume = "utilisateurRolesRoyaume";
	public static final String VAR_utilisateurRessource = "utilisateurRessource";
	public static final String VAR_utilisateurRolesRessource = "utilisateurRolesRessource";
	public static final String VAR_utilisateurSite_ = "utilisateurSite_";
	public static final String VAR_documentSolr = "documentSolr";
	public static final String VAR_pageAdmin = "pageAdmin";
	public static final String VAR_requetePk = "requetePk";
	public static final String VAR_requeteUri = "requeteUri";
	public static final String VAR_requeteMethode = "requeteMethode";
	public static final String VAR_connexionSql = "connexionSql";
	public static final String VAR_requeteEnTetes = "requeteEnTetes";
	public static final String VAR_requeteVars = "requeteVars";
}
