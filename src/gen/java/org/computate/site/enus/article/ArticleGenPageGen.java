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
import org.computate.site.enus.page.PageLayout;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.article.Article;
import io.vertx.core.json.JsonArray;
import java.lang.Integer;
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**	
<ol>
<li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these ArticleGenPage objects in a RESTful API. 
</li>
<li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class ArticleGenPageGen into the class ArticleGenPage. 
</li>
0<h3>Suggestions that can generate more code for you: </h3></ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these ArticleGenPage objects in a RESTful API. 
 * </li>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class ArticleGenPageGen into the class ArticleGenPage. 
 * </li>
 * 0<h3>Suggestions that can generate more code for you: </h3>
 * <h3>About the ArticleGenPage class and it's generated class ArticleGenPageGen&lt;PageLayout&gt;: </h3>extends ArticleGenPageGen
 * <p>
 * This Java class extends a generated Java class ArticleGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage">Find the class ArticleGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends ArticleGenPageGen<PageLayout>
 * <p>This <code>class ArticleGenPage extends ArticleGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated ArticleGenPageGen. 
 * The generated <code>class ArticleGenPageGen extends PageLayout</code> which means that ArticleGenPage extends ArticleGenPageGen which extends PageLayout. 
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
 * <p>By adding a class comment "{@inheritDoc}", the ArticleGenPage class will inherit the helpful inherited class comments from the super class ArticleGenPageGen. 
 * </p>
 * Rows: null
 * Model: true
 * Page: true
 * SuperPage.enUS: null
 * Promise: true
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the ArticleGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class ArticleGenPage in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package org.computate.site.enus.article in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.article&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project computateorg in Solr: 
 * curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computateorg&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 **/
public abstract class ArticleGenPageGen<DEV> extends PageLayout {
	protected static final Logger LOG = LoggerFactory.getLogger(ArticleGenPage.class);

	////////////////////////
	// searchListArticle_ //
	////////////////////////


