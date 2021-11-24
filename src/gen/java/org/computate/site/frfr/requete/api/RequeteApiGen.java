package org.computate.site.frfr.requete.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import java.time.ZonedDateTime;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Locale;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.ZoneOffset;
import java.lang.String;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;
import io.vertx.core.Future;
import org.computate.site.frfr.requete.api.RequeteApi;
import java.time.ZoneId;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import java.time.temporal.ChronoUnit;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true">Trouver la classe timeRemaining dans Solr. </a>
 * <br/>
 **/
public abstract class RequeteApiGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(RequeteApi.class);

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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
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
	protected RequeteApi requeteSite_Init() {
		Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().var("requeteSite_");
		if(requeteSite_ == null) {
			_requeteSite_(requeteSite_Couverture);
			setRequeteSite_(requeteSite_Couverture.o);
		}
		return (RequeteApi)this;
	}

	//////////
	// cree //
	//////////

	/**	 L'entité cree
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime cree;

	/**	<br/> L'entité cree
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cree">Trouver l'entité cree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cree(Couverture<ZonedDateTime> c);

	public ZonedDateTime getCree() {
		return cree;
	}

	public void setCree(ZonedDateTime cree) {
		this.cree = cree;
	}
	@JsonIgnore
	public void setCree(Instant o) {
		this.cree = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCree(String o) {
		this.cree = RequeteApi.staticSetCree(requeteSite_, o);
	}
	public static ZonedDateTime staticSetCree(RequeteSiteFrFR requeteSite_, String o) {
		if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(requeteSite_.getConfig().getString(ConfigCles.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setCree(Date o) {
		this.cree = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(requeteSite_.getConfig().getString(ConfigCles.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected RequeteApi creeInit() {
		Couverture<ZonedDateTime> creeCouverture = new Couverture<ZonedDateTime>().var("cree");
		if(cree == null) {
			_cree(creeCouverture);
			setCree(creeCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static Date staticSolrCree(RequeteSiteFrFR requeteSite_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSolrStrCree(RequeteSiteFrFR requeteSite_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSolrFqCree(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrCree(requeteSite_, RequeteApi.staticSolrCree(requeteSite_, RequeteApi.staticSetCree(requeteSite_, o)));
	}

	//////////
	// rows //
	//////////

	/**	 L'entité rows
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer rows;

	/**	<br/> L'entité rows
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:rows">Trouver l'entité rows dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _rows(Couverture<Integer> c);

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@JsonIgnore
	public void setRows(String o) {
		this.rows = RequeteApi.staticSetRows(requeteSite_, o);
	}
	public static Integer staticSetRows(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected RequeteApi rowsInit() {
		Couverture<Integer> rowsCouverture = new Couverture<Integer>().var("rows");
		if(rows == null) {
			_rows(rowsCouverture);
			setRows(rowsCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static Integer staticSolrRows(RequeteSiteFrFR requeteSite_, Integer o) {
		return o;
	}

	public static String staticSolrStrRows(RequeteSiteFrFR requeteSite_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqRows(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrRows(requeteSite_, RequeteApi.staticSolrRows(requeteSite_, RequeteApi.staticSetRows(requeteSite_, o)));
	}

	//////////////
	// numFound //
	//////////////

	/**	 L'entité numFound
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long numFound;

	/**	<br/> L'entité numFound
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:numFound">Trouver l'entité numFound dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _numFound(Couverture<Long> c);

	public Long getNumFound() {
		return numFound;
	}

	public void setNumFound(Long numFound) {
		this.numFound = numFound;
	}
	@JsonIgnore
	public void setNumFound(String o) {
		this.numFound = RequeteApi.staticSetNumFound(requeteSite_, o);
	}
	public static Long staticSetNumFound(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected RequeteApi numFoundInit() {
		Couverture<Long> numFoundCouverture = new Couverture<Long>().var("numFound");
		if(numFound == null) {
			_numFound(numFoundCouverture);
			setNumFound(numFoundCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static Long staticSolrNumFound(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrNumFound(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqNumFound(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrNumFound(requeteSite_, RequeteApi.staticSolrNumFound(requeteSite_, RequeteApi.staticSetNumFound(requeteSite_, o)));
	}

	//////////////
	// numPATCH //
	//////////////

	/**	 L'entité numPATCH
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long numPATCH;

	/**	<br/> L'entité numPATCH
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:numPATCH">Trouver l'entité numPATCH dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _numPATCH(Couverture<Long> c);

	public Long getNumPATCH() {
		return numPATCH;
	}

	public void setNumPATCH(Long numPATCH) {
		this.numPATCH = numPATCH;
	}
	@JsonIgnore
	public void setNumPATCH(String o) {
		this.numPATCH = RequeteApi.staticSetNumPATCH(requeteSite_, o);
	}
	public static Long staticSetNumPATCH(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected RequeteApi numPATCHInit() {
		Couverture<Long> numPATCHCouverture = new Couverture<Long>().var("numPATCH");
		if(numPATCH == null) {
			_numPATCH(numPATCHCouverture);
			setNumPATCH(numPATCHCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static Long staticSolrNumPATCH(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrNumPATCH(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqNumPATCH(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrNumPATCH(requeteSite_, RequeteApi.staticSolrNumPATCH(requeteSite_, RequeteApi.staticSetNumPATCH(requeteSite_, o)));
	}

	//////////
	// uuid //
	//////////

	/**	 L'entité uuid
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String uuid;

	/**	<br/> L'entité uuid
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:uuid">Trouver l'entité uuid dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _uuid(Couverture<String> c);

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String o) {
		this.uuid = RequeteApi.staticSetUuid(requeteSite_, o);
	}
	public static String staticSetUuid(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteApi uuidInit() {
		Couverture<String> uuidCouverture = new Couverture<String>().var("uuid");
		if(uuid == null) {
			_uuid(uuidCouverture);
			setUuid(uuidCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static String staticSolrUuid(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrUuid(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqUuid(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrUuid(requeteSite_, RequeteApi.staticSolrUuid(requeteSite_, RequeteApi.staticSetUuid(requeteSite_, o)));
	}

	////////
	// id //
	////////

	/**	 L'entité id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br/> L'entité id
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:id">Trouver l'entité id dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _id(Couverture<String> c);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = RequeteApi.staticSetId(requeteSite_, o);
	}
	public static String staticSetId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteApi idInit() {
		Couverture<String> idCouverture = new Couverture<String>().var("id");
		if(id == null) {
			_id(idCouverture);
			setId(idCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static String staticSolrId(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrId(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqId(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrId(requeteSite_, RequeteApi.staticSolrId(requeteSite_, RequeteApi.staticSetId(requeteSite_, o)));
	}

	////////
	// pk //
	////////

	/**	 L'entité pk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pk;

	/**	<br/> L'entité pk
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pk">Trouver l'entité pk dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pk(Couverture<Long> c);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}
	@JsonIgnore
	public void setPk(String o) {
		this.pk = RequeteApi.staticSetPk(requeteSite_, o);
	}
	public static Long staticSetPk(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected RequeteApi pkInit() {
		Couverture<Long> pkCouverture = new Couverture<Long>().var("pk");
		if(pk == null) {
			_pk(pkCouverture);
			setPk(pkCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static Long staticSolrPk(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrPk(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqPk(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrPk(requeteSite_, RequeteApi.staticSolrPk(requeteSite_, RequeteApi.staticSetPk(requeteSite_, o)));
	}

	//////////////
	// original //
	//////////////

	/**	 L'entité original
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected Object original;

	/**	<br/> L'entité original
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:original">Trouver l'entité original dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _original(Couverture<Object> c);

	public Object getOriginal() {
		return original;
	}

	public void setOriginal(Object original) {
		this.original = original;
	}
	public static Object staticSetOriginal(RequeteSiteFrFR requeteSite_, String o) {
		return null;
	}
	protected RequeteApi originalInit() {
		Couverture<Object> originalCouverture = new Couverture<Object>().var("original");
		if(original == null) {
			_original(originalCouverture);
			setOriginal(originalCouverture.o);
		}
		return (RequeteApi)this;
	}

	/////////
	// pks //
	/////////

	/**	 L'entité pks
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> pks = new ArrayList<Long>();

	/**	<br/> L'entité pks
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pks">Trouver l'entité pks dans Solr</a>
	 * <br/>
	 * @param pks est l'entité déjà construit. 
	 **/
	protected abstract void _pks(List<Long> c);

	public List<Long> getPks() {
		return pks;
	}

	public void setPks(List<Long> pks) {
		this.pks = pks;
	}
	@JsonIgnore
	public void setPks(String o) {
		Long l = RequeteApi.staticSetPks(requeteSite_, o);
		if(l != null)
			addPks(l);
	}
	public static Long staticSetPks(RequeteSiteFrFR requeteSite_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public RequeteApi addPks(Long...objets) {
		for(Long o : objets) {
			addPks(o);
		}
		return (RequeteApi)this;
	}
	public RequeteApi addPks(Long o) {
		if(o != null)
			this.pks.add(o);
		return (RequeteApi)this;
	}
	@JsonIgnore
	public void setPks(JsonArray objets) {
		pks.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addPks(o);
		}
	}
	public RequeteApi addPks(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addPks(p);
		}
		return (RequeteApi)this;
	}
	protected RequeteApi pksInit() {
		_pks(pks);
		return (RequeteApi)this;
	}

	public static Long staticSolrPks(RequeteSiteFrFR requeteSite_, Long o) {
		return o;
	}

	public static String staticSolrStrPks(RequeteSiteFrFR requeteSite_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqPks(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrPks(requeteSite_, RequeteApi.staticSolrPks(requeteSite_, RequeteApi.staticSetPks(requeteSite_, o)));
	}

	/////////////
	// classes //
	/////////////

	/**	 L'entité classes
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> classes = new ArrayList<String>();

	/**	<br/> L'entité classes
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:classes">Trouver l'entité classes dans Solr</a>
	 * <br/>
	 * @param classes est l'entité déjà construit. 
	 **/
	protected abstract void _classes(List<String> c);

	public List<String> getClasses() {
		return classes;
	}

	public void setClasses(List<String> classes) {
		this.classes = classes;
	}
	public static String staticSetClasses(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	public RequeteApi addClasses(String...objets) {
		for(String o : objets) {
			addClasses(o);
		}
		return (RequeteApi)this;
	}
	public RequeteApi addClasses(String o) {
		if(o != null)
			this.classes.add(o);
		return (RequeteApi)this;
	}
	@JsonIgnore
	public void setClasses(JsonArray objets) {
		classes.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClasses(o);
		}
	}
	protected RequeteApi classesInit() {
		_classes(classes);
		return (RequeteApi)this;
	}

	public static String staticSolrClasses(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrClasses(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqClasses(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrClasses(requeteSite_, RequeteApi.staticSolrClasses(requeteSite_, RequeteApi.staticSetClasses(requeteSite_, o)));
	}

	//////////
	// vars //
	//////////

	/**	 L'entité vars
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> vars = new ArrayList<String>();

	/**	<br/> L'entité vars
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:vars">Trouver l'entité vars dans Solr</a>
	 * <br/>
	 * @param vars est l'entité déjà construit. 
	 **/
	protected abstract void _vars(List<String> c);

	public List<String> getVars() {
		return vars;
	}

	public void setVars(List<String> vars) {
		this.vars = vars;
	}
	public static String staticSetVars(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	public RequeteApi addVars(String...objets) {
		for(String o : objets) {
			addVars(o);
		}
		return (RequeteApi)this;
	}
	public RequeteApi addVars(String o) {
		if(o != null)
			this.vars.add(o);
		return (RequeteApi)this;
	}
	@JsonIgnore
	public void setVars(JsonArray objets) {
		vars.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addVars(o);
		}
	}
	protected RequeteApi varsInit() {
		_vars(vars);
		return (RequeteApi)this;
	}

	public static String staticSolrVars(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrVars(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqVars(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrVars(requeteSite_, RequeteApi.staticSolrVars(requeteSite_, RequeteApi.staticSetVars(requeteSite_, o)));
	}

	///////////////////
	// timeRemaining //
	///////////////////

	/**	 L'entité timeRemaining
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String timeRemaining;

	/**	<br/> L'entité timeRemaining
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.requete.api.RequeteApi&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:timeRemaining">Trouver l'entité timeRemaining dans Solr</a>
	 * <br/>
	 * @param w est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _timeRemaining(Couverture<String> w);

	public String getTimeRemaining() {
		return timeRemaining;
	}
	public void setTimeRemaining(String o) {
		this.timeRemaining = RequeteApi.staticSetTimeRemaining(requeteSite_, o);
	}
	public static String staticSetTimeRemaining(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}
	protected RequeteApi timeRemainingInit() {
		Couverture<String> timeRemainingCouverture = new Couverture<String>().var("timeRemaining");
		if(timeRemaining == null) {
			_timeRemaining(timeRemainingCouverture);
			setTimeRemaining(timeRemainingCouverture.o);
		}
		return (RequeteApi)this;
	}

	public static String staticSolrTimeRemaining(RequeteSiteFrFR requeteSite_, String o) {
		return o;
	}

	public static String staticSolrStrTimeRemaining(RequeteSiteFrFR requeteSite_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqTimeRemaining(RequeteSiteFrFR requeteSite_, String o) {
		return RequeteApi.staticSolrStrTimeRemaining(requeteSite_, RequeteApi.staticSolrTimeRemaining(requeteSite_, RequeteApi.staticSetTimeRemaining(requeteSite_, o)));
	}

	//////////////
	// initLoin //
	//////////////

	public RequeteApi initLoinRequeteApi(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		initLoinRequeteApi();
		return (RequeteApi)this;
	}

	public void initLoinRequeteApi() {
		initRequeteApi();
	}

	public void initRequeteApi() {
				requeteSite_Init();
				creeInit();
				rowsInit();
				numFoundInit();
				numPATCHInit();
				uuidInit();
				idInit();
				pkInit();
				originalInit();
				pksInit();
				classesInit();
				varsInit();
				timeRemainingInit();
	}

	public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinRequeteApi(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteRequeteApi(RequeteSiteFrFR requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteRequeteApi(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirRequeteApi(v);
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
	public Object obtenirRequeteApi(String var) {
		RequeteApi oRequeteApi = (RequeteApi)this;
		switch(var) {
			case "requeteSite_":
				return oRequeteApi.requeteSite_;
			case "cree":
				return oRequeteApi.cree;
			case "rows":
				return oRequeteApi.rows;
			case "numFound":
				return oRequeteApi.numFound;
			case "numPATCH":
				return oRequeteApi.numPATCH;
			case "uuid":
				return oRequeteApi.uuid;
			case "id":
				return oRequeteApi.id;
			case "pk":
				return oRequeteApi.pk;
			case "original":
				return oRequeteApi.original;
			case "pks":
				return oRequeteApi.pks;
			case "classes":
				return oRequeteApi.classes;
			case "vars":
				return oRequeteApi.vars;
			case "timeRemaining":
				return oRequeteApi.timeRemaining;
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
				o = attribuerRequeteApi(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerRequeteApi(String var, Object val) {
		RequeteApi oRequeteApi = (RequeteApi)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSetRequeteApi(entiteVar,  requeteSite_, o);
	}
	public static Object staticSetRequeteApi(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "cree":
			return RequeteApi.staticSetCree(requeteSite_, o);
		case "rows":
			return RequeteApi.staticSetRows(requeteSite_, o);
		case "numFound":
			return RequeteApi.staticSetNumFound(requeteSite_, o);
		case "numPATCH":
			return RequeteApi.staticSetNumPATCH(requeteSite_, o);
		case "uuid":
			return RequeteApi.staticSetUuid(requeteSite_, o);
		case "id":
			return RequeteApi.staticSetId(requeteSite_, o);
		case "pk":
			return RequeteApi.staticSetPk(requeteSite_, o);
		case "pks":
			return RequeteApi.staticSetPks(requeteSite_, o);
		case "classes":
			return RequeteApi.staticSetClasses(requeteSite_, o);
		case "vars":
			return RequeteApi.staticSetVars(requeteSite_, o);
		case "timeRemaining":
			return RequeteApi.staticSetTimeRemaining(requeteSite_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrRequeteApi(entiteVar,  requeteSite_, o);
	}
	public static Object staticSolrRequeteApi(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "cree":
			return RequeteApi.staticSolrCree(requeteSite_, (ZonedDateTime)o);
		case "rows":
			return RequeteApi.staticSolrRows(requeteSite_, (Integer)o);
		case "numFound":
			return RequeteApi.staticSolrNumFound(requeteSite_, (Long)o);
		case "numPATCH":
			return RequeteApi.staticSolrNumPATCH(requeteSite_, (Long)o);
		case "uuid":
			return RequeteApi.staticSolrUuid(requeteSite_, (String)o);
		case "id":
			return RequeteApi.staticSolrId(requeteSite_, (String)o);
		case "pk":
			return RequeteApi.staticSolrPk(requeteSite_, (Long)o);
		case "pks":
			return RequeteApi.staticSolrPks(requeteSite_, (Long)o);
		case "classes":
			return RequeteApi.staticSolrClasses(requeteSite_, (String)o);
		case "vars":
			return RequeteApi.staticSolrVars(requeteSite_, (String)o);
		case "timeRemaining":
			return RequeteApi.staticSolrTimeRemaining(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrStrRequeteApi(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrStrRequeteApi(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
		case "cree":
			return RequeteApi.staticSolrStrCree(requeteSite_, (Date)o);
		case "rows":
			return RequeteApi.staticSolrStrRows(requeteSite_, (Integer)o);
		case "numFound":
			return RequeteApi.staticSolrStrNumFound(requeteSite_, (Long)o);
		case "numPATCH":
			return RequeteApi.staticSolrStrNumPATCH(requeteSite_, (Long)o);
		case "uuid":
			return RequeteApi.staticSolrStrUuid(requeteSite_, (String)o);
		case "id":
			return RequeteApi.staticSolrStrId(requeteSite_, (String)o);
		case "pk":
			return RequeteApi.staticSolrStrPk(requeteSite_, (Long)o);
		case "pks":
			return RequeteApi.staticSolrStrPks(requeteSite_, (Long)o);
		case "classes":
			return RequeteApi.staticSolrStrClasses(requeteSite_, (String)o);
		case "vars":
			return RequeteApi.staticSolrStrVars(requeteSite_, (String)o);
		case "timeRemaining":
			return RequeteApi.staticSolrStrTimeRemaining(requeteSite_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSolrFqRequeteApi(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrFqRequeteApi(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
		case "cree":
			return RequeteApi.staticSolrFqCree(requeteSite_, o);
		case "rows":
			return RequeteApi.staticSolrFqRows(requeteSite_, o);
		case "numFound":
			return RequeteApi.staticSolrFqNumFound(requeteSite_, o);
		case "numPATCH":
			return RequeteApi.staticSolrFqNumPATCH(requeteSite_, o);
		case "uuid":
			return RequeteApi.staticSolrFqUuid(requeteSite_, o);
		case "id":
			return RequeteApi.staticSolrFqId(requeteSite_, o);
		case "pk":
			return RequeteApi.staticSolrFqPk(requeteSite_, o);
		case "pks":
			return RequeteApi.staticSolrFqPks(requeteSite_, o);
		case "classes":
			return RequeteApi.staticSolrFqClasses(requeteSite_, o);
		case "vars":
			return RequeteApi.staticSolrFqVars(requeteSite_, o);
		case "timeRemaining":
			return RequeteApi.staticSolrFqTimeRemaining(requeteSite_, o);
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
					o = definirRequeteApi(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirRequeteApi(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiRequeteApi() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof RequeteApi) {
			RequeteApi original = (RequeteApi)o;
			if(!Objects.equals(cree, original.getCree()))
				requeteApi.addVars("cree");
			if(!Objects.equals(rows, original.getRows()))
				requeteApi.addVars("rows");
			if(!Objects.equals(numFound, original.getNumFound()))
				requeteApi.addVars("numFound");
			if(!Objects.equals(numPATCH, original.getNumPATCH()))
				requeteApi.addVars("numPATCH");
			if(!Objects.equals(uuid, original.getUuid()))
				requeteApi.addVars("uuid");
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Optional.ofNullable(cree).map(v -> "cree: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(rows).map(v -> "rows: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(numFound).map(v -> "numFound: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(numPATCH).map(v -> "numPATCH: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(uuid).map(v -> "uuid: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String VAR_requeteSite_ = "requeteSite_";
	public static final String VAR_cree = "cree";
	public static final String VAR_rows = "rows";
	public static final String VAR_numFound = "numFound";
	public static final String VAR_numPATCH = "numPATCH";
	public static final String VAR_uuid = "uuid";
	public static final String VAR_id = "id";
	public static final String VAR_pk = "pk";
	public static final String VAR_original = "original";
	public static final String VAR_pks = "pks";
	public static final String VAR_classes = "classes";
	public static final String VAR_vars = "vars";
	public static final String VAR_timeRemaining = "timeRemaining";
}
