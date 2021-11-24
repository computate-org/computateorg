package org.computate.site.frfr.recherche;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import org.apache.solr.client.solrj.response.QueryResponse;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Class;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true">Trouver la classe first dans Solr. </a>
 * <br/>
 **/
public abstract class ListeRechercheGen<DEV> {
	protected static final Logger LOG = LoggerFactory.getLogger(ListeRecherche.class);

	///////
	// c //
	///////

	/**	 L'entité c
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Class<DEV> c;

	/**	<br/> L'entité c
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c">Trouver l'entité c dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c(Couverture<Class<DEV>> c);

	public Class<DEV> getC() {
		return c;
	}

	public void setC(Class<DEV> c) {
		this.c = c;
	}
	protected ListeRecherche cInit() {
		Couverture<Class<DEV>> cCouverture = new Couverture<Class<DEV>>().var("c");
		if(c == null) {
			_c(cCouverture);
			setC(cCouverture.o);
		}
		return (ListeRecherche)this;
	}

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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
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
	protected ListeRecherche requeteSite_Init() {
		Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().var("requeteSite_");
		if(requeteSite_ == null) {
			_requeteSite_(requeteSite_Couverture);
			setRequeteSite_(requeteSite_Couverture.o);
		}
		return (ListeRecherche)this;
	}

	/////////////
	// stocker //
	/////////////

	/**	 L'entité stocker
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean stocker;

	/**	<br/> L'entité stocker
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:stocker">Trouver l'entité stocker dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _stocker(Couverture<Boolean> c);

	public Boolean getStocker() {
		return stocker;
	}

	public void setStocker(Boolean stocker) {
		this.stocker = stocker;
	}
	@JsonIgnore
	public void setStocker(String o) {
		this.stocker = ListeRecherche.staticSetStocker(requeteSite_, o);
	}
	public static Boolean staticSetStocker(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected ListeRecherche stockerInit() {
		Couverture<Boolean> stockerCouverture = new Couverture<Boolean>().var("stocker");
		if(stocker == null) {
			_stocker(stockerCouverture);
			setStocker(stockerCouverture.o);
		}
		return (ListeRecherche)this;
	}

	public static Boolean staticSolrStocker(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o;
	}

	public static String staticSolrStrStocker(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqStocker(RequeteSiteFrFR requeteSite_, String o) {
		return ListeRecherche.staticSolrStrStocker(requeteSite_, ListeRecherche.staticSolrStocker(requeteSite_, ListeRecherche.staticSetStocker(requeteSite_, o)));
	}

	/////////////
	// peupler //
	/////////////

	/**	 L'entité peupler
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean peupler;

	/**	<br/> L'entité peupler
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:peupler">Trouver l'entité peupler dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _peupler(Couverture<Boolean> c);

	public Boolean getPeupler() {
		return peupler;
	}

	public void setPeupler(Boolean peupler) {
		this.peupler = peupler;
	}
	@JsonIgnore
	public void setPeupler(String o) {
		this.peupler = ListeRecherche.staticSetPeupler(requeteSite_, o);
	}
	public static Boolean staticSetPeupler(RequeteSiteFrFR requeteSite_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected ListeRecherche peuplerInit() {
		Couverture<Boolean> peuplerCouverture = new Couverture<Boolean>().var("peupler");
		if(peupler == null) {
			_peupler(peuplerCouverture);
			setPeupler(peuplerCouverture.o);
		}
		return (ListeRecherche)this;
	}

	public static Boolean staticSolrPeupler(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o;
	}

	public static String staticSolrStrPeupler(RequeteSiteFrFR requeteSite_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqPeupler(RequeteSiteFrFR requeteSite_, String o) {
		return ListeRecherche.staticSolrStrPeupler(requeteSite_, ListeRecherche.staticSolrPeupler(requeteSite_, ListeRecherche.staticSetPeupler(requeteSite_, o)));
	}

	////////////
	// fields //
	////////////

	/**	 L'entité fields
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> fields = new ArrayList<String>();

	/**	<br/> L'entité fields
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fields">Trouver l'entité fields dans Solr</a>
	 * <br/>
	 * @param fields est l'entité déjà construit. 
	 **/
	protected abstract void _fields(List<String> c);

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public static String staticSetFields(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	public ListeRecherche addFields(String...objets) {
		for(String o : objets) {
			addFields(o);
		}
		return (ListeRecherche)this;
	}
	public ListeRecherche addFields(String o) {
		if(o != null)
			this.fields.add(o);
		return (ListeRecherche)this;
	}
	@JsonIgnore
	public void setFields(JsonArray objets) {
		fields.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addFields(o);
		}
	}
	protected ListeRecherche fieldsInit() {
		_fields(fields);
		return (ListeRecherche)this;
	}