	/**	 The entity searchListArticle_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Article> searchListArticle_;

	/**	<br> The entity searchListArticle_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:searchListArticle_">Find the entity searchListArticle_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListArticle_(Wrap<SearchList<Article>> w);

	public SearchList<Article> getSearchListArticle_() {
		return searchListArticle_;
	}

	public void setSearchListArticle_(SearchList<Article> searchListArticle_) {
		this.searchListArticle_ = searchListArticle_;
	}
	public static SearchList<Article> staticSetSearchListArticle_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ArticleGenPage searchListArticle_Init() {
		Wrap<SearchList<Article>> searchListArticle_Wrap = new Wrap<SearchList<Article>>().var("searchListArticle_");
		if(searchListArticle_ == null) {
			_searchListArticle_(searchListArticle_Wrap);
			setSearchListArticle_(searchListArticle_Wrap.o);
		}
		return (ArticleGenPage)this;
	}


























	/////////////////
	// listArticle //
	/////////////////


	/**	 The entity listArticle
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listArticle = new JsonArray();

	/**	<br> The entity listArticle
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:listArticle">Find the entity listArticle in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listArticle(JsonArray l);

	public JsonArray getListArticle() {
		return listArticle;
	}

	public void setListArticle(JsonArray listArticle) {
		this.listArticle = listArticle;
	}
	public static JsonArray staticSetListArticle(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ArticleGenPage listArticleInit() {
		_listArticle(listArticle);
		return (ArticleGenPage)this;
	}

	//////////////////
	// articleCount //
	//////////////////


	/**	 The entity articleCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer articleCount;

	/**	<br> The entity articleCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:articleCount">Find the entity articleCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _articleCount(Wrap<Integer> w);

	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}
	@JsonIgnore
	public void setArticleCount(String o) {
		this.articleCount = ArticleGenPage.staticSetArticleCount(siteRequest_, o);
	}
	public static Integer staticSetArticleCount(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ArticleGenPage articleCountInit() {
		Wrap<Integer> articleCountWrap = new Wrap<Integer>().var("articleCount");
		if(articleCount == null) {
			_articleCount(articleCountWrap);
			setArticleCount(articleCountWrap.o);
		}
		return (ArticleGenPage)this;
	}

	public static Integer staticSearchArticleCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrArticleCount(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqArticleCount(SiteRequestEnUS siteRequest_, String o) {
		return ArticleGenPage.staticSearchStrArticleCount(siteRequest_, ArticleGenPage.staticSearchArticleCount(siteRequest_, ArticleGenPage.staticSetArticleCount(siteRequest_, o)));
	}

	//////////////
	// article_ //
	//////////////


	/**	 The entity article_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Article article_;

	/**	<br> The entity article_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:article_">Find the entity article_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _article_(Wrap<Article> w);

	public Article getArticle_() {
		return article_;
	}

	public void setArticle_(Article article_) {
		this.article_ = article_;
	}
	public static Article staticSetArticle_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ArticleGenPage article_Init() {
		Wrap<Article> article_Wrap = new Wrap<Article>().var("article_");
		if(article_ == null) {
			_article_(article_Wrap);
			setArticle_(article_Wrap.o);
		}
		return (ArticleGenPage)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = ArticleGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ArticleGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			setId(idWrap.o);
		}
		return (ArticleGenPage)this;
	}

	public static String staticSearchId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequestEnUS siteRequest_, String o) {
		return ArticleGenPage.staticSearchStrId(siteRequest_, ArticleGenPage.staticSearchId(siteRequest_, ArticleGenPage.staticSetId(siteRequest_, o)));
	}











	////////////////////
	// pageUriArticle //
	////////////////////


	/**	 The entity pageUriArticle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriArticle;

	/**	<br> The entity pageUriArticle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.article.ArticleGenPage&fq=entiteVar_enUS_indexed_string:pageUriArticle">Find the entity pageUriArticle in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriArticle(Wrap<String> c);

	public String getPageUriArticle() {
		return pageUriArticle;
	}
	public void setPageUriArticle(String o) {
		this.pageUriArticle = ArticleGenPage.staticSetPageUriArticle(siteRequest_, o);
	}
	public static String staticSetPageUriArticle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ArticleGenPage pageUriArticleInit() {
		Wrap<String> pageUriArticleWrap = new Wrap<String>().var("pageUriArticle");
		if(pageUriArticle == null) {
			_pageUriArticle(pageUriArticleWrap);
			setPageUriArticle(pageUriArticleWrap.o);
		}
		return (ArticleGenPage)this;
	}

	public static String staticSearchPageUriArticle(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriArticle(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriArticle(SiteRequestEnUS siteRequest_, String o) {
		return ArticleGenPage.staticSearchStrPageUriArticle(siteRequest_, ArticleGenPage.staticSearchPageUriArticle(siteRequest_, ArticleGenPage.staticSetPageUriArticle(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepArticleGenPage(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepArticleGenPage();
	}

	public Future<Void> promiseDeepArticleGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseArticleGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseArticleGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListArticle_Init();
				listArticleInit();
				articleCountInit();
				article_Init();
				idInit();
				pageUriArticleInit();
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
		return promiseDeepArticleGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestArticleGenPage(SiteRequestEnUS siteRequest_) {
			super.siteRequestPageLayout(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestArticleGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainArticleGenPage(v);
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
	public Object obtainArticleGenPage(String var) {
		ArticleGenPage oArticleGenPage = (ArticleGenPage)this;
		switch(var) {
			case "searchListArticle_":
				return oArticleGenPage.searchListArticle_;
			case "listArticle":
				return oArticleGenPage.listArticle;
			case "articleCount":
				return oArticleGenPage.articleCount;
			case "article_":
				return oArticleGenPage.article_;
			case "id":
				return oArticleGenPage.id;
			case "pageUriArticle":
				return oArticleGenPage.pageUriArticle;
			default:
				return super.obtainPageLayout(var);
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
				o = relateArticleGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateArticleGenPage(String var, Object val) {
		ArticleGenPage oArticleGenPage = (ArticleGenPage)this;
		switch(var) {
			default:
				return super.relatePageLayout(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetArticleGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetArticleGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "articleCount":
			return ArticleGenPage.staticSetArticleCount(siteRequest_, o);
		case "id":
			return ArticleGenPage.staticSetId(siteRequest_, o);
		case "pageUriArticle":
			return ArticleGenPage.staticSetPageUriArticle(siteRequest_, o);
			default:
				return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchArticleGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchArticleGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "articleCount":
			return ArticleGenPage.staticSearchArticleCount(siteRequest_, (Integer)o);
		case "id":
			return ArticleGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriArticle":
			return ArticleGenPage.staticSearchPageUriArticle(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrArticleGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrArticleGenPage(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "articleCount":
			return ArticleGenPage.staticSearchStrArticleCount(siteRequest_, (Integer)o);
		case "id":
			return ArticleGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriArticle":
			return ArticleGenPage.staticSearchStrPageUriArticle(siteRequest_, (String)o);
			default:
				return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqArticleGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqArticleGenPage(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "articleCount":
			return ArticleGenPage.staticSearchFqArticleCount(siteRequest_, o);
		case "id":
			return ArticleGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriArticle":
			return ArticleGenPage.staticSearchFqPageUriArticle(siteRequest_, o);
			default:
				return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "ArticleGenPage";
	public static final String VAR_searchListArticle_ = "searchListArticle_";
	public static final String VAR_listArticle = "listArticle";
	public static final String VAR_articleCount = "articleCount";
	public static final String VAR_article_ = "article_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriArticle = "pageUriArticle";

	public static final String DISPLAY_NAME_searchListArticle_ = "";
	public static final String DISPLAY_NAME_listArticle = "";
	public static final String DISPLAY_NAME_articleCount = "";
	public static final String DISPLAY_NAME_article_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriArticle = "";

	public static String displayNameForClass(String var) {
		return ArticleGenPage.displayNameArticleGenPage(var);
	}
	public static String displayNameArticleGenPage(String var) {
		switch(var) {
		case VAR_searchListArticle_:
			return DISPLAY_NAME_searchListArticle_;
		case VAR_listArticle:
			return DISPLAY_NAME_listArticle;
		case VAR_articleCount:
			return DISPLAY_NAME_articleCount;
		case VAR_article_:
			return DISPLAY_NAME_article_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriArticle:
			return DISPLAY_NAME_pageUriArticle;
		default:
			return PageLayout.displayNamePageLayout(var);
		}
	}
}
