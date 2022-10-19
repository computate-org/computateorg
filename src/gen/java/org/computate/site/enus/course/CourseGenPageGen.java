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
import org.computate.site.enus.article.ArticlePage;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.course.Course;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class CourseGenPageGen into the class CourseGenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these CourseGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the CourseGenPage class and it's generated class CourseGenPageGen&lt;ArticlePage&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage">Find the class CourseGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class CourseGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.course in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class CourseGenPageGen<DEV> extends ArticlePage {
	protected static final Logger LOG = LoggerFactory.getLogger(CourseGenPage.class);

	///////////////////////
	// searchListCourse_ //
	///////////////////////

	/**	 The entity searchListCourse_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Course> searchListCourse_;

	/**	<br> The entity searchListCourse_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:searchListCourse_">Find the entity searchListCourse_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListCourse_(Wrap<SearchList<Course>> w);

	public SearchList<Course> getSearchListCourse_() {
		return searchListCourse_;
	}

	public void setSearchListCourse_(SearchList<Course> searchListCourse_) {
		this.searchListCourse_ = searchListCourse_;
	}
	public static SearchList<Course> staticSetSearchListCourse_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CourseGenPage searchListCourse_Init() {
		Wrap<SearchList<Course>> searchListCourse_Wrap = new Wrap<SearchList<Course>>().var("searchListCourse_");
		if(searchListCourse_ == null) {
			_searchListCourse_(searchListCourse_Wrap);
			setSearchListCourse_(searchListCourse_Wrap.o);
		}
		return (CourseGenPage)this;
	}

	////////////////
	// listCourse //
	////////////////

	/**	 The entity listCourse
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listCourse = new JsonArray();

	/**	<br> The entity listCourse
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:listCourse">Find the entity listCourse in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listCourse(JsonArray l);

	public JsonArray getListCourse() {
		return listCourse;
	}

	public void setListCourse(JsonArray listCourse) {
		this.listCourse = listCourse;
	}
	public static JsonArray staticSetListCourse(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CourseGenPage listCourseInit() {
		_listCourse(listCourse);
		return (CourseGenPage)this;
	}

	/////////////////
	// courseCount //
	/////////////////

	/**	 The entity courseCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer courseCount;

	/**	<br> The entity courseCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:courseCount">Find the entity courseCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _courseCount(Wrap<Integer> w);

	public Integer getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}
	@JsonIgnore
	public void setCourseCount(String o) {
		this.courseCount = CourseGenPage.staticSetCourseCount(siteRequest_, o);
	}
	public static Integer staticSetCourseCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected CourseGenPage courseCountInit() {
		Wrap<Integer> courseCountWrap = new Wrap<Integer>().var("courseCount");
		if(courseCount == null) {
			_courseCount(courseCountWrap);
			setCourseCount(courseCountWrap.o);
		}
		return (CourseGenPage)this;
	}

	public static Integer staticSearchCourseCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrCourseCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCourseCount(SiteRequestEnUS siteRequest_, String o) {
		return CourseGenPage.staticSearchStrCourseCount(siteRequest_, CourseGenPage.staticSearchCourseCount(siteRequest_, CourseGenPage.staticSetCourseCount(siteRequest_, o)));
	}

	/////////////
	// course_ //
	/////////////

	/**	 The entity course_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Course course_;

	/**	<br> The entity course_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:course_">Find the entity course_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _course_(Wrap<Course> w);

	public Course getCourse_() {
		return course_;
	}

	public void setCourse_(Course course_) {
		this.course_ = course_;
	}
	public static Course staticSetCourse_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected CourseGenPage course_Init() {
		Wrap<Course> course_Wrap = new Wrap<Course>().var("course_");
		if(course_ == null) {
			_course_(course_Wrap);
			setCourse_(course_Wrap.o);
		}
		return (CourseGenPage)this;
	}

	////////
	// id //
	////////

	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br> The entity id
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = CourseGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CourseGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (CourseGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return CourseGenPage.staticSearchStrId(siteRequest_, CourseGenPage.staticSearchId(siteRequest_, CourseGenPage.staticSetId(siteRequest_, o)));
	}

	///////////////////
	// pageUriCourse //
	///////////////////

	/**	 The entity pageUriCourse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriCourse;

	/**	<br> The entity pageUriCourse
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.CourseGenPage&fq=entiteVar_enUS_indexed_string:pageUriCourse">Find the entity pageUriCourse in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriCourse(Wrap<String> c);

	public String getPageUriCourse() {
		return pageUriCourse;
	}
	public void setPageUriCourse(String o) {
		this.pageUriCourse = CourseGenPage.staticSetPageUriCourse(siteRequest_, o);
	}
	public static String staticSetPageUriCourse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected CourseGenPage pageUriCourseInit() {
		Wrap<String> pageUriCourseWrap = new Wrap<String>().var("pageUriCourse");
		if(pageUriCourse == null) {
			_pageUriCourse(pageUriCourseWrap);
			setPageUriCourse(pageUriCourseWrap.o);
		}
		return (CourseGenPage)this;
	}

	public static String staticSearchPageUriCourse(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriCourse(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriCourse(SiteRequestEnUS siteRequest_, String o) {
		return CourseGenPage.staticSearchStrPageUriCourse(siteRequest_, CourseGenPage.staticSearchPageUriCourse(siteRequest_, CourseGenPage.staticSetPageUriCourse(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepCourseGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepCourseGenPage();
	}

	public Future<Void> promiseDeepCourseGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseCourseGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepArticlePage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseCourseGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListCourse_Init();
				listCourseInit();
				courseCountInit();
				course_Init();
				idInit();
				pageUriCourseInit();
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
		return promiseDeepCourseGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestCourseGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestArticlePage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestCourseGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainCourseGenPage(v);
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
	public Object obtainCourseGenPage(String var) {
		CourseGenPage oCourseGenPage = (CourseGenPage)this;
		switch(var) {
			case "searchListCourse_":
				return oCourseGenPage.searchListCourse_;
			case "listCourse":
				return oCourseGenPage.listCourse;
			case "courseCount":
				return oCourseGenPage.courseCount;
			case "course_":
				return oCourseGenPage.course_;
			case "id":
				return oCourseGenPage.id;
			case "pageUriCourse":
				return oCourseGenPage.pageUriCourse;
			default:
				return super.obtainArticlePage(var);
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
				o = relateCourseGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateCourseGenPage(String var, Object val) {
		CourseGenPage oCourseGenPage = (CourseGenPage)this;
		switch(var) {
			default:
				return super.relateArticlePage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetCourseGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetCourseGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "courseCount":
			return CourseGenPage.staticSetCourseCount(siteRequest_, o);
		case "id":
			return CourseGenPage.staticSetId(siteRequest_, o);
		case "pageUriCourse":
			return CourseGenPage.staticSetPageUriCourse(siteRequest_, o);
			default:
				return ArticlePage.staticSetArticlePage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchCourseGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchCourseGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "courseCount":
			return CourseGenPage.staticSearchCourseCount(siteRequest_, (Integer)o);
		case "id":
			return CourseGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriCourse":
			return CourseGenPage.staticSearchPageUriCourse(siteRequest_, (String)o);
			default:
				return ArticlePage.staticSearchArticlePage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrCourseGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrCourseGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "courseCount":
			return CourseGenPage.staticSearchStrCourseCount(siteRequest_, (Integer)o);
		case "id":
			return CourseGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriCourse":
			return CourseGenPage.staticSearchStrPageUriCourse(siteRequest_, (String)o);
			default:
				return ArticlePage.staticSearchStrArticlePage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqCourseGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqCourseGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "courseCount":
			return CourseGenPage.staticSearchFqCourseCount(siteRequest_, o);
		case "id":
			return CourseGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriCourse":
			return CourseGenPage.staticSearchFqPageUriCourse(siteRequest_, o);
			default:
				return ArticlePage.staticSearchFqArticlePage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "CourseGenPage";
	public static final String VAR_searchListCourse_ = "searchListCourse_";
	public static final String VAR_listCourse = "listCourse";
	public static final String VAR_courseCount = "courseCount";
	public static final String VAR_course_ = "course_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriCourse = "pageUriCourse";

	public static final String DISPLAY_NAME_searchListCourse_ = "";
	public static final String DISPLAY_NAME_listCourse = "";
	public static final String DISPLAY_NAME_courseCount = "";
	public static final String DISPLAY_NAME_course_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriCourse = "";

	public static String displayNameForClass(String var) {
		return CourseGenPage.displayNameCourseGenPage(var);
	}
	public static String displayNameCourseGenPage(String var) {
		switch(var) {
		case VAR_searchListCourse_:
			return DISPLAY_NAME_searchListCourse_;
		case VAR_listCourse:
			return DISPLAY_NAME_listCourse;
		case VAR_courseCount:
			return DISPLAY_NAME_courseCount;
		case VAR_course_:
			return DISPLAY_NAME_course_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriCourse:
			return DISPLAY_NAME_pageUriCourse;
		default:
			return ArticlePage.displayNameArticlePage(var);
		}
	}
}