	public static String staticSolrFields(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrFields(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFields(RequeteSiteFrFR requeteSite_, String o) {
		return ListeRecherche.staticSolrStrFields(requeteSite_, ListeRecherche.staticSolrFields(requeteSite_, ListeRecherche.staticSetFields(requeteSite_, o)));
	}

	///////////////
	// solrQuery //
	///////////////

	/**	 L'entité solrQuery
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut SolrQuery(). 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SolrQuery solrQuery = new SolrQuery();

	/**	<br/> L'entité solrQuery
	 * Il est construit avant d'être initialisé avec le constructeur par défaut SolrQuery(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:solrQuery">Trouver l'entité solrQuery dans Solr</a>
	 * <br/>
	 * @param solrQuery est l'entité déjà construit. 
	 **/
	protected abstract void _solrQuery(SolrQuery o);

	public SolrQuery getSolrQuery() {
		return solrQuery;
	}

	public void setSolrQuery(SolrQuery solrQuery) {
		this.solrQuery = solrQuery;
	}
	public static SolrQuery staticSetSolrQuery(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected ListeRecherche solrQueryInit() {
		_solrQuery(solrQuery);
		return (ListeRecherche)this;
	}

	///////////////////
	// queryResponse //
	///////////////////

	/**	 L'entité queryResponse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected QueryResponse queryResponse;

	/**	<br/> L'entité queryResponse
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:queryResponse">Trouver l'entité queryResponse dans Solr</a>
	 * <br/>
	 * @param promise est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _queryResponse(Promise<QueryResponse> promise);

	public QueryResponse getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(QueryResponse queryResponse) {
		this.queryResponse = queryResponse;
	}
	public static QueryResponse staticSetQueryResponse(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected Future<QueryResponse> queryResponsePromesse() {
		Promise<QueryResponse> promise = Promise.promise();
		Promise<QueryResponse> promise2 = Promise.promise();
		_queryResponse(promise2);
		promise2.future().onSuccess(o -> {
			setQueryResponse(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	//////////////////////
	// solrDocumentList //
	//////////////////////

	/**	 L'entité solrDocumentList
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SolrDocumentList solrDocumentList;

	/**	<br/> L'entité solrDocumentList
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:solrDocumentList">Trouver l'entité solrDocumentList dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _solrDocumentList(Couverture<SolrDocumentList> c);

	public SolrDocumentList getSolrDocumentList() {
		return solrDocumentList;
	}

	public void setSolrDocumentList(SolrDocumentList solrDocumentList) {
		this.solrDocumentList = solrDocumentList;
	}
	public static SolrDocumentList staticSetSolrDocumentList(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected ListeRecherche solrDocumentListInit() {
		Couverture<SolrDocumentList> solrDocumentListCouverture = new Couverture<SolrDocumentList>().var("solrDocumentList");
		if(solrDocumentList == null) {
			_solrDocumentList(solrDocumentListCouverture);
			setSolrDocumentList(solrDocumentListCouverture.o);
		}
		return (ListeRecherche)this;
	}

	//////////
	// list //
	//////////

	/**	 L'entité list
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<DEV>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<DEV> list = new ArrayList<DEV>();

	/**	<br/> L'entité list
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<DEV>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:list">Trouver l'entité list dans Solr</a>
	 * <br/>
	 * @param list est l'entité déjà construit. 
	 **/
	protected abstract void _list(List<DEV> l);

	public List<DEV> getList() {
		return list;
	}

	public void setList(List<DEV> list) {
		this.list = list;
	}
	public ListeRecherche addList(DEV...objets) {
		for(DEV o : objets) {
			addList(o);
		}
		return (ListeRecherche)this;
	}
	public ListeRecherche addList(DEV o) {
		if(o != null)
			this.list.add(o);
		return (ListeRecherche)this;
	}
	protected ListeRecherche listInit() {
		_list(list);
		return (ListeRecherche)this;
	}

	///////////
	// first //
	///////////

	/**	 L'entité first
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Object first;

	/**	<br/> L'entité first
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recherche.ListeRecherche&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:first">Trouver l'entité first dans Solr</a>
	 * <br/>
	 * @param w est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _first(Couverture<Object> w);

	public Object getFirst() {
		return first;
	}

	public void setFirst(Object first) {
		this.first = first;
	}
	public static Object staticSetFirst(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected ListeRecherche firstInit() {
		Couverture<Object> firstCouverture = new Couverture<Object>().var("first");
		if(first == null) {
			_first(firstCouverture);
			setFirst(firstCouverture.o);
		}
		return (ListeRecherche)this;
	}

	//////////////
	// initLoin //
	//////////////

	public Future<Void> promesseLoinListeRecherche(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		return promesseLoinListeRecherche();
	}

	public Future<Void> promesseLoinListeRecherche() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promesseListeRecherche(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promesseListeRecherche(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				cInit();
				requeteSite_Init();
				stockerInit();
				peuplerInit();
				fieldsInit();
				solrQueryInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			queryResponsePromesse().onSuccess(queryResponse -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				solrDocumentListInit();
				listInit();
				firstInit();
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
		return promesseLoinListeRecherche(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteListeRecherche(RequeteSiteFrFR requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteListeRecherche(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirListeRecherche(v);
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
	public Object obtenirListeRecherche(String var) {
		ListeRecherche oListeRecherche = (ListeRecherche)this;
		switch(var) {
			case "c":
				return oListeRecherche.c;
			case "requeteSite_":
				return oListeRecherche.requeteSite_;
			case "stocker":
				return oListeRecherche.stocker;
			case "peupler":
				return oListeRecherche.peupler;
			case "fields":
				return oListeRecherche.fields;
			case "solrQuery":
				return oListeRecherche.solrQuery;
			case "queryResponse":
				return oListeRecherche.queryResponse;
			case "solrDocumentList":
				return oListeRecherche.solrDocumentList;
			case "list":
				return oListeRecherche.list;
			case "first":
				return oListeRecherche.first;
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
				o = attribuerListeRecherche(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerListeRecherche(String var, Object val) {
		ListeRecherche oListeRecherche = (ListeRecherche)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSetListeRecherche(entiteVar,  requeteSite_, o);
	}
	public static Object staticSetListeRecherche(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "stocker":
			return ListeRecherche.staticSetStocker(requeteSite_, o);
		case "peupler":
			return ListeRecherche.staticSetPeupler(requeteSite_, o);
		case "fields":
			return ListeRecherche.staticSetFields(requeteSite_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrListeRecherche(entiteVar,  requeteSite_, o);
	}
	public static Object staticSolrListeRecherche(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "stocker":
			return ListeRecherche.staticSolrStocker(requeteSite_, (Boolean)o);
		case "peupler":
			return ListeRecherche.staticSolrPeupler(requeteSite_, (Boolean)o);
		case "fields":
			return ListeRecherche.staticSolrFields(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrStrListeRecherche(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrStrListeRecherche(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "stocker":
			return ListeRecherche.staticSolrStrStocker(requeteSite_, (Boolean)o);
		case "peupler":
			return ListeRecherche.staticSolrStrPeupler(requeteSite_, (Boolean)o);
		case "fields":
			return ListeRecherche.staticSolrStrFields(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSolrFqListeRecherche(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrFqListeRecherche(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "stocker":
			return ListeRecherche.staticSolrFqStocker(requeteSite_, o);
		case "peupler":
			return ListeRecherche.staticSolrFqPeupler(requeteSite_, o);
		case "fields":
			return ListeRecherche.staticSolrFqFields(requeteSite_, o);
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
					o = definirListeRecherche(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirListeRecherche(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiListeRecherche() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof ListeRecherche) {
			ListeRecherche original = (ListeRecherche)o;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String VAR_c = "c";
	public static final String VAR_requeteSite_ = "requeteSite_";
	public static final String VAR_stocker = "stocker";
	public static final String VAR_peupler = "peupler";
	public static final String VAR_fields = "fields";
	public static final String VAR_solrQuery = "solrQuery";
	public static final String VAR_queryResponse = "queryResponse";
	public static final String VAR_solrDocumentList = "solrDocumentList";
	public static final String VAR_list = "list";
	public static final String VAR_first = "first";
}
