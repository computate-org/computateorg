package org.computate.site.enus.model.pixelart;

import org.computate.site.enus.request.SiteRequestEnUS;
import org.computate.site.enus.model.base.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
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
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <h3>About the PixelArt class and it's generated class PixelArtGen&lt;BaseModel&gt;: </h3>extends PixelArtGen
 * <p>
 * This Java class extends a generated Java class PixelArtGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArt">Find the class PixelArt in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends PixelArtGen<BaseModel>
 * <p>This <code>class PixelArt extends PixelArtGen&lt;BaseModel&gt;</code>, which means it extends a newly generated PixelArtGen. 
 * The generated <code>class PixelArtGen extends BaseModel</code> which means that PixelArt extends PixelArtGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * Api: true
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * ApiTag.enUS: Pixel Art
 * <p>This class contains a comment <b>"ApiTag: Pixel Art"</b>, which groups all of the OpenAPIs for PixelArt objects under the tag "Pixel Art". 
 * </p>
 * ApiUri.enUS: /api/pixel-art
 * <p>This class contains a comment <b>"ApiUri: /api/pixel-art"</b>, which defines the base API URI for PixelArt objects as "/api/pixel-art" in the OpenAPI spec. 
 * </p>
 * Color: blue
 * <p>This class contains a comment <b>"Color: blue"</b>, which styles the PixelArt page "blue". 
 * This will reference a CSS class defined by the stylesheets in the project that starts with "w3-". 
 * A css class of "w3-blue" is expected to exist in the project stylesheets, and is inspired by W3 CSS colors. 
 * See: <a href="https://www.w3schools.com/w3css/w3css_colors.asp">https://www.w3schools.com/w3css/w3css_colors.asp</a>. 
 * </p>
 * IconGroup: thin
 * <p>This class contains a comment <b>"IconGroup: thin"</b>, which adds icons on the PixelArt page with a group of "thin". 
 * This will reference a Font Awesome icon group that starts with "fa-" followed by the icon group "thin", together is "fa-thin". 
 * A Font Awesome icon group of "thin" is expected to exist. 
 * The Font Awesome groups currently supported include: solid, regular, light, thin, duotone, and sharp. 
 * See: <a href="https://fontawesome.com/docs/web/dig-deeper/styles">https://fontawesome.com/docs/web/dig-deeper/styles</a>. 
 * </p>
 * IconName: table-cells
 * <p>This class contains a comment <b>"IconName: table-cells"</b>, which adds icons on the PixelArt page with a name of "table-cells". 
 * This will reference a Font Awesome icon that starts with the icon group "fa-thin fa-" followed by the icon name, which is "fa-thin fa-table-cells". 
 * A Font Awesome icon of "fa-thin fa-table-cells" is expected to exist. 
 * See: <a href="https://fontawesome.com/icons">https://fontawesome.com/icons</a>. 
 * </p>
 * Indexed: true
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * {@inheritDoc}
 * <p>By adding a class comment "{@inheritDoc}", the PixelArt class will inherit the helpful inherited class comments from the super class PixelArtGen. 
 * </p>
 * Rows: 10
 * <p>This class contains a comment <b>"Rows: 10"</b>, which means the PixelArt API will return a default of 10 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * Model: true
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * Page: true
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.site.enus.model.pixelart.PixelArtPage. 
 * </p>
 * SuperPage.enUS: BaseModelPage
 * <p>This class contains a comment <b>"SuperPage.enUS: BaseModelPage"</b>, which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.site.enus.model.pixelart.PixelArtPage extends org.computate.site.enus.model.base.BaseModelPage. 
 * </p>
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the PixelArt Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Role.enUS: SiteAdmin
 * <p>
 * This class contains a comment <b>"Role.enUS: SiteAdmin"</b>, which identifies the default role name "SiteAdmin" of the OAuth2/OpenID Connect user role required to access this PixelArt API. 
 * It's possible to reconfigure the roles required to access the PixelArt API by configuring an environment variable like this: 
 * </p>
 * <pre>AUTH_ROLES_REQUIRED_PixelArt: ["SiteAdmin"]</pre>
 * AName: a pixel art
 * <p>This class contains a comment <b>"AName.enUS: a pixel art"</b>, which identifies the language context to describe a PixelArt as "a pixel art". 
 * </p>
 * <p>
 * Delete the class PixelArt in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArt&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
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
public abstract class PixelArtGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(PixelArt.class);

	public static final String PixelArt_AName_enUS = "a pixel art";
	public static final String PixelArt_This_enUS = "this ";
	public static final String PixelArt_ThisName_enUS = "this pixel art";
	public static final String PixelArt_A_enUS = "a ";
	public static final String PixelArt_TheName_enUS = "the pixel art";
	public static final String PixelArt_NameSingular_enUS = "pixel art";
	public static final String PixelArt_NamePlural_enUS = "pixel arts";
	public static final String PixelArt_NameActual_enUS = "current pixel art";
	public static final String PixelArt_AllName_enUS = "all the pixel arts";
	public static final String PixelArt_SearchAllNameBy_enUS = "search pixel arts by ";
	public static final String PixelArt_Title_enUS = "pixel arts";
	public static final String PixelArt_ThePluralName_enUS = "the pixel arts";
	public static final String PixelArt_NoNameFound_enUS = "no pixel art found";
	public static final String PixelArt_ApiUri_enUS = "/api/pixel-art";
	public static final String PixelArt_ApiUriSearchPage_enUS = "/pixel-art";
	public static final String PixelArt_OfName_enUS = "of pixel art";
	public static final String PixelArt_ANameAdjective_enUS = "a pixel art";
	public static final String PixelArt_NameAdjectiveSingular_enUS = "pixel art";
	public static final String PixelArt_NameAdjectivePlural_enUS = "pixel arts";
	public static final String Search_enUS_Uri = "/api/pixel-art";
	public static final String Search_enUS_ImageUri = "/png/api/pixel-art-999.png";
	public static final String GET_enUS_Uri = "/api/pixel-art/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/pixel-art/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/pixel-art";
	public static final String PATCH_enUS_ImageUri = "/png/api/pixel-art-999.png";
	public static final String POST_enUS_Uri = "/api/pixel-art";
	public static final String POST_enUS_ImageUri = "/png/api/pixel-art-999.png";
	public static final String PUTImport_enUS_Uri = "/api/pixel-art-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/pixel-art-import-999.png";
	public static final String SearchPage_enUS_Uri = "/pixel-art";
	public static final String SearchPage_enUS_ImageUri = "/png/pixel-art-999.png";

	public static final String PixelArt_Color = "blue";
	public static final String PixelArt_IconGroup = "thin";
	public static final String PixelArt_IconName = "table-cells";
	public static final Integer PixelArt_Rows = 10;

	////////////////
	// base64Data //
	////////////////


	/**	 The entity base64Data
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String base64Data;

	/**	<br> The entity base64Data
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArt&fq=entiteVar_enUS_indexed_string:base64Data">Find the entity base64Data in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _base64Data(Wrap<String> w);

	public String getBase64Data() {
		return base64Data;
	}
	public void setBase64Data(String o) {
		this.base64Data = PixelArt.staticSetBase64Data(siteRequest_, o);
	}
	public static String staticSetBase64Data(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PixelArt base64DataInit() {
		Wrap<String> base64DataWrap = new Wrap<String>().var("base64Data");
		if(base64Data == null) {
			_base64Data(base64DataWrap);
			setBase64Data(base64DataWrap.o);
		}
		return (PixelArt)this;
	}

	public static String staticSearchBase64Data(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrBase64Data(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqBase64Data(SiteRequestEnUS siteRequest_, String o) {
		return PixelArt.staticSearchStrBase64Data(siteRequest_, PixelArt.staticSearchBase64Data(siteRequest_, PixelArt.staticSetBase64Data(siteRequest_, o)));
	}

	public String sqlBase64Data() {
		return base64Data;
	}

	//////////////////
	// pixelArtName //
	//////////////////


	/**	 The entity pixelArtName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pixelArtName;

	/**	<br> The entity pixelArtName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArt&fq=entiteVar_enUS_indexed_string:pixelArtName">Find the entity pixelArtName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pixelArtName(Wrap<String> w);

	public String getPixelArtName() {
		return pixelArtName;
	}
	public void setPixelArtName(String o) {
		this.pixelArtName = PixelArt.staticSetPixelArtName(siteRequest_, o);
	}
	public static String staticSetPixelArtName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected PixelArt pixelArtNameInit() {
		Wrap<String> pixelArtNameWrap = new Wrap<String>().var("pixelArtName");
		if(pixelArtName == null) {
			_pixelArtName(pixelArtNameWrap);
			setPixelArtName(pixelArtNameWrap.o);
		}
		return (PixelArt)this;
	}

	public static String staticSearchPixelArtName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPixelArtName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPixelArtName(SiteRequestEnUS siteRequest_, String o) {
		return PixelArt.staticSearchStrPixelArtName(siteRequest_, PixelArt.staticSearchPixelArtName(siteRequest_, PixelArt.staticSetPixelArtName(siteRequest_, o)));
	}

	public String sqlPixelArtName() {
		return pixelArtName;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepPixelArt(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepPixelArt();
	}

	public Future<Void> promiseDeepPixelArt() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promisePixelArt(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promisePixelArt(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				base64DataInit();
				pixelArtNameInit();
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
		return promiseDeepPixelArt(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestPixelArt(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestPixelArt(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainPixelArt(v);
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
	public Object obtainPixelArt(String var) {
		PixelArt oPixelArt = (PixelArt)this;
		switch(var) {
			case "base64Data":
				return oPixelArt.base64Data;
			case "pixelArtName":
				return oPixelArt.pixelArtName;
			default:
				return super.obtainBaseModel(var);
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
				o = relatePixelArt(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relatePixelArt(String var, Object val) {
		PixelArt oPixelArt = (PixelArt)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetPixelArt(entityVar,  siteRequest_, o);
	}
	public static Object staticSetPixelArt(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "base64Data":
			return PixelArt.staticSetBase64Data(siteRequest_, o);
		case "pixelArtName":
			return PixelArt.staticSetPixelArtName(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchPixelArt(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchPixelArt(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "base64Data":
			return PixelArt.staticSearchBase64Data(siteRequest_, (String)o);
		case "pixelArtName":
			return PixelArt.staticSearchPixelArtName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrPixelArt(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrPixelArt(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "base64Data":
			return PixelArt.staticSearchStrBase64Data(siteRequest_, (String)o);
		case "pixelArtName":
			return PixelArt.staticSearchStrPixelArtName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqPixelArt(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqPixelArt(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "base64Data":
			return PixelArt.staticSearchFqBase64Data(siteRequest_, o);
		case "pixelArtName":
			return PixelArt.staticSearchFqPixelArtName(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
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
					o = persistPixelArt(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistPixelArt(String var, Object val) {
		String varLower = var.toLowerCase();
			if("base64data".equals(varLower)) {
				if(val instanceof String) {
					setBase64Data((String)val);
				}
				saves.add("base64Data");
				return val;
			} else if("pixelartname".equals(varLower)) {
				if(val instanceof String) {
					setPixelArtName((String)val);
				}
				saves.add("pixelArtName");
				return val;
		} else {
			return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populatePixelArt(doc);
	}
	public void populatePixelArt(SolrResponse.Doc doc) {
		PixelArt oPixelArt = (PixelArt)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("base64Data")) {
				String base64Data = (String)doc.get("base64Data_stored_string");
				if(base64Data != null)
					oPixelArt.setBase64Data(base64Data);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexPixelArt(JsonObject doc) {
		if(base64Data != null) {
			doc.put("base64Data_stored_string", base64Data);
		}
		if(pixelArtName != null) {
			doc.put("pixelArtName_docvalues_string", pixelArtName);
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredPixelArt(String entityVar) {
		switch(entityVar) {
			case "base64Data":
				return "base64Data_stored_string";
			case "pixelArtName":
				return "pixelArtName_docvalues_string";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedPixelArt(String entityVar) {
		switch(entityVar) {
			case "pixelArtName":
				return "pixelArtName_docvalues_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String searchVarPixelArt(String searchVar) {
		switch(searchVar) {
			case "pixelArtName_docvalues_string":
				return "pixelArtName";
			default:
				return BaseModel.searchVarBaseModel(searchVar);
		}
	}

	public static String varSearchPixelArt(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedPixelArt(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storePixelArt(doc);
	}
	public void storePixelArt(SolrResponse.Doc doc) {
		PixelArt oPixelArt = (PixelArt)this;

		oPixelArt.setBase64Data(Optional.ofNullable(doc.get("base64Data_stored_string")).map(v -> v.toString()).orElse(null));
		oPixelArt.setPixelArtName(Optional.ofNullable(doc.get("pixelArtName_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestPixelArt() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof PixelArt) {
			PixelArt original = (PixelArt)o;
			if(!Objects.equals(base64Data, original.getBase64Data()))
				apiRequest.addVars("base64Data");
			if(!Objects.equals(pixelArtName, original.getPixelArtName()))
				apiRequest.addVars("pixelArtName");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(base64Data).map(v -> "base64Data: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pixelArtName).map(v -> "pixelArtName: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "PixelArt";
	public static final String VAR_base64Data = "base64Data";
	public static final String VAR_pixelArtName = "pixelArtName";

	public static List<String> varsQForClass() {
		return PixelArt.varsQPixelArt(new ArrayList<String>());
	}
	public static List<String> varsQPixelArt(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return PixelArt.varsFqPixelArt(new ArrayList<String>());
	}
	public static List<String> varsFqPixelArt(List<String> vars) {
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return PixelArt.varsRangePixelArt(new ArrayList<String>());
	}
	public static List<String> varsRangePixelArt(List<String> vars) {
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_base64Data = "base64 data";
	public static final String DISPLAY_NAME_pixelArtName = "base64 data";

	public static String displayNameForClass(String var) {
		return PixelArt.displayNamePixelArt(var);
	}
	public static String displayNamePixelArt(String var) {
		switch(var) {
		case VAR_base64Data:
			return DISPLAY_NAME_base64Data;
		case VAR_pixelArtName:
			return DISPLAY_NAME_pixelArtName;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNamePixelArt(String var) {
		switch(var) {
		case VAR_base64Data:
			return "String";
		case VAR_pixelArtName:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowPixelArt(String var) {
		switch(var) {
		case VAR_base64Data:
			return 4;
		case VAR_pixelArtName:
			return 4;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellPixelArt(String var) {
		switch(var) {
		case VAR_base64Data:
			return 1;
		case VAR_pixelArtName:
			return 2;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minPixelArt(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
