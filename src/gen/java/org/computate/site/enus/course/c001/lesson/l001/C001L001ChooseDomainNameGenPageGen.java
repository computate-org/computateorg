package org.computate.site.enus.course.c001.lesson.l001;

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
import org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
 * <h1>Suggestions that can generate more code for you: </h1>
 * <ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class C001L001ChooseDomainNameGenPageGen into the class C001L001ChooseDomainNameGenPage. 
 * </li>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these C001L001ChooseDomainNameGenPage objects in a RESTful API. 
 * </li>
 * </ol>
 * <h1>About the C001L001ChooseDomainNameGenPage class and it's generated class C001L001ChooseDomainNameGenPageGen&lt;C001Page&gt;: </h1>
 * <p>
 * This Java class extends a generated Java class built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNameGenPage">Find the class C001L001ChooseDomainNameGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * <p>
 * Delete the class C001L001ChooseDomainNameGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNameGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.course.c001.lesson.l001 in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class C001L001ChooseDomainNameGenPageGen<DEV> extends C001Page {
	protected static final Logger LOG = LoggerFactory.getLogger(C001L001ChooseDomainNameGenPage.class);

	///////////////////////////////
	// c001L001ChooseDomainName_ //
	///////////////////////////////

	/**	 The entity c001L001ChooseDomainName_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected C001L001ChooseDomainName c001L001ChooseDomainName_;

	/**	<br> The entity c001L001ChooseDomainName_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNameGenPage&fq=entiteVar_enUS_indexed_string:c001L001ChooseDomainName_">Find the entity c001L001ChooseDomainName_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _c001L001ChooseDomainName_(Wrap<C001L001ChooseDomainName> w);

	public C001L001ChooseDomainName getC001L001ChooseDomainName_() {
		return c001L001ChooseDomainName_;
	}

	public void setC001L001ChooseDomainName_(C001L001ChooseDomainName c001L001ChooseDomainName_) {
		this.c001L001ChooseDomainName_ = c001L001ChooseDomainName_;
	}
	public static C001L001ChooseDomainName staticSetC001L001ChooseDomainName_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected C001L001ChooseDomainNameGenPage c001L001ChooseDomainName_Init() {
		Wrap<C001L001ChooseDomainName> c001L001ChooseDomainName_Wrap = new Wrap<C001L001ChooseDomainName>().var("c001L001ChooseDomainName_");
		if(c001L001ChooseDomainName_ == null) {
			_c001L001ChooseDomainName_(c001L001ChooseDomainName_Wrap);
			setC001L001ChooseDomainName_(c001L001ChooseDomainName_Wrap.o);
		}
		return (C001L001ChooseDomainNameGenPage)this;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001L001ChooseDomainNameGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001L001ChooseDomainNameGenPage();
	}

	public Future<Void> promiseDeepC001L001ChooseDomainNameGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001L001ChooseDomainNameGenPage(promise2);
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

	public Future<Void> promiseC001L001ChooseDomainNameGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				c001L001ChooseDomainName_Init();
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
		return promiseDeepC001L001ChooseDomainNameGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001L001ChooseDomainNameGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestC001Page(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001L001ChooseDomainNameGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001L001ChooseDomainNameGenPage(v);
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
	public Object obtainC001L001ChooseDomainNameGenPage(String var) {
		C001L001ChooseDomainNameGenPage oC001L001ChooseDomainNameGenPage = (C001L001ChooseDomainNameGenPage)this;
		switch(var) {
			case "c001L001ChooseDomainName_":
				return oC001L001ChooseDomainNameGenPage.c001L001ChooseDomainName_;
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
				o = relateC001L001ChooseDomainNameGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001L001ChooseDomainNameGenPage(String var, Object val) {
		C001L001ChooseDomainNameGenPage oC001L001ChooseDomainNameGenPage = (C001L001ChooseDomainNameGenPage)this;
		switch(var) {
			default:
				return super.relateC001Page(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001L001ChooseDomainNameGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return C001Page.staticSetC001Page(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001L001ChooseDomainNameGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return C001Page.staticSearchC001Page(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001L001ChooseDomainNameGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return C001Page.staticSearchStrC001Page(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001L001ChooseDomainNameGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
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

	public static final String CLASS_SIMPLE_NAME = "C001L001ChooseDomainNameGenPage";
	public static final String VAR_c001L001ChooseDomainName_ = "c001L001ChooseDomainName_";

	public static final String DISPLAY_NAME_c001L001ChooseDomainName_ = "";

	public static String displayNameForClass(String var) {
		return C001L001ChooseDomainNameGenPage.displayNameC001L001ChooseDomainNameGenPage(var);
	}
	public static String displayNameC001L001ChooseDomainNameGenPage(String var) {
		switch(var) {
		case VAR_c001L001ChooseDomainName_:
			return DISPLAY_NAME_c001L001ChooseDomainName_;
		default:
			return C001Page.displayNameC001Page(var);
		}
	}
}
