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
import org.computate.site.enus.course.Course;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001">Find the class C001 in Solr. </a>
 * <br><br>Delete the class C001 in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.course.c001.C001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.course.c001 in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.course.c001&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class C001Gen<DEV> extends Course {
	protected static final Logger LOG = LoggerFactory.getLogger(C001.class);

	public static final String C001_AName_frFR = "un cours n ° 1";
	public static final String C001_This_frFR = "ce ";
	public static final String C001_ThisName_frFR = "ce cours n ° 1";
	public static final String C001_A_frFR = "un ";
	public static final String C001_TheName_frFR = "le cours n ° 1";
	public static final String C001_NameSingular_frFR = "cours n ° 1";
	public static final String C001_NamePlural_frFR = "courses";
	public static final String C001_NameActual_frFR = "cours n ° 1 actuel";
	public static final String C001_AllName_frFR = "tous les courses";
	public static final String C001_SearchAllNameBy_frFR = "rechercher courses par ";
	public static final String C001_SearchAllName_frFR = "rechercher courses";
	public static final String C001_H1_frFR = "Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ";
	public static final String C001_H2_frFR = "Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. ";
	public static final String C001_Title_frFR = "courses";
	public static final String C001_ThePluralName_frFR = "les courses";
	public static final String C001_NoNameFound_frFR = "aucun cours n ° 1 trouvé";
	public static final String C001_NameVar_frFR = "coursN°1";
	public static final String C001_OfName_frFR = "de cours n ° 1";
	public static final String C001_NameAdjectiveSingular_frFR = "cours n ° 1";
	public static final String C001_NameAdjectivePlural_frFR = "courses";
	public static final String SearchPage_frFR_Uri = "null/{id}";
	public static final String SearchPage_frFR_ImageUri = "/pngnull/{id}-999.png";

	public static final String C001_AName_enUS = "a course #1";
	public static final String C001_This_enUS = "this ";
	public static final String C001_ThisName_enUS = "this course #1";
	public static final String C001_A_enUS = "a ";
	public static final String C001_TheName_enUS = "the course #1";
	public static final String C001_NameSingular_enUS = "course #1";
	public static final String C001_NamePlural_enUS = "course #1s";
	public static final String C001_NameActual_enUS = "current course #1";
	public static final String C001_AllName_enUS = "all the course #1s";
	public static final String C001_SearchAllNameBy_enUS = "search course #1s by ";
	public static final String C001_H1_enUS = "Build modern asynchronous web applications with the best open source software. ";
	public static final String C001_H2_enUS = "With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. ";
	public static final String C001_Title_enUS = "course #1s";
	public static final String C001_ThePluralName_enUS = "the course #1s";
	public static final String C001_NoNameFound_enUS = "no course #1 found";
	public static final String C001_NameVar_enUS = "course#1";
	public static final String C001_OfName_enUS = "of course #1";
	public static final String C001_ANameAdjective_enUS = "a course #1";
	public static final String C001_NameAdjectiveSingular_enUS = "course #1";
	public static final String C001_NameAdjectivePlural_enUS = "course #1s";
	public static final String SearchPage_enUS_Uri = "/enUS/course/001";
	public static final String SearchPage_enUS_ImageUri = "/png/enUS/course/001-999.png";

	public static final String C001_Color = "green";
	public static final String C001_IconGroup = "regular";
	public static final String C001_IconName = "university";

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepC001(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepC001();
	}

	public Future<Void> promiseDeepC001() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseC001(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepCourse(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseC001(Promise<Void> promise) {
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
		return promiseDeepC001(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestC001(SiteRequestEnUS siteRequest_) {
			super.siteRequestCourse(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestC001(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainC001(v);
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
	public Object obtainC001(String var) {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.obtainCourse(var);
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
				o = relateC001(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateC001(String var, Object val) {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.relateCourse(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetC001(entityVar,  siteRequest_, o);
	}
	public static Object staticSetC001(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return Course.staticSetCourse(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchC001(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchC001(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return Course.staticSearchCourse(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrC001(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrC001(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return Course.staticSearchStrCourse(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqC001(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqC001(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return Course.staticSearchFqCourse(entityVar,  siteRequest_, o);
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
					o = persistC001(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistC001(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistCourse(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateC001(doc);
	}
	public void populateC001(SolrResponse.Doc doc) {
		C001 oC001 = (C001)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateCourse(doc);
	}

	public void indexC001(JsonObject doc) {
		super.indexCourse(doc);

	}

	public static String varStoredC001(String entityVar) {
		switch(entityVar) {
			default:
				return Course.varStoredCourse(entityVar);
		}
	}

	public static String varIndexedC001(String entityVar) {
		switch(entityVar) {
			default:
				return Course.varIndexedCourse(entityVar);
		}
	}

	public static String varSearchC001(String entityVar) {
		switch(entityVar) {
			default:
				return Course.varSearchCourse(entityVar);
		}
	}

	public static String varSuggestedC001(String entityVar) {
		switch(entityVar) {
			default:
				return Course.varSuggestedCourse(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeC001(doc);
	}
	public void storeC001(SolrResponse.Doc doc) {
		C001 oC001 = (C001)this;


		super.storeCourse(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestC001() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof C001) {
			C001 original = (C001)o;
			super.apiRequestCourse();
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

	public static final String CLASS_SIMPLE_NAME = "C001";

	public static List<String> varsQForClass() {
		return C001.varsQC001(new ArrayList<String>());
	}
	public static List<String> varsQC001(List<String> vars) {
		Course.varsQCourse(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return C001.varsFqC001(new ArrayList<String>());
	}
	public static List<String> varsFqC001(List<String> vars) {
		Course.varsFqCourse(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return C001.varsRangeC001(new ArrayList<String>());
	}
	public static List<String> varsRangeC001(List<String> vars) {
		Course.varsRangeCourse(vars);
		return vars;
	}


	public static String displayNameForClass(String var) {
		return C001.displayNameC001(var);
	}
	public static String displayNameC001(String var) {
		switch(var) {
		default:
			return Course.displayNameCourse(var);
		}
	}

	public static String descriptionC001(String var) {
		switch(var) {
			default:
				return Course.descriptionCourse(var);
		}
	}

	public static String classSimpleNameC001(String var) {
		switch(var) {
			default:
				return Course.classSimpleNameCourse(var);
		}
	}

	public static Integer htmlColumnC001(String var) {
		switch(var) {
			default:
				return Course.htmlColumnCourse(var);
		}
	}

	public static Integer htmlRowC001(String var) {
		switch(var) {
			default:
				return Course.htmlRowCourse(var);
		}
	}

	public static Integer htmlCellC001(String var) {
		switch(var) {
			default:
				return Course.htmlCellCourse(var);
		}
	}

	public static Integer lengthMinC001(String var) {
		switch(var) {
			default:
				return Course.lengthMinCourse(var);
		}
	}

	public static Integer lengthMaxC001(String var) {
		switch(var) {
			default:
				return Course.lengthMaxCourse(var);
		}
	}

	public static Integer maxC001(String var) {
		switch(var) {
			default:
				return Course.maxCourse(var);
		}
	}

	public static Integer minC001(String var) {
		switch(var) {
			default:
				return Course.minCourse(var);
		}
	}
}
