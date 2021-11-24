package org.computate.site.frfr.utilisateur;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.util.Set;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.solr.client.solrj.util.ClientUtils;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true">Trouver la classe seeDeleted dans Solr. </a>
 * <br/>
 **/
public abstract class UtilisateurSiteGen<DEV> extends ModeleBase {
	protected static final Logger LOG = LoggerFactory.getLogger(UtilisateurSite.class);

	public static final String UtilisateurSite_UnNom = "un utilisateur du site";
	public static final String UtilisateurSite_Ce = "ce ";
	public static final String UtilisateurSite_CeNom = "cet utilisateur du site";
	public static final String UtilisateurSite_Un = "un ";
	public static final String UtilisateurSite_LeNom = "l'utilisateur du site";
	public static final String UtilisateurSite_NomSingulier = "utilisateur du site";
	public static final String UtilisateurSite_NomPluriel = "utilisateurs du site";
	public static final String UtilisateurSite_NomActuel = "utilisateur du site actuel";
	public static final String UtilisateurSite_TousNom = "tous les utilisateurs du site";
	public static final String UtilisateurSite_RechercherTousNomPar = "rechercher utilisateurs du site par ";
	public static final String UtilisateurSite_RechercherTousNom = "rechercher utilisateurs du site";
	public static final String UtilisateurSite_Titre = "utilisateurs du site";
	public static final String UtilisateurSite_LesNom = "les utilisateurs du site";
	public static final String UtilisateurSite_AucunNomTrouve = "aucun utilisateur du site trouvé";
	public static final String UtilisateurSite_NomVar = "utilisateur";
	public static final String UtilisateurSite_DeNom = "d'utilisateur du site";
	public static final String UtilisateurSite_NomAdjectifSingulier = "utilisateur du site";
	public static final String UtilisateurSite_NomAdjectifPluriel = "utilisateurs du site";
	public static final String UtilisateurSite_Couleur = "gray";
	public static final String UtilisateurSite_IconeGroupe = "regular";
	public static final String UtilisateurSite_IconeNom = "user-cog";

	/////////////////////
	// utilisateurCles //
	/////////////////////

	/**	 L'entité utilisateurCles
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> utilisateurCles = new ArrayList<Long>();

	/**	<br/> L'entité utilisateurCles
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurCles">Trouver l'entité utilisateurCles dans Solr</a>
	 * <br/>
	 * @param utilisateurCles est l'entité déjà construit. 
	 **/
	protected abstract void _utilisateurCles(List<Long> l);

	public List<Long> getUtilisateurCles() {
		return utilisateurCles;
	}

