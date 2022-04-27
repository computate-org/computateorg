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
import org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNameGenPage;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNamePage">Find the class C001L001ChooseDomainNamePage in Solr. </a>
 * <br><br>Delete the class C001L001ChooseDomainNamePage in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainNamePage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.course.c001.lesson.l001 in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001.lesson.l001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class C001L001ChooseDomainNamePageGen<DEV> extends C001L001ChooseDomainNameGenPage {
	protected static final Logger LOG = LoggerFactory.getLogger(C001L001ChooseDomainNamePage.class);

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001L001ChooseDomainNamePage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001L001ChooseDomainNamePage();
	}

	public Future<Void> promiseDeepC001L001ChooseDomainNamePage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001L001ChooseDomainNamePage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepC001L001ChooseDomainNameGenPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001L001ChooseDomainNamePage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
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
		return promiseDeepC001L001ChooseDomainNamePage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001L001ChooseDomainNamePage(SiteRequestEnUS siteRequest_) {
			super.siteRequestC001L001ChooseDomainNameGenPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001L001ChooseDomainNamePage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001L001ChooseDomainNamePage(v);
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
	public Object obtainC001L001ChooseDomainNamePage(String var) {
		C001L001ChooseDomainNamePage oC001L001ChooseDomainNamePage = (C001L001ChooseDomainNamePage)this;
		switch(var) {
			default:
				return super.obtainC001L001ChooseDomainNameGenPage(var);
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
				o = relateC001L001ChooseDomainNamePage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001L001ChooseDomainNamePage(String var, Object val) {
		C001L001ChooseDomainNamePage oC001L001ChooseDomainNamePage = (C001L001ChooseDomainNamePage)this;
		switch(var) {
			default:
				return super.relateC001L001ChooseDomainNameGenPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001L001ChooseDomainNamePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001L001ChooseDomainNamePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return C001L001ChooseDomainNameGenPage.staticSetC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001L001ChooseDomainNamePage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001L001ChooseDomainNamePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return C001L001ChooseDomainNameGenPage.staticSearchC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001L001ChooseDomainNamePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001L001ChooseDomainNamePage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return C001L001ChooseDomainNameGenPage.staticSearchStrC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001L001ChooseDomainNamePage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001L001ChooseDomainNamePage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return C001L001ChooseDomainNameGenPage.staticSearchFqC001L001ChooseDomainNameGenPage(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "C001L001ChooseDomainNamePage";


	public static String displayNameForClass(String var) {
		return C001L001ChooseDomainNamePage.displayNameC001L001ChooseDomainNamePage(var);
	}
	public static String displayNameC001L001ChooseDomainNamePage(String var) {
		switch(var) {
		default:
			return C001L001ChooseDomainNameGenPage.displayNameC001L001ChooseDomainNameGenPage(var);
		}
	}
}
