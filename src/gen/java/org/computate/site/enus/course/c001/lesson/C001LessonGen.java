package org.computate.site.enus.course.c001.lesson;

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
import org.computate.site.enus.course.c001.C001;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import java.lang.String;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.article.Article;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <h1>TODO: </h1>
 * <ol>
 * <li>You should add a class comment "ApiUri.enUS: /api/..." to specify the base URL for C001Lesson objects in the RESTful API. 
 * The OpenAPI spec and code to handle API requests to this base URL will then be automatically generated. 
 * </li>
 * <li>You should add a class comment <b>"ApiTag.enUS: ..."</b> to specify a group name for C001Lesson objects in the OpenAPI specification. 
 * It can be as simple as "ApiTag.enUS: C001Lesson". 
 * The OpenAPI spec for this tag can then be automatically generated. 
 * </li>
 * </ol>
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class C001LessonGen into the class C001Lesson. 
 * </li>
 * <li>You can add a class comment "Model: true" if you wish to persist these C001Lesson objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the C001LessonGen data in the database will then be automatically generated. 
 * </li>
 * <li>You can add a class comment "Rows: 100" if you wish the C001Lesson API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * </ol>
 * <h1>About the C001Lesson class and it's generated class C001LessonGen&lt;C001&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001Lesson">Find the class C001Lesson in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.site.enus.course.c001.lesson.C001LessonPage. 
 * </p>
 * <p>This class contains a comment <b>"SuperPage.enUS: C001Page"</b>, which identifies the Java super class of the page code by it's class simple name "C001Page". 
 * This means that the newly created class org.computate.site.enus.course.c001.lesson.C001LessonPage extends org.computate.site.enus.course.c001.C001Page. 
 * </p>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>
 * Delete the class C001Lesson in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001Lesson&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.course.c001.lesson in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001.lesson&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class C001LessonGen<DEV> extends C001 {
	protected static final Logger LOG = LoggerFactory.getLogger(C001Lesson.class);

	public static final String C001Lesson_ApiUriSearchPage_enUS = "/enUS/course/001/lessons";
	public static final String SearchPage_enUS_Uri = "/enUS/course/001/lessons";
	public static final String SearchPage_enUS_ImageUri = "/png/enUS/course/001/lessons-999.png";


	///////////////
	// leconCree //
	///////////////

	/**	 The entity leconCree
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime leconCree;

	/**	<br> The entity leconCree
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001Lesson&fq=entiteVar_enUS_indexed_string:leconCree">Find the entity leconCree in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _leconCree(Wrap<ZonedDateTime> c);

	public ZonedDateTime getLeconCree() {
		return leconCree;
	}

	public void setLeconCree(ZonedDateTime leconCree) {
		this.leconCree = leconCree;
	}
	@JsonIgnore
	public void setLeconCree(Instant o) {
		this.leconCree = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setLeconCree(String o) {
		this.leconCree = C001Lesson.staticSetLeconCree(siteRequest_, o);
	}
	public static ZonedDateTime staticSetLeconCree(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(Optional.ofNullable(siteRequest_).map(r -> r.getConfig()).map(config -> config.getString(ConfigKeys.SITE_ZONE)).map(z -> ZoneId.of(z)).orElse(ZoneId.of("UTC"))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setLeconCree(Date o) {
		this.leconCree = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected C001Lesson leconCreeInit() {
		Wrap<ZonedDateTime> leconCreeWrap = new Wrap<ZonedDateTime>().var("leconCree");
		if(leconCree == null) {
			_leconCree(leconCreeWrap);
			setLeconCree(leconCreeWrap.o);
		}
		return (C001Lesson)this;
	}

	public static Date staticSearchLeconCree(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrLeconCree(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqLeconCree(SiteRequestEnUS siteRequest_, String o) {
		return C001Lesson.staticSearchStrLeconCree(siteRequest_, C001Lesson.staticSearchLeconCree(siteRequest_, C001Lesson.staticSetLeconCree(siteRequest_, o)));
	}

	/////////////////
	// leconsACote //
	/////////////////

	/**	 The entity leconsACote
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Article> leconsACote;

	/**	<br> The entity leconsACote
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001Lesson&fq=entiteVar_enUS_indexed_string:leconsACote">Find the entity leconsACote in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _leconsACote(Promise<SearchList<Article>> promise);

	public SearchList<Article> getLeconsACote() {
		return leconsACote;
	}

	public void setLeconsACote(SearchList<Article> leconsACote) {
		this.leconsACote = leconsACote;
	}
	public static SearchList<Article> staticSetLeconsACote(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<Article>> leconsACotePromise() {
		Promise<SearchList<Article>> promise = Promise.promise();
		Promise<SearchList<Article>> promise2 = Promise.promise();
		_leconsACote(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && leconsACote == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setLeconsACote(o);
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete(o);
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001Lesson(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001Lesson();
	}

	public Future<Void> promiseDeepC001Lesson() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001Lesson(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepC001(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001Lesson(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				leconCreeInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			leconsACotePromise().onSuccess(leconsACote -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
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
		return promiseDeepC001Lesson(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001Lesson(SiteRequestEnUS siteRequest_) {
			super.siteRequestC001(siteRequest_);
		if(leconsACote != null)
			leconsACote.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001Lesson(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001Lesson(v);
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
	public Object obtainC001Lesson(String var) {
		C001Lesson oC001Lesson = (C001Lesson)this;
		switch(var) {
			case "leconCree":
				return oC001Lesson.leconCree;
			case "leconsACote":
				return oC001Lesson.leconsACote;
			default:
				return super.obtainC001(var);
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
				o = relateC001Lesson(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001Lesson(String var, Object val) {
		C001Lesson oC001Lesson = (C001Lesson)this;
		switch(var) {
			default:
				return super.relateC001(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001Lesson(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001Lesson(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "leconCree":
			return C001Lesson.staticSetLeconCree(siteRequest_, o);
			default:
				return C001.staticSetC001(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001Lesson(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001Lesson(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "leconCree":
			return C001Lesson.staticSearchLeconCree(siteRequest_, (ZonedDateTime)o);
			default:
				return C001.staticSearchC001(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001Lesson(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001Lesson(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "leconCree":
			return C001Lesson.staticSearchStrLeconCree(siteRequest_, (Date)o);
			default:
				return C001.staticSearchStrC001(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001Lesson(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001Lesson(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "leconCree":
			return C001Lesson.staticSearchFqLeconCree(siteRequest_, o);
			default:
				return C001.staticSearchFqC001(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistC001Lesson(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistC001Lesson(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistC001(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateC001Lesson(doc);
	}
	public void populateC001Lesson(SolrResponse.Doc doc) {
		C001Lesson oC001Lesson = (C001Lesson)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateC001(doc);
	}

	public void indexC001Lesson(JsonObject doc) {
		if(leconCree != null) {
			doc.put("leconCree_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(leconCree.toInstant(), ZoneId.of("UTC"))));
		}
		super.indexC001(doc);

	}

	public static String varStoredC001Lesson(String entityVar) {
		switch(entityVar) {
			case "leconCree":
				return "leconCree_docvalues_date";
			default:
				return C001.varStoredC001(entityVar);
		}
	}

	public static String varIndexedC001Lesson(String entityVar) {
		switch(entityVar) {
			case "leconCree":
				return "leconCree_docvalues_date";
			default:
				return C001.varIndexedC001(entityVar);
		}
	}

	public static String searchVarC001Lesson(String searchVar) {
		switch(searchVar) {
			case "leconCree_docvalues_date":
				return "leconCree";
			default:
				return C001.searchVarC001(searchVar);
		}
	}

	public static String varSearchC001Lesson(String entityVar) {
		switch(entityVar) {
			default:
				return C001.varSearchC001(entityVar);
		}
	}

	public static String varSuggestedC001Lesson(String entityVar) {
		switch(entityVar) {
			default:
				return C001.varSuggestedC001(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeC001Lesson(doc);
	}
	public void storeC001Lesson(SolrResponse.Doc doc) {
		C001Lesson oC001Lesson = (C001Lesson)this;

		oC001Lesson.setLeconCree(Optional.ofNullable(doc.get("leconCree_docvalues_date")).map(v -> v.toString()).orElse(null));

		super.storeC001(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestC001Lesson() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof C001Lesson) {
			C001Lesson original = (C001Lesson)o;
			if(!Objects.equals(leconCree, original.getLeconCree()))
				apiRequest.addVars("leconCree");
			super.apiRequestC001();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(leconCree).map(v -> "leconCree: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "C001Lesson";
	public static final String VAR_leconCree = "leconCree";
	public static final String VAR_leconsACote = "leconsACote";

	public static List<String> varsQForClass() {
		return C001Lesson.varsQC001Lesson(new ArrayList<String>());
	}
	public static List<String> varsQC001Lesson(List<String> vars) {
		C001.varsQC001(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return C001Lesson.varsFqC001Lesson(new ArrayList<String>());
	}
	public static List<String> varsFqC001Lesson(List<String> vars) {
		C001.varsFqC001(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return C001Lesson.varsRangeC001Lesson(new ArrayList<String>());
	}
	public static List<String> varsRangeC001Lesson(List<String> vars) {
		C001.varsRangeC001(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_leconCree = "";
	public static final String DISPLAY_NAME_leconsACote = "";

	public static String displayNameForClass(String var) {
		return C001Lesson.displayNameC001Lesson(var);
	}
	public static String displayNameC001Lesson(String var) {
		switch(var) {
		case VAR_leconCree:
			return DISPLAY_NAME_leconCree;
		case VAR_leconsACote:
			return DISPLAY_NAME_leconsACote;
		default:
			return C001.displayNameC001(var);
		}
	}

	public static String descriptionC001Lesson(String var) {
		switch(var) {
			default:
				return C001.descriptionC001(var);
		}
	}

	public static String classSimpleNameC001Lesson(String var) {
		switch(var) {
		case VAR_leconCree:
			return "ZonedDateTime";
		case VAR_leconsACote:
			return "SearchList";
			default:
				return C001.classSimpleNameC001(var);
		}
	}

	public static Integer htmlColumnC001Lesson(String var) {
		switch(var) {
			default:
				return C001.htmlColumnC001(var);
		}
	}

	public static Integer htmlRowC001Lesson(String var) {
		switch(var) {
			default:
				return C001.htmlRowC001(var);
		}
	}

	public static Integer htmlCellC001Lesson(String var) {
		switch(var) {
			default:
				return C001.htmlCellC001(var);
		}
	}

	public static Integer lengthMinC001Lesson(String var) {
		switch(var) {
			default:
				return C001.lengthMinC001(var);
		}
	}

	public static Integer lengthMaxC001Lesson(String var) {
		switch(var) {
			default:
				return C001.lengthMaxC001(var);
		}
	}

	public static Integer maxC001Lesson(String var) {
		switch(var) {
			default:
				return C001.maxC001(var);
		}
	}

	public static Integer minC001Lesson(String var) {
		switch(var) {
			default:
				return C001.minC001(var);
		}
	}
}
