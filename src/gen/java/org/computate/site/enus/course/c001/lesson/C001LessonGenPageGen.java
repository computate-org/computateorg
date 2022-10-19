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
import org.computate.site.enus.course.c001.C001Page;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.course.c001.lesson.C001Lesson;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class C001LessonGenPageGen into the class C001LessonGenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these C001LessonGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the C001LessonGenPage class and it's generated class C001LessonGenPageGen&lt;C001Page&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage">Find the class C001LessonGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class C001LessonGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
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
public abstract class C001LessonGenPageGen<DEV> extends C001Page {
	protected static final Logger LOG = LoggerFactory.getLogger(C001LessonGenPage.class);

	///////////////////////////
	// searchListC001Lesson_ //
	///////////////////////////

	/**	 The entity searchListC001Lesson_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<C001Lesson> searchListC001Lesson_;

	/**	<br> The entity searchListC001Lesson_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&fq=entiteVar_enUS_indexed_string:searchListC001Lesson_">Find the entity searchListC001Lesson_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListC001Lesson_(Wrap<SearchList<C001Lesson>> w);

	public SearchList<C001Lesson> getSearchListC001Lesson_() {
		return searchListC001Lesson_;
	}

	public void setSearchListC001Lesson_(SearchList<C001Lesson> searchListC001Lesson_) {
		this.searchListC001Lesson_ = searchListC001Lesson_;
	}
	public static SearchList<C001Lesson> staticSetSearchListC001Lesson_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001LessonGenPage searchListC001Lesson_Init() {
		Wrap<SearchList<C001Lesson>> searchListC001Lesson_Wrap = new Wrap<SearchList<C001Lesson>>().var("searchListC001Lesson_");
		if(searchListC001Lesson_ == null) {
			_searchListC001Lesson_(searchListC001Lesson_Wrap);
			setSearchListC001Lesson_(searchListC001Lesson_Wrap.o);
		}
		return (C001LessonGenPage)this;
	}

	////////////////////
	// listC001Lesson //
	////////////////////

	/**	 The entity listC001Lesson
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listC001Lesson = new JsonArray();

	/**	<br> The entity listC001Lesson
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&fq=entiteVar_enUS_indexed_string:listC001Lesson">Find the entity listC001Lesson in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listC001Lesson(JsonArray l);

	public JsonArray getListC001Lesson() {
		return listC001Lesson;
	}

	public void setListC001Lesson(JsonArray listC001Lesson) {
		this.listC001Lesson = listC001Lesson;
	}
	public static JsonArray staticSetListC001Lesson(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001LessonGenPage listC001LessonInit() {
		_listC001Lesson(listC001Lesson);
		return (C001LessonGenPage)this;
	}

	/////////////////////
	// c001LessonCount //
	/////////////////////

	/**	 The entity c001LessonCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer c001LessonCount;

	/**	<br> The entity c001LessonCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&fq=entiteVar_enUS_indexed_string:c001LessonCount">Find the entity c001LessonCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _c001LessonCount(Wrap<Integer> w);

	public Integer getC001LessonCount() {
		return c001LessonCount;
	}

	public void setC001LessonCount(Integer c001LessonCount) {
		this.c001LessonCount = c001LessonCount;
	}
	@JsonIgnore
	public void setC001LessonCount(String o) {
		this.c001LessonCount = C001LessonGenPage.staticSetC001LessonCount(siteRequest_, o);
	}
	public static Integer staticSetC001LessonCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected C001LessonGenPage c001LessonCountInit() {
		Wrap<Integer> c001LessonCountWrap = new Wrap<Integer>().var("c001LessonCount");
		if(c001LessonCount == null) {
			_c001LessonCount(c001LessonCountWrap);
			setC001LessonCount(c001LessonCountWrap.o);
		}
		return (C001LessonGenPage)this;
	}

	public static Integer staticSearchC001LessonCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrC001LessonCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqC001LessonCount(SiteRequestEnUS siteRequest_, String o) {
		return C001LessonGenPage.staticSearchStrC001LessonCount(siteRequest_, C001LessonGenPage.staticSearchC001LessonCount(siteRequest_, C001LessonGenPage.staticSetC001LessonCount(siteRequest_, o)));
	}

	/////////////////
	// c001Lesson_ //
	/////////////////

	/**	 The entity c001Lesson_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected C001Lesson c001Lesson_;

	/**	<br> The entity c001Lesson_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&fq=entiteVar_enUS_indexed_string:c001Lesson_">Find the entity c001Lesson_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _c001Lesson_(Wrap<C001Lesson> w);

	public C001Lesson getC001Lesson_() {
		return c001Lesson_;
	}

	public void setC001Lesson_(C001Lesson c001Lesson_) {
		this.c001Lesson_ = c001Lesson_;
	}
	public static C001Lesson staticSetC001Lesson_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001LessonGenPage c001Lesson_Init() {
		Wrap<C001Lesson> c001Lesson_Wrap = new Wrap<C001Lesson>().var("c001Lesson_");
		if(c001Lesson_ == null) {
			_c001Lesson_(c001Lesson_Wrap);
			setC001Lesson_(c001Lesson_Wrap.o);
		}
		return (C001LessonGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.C001LessonGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = C001LessonGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected C001LessonGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (C001LessonGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return C001LessonGenPage.staticSearchStrId(siteRequest_, C001LessonGenPage.staticSearchId(siteRequest_, C001LessonGenPage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001LessonGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001LessonGenPage();
	}

	public Future<Void> promiseDeepC001LessonGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001LessonGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepC001Page(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001LessonGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListC001Lesson_Init();
				listC001LessonInit();
				c001LessonCountInit();
				c001Lesson_Init();
				idInit();
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
		return promiseDeepC001LessonGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001LessonGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestC001Page(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001LessonGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001LessonGenPage(v);
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
	public Object obtainC001LessonGenPage(String var) {
		C001LessonGenPage oC001LessonGenPage = (C001LessonGenPage)this;
		switch(var) {
			case "searchListC001Lesson_":
				return oC001LessonGenPage.searchListC001Lesson_;
			case "listC001Lesson":
				return oC001LessonGenPage.listC001Lesson;
			case "c001LessonCount":
				return oC001LessonGenPage.c001LessonCount;
			case "c001Lesson_":
				return oC001LessonGenPage.c001Lesson_;
			case "id":
				return oC001LessonGenPage.id;
			default:
				return super.obtainC001Page(var);
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
				o = relateC001LessonGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001LessonGenPage(String var, Object val) {
		C001LessonGenPage oC001LessonGenPage = (C001LessonGenPage)this;
		switch(var) {
			default:
				return super.relateC001Page(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001LessonGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001LessonGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "c001LessonCount":
			return C001LessonGenPage.staticSetC001LessonCount(siteRequest_, o);
		case "id":
			return C001LessonGenPage.staticSetId(siteRequest_, o);
			default:
				return C001Page.staticSetC001Page(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001LessonGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001LessonGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "c001LessonCount":
			return C001LessonGenPage.staticSearchC001LessonCount(siteRequest_, (Integer)o);
		case "id":
			return C001LessonGenPage.staticSearchId(siteRequest_, (String)o);
			default:
				return C001Page.staticSearchC001Page(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001LessonGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001LessonGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "c001LessonCount":
			return C001LessonGenPage.staticSearchStrC001LessonCount(siteRequest_, (Integer)o);
		case "id":
			return C001LessonGenPage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return C001Page.staticSearchStrC001Page(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001LessonGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001LessonGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "c001LessonCount":
			return C001LessonGenPage.staticSearchFqC001LessonCount(siteRequest_, o);
		case "id":
			return C001LessonGenPage.staticSearchFqId(siteRequest_, o);
			default:
				return C001Page.staticSearchFqC001Page(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "C001LessonGenPage";
	public static final String VAR_searchListC001Lesson_ = "searchListC001Lesson_";
	public static final String VAR_listC001Lesson = "listC001Lesson";
	public static final String VAR_c001LessonCount = "c001LessonCount";
	public static final String VAR_c001Lesson_ = "c001Lesson_";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListC001Lesson_ = "";
	public static final String DISPLAY_NAME_listC001Lesson = "";
	public static final String DISPLAY_NAME_c001LessonCount = "";
	public static final String DISPLAY_NAME_c001Lesson_ = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return C001LessonGenPage.displayNameC001LessonGenPage(var);
	}
	public static String displayNameC001LessonGenPage(String var) {
		switch(var) {
		case VAR_searchListC001Lesson_:
			return DISPLAY_NAME_searchListC001Lesson_;
		case VAR_listC001Lesson:
			return DISPLAY_NAME_listC001Lesson;
		case VAR_c001LessonCount:
			return DISPLAY_NAME_c001LessonCount;
		case VAR_c001Lesson_:
			return DISPLAY_NAME_c001Lesson_;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return C001Page.displayNameC001Page(var);
		}
	}
}
