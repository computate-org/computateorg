package org.computate.site.frfr.utilisateur;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.RoundingMode;
import java.lang.Void;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import org.computate.site.frfr.requete.api.RequeteApi;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class UtilisateurSiteGenPageGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(UtilisateurSiteGenPage.class);

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	 L'entité requeteSite_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected RequeteSiteFrFR requeteSite_;

	/**	<br/> L'entité requeteSite_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
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
	protected UtilisateurSiteGenPage requeteSite_Init() {
		Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().var("requeteSite_");
		if(requeteSite_ == null) {
			_requeteSite_(requeteSite_Couverture);
			setRequeteSite_(requeteSite_Couverture.o);
		}
		return (UtilisateurSiteGenPage)this;
	}

	////////////////////////////////////
	// listeRechercheUtilisateurSite_ //
	////////////////////////////////////

	/**	 L'entité listeRechercheUtilisateurSite_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected ListeRecherche<UtilisateurSite> listeRechercheUtilisateurSite_;

	/**	<br/> L'entité listeRechercheUtilisateurSite_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeRechercheUtilisateurSite_">Trouver l'entité listeRechercheUtilisateurSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeRechercheUtilisateurSite_(Couverture<ListeRecherche<UtilisateurSite>> c);

	public ListeRecherche<UtilisateurSite> getListeRechercheUtilisateurSite_() {
		return listeRechercheUtilisateurSite_;
	}

	public void setListeRechercheUtilisateurSite_(ListeRecherche<UtilisateurSite> listeRechercheUtilisateurSite_) {
		this.listeRechercheUtilisateurSite_ = listeRechercheUtilisateurSite_;
	}
	public static ListeRecherche<UtilisateurSite> staticSetListeRechercheUtilisateurSite_(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected UtilisateurSiteGenPage listeRechercheUtilisateurSite_Init() {
		Couverture<ListeRecherche<UtilisateurSite>> listeRechercheUtilisateurSite_Couverture = new Couverture<ListeRecherche<UtilisateurSite>>().var("listeRechercheUtilisateurSite_");
		if(listeRechercheUtilisateurSite_ == null) {
			_listeRechercheUtilisateurSite_(listeRechercheUtilisateurSite_Couverture);
			setListeRechercheUtilisateurSite_(listeRechercheUtilisateurSite_Couverture.o);
		}
		return (UtilisateurSiteGenPage)this;
	}

	//////////////////////////
	// listeUtilisateurSite //
	//////////////////////////

	/**	 L'entité listeUtilisateurSite
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut JsonArray(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listeUtilisateurSite = new JsonArray();

	/**	<br/> L'entité listeUtilisateurSite
	 * Il est construit avant d'être initialisé avec le constructeur par défaut JsonArray(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeUtilisateurSite">Trouver l'entité listeUtilisateurSite dans Solr</a>
	 * <br/>
	 * @param listeUtilisateurSite est l'entité déjà construit. 
	 **/
	protected abstract void _listeUtilisateurSite(JsonArray l);

	public JsonArray getListeUtilisateurSite() {
		return listeUtilisateurSite;
	}

	public void setListeUtilisateurSite(JsonArray listeUtilisateurSite) {
		this.listeUtilisateurSite = listeUtilisateurSite;
	}
	public static JsonArray staticSetListeUtilisateurSite(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected UtilisateurSiteGenPage listeUtilisateurSiteInit() {
		_listeUtilisateurSite(listeUtilisateurSite);
		return (UtilisateurSiteGenPage)this;
	}

	//////////////////////////
	// utilisateurSiteCount //
	//////////////////////////

	/**	 L'entité utilisateurSiteCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer utilisateurSiteCount;

	/**	<br/> L'entité utilisateurSiteCount
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurSiteCount">Trouver l'entité utilisateurSiteCount dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSiteCount(Couverture<Integer> c);

	public Integer getUtilisateurSiteCount() {
		return utilisateurSiteCount;
	}

	public void setUtilisateurSiteCount(Integer utilisateurSiteCount) {
		this.utilisateurSiteCount = utilisateurSiteCount;
	}
	