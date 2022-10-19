package org.computate.site.enus.course.c001;

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
import org.computate.site.enus.course.CoursePage;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.course.c001.C001;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class C001GenPageGen into the class C001GenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these C001GenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the C001GenPage class and it's generated class C001GenPageGen&lt;CoursePage&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage">Find the class C001GenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class C001GenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.course.c001 in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class C001GenPageGen<DEV> extends CoursePage {
	protected static final Logger LOG = LoggerFactory.getLogger(C001GenPage.class);

	/////////////////////
	// searchListC001_ //
	/////////////////////

	/**	 The entity searchListC001_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<C001> searchListC001_;

	/**	<br> The entity searchListC001_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&fq=entiteVar_enUS_indexed_string:searchListC001_">Find the entity searchListC001_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListC001_(Wrap<SearchList<C001>> w);

	public SearchList<C001> getSearchListC001_() {
		return searchListC001_;
	}

	public void setSearchListC001_(SearchList<C001> searchListC001_) {
		this.searchListC001_ = searchListC001_;
	}
	public static SearchList<C001> staticSetSearchListC001_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001GenPage searchListC001_Init() {
		Wrap<SearchList<C001>> searchListC001_Wrap = new Wrap<SearchList<C001>>().var("searchListC001_");
		if(searchListC001_ == null) {
			_searchListC001_(searchListC001_Wrap);
			setSearchListC001_(searchListC001_Wrap.o);
		}
		return (C001GenPage)this;
	}

	//////////////
	// listC001 //
	//////////////

	/**	 The entity listC001
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listC001 = new JsonArray();

	/**	<br> The entity listC001
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&fq=entiteVar_enUS_indexed_string:listC001">Find the entity listC001 in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listC001(JsonArray l);

	public JsonArray getListC001() {
		return listC001;
	}

	public void setListC001(JsonArray listC001) {
		this.listC001 = listC001;
	}
	public static JsonArray staticSetListC001(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001GenPage listC001Init() {
		_listC001(listC001);
		return (C001GenPage)this;
	}

	///////////////
	// c001Count //
	///////////////

	/**	 The entity c001Count
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer c001Count;

	/**	<br> The entity c001Count
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&fq=entiteVar_enUS_indexed_string:c001Count">Find the entity c001Count in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _c001Count(Wrap<Integer> w);

	public Integer getC001Count() {
		return c001Count;
	}

	public void setC001Count(Integer c001Count) {
		this.c001Count = c001Count;
	}
	@JsonIgnore
	public void setC001Count(String o) {
		this.c001Count = C001GenPage.staticSetC001Count(siteRequest_, o);
	}
	public static Integer staticSetC001Count(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected C001GenPage c001CountInit() {
		Wrap<Integer> c001CountWrap = new Wrap<Integer>().var("c001Count");
		if(c001Count == null) {
			_c001Count(c001CountWrap);
			setC001Count(c001CountWrap.o);
		}
		return (C001GenPage)this;
	}

	public static Integer staticSearchC001Count(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrC001Count(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqC001Count(SiteRequestEnUS siteRequest_, String o) {
		return C001GenPage.staticSearchStrC001Count(siteRequest_, C001GenPage.staticSearchC001Count(siteRequest_, C001GenPage.staticSetC001Count(siteRequest_, o)));
	}

	///////////
	// c001_ //
	///////////

	/**	 The entity c001_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected C001 c001_;

	/**	<br> The entity c001_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&fq=entiteVar_enUS_indexed_string:c001_">Find the entity c001_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _c001_(Wrap<C001> w);

	public C001 getC001_() {
		return c001_;
	}

	public void setC001_(C001 c001_) {
		this.c001_ = c001_;
	}
	public static C001 staticSetC001_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001GenPage c001_Init() {
		Wrap<C001> c001_Wrap = new Wrap<C001>().var("c001_");
		if(c001_ == null) {
			_c001_(c001_Wrap);
			setC001_(c001_Wrap.o);
		}
		return (C001GenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001GenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = C001GenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected C001GenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (C001GenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return C001GenPage.staticSearchStrId(siteRequest_, C001GenPage.staticSearchId(siteRequest_, C001GenPage.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001GenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001GenPage();
	}

	public Future<Void> promiseDeepC001GenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001GenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepCoursePage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001GenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListC001_Init();
				listC001Init();
				c001CountInit();
				c001_Init();
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
		return promiseDeepC001GenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001GenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestCoursePage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001GenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001GenPage(v);
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
	public Object obtainC001GenPage(String var) {
		C001GenPage oC001GenPage = (C001GenPage)this;
		switch(var) {
			case "searchListC001_":
				return oC001GenPage.searchListC001_;
			case "listC001":
				return oC001GenPage.listC001;
			case "c001Count":
				return oC001GenPage.c001Count;
			case "c001_":
				return oC001GenPage.c001_;
			case "id":
				return oC001GenPage.id;
			default:
				return super.obtainCoursePage(var);
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
				o = relateC001GenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001GenPage(String var, Object val) {
		C001GenPage oC001GenPage = (C001GenPage)this;
		switch(var) {
			default:
				return super.relateCoursePage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001GenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001GenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "c001Count":
			return C001GenPage.staticSetC001Count(siteRequest_, o);
		case "id":
			return C001GenPage.staticSetId(siteRequest_, o);
			default:
				return CoursePage.staticSetCoursePage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001GenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001GenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "c001Count":
			return C001GenPage.staticSearchC001Count(siteRequest_, (Integer)o);
		case "id":
			return C001GenPage.staticSearchId(siteRequest_, (String)o);
			default:
				return CoursePage.staticSearchCoursePage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001GenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001GenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "c001Count":
			return C001GenPage.staticSearchStrC001Count(siteRequest_, (Integer)o);
		case "id":
			return C001GenPage.staticSearchStrId(siteRequest_, (String)o);
			default:
				return CoursePage.staticSearchStrCoursePage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001GenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001GenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "c001Count":
			return C001GenPage.staticSearchFqC001Count(siteRequest_, o);
		case "id":
			return C001GenPage.staticSearchFqId(siteRequest_, o);
			default:
				return CoursePage.staticSearchFqCoursePage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "C001GenPage";
	public static final String VAR_searchListC001_ = "searchListC001_";
	public static final String VAR_listC001 = "listC001";
	public static final String VAR_c001Count = "c001Count";
	public static final String VAR_c001_ = "c001_";
	public static final String VAR_id = "id";

	public static final String DISPLAY_NAME_searchListC001_ = "";
	public static final String DISPLAY_NAME_listC001 = "";
	public static final String DISPLAY_NAME_c001Count = "";
	public static final String DISPLAY_NAME_c001_ = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return C001GenPage.displayNameC001GenPage(var);
	}
	public static String displayNameC001GenPage(String var) {
		switch(var) {
		case VAR_searchListC001_:
			return DISPLAY_NAME_searchListC001_;
		case VAR_listC001:
			return DISPLAY_NAME_listC001;
		case VAR_c001Count:
			return DISPLAY_NAME_c001Count;
		case VAR_c001_:
			return DISPLAY_NAME_c001_;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return CoursePage.displayNameCoursePage(var);
		}
	}
}