	public void setUtilisateurCles(List<Long> utilisateurCles) {
		this.utilisateurCles = utilisateurCles;
	}
	@JsonIgnore
	public void setUtilisateurCles(String o) {
		Long l = UtilisateurSite.staticSetUtilisateurCles(null, o);
		if(l != null)
			addUtilisateurCles(l);
	}
	public static Long staticSetUtilisateurCles(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public UtilisateurSite addUtilisateurCles(Long...objets) {
		for(Long o : objets) {
			addUtilisateurCles(o);
		}
		return (UtilisateurSite)this;
	}
	public UtilisateurSite addUtilisateurCles(Long o) {
		if(o != null)
			this.utilisateurCles.add(o);
		return (UtilisateurSite)this;
	}
	@JsonIgnore
	public void setUtilisateurCles(JsonArray objets) {
		utilisateurCles.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addUtilisateurCles(o);
		}
	}
	public UtilisateurSite addUtilisateurCles(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addUtilisateurCles(p);
		}
		return (UtilisateurSite)this;
	}
	protected UtilisateurSite utilisateurClesInit() {
		_utilisateurCles(utilisateurCles);
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurCles(RequeteSiteFrFR requeteSite_, List<Long> o) {
		return null;
	}

	public static String staticSolrStrUtilisateurCles(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurCles(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurCles(requeteSite_, UtilisateurSite.staticSolrUtilisateurCles(requeteSite_, UtilisateurSite.staticSetUtilisateurCles(requeteSite_, o)));
	}

	//////////////////
	// paiementCles //
	//////////////////

	/**	 L'entité paiementCles
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> paiementCles = new ArrayList<Long>();

	/**	<br/> L'entité paiementCles
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementCles">Trouver l'entité paiementCles dans Solr</a>
	 * <br/>
	 * @param paiementCles est l'entité déjà construit. 
	 **/
	protected abstract void _paiementCles(List<Long> o);

	public List<Long> getPaiementCles() {
		return paiementCles;
	}

	public void setPaiementCles(List<Long> paiementCles) {
		this.paiementCles = paiementCles;
	}
	@JsonIgnore
	public void setPaiementCles(String o) {
		Long l = UtilisateurSite.staticSetPaiementCles(null, o);
		if(l != null)
			addPaiementCles(l);
	}
	public static Long staticSetPaiementCles(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public UtilisateurSite addPaiementCles(Long...objets) {
		for(Long o : objets) {
			addPaiementCles(o);
		}
		return (UtilisateurSite)this;
	}
	public UtilisateurSite addPaiementCles(Long o) {
		if(o != null)
			this.paiementCles.add(o);
		return (UtilisateurSite)this;
	}
	@JsonIgnore
	public void setPaiementCles(JsonArray objets) {
		paiementCles.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addPaiementCles(o);
		}
	}
	public UtilisateurSite addPaiementCles(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addPaiementCles(p);
		}
		return (UtilisateurSite)this;
	}
	protected UtilisateurSite paiementClesInit() {
		_paiementCles(paiementCles);
		return (UtilisateurSite)this;
	}

	public static Object staticSolrPaiementCles(RequeteSiteFrFR requeteSite_, List<Long> o) {
		return null;
	}

	public static String staticSolrStrPaiementCles(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqPaiementCles(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrPaiementCles(requeteSite_, UtilisateurSite.staticSolrPaiementCles(requeteSite_, UtilisateurSite.staticSetPaiementCles(requeteSite_, o)));
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNom">Trouver l'entité utilisateurNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNom(Couverture<String> c);

	public String getUtilisateurNom() {
		return utilisateurNom;
	}
	public void setUtilisateurNom(String o) {
		this.utilisateurNom = UtilisateurSite.staticSetUtilisateurNom(null, o);
	}
	public static String staticSetUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurNomInit() {
		Couverture<String> utilisateurNomCouverture = new Couverture<String>().var("utilisateurNom");
		if(utilisateurNom == null) {
			_utilisateurNom(utilisateurNomCouverture);
			setUtilisateurNom(utilisateurNomCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurNom(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurNom(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurNom(requeteSite_, UtilisateurSite.staticSolrUtilisateurNom(requeteSite_, UtilisateurSite.staticSetUtilisateurNom(requeteSite_, o)));
	}

	/////////////////////
	// utilisateurMail //
	/////////////////////

	/**	 L'entité utilisateurMail
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurMail;

	/**	<br/> L'entité utilisateurMail
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurMail">Trouver l'entité utilisateurMail dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurMail(Couverture<String> c);

	public String getUtilisateurMail() {
		return utilisateurMail;
	}
	public void setUtilisateurMail(String o) {
		this.utilisateurMail = UtilisateurSite.staticSetUtilisateurMail(null, o);
	}
	public static String staticSetUtilisateurMail(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurMailInit() {
		Couverture<String> utilisateurMailCouverture = new Couverture<String>().var("utilisateurMail");
		if(utilisateurMail == null) {
			_utilisateurMail(utilisateurMailCouverture);
			setUtilisateurMail(utilisateurMailCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurMail(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurMail(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurMail(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurMail(requeteSite_, UtilisateurSite.staticSolrUtilisateurMail(requeteSite_, UtilisateurSite.staticSetUtilisateurMail(requeteSite_, o)));
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurPrenom">Trouver l'entité utilisateurPrenom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurPrenom(Couverture<String> c);

	public String getUtilisateurPrenom() {
		return utilisateurPrenom;
	}
	public void setUtilisateurPrenom(String o) {
		this.utilisateurPrenom = UtilisateurSite.staticSetUtilisateurPrenom(null, o);
	}
	public static String staticSetUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurPrenomInit() {
		Couverture<String> utilisateurPrenomCouverture = new Couverture<String>().var("utilisateurPrenom");
		if(utilisateurPrenom == null) {
			_utilisateurPrenom(utilisateurPrenomCouverture);
			setUtilisateurPrenom(utilisateurPrenomCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurPrenom(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurPrenom(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurPrenom(requeteSite_, UtilisateurSite.staticSolrUtilisateurPrenom(requeteSite_, UtilisateurSite.staticSetUtilisateurPrenom(requeteSite_, o)));
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNomFamille">Trouver l'entité utilisateurNomFamille dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNomFamille(Couverture<String> c);

	public String getUtilisateurNomFamille() {
		return utilisateurNomFamille;
	}
	public void setUtilisateurNomFamille(String o) {
		this.utilisateurNomFamille = UtilisateurSite.staticSetUtilisateurNomFamille(null, o);
	}
	public static String staticSetUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurNomFamilleInit() {
		Couverture<String> utilisateurNomFamilleCouverture = new Couverture<String>().var("utilisateurNomFamille");
		if(utilisateurNomFamille == null) {
			_utilisateurNomFamille(utilisateurNomFamilleCouverture);
			setUtilisateurNomFamille(utilisateurNomFamilleCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurNomFamille(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurNomFamille(requeteSite_, UtilisateurSite.staticSolrUtilisateurNomFamille(requeteSite_, UtilisateurSite.staticSetUtilisateurNomFamille(requeteSite_, o)));
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNomComplet">Trouver l'entité utilisateurNomComplet dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNomComplet(Couverture<String> c);

	public String getUtilisateurNomComplet() {
		return utilisateurNomComplet;
	}
	public void setUtilisateurNomComplet(String o) {
		this.utilisateurNomComplet = UtilisateurSite.staticSetUtilisateurNomComplet(null, o);
	}
	public static String staticSetUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurNomCompletInit() {
		Couverture<String> utilisateurNomCompletCouverture = new Couverture<String>().var("utilisateurNomComplet");
		if(utilisateurNomComplet == null) {
			_utilisateurNomComplet(utilisateurNomCompletCouverture);
			setUtilisateurNomComplet(utilisateurNomCompletCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurNomComplet(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurNomComplet(requeteSite_, UtilisateurSite.staticSolrUtilisateurNomComplet(requeteSite_, UtilisateurSite.staticSetUtilisateurNomComplet(requeteSite_, o)));
	}

	/////////////////////
	// utilisateurSite //
	/////////////////////

	/**	 L'entité utilisateurSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurSite;

	/**	<br/> L'entité utilisateurSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurSite">Trouver l'entité utilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSite(Couverture<String> c);

	public String getUtilisateurSite() {
		return utilisateurSite;
	}
	public void setUtilisateurSite(String o) {
		this.utilisateurSite = UtilisateurSite.staticSetUtilisateurSite(null, o);
	}
	public static String staticSetUtilisateurSite(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite utilisateurSiteInit() {
		Couverture<String> utilisateurSiteCouverture = new Couverture<String>().var("utilisateurSite");
		if(utilisateurSite == null) {
			_utilisateurSite(utilisateurSiteCouverture);
			setUtilisateurSite(utilisateurSiteCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurSite(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrUtilisateurSite(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurSite(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurSite(requeteSite_, UtilisateurSite.staticSolrUtilisateurSite(requeteSite_, UtilisateurSite.staticSetUtilisateurSite(requeteSite_, o)));
	}

	////////////////////////
	// customerProfileId1 //
	////////////////////////

	/**	 L'entité customerProfileId1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String customerProfileId1;

	/**	<br/> L'entité customerProfileId1
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:customerProfileId1">Trouver l'entité customerProfileId1 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _customerProfileId1(Couverture<String> c);

	public String getCustomerProfileId1() {
		return customerProfileId1;
	}
	public void setCustomerProfileId1(String o) {
		this.customerProfileId1 = UtilisateurSite.staticSetCustomerProfileId1(null, o);
	}
	public static String staticSetCustomerProfileId1(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected UtilisateurSite customerProfileId1Init() {
		Couverture<String> customerProfileId1Couverture = new Couverture<String>().var("customerProfileId1");
		if(customerProfileId1 == null) {
			_customerProfileId1(customerProfileId1Couverture);
			setCustomerProfileId1(customerProfileId1Couverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrCustomerProfileId1(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}

	public static String staticSolrStrCustomerProfileId1(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqCustomerProfileId1(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrCustomerProfileId1(requeteSite_, UtilisateurSite.staticSolrCustomerProfileId1(requeteSite_, UtilisateurSite.staticSetCustomerProfileId1(requeteSite_, o)));
	}

	//////////////////////////////////
	// utilisateurRecevoirCourriels //
	//////////////////////////////////

	/**	 L'entité utilisateurRecevoirCourriels
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean utilisateurRecevoirCourriels;

	/**	<br/> L'entité utilisateurRecevoirCourriels
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurRecevoirCourriels">Trouver l'entité utilisateurRecevoirCourriels dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurRecevoirCourriels(Couverture<Boolean> c);

	public Boolean getUtilisateurRecevoirCourriels() {
		return utilisateurRecevoirCourriels;
	}

	public void setUtilisateurRecevoirCourriels(Boolean utilisateurRecevoirCourriels) {
		this.utilisateurRecevoirCourriels = utilisateurRecevoirCourriels;
	}
	@JsonIgnore
	public void setUtilisateurRecevoirCourriels(String o) {
		this.utilisateurRecevoirCourriels = UtilisateurSite.staticSetUtilisateurRecevoirCourriels(null, o);
	}
	public static Boolean staticSetUtilisateurRecevoirCourriels(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected UtilisateurSite utilisateurRecevoirCourrielsInit() {
		Couverture<Boolean> utilisateurRecevoirCourrielsCouverture = new Couverture<Boolean>().var("utilisateurRecevoirCourriels");
		if(utilisateurRecevoirCourriels == null) {
			_utilisateurRecevoirCourriels(utilisateurRecevoirCourrielsCouverture);
			setUtilisateurRecevoirCourriels(utilisateurRecevoirCourrielsCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrUtilisateurRecevoirCourriels(RequeteSiteFrFR requeteSite_, Boolean o) {
		return null;
	}

	public static String staticSolrStrUtilisateurRecevoirCourriels(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqUtilisateurRecevoirCourriels(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrUtilisateurRecevoirCourriels(requeteSite_, UtilisateurSite.staticSolrUtilisateurRecevoirCourriels(requeteSite_, UtilisateurSite.staticSetUtilisateurRecevoirCourriels(requeteSite_, o)));
	}

	/////////////////
	// voirArchive //
	/////////////////

	/**	 L'entité voirArchive
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean voirArchive;

	/**	<br/> L'entité voirArchive
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:voirArchive">Trouver l'entité voirArchive dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _voirArchive(Couverture<Boolean> c);

	public Boolean getVoirArchive() {
		return voirArchive;
	}

	public void setVoirArchive(Boolean voirArchive) {
		this.voirArchive = voirArchive;
	}
	@JsonIgnore
	public void setVoirArchive(String o) {
		this.voirArchive = UtilisateurSite.staticSetVoirArchive(null, o);
	}
	public static Boolean staticSetVoirArchive(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected UtilisateurSite voirArchiveInit() {
		Couverture<Boolean> voirArchiveCouverture = new Couverture<Boolean>().var("voirArchive");
		if(voirArchive == null) {
			_voirArchive(voirArchiveCouverture);
			setVoirArchive(voirArchiveCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrVoirArchive(RequeteSiteFrFR requeteSite_, Boolean o) {
		return null;
	}

	public static String staticSolrStrVoirArchive(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqVoirArchive(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrVoirArchive(requeteSite_, UtilisateurSite.staticSolrVoirArchive(requeteSite_, UtilisateurSite.staticSetVoirArchive(requeteSite_, o)));
	}

	//////////////////
	// voirSupprime //
	//////////////////

	/**	 L'entité voirSupprime
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean voirSupprime;

	/**	<br/> L'entité voirSupprime
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:voirSupprime">Trouver l'entité voirSupprime dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _voirSupprime(Couverture<Boolean> c);

	public Boolean getVoirSupprime() {
		return voirSupprime;
	}

	public void setVoirSupprime(Boolean voirSupprime) {
		this.voirSupprime = voirSupprime;
	}
	@JsonIgnore
	public void setVoirSupprime(String o) {
		this.voirSupprime = UtilisateurSite.staticSetVoirSupprime(null, o);
	}
	public static Boolean staticSetVoirSupprime(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected UtilisateurSite voirSupprimeInit() {
		Couverture<Boolean> voirSupprimeCouverture = new Couverture<Boolean>().var("voirSupprime");
		if(voirSupprime == null) {
			_voirSupprime(voirSupprimeCouverture);
			setVoirSupprime(voirSupprimeCouverture.o);
		}
		return (UtilisateurSite)this;
	}

	public static Object staticSolrVoirSupprime(RequeteSiteFrFR requeteSite_, Boolean o) {
		return null;
	}

	public static String staticSolrStrVoirSupprime(RequeteSiteFrFR requeteSite_, Object o) {
		return null;
	}

	public static String staticSolrFqVoirSupprime(RequeteSiteFrFR requeteSite_, String o) {
		return UtilisateurSite.staticSolrStrVoirSupprime(requeteSite_, UtilisateurSite.staticSolrVoirSupprime(requeteSite_, UtilisateurSite.staticSetVoirSupprime(requeteSite_, o)));
	}

	//////////////
	// initLoin //
	//////////////

	public Future<Void> promesseLoinUtilisateurSite(RequeteSiteFrFR requeteSite_) {
		return promesseLoinUtilisateurSite();
	}

	public Future<Void> promesseLoinUtilisateurSite() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promesseUtilisateurSite(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promesseUtilisateurSite(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				utilisateurClesInit();
				paiementClesInit();
				utilisateurNomInit();
				utilisateurMailInit();
				utilisateurPrenomInit();
				utilisateurNomFamilleInit();
				utilisateurNomCompletInit();
				utilisateurSiteInit();
				customerProfileId1Init();
				utilisateurRecevoirCourrielsInit();
				voirArchiveInit();
				voirSupprimeInit();
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

	public Future<Void> promesseLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		return promesseLoinUtilisateurSite(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirUtilisateurSite(v);
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
	public Object obtenirUtilisateurSite(String var) {
		UtilisateurSite oUtilisateurSite = (UtilisateurSite)this;
		switch(var) {
			case "utilisateurCles":
				return oUtilisateurSite.utilisateurCles;
			case "paiementCles":
				return oUtilisateurSite.paiementCles;
			case "utilisateurNom":
				return oUtilisateurSite.utilisateurNom;
			case "utilisateurMail":
				return oUtilisateurSite.utilisateurMail;
			case "utilisateurPrenom":
				return oUtilisateurSite.utilisateurPrenom;
			case "utilisateurNomFamille":
				return oUtilisateurSite.utilisateurNomFamille;
			case "utilisateurNomComplet":
				return oUtilisateurSite.utilisateurNomComplet;
			case "utilisateurSite":
				return oUtilisateurSite.utilisateurSite;
			case "customerProfileId1":
				return oUtilisateurSite.customerProfileId1;
			case "utilisateurRecevoirCourriels":
				return oUtilisateurSite.utilisateurRecevoirCourriels;
			case "voirArchive":
				return oUtilisateurSite.voirArchive;
			case "voirSupprime":
				return oUtilisateurSite.voirSupprime;
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
				o = attribuerUtilisateurSite(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerUtilisateurSite(String var, Object val) {
		UtilisateurSite oUtilisateurSite = (UtilisateurSite)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSetUtilisateurSite(entiteVar,  requeteSite_, o);
	}
	public static Object staticSetUtilisateurSite(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "utilisateurCles":
			return UtilisateurSite.staticSetUtilisateurCles(requeteSite_, o);
		case "paiementCles":
			return UtilisateurSite.staticSetPaiementCles(requeteSite_, o);
		case "utilisateurNom":
			return UtilisateurSite.staticSetUtilisateurNom(requeteSite_, o);
		case "utilisateurMail":
			return UtilisateurSite.staticSetUtilisateurMail(requeteSite_, o);
		case "utilisateurPrenom":
			return UtilisateurSite.staticSetUtilisateurPrenom(requeteSite_, o);
		case "utilisateurNomFamille":
			return UtilisateurSite.staticSetUtilisateurNomFamille(requeteSite_, o);
		case "utilisateurNomComplet":
			return UtilisateurSite.staticSetUtilisateurNomComplet(requeteSite_, o);
		case "utilisateurSite":
			return UtilisateurSite.staticSetUtilisateurSite(requeteSite_, o);
		case "customerProfileId1":
			return UtilisateurSite.staticSetCustomerProfileId1(requeteSite_, o);
		case "utilisateurRecevoirCourriels":
			return UtilisateurSite.staticSetUtilisateurRecevoirCourriels(requeteSite_, o);
		case "voirArchive":
			return UtilisateurSite.staticSetVoirArchive(requeteSite_, o);
		case "voirSupprime":
			return UtilisateurSite.staticSetVoirSupprime(requeteSite_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrUtilisateurSite(entiteVar,  requeteSite_, o);
	}
	public static Object staticSolrUtilisateurSite(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "utilisateurCles":
			return UtilisateurSite.staticSolrUtilisateurCles(requeteSite_, (Long)o);
		case "paiementCles":
			return UtilisateurSite.staticSolrPaiementCles(requeteSite_, (Long)o);
		case "utilisateurNom":
			return UtilisateurSite.staticSolrUtilisateurNom(requeteSite_, (String)o);
		case "utilisateurMail":
			return UtilisateurSite.staticSolrUtilisateurMail(requeteSite_, (String)o);
		case "utilisateurPrenom":
			return UtilisateurSite.staticSolrUtilisateurPrenom(requeteSite_, (String)o);
		case "utilisateurNomFamille":
			return UtilisateurSite.staticSolrUtilisateurNomFamille(requeteSite_, (String)o);
		case "utilisateurNomComplet":
			return UtilisateurSite.staticSolrUtilisateurNomComplet(requeteSite_, (String)o);
		case "utilisateurSite":
			return UtilisateurSite.staticSolrUtilisateurSite(requeteSite_, (String)o);
		case "customerProfileId1":
			return UtilisateurSite.staticSolrCustomerProfileId1(requeteSite_, (String)o);
		case "utilisateurRecevoirCourriels":
			return UtilisateurSite.staticSolrUtilisateurRecevoirCourriels(requeteSite_, (Boolean)o);
		case "voirArchive":
			return UtilisateurSite.staticSolrVoirArchive(requeteSite_, (Boolean)o);
		case "voirSupprime":
			return UtilisateurSite.staticSolrVoirSupprime(requeteSite_, (Boolean)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrStrUtilisateurSite(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrStrUtilisateurSite(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "utilisateurCles":
			return UtilisateurSite.staticSolrStrUtilisateurCles(requeteSite_, (Long)o);
		case "paiementCles":
			return UtilisateurSite.staticSolrStrPaiementCles(requeteSite_, (Long)o);
		case "utilisateurNom":
			return UtilisateurSite.staticSolrStrUtilisateurNom(requeteSite_, (String)o);
		case "utilisateurMail":
			return UtilisateurSite.staticSolrStrUtilisateurMail(requeteSite_, (String)o);
		case "utilisateurPrenom":
			return UtilisateurSite.staticSolrStrUtilisateurPrenom(requeteSite_, (String)o);
		case "utilisateurNomFamille":
			return UtilisateurSite.staticSolrStrUtilisateurNomFamille(requeteSite_, (String)o);
		case "utilisateurNomComplet":
			return UtilisateurSite.staticSolrStrUtilisateurNomComplet(requeteSite_, (String)o);
		case "utilisateurSite":
			return UtilisateurSite.staticSolrStrUtilisateurSite(requeteSite_, (String)o);
		case "customerProfileId1":
			return UtilisateurSite.staticSolrStrCustomerProfileId1(requeteSite_, (String)o);
		case "utilisateurRecevoirCourriels":
			return UtilisateurSite.staticSolrStrUtilisateurRecevoirCourriels(requeteSite_, (Boolean)o);
		case "voirArchive":
			return UtilisateurSite.staticSolrStrVoirArchive(requeteSite_, (Boolean)o);
		case "voirSupprime":
			return UtilisateurSite.staticSolrStrVoirSupprime(requeteSite_, (Boolean)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSolrFqUtilisateurSite(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrFqUtilisateurSite(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "utilisateurCles":
			return UtilisateurSite.staticSolrFqUtilisateurCles(requeteSite_, o);
		case "paiementCles":
			return UtilisateurSite.staticSolrFqPaiementCles(requeteSite_, o);
		case "utilisateurNom":
			return UtilisateurSite.staticSolrFqUtilisateurNom(requeteSite_, o);
		case "utilisateurMail":
			return UtilisateurSite.staticSolrFqUtilisateurMail(requeteSite_, o);
		case "utilisateurPrenom":
			return UtilisateurSite.staticSolrFqUtilisateurPrenom(requeteSite_, o);
		case "utilisateurNomFamille":
			return UtilisateurSite.staticSolrFqUtilisateurNomFamille(requeteSite_, o);
		case "utilisateurNomComplet":
			return UtilisateurSite.staticSolrFqUtilisateurNomComplet(requeteSite_, o);
		case "utilisateurSite":
			return UtilisateurSite.staticSolrFqUtilisateurSite(requeteSite_, o);
		case "customerProfileId1":
			return UtilisateurSite.staticSolrFqCustomerProfileId1(requeteSite_, o);
		case "utilisateurRecevoirCourriels":
			return UtilisateurSite.staticSolrFqUtilisateurRecevoirCourriels(requeteSite_, o);
		case "voirArchive":
			return UtilisateurSite.staticSolrFqVoirArchive(requeteSite_, o);
		case "voirSupprime":
			return UtilisateurSite.staticSolrFqVoirSupprime(requeteSite_, o);
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
					o = definirUtilisateurSite(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirUtilisateurSite(String var, Object val) {
		switch(var.toLowerCase()) {
			case "utilisateurnom":
				if(val instanceof String)
					setUtilisateurNom((String)val);
				sauvegardes.add("utilisateurNom");
				return val;
			case "utilisateurmail":
				if(val instanceof String)
					setUtilisateurMail((String)val);
				sauvegardes.add("utilisateurMail");
				return val;
			case "customerprofileid1":
				if(val instanceof String)
					setCustomerProfileId1((String)val);
				sauvegardes.add("customerProfileId1");
				return val;
			case "utilisateurrecevoircourriels":
				if(val instanceof Boolean)
					setUtilisateurRecevoirCourriels((Boolean)val);
				sauvegardes.add("utilisateurRecevoirCourriels");
				return val;
			case "voirarchive":
				if(val instanceof Boolean)
					setVoirArchive((Boolean)val);
				sauvegardes.add("voirArchive");
				return val;
			case "voirsupprime":
				if(val instanceof Boolean)
					setVoirSupprime((Boolean)val);
				sauvegardes.add("voirSupprime");
				return val;
			default:
				return null;
		}
	}

	/////////////
	// peupler //
	/////////////

	public void peuplerPourClasse(SolrDocument solrDocument) {
		peuplerUtilisateurSite(solrDocument);
	}
	public void peuplerUtilisateurSite(SolrDocument solrDocument) {
		UtilisateurSite oUtilisateurSite = (UtilisateurSite)this;
		sauvegardes = (List<String>)solrDocument.get("sauvegardes_indexedstored_strings");
		if(sauvegardes != null) {

			if(sauvegardes.contains("utilisateurCles")) {
				List<Long> utilisateurCles = (List<Long>)solrDocument.get("utilisateurCles_indexedstored_longs");
				if(utilisateurCles != null)
					oUtilisateurSite.utilisateurCles.addAll(utilisateurCles);
			}

			if(sauvegardes.contains("paiementCles")) {
				List<Long> paiementCles = (List<Long>)solrDocument.get("paiementCles_indexedstored_longs");
				if(paiementCles != null)
					oUtilisateurSite.paiementCles.addAll(paiementCles);
			}

			if(sauvegardes.contains("utilisateurNom")) {
				String utilisateurNom = (String)solrDocument.get("utilisateurNom_indexedstored_string");
				if(utilisateurNom != null)
					oUtilisateurSite.setUtilisateurNom(utilisateurNom);
			}

			if(sauvegardes.contains("utilisateurMail")) {
				String utilisateurMail = (String)solrDocument.get("utilisateurMail_indexedstored_string");
				if(utilisateurMail != null)
					oUtilisateurSite.setUtilisateurMail(utilisateurMail);
			}

			if(sauvegardes.contains("utilisateurPrenom")) {
				String utilisateurPrenom = (String)solrDocument.get("utilisateurPrenom_indexedstored_string");
				if(utilisateurPrenom != null)
					oUtilisateurSite.setUtilisateurPrenom(utilisateurPrenom);
			}

			if(sauvegardes.contains("utilisateurNomFamille")) {
				String utilisateurNomFamille = (String)solrDocument.get("utilisateurNomFamille_indexedstored_string");
				if(utilisateurNomFamille != null)
					oUtilisateurSite.setUtilisateurNomFamille(utilisateurNomFamille);
			}

			if(sauvegardes.contains("utilisateurNomComplet")) {
				String utilisateurNomComplet = (String)solrDocument.get("utilisateurNomComplet_indexedstored_string");
				if(utilisateurNomComplet != null)
					oUtilisateurSite.setUtilisateurNomComplet(utilisateurNomComplet);
			}

			if(sauvegardes.contains("utilisateurSite")) {
				String utilisateurSite = (String)solrDocument.get("utilisateurSite_indexedstored_string");
				if(utilisateurSite != null)
					oUtilisateurSite.setUtilisateurSite(utilisateurSite);
			}

			if(sauvegardes.contains("customerProfileId1")) {
				String customerProfileId1 = (String)solrDocument.get("customerProfileId1_indexedstored_string");
				if(customerProfileId1 != null)
					oUtilisateurSite.setCustomerProfileId1(customerProfileId1);
			}

			if(sauvegardes.contains("utilisateurRecevoirCourriels")) {
				Boolean utilisateurRecevoirCourriels = (Boolean)solrDocument.get("utilisateurRecevoirCourriels_indexedstored_boolean");
				if(utilisateurRecevoirCourriels != null)
					oUtilisateurSite.setUtilisateurRecevoirCourriels(utilisateurRecevoirCourriels);
			}

			if(sauvegardes.contains("voirArchive")) {
				Boolean voirArchive = (Boolean)solrDocument.get("voirArchive_indexedstored_boolean");
				if(voirArchive != null)
					oUtilisateurSite.setVoirArchive(voirArchive);
			}

			if(sauvegardes.contains("voirSupprime")) {
				Boolean voirSupprime = (Boolean)solrDocument.get("voirSupprime_indexedstored_boolean");
				if(voirSupprime != null)
					oUtilisateurSite.setVoirSupprime(voirSupprime);
			}
		}
	}

	public void indexerUtilisateurSite(SolrInputDocument document) {
		if(utilisateurCles != null) {
			for(java.lang.Long o : utilisateurCles) {
				document.addField("utilisateurCles_indexedstored_longs", o);
			}
		}
		if(paiementCles != null) {
			for(java.lang.Long o : paiementCles) {
				document.addField("paiementCles_indexedstored_longs", o);
			}
		}
		if(utilisateurNom != null) {
			document.addField("utilisateurNom_indexedstored_string", utilisateurNom);
		}
		if(utilisateurMail != null) {
			document.addField("utilisateurMail_indexedstored_string", utilisateurMail);
		}
		if(utilisateurPrenom != null) {
			document.addField("utilisateurPrenom_indexedstored_string", utilisateurPrenom);
		}
		if(utilisateurNomFamille != null) {
			document.addField("utilisateurNomFamille_indexedstored_string", utilisateurNomFamille);
		}
		if(utilisateurNomComplet != null) {
			document.addField("utilisateurNomComplet_indexedstored_string", utilisateurNomComplet);
		}
		if(utilisateurSite != null) {
			document.addField("utilisateurSite_indexedstored_string", utilisateurSite);
		}
		if(customerProfileId1 != null) {
			document.addField("customerProfileId1_indexedstored_string", customerProfileId1);
		}
		if(utilisateurRecevoirCourriels != null) {
			document.addField("utilisateurRecevoirCourriels_indexedstored_boolean", utilisateurRecevoirCourriels);
		}
		if(voirArchive != null) {
			document.addField("voirArchive_indexedstored_boolean", voirArchive);
		}
		if(voirSupprime != null) {
			document.addField("voirSupprime_indexedstored_boolean", voirSupprime);
		}
	}

	public static String varIndexeUtilisateurSite(String entiteVar) {
		switch(entiteVar) {
			case "utilisateurCles":
				return "utilisateurCles_indexedstored_longs";
			case "paiementCles":
				return "paiementCles_indexedstored_longs";
			case "utilisateurNom":
				return "utilisateurNom_indexedstored_string";
			case "utilisateurMail":
				return "utilisateurMail_indexedstored_string";
			case "utilisateurPrenom":
				return "utilisateurPrenom_indexedstored_string";
			case "utilisateurNomFamille":
				return "utilisateurNomFamille_indexedstored_string";
			case "utilisateurNomComplet":
				return "utilisateurNomComplet_indexedstored_string";
			case "utilisateurSite":
				return "utilisateurSite_indexedstored_string";
			case "customerProfileId1":
				return "customerProfileId1_indexedstored_string";
			case "utilisateurRecevoirCourriels":
				return "utilisateurRecevoirCourriels_indexedstored_boolean";
			case "voirArchive":
				return "voirArchive_indexedstored_boolean";
			case "voirSupprime":
				return "voirSupprime_indexedstored_boolean";
			default:
				return null;
		}
	}

	public static String varRechercheUtilisateurSite(String entiteVar) {
		switch(entiteVar) {
			default:
				return null;
		}
	}

	public static String varSuggereUtilisateurSite(String entiteVar) {
		switch(entiteVar) {
			default:
				return null;
		}
	}

	/////////////
	// stocker //
	/////////////

	public void stockerPourClasse(SolrDocument solrDocument) {
		stockerUtilisateurSite(solrDocument);
	}
	public void stockerUtilisateurSite(SolrDocument solrDocument) {
		UtilisateurSite oUtilisateurSite = (UtilisateurSite)this;

		Optional.ofNullable((List<?>)solrDocument.get("utilisateurCles_indexedstored_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oUtilisateurSite.addUtilisateurCles(v.toString());
		});
		Optional.ofNullable((List<?>)solrDocument.get("paiementCles_indexedstored_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oUtilisateurSite.addPaiementCles(v.toString());
		});
		oUtilisateurSite.setUtilisateurNom(Optional.ofNullable(solrDocument.get("utilisateurNom_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurMail(Optional.ofNullable(solrDocument.get("utilisateurMail_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurPrenom(Optional.ofNullable(solrDocument.get("utilisateurPrenom_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurNomFamille(Optional.ofNullable(solrDocument.get("utilisateurNomFamille_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurNomComplet(Optional.ofNullable(solrDocument.get("utilisateurNomComplet_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurSite(Optional.ofNullable(solrDocument.get("utilisateurSite_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setCustomerProfileId1(Optional.ofNullable(solrDocument.get("customerProfileId1_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setUtilisateurRecevoirCourriels(Optional.ofNullable(solrDocument.get("utilisateurRecevoirCourriels_indexedstored_boolean")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setVoirArchive(Optional.ofNullable(solrDocument.get("voirArchive_indexedstored_boolean")).map(v -> v.toString()).orElse(null));
		oUtilisateurSite.setVoirSupprime(Optional.ofNullable(solrDocument.get("voirSupprime_indexedstored_boolean")).map(v -> v.toString()).orElse(null));
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Optional.ofNullable(utilisateurCles).map(v -> "utilisateurCles: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(paiementCles).map(v -> "paiementCles: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(utilisateurNom).map(v -> "utilisateurNom: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurMail).map(v -> "utilisateurMail: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurPrenom).map(v -> "utilisateurPrenom: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurNomFamille).map(v -> "utilisateurNomFamille: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurNomComplet).map(v -> "utilisateurNomComplet: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurSite).map(v -> "utilisateurSite: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(customerProfileId1).map(v -> "customerProfileId1: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(utilisateurRecevoirCourriels).map(v -> "utilisateurRecevoirCourriels: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(voirArchive).map(v -> "voirArchive: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(voirSupprime).map(v -> "voirSupprime: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String VAR_utilisateurCles = "utilisateurCles";
	public static final String VAR_paiementCles = "paiementCles";
	public static final String VAR_utilisateurNom = "utilisateurNom";
	public static final String VAR_utilisateurMail = "utilisateurMail";
	public static final String VAR_utilisateurPrenom = "utilisateurPrenom";
	public static final String VAR_utilisateurNomFamille = "utilisateurNomFamille";
	public static final String VAR_utilisateurNomComplet = "utilisateurNomComplet";
	public static final String VAR_utilisateurSite = "utilisateurSite";
	public static final String VAR_customerProfileId1 = "customerProfileId1";
	public static final String VAR_utilisateurRecevoirCourriels = "utilisateurRecevoirCourriels";
	public static final String VAR_voirArchive = "voirArchive";
	public static final String VAR_voirSupprime = "voirSupprime";
}
