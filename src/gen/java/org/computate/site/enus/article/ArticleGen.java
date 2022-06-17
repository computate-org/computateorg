package org.computate.site.enus.article;

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
import java.lang.Object;
import java.lang.Void;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.Locale;
import java.time.OffsetDateTime;
import io.vertx.core.json.JsonArray;
import org.computate.site.enus.model.user.SiteUser;
import java.lang.Long;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article">Find the class Article in Solr. </a>
 * <br><br>Delete the class Article in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.article in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.article&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class ArticleGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(Article.class);

	public static final String Article_AName_enUS = "an article";
	public static final String Article_This_enUS = "this ";
	public static final String Article_ThisName_enUS = "this article";
	public static final String Article_A_enUS = "a ";
	public static final String Article_TheName_enUS = "thearticle";
	public static final String Article_NameSingular_enUS = "article";
	public static final String Article_NamePlural_enUS = "articles";
	public static final String Article_NameActual_enUS = "current article";
	public static final String Article_AllName_enUS = "all the articles";
	public static final String Article_SearchAllNameBy_enUS = "search articles by ";
	public static final String Article_Title_enUS = "articles";
	public static final String Article_ThePluralName_enUS = "the articles";
	public static final String Article_NoNameFound_enUS = "no article found";
	public static final String Article_NameVar_enUS = "article";
	public static final String Article_OfName_enUS = "of article";
	public static final String Article_ANameAdjective_enUS = "an article";
	public static final String Article_NameAdjectiveSingular_enUS = "article";
	public static final String Article_NameAdjectivePlural_enUS = "articles";
	public static final String Search_enUS_Uri = "/api/article";
	public static final String Search_enUS_ImageUri = "/png/api/article-999.png";
	public static final String GET_enUS_Uri = "/api/article/{id}";
	public static final String GET_enUS_ImageUri = "/png/api/article/{id}-999.png";
	public static final String PATCH_enUS_Uri = "/api/article";
	public static final String PATCH_enUS_ImageUri = "/png/api/article-999.png";
	public static final String POST_enUS_Uri = "/api/article";
	public static final String POST_enUS_ImageUri = "/png/api/article-999.png";
	public static final String PUTImport_enUS_Uri = "/api/article-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/article-import-999.png";
	public static final String SearchPage_enUS_Uri = "/article";
	public static final String SearchPage_enUS_ImageUri = "/png/article-999.png";

	public static final String Article_Color = "green";
	public static final String Article_IconGroup = "regular";
	public static final String Article_IconName = "university";

	///////////////////
	// promiseBefore //
	///////////////////

	/**	 The entity promiseBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Void promiseBefore;

	/**	<br> The entity promiseBefore
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:promiseBefore">Find the entity promiseBefore in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _promiseBefore(Promise<Void> promise);

	public Void getPromiseBefore() {
		return promiseBefore;
	}

	public void setPromiseBefore(Void promiseBefore) {
		this.promiseBefore = promiseBefore;
	}
	public static Void staticSetPromiseBefore(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<Void> promiseBeforePromise() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		_promiseBefore(promise2);
		promise2.future().onSuccess(o -> {
			setPromiseBefore(o);
			promise.complete(o);
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	///////////////////
	// staticBaseUrl //
	///////////////////

	/**	 The entity staticBaseUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String staticBaseUrl;

	/**	<br> The entity staticBaseUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:staticBaseUrl">Find the entity staticBaseUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _staticBaseUrl(Wrap<String> w);

	public String getStaticBaseUrl() {
		return staticBaseUrl;
	}
	public void setStaticBaseUrl(String o) {
		this.staticBaseUrl = Article.staticSetStaticBaseUrl(siteRequest_, o);
	}
	public static String staticSetStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article staticBaseUrlInit() {
		Wrap<String> staticBaseUrlWrap = new Wrap<String>().var("staticBaseUrl");
		if(staticBaseUrl == null) {
			_staticBaseUrl(staticBaseUrlWrap);
			setStaticBaseUrl(staticBaseUrlWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStaticBaseUrl(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrStaticBaseUrl(siteRequest_, Article.staticSearchStaticBaseUrl(siteRequest_, Article.staticSetStaticBaseUrl(siteRequest_, o)));
	}

	////////////////
	// domainName //
	////////////////

	/**	 The entity domainName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String domainName;

	/**	<br> The entity domainName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:domainName">Find the entity domainName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _domainName(Wrap<String> w);

	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String o) {
		this.domainName = Article.staticSetDomainName(siteRequest_, o);
	}
	public static String staticSetDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article domainNameInit() {
		Wrap<String> domainNameWrap = new Wrap<String>().var("domainName");
		if(domainName == null) {
			_domainName(domainNameWrap);
			setDomainName(domainNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDomainName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrDomainName(siteRequest_, Article.staticSearchDomainName(siteRequest_, Article.staticSetDomainName(siteRequest_, o)));
	}

	//////////////
	// siteName //
	//////////////

	/**	 The entity siteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteName;

	/**	<br> The entity siteName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:siteName">Find the entity siteName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteName(Wrap<String> w);

	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String o) {
		this.siteName = Article.staticSetSiteName(siteRequest_, o);
	}
	public static String staticSetSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article siteNameInit() {
		Wrap<String> siteNameWrap = new Wrap<String>().var("siteName");
		if(siteName == null) {
			_siteName(siteNameWrap);
			setSiteName(siteNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrSiteName(siteRequest_, Article.staticSearchSiteName(siteRequest_, Article.staticSetSiteName(siteRequest_, o)));
	}

	//////////////////
	// siteHostName //
	//////////////////

	/**	 The entity siteHostName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteHostName;

	/**	<br> The entity siteHostName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:siteHostName">Find the entity siteHostName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteHostName(Wrap<String> w);

	public String getSiteHostName() {
		return siteHostName;
	}
	public void setSiteHostName(String o) {
		this.siteHostName = Article.staticSetSiteHostName(siteRequest_, o);
	}
	public static String staticSetSiteHostName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article siteHostNameInit() {
		Wrap<String> siteHostNameWrap = new Wrap<String>().var("siteHostName");
		if(siteHostName == null) {
			_siteHostName(siteHostNameWrap);
			setSiteHostName(siteHostNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchSiteHostName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteHostName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteHostName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrSiteHostName(siteRequest_, Article.staticSearchSiteHostName(siteRequest_, Article.staticSetSiteHostName(siteRequest_, o)));
	}

	/////////////////////
	// sitePackageName //
	/////////////////////

	/**	 The entity sitePackageName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sitePackageName;

	/**	<br> The entity sitePackageName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:sitePackageName">Find the entity sitePackageName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sitePackageName(Wrap<String> w);

	public String getSitePackageName() {
		return sitePackageName;
	}
	public void setSitePackageName(String o) {
		this.sitePackageName = Article.staticSetSitePackageName(siteRequest_, o);
	}
	public static String staticSetSitePackageName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article sitePackageNameInit() {
		Wrap<String> sitePackageNameWrap = new Wrap<String>().var("sitePackageName");
		if(sitePackageName == null) {
			_sitePackageName(sitePackageNameWrap);
			setSitePackageName(sitePackageNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchSitePackageName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSitePackageName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSitePackageName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrSitePackageName(siteRequest_, Article.staticSearchSitePackageName(siteRequest_, Article.staticSetSitePackageName(siteRequest_, o)));
	}

	//////////////////////
	// computerHostName //
	//////////////////////

	/**	 The entity computerHostName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String computerHostName;

	/**	<br> The entity computerHostName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:computerHostName">Find the entity computerHostName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _computerHostName(Wrap<String> w);

	public String getComputerHostName() {
		return computerHostName;
	}
	public void setComputerHostName(String o) {
		this.computerHostName = Article.staticSetComputerHostName(siteRequest_, o);
	}
	public static String staticSetComputerHostName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article computerHostNameInit() {
		Wrap<String> computerHostNameWrap = new Wrap<String>().var("computerHostName");
		if(computerHostName == null) {
			_computerHostName(computerHostNameWrap);
			setComputerHostName(computerHostNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchComputerHostName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrComputerHostName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqComputerHostName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrComputerHostName(siteRequest_, Article.staticSearchComputerHostName(siteRequest_, Article.staticSetComputerHostName(siteRequest_, o)));
	}

	//////////////
	// userName //
	//////////////

	/**	 The entity userName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userName;

	/**	<br> The entity userName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:userName">Find the entity userName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userName(Wrap<String> w);

	public String getUserName() {
		return userName;
	}
	public void setUserName(String o) {
		this.userName = Article.staticSetUserName(siteRequest_, o);
	}
	public static String staticSetUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article userNameInit() {
		Wrap<String> userNameWrap = new Wrap<String>().var("userName");
		if(userName == null) {
			_userName(userNameWrap);
			setUserName(userNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrUserName(siteRequest_, Article.staticSearchUserName(siteRequest_, Article.staticSetUserName(siteRequest_, o)));
	}

	//////////////////
	// cheminProjet //
	//////////////////

	/**	 The entity cheminProjet
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String cheminProjet;

	/**	<br> The entity cheminProjet
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:cheminProjet">Find the entity cheminProjet in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _cheminProjet(Wrap<String> w);

	public String getCheminProjet() {
		return cheminProjet;
	}
	public void setCheminProjet(String o) {
		this.cheminProjet = Article.staticSetCheminProjet(siteRequest_, o);
	}
	public static String staticSetCheminProjet(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article cheminProjetInit() {
		Wrap<String> cheminProjetWrap = new Wrap<String>().var("cheminProjet");
		if(cheminProjet == null) {
			_cheminProjet(cheminProjetWrap);
			setCheminProjet(cheminProjetWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchCheminProjet(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrCheminProjet(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCheminProjet(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrCheminProjet(siteRequest_, Article.staticSearchCheminProjet(siteRequest_, Article.staticSetCheminProjet(siteRequest_, o)));
	}

	///////////////
	// groupName //
	///////////////

	/**	 The entity groupName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String groupName;

	/**	<br> The entity groupName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:groupName">Find the entity groupName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _groupName(Wrap<String> w);

	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String o) {
		this.groupName = Article.staticSetGroupName(siteRequest_, o);
	}
	public static String staticSetGroupName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article groupNameInit() {
		Wrap<String> groupNameWrap = new Wrap<String>().var("groupName");
		if(groupName == null) {
			_groupName(groupNameWrap);
			setGroupName(groupNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchGroupName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrGroupName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGroupName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrGroupName(siteRequest_, Article.staticSearchGroupName(siteRequest_, Article.staticSetGroupName(siteRequest_, o)));
	}

	//////////////
	// isCourse //
	//////////////

	/**	 The entity isCourse
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean isCourse;

	/**	<br> The entity isCourse
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:isCourse">Find the entity isCourse in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _isCourse(Wrap<Boolean> w);

	public Boolean getIsCourse() {
		return isCourse;
	}

	public void setIsCourse(Boolean isCourse) {
		this.isCourse = isCourse;
	}
	@JsonIgnore
	public void setIsCourse(String o) {
		this.isCourse = Article.staticSetIsCourse(siteRequest_, o);
	}
	public static Boolean staticSetIsCourse(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected Article isCourseInit() {
		Wrap<Boolean> isCourseWrap = new Wrap<Boolean>().var("isCourse");
		if(isCourse == null) {
			_isCourse(isCourseWrap);
			setIsCourse(isCourseWrap.o);
		}
		return (Article)this;
	}

	public static Boolean staticSearchIsCourse(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrIsCourse(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIsCourse(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrIsCourse(siteRequest_, Article.staticSearchIsCourse(siteRequest_, Article.staticSetIsCourse(siteRequest_, o)));
	}

	//////////////
	// isLesson //
	//////////////

	/**	 The entity isLesson
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean isLesson;

	/**	<br> The entity isLesson
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:isLesson">Find the entity isLesson in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _isLesson(Wrap<Boolean> w);

	public Boolean getIsLesson() {
		return isLesson;
	}

	public void setIsLesson(Boolean isLesson) {
		this.isLesson = isLesson;
	}
	@JsonIgnore
	public void setIsLesson(String o) {
		this.isLesson = Article.staticSetIsLesson(siteRequest_, o);
	}
	public static Boolean staticSetIsLesson(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected Article isLessonInit() {
		Wrap<Boolean> isLessonWrap = new Wrap<Boolean>().var("isLesson");
		if(isLesson == null) {
			_isLesson(isLessonWrap);
			setIsLesson(isLessonWrap.o);
		}
		return (Article)this;
	}

	public static Boolean staticSearchIsLesson(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrIsLesson(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIsLesson(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrIsLesson(siteRequest_, Article.staticSearchIsLesson(siteRequest_, Article.staticSetIsLesson(siteRequest_, o)));
	}

	///////////////
	// isArticle //
	///////////////

	/**	 The entity isArticle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean isArticle;

	/**	<br> The entity isArticle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:isArticle">Find the entity isArticle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _isArticle(Wrap<Boolean> w);

	public Boolean getIsArticle() {
		return isArticle;
	}

	public void setIsArticle(Boolean isArticle) {
		this.isArticle = isArticle;
	}
	@JsonIgnore
	public void setIsArticle(String o) {
		this.isArticle = Article.staticSetIsArticle(siteRequest_, o);
	}
	public static Boolean staticSetIsArticle(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected Article isArticleInit() {
		Wrap<Boolean> isArticleWrap = new Wrap<Boolean>().var("isArticle");
		if(isArticle == null) {
			_isArticle(isArticleWrap);
			setIsArticle(isArticleWrap.o);
		}
		return (Article)this;
	}

	public static Boolean staticSearchIsArticle(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrIsArticle(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqIsArticle(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrIsArticle(siteRequest_, Article.staticSearchIsArticle(siteRequest_, Article.staticSetIsArticle(siteRequest_, o)));
	}

	//////////////////
	// courseNumber //
	//////////////////

	/**	 The entity courseNumber
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer courseNumber;

	/**	<br> The entity courseNumber
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:courseNumber">Find the entity courseNumber in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _courseNumber(Wrap<Integer> w);

	public Integer getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}
	@JsonIgnore
	public void setCourseNumber(String o) {
		this.courseNumber = Article.staticSetCourseNumber(siteRequest_, o);
	}
	public static Integer staticSetCourseNumber(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected Article courseNumberInit() {
		Wrap<Integer> courseNumberWrap = new Wrap<Integer>().var("courseNumber");
		if(courseNumber == null) {
			_courseNumber(courseNumberWrap);
			setCourseNumber(courseNumberWrap.o);
		}
		return (Article)this;
	}

	public static Integer staticSearchCourseNumber(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrCourseNumber(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCourseNumber(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrCourseNumber(siteRequest_, Article.staticSearchCourseNumber(siteRequest_, Article.staticSetCourseNumber(siteRequest_, o)));
	}

	//////////////////
	// lessonNumber //
	//////////////////

	/**	 The entity lessonNumber
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer lessonNumber;

	/**	<br> The entity lessonNumber
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:lessonNumber">Find the entity lessonNumber in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _lessonNumber(Wrap<Integer> w);

	public Integer getLessonNumber() {
		return lessonNumber;
	}

	public void setLessonNumber(Integer lessonNumber) {
		this.lessonNumber = lessonNumber;
	}
	@JsonIgnore
	public void setLessonNumber(String o) {
		this.lessonNumber = Article.staticSetLessonNumber(siteRequest_, o);
	}
	public static Integer staticSetLessonNumber(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected Article lessonNumberInit() {
		Wrap<Integer> lessonNumberWrap = new Wrap<Integer>().var("lessonNumber");
		if(lessonNumber == null) {
			_lessonNumber(lessonNumberWrap);
			setLessonNumber(lessonNumberWrap.o);
		}
		return (Article)this;
	}

	public static Integer staticSearchLessonNumber(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrLessonNumber(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLessonNumber(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrLessonNumber(siteRequest_, Article.staticSearchLessonNumber(siteRequest_, Article.staticSetLessonNumber(siteRequest_, o)));
	}

	///////////////////////
	// lessonDescription //
	///////////////////////

	/**	 The entity lessonDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String lessonDescription;

	/**	<br> The entity lessonDescription
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:lessonDescription">Find the entity lessonDescription in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _lessonDescription(Wrap<String> w);

	public String getLessonDescription() {
		return lessonDescription;
	}
	public void setLessonDescription(String o) {
		this.lessonDescription = Article.staticSetLessonDescription(siteRequest_, o);
	}
	public static String staticSetLessonDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article lessonDescriptionInit() {
		Wrap<String> lessonDescriptionWrap = new Wrap<String>().var("lessonDescription");
		if(lessonDescription == null) {
			_lessonDescription(lessonDescriptionWrap);
			setLessonDescription(lessonDescriptionWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchLessonDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrLessonDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLessonDescription(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrLessonDescription(siteRequest_, Article.staticSearchLessonDescription(siteRequest_, Article.staticSetLessonDescription(siteRequest_, o)));
	}

	////////////////////
	// articleH1_enUS //
	////////////////////

	/**	 The entity articleH1_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH1_enUS;

	/**	<br> The entity articleH1_enUS
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH1_enUS">Find the entity articleH1_enUS in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH1_enUS(Wrap<String> w);

	public String getArticleH1_enUS() {
		return articleH1_enUS;
	}
	public void setArticleH1_enUS(String o) {
		this.articleH1_enUS = Article.staticSetArticleH1_enUS(siteRequest_, o);
	}
	public static String staticSetArticleH1_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH1_enUSInit() {
		Wrap<String> articleH1_enUSWrap = new Wrap<String>().var("articleH1_enUS");
		if(articleH1_enUS == null) {
			_articleH1_enUS(articleH1_enUSWrap);
			setArticleH1_enUS(articleH1_enUSWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH1_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH1_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH1_enUS(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH1_enUS(siteRequest_, Article.staticSearchArticleH1_enUS(siteRequest_, Article.staticSetArticleH1_enUS(siteRequest_, o)));
	}

	////////////////////
	// articleH1_frFR //
	////////////////////

	/**	 The entity articleH1_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH1_frFR;

	/**	<br> The entity articleH1_frFR
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH1_frFR">Find the entity articleH1_frFR in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH1_frFR(Wrap<String> w);

	public String getArticleH1_frFR() {
		return articleH1_frFR;
	}
	public void setArticleH1_frFR(String o) {
		this.articleH1_frFR = Article.staticSetArticleH1_frFR(siteRequest_, o);
	}
	public static String staticSetArticleH1_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH1_frFRInit() {
		Wrap<String> articleH1_frFRWrap = new Wrap<String>().var("articleH1_frFR");
		if(articleH1_frFR == null) {
			_articleH1_frFR(articleH1_frFRWrap);
			setArticleH1_frFR(articleH1_frFRWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH1_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH1_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH1_frFR(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH1_frFR(siteRequest_, Article.staticSearchArticleH1_frFR(siteRequest_, Article.staticSetArticleH1_frFR(siteRequest_, o)));
	}

	////////////////////
	// articleH2_enUS //
	////////////////////

	/**	 The entity articleH2_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH2_enUS;

	/**	<br> The entity articleH2_enUS
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH2_enUS">Find the entity articleH2_enUS in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH2_enUS(Wrap<String> w);

	public String getArticleH2_enUS() {
		return articleH2_enUS;
	}
	public void setArticleH2_enUS(String o) {
		this.articleH2_enUS = Article.staticSetArticleH2_enUS(siteRequest_, o);
	}
	public static String staticSetArticleH2_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH2_enUSInit() {
		Wrap<String> articleH2_enUSWrap = new Wrap<String>().var("articleH2_enUS");
		if(articleH2_enUS == null) {
			_articleH2_enUS(articleH2_enUSWrap);
			setArticleH2_enUS(articleH2_enUSWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH2_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH2_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH2_enUS(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH2_enUS(siteRequest_, Article.staticSearchArticleH2_enUS(siteRequest_, Article.staticSetArticleH2_enUS(siteRequest_, o)));
	}

	////////////////////
	// articleH2_frFR //
	////////////////////

	/**	 The entity articleH2_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH2_frFR;

	/**	<br> The entity articleH2_frFR
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH2_frFR">Find the entity articleH2_frFR in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH2_frFR(Wrap<String> w);

	public String getArticleH2_frFR() {
		return articleH2_frFR;
	}
	public void setArticleH2_frFR(String o) {
		this.articleH2_frFR = Article.staticSetArticleH2_frFR(siteRequest_, o);
	}
	public static String staticSetArticleH2_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH2_frFRInit() {
		Wrap<String> articleH2_frFRWrap = new Wrap<String>().var("articleH2_frFR");
		if(articleH2_frFR == null) {
			_articleH2_frFR(articleH2_frFRWrap);
			setArticleH2_frFR(articleH2_frFRWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH2_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH2_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH2_frFR(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH2_frFR(siteRequest_, Article.staticSearchArticleH2_frFR(siteRequest_, Article.staticSetArticleH2_frFR(siteRequest_, o)));
	}

	///////////////
	// articleH1 //
	///////////////

	/**	 The entity articleH1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH1;

	/**	<br> The entity articleH1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH1">Find the entity articleH1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH1(Wrap<String> w);

	public String getArticleH1() {
		return articleH1;
	}
	public void setArticleH1(String o) {
		this.articleH1 = Article.staticSetArticleH1(siteRequest_, o);
	}
	public static String staticSetArticleH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH1Init() {
		Wrap<String> articleH1Wrap = new Wrap<String>().var("articleH1");
		if(articleH1 == null) {
			_articleH1(articleH1Wrap);
			setArticleH1(articleH1Wrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH1(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH1(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH1(siteRequest_, Article.staticSearchArticleH1(siteRequest_, Article.staticSetArticleH1(siteRequest_, o)));
	}

	///////////////
	// articleH2 //
	///////////////

	/**	 The entity articleH2
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleH2;

	/**	<br> The entity articleH2
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleH2">Find the entity articleH2 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleH2(Wrap<String> w);

	public String getArticleH2() {
		return articleH2;
	}
	public void setArticleH2(String o) {
		this.articleH2 = Article.staticSetArticleH2(siteRequest_, o);
	}
	public static String staticSetArticleH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleH2Init() {
		Wrap<String> articleH2Wrap = new Wrap<String>().var("articleH2");
		if(articleH2 == null) {
			_articleH2(articleH2Wrap);
			setArticleH2(articleH2Wrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleH2(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleH2(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleH2(siteRequest_, Article.staticSearchArticleH2(siteRequest_, Article.staticSetArticleH2(siteRequest_, o)));
	}

	////////////////////////
	// articleDescription //
	////////////////////////

	/**	 The entity articleDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String articleDescription;

	/**	<br> The entity articleDescription
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleDescription">Find the entity articleDescription in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleDescription(Wrap<String> w);

	public String getArticleDescription() {
		return articleDescription;
	}
	public void setArticleDescription(String o) {
		this.articleDescription = Article.staticSetArticleDescription(siteRequest_, o);
	}
	public static String staticSetArticleDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article articleDescriptionInit() {
		Wrap<String> articleDescriptionWrap = new Wrap<String>().var("articleDescription");
		if(articleDescription == null) {
			_articleDescription(articleDescriptionWrap);
			setArticleDescription(articleDescriptionWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchArticleDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrArticleDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleDescription(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleDescription(siteRequest_, Article.staticSearchArticleDescription(siteRequest_, Article.staticSetArticleDescription(siteRequest_, o)));
	}

	/////////////////////
	// pageDescription //
	/////////////////////

	/**	 The entity pageDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageDescription;

	/**	<br> The entity pageDescription
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageDescription">Find the entity pageDescription in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageDescription(Wrap<String> w);

	public String getPageDescription() {
		return pageDescription;
	}
	public void setPageDescription(String o) {
		this.pageDescription = Article.staticSetPageDescription(siteRequest_, o);
	}
	public static String staticSetPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageDescriptionInit() {
		Wrap<String> pageDescriptionWrap = new Wrap<String>().var("pageDescription");
		if(pageDescription == null) {
			_pageDescription(pageDescriptionWrap);
			setPageDescription(pageDescriptionWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageDescription(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageDescription(siteRequest_, Article.staticSearchPageDescription(siteRequest_, Article.staticSetPageDescription(siteRequest_, o)));
	}

	////////////////////
	// articleCreated //
	////////////////////

	/**	 The entity articleCreated
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime articleCreated;

	/**	<br> The entity articleCreated
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:articleCreated">Find the entity articleCreated in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleCreated(Wrap<ZonedDateTime> w);

	public ZonedDateTime getArticleCreated() {
		return articleCreated;
	}

	public void setArticleCreated(ZonedDateTime articleCreated) {
		this.articleCreated = articleCreated;
	}
	@JsonIgnore
	public void setArticleCreated(Instant o) {
		this.articleCreated = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setArticleCreated(String o) {
		this.articleCreated = Article.staticSetArticleCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetArticleCreated(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setArticleCreated(Date o) {
		this.articleCreated = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected Article articleCreatedInit() {
		Wrap<ZonedDateTime> articleCreatedWrap = new Wrap<ZonedDateTime>().var("articleCreated");
		if(articleCreated == null) {
			_articleCreated(articleCreatedWrap);
			setArticleCreated(articleCreatedWrap.o);
		}
		return (Article)this;
	}

	public static Date staticSearchArticleCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrArticleCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqArticleCreated(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArticleCreated(siteRequest_, Article.staticSearchArticleCreated(siteRequest_, Article.staticSetArticleCreated(siteRequest_, o)));
	}

	//////////////////
	// pageUri_enUS //
	//////////////////

	/**	 The entity pageUri_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUri_enUS;

	/**	<br> The entity pageUri_enUS
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUri_enUS">Find the entity pageUri_enUS in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUri_enUS(Wrap<String> w);

	public String getPageUri_enUS() {
		return pageUri_enUS;
	}
	public void setPageUri_enUS(String o) {
		this.pageUri_enUS = Article.staticSetPageUri_enUS(siteRequest_, o);
	}
	public static String staticSetPageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUri_enUSInit() {
		Wrap<String> pageUri_enUSWrap = new Wrap<String>().var("pageUri_enUS");
		if(pageUri_enUS == null) {
			_pageUri_enUS(pageUri_enUSWrap);
			setPageUri_enUS(pageUri_enUSWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUri_enUS(siteRequest_, Article.staticSearchPageUri_enUS(siteRequest_, Article.staticSetPageUri_enUS(siteRequest_, o)));
	}

	//////////////////
	// pageUri_frFR //
	//////////////////

	/**	 The entity pageUri_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUri_frFR;

	/**	<br> The entity pageUri_frFR
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUri_frFR">Find the entity pageUri_frFR in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUri_frFR(Wrap<String> w);

	public String getPageUri_frFR() {
		return pageUri_frFR;
	}
	public void setPageUri_frFR(String o) {
		this.pageUri_frFR = Article.staticSetPageUri_frFR(siteRequest_, o);
	}
	public static String staticSetPageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUri_frFRInit() {
		Wrap<String> pageUri_frFRWrap = new Wrap<String>().var("pageUri_frFR");
		if(pageUri_frFR == null) {
			_pageUri_frFR(pageUri_frFRWrap);
			setPageUri_frFR(pageUri_frFRWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUri_frFR(siteRequest_, Article.staticSearchPageUri_frFR(siteRequest_, Article.staticSetPageUri_frFR(siteRequest_, o)));
	}

	/////////////
	// pageUri //
	/////////////

	/**	 The entity pageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUri;

	/**	<br> The entity pageUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUri">Find the entity pageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUri(Wrap<String> w);

	public String getPageUri() {
		return pageUri;
	}
	public void setPageUri(String o) {
		this.pageUri = Article.staticSetPageUri(siteRequest_, o);
	}
	public static String staticSetPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUriInit() {
		Wrap<String> pageUriWrap = new Wrap<String>().var("pageUri");
		if(pageUri == null) {
			_pageUri(pageUriWrap);
			setPageUri(pageUriWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUri(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUri(siteRequest_, Article.staticSearchPageUri(siteRequest_, Article.staticSetPageUri(siteRequest_, o)));
	}

	///////////////////////
	// pageImageUri_enUS //
	///////////////////////

	/**	 The entity pageImageUri_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri_enUS;

	/**	<br> The entity pageImageUri_enUS
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageImageUri_enUS">Find the entity pageImageUri_enUS in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri_enUS(Wrap<String> w);

	public String getPageImageUri_enUS() {
		return pageImageUri_enUS;
	}
	public void setPageImageUri_enUS(String o) {
		this.pageImageUri_enUS = Article.staticSetPageImageUri_enUS(siteRequest_, o);
	}
	public static String staticSetPageImageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageImageUri_enUSInit() {
		Wrap<String> pageImageUri_enUSWrap = new Wrap<String>().var("pageImageUri_enUS");
		if(pageImageUri_enUS == null) {
			_pageImageUri_enUS(pageImageUri_enUSWrap);
			setPageImageUri_enUS(pageImageUri_enUSWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageImageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri_enUS(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageImageUri_enUS(siteRequest_, Article.staticSearchPageImageUri_enUS(siteRequest_, Article.staticSetPageImageUri_enUS(siteRequest_, o)));
	}

	///////////////////////
	// pageImageUri_frFR //
	///////////////////////

	/**	 The entity pageImageUri_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri_frFR;

	/**	<br> The entity pageImageUri_frFR
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageImageUri_frFR">Find the entity pageImageUri_frFR in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri_frFR(Wrap<String> w);

	public String getPageImageUri_frFR() {
		return pageImageUri_frFR;
	}
	public void setPageImageUri_frFR(String o) {
		this.pageImageUri_frFR = Article.staticSetPageImageUri_frFR(siteRequest_, o);
	}
	public static String staticSetPageImageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageImageUri_frFRInit() {
		Wrap<String> pageImageUri_frFRWrap = new Wrap<String>().var("pageImageUri_frFR");
		if(pageImageUri_frFR == null) {
			_pageImageUri_frFR(pageImageUri_frFRWrap);
			setPageImageUri_frFR(pageImageUri_frFRWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageImageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri_frFR(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageImageUri_frFR(siteRequest_, Article.staticSearchPageImageUri_frFR(siteRequest_, Article.staticSetPageImageUri_frFR(siteRequest_, o)));
	}

	//////////////////
	// pageImageUri //
	//////////////////

	/**	 The entity pageImageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri;

	/**	<br> The entity pageImageUri
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageImageUri">Find the entity pageImageUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageImageUri(Wrap<String> w);

	public String getPageImageUri() {
		return pageImageUri;
	}
	public void setPageImageUri(String o) {
		this.pageImageUri = Article.staticSetPageImageUri(siteRequest_, o);
	}
	public static String staticSetPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageImageUriInit() {
		Wrap<String> pageImageUriWrap = new Wrap<String>().var("pageImageUri");
		if(pageImageUri == null) {
			_pageImageUri(pageImageUriWrap);
			setPageImageUri(pageImageUriWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageImageUri(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageImageUri(siteRequest_, Article.staticSearchPageImageUri(siteRequest_, Article.staticSetPageImageUri(siteRequest_, o)));
	}

	/////////////////
	// pageCreated //
	/////////////////

	/**	 The entity pageCreated
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime pageCreated;

	/**	<br> The entity pageCreated
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageCreated">Find the entity pageCreated in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageCreated(Wrap<ZonedDateTime> w);

	public ZonedDateTime getPageCreated() {
		return pageCreated;
	}

	public void setPageCreated(ZonedDateTime pageCreated) {
		this.pageCreated = pageCreated;
	}
	@JsonIgnore
	public void setPageCreated(Instant o) {
		this.pageCreated = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setPageCreated(String o) {
		this.pageCreated = Article.staticSetPageCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetPageCreated(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setPageCreated(Date o) {
		this.pageCreated = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected Article pageCreatedInit() {
		Wrap<ZonedDateTime> pageCreatedWrap = new Wrap<ZonedDateTime>().var("pageCreated");
		if(pageCreated == null) {
			_pageCreated(pageCreatedWrap);
			setPageCreated(pageCreatedWrap.o);
		}
		return (Article)this;
	}

	public static Date staticSearchPageCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrPageCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqPageCreated(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageCreated(siteRequest_, Article.staticSearchPageCreated(siteRequest_, Article.staticSetPageCreated(siteRequest_, o)));
	}

	////////////
	// pageH1 //
	////////////

	/**	 The entity pageH1
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageH1;

	/**	<br> The entity pageH1
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageH1">Find the entity pageH1 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageH1(Wrap<String> w);

	public String getPageH1() {
		return pageH1;
	}
	public void setPageH1(String o) {
		this.pageH1 = Article.staticSetPageH1(siteRequest_, o);
	}
	public static String staticSetPageH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageH1Init() {
		Wrap<String> pageH1Wrap = new Wrap<String>().var("pageH1");
		if(pageH1 == null) {
			_pageH1(pageH1Wrap);
			setPageH1(pageH1Wrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageH1(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageH1(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageH1(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageH1(siteRequest_, Article.staticSearchPageH1(siteRequest_, Article.staticSetPageH1(siteRequest_, o)));
	}

	////////////
	// pageH2 //
	////////////

	/**	 The entity pageH2
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageH2;

	/**	<br> The entity pageH2
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageH2">Find the entity pageH2 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageH2(Wrap<String> w);

	public String getPageH2() {
		return pageH2;
	}
	public void setPageH2(String o) {
		this.pageH2 = Article.staticSetPageH2(siteRequest_, o);
	}
	public static String staticSetPageH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageH2Init() {
		Wrap<String> pageH2Wrap = new Wrap<String>().var("pageH2");
		if(pageH2 == null) {
			_pageH2(pageH2Wrap);
			setPageH2(pageH2Wrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageH2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageH2(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageH2(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageH2(siteRequest_, Article.staticSearchPageH2(siteRequest_, Article.staticSetPageH2(siteRequest_, o)));
	}

	////////////
	// pageH3 //
	////////////

	/**	 The entity pageH3
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageH3;

	/**	<br> The entity pageH3
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageH3">Find the entity pageH3 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageH3(Wrap<String> w);

	public String getPageH3() {
		return pageH3;
	}
	public void setPageH3(String o) {
		this.pageH3 = Article.staticSetPageH3(siteRequest_, o);
	}
	public static String staticSetPageH3(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageH3Init() {
		Wrap<String> pageH3Wrap = new Wrap<String>().var("pageH3");
		if(pageH3 == null) {
			_pageH3(pageH3Wrap);
			setPageH3(pageH3Wrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageH3(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageH3(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageH3(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageH3(siteRequest_, Article.staticSearchPageH3(siteRequest_, Article.staticSetPageH3(siteRequest_, o)));
	}

	///////////////
	// pageTitle //
	///////////////

	/**	 The entity pageTitle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageTitle;

	/**	<br> The entity pageTitle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageTitle">Find the entity pageTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageTitle(Wrap<String> w);

	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String o) {
		this.pageTitle = Article.staticSetPageTitle(siteRequest_, o);
	}
	public static String staticSetPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageTitleInit() {
		Wrap<String> pageTitleWrap = new Wrap<String>().var("pageTitle");
		if(pageTitle == null) {
			_pageTitle(pageTitleWrap);
			setPageTitle(pageTitleWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageTitle(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageTitle(siteRequest_, Article.staticSearchPageTitle(siteRequest_, Article.staticSetPageTitle(siteRequest_, o)));
	}

	/////////////////////
	// pageSearch_enUS //
	/////////////////////

	/**	 The entity pageSearch_enUS
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> pageSearch_enUS = new ArrayList<String>();

	/**	<br> The entity pageSearch_enUS
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageSearch_enUS">Find the entity pageSearch_enUS in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _pageSearch_enUS(List<String> l);

	public List<String> getPageSearch_enUS() {
		return pageSearch_enUS;
	}

	public void setPageSearch_enUS(List<String> pageSearch_enUS) {
		this.pageSearch_enUS = pageSearch_enUS;
	}
	public static String staticSetPageSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public Article addPageSearch_enUS(String...objets) {
		for(String o : objets) {
			addPageSearch_enUS(o);
		}
		return (Article)this;
	}
	public Article addPageSearch_enUS(String o) {
		if(o != null)
			this.pageSearch_enUS.add(o);
		return (Article)this;
	}
	@JsonIgnore
	public void setPageSearch_enUS(JsonArray objets) {
		pageSearch_enUS.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addPageSearch_enUS(o);
		}
	}
	protected Article pageSearch_enUSInit() {
		_pageSearch_enUS(pageSearch_enUS);
		return (Article)this;
	}

	public static String staticSearchPageSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageSearch_enUS(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageSearch_enUS(siteRequest_, Article.staticSearchPageSearch_enUS(siteRequest_, Article.staticSetPageSearch_enUS(siteRequest_, o)));
	}

	/////////////////////
	// pageSearch_frFR //
	/////////////////////

	/**	 The entity pageSearch_frFR
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> pageSearch_frFR = new ArrayList<String>();

	/**	<br> The entity pageSearch_frFR
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageSearch_frFR">Find the entity pageSearch_frFR in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _pageSearch_frFR(List<String> l);

	public List<String> getPageSearch_frFR() {
		return pageSearch_frFR;
	}

	public void setPageSearch_frFR(List<String> pageSearch_frFR) {
		this.pageSearch_frFR = pageSearch_frFR;
	}
	public static String staticSetPageSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public Article addPageSearch_frFR(String...objets) {
		for(String o : objets) {
			addPageSearch_frFR(o);
		}
		return (Article)this;
	}
	public Article addPageSearch_frFR(String o) {
		if(o != null)
			this.pageSearch_frFR.add(o);
		return (Article)this;
	}
	@JsonIgnore
	public void setPageSearch_frFR(JsonArray objets) {
		pageSearch_frFR.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addPageSearch_frFR(o);
		}
	}
	protected Article pageSearch_frFRInit() {
		_pageSearch_frFR(pageSearch_frFR);
		return (Article)this;
	}

	public static String staticSearchPageSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageSearch_frFR(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageSearch_frFR(siteRequest_, Article.staticSearchPageSearch_frFR(siteRequest_, Article.staticSetPageSearch_frFR(siteRequest_, o)));
	}

	///////////////
	// siteUser_ //
	///////////////

	/**	 The entity siteUser_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteUser siteUser_;

	/**	<br> The entity siteUser_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:siteUser_">Find the entity siteUser_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteUser_(Wrap<SiteUser> w);

	public SiteUser getSiteUser_() {
		return siteUser_;
	}

	public void setSiteUser_(SiteUser siteUser_) {
		this.siteUser_ = siteUser_;
	}
	public static SiteUser staticSetSiteUser_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Article siteUser_Init() {
		Wrap<SiteUser> siteUser_Wrap = new Wrap<SiteUser>().var("siteUser_");
		if(siteUser_ == null) {
			_siteUser_(siteUser_Wrap);
			setSiteUser_(siteUser_Wrap.o);
		}
		return (Article)this;
	}

	////////////
	// userId //
	////////////

	/**	 The entity userId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userId;

	/**	<br> The entity userId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:userId">Find the entity userId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userId(Wrap<String> w);

	public String getUserId() {
		return userId;
	}
	public void setUserId(String o) {
		this.userId = Article.staticSetUserId(siteRequest_, o);
	}
	public static String staticSetUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article userIdInit() {
		Wrap<String> userIdWrap = new Wrap<String>().var("userId");
		if(userId == null) {
			_userId(userIdWrap);
			setUserId(userIdWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserId(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrUserId(siteRequest_, Article.staticSearchUserId(siteRequest_, Article.staticSetUserId(siteRequest_, o)));
	}

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> w);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequestEnUS staticSetSiteRequest_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Article siteRequest_Init() {
		Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (Article)this;
	}

	///////////////
	// inheritPk //
	///////////////

	/**	 The entity inheritPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String inheritPk;

	/**	<br> The entity inheritPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:inheritPk">Find the entity inheritPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _inheritPk(Wrap<String> w);

	public String getInheritPk() {
		return inheritPk;
	}
	public void setInheritPk(String o) {
		this.inheritPk = Article.staticSetInheritPk(siteRequest_, o);
	}
	public static String staticSetInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article inheritPkInit() {
		Wrap<String> inheritPkWrap = new Wrap<String>().var("inheritPk");
		if(inheritPk == null) {
			_inheritPk(inheritPkWrap);
			setInheritPk(inheritPkWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInheritPk(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrInheritPk(siteRequest_, Article.staticSearchInheritPk(siteRequest_, Article.staticSetInheritPk(siteRequest_, o)));
	}

	public String sqlInheritPk() {
		return inheritPk;
	}

	/////////////
	// created //
	/////////////

	/**	 The entity created
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime created;

	/**	<br> The entity created
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _created(Wrap<ZonedDateTime> w);

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
	}
	@JsonIgnore
	public void setCreated(Instant o) {
		this.created = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setCreated(String o) {
		this.created = Article.staticSetCreated(siteRequest_, o);
	}
	public static ZonedDateTime staticSetCreated(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected Article createdInit() {
		Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().var("created");
		if(created == null) {
			_created(createdWrap);
			setCreated(createdWrap.o);
		}
		return (Article)this;
	}

	public static Date staticSearchCreated(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrCreated(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqCreated(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrCreated(siteRequest_, Article.staticSearchCreated(siteRequest_, Article.staticSetCreated(siteRequest_, o)));
	}

	public OffsetDateTime sqlCreated() {
		return created == null ? null : created.toOffsetDateTime();
	}

	//////////////
	// modified //
	//////////////

	/**	 The entity modified
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonDeserialize(using = ComputateZonedDateTimeDeserializer.class)
	@JsonSerialize(using = ComputateZonedDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSV'['VV']'")
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime modified;

	/**	<br> The entity modified
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:modified">Find the entity modified in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _modified(Wrap<ZonedDateTime> w);

	public ZonedDateTime getModified() {
		return modified;
	}

	public void setModified(ZonedDateTime modified) {
		this.modified = modified;
	}
	@JsonIgnore
	public void setModified(Instant o) {
		this.modified = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	@JsonIgnore
	public void setModified(String o) {
		this.modified = Article.staticSetModified(siteRequest_, o);
	}
	public static ZonedDateTime staticSetModified(SiteRequestEnUS siteRequest_, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		else if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
		else if(StringUtils.contains(o, "T"))
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	@JsonIgnore
	public void setModified(Date o) {
		this.modified = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))).truncatedTo(ChronoUnit.MILLIS);
	}
	protected Article modifiedInit() {
		Wrap<ZonedDateTime> modifiedWrap = new Wrap<ZonedDateTime>().var("modified");
		if(modified == null) {
			_modified(modifiedWrap);
			setModified(modifiedWrap.o);
		}
		return (Article)this;
	}

	public static Date staticSearchModified(SiteRequestEnUS siteRequest_, ZonedDateTime o) {
		return o == null ? null : Date.from(o.toInstant());
	}

	public static String staticSearchStrModified(SiteRequestEnUS siteRequest_, Date o) {
		return "\"" + DateTimeFormatter.ISO_DATE_TIME.format(o.toInstant().atOffset(ZoneOffset.UTC)) + "\"";
	}

	public static String staticSearchFqModified(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrModified(siteRequest_, Article.staticSearchModified(siteRequest_, Article.staticSetModified(siteRequest_, o)));
	}

	//////////////
	// archived //
	//////////////

	/**	 The entity archived
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean archived;

	/**	<br> The entity archived
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:archived">Find the entity archived in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _archived(Wrap<Boolean> w);

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	@JsonIgnore
	public void setArchived(String o) {
		this.archived = Article.staticSetArchived(siteRequest_, o);
	}
	public static Boolean staticSetArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected Article archivedInit() {
		Wrap<Boolean> archivedWrap = new Wrap<Boolean>().var("archived");
		if(archived == null) {
			_archived(archivedWrap);
			setArchived(archivedWrap.o);
		}
		return (Article)this;
	}

	public static Boolean staticSearchArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArchived(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrArchived(siteRequest_, Article.staticSearchArchived(siteRequest_, Article.staticSetArchived(siteRequest_, o)));
	}

	public Boolean sqlArchived() {
		return archived;
	}

	/////////////
	// deleted //
	/////////////

	/**	 The entity deleted
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean deleted;

	/**	<br> The entity deleted
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:deleted">Find the entity deleted in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _deleted(Wrap<Boolean> w);

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@JsonIgnore
	public void setDeleted(String o) {
		this.deleted = Article.staticSetDeleted(siteRequest_, o);
	}
	public static Boolean staticSetDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected Article deletedInit() {
		Wrap<Boolean> deletedWrap = new Wrap<Boolean>().var("deleted");
		if(deleted == null) {
			_deleted(deletedWrap);
			setDeleted(deletedWrap.o);
		}
		return (Article)this;
	}

	public static Boolean staticSearchDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrDeleted(siteRequest_, Article.staticSearchDeleted(siteRequest_, Article.staticSetDeleted(siteRequest_, o)));
	}

	public Boolean sqlDeleted() {
		return deleted;
	}

	////////////////////////
	// classCanonicalName //
	////////////////////////

	/**	 The entity classCanonicalName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classCanonicalName;

	/**	<br> The entity classCanonicalName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:classCanonicalName">Find the entity classCanonicalName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classCanonicalName(Wrap<String> w);

	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String o) {
		this.classCanonicalName = Article.staticSetClassCanonicalName(siteRequest_, o);
	}
	public static String staticSetClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article classCanonicalNameInit() {
		Wrap<String> classCanonicalNameWrap = new Wrap<String>().var("classCanonicalName");
		if(classCanonicalName == null) {
			_classCanonicalName(classCanonicalNameWrap);
			setClassCanonicalName(classCanonicalNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrClassCanonicalName(siteRequest_, Article.staticSearchClassCanonicalName(siteRequest_, Article.staticSetClassCanonicalName(siteRequest_, o)));
	}

	/////////////////////
	// classSimpleName //
	/////////////////////

	/**	 The entity classSimpleName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String classSimpleName;

	/**	<br> The entity classSimpleName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:classSimpleName">Find the entity classSimpleName in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _classSimpleName(Wrap<String> w);

	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String o) {
		this.classSimpleName = Article.staticSetClassSimpleName(siteRequest_, o);
	}
	public static String staticSetClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article classSimpleNameInit() {
		Wrap<String> classSimpleNameWrap = new Wrap<String>().var("classSimpleName");
		if(classSimpleName == null) {
			_classSimpleName(classSimpleNameWrap);
			setClassSimpleName(classSimpleNameWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassSimpleName(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrClassSimpleName(siteRequest_, Article.staticSearchClassSimpleName(siteRequest_, Article.staticSetClassSimpleName(siteRequest_, o)));
	}

	/////////////////////////
	// classCanonicalNames //
	/////////////////////////

	/**	 The entity classCanonicalNames
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> classCanonicalNames = new ArrayList<String>();

	/**	<br> The entity classCanonicalNames
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:classCanonicalNames">Find the entity classCanonicalNames in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _classCanonicalNames(List<String> l);

	public List<String> getClassCanonicalNames() {
		return classCanonicalNames;
	}

	public void setClassCanonicalNames(List<String> classCanonicalNames) {
		this.classCanonicalNames = classCanonicalNames;
	}
	public static String staticSetClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public Article addClassCanonicalNames(String...objets) {
		for(String o : objets) {
			addClassCanonicalNames(o);
		}
		return (Article)this;
	}
	public Article addClassCanonicalNames(String o) {
		if(o != null)
			this.classCanonicalNames.add(o);
		return (Article)this;
	}
	@JsonIgnore
	public void setClassCanonicalNames(JsonArray objets) {
		classCanonicalNames.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClassCanonicalNames(o);
		}
	}
	protected Article classCanonicalNamesInit() {
		_classCanonicalNames(classCanonicalNames);
		return (Article)this;
	}

	public static String staticSearchClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqClassCanonicalNames(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrClassCanonicalNames(siteRequest_, Article.staticSearchClassCanonicalNames(siteRequest_, Article.staticSetClassCanonicalNames(siteRequest_, o)));
	}

	///////////////
	// sessionId //
	///////////////

	/**	 The entity sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;

	/**	<br> The entity sessionId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> w);

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String o) {
		this.sessionId = Article.staticSetSessionId(siteRequest_, o);
	}
	public static String staticSetSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article sessionIdInit() {
		Wrap<String> sessionIdWrap = new Wrap<String>().var("sessionId");
		if(sessionId == null) {
			_sessionId(sessionIdWrap);
			setSessionId(sessionIdWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSessionId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSessionId(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrSessionId(siteRequest_, Article.staticSearchSessionId(siteRequest_, Article.staticSetSessionId(siteRequest_, o)));
	}

	public String sqlSessionId() {
		return sessionId;
	}

	/////////////
	// userKey //
	/////////////

	/**	 The entity userKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long userKey;

	/**	<br> The entity userKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> w);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}
	@JsonIgnore
	public void setUserKey(String o) {
		this.userKey = Article.staticSetUserKey(siteRequest_, o);
	}
	public static Long staticSetUserKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected Article userKeyInit() {
		Wrap<Long> userKeyWrap = new Wrap<Long>().var("userKey");
		if(userKey == null) {
			_userKey(userKeyWrap);
			setUserKey(userKeyWrap.o);
		}
		return (Article)this;
	}

	public static Long staticSearchUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKey(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrUserKey(siteRequest_, Article.staticSearchUserKey(siteRequest_, Article.staticSetUserKey(siteRequest_, o)));
	}

	public Long sqlUserKey() {
		return userKey;
	}

	///////////
	// saves //
	///////////

	/**	 The entity saves
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> saves = new ArrayList<String>();

	/**	<br> The entity saves
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:saves">Find the entity saves in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _saves(List<String> l);

	public List<String> getSaves() {
		return saves;
	}

	public void setSaves(List<String> saves) {
		this.saves = saves;
	}
	public static String staticSetSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	public Article addSaves(String...objets) {
		for(String o : objets) {
			addSaves(o);
		}
		return (Article)this;
	}
	public Article addSaves(String o) {
		if(o != null)
			this.saves.add(o);
		return (Article)this;
	}
	@JsonIgnore
	public void setSaves(JsonArray objets) {
		saves.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addSaves(o);
		}
	}
	protected Article savesInit() {
		_saves(saves);
		return (Article)this;
	}

	public static String staticSearchSaves(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSaves(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSaves(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrSaves(siteRequest_, Article.staticSearchSaves(siteRequest_, Article.staticSetSaves(siteRequest_, o)));
	}

	/////////////////
	// objectTitle //
	/////////////////

	/**	 The entity objectTitle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectTitle;

	/**	<br> The entity objectTitle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:objectTitle">Find the entity objectTitle in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectTitle(Wrap<String> w);

	public String getObjectTitle() {
		return objectTitle;
	}
	public void setObjectTitle(String o) {
		this.objectTitle = Article.staticSetObjectTitle(siteRequest_, o);
	}
	public static String staticSetObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article objectTitleInit() {
		Wrap<String> objectTitleWrap = new Wrap<String>().var("objectTitle");
		if(objectTitle == null) {
			_objectTitle(objectTitleWrap);
			setObjectTitle(objectTitleWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectTitle(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrObjectTitle(siteRequest_, Article.staticSearchObjectTitle(siteRequest_, Article.staticSetObjectTitle(siteRequest_, o)));
	}

	//////////////
	// objectId //
	//////////////

	/**	 The entity objectId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectId;

	/**	<br> The entity objectId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:objectId">Find the entity objectId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectId(Wrap<String> w);

	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String o) {
		this.objectId = Article.staticSetObjectId(siteRequest_, o);
	}
	public static String staticSetObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article objectIdInit() {
		Wrap<String> objectIdWrap = new Wrap<String>().var("objectId");
		if(objectId == null) {
			_objectId(objectIdWrap);
			setObjectId(objectIdWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectId(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrObjectId(siteRequest_, Article.staticSearchObjectId(siteRequest_, Article.staticSetObjectId(siteRequest_, o)));
	}

	public String sqlObjectId() {
		return objectId;
	}

	///////////////////
	// objectNameVar //
	///////////////////

	/**	 The entity objectNameVar
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectNameVar;

	/**	<br> The entity objectNameVar
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:objectNameVar">Find the entity objectNameVar in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectNameVar(Wrap<String> w);

	public String getObjectNameVar() {
		return objectNameVar;
	}
	public void setObjectNameVar(String o) {
		this.objectNameVar = Article.staticSetObjectNameVar(siteRequest_, o);
	}
	public static String staticSetObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article objectNameVarInit() {
		Wrap<String> objectNameVarWrap = new Wrap<String>().var("objectNameVar");
		if(objectNameVar == null) {
			_objectNameVar(objectNameVarWrap);
			setObjectNameVar(objectNameVarWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectNameVar(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrObjectNameVar(siteRequest_, Article.staticSearchObjectNameVar(siteRequest_, Article.staticSetObjectNameVar(siteRequest_, o)));
	}

	///////////////////
	// objectSuggest //
	///////////////////

	/**	 The entity objectSuggest
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectSuggest;

	/**	<br> The entity objectSuggest
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:objectSuggest">Find the entity objectSuggest in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectSuggest(Wrap<String> w);

	public String getObjectSuggest() {
		return objectSuggest;
	}
	public void setObjectSuggest(String o) {
		this.objectSuggest = Article.staticSetObjectSuggest(siteRequest_, o);
	}
	public static String staticSetObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article objectSuggestInit() {
		Wrap<String> objectSuggestWrap = new Wrap<String>().var("objectSuggest");
		if(objectSuggest == null) {
			_objectSuggest(objectSuggestWrap);
			setObjectSuggest(objectSuggestWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectSuggest(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrObjectSuggest(siteRequest_, Article.staticSearchObjectSuggest(siteRequest_, Article.staticSetObjectSuggest(siteRequest_, o)));
	}

	////////////////
	// objectText //
	////////////////

	/**	 The entity objectText
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String objectText;

	/**	<br> The entity objectText
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:objectText">Find the entity objectText in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _objectText(Wrap<String> w);

	public String getObjectText() {
		return objectText;
	}
	public void setObjectText(String o) {
		this.objectText = Article.staticSetObjectText(siteRequest_, o);
	}
	public static String staticSetObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article objectTextInit() {
		Wrap<String> objectTextWrap = new Wrap<String>().var("objectText");
		if(objectText == null) {
			_objectText(objectTextWrap);
			setObjectText(objectTextWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrObjectText(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqObjectText(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrObjectText(siteRequest_, Article.staticSearchObjectText(siteRequest_, Article.staticSetObjectText(siteRequest_, o)));
	}

	///////////////
	// pageUrlId //
	///////////////

	/**	 The entity pageUrlId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlId;

	/**	<br> The entity pageUrlId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUrlId">Find the entity pageUrlId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlId(Wrap<String> w);

	public String getPageUrlId() {
		return pageUrlId;
	}
	public void setPageUrlId(String o) {
		this.pageUrlId = Article.staticSetPageUrlId(siteRequest_, o);
	}
	public static String staticSetPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUrlIdInit() {
		Wrap<String> pageUrlIdWrap = new Wrap<String>().var("pageUrlId");
		if(pageUrlId == null) {
			_pageUrlId(pageUrlIdWrap);
			setPageUrlId(pageUrlIdWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlId(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUrlId(siteRequest_, Article.staticSearchPageUrlId(siteRequest_, Article.staticSetPageUrlId(siteRequest_, o)));
	}

	///////////////
	// pageUrlPk //
	///////////////

	/**	 The entity pageUrlPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlPk;

	/**	<br> The entity pageUrlPk
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUrlPk">Find the entity pageUrlPk in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlPk(Wrap<String> w);

	public String getPageUrlPk() {
		return pageUrlPk;
	}
	public void setPageUrlPk(String o) {
		this.pageUrlPk = Article.staticSetPageUrlPk(siteRequest_, o);
	}
	public static String staticSetPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUrlPkInit() {
		Wrap<String> pageUrlPkWrap = new Wrap<String>().var("pageUrlPk");
		if(pageUrlPk == null) {
			_pageUrlPk(pageUrlPkWrap);
			setPageUrlPk(pageUrlPkWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlPk(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUrlPk(siteRequest_, Article.staticSearchPageUrlPk(siteRequest_, Article.staticSetPageUrlPk(siteRequest_, o)));
	}

	////////////////
	// pageUrlApi //
	////////////////

	/**	 The entity pageUrlApi
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUrlApi;

	/**	<br> The entity pageUrlApi
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:pageUrlApi">Find the entity pageUrlApi in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUrlApi(Wrap<String> w);

	public String getPageUrlApi() {
		return pageUrlApi;
	}
	public void setPageUrlApi(String o) {
		this.pageUrlApi = Article.staticSetPageUrlApi(siteRequest_, o);
	}
	public static String staticSetPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article pageUrlApiInit() {
		Wrap<String> pageUrlApiWrap = new Wrap<String>().var("pageUrlApi");
		if(pageUrlApi == null) {
			_pageUrlApi(pageUrlApiWrap);
			setPageUrlApi(pageUrlApiWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUrlApi(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrPageUrlApi(siteRequest_, Article.staticSearchPageUrlApi(siteRequest_, Article.staticSetPageUrlApi(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.Article&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = Article.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected Article idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (Article)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return Article.staticSearchStrId(siteRequest_, Article.staticSearchId(siteRequest_, Article.staticSetId(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepArticle(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepArticle();
	}

	public Future<Void> promiseDeepArticle() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseArticle(promise2);
		promise2.future().onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseArticle(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			promiseBeforePromise().onSuccess(promiseBefore -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				staticBaseUrlInit();
				domainNameInit();
				siteNameInit();
				siteHostNameInit();
				sitePackageNameInit();
				computerHostNameInit();
				userNameInit();
				cheminProjetInit();
				groupNameInit();
				isCourseInit();
				isLessonInit();
				isArticleInit();
				courseNumberInit();
				lessonNumberInit();
				lessonDescriptionInit();
				articleH1_enUSInit();
				articleH1_frFRInit();
				articleH2_enUSInit();
				articleH2_frFRInit();
				articleH1Init();
				articleH2Init();
				articleDescriptionInit();
				pageDescriptionInit();
				articleCreatedInit();
				pageUri_enUSInit();
				pageUri_frFRInit();
				pageUriInit();
				pageImageUri_enUSInit();
				pageImageUri_frFRInit();
				pageImageUriInit();
				pageCreatedInit();
				pageH1Init();
				pageH2Init();
				pageH3Init();
				pageTitleInit();
				pageSearch_enUSInit();
				pageSearch_frFRInit();
				siteUser_Init();
				userIdInit();
				siteRequest_Init();
				inheritPkInit();
				createdInit();
				modifiedInit();
				archivedInit();
				deletedInit();
				classCanonicalNameInit();
				classSimpleNameInit();
				classCanonicalNamesInit();
				sessionIdInit();
				userKeyInit();
				savesInit();
				objectTitleInit();
				objectIdInit();
				objectNameVarInit();
				objectSuggestInit();
				objectTextInit();
				pageUrlIdInit();
				pageUrlPkInit();
				pageUrlApiInit();
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

	public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepArticle(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestArticle(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestArticle(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainArticle(v);
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
	public Object obtainArticle(String var) {
		Article oArticle = (Article)this;
		switch(var) {
			case "promiseBefore":
				return oArticle.promiseBefore;
			case "staticBaseUrl":
				return oArticle.staticBaseUrl;
			case "domainName":
				return oArticle.domainName;
			case "siteName":
				return oArticle.siteName;
			case "siteHostName":
				return oArticle.siteHostName;
			case "sitePackageName":
				return oArticle.sitePackageName;
			case "computerHostName":
				return oArticle.computerHostName;
			case "userName":
				return oArticle.userName;
			case "cheminProjet":
				return oArticle.cheminProjet;
			case "groupName":
				return oArticle.groupName;
			case "isCourse":
				return oArticle.isCourse;
			case "isLesson":
				return oArticle.isLesson;
			case "isArticle":
				return oArticle.isArticle;
			case "courseNumber":
				return oArticle.courseNumber;
			case "lessonNumber":
				return oArticle.lessonNumber;
			case "lessonDescription":
				return oArticle.lessonDescription;
			case "articleH1_enUS":
				return oArticle.articleH1_enUS;
			case "articleH1_frFR":
				return oArticle.articleH1_frFR;
			case "articleH2_enUS":
				return oArticle.articleH2_enUS;
			case "articleH2_frFR":
				return oArticle.articleH2_frFR;
			case "articleH1":
				return oArticle.articleH1;
			case "articleH2":
				return oArticle.articleH2;
			case "articleDescription":
				return oArticle.articleDescription;
			case "pageDescription":
				return oArticle.pageDescription;
			case "articleCreated":
				return oArticle.articleCreated;
			case "pageUri_enUS":
				return oArticle.pageUri_enUS;
			case "pageUri_frFR":
				return oArticle.pageUri_frFR;
			case "pageUri":
				return oArticle.pageUri;
			case "pageImageUri_enUS":
				return oArticle.pageImageUri_enUS;
			case "pageImageUri_frFR":
				return oArticle.pageImageUri_frFR;
			case "pageImageUri":
				return oArticle.pageImageUri;
			case "pageCreated":
				return oArticle.pageCreated;
			case "pageH1":
				return oArticle.pageH1;
			case "pageH2":
				return oArticle.pageH2;
			case "pageH3":
				return oArticle.pageH3;
			case "pageTitle":
				return oArticle.pageTitle;
			case "pageSearch_enUS":
				return oArticle.pageSearch_enUS;
			case "pageSearch_frFR":
				return oArticle.pageSearch_frFR;
			case "siteUser_":
				return oArticle.siteUser_;
			case "userId":
				return oArticle.userId;
			case "siteRequest_":
				return oArticle.siteRequest_;
			case "inheritPk":
				return oArticle.inheritPk;
			case "created":
				return oArticle.created;
			case "modified":
				return oArticle.modified;
			case "archived":
				return oArticle.archived;
			case "deleted":
				return oArticle.deleted;
			case "classCanonicalName":
				return oArticle.classCanonicalName;
			case "classSimpleName":
				return oArticle.classSimpleName;
			case "classCanonicalNames":
				return oArticle.classCanonicalNames;
			case "sessionId":
				return oArticle.sessionId;
			case "userKey":
				return oArticle.userKey;
			case "saves":
				return oArticle.saves;
			case "objectTitle":
				return oArticle.objectTitle;
			case "objectId":
				return oArticle.objectId;
			case "objectNameVar":
				return oArticle.objectNameVar;
			case "objectSuggest":
				return oArticle.objectSuggest;
			case "objectText":
				return oArticle.objectText;
			case "pageUrlId":
				return oArticle.pageUrlId;
			case "pageUrlPk":
				return oArticle.pageUrlPk;
			case "pageUrlApi":
				return oArticle.pageUrlApi;
			case "id":
				return oArticle.id;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateArticle(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateArticle(String var, Object val) {
		Article oArticle = (Article)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetArticle(entityVar,  siteRequest_, o);
	}
	public static Object staticSetArticle(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "staticBaseUrl":
			return Article.staticSetStaticBaseUrl(siteRequest_, o);
		case "domainName":
			return Article.staticSetDomainName(siteRequest_, o);
		case "siteName":
			return Article.staticSetSiteName(siteRequest_, o);
		case "siteHostName":
			return Article.staticSetSiteHostName(siteRequest_, o);
		case "sitePackageName":
			return Article.staticSetSitePackageName(siteRequest_, o);
		case "computerHostName":
			return Article.staticSetComputerHostName(siteRequest_, o);
		case "userName":
			return Article.staticSetUserName(siteRequest_, o);
		case "cheminProjet":
			return Article.staticSetCheminProjet(siteRequest_, o);
		case "groupName":
			return Article.staticSetGroupName(siteRequest_, o);
		case "isCourse":
			return Article.staticSetIsCourse(siteRequest_, o);
		case "isLesson":
			return Article.staticSetIsLesson(siteRequest_, o);
		case "isArticle":
			return Article.staticSetIsArticle(siteRequest_, o);
		case "courseNumber":
			return Article.staticSetCourseNumber(siteRequest_, o);
		case "lessonNumber":
			return Article.staticSetLessonNumber(siteRequest_, o);
		case "lessonDescription":
			return Article.staticSetLessonDescription(siteRequest_, o);
		case "articleH1_enUS":
			return Article.staticSetArticleH1_enUS(siteRequest_, o);
		case "articleH1_frFR":
			return Article.staticSetArticleH1_frFR(siteRequest_, o);
		case "articleH2_enUS":
			return Article.staticSetArticleH2_enUS(siteRequest_, o);
		case "articleH2_frFR":
			return Article.staticSetArticleH2_frFR(siteRequest_, o);
		case "articleH1":
			return Article.staticSetArticleH1(siteRequest_, o);
		case "articleH2":
			return Article.staticSetArticleH2(siteRequest_, o);
		case "articleDescription":
			return Article.staticSetArticleDescription(siteRequest_, o);
		case "pageDescription":
			return Article.staticSetPageDescription(siteRequest_, o);
		case "articleCreated":
			return Article.staticSetArticleCreated(siteRequest_, o);
		case "pageUri_enUS":
			return Article.staticSetPageUri_enUS(siteRequest_, o);
		case "pageUri_frFR":
			return Article.staticSetPageUri_frFR(siteRequest_, o);
		case "pageUri":
			return Article.staticSetPageUri(siteRequest_, o);
		case "pageImageUri_enUS":
			return Article.staticSetPageImageUri_enUS(siteRequest_, o);
		case "pageImageUri_frFR":
			return Article.staticSetPageImageUri_frFR(siteRequest_, o);
		case "pageImageUri":
			return Article.staticSetPageImageUri(siteRequest_, o);
		case "pageCreated":
			return Article.staticSetPageCreated(siteRequest_, o);
		case "pageH1":
			return Article.staticSetPageH1(siteRequest_, o);
		case "pageH2":
			return Article.staticSetPageH2(siteRequest_, o);
		case "pageH3":
			return Article.staticSetPageH3(siteRequest_, o);
		case "pageTitle":
			return Article.staticSetPageTitle(siteRequest_, o);
		case "pageSearch_enUS":
			return Article.staticSetPageSearch_enUS(siteRequest_, o);
		case "pageSearch_frFR":
			return Article.staticSetPageSearch_frFR(siteRequest_, o);
		case "userId":
			return Article.staticSetUserId(siteRequest_, o);
		case "inheritPk":
			return Article.staticSetInheritPk(siteRequest_, o);
		case "created":
			return Article.staticSetCreated(siteRequest_, o);
		case "modified":
			return Article.staticSetModified(siteRequest_, o);
		case "archived":
			return Article.staticSetArchived(siteRequest_, o);
		case "deleted":
			return Article.staticSetDeleted(siteRequest_, o);
		case "classCanonicalName":
			return Article.staticSetClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return Article.staticSetClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return Article.staticSetClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return Article.staticSetSessionId(siteRequest_, o);
		case "userKey":
			return Article.staticSetUserKey(siteRequest_, o);
		case "saves":
			return Article.staticSetSaves(siteRequest_, o);
		case "objectTitle":
			return Article.staticSetObjectTitle(siteRequest_, o);
		case "objectId":
			return Article.staticSetObjectId(siteRequest_, o);
		case "objectNameVar":
			return Article.staticSetObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return Article.staticSetObjectSuggest(siteRequest_, o);
		case "objectText":
			return Article.staticSetObjectText(siteRequest_, o);
		case "pageUrlId":
			return Article.staticSetPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return Article.staticSetPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return Article.staticSetPageUrlApi(siteRequest_, o);
		case "id":
			return Article.staticSetId(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchArticle(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchArticle(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "staticBaseUrl":
			return Article.staticSearchStaticBaseUrl(siteRequest_, (String)o);
		case "domainName":
			return Article.staticSearchDomainName(siteRequest_, (String)o);
		case "siteName":
			return Article.staticSearchSiteName(siteRequest_, (String)o);
		case "siteHostName":
			return Article.staticSearchSiteHostName(siteRequest_, (String)o);
		case "sitePackageName":
			return Article.staticSearchSitePackageName(siteRequest_, (String)o);
		case "computerHostName":
			return Article.staticSearchComputerHostName(siteRequest_, (String)o);
		case "userName":
			return Article.staticSearchUserName(siteRequest_, (String)o);
		case "cheminProjet":
			return Article.staticSearchCheminProjet(siteRequest_, (String)o);
		case "groupName":
			return Article.staticSearchGroupName(siteRequest_, (String)o);
		case "isCourse":
			return Article.staticSearchIsCourse(siteRequest_, (Boolean)o);
		case "isLesson":
			return Article.staticSearchIsLesson(siteRequest_, (Boolean)o);
		case "isArticle":
			return Article.staticSearchIsArticle(siteRequest_, (Boolean)o);
		case "courseNumber":
			return Article.staticSearchCourseNumber(siteRequest_, (Integer)o);
		case "lessonNumber":
			return Article.staticSearchLessonNumber(siteRequest_, (Integer)o);
		case "lessonDescription":
			return Article.staticSearchLessonDescription(siteRequest_, (String)o);
		case "articleH1_enUS":
			return Article.staticSearchArticleH1_enUS(siteRequest_, (String)o);
		case "articleH1_frFR":
			return Article.staticSearchArticleH1_frFR(siteRequest_, (String)o);
		case "articleH2_enUS":
			return Article.staticSearchArticleH2_enUS(siteRequest_, (String)o);
		case "articleH2_frFR":
			return Article.staticSearchArticleH2_frFR(siteRequest_, (String)o);
		case "articleH1":
			return Article.staticSearchArticleH1(siteRequest_, (String)o);
		case "articleH2":
			return Article.staticSearchArticleH2(siteRequest_, (String)o);
		case "articleDescription":
			return Article.staticSearchArticleDescription(siteRequest_, (String)o);
		case "pageDescription":
			return Article.staticSearchPageDescription(siteRequest_, (String)o);
		case "articleCreated":
			return Article.staticSearchArticleCreated(siteRequest_, (ZonedDateTime)o);
		case "pageUri_enUS":
			return Article.staticSearchPageUri_enUS(siteRequest_, (String)o);
		case "pageUri_frFR":
			return Article.staticSearchPageUri_frFR(siteRequest_, (String)o);
		case "pageUri":
			return Article.staticSearchPageUri(siteRequest_, (String)o);
		case "pageImageUri_enUS":
			return Article.staticSearchPageImageUri_enUS(siteRequest_, (String)o);
		case "pageImageUri_frFR":
			return Article.staticSearchPageImageUri_frFR(siteRequest_, (String)o);
		case "pageImageUri":
			return Article.staticSearchPageImageUri(siteRequest_, (String)o);
		case "pageCreated":
			return Article.staticSearchPageCreated(siteRequest_, (ZonedDateTime)o);
		case "pageH1":
			return Article.staticSearchPageH1(siteRequest_, (String)o);
		case "pageH2":
			return Article.staticSearchPageH2(siteRequest_, (String)o);
		case "pageH3":
			return Article.staticSearchPageH3(siteRequest_, (String)o);
		case "pageTitle":
			return Article.staticSearchPageTitle(siteRequest_, (String)o);
		case "pageSearch_enUS":
			return Article.staticSearchPageSearch_enUS(siteRequest_, (String)o);
		case "pageSearch_frFR":
			return Article.staticSearchPageSearch_frFR(siteRequest_, (String)o);
		case "userId":
			return Article.staticSearchUserId(siteRequest_, (String)o);
		case "inheritPk":
			return Article.staticSearchInheritPk(siteRequest_, (String)o);
		case "created":
			return Article.staticSearchCreated(siteRequest_, (ZonedDateTime)o);
		case "modified":
			return Article.staticSearchModified(siteRequest_, (ZonedDateTime)o);
		case "archived":
			return Article.staticSearchArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return Article.staticSearchDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return Article.staticSearchClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return Article.staticSearchClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return Article.staticSearchClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return Article.staticSearchSessionId(siteRequest_, (String)o);
		case "userKey":
			return Article.staticSearchUserKey(siteRequest_, (Long)o);
		case "saves":
			return Article.staticSearchSaves(siteRequest_, (String)o);
		case "objectTitle":
			return Article.staticSearchObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return Article.staticSearchObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return Article.staticSearchObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return Article.staticSearchObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return Article.staticSearchObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return Article.staticSearchPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return Article.staticSearchPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return Article.staticSearchPageUrlApi(siteRequest_, (String)o);
		case "id":
			return Article.staticSearchId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrArticle(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrArticle(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "staticBaseUrl":
			return Article.staticSearchStrStaticBaseUrl(siteRequest_, (String)o);
		case "domainName":
			return Article.staticSearchStrDomainName(siteRequest_, (String)o);
		case "siteName":
			return Article.staticSearchStrSiteName(siteRequest_, (String)o);
		case "siteHostName":
			return Article.staticSearchStrSiteHostName(siteRequest_, (String)o);
		case "sitePackageName":
			return Article.staticSearchStrSitePackageName(siteRequest_, (String)o);
		case "computerHostName":
			return Article.staticSearchStrComputerHostName(siteRequest_, (String)o);
		case "userName":
			return Article.staticSearchStrUserName(siteRequest_, (String)o);
		case "cheminProjet":
			return Article.staticSearchStrCheminProjet(siteRequest_, (String)o);
		case "groupName":
			return Article.staticSearchStrGroupName(siteRequest_, (String)o);
		case "isCourse":
			return Article.staticSearchStrIsCourse(siteRequest_, (Boolean)o);
		case "isLesson":
			return Article.staticSearchStrIsLesson(siteRequest_, (Boolean)o);
		case "isArticle":
			return Article.staticSearchStrIsArticle(siteRequest_, (Boolean)o);
		case "courseNumber":
			return Article.staticSearchStrCourseNumber(siteRequest_, (Integer)o);
		case "lessonNumber":
			return Article.staticSearchStrLessonNumber(siteRequest_, (Integer)o);
		case "lessonDescription":
			return Article.staticSearchStrLessonDescription(siteRequest_, (String)o);
		case "articleH1_enUS":
			return Article.staticSearchStrArticleH1_enUS(siteRequest_, (String)o);
		case "articleH1_frFR":
			return Article.staticSearchStrArticleH1_frFR(siteRequest_, (String)o);
		case "articleH2_enUS":
			return Article.staticSearchStrArticleH2_enUS(siteRequest_, (String)o);
		case "articleH2_frFR":
			return Article.staticSearchStrArticleH2_frFR(siteRequest_, (String)o);
		case "articleH1":
			return Article.staticSearchStrArticleH1(siteRequest_, (String)o);
		case "articleH2":
			return Article.staticSearchStrArticleH2(siteRequest_, (String)o);
		case "articleDescription":
			return Article.staticSearchStrArticleDescription(siteRequest_, (String)o);
		case "pageDescription":
			return Article.staticSearchStrPageDescription(siteRequest_, (String)o);
		case "articleCreated":
			return Article.staticSearchStrArticleCreated(siteRequest_, (Date)o);
		case "pageUri_enUS":
			return Article.staticSearchStrPageUri_enUS(siteRequest_, (String)o);
		case "pageUri_frFR":
			return Article.staticSearchStrPageUri_frFR(siteRequest_, (String)o);
		case "pageUri":
			return Article.staticSearchStrPageUri(siteRequest_, (String)o);
		case "pageImageUri_enUS":
			return Article.staticSearchStrPageImageUri_enUS(siteRequest_, (String)o);
		case "pageImageUri_frFR":
			return Article.staticSearchStrPageImageUri_frFR(siteRequest_, (String)o);
		case "pageImageUri":
			return Article.staticSearchStrPageImageUri(siteRequest_, (String)o);
		case "pageCreated":
			return Article.staticSearchStrPageCreated(siteRequest_, (Date)o);
		case "pageH1":
			return Article.staticSearchStrPageH1(siteRequest_, (String)o);
		case "pageH2":
			return Article.staticSearchStrPageH2(siteRequest_, (String)o);
		case "pageH3":
			return Article.staticSearchStrPageH3(siteRequest_, (String)o);
		case "pageTitle":
			return Article.staticSearchStrPageTitle(siteRequest_, (String)o);
		case "pageSearch_enUS":
			return Article.staticSearchStrPageSearch_enUS(siteRequest_, (String)o);
		case "pageSearch_frFR":
			return Article.staticSearchStrPageSearch_frFR(siteRequest_, (String)o);
		case "userId":
			return Article.staticSearchStrUserId(siteRequest_, (String)o);
		case "inheritPk":
			return Article.staticSearchStrInheritPk(siteRequest_, (String)o);
		case "created":
			return Article.staticSearchStrCreated(siteRequest_, (Date)o);
		case "modified":
			return Article.staticSearchStrModified(siteRequest_, (Date)o);
		case "archived":
			return Article.staticSearchStrArchived(siteRequest_, (Boolean)o);
		case "deleted":
			return Article.staticSearchStrDeleted(siteRequest_, (Boolean)o);
		case "classCanonicalName":
			return Article.staticSearchStrClassCanonicalName(siteRequest_, (String)o);
		case "classSimpleName":
			return Article.staticSearchStrClassSimpleName(siteRequest_, (String)o);
		case "classCanonicalNames":
			return Article.staticSearchStrClassCanonicalNames(siteRequest_, (String)o);
		case "sessionId":
			return Article.staticSearchStrSessionId(siteRequest_, (String)o);
		case "userKey":
			return Article.staticSearchStrUserKey(siteRequest_, (Long)o);
		case "saves":
			return Article.staticSearchStrSaves(siteRequest_, (String)o);
		case "objectTitle":
			return Article.staticSearchStrObjectTitle(siteRequest_, (String)o);
		case "objectId":
			return Article.staticSearchStrObjectId(siteRequest_, (String)o);
		case "objectNameVar":
			return Article.staticSearchStrObjectNameVar(siteRequest_, (String)o);
		case "objectSuggest":
			return Article.staticSearchStrObjectSuggest(siteRequest_, (String)o);
		case "objectText":
			return Article.staticSearchStrObjectText(siteRequest_, (String)o);
		case "pageUrlId":
			return Article.staticSearchStrPageUrlId(siteRequest_, (String)o);
		case "pageUrlPk":
			return Article.staticSearchStrPageUrlPk(siteRequest_, (String)o);
		case "pageUrlApi":
			return Article.staticSearchStrPageUrlApi(siteRequest_, (String)o);
		case "id":
			return Article.staticSearchStrId(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqArticle(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqArticle(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "staticBaseUrl":
			return Article.staticSearchFqStaticBaseUrl(siteRequest_, o);
		case "domainName":
			return Article.staticSearchFqDomainName(siteRequest_, o);
		case "siteName":
			return Article.staticSearchFqSiteName(siteRequest_, o);
		case "siteHostName":
			return Article.staticSearchFqSiteHostName(siteRequest_, o);
		case "sitePackageName":
			return Article.staticSearchFqSitePackageName(siteRequest_, o);
		case "computerHostName":
			return Article.staticSearchFqComputerHostName(siteRequest_, o);
		case "userName":
			return Article.staticSearchFqUserName(siteRequest_, o);
		case "cheminProjet":
			return Article.staticSearchFqCheminProjet(siteRequest_, o);
		case "groupName":
			return Article.staticSearchFqGroupName(siteRequest_, o);
		case "isCourse":
			return Article.staticSearchFqIsCourse(siteRequest_, o);
		case "isLesson":
			return Article.staticSearchFqIsLesson(siteRequest_, o);
		case "isArticle":
			return Article.staticSearchFqIsArticle(siteRequest_, o);
		case "courseNumber":
			return Article.staticSearchFqCourseNumber(siteRequest_, o);
		case "lessonNumber":
			return Article.staticSearchFqLessonNumber(siteRequest_, o);
		case "lessonDescription":
			return Article.staticSearchFqLessonDescription(siteRequest_, o);
		case "articleH1_enUS":
			return Article.staticSearchFqArticleH1_enUS(siteRequest_, o);
		case "articleH1_frFR":
			return Article.staticSearchFqArticleH1_frFR(siteRequest_, o);
		case "articleH2_enUS":
			return Article.staticSearchFqArticleH2_enUS(siteRequest_, o);
		case "articleH2_frFR":
			return Article.staticSearchFqArticleH2_frFR(siteRequest_, o);
		case "articleH1":
			return Article.staticSearchFqArticleH1(siteRequest_, o);
		case "articleH2":
			return Article.staticSearchFqArticleH2(siteRequest_, o);
		case "articleDescription":
			return Article.staticSearchFqArticleDescription(siteRequest_, o);
		case "pageDescription":
			return Article.staticSearchFqPageDescription(siteRequest_, o);
		case "articleCreated":
			return Article.staticSearchFqArticleCreated(siteRequest_, o);
		case "pageUri_enUS":
			return Article.staticSearchFqPageUri_enUS(siteRequest_, o);
		case "pageUri_frFR":
			return Article.staticSearchFqPageUri_frFR(siteRequest_, o);
		case "pageUri":
			return Article.staticSearchFqPageUri(siteRequest_, o);
		case "pageImageUri_enUS":
			return Article.staticSearchFqPageImageUri_enUS(siteRequest_, o);
		case "pageImageUri_frFR":
			return Article.staticSearchFqPageImageUri_frFR(siteRequest_, o);
		case "pageImageUri":
			return Article.staticSearchFqPageImageUri(siteRequest_, o);
		case "pageCreated":
			return Article.staticSearchFqPageCreated(siteRequest_, o);
		case "pageH1":
			return Article.staticSearchFqPageH1(siteRequest_, o);
		case "pageH2":
			return Article.staticSearchFqPageH2(siteRequest_, o);
		case "pageH3":
			return Article.staticSearchFqPageH3(siteRequest_, o);
		case "pageTitle":
			return Article.staticSearchFqPageTitle(siteRequest_, o);
		case "pageSearch_enUS":
			return Article.staticSearchFqPageSearch_enUS(siteRequest_, o);
		case "pageSearch_frFR":
			return Article.staticSearchFqPageSearch_frFR(siteRequest_, o);
		case "userId":
			return Article.staticSearchFqUserId(siteRequest_, o);
		case "inheritPk":
			return Article.staticSearchFqInheritPk(siteRequest_, o);
		case "created":
			return Article.staticSearchFqCreated(siteRequest_, o);
		case "modified":
			return Article.staticSearchFqModified(siteRequest_, o);
		case "archived":
			return Article.staticSearchFqArchived(siteRequest_, o);
		case "deleted":
			return Article.staticSearchFqDeleted(siteRequest_, o);
		case "classCanonicalName":
			return Article.staticSearchFqClassCanonicalName(siteRequest_, o);
		case "classSimpleName":
			return Article.staticSearchFqClassSimpleName(siteRequest_, o);
		case "classCanonicalNames":
			return Article.staticSearchFqClassCanonicalNames(siteRequest_, o);
		case "sessionId":
			return Article.staticSearchFqSessionId(siteRequest_, o);
		case "userKey":
			return Article.staticSearchFqUserKey(siteRequest_, o);
		case "saves":
			return Article.staticSearchFqSaves(siteRequest_, o);
		case "objectTitle":
			return Article.staticSearchFqObjectTitle(siteRequest_, o);
		case "objectId":
			return Article.staticSearchFqObjectId(siteRequest_, o);
		case "objectNameVar":
			return Article.staticSearchFqObjectNameVar(siteRequest_, o);
		case "objectSuggest":
			return Article.staticSearchFqObjectSuggest(siteRequest_, o);
		case "objectText":
			return Article.staticSearchFqObjectText(siteRequest_, o);
		case "pageUrlId":
			return Article.staticSearchFqPageUrlId(siteRequest_, o);
		case "pageUrlPk":
			return Article.staticSearchFqPageUrlPk(siteRequest_, o);
		case "pageUrlApi":
			return Article.staticSearchFqPageUrlApi(siteRequest_, o);
		case "id":
			return Article.staticSearchFqId(siteRequest_, o);
			default:
				return null;
		}
	}

	/////////////
	// persist //
	/////////////

	public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistArticle(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistArticle(String var, Object val) {
		switch(var.toLowerCase()) {
			case "inheritpk":
				if(val instanceof String)
					setInheritPk((String)val);
				saves.add("inheritPk");
				return val;
			case "created":
				if(val instanceof ZonedDateTime)
					setCreated((ZonedDateTime)val);
				else if(val instanceof String)
					setCreated((String)val);
				else if(val instanceof OffsetDateTime)
					setCreated(((OffsetDateTime)val).atZoneSameInstant(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
				saves.add("created");
				return val;
			case "archived":
				if(val instanceof Boolean)
					setArchived((Boolean)val);
				else if(val instanceof String)
					setArchived((String)val);
				saves.add("archived");
				return val;
			case "deleted":
				if(val instanceof Boolean)
					setDeleted((Boolean)val);
				else if(val instanceof String)
					setDeleted((String)val);
				saves.add("deleted");
				return val;
			case "sessionid":
				if(val instanceof String)
					setSessionId((String)val);
				saves.add("sessionId");
				return val;
			case "userkey":
				if(val instanceof Long)
					setUserKey((Long)val);
				else if(val instanceof String)
					setUserKey((String)val);
				saves.add("userKey");
				return val;
			case "objectid":
				if(val instanceof String)
					setObjectId((String)val);
				saves.add("objectId");
				return val;
			default:
				return null;
		}
	}

	/////////////
	// populate //
	/////////////

	public void populateForClass(SolrResponse.Doc doc) {
		populateArticle(doc);
	}
	public void populateArticle(SolrResponse.Doc doc) {
		Article oArticle = (Article)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}
	}

	public void indexArticle(JsonObject doc) {
		if(inheritPk != null) {
			doc.put("inheritPk_docvalues_string", inheritPk);
		}
		if(created != null) {
			doc.put("created_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(created.toInstant(), ZoneId.of("UTC"))));
		}
		if(modified != null) {
			doc.put("modified_docvalues_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(modified.toInstant(), ZoneId.of("UTC"))));
		}
		if(archived != null) {
			doc.put("archived_docvalues_boolean", archived);
		}
		if(deleted != null) {
			doc.put("deleted_docvalues_boolean", deleted);
		}
		if(classCanonicalName != null) {
			doc.put("classCanonicalName_docvalues_string", classCanonicalName);
		}
		if(classSimpleName != null) {
			doc.put("classSimpleName_docvalues_string", classSimpleName);
		}
		if(classCanonicalNames != null) {
			JsonArray l = new JsonArray();
			doc.put("classCanonicalNames_docvalues_strings", l);
			for(String o : classCanonicalNames) {
				l.add(o);
			}
		}
		if(sessionId != null) {
			doc.put("sessionId_docvalues_string", sessionId);
		}
		if(userKey != null) {
			doc.put("userKey_docvalues_long", userKey);
		}
		if(saves != null) {
			JsonArray l = new JsonArray();
			doc.put("saves_docvalues_strings", l);
			for(String o : saves) {
				l.add(o);
			}
		}
		if(objectTitle != null) {
			doc.put("objectTitle_docvalues_string", objectTitle);
		}
		if(objectId != null) {
			doc.put("objectId_docvalues_string", objectId);
		}
		if(objectSuggest != null) {
			doc.put("objectSuggest_suggested", objectSuggest);
		}
		if(objectText != null) {
			doc.put("objectText_text_enUS", objectText.toString());
		}
		if(pageUrlId != null) {
			doc.put("pageUrlId_docvalues_string", pageUrlId);
		}
		if(pageUrlPk != null) {
			doc.put("pageUrlPk_docvalues_string", pageUrlPk);
		}
		if(pageUrlApi != null) {
			doc.put("pageUrlApi_docvalues_string", pageUrlApi);
		}
		if(id != null) {
			doc.put("id", id);
		}
	}

	public static String varStoredArticle(String entityVar) {
		switch(entityVar) {
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "objectText":
				return "objectText_docvalues_string";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			default:
				return null;
		}
	}

	public static String varIndexedArticle(String entityVar) {
		switch(entityVar) {
			case "inheritPk":
				return "inheritPk_docvalues_string";
			case "created":
				return "created_docvalues_date";
			case "modified":
				return "modified_docvalues_date";
			case "archived":
				return "archived_docvalues_boolean";
			case "deleted":
				return "deleted_docvalues_boolean";
			case "classCanonicalName":
				return "classCanonicalName_docvalues_string";
			case "classSimpleName":
				return "classSimpleName_docvalues_string";
			case "classCanonicalNames":
				return "classCanonicalNames_docvalues_strings";
			case "sessionId":
				return "sessionId_docvalues_string";
			case "userKey":
				return "userKey_docvalues_long";
			case "saves":
				return "saves_docvalues_strings";
			case "objectTitle":
				return "objectTitle_docvalues_string";
			case "objectId":
				return "objectId_docvalues_string";
			case "objectSuggest":
				return "objectSuggest_suggested";
			case "objectText":
				return "objectText_text_enUS";
			case "pageUrlId":
				return "pageUrlId_docvalues_string";
			case "pageUrlPk":
				return "pageUrlPk_docvalues_string";
			case "pageUrlApi":
				return "pageUrlApi_docvalues_string";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String searchVarArticle(String searchVar) {
		switch(searchVar) {
			case "inheritPk_docvalues_string":
				return "inheritPk";
			case "created_docvalues_date":
				return "created";
			case "modified_docvalues_date":
				return "modified";
			case "archived_docvalues_boolean":
				return "archived";
			case "deleted_docvalues_boolean":
				return "deleted";
			case "classCanonicalName_docvalues_string":
				return "classCanonicalName";
			case "classSimpleName_docvalues_string":
				return "classSimpleName";
			case "classCanonicalNames_docvalues_strings":
				return "classCanonicalNames";
			case "sessionId_docvalues_string":
				return "sessionId";
			case "userKey_docvalues_long":
				return "userKey";
			case "saves_docvalues_strings":
				return "saves";
			case "objectTitle_docvalues_string":
				return "objectTitle";
			case "objectId_docvalues_string":
				return "objectId";
			case "objectSuggest_suggested":
				return "objectSuggest";
			case "objectText_text_enUS":
				return "objectText";
			case "pageUrlId_docvalues_string":
				return "pageUrlId";
			case "pageUrlPk_docvalues_string":
				return "pageUrlPk";
			case "pageUrlApi_docvalues_string":
				return "pageUrlApi";
			case "id":
				return "id";
			default:
				return null;
		}
	}

	public static String varSearchArticle(String entityVar) {
		switch(entityVar) {
			case "objectText":
				return "objectText_text_enUS";
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	public static String varSuggestedArticle(String entityVar) {
		switch(entityVar) {
			case "objectSuggest":
				return "objectSuggest_suggested";
			default:
				return null;
		}
	}

	/////////////
	// store //
	/////////////

	public void storeForClass(SolrResponse.Doc doc) {
		storeArticle(doc);
	}
	public void storeArticle(SolrResponse.Doc doc) {
		Article oArticle = (Article)this;

		oArticle.setInheritPk(Optional.ofNullable(doc.get("inheritPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setCreated(Optional.ofNullable(doc.get("created_docvalues_date")).map(v -> v.toString()).orElse(null));
		oArticle.setModified(Optional.ofNullable(doc.get("modified_docvalues_date")).map(v -> v.toString()).orElse(null));
		oArticle.setArchived(Optional.ofNullable(doc.get("archived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oArticle.setDeleted(Optional.ofNullable(doc.get("deleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oArticle.setClassCanonicalName(Optional.ofNullable(doc.get("classCanonicalName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setClassSimpleName(Optional.ofNullable(doc.get("classSimpleName_docvalues_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("classCanonicalNames_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oArticle.addClassCanonicalNames(v.toString());
		});
		oArticle.setSessionId(Optional.ofNullable(doc.get("sessionId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setUserKey(Optional.ofNullable(doc.get("userKey_docvalues_long")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("saves_docvalues_strings")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oArticle.addSaves(v.toString());
		});
		oArticle.setObjectTitle(Optional.ofNullable(doc.get("objectTitle_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setObjectId(Optional.ofNullable(doc.get("objectId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setObjectSuggest(Optional.ofNullable(doc.get("objectSuggest_suggested")).map(v -> v.toString()).orElse(null));
		oArticle.setObjectText(Optional.ofNullable(doc.get("objectText_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setPageUrlId(Optional.ofNullable(doc.get("pageUrlId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setPageUrlPk(Optional.ofNullable(doc.get("pageUrlPk_docvalues_string")).map(v -> v.toString()).orElse(null));
		oArticle.setPageUrlApi(Optional.ofNullable(doc.get("pageUrlApi_docvalues_string")).map(v -> v.toString()).orElse(null));
		String id = (String)doc.get("id");
		oArticle.setId(id);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestArticle() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof Article) {
			Article original = (Article)o;
			if(!Objects.equals(inheritPk, original.getInheritPk()))
				apiRequest.addVars("inheritPk");
			if(!Objects.equals(created, original.getCreated()))
				apiRequest.addVars("created");
			if(!Objects.equals(modified, original.getModified()))
				apiRequest.addVars("modified");
			if(!Objects.equals(archived, original.getArchived()))
				apiRequest.addVars("archived");
			if(!Objects.equals(deleted, original.getDeleted()))
				apiRequest.addVars("deleted");
			if(!Objects.equals(classCanonicalName, original.getClassCanonicalName()))
				apiRequest.addVars("classCanonicalName");
			if(!Objects.equals(classSimpleName, original.getClassSimpleName()))
				apiRequest.addVars("classSimpleName");
			if(!Objects.equals(classCanonicalNames, original.getClassCanonicalNames()))
				apiRequest.addVars("classCanonicalNames");
			if(!Objects.equals(sessionId, original.getSessionId()))
				apiRequest.addVars("sessionId");
			if(!Objects.equals(userKey, original.getUserKey()))
				apiRequest.addVars("userKey");
			if(!Objects.equals(saves, original.getSaves()))
				apiRequest.addVars("saves");
			if(!Objects.equals(objectTitle, original.getObjectTitle()))
				apiRequest.addVars("objectTitle");
			if(!Objects.equals(objectId, original.getObjectId()))
				apiRequest.addVars("objectId");
			if(!Objects.equals(objectSuggest, original.getObjectSuggest()))
				apiRequest.addVars("objectSuggest");
			if(!Objects.equals(objectText, original.getObjectText()))
				apiRequest.addVars("objectText");
			if(!Objects.equals(pageUrlId, original.getPageUrlId()))
				apiRequest.addVars("pageUrlId");
			if(!Objects.equals(pageUrlPk, original.getPageUrlPk()))
				apiRequest.addVars("pageUrlPk");
			if(!Objects.equals(pageUrlApi, original.getPageUrlApi()))
				apiRequest.addVars("pageUrlApi");
			if(!Objects.equals(id, original.getId()))
				apiRequest.addVars("id");
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Optional.ofNullable(inheritPk).map(v -> "inheritPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(created).map(v -> "created: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(modified).map(v -> "modified: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(archived).map(v -> "archived: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(deleted).map(v -> "deleted: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(classCanonicalName).map(v -> "classCanonicalName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classSimpleName).map(v -> "classSimpleName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(classCanonicalNames).map(v -> "classCanonicalNames: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(sessionId).map(v -> "sessionId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userKey).map(v -> "userKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(saves).map(v -> "saves: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(objectTitle).map(v -> "objectTitle: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectId).map(v -> "objectId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectSuggest).map(v -> "objectSuggest: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(objectText).map(v -> "objectText: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlId).map(v -> "pageUrlId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlPk).map(v -> "pageUrlPk: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(pageUrlApi).map(v -> "pageUrlApi: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(id).map(v -> "id: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "Article";
	public static final String VAR_promiseBefore = "promiseBefore";
	public static final String VAR_staticBaseUrl = "staticBaseUrl";
	public static final String VAR_domainName = "domainName";
	public static final String VAR_siteName = "siteName";
	public static final String VAR_siteHostName = "siteHostName";
	public static final String VAR_sitePackageName = "sitePackageName";
	public static final String VAR_computerHostName = "computerHostName";
	public static final String VAR_userName = "userName";
	public static final String VAR_cheminProjet = "cheminProjet";
	public static final String VAR_groupName = "groupName";
	public static final String VAR_isCourse = "isCourse";
	public static final String VAR_isLesson = "isLesson";
	public static final String VAR_isArticle = "isArticle";
	public static final String VAR_courseNumber = "courseNumber";
	public static final String VAR_lessonNumber = "lessonNumber";
	public static final String VAR_lessonDescription = "lessonDescription";
	public static final String VAR_articleH1_enUS = "articleH1_enUS";
	public static final String VAR_articleH1_frFR = "articleH1_frFR";
	public static final String VAR_articleH2_enUS = "articleH2_enUS";
	public static final String VAR_articleH2_frFR = "articleH2_frFR";
	public static final String VAR_articleH1 = "articleH1";
	public static final String VAR_articleH2 = "articleH2";
	public static final String VAR_articleDescription = "articleDescription";
	public static final String VAR_pageDescription = "pageDescription";
	public static final String VAR_articleCreated = "articleCreated";
	public static final String VAR_pageUri_enUS = "pageUri_enUS";
	public static final String VAR_pageUri_frFR = "pageUri_frFR";
	public static final String VAR_pageUri = "pageUri";
	public static final String VAR_pageImageUri_enUS = "pageImageUri_enUS";
	public static final String VAR_pageImageUri_frFR = "pageImageUri_frFR";
	public static final String VAR_pageImageUri = "pageImageUri";
	public static final String VAR_pageCreated = "pageCreated";
	public static final String VAR_pageH1 = "pageH1";
	public static final String VAR_pageH2 = "pageH2";
	public static final String VAR_pageH3 = "pageH3";
	public static final String VAR_pageTitle = "pageTitle";
	public static final String VAR_pageSearch_enUS = "pageSearch_enUS";
	public static final String VAR_pageSearch_frFR = "pageSearch_frFR";
	public static final String VAR_siteUser_ = "siteUser_";
	public static final String VAR_userId = "userId";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_inheritPk = "inheritPk";
	public static final String VAR_created = "created";
	public static final String VAR_modified = "modified";
	public static final String VAR_archived = "archived";
	public static final String VAR_deleted = "deleted";
	public static final String VAR_classCanonicalName = "classCanonicalName";
	public static final String VAR_classSimpleName = "classSimpleName";
	public static final String VAR_classCanonicalNames = "classCanonicalNames";
	public static final String VAR_sessionId = "sessionId";
	public static final String VAR_userKey = "userKey";
	public static final String VAR_saves = "saves";
	public static final String VAR_objectTitle = "objectTitle";
	public static final String VAR_objectId = "objectId";
	public static final String VAR_objectNameVar = "objectNameVar";
	public static final String VAR_objectSuggest = "objectSuggest";
	public static final String VAR_objectText = "objectText";
	public static final String VAR_pageUrlId = "pageUrlId";
	public static final String VAR_pageUrlPk = "pageUrlPk";
	public static final String VAR_pageUrlApi = "pageUrlApi";
	public static final String VAR_id = "id";

	public static List<String> varsQForClass() {
		return Article.varsQArticle(new ArrayList<String>());
	}
	public static List<String> varsQArticle(List<String> vars) {
		vars.add(VAR_objectSuggest);
		vars.add(VAR_objectText);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return Article.varsFqArticle(new ArrayList<String>());
	}
	public static List<String> varsFqArticle(List<String> vars) {
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return Article.varsRangeArticle(new ArrayList<String>());
	}
	public static List<String> varsRangeArticle(List<String> vars) {
		return vars;
	}

	public static final String DISPLAY_NAME_promiseBefore = "";
	public static final String DISPLAY_NAME_staticBaseUrl = "";
	public static final String DISPLAY_NAME_domainName = "";
	public static final String DISPLAY_NAME_siteName = "";
	public static final String DISPLAY_NAME_siteHostName = "";
	public static final String DISPLAY_NAME_sitePackageName = "";
	public static final String DISPLAY_NAME_computerHostName = "";
	public static final String DISPLAY_NAME_userName = "";
	public static final String DISPLAY_NAME_cheminProjet = "";
	public static final String DISPLAY_NAME_groupName = "";
	public static final String DISPLAY_NAME_isCourse = "";
	public static final String DISPLAY_NAME_isLesson = "";
	public static final String DISPLAY_NAME_isArticle = "";
	public static final String DISPLAY_NAME_courseNumber = "";
	public static final String DISPLAY_NAME_lessonNumber = "";
	public static final String DISPLAY_NAME_lessonDescription = "";
	public static final String DISPLAY_NAME_articleH1_enUS = "";
	public static final String DISPLAY_NAME_articleH1_frFR = "";
	public static final String DISPLAY_NAME_articleH2_enUS = "";
	public static final String DISPLAY_NAME_articleH2_frFR = "";
	public static final String DISPLAY_NAME_articleH1 = "";
	public static final String DISPLAY_NAME_articleH2 = "";
	public static final String DISPLAY_NAME_articleDescription = "";
	public static final String DISPLAY_NAME_pageDescription = "";
	public static final String DISPLAY_NAME_articleCreated = "";
	public static final String DISPLAY_NAME_pageUri_enUS = "";
	public static final String DISPLAY_NAME_pageUri_frFR = "";
	public static final String DISPLAY_NAME_pageUri = "";
	public static final String DISPLAY_NAME_pageImageUri_enUS = "";
	public static final String DISPLAY_NAME_pageImageUri_frFR = "";
	public static final String DISPLAY_NAME_pageImageUri = "";
	public static final String DISPLAY_NAME_pageCreated = "";
	public static final String DISPLAY_NAME_pageH1 = "";
	public static final String DISPLAY_NAME_pageH2 = "";
	public static final String DISPLAY_NAME_pageH3 = "";
	public static final String DISPLAY_NAME_pageTitle = "";
	public static final String DISPLAY_NAME_pageSearch_enUS = "";
	public static final String DISPLAY_NAME_pageSearch_frFR = "";
	public static final String DISPLAY_NAME_siteUser_ = "";
	public static final String DISPLAY_NAME_userId = "";
	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_inheritPk = "";
	public static final String DISPLAY_NAME_created = "created";
	public static final String DISPLAY_NAME_modified = "modified";
	public static final String DISPLAY_NAME_archived = "archived";
	public static final String DISPLAY_NAME_deleted = "deleted";
	public static final String DISPLAY_NAME_classCanonicalName = "";
	public static final String DISPLAY_NAME_classSimpleName = "";
	public static final String DISPLAY_NAME_classCanonicalNames = "";
	public static final String DISPLAY_NAME_sessionId = "";
	public static final String DISPLAY_NAME_userKey = "";
	public static final String DISPLAY_NAME_saves = "";
	public static final String DISPLAY_NAME_objectTitle = "";
	public static final String DISPLAY_NAME_objectId = "ID";
	public static final String DISPLAY_NAME_objectNameVar = "";
	public static final String DISPLAY_NAME_objectSuggest = "autosuggest";
	public static final String DISPLAY_NAME_objectText = "text";
	public static final String DISPLAY_NAME_pageUrlId = "";
	public static final String DISPLAY_NAME_pageUrlPk = "";
	public static final String DISPLAY_NAME_pageUrlApi = "";
	public static final String DISPLAY_NAME_id = "";

	public static String displayNameForClass(String var) {
		return Article.displayNameArticle(var);
	}
	public static String displayNameArticle(String var) {
		switch(var) {
		case VAR_promiseBefore:
			return DISPLAY_NAME_promiseBefore;
		case VAR_staticBaseUrl:
			return DISPLAY_NAME_staticBaseUrl;
		case VAR_domainName:
			return DISPLAY_NAME_domainName;
		case VAR_siteName:
			return DISPLAY_NAME_siteName;
		case VAR_siteHostName:
			return DISPLAY_NAME_siteHostName;
		case VAR_sitePackageName:
			return DISPLAY_NAME_sitePackageName;
		case VAR_computerHostName:
			return DISPLAY_NAME_computerHostName;
		case VAR_userName:
			return DISPLAY_NAME_userName;
		case VAR_cheminProjet:
			return DISPLAY_NAME_cheminProjet;
		case VAR_groupName:
			return DISPLAY_NAME_groupName;
		case VAR_isCourse:
			return DISPLAY_NAME_isCourse;
		case VAR_isLesson:
			return DISPLAY_NAME_isLesson;
		case VAR_isArticle:
			return DISPLAY_NAME_isArticle;
		case VAR_courseNumber:
			return DISPLAY_NAME_courseNumber;
		case VAR_lessonNumber:
			return DISPLAY_NAME_lessonNumber;
		case VAR_lessonDescription:
			return DISPLAY_NAME_lessonDescription;
		case VAR_articleH1_enUS:
			return DISPLAY_NAME_articleH1_enUS;
		case VAR_articleH1_frFR:
			return DISPLAY_NAME_articleH1_frFR;
		case VAR_articleH2_enUS:
			return DISPLAY_NAME_articleH2_enUS;
		case VAR_articleH2_frFR:
			return DISPLAY_NAME_articleH2_frFR;
		case VAR_articleH1:
			return DISPLAY_NAME_articleH1;
		case VAR_articleH2:
			return DISPLAY_NAME_articleH2;
		case VAR_articleDescription:
			return DISPLAY_NAME_articleDescription;
		case VAR_pageDescription:
			return DISPLAY_NAME_pageDescription;
		case VAR_articleCreated:
			return DISPLAY_NAME_articleCreated;
		case VAR_pageUri_enUS:
			return DISPLAY_NAME_pageUri_enUS;
		case VAR_pageUri_frFR:
			return DISPLAY_NAME_pageUri_frFR;
		case VAR_pageUri:
			return DISPLAY_NAME_pageUri;
		case VAR_pageImageUri_enUS:
			return DISPLAY_NAME_pageImageUri_enUS;
		case VAR_pageImageUri_frFR:
			return DISPLAY_NAME_pageImageUri_frFR;
		case VAR_pageImageUri:
			return DISPLAY_NAME_pageImageUri;
		case VAR_pageCreated:
			return DISPLAY_NAME_pageCreated;
		case VAR_pageH1:
			return DISPLAY_NAME_pageH1;
		case VAR_pageH2:
			return DISPLAY_NAME_pageH2;
		case VAR_pageH3:
			return DISPLAY_NAME_pageH3;
		case VAR_pageTitle:
			return DISPLAY_NAME_pageTitle;
		case VAR_pageSearch_enUS:
			return DISPLAY_NAME_pageSearch_enUS;
		case VAR_pageSearch_frFR:
			return DISPLAY_NAME_pageSearch_frFR;
		case VAR_siteUser_:
			return DISPLAY_NAME_siteUser_;
		case VAR_userId:
			return DISPLAY_NAME_userId;
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_inheritPk:
			return DISPLAY_NAME_inheritPk;
		case VAR_created:
			return DISPLAY_NAME_created;
		case VAR_modified:
			return DISPLAY_NAME_modified;
		case VAR_archived:
			return DISPLAY_NAME_archived;
		case VAR_deleted:
			return DISPLAY_NAME_deleted;
		case VAR_classCanonicalName:
			return DISPLAY_NAME_classCanonicalName;
		case VAR_classSimpleName:
			return DISPLAY_NAME_classSimpleName;
		case VAR_classCanonicalNames:
			return DISPLAY_NAME_classCanonicalNames;
		case VAR_sessionId:
			return DISPLAY_NAME_sessionId;
		case VAR_userKey:
			return DISPLAY_NAME_userKey;
		case VAR_saves:
			return DISPLAY_NAME_saves;
		case VAR_objectTitle:
			return DISPLAY_NAME_objectTitle;
		case VAR_objectId:
			return DISPLAY_NAME_objectId;
		case VAR_objectNameVar:
			return DISPLAY_NAME_objectNameVar;
		case VAR_objectSuggest:
			return DISPLAY_NAME_objectSuggest;
		case VAR_objectText:
			return DISPLAY_NAME_objectText;
		case VAR_pageUrlId:
			return DISPLAY_NAME_pageUrlId;
		case VAR_pageUrlPk:
			return DISPLAY_NAME_pageUrlPk;
		case VAR_pageUrlApi:
			return DISPLAY_NAME_pageUrlApi;
		case VAR_id:
			return DISPLAY_NAME_id;
		default:
			return null;
		}
	}

	public static String descriptionArticle(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return "The current request object";
		case VAR_inheritPk:
			return "An optional inherited primary key from a legacy system for this object in the database";
		case VAR_created:
			return "A created timestamp for this record in the database";
		case VAR_modified:
			return "A modified timestamp for this record in the database";
		case VAR_archived:
			return "For archiving this record";
		case VAR_deleted:
			return "For deleting this record";
		case VAR_classCanonicalName:
			return "the canonical name of this Java class";
		case VAR_classSimpleName:
			return "The simple name of this Java class";
		case VAR_classCanonicalNames:
			return "All the inherited canonical names of this Java class";
		case VAR_sessionId:
			return "The session ID of the user that created this object";
		case VAR_userKey:
			return "The primary key of the user that created this record";
		case VAR_saves:
			return "A list of fields that are saved for this record in the database";
		case VAR_objectTitle:
			return "The title of this object";
		case VAR_objectId:
			return "A URL friendly unique ID for this object";
		case VAR_objectNameVar:
			return "The var that identifies this type of object in the API";
		case VAR_objectSuggest:
			return "The indexed field in the search engine for this record while using autosuggest";
		case VAR_objectText:
			return "The full text search field in the search engine for this record while using autosuggest";
		case VAR_pageUrlId:
			return "The link by name for this object in the UI";
		case VAR_pageUrlPk:
			return "The link by primary key for this object in the UI";
		case VAR_pageUrlApi:
			return "The link to this object in the API";
		case VAR_id:
			return "The unique key for this record in the search engine";
			default:
				return null;
		}
	}

	public static String classSimpleNameArticle(String var) {
		switch(var) {
		case VAR_promiseBefore:
			return "Void";
		case VAR_staticBaseUrl:
			return "String";
		case VAR_domainName:
			return "String";
		case VAR_siteName:
			return "String";
		case VAR_siteHostName:
			return "String";
		case VAR_sitePackageName:
			return "String";
		case VAR_computerHostName:
			return "String";
		case VAR_userName:
			return "String";
		case VAR_cheminProjet:
			return "String";
		case VAR_groupName:
			return "String";
		case VAR_isCourse:
			return "Boolean";
		case VAR_isLesson:
			return "Boolean";
		case VAR_isArticle:
			return "Boolean";
		case VAR_courseNumber:
			return "Integer";
		case VAR_lessonNumber:
			return "Integer";
		case VAR_lessonDescription:
			return "String";
		case VAR_articleH1_enUS:
			return "String";
		case VAR_articleH1_frFR:
			return "String";
		case VAR_articleH2_enUS:
			return "String";
		case VAR_articleH2_frFR:
			return "String";
		case VAR_articleH1:
			return "String";
		case VAR_articleH2:
			return "String";
		case VAR_articleDescription:
			return "String";
		case VAR_pageDescription:
			return "String";
		case VAR_articleCreated:
			return "ZonedDateTime";
		case VAR_pageUri_enUS:
			return "String";
		case VAR_pageUri_frFR:
			return "String";
		case VAR_pageUri:
			return "String";
		case VAR_pageImageUri_enUS:
			return "String";
		case VAR_pageImageUri_frFR:
			return "String";
		case VAR_pageImageUri:
			return "String";
		case VAR_pageCreated:
			return "ZonedDateTime";
		case VAR_pageH1:
			return "String";
		case VAR_pageH2:
			return "String";
		case VAR_pageH3:
			return "String";
		case VAR_pageTitle:
			return "String";
		case VAR_pageSearch_enUS:
			return "List";
		case VAR_pageSearch_frFR:
			return "List";
		case VAR_siteUser_:
			return "SiteUser";
		case VAR_userId:
			return "String";
		case VAR_siteRequest_:
			return "SiteRequestEnUS";
		case VAR_inheritPk:
			return "String";
		case VAR_created:
			return "ZonedDateTime";
		case VAR_modified:
			return "ZonedDateTime";
		case VAR_archived:
			return "Boolean";
		case VAR_deleted:
			return "Boolean";
		case VAR_classCanonicalName:
			return "String";
		case VAR_classSimpleName:
			return "String";
		case VAR_classCanonicalNames:
			return "List";
		case VAR_sessionId:
			return "String";
		case VAR_userKey:
			return "Long";
		case VAR_saves:
			return "List";
		case VAR_objectTitle:
			return "String";
		case VAR_objectId:
			return "String";
		case VAR_objectNameVar:
			return "String";
		case VAR_objectSuggest:
			return "String";
		case VAR_objectText:
			return "String";
		case VAR_pageUrlId:
			return "String";
		case VAR_pageUrlPk:
			return "String";
		case VAR_pageUrlApi:
			return "String";
		case VAR_id:
			return "String";
			default:
				return null;
		}
	}

	public static Integer htmlColumnArticle(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_objectTitle:
			return 2;
			default:
				return null;
		}
	}

	public static Integer htmlRowArticle(String var) {
		switch(var) {
		case VAR_created:
			return 1;
		case VAR_modified:
			return 1;
		case VAR_archived:
			return 2;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 1;
			default:
				return null;
		}
	}

	public static Integer htmlCellArticle(String var) {
		switch(var) {
		case VAR_created:
			return 2;
		case VAR_modified:
			return 3;
		case VAR_archived:
			return 1;
		case VAR_deleted:
			return 2;
		case VAR_objectId:
			return 4;
			default:
				return null;
		}
	}

	public static Integer lengthMinArticle(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer lengthMaxArticle(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer maxArticle(String var) {
		switch(var) {
			default:
				return null;
		}
	}

	public static Integer minArticle(String var) {
		switch(var) {
			default:
				return null;
		}
	}
}
