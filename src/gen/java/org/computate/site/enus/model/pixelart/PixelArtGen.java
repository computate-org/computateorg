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
 * <h1>About the PixelArt class and it's generated class PixelArtGen&lt;BaseModel&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.pixelart.PixelArt">Find the class PixelArt in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>This class contains a comment "Model: true", which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <p>This class contains a comment "Indexed: true", which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <p>This class contains a comment "Page: true", which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.site.enus.model.pixelart.PixelArtPage. 
 * </p>
 * <p>This class contains a comment "SuperPage.enUS: BaseModelPage", which identifies the Java super class of the page code by it's class simple name "BaseModelPage". 
 * This means that the newly created class org.computate.site.enus.model.pixelart.PixelArtPage extends org.computate.site.enus.model.base.BaseModelPage. 
 * </p>
 * <p>This class contains a comment "Api: true", which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <p>This class contains a comment "ApiTag: Pixel Art", which groups all of the OpenAPIs for PixelArt objects under the tag "Pixel Art". 
 * </p>
 * <p>This class contains a comment "ApiUri: /api/pixel-art", which defines the base API URI for PixelArt objects as "/api/pixel-art" in the OpenAPI spec. 
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
	public static final String PixelArt_NameVar_enUS = "pixelArt";
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
		switch(var.toLowerCase()) {
			case "base64data":
				if(val instanceof String)
					setBase64Data((String)val);
				saves.add("base64Data");
				return val;
			case "pixelartname":
				if(val instanceof String)
					setPixelArtName((String)val);
				saves.add("pixelArtName");
				return val;
			default:
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
