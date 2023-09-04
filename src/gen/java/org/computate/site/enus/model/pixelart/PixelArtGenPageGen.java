package org.computate.site.enus.model.pixelart;

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
import org.computate.site.enus.model.base.BaseModelPage;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.model.pixelart.PixelArt;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
<li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these PixelArtGenPage objects in a RESTful API. 
</li>
<li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PixelArtGenPageGen into the class PixelArtGenPage. 
</li>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these PixelArtGenPage objects in a RESTful API. 
 * </li>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class PixelArtGenPageGen into the class PixelArtGenPage. 
 * </li>
 * 0<h3>Suggestions that can generate more code for you: </h3>
 * <h3>About the PixelArtGenPage class and it's generated class PixelArtGenPageGen&lt;BaseModelPage&gt;: </h3>extends PixelArtGenPageGen
 * <p>
 * This Java class extends a generated Java class PixelArtGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage">Find the class PixelArtGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends PixelArtGenPageGen<BaseModelPage>
 * <p>This <code>class PixelArtGenPage extends PixelArtGenPageGen&lt;BaseModelPage&gt;</code>, which means it extends a newly generated PixelArtGenPageGen. 
 * The generated <code>class PixelArtGenPageGen extends BaseModelPage</code> which means that PixelArtGenPage extends PixelArtGenPageGen which extends BaseModelPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * ApiTag.enUS: null
 * ApiUri.enUS: null
 * Color: null
 * IconGroup: null
 * IconName: null
 * Indexed: true
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the PixelArtGenPage class will inherit the helpful inherited class comments from the super class PixelArtGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the PixelArtGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * AName: null
 * <p>
 * Delete the class PixelArtGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.model.pixelart in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.model.pixelart&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class PixelArtGenPageGen<DEV> extends BaseModelPage {
	protected static final Logger LOG = LoggerFactory.getLogger(PixelArtGenPage.class);

	/////////////////////////
	// searchListPixelArt_ //
	/////////////////////////


	/**	 The entity searchListPixelArt_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<PixelArt> searchListPixelArt_;

	/**	<br> The entity searchListPixelArt_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:searchListPixelArt_">Find the entity searchListPixelArt_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListPixelArt_(Wrap<SearchList<PixelArt>> w);

	public SearchList<PixelArt> getSearchListPixelArt_() {
		return searchListPixelArt_;
	}

	public void setSearchListPixelArt_(SearchList<PixelArt> searchListPixelArt_) {
		this.searchListPixelArt_ = searchListPixelArt_;
	}
	public static SearchList<PixelArt> staticSetSearchListPixelArt_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PixelArtGenPage searchListPixelArt_Init() {
		Wrap<SearchList<PixelArt>> searchListPixelArt_Wrap = new Wrap<SearchList<PixelArt>>().var("searchListPixelArt_");
		if(searchListPixelArt_ == null) {
			_searchListPixelArt_(searchListPixelArt_Wrap);
			setSearchListPixelArt_(searchListPixelArt_Wrap.o);
		}
		return (PixelArtGenPage)this;
	}


























	//////////////////
	// listPixelArt //
	//////////////////


	/**	 The entity listPixelArt
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listPixelArt = new JsonArray();

	/**	<br> The entity listPixelArt
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:listPixelArt">Find the entity listPixelArt in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listPixelArt(JsonArray l);

	public JsonArray getListPixelArt() {
		return listPixelArt;
	}

	public void setListPixelArt(JsonArray listPixelArt) {
		this.listPixelArt = listPixelArt;
	}
	public static JsonArray staticSetListPixelArt(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PixelArtGenPage listPixelArtInit() {
		_listPixelArt(listPixelArt);
		return (PixelArtGenPage)this;
	}

	///////////////////
	// pixelArtCount //
	///////////////////


	/**	 The entity pixelArtCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer pixelArtCount;

	/**	<br> The entity pixelArtCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:pixelArtCount">Find the entity pixelArtCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pixelArtCount(Wrap<Integer> w);

	public Integer getPixelArtCount() {
		return pixelArtCount;
	}

	public void setPixelArtCount(Integer pixelArtCount) {
		this.pixelArtCount = pixelArtCount;
	}
	@JsonIgnore
	public void setPixelArtCount(String o) {
		this.pixelArtCount = PixelArtGenPage.staticSetPixelArtCount(siteRequest_, o);
	}
	public static Integer staticSetPixelArtCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected PixelArtGenPage pixelArtCountInit() {
		Wrap<Integer> pixelArtCountWrap = new Wrap<Integer>().var("pixelArtCount");
		if(pixelArtCount == null) {
			_pixelArtCount(pixelArtCountWrap);
			setPixelArtCount(pixelArtCountWrap.o);
		}
		return (PixelArtGenPage)this;
	}

	public static Integer staticSearchPixelArtCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrPixelArtCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPixelArtCount(SiteRequestEnUS siteRequest_, String o) {
		return PixelArtGenPage.staticSearchStrPixelArtCount(siteRequest_, PixelArtGenPage.staticSearchPixelArtCount(siteRequest_, PixelArtGenPage.staticSetPixelArtCount(siteRequest_, o)));
	}

	///////////////
	// pixelArt_ //
	///////////////


	/**	 The entity pixelArt_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected PixelArt pixelArt_;

	/**	<br> The entity pixelArt_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:pixelArt_">Find the entity pixelArt_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pixelArt_(Wrap<PixelArt> w);

	public PixelArt getPixelArt_() {
		return pixelArt_;
	}

	public void setPixelArt_(PixelArt pixelArt_) {
		this.pixelArt_ = pixelArt_;
	}
	public static PixelArt staticSetPixelArt_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected PixelArtGenPage pixelArt_Init() {
		Wrap<PixelArt> pixelArt_Wrap = new Wrap<PixelArt>().var("pixelArt_");
		if(pixelArt_ == null) {
			_pixelArt_(pixelArt_Wrap);
			setPixelArt_(pixelArt_Wrap.o);
		}
		return (PixelArtGenPage)this;
	}

	////////
	// pk //
	////////


	/**	 The entity pk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pk;

	/**	<br> The entity pk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pk(Wrap<Long> w);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}
	@JsonIgnore
	public void setPk(String o) {
		this.pk = PixelArtGenPage.staticSetPk(siteRequest_, o);
	}
	public static Long staticSetPk(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected PixelArtGenPage pkInit() {
		Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
		if(pk == null) {
			_pk(pkWrap);
			setPk(pkWrap.o);
		}
		return (PixelArtGenPage)this;
	}

	public static Long staticSearchPk(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPk(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPk(SiteRequestEnUS siteRequest_, String o) {
		return PixelArtGenPage.staticSearchStrPk(siteRequest_, PixelArtGenPage.staticSearchPk(siteRequest_, PixelArtGenPage.staticSetPk(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = PixelArtGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PixelArtGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (PixelArtGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return PixelArtGenPage.staticSearchStrId(siteRequest_, PixelArtGenPage.staticSearchId(siteRequest_, PixelArtGenPage.staticSetId(siteRequest_, o)));
	}












	/////////////////////
	// pageUriPixelArt //
	/////////////////////


	/**	 The entity pageUriPixelArt
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriPixelArt;

	/**	<br> The entity pageUriPixelArt
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArtGenPage&fq=entiteVar_enUS_indexed_string:pageUriPixelArt">Find the entity pageUriPixelArt in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriPixelArt(Wrap<String> c);

	public String getPageUriPixelArt() {
		return pageUriPixelArt;
	}
	public void setPageUriPixelArt(String o) {
		this.pageUriPixelArt = PixelArtGenPage.staticSetPageUriPixelArt(siteRequest_, o);
	}
	public static String staticSetPageUriPixelArt(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PixelArtGenPage pageUriPixelArtInit() {
		Wrap<String> pageUriPixelArtWrap = new Wrap<String>().var("pageUriPixelArt");
		if(pageUriPixelArt == null) {
			_pageUriPixelArt(pageUriPixelArtWrap);
			setPageUriPixelArt(pageUriPixelArtWrap.o);
		}
		return (PixelArtGenPage)this;
	}

	public static String staticSearchPageUriPixelArt(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriPixelArt(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriPixelArt(SiteRequestEnUS siteRequest_, String o) {
		return PixelArtGenPage.staticSearchStrPageUriPixelArt(siteRequest_, PixelArtGenPage.staticSearchPageUriPixelArt(siteRequest_, PixelArtGenPage.staticSetPageUriPixelArt(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPixelArtGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPixelArtGenPage();
	}

	public Future<Void> promiseDeepPixelArtGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePixelArtGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModelPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promisePixelArtGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListPixelArt_Init();
				listPixelArtInit();
				pixelArtCountInit();
				pixelArt_Init();
				pkInit();
				idInit();
				pageUriPixelArtInit();
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
		return promiseDeepPixelArtGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPixelArtGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModelPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPixelArtGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPixelArtGenPage(v);
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
	public Object obtainPixelArtGenPage(String var) {
		PixelArtGenPage oPixelArtGenPage = (PixelArtGenPage)this;
		switch(var) {
			case "searchListPixelArt_":
				return oPixelArtGenPage.searchListPixelArt_;
			case "listPixelArt":
				return oPixelArtGenPage.listPixelArt;
			case "pixelArtCount":
				return oPixelArtGenPage.pixelArtCount;
			case "pixelArt_":
				return oPixelArtGenPage.pixelArt_;
			case "pk":
				return oPixelArtGenPage.pk;
			case "id":
				return oPixelArtGenPage.id;
			case "pageUriPixelArt":
				return oPixelArtGenPage.pageUriPixelArt;
			default:
				return super.obtainBaseModelPage(var);
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
				o = relatePixelArtGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePixelArtGenPage(String var, Object val) {
		PixelArtGenPage oPixelArtGenPage = (PixelArtGenPage)this;
		switch(var) {
			default:
				return super.relateBaseModelPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPixelArtGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPixelArtGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pixelArtCount":
			return PixelArtGenPage.staticSetPixelArtCount(siteRequest_, o);
		case "pk":
			return PixelArtGenPage.staticSetPk(siteRequest_, o);
		case "id":
			return PixelArtGenPage.staticSetId(siteRequest_, o);
		case "pageUriPixelArt":
			return PixelArtGenPage.staticSetPageUriPixelArt(siteRequest_, o);
			default:
				return BaseModelPage.staticSetBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPixelArtGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPixelArtGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pixelArtCount":
			return PixelArtGenPage.staticSearchPixelArtCount(siteRequest_, (Integer)o);
		case "pk":
			return PixelArtGenPage.staticSearchPk(siteRequest_, (Long)o);
		case "id":
			return PixelArtGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriPixelArt":
			return PixelArtGenPage.staticSearchPageUriPixelArt(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPixelArtGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPixelArtGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "pixelArtCount":
			return PixelArtGenPage.staticSearchStrPixelArtCount(siteRequest_, (Integer)o);
		case "pk":
			return PixelArtGenPage.staticSearchStrPk(siteRequest_, (Long)o);
		case "id":
			return PixelArtGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriPixelArt":
			return PixelArtGenPage.staticSearchStrPageUriPixelArt(siteRequest_, (String)o);
			default:
				return BaseModelPage.staticSearchStrBaseModelPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPixelArtGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPixelArtGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "pixelArtCount":
			return PixelArtGenPage.staticSearchFqPixelArtCount(siteRequest_, o);
		case "pk":
			return PixelArtGenPage.staticSearchFqPk(siteRequest_, o);
		case "id":
			return PixelArtGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriPixelArt":
			return PixelArtGenPage.staticSearchFqPageUriPixelArt(siteRequest_, o);
			default:
				return BaseModelPage.staticSearchFqBaseModelPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "PixelArtGenPage";
	public static final String VAR_searchListPixelArt_ = "searchListPixelArt_";
	public static final String VAR_listPixelArt = "listPixelArt";
	public static final String VAR_pixelArtCount = "pixelArtCount";
	public static final String VAR_pixelArt_ = "pixelArt_";
	public static final String VAR_pk = "pk";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriPixelArt = "pageUriPixelArt";

	public static final String DISPLAY_NAME_searchListPixelArt_ = "";
	public static final String DISPLAY_NAME_listPixelArt = "";
	public static final String DISPLAY_NAME_pixelArtCount = "";
	public static final String DISPLAY_NAME_pixelArt_ = "";
	public static final String DISPLAY_NAME_pk = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriPixelArt = "";

	public static String displayNameForClass(String var) {
		return PixelArtGenPage.displayNamePixelArtGenPage(var);
	}
	public static String displayNamePixelArtGenPage(String var) {
		switch(var) {
		case VAR_searchListPixelArt_:
			return DISPLAY_NAME_searchListPixelArt_;
		case VAR_listPixelArt:
			return DISPLAY_NAME_listPixelArt;
		case VAR_pixelArtCount:
			return DISPLAY_NAME_pixelArtCount;
		case VAR_pixelArt_:
			return DISPLAY_NAME_pixelArt_;
		case VAR_pk:
			return DISPLAY_NAME_pk;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriPixelArt:
			return DISPLAY_NAME_pageUriPixelArt;
		default:
			return BaseModelPage.displayNameBaseModelPage(var);
		}
	}
}
