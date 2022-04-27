package org.computate.site.enus.course;

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
import org.computate.site.enus.article.Article;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.Course">Find the class Course in Solr. </a>
 * <br><br>Delete the class Course in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.Course&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.course in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class CourseGen<DEV> extends Article {
	protected static final Logger LOG = LoggerFactory.getLogger(Course.class);

	public static final String Course_AName_frFR = "un cours";
	public static final String Course_This_frFR = "ce ";
	public static final String Course_ThisName_frFR = "ce cours";
	public static final String Course_A_frFR = "un ";
	public static final String Course_TheName_frFR = "le cours";
	public static final String Course_NameSingular_frFR = "cours";
	public static final String Course_NamePlural_frFR = "cours";
	public static final String Course_NameActual_frFR = "cours actuel";
	public static final String Course_AllName_frFR = "tous les cours";
	public static final String Course_SearchAllNameBy_frFR = "rechercher cours par ";
	public static final String Course_SearchAllName_frFR = "rechercher cours";
	public static final String Course_Title_frFR = "cours";
	public static final String Course_ThePluralName_frFR = "les cours";
	public static final String Course_NoNameFound_frFR = "aucun cours trouvé";
	public static final String Course_NameVar_frFR = "cours";
	public static final String Course_OfName_frFR = "de cours";
	public static final String Course_NameAdjectiveSingular_frFR = "cours";
	public static final String Course_NameAdjectivePlural_frFR = "cours";
	public static final String SearchPage_frFR_Uri = "/api/course/{id}";
	public static final String SearchPage_frFR_ImageUri = "/png/api/course/{id}-999.png";
	public static final String Search_frFR_Uri = "/api/course/{id}";
	public static final String Search_frFR_ImageUri = "/png/api/course/{id}-999.png";
	public static final String GET_frFR_Uri = "/api/course/{id}";
	public static final String GET_frFR_ImageUri = "/png/api/course/{id}-999.png";

	public static final String Course_AName_enUS = "a course";
	public static final String Course_This_enUS = "this ";
	public static final String Course_ThisName_enUS = "this course";
	public static final String Course_A_enUS = "a ";
	public static final String Course_TheName_enUS = "the course";
	public static final String Course_NameSingular_enUS = "course";
	public static final String Course_NamePlural_enUS = "courses";
	public static final String Course_NameActual_enUS = "current course";
	public static final String Course_AllName_enUS = "all the courses";
	public static final String Course_SearchAllNameBy_enUS = "search courses by ";
	public static final String Course_Title_enUS = "courses";
	public static final String Course_ThePluralName_enUS = "the courses";
	public static final String Course_NoNameFound_enUS = "no course found";
	public static final String Course_NameVar_enUS = "course";
	public static final String Course_OfName_enUS = "of course";
	public static final String Course_ANameAdjective_enUS = "a course";
	public static final String Course_NameAdjectiveSingular_enUS = "course";
	public static final String Course_NameAdjectivePlural_enUS = "courses";
	public static final String SearchPage_enUS_Uri = "/enUS/course";
	public static final String SearchPage_enUS_ImageUri = "/png/enUS/course-999.png";
	public static final String Search_enUS_Uri = "/api/course";
	public static final String Search_enUS_ImageUri = "/png/api/course-999.png";
	public static final String GET_enUS_Uri = "/api/course/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/course/{id}-999.png";

	public static final String Course_Color = "green";
	public static final String Course_IconGroup = "regular";
	public static final String Course_IconName = "university";

	///////////////////////////////
	// courseIdentifierLowercase //
	///////////////////////////////

	/**	 The entity courseIdentifierLowercase
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String courseIdentifierLowercase;

	/**	<br> The entity courseIdentifierLowercase
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.Course&fq=entiteVar_enUS_indexed_string:courseIdentifierLowercase">Find the entity courseIdentifierLowercase in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _courseIdentifierLowercase(Wrap<String> c);

	public String getCourseIdentifierLowercase() {
		return courseIdentifierLowercase;
	}
	public void setCourseIdentifierLowercase(String o) {
		this.courseIdentifierLowercase = Course.staticSetCourseIdentifierLowercase(siteRequest_, o);
	}
	public static String staticSetCourseIdentifierLowercase(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Course courseIdentifierLowercaseInit() {
		Wrap<String> courseIdentifierLowercaseWrap = new Wrap<String>().var("courseIdentifierLowercase");
		if(courseIdentifierLowercase == null) {
			_courseIdentifierLowercase(courseIdentifierLowercaseWrap);
			setCourseIdentifierLowercase(courseIdentifierLowercaseWrap.o);
		}
		return (Course)this;
	}

	public static String staticSearchCourseIdentifierLowercase(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrCourseIdentifierLowercase(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCourseIdentifierLowercase(SiteRequestEnUS siteRequest_, String o) {
		return Course.staticSearchStrCourseIdentifierLowercase(siteRequest_, Course.staticSearchCourseIdentifierLowercase(siteRequest_, Course.staticSetCourseIdentifierLowercase(siteRequest_, o)));
	}

	/////////////////////////////////
	// courseIdentifierCapitalized //
	/////////////////////////////////

	/**	 The entity courseIdentifierCapitalized
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String courseIdentifierCapitalized;

	/**	<br> The entity courseIdentifierCapitalized
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.Course&fq=entiteVar_enUS_indexed_string:courseIdentifierCapitalized">Find the entity courseIdentifierCapitalized in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _courseIdentifierCapitalized(Wrap<String> c);

	public String getCourseIdentifierCapitalized() {
		return courseIdentifierCapitalized;
	}
	public void setCourseIdentifierCapitalized(String o) {
		this.courseIdentifierCapitalized = Course.staticSetCourseIdentifierCapitalized(siteRequest_, o);
	}
	public static String staticSetCourseIdentifierCapitalized(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Course courseIdentifierCapitalizedInit() {
		Wrap<String> courseIdentifierCapitalizedWrap = new Wrap<String>().var("courseIdentifierCapitalized");
		if(courseIdentifierCapitalized == null) {
			_courseIdentifierCapitalized(courseIdentifierCapitalizedWrap);
			setCourseIdentifierCapitalized(courseIdentifierCapitalizedWrap.o);
		}
		return (Course)this;
	}

	public static String staticSearchCourseIdentifierCapitalized(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrCourseIdentifierCapitalized(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCourseIdentifierCapitalized(SiteRequestEnUS siteRequest_, String o) {
		return Course.staticSearchStrCourseIdentifierCapitalized(siteRequest_, Course.staticSearchCourseIdentifierCapitalized(siteRequest_, Course.staticSetCourseIdentifierCapitalized(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepCourse(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepCourse();
	}

	public Future<Void> promiseDeepCourse() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseCourse(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepArticle(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseCourse(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				courseIdentifierLowercaseInit();
				courseIdentifierCapitalizedInit();
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
		return promiseDeepCourse(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestCourse(SiteRequestEnUS siteRequest_) {
			super.siteRequestArticle(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestCourse(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainCourse(v);
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
	public Object obtainCourse(String var) {
		Course oCourse = (Course)this;
		switch(var) {
			case "courseIdentifierLowercase":
				return oCourse.courseIdentifierLowercase;
			case "courseIdentifierCapitalized":
				return oCourse.courseIdentifierCapitalized;
			default:
				return super.obtainArticle(var);
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
				o = relateCourse(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateCourse(String var, Object val) {
		Course oCourse = (Course)this;
		switch(var) {
			default:
				return super.relateArticle(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetCourse(entityVar,  siteRequest_, o);
	}
	public static Object staticSetCourse(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "courseIdentifierLowercase":
			return Course.staticSetCourseIdentifierLowercase(siteRequest_, o);
		case "courseIdentifierCapitalized":
			return Course.staticSetCourseIdentifierCapitalized(siteRequest_, o);
			default:
				return Article.staticSetArticle(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchCourse(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchCourse(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "courseIdentifierLowercase":
			return Course.staticSearchCourseIdentifierLowercase(siteRequest_, (String)o);
		case "courseIdentifierCapitalized":
			return Course.staticSearchCourseIdentifierCapitalized(siteRequest_, (String)o);
			default:
				return Article.staticSearchArticle(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrCourse(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrCourse(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "courseIdentifierLowercase":
			return Course.staticSearchStrCourseIdentifierLowercase(siteRequest_, (String)o);
		case "courseIdentifierCapitalized":
			return Course.staticSearchStrCourseIdentifierCapitalized(siteRequest_, (String)o);
			default:
				return Article.staticSearchStrArticle(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqCourse(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqCourse(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "courseIdentifierLowercase":
			return Course.staticSearchFqCourseIdentifierLowercase(siteRequest_, o);
		case "courseIdentifierCapitalized":
			return Course.staticSearchFqCourseIdentifierCapitalized(siteRequest_, o);
			default:
				return Article.staticSearchFqArticle(entityVar,  siteRequest_, o);
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
					o = persistCourse(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistCourse(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistArticle(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateCourse(doc);
	}
	public void populateCourse(SolrResponse.Doc doc) {
		Course oCourse = (Course)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateArticle(doc);
	}

	public void indexCourse(JsonObject doc) {
		super.indexArticle(doc);

	}

	public static String varStoredCourse(String entityVar) {
		switch(entityVar) {
			default:
				return Article.varStoredArticle(entityVar);
		}
	}

	public static String varIndexedCourse(String entityVar) {
		switch(entityVar) {
			default:
				return Article.varIndexedArticle(entityVar);
		}
	}

	public static String varSearchCourse(String entityVar) {
		switch(entityVar) {
			default:
				return Article.varSearchArticle(entityVar);
		}
	}

	public static String varSuggestedCourse(String entityVar) {
		switch(entityVar) {
			default:
				return Article.varSuggestedArticle(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeCourse(doc);
	}
	public void storeCourse(SolrResponse.Doc doc) {
		Course oCourse = (Course)this;


		super.storeArticle(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestCourse() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof Course) {
			Course original = (Course)o;
			super.apiRequestArticle();
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

	public static final String CLASS_SIMPLE_NAME = "Course";
	public static final String VAR_courseIdentifierLowercase = "courseIdentifierLowercase";
	public static final String VAR_courseIdentifierCapitalized = "courseIdentifierCapitalized";

	public static List<String> varsQForClass() {
		return Course.varsQCourse(new ArrayList<String>());
	}
	public static List<String> varsQCourse(List<String> vars) {
		Article.varsQArticle(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return Course.varsFqCourse(new ArrayList<String>());
	}
	public static List<String> varsFqCourse(List<String> vars) {
		Article.varsFqArticle(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return Course.varsRangeCourse(new ArrayList<String>());
	}
	public static List<String> varsRangeCourse(List<String> vars) {
		Article.varsRangeArticle(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_courseIdentifierLowercase = "";
	public static final String DISPLAY_NAME_courseIdentifierCapitalized = "";

	public static String displayNameForClass(String var) {
		return Course.displayNameCourse(var);
	}
	public static String displayNameCourse(String var) {
		switch(var) {
		case VAR_courseIdentifierLowercase:
			return DISPLAY_NAME_courseIdentifierLowercase;
		case VAR_courseIdentifierCapitalized:
			return DISPLAY_NAME_courseIdentifierCapitalized;
		default:
			return Article.displayNameArticle(var);
		}
	}

	public static String descriptionCourse(String var) {
		switch(var) {
			default:
				return Article.descriptionArticle(var);
		}
	}

	public static String classSimpleNameCourse(String var) {
		switch(var) {
		case VAR_courseIdentifierLowercase:
			return "String";
		case VAR_courseIdentifierCapitalized:
			return "String";
			default:
				return Article.classSimpleNameArticle(var);
		}
	}

	public static Integer htmlColumnCourse(String var) {
		switch(var) {
			default:
				return Article.htmlColumnArticle(var);
		}
	}

	public static Integer htmlRowCourse(String var) {
		switch(var) {
			default:
				return Article.htmlRowArticle(var);
		}
	}

	public static Integer htmlCellCourse(String var) {
		switch(var) {
			default:
				return Article.htmlCellArticle(var);
		}
	}

	public static Integer lengthMinCourse(String var) {
		switch(var) {
			default:
				return Article.lengthMinArticle(var);
		}
	}

	public static Integer lengthMaxCourse(String var) {
		switch(var) {
			default:
				return Article.lengthMaxArticle(var);
		}
	}

	public static Integer maxCourse(String var) {
		switch(var) {
			default:
				return Article.maxArticle(var);
		}
	}

	public static Integer minCourse(String var) {
		switch(var) {
			default:
				return Article.minArticle(var);
		}
	}
}
