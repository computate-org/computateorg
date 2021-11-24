package org.computate.site.enus.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import java.lang.Exception;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.search.SearchResult&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class SearchResultGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SearchResult.class);

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected RequeteSiteFrFR siteRequest_;

	/**	<br/> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.search.SearchResult&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Couverture<RequeteSiteFrFR> c) throws Exception, Exception;

	public RequeteSiteFrFR getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(RequeteSiteFrFR siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static RequeteSiteFrFR staticSetSiteRequest_(RequeteSiteFrFR siteRequest_, String o) {
		return null;
	}
	protected SearchResult siteRequest_Init() throws Exception {
		Couverture<RequeteSiteFrFR> siteRequest_Couverture = new Couverture<RequeteSiteFrFR>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Couverture);
			setSiteRequest_(siteRequest_Couverture.o);
		}
		return (SearchResult)this;
	}

	//////////////////
	// solrDocument //
	//////////////////

	/**	 The entity solrDocument
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SolrDocument solrDocument;

	/**	<br/> The entity solrDocument
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.search.SearchResult&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:solrDocument">Find the entity solrDocument in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrDocument(Couverture<SolrDocument> c) throws Exception, Exception;

	public SolrDocument getSolrDocument() {
		return solrDocument;
	}

	public void setSolrDocument(SolrDocument solrDocument) {
		this.solrDocument = solrDocument;
	}
	public static SolrDocument staticSetSolrDocument(RequeteSiteFrFR siteRequest_, String o) {
		return null;
	}
	protected SearchResult solrDocumentInit() throws Exception {
		Couverture<SolrDocument> solrDocumentCouverture = new Couverture<SolrDocument>().var("solrDocument");
		if(solrDocument == null) {
			_solrDocument(solrDocumentCouverture);
			setSolrDocument(solrDocumentCouverture.o);
		}
		return (SearchResult)this;
	}

	/////////////////
	// resultIndex //
	/////////////////

	/**	 The entity resultIndex
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long resultIndex;

	/**	<br/> The entity resultIndex
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.search.SearchResult&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:resultIndex">Find the entity resultIndex in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _resultIndex(Couverture<Long> c) throws Exception, Exception;

	public Long getResultIndex() {
		return resultIndex;
	}

	public void setResultIndex(Long resultIndex) {
		this.resultIndex = resultIndex;
	}
	@JsonIgnore
	public void setResultIndex(String o) {
		this.resultIndex = SearchResult.staticSetResultIndex(siteRequest_, o);
	}
	public static Long staticSetResultIndex(RequeteSiteFrFR siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SearchResult resultIndexInit() throws Exception {
		Couverture<Long> resultIndexCouverture = new Couverture<Long>().var("resultIndex");
		if(resultIndex == null) {
			_resultIndex(resultIndexCouverture);
			setResultIndex(resultIndexCouverture.o);
		}
		return (SearchResult)this;
	}

	public static Long staticSolrResultIndex(RequeteSiteFrFR siteRequest_, Long o) {
		return o;
	}

	public static String staticSolrStrResultIndex(RequeteSiteFrFR siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqResultIndex(RequeteSiteFrFR siteRequest_, String o) {
		return SearchResult.staticSolrStrResultIndex(siteRequest_, SearchResult.staticSolrResultIndex(siteRequest_, SearchResult.staticSetResultIndex(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public SearchResult initDeepSearchResult(RequeteSiteFrFR siteRequest_) throws Exception {
		setSiteRequest_(siteRequest_);
		initDeepSearchResult();
		return (SearchResult)this;
	}

	public void initDeepSearchResult() throws Exception {
		initSearchResult();
	}

	public void initSearchResult() throws Exception {
				siteRequest_Init();
				solrDocumentInit();
				resultIndexInit();
	}

	public void initDeepForClass(RequeteSiteFrFR siteRequest_) throws Exception {
		initDeepSearchResult(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSearchResult(RequeteSiteFrFR siteRequest_) {
	}

	public void siteRequestForClass(RequeteSiteFrFR siteRequest_) {
		siteRequestSearchResult(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSearchResult(v);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainSearchResult(String var) {
		SearchResult oSearchResult = (SearchResult)this;
		switch(var) {
			case "siteRequest_":
				return oSearchResult.siteRequest_;
			case "solrDocument":
				return oSearchResult.solrDocument;
			case "resultIndex":
				return oSearchResult.resultIndex;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateSearchResult(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSearchResult(String var, Object val) {
		SearchResult oSearchResult = (SearchResult)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, RequeteSiteFrFR siteRequest_, String o) {
		return staticSetSearchResult(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSearchResult(String entityVar, RequeteSiteFrFR siteRequest_, String o) {
		switch(entityVar) {
		case "resultIndex":
			return SearchResult.staticSetResultIndex(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrForClass(String entityVar, RequeteSiteFrFR siteRequest_, Object o) {
		return staticSolrSearchResult(entityVar,  siteRequest_, o);
	}
	public static Object staticSolrSearchResult(String entityVar, RequeteSiteFrFR siteRequest_, Object o) {
		switch(entityVar) {
		case "resultIndex":
			return SearchResult.staticSolrResultIndex(siteRequest_, (Long)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrForClass(String entityVar, RequeteSiteFrFR siteRequest_, Object o) {
		return staticSolrStrSearchResult(entityVar,  siteRequest_, o);
	}
	public static String staticSolrStrSearchResult(String entityVar, RequeteSiteFrFR siteRequest_, Object o) {
		switch(entityVar) {
		case "resultIndex":
			return SearchResult.staticSolrStrResultIndex(siteRequest_, (Long)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqForClass(String entityVar, RequeteSiteFrFR siteRequest_, String o) {
		return staticSolrFqSearchResult(entityVar,  siteRequest_, o);
	}
	public static String staticSolrFqSearchResult(String entityVar, RequeteSiteFrFR siteRequest_, String o) {
		switch(entityVar) {
		case "resultIndex":
			return SearchResult.staticSolrFqResultIndex(siteRequest_, o);
			default:
				return null;
		}
	}

	/////////////
	// define //
	/////////////

	public boolean defineForClass(String var, Object val) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineSearchResult(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.defineForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object defineSearchResult(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSearchResult() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(RequeteSiteFrFR::getApiRequest_).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SearchResult) {
			SearchResult original = (SearchResult)o;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_solrDocument = "solrDocument";
	public static final String VAR_resultIndex = "resultIndex";
}
