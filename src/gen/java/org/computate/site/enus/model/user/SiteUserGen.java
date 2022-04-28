package org.computate.site.enus.model.user;

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
import java.lang.Long;
import java.lang.String;
import io.vertx.core.json.JsonArray;
import java.lang.Boolean;
import java.lang.Integer;
import org.computate.vertx.search.list.SearchList;
import org.computate.site.enus.article.Article;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser">Find the class SiteUser in Solr. </a>
 * <br><br>Delete the class SiteUser in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.site.enus.model.user in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.site.enus.model.user&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate.org in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate.org&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>
 **/
public abstract class SiteUserGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteUser.class);

	public static final String PUTImport_frFR_Uri = "null-import";
	public static final String PUTImport_frFR_ImageUri = "/pngnull-import-999.png";

	public static final String SiteUser_AName_enUS = "a site user";
	public static final String SiteUser_This_enUS = "this ";
	public static final String SiteUser_ThisName_enUS = "this site user";
	public static final String SiteUser_A_enUS = "a ";
	public static final String SiteUser_TheName_enUS = "the site user";
	public static final String SiteUser_NameSingular_enUS = "site user";
	public static final String SiteUser_NamePlural_enUS = "site users";
	public static final String SiteUser_NameActual_enUS = "current site user";
	public static final String SiteUser_AllName_enUS = "all the site users";
	public static final String SiteUser_SearchAllNameBy_enUS = "search site users by ";
	public static final String SiteUser_Title_enUS = "site users";
	public static final String SiteUser_ThePluralName_enUS = "the site users";
	public static final String SiteUser_NoNameFound_enUS = "no site user found";
	public static final String SiteUser_NameVar_enUS = "user";
	public static final String SiteUser_OfName_enUS = "of site user";
	public static final String SiteUser_ANameAdjective_enUS = "a site user";
	public static final String SiteUser_NameAdjectiveSingular_enUS = "site user";
	public static final String SiteUser_NameAdjectivePlural_enUS = "site users";
	public static final String Search_enUS_Uri = "/api/user";
	public static final String Search_enUS_ImageUri = "/png/api/user-999.png";
	public static final String PATCH_enUS_Uri = "/api/user";
	public static final String PATCH_enUS_ImageUri = "/png/api/user-999.png";
	public static final String POST_enUS_Uri = "/api/user";
	public static final String POST_enUS_ImageUri = "/png/api/user-999.png";
	public static final String PUTImport_enUS_Uri = "/api/user-import";
	public static final String PUTImport_enUS_ImageUri = "/png/api/user-import-999.png";
	public static final String SearchPage_enUS_Uri = "/user";
	public static final String SearchPage_enUS_ImageUri = "/png/user-999.png";

	public static final String SiteUser_Color = "gray";
	public static final String SiteUser_IconGroup = "regular";
	public static final String SiteUser_IconName = "user-cog";

	//////////////
	// userKeys //
	//////////////

	/**	 The entity userKeys
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> userKeys = new ArrayList<Long>();

	/**	<br> The entity userKeys
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userKeys">Find the entity userKeys in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _userKeys(List<Long> l);

	public List<Long> getUserKeys() {
		return userKeys;
	}

	public void setUserKeys(List<Long> userKeys) {
		this.userKeys = userKeys;
	}
	@JsonIgnore
	public void setUserKeys(String o) {
		Long l = SiteUser.staticSetUserKeys(siteRequest_, o);
		if(l != null)
			addUserKeys(l);
	}
	public static Long staticSetUserKeys(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public SiteUser addUserKeys(Long...objets) {
		for(Long o : objets) {
			addUserKeys(o);
		}
		return (SiteUser)this;
	}
	public SiteUser addUserKeys(Long o) {
		if(o != null)
			this.userKeys.add(o);
		return (SiteUser)this;
	}
	@JsonIgnore
	public void setUserKeys(JsonArray objets) {
		userKeys.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addUserKeys(o);
		}
	}
	public SiteUser addUserKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addUserKeys(p);
		}
		return (SiteUser)this;
	}
	protected SiteUser userKeysInit() {
		_userKeys(userKeys);
		return (SiteUser)this;
	}

	public static Long staticSearchUserKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrUserKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserKeys(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserKeys(siteRequest_, SiteUser.staticSearchUserKeys(siteRequest_, SiteUser.staticSetUserKeys(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userId">Find the entity userId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userId(Wrap<String> c);

	public String getUserId() {
		return userId;
	}
	public void setUserId(String o) {
		this.userId = SiteUser.staticSetUserId(siteRequest_, o);
	}
	public static String staticSetUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userIdInit() {
		Wrap<String> userIdWrap = new Wrap<String>().var("userId");
		if(userId == null) {
			_userId(userIdWrap);
			setUserId(userIdWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserId(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserId(siteRequest_, SiteUser.staticSearchUserId(siteRequest_, SiteUser.staticSetUserId(siteRequest_, o)));
	}

	public String sqlUserId() {
		return userId;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userName">Find the entity userName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userName(Wrap<String> c);

	public String getUserName() {
		return userName;
	}
	public void setUserName(String o) {
		this.userName = SiteUser.staticSetUserName(siteRequest_, o);
	}
	public static String staticSetUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userNameInit() {
		Wrap<String> userNameWrap = new Wrap<String>().var("userName");
		if(userName == null) {
			_userName(userNameWrap);
			setUserName(userNameWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserName(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserName(siteRequest_, SiteUser.staticSearchUserName(siteRequest_, SiteUser.staticSetUserName(siteRequest_, o)));
	}

	public String sqlUserName() {
		return userName;
	}

	///////////////
	// userEmail //
	///////////////

	/**	 The entity userEmail
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userEmail;

	/**	<br> The entity userEmail
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userEmail">Find the entity userEmail in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userEmail(Wrap<String> c);

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String o) {
		this.userEmail = SiteUser.staticSetUserEmail(siteRequest_, o);
	}
	public static String staticSetUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userEmailInit() {
		Wrap<String> userEmailWrap = new Wrap<String>().var("userEmail");
		if(userEmail == null) {
			_userEmail(userEmailWrap);
			setUserEmail(userEmailWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserEmail(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserEmail(siteRequest_, SiteUser.staticSearchUserEmail(siteRequest_, SiteUser.staticSetUserEmail(siteRequest_, o)));
	}

	public String sqlUserEmail() {
		return userEmail;
	}

	///////////////////
	// userFirstName //
	///////////////////

	/**	 The entity userFirstName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userFirstName;

	/**	<br> The entity userFirstName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userFirstName">Find the entity userFirstName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFirstName(Wrap<String> c);

	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String o) {
		this.userFirstName = SiteUser.staticSetUserFirstName(siteRequest_, o);
	}
	public static String staticSetUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userFirstNameInit() {
		Wrap<String> userFirstNameWrap = new Wrap<String>().var("userFirstName");
		if(userFirstName == null) {
			_userFirstName(userFirstNameWrap);
			setUserFirstName(userFirstNameWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserFirstName(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserFirstName(siteRequest_, SiteUser.staticSearchUserFirstName(siteRequest_, SiteUser.staticSetUserFirstName(siteRequest_, o)));
	}

	public String sqlUserFirstName() {
		return userFirstName;
	}

	//////////////////
	// userLastName //
	//////////////////

	/**	 The entity userLastName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userLastName;

	/**	<br> The entity userLastName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userLastName">Find the entity userLastName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userLastName(Wrap<String> c);

	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String o) {
		this.userLastName = SiteUser.staticSetUserLastName(siteRequest_, o);
	}
	public static String staticSetUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userLastNameInit() {
		Wrap<String> userLastNameWrap = new Wrap<String>().var("userLastName");
		if(userLastName == null) {
			_userLastName(userLastNameWrap);
			setUserLastName(userLastNameWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserLastName(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserLastName(siteRequest_, SiteUser.staticSearchUserLastName(siteRequest_, SiteUser.staticSetUserLastName(siteRequest_, o)));
	}

	public String sqlUserLastName() {
		return userLastName;
	}

	//////////////////
	// userFullName //
	//////////////////

	/**	 The entity userFullName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String userFullName;

	/**	<br> The entity userFullName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:userFullName">Find the entity userFullName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFullName(Wrap<String> c);

	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String o) {
		this.userFullName = SiteUser.staticSetUserFullName(siteRequest_, o);
	}
	public static String staticSetUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser userFullNameInit() {
		Wrap<String> userFullNameWrap = new Wrap<String>().var("userFullName");
		if(userFullName == null) {
			_userFullName(userFullNameWrap);
			setUserFullName(userFullNameWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqUserFullName(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrUserFullName(siteRequest_, SiteUser.staticSearchUserFullName(siteRequest_, SiteUser.staticSetUserFullName(siteRequest_, o)));
	}

	public String sqlUserFullName() {
		return userFullName;
	}

	/////////////////
	// seeArchived //
	/////////////////

	/**	 The entity seeArchived
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean seeArchived;

	/**	<br> The entity seeArchived
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:seeArchived">Find the entity seeArchived in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _seeArchived(Wrap<Boolean> c);

	public Boolean getSeeArchived() {
		return seeArchived;
	}

	public void setSeeArchived(Boolean seeArchived) {
		this.seeArchived = seeArchived;
	}
	@JsonIgnore
	public void setSeeArchived(String o) {
		this.seeArchived = SiteUser.staticSetSeeArchived(siteRequest_, o);
	}
	public static Boolean staticSetSeeArchived(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteUser seeArchivedInit() {
		Wrap<Boolean> seeArchivedWrap = new Wrap<Boolean>().var("seeArchived");
		if(seeArchived == null) {
			_seeArchived(seeArchivedWrap);
			setSeeArchived(seeArchivedWrap.o);
		}
		return (SiteUser)this;
	}

	public static Boolean staticSearchSeeArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrSeeArchived(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSeeArchived(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSeeArchived(siteRequest_, SiteUser.staticSearchSeeArchived(siteRequest_, SiteUser.staticSetSeeArchived(siteRequest_, o)));
	}

	public Boolean sqlSeeArchived() {
		return seeArchived;
	}

	////////////////
	// seeDeleted //
	////////////////

	/**	 The entity seeDeleted
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean seeDeleted;

	/**	<br> The entity seeDeleted
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:seeDeleted">Find the entity seeDeleted in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _seeDeleted(Wrap<Boolean> c);

	public Boolean getSeeDeleted() {
		return seeDeleted;
	}

	public void setSeeDeleted(Boolean seeDeleted) {
		this.seeDeleted = seeDeleted;
	}
	@JsonIgnore
	public void setSeeDeleted(String o) {
		this.seeDeleted = SiteUser.staticSetSeeDeleted(siteRequest_, o);
	}
	public static Boolean staticSetSeeDeleted(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteUser seeDeletedInit() {
		Wrap<Boolean> seeDeletedWrap = new Wrap<Boolean>().var("seeDeleted");
		if(seeDeleted == null) {
			_seeDeleted(seeDeletedWrap);
			setSeeDeleted(seeDeletedWrap.o);
		}
		return (SiteUser)this;
	}

	public static Boolean staticSearchSeeDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrSeeDeleted(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSeeDeleted(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSeeDeleted(siteRequest_, SiteUser.staticSearchSeeDeleted(siteRequest_, SiteUser.staticSetSeeDeleted(siteRequest_, o)));
	}

	public Boolean sqlSeeDeleted() {
		return seeDeleted;
	}

	////////////////////
	// siteDomainName //
	////////////////////

	/**	 The entity siteDomainName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String siteDomainName;

	/**	<br> The entity siteDomainName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:siteDomainName">Find the entity siteDomainName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteDomainName(Wrap<String> c);

	public String getSiteDomainName() {
		return siteDomainName;
	}
	public void setSiteDomainName(String o) {
		this.siteDomainName = SiteUser.staticSetSiteDomainName(siteRequest_, o);
	}
	public static String staticSetSiteDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser siteDomainNameInit() {
		Wrap<String> siteDomainNameWrap = new Wrap<String>().var("siteDomainName");
		if(siteDomainName == null) {
			_siteDomainName(siteDomainNameWrap);
			setSiteDomainName(siteDomainNameWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchSiteDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSiteDomainName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSiteDomainName(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSiteDomainName(siteRequest_, SiteUser.staticSearchSiteDomainName(siteRequest_, SiteUser.staticSetSiteDomainName(siteRequest_, o)));
	}

	public String sqlSiteDomainName() {
		return siteDomainName;
	}

	//////////////////////
	// zookeeperVersion //
	//////////////////////

	/**	 The entity zookeeperVersion
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String zookeeperVersion;

	/**	<br> The entity zookeeperVersion
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:zookeeperVersion">Find the entity zookeeperVersion in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _zookeeperVersion(Wrap<String> c);

	public String getZookeeperVersion() {
		return zookeeperVersion;
	}
	public void setZookeeperVersion(String o) {
		this.zookeeperVersion = SiteUser.staticSetZookeeperVersion(siteRequest_, o);
	}
	public static String staticSetZookeeperVersion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser zookeeperVersionInit() {
		Wrap<String> zookeeperVersionWrap = new Wrap<String>().var("zookeeperVersion");
		if(zookeeperVersion == null) {
			_zookeeperVersion(zookeeperVersionWrap);
			setZookeeperVersion(zookeeperVersionWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchZookeeperVersion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrZookeeperVersion(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqZookeeperVersion(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrZookeeperVersion(siteRequest_, SiteUser.staticSearchZookeeperVersion(siteRequest_, SiteUser.staticSetZookeeperVersion(siteRequest_, o)));
	}

	public String sqlZookeeperVersion() {
		return zookeeperVersion;
	}

	/////////////////////////
	// zookeeperPortClient //
	/////////////////////////

	/**	 The entity zookeeperPortClient
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer zookeeperPortClient;

	/**	<br> The entity zookeeperPortClient
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:zookeeperPortClient">Find the entity zookeeperPortClient in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _zookeeperPortClient(Wrap<Integer> c);

	public Integer getZookeeperPortClient() {
		return zookeeperPortClient;
	}

	public void setZookeeperPortClient(Integer zookeeperPortClient) {
		this.zookeeperPortClient = zookeeperPortClient;
	}
	@JsonIgnore
	public void setZookeeperPortClient(String o) {
		this.zookeeperPortClient = SiteUser.staticSetZookeeperPortClient(siteRequest_, o);
	}
	public static Integer staticSetZookeeperPortClient(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteUser zookeeperPortClientInit() {
		Wrap<Integer> zookeeperPortClientWrap = new Wrap<Integer>().var("zookeeperPortClient");
		if(zookeeperPortClient == null) {
			_zookeeperPortClient(zookeeperPortClientWrap);
			setZookeeperPortClient(zookeeperPortClientWrap.o);
		}
		return (SiteUser)this;
	}

	public static Integer staticSearchZookeeperPortClient(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrZookeeperPortClient(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqZookeeperPortClient(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrZookeeperPortClient(siteRequest_, SiteUser.staticSearchZookeeperPortClient(siteRequest_, SiteUser.staticSetZookeeperPortClient(siteRequest_, o)));
	}

	public Integer sqlZookeeperPortClient() {
		return zookeeperPortClient;
	}

	/////////////////
	// solrVersion //
	/////////////////

	/**	 The entity solrVersion
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String solrVersion;

	/**	<br> The entity solrVersion
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:solrVersion">Find the entity solrVersion in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrVersion(Wrap<String> c);

	public String getSolrVersion() {
		return solrVersion;
	}
	public void setSolrVersion(String o) {
		this.solrVersion = SiteUser.staticSetSolrVersion(siteRequest_, o);
	}
	public static String staticSetSolrVersion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser solrVersionInit() {
		Wrap<String> solrVersionWrap = new Wrap<String>().var("solrVersion");
		if(solrVersion == null) {
			_solrVersion(solrVersionWrap);
			setSolrVersion(solrVersionWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchSolrVersion(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSolrVersion(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSolrVersion(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSolrVersion(siteRequest_, SiteUser.staticSearchSolrVersion(siteRequest_, SiteUser.staticSetSolrVersion(siteRequest_, o)));
	}

	public String sqlSolrVersion() {
		return solrVersion;
	}

	////////////////////
	// solrPortClient //
	////////////////////

	/**	 The entity solrPortClient
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer solrPortClient;

	/**	<br> The entity solrPortClient
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:solrPortClient">Find the entity solrPortClient in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrPortClient(Wrap<Integer> c);

	public Integer getSolrPortClient() {
		return solrPortClient;
	}

	public void setSolrPortClient(Integer solrPortClient) {
		this.solrPortClient = solrPortClient;
	}
	@JsonIgnore
	public void setSolrPortClient(String o) {
		this.solrPortClient = SiteUser.staticSetSolrPortClient(siteRequest_, o);
	}
	public static Integer staticSetSolrPortClient(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteUser solrPortClientInit() {
		Wrap<Integer> solrPortClientWrap = new Wrap<Integer>().var("solrPortClient");
		if(solrPortClient == null) {
			_solrPortClient(solrPortClientWrap);
			setSolrPortClient(solrPortClientWrap.o);
		}
		return (SiteUser)this;
	}

	public static Integer staticSearchSolrPortClient(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrSolrPortClient(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSolrPortClient(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSolrPortClient(siteRequest_, SiteUser.staticSearchSolrPortClient(siteRequest_, SiteUser.staticSetSolrPortClient(siteRequest_, o)));
	}

	public Integer sqlSolrPortClient() {
		return solrPortClient;
	}

	///////////////////
	// solrConfigset //
	///////////////////

	/**	 The entity solrConfigset
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String solrConfigset;

	/**	<br> The entity solrConfigset
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:solrConfigset">Find the entity solrConfigset in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrConfigset(Wrap<String> c);

	public String getSolrConfigset() {
		return solrConfigset;
	}
	public void setSolrConfigset(String o) {
		this.solrConfigset = SiteUser.staticSetSolrConfigset(siteRequest_, o);
	}
	public static String staticSetSolrConfigset(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser solrConfigsetInit() {
		Wrap<String> solrConfigsetWrap = new Wrap<String>().var("solrConfigset");
		if(solrConfigset == null) {
			_solrConfigset(solrConfigsetWrap);
			setSolrConfigset(solrConfigsetWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchSolrConfigset(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSolrConfigset(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSolrConfigset(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSolrConfigset(siteRequest_, SiteUser.staticSearchSolrConfigset(siteRequest_, SiteUser.staticSetSolrConfigset(siteRequest_, o)));
	}

	public String sqlSolrConfigset() {
		return solrConfigset;
	}

	////////////////////
	// solrCollection //
	////////////////////

	/**	 The entity solrCollection
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String solrCollection;

	/**	<br> The entity solrCollection
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:solrCollection">Find the entity solrCollection in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrCollection(Wrap<String> c);

	public String getSolrCollection() {
		return solrCollection;
	}
	public void setSolrCollection(String o) {
		this.solrCollection = SiteUser.staticSetSolrCollection(siteRequest_, o);
	}
	public static String staticSetSolrCollection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser solrCollectionInit() {
		Wrap<String> solrCollectionWrap = new Wrap<String>().var("solrCollection");
		if(solrCollection == null) {
			_solrCollection(solrCollectionWrap);
			setSolrCollection(solrCollectionWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchSolrCollection(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSolrCollection(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSolrCollection(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrSolrCollection(siteRequest_, SiteUser.staticSearchSolrCollection(siteRequest_, SiteUser.staticSetSolrCollection(siteRequest_, o)));
	}

	public String sqlSolrCollection() {
		return solrCollection;
	}

	/////////////////////
	// statiqueUrlBase //
	/////////////////////

	/**	 The entity statiqueUrlBase
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String statiqueUrlBase;

	/**	<br> The entity statiqueUrlBase
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:statiqueUrlBase">Find the entity statiqueUrlBase in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _statiqueUrlBase(Wrap<String> c);

	public String getStatiqueUrlBase() {
		return statiqueUrlBase;
	}
	public void setStatiqueUrlBase(String o) {
		this.statiqueUrlBase = SiteUser.staticSetStatiqueUrlBase(siteRequest_, o);
	}
	public static String staticSetStatiqueUrlBase(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteUser statiqueUrlBaseInit() {
		Wrap<String> statiqueUrlBaseWrap = new Wrap<String>().var("statiqueUrlBase");
		if(statiqueUrlBase == null) {
			_statiqueUrlBase(statiqueUrlBaseWrap);
			setStatiqueUrlBase(statiqueUrlBaseWrap.o);
		}
		return (SiteUser)this;
	}

	public static String staticSearchStatiqueUrlBase(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStatiqueUrlBase(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStatiqueUrlBase(SiteRequestEnUS siteRequest_, String o) {
		return SiteUser.staticSearchStrStatiqueUrlBase(siteRequest_, SiteUser.staticSearchStatiqueUrlBase(siteRequest_, SiteUser.staticSetStatiqueUrlBase(siteRequest_, o)));
	}

	///////////////////
	// searchArticle //
	///////////////////

	/**	 The entity searchArticle
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Article> searchArticle;

	/**	<br> The entity searchArticle
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enus.model.user.SiteUser&fq=entiteVar_enUS_indexed_string:searchArticle">Find the entity searchArticle in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchArticle(Promise<SearchList<Article>> promise);

	public SearchList<Article> getSearchArticle() {
		return searchArticle;
	}

	public void setSearchArticle(SearchList<Article> searchArticle) {
		this.searchArticle = searchArticle;
	}
	public static SearchList<Article> staticSetSearchArticle(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<Article>> searchArticlePromise() {
		Promise<SearchList<Article>> promise = Promise.promise();
		Promise<SearchList<Article>> promise2 = Promise.promise();
		_searchArticle(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && searchArticle == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setSearchArticle(o);
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete(o);
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteUser(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteUser();
	}

	public Future<Void> promiseDeepSiteUser() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteUser(promise2);
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

	public Future<Void> promiseSiteUser(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				userKeysInit();
				userIdInit();
				userNameInit();
				userEmailInit();
				userFirstNameInit();
				userLastNameInit();
				userFullNameInit();
				seeArchivedInit();
				seeDeletedInit();
				siteDomainNameInit();
				zookeeperVersionInit();
				zookeeperPortClientInit();
				solrVersionInit();
				solrPortClientInit();
				solrConfigsetInit();
				solrCollectionInit();
				statiqueUrlBaseInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			searchArticlePromise().onSuccess(searchArticle -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
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
		return promiseDeepSiteUser(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteUser(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
		if(searchArticle != null)
			searchArticle.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteUser(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteUser(v);
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
	public Object obtainSiteUser(String var) {
		SiteUser oSiteUser = (SiteUser)this;
		switch(var) {
			case "userKeys":
				return oSiteUser.userKeys;
			case "userId":
				return oSiteUser.userId;
			case "userName":
				return oSiteUser.userName;
			case "userEmail":
				return oSiteUser.userEmail;
			case "userFirstName":
				return oSiteUser.userFirstName;
			case "userLastName":
				return oSiteUser.userLastName;
			case "userFullName":
				return oSiteUser.userFullName;
			case "seeArchived":
				return oSiteUser.seeArchived;
			case "seeDeleted":
				return oSiteUser.seeDeleted;
			case "siteDomainName":
				return oSiteUser.siteDomainName;
			case "zookeeperVersion":
				return oSiteUser.zookeeperVersion;
			case "zookeeperPortClient":
				return oSiteUser.zookeeperPortClient;
			case "solrVersion":
				return oSiteUser.solrVersion;
			case "solrPortClient":
				return oSiteUser.solrPortClient;
			case "solrConfigset":
				return oSiteUser.solrConfigset;
			case "solrCollection":
				return oSiteUser.solrCollection;
			case "statiqueUrlBase":
				return oSiteUser.statiqueUrlBase;
			case "searchArticle":
				return oSiteUser.searchArticle;
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
				o = relateSiteUser(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteUser(String var, Object val) {
		SiteUser oSiteUser = (SiteUser)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteUser(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteUser(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "userKeys":
			return SiteUser.staticSetUserKeys(siteRequest_, o);
		case "userId":
			return SiteUser.staticSetUserId(siteRequest_, o);
		case "userName":
			return SiteUser.staticSetUserName(siteRequest_, o);
		case "userEmail":
			return SiteUser.staticSetUserEmail(siteRequest_, o);
		case "userFirstName":
			return SiteUser.staticSetUserFirstName(siteRequest_, o);
		case "userLastName":
			return SiteUser.staticSetUserLastName(siteRequest_, o);
		case "userFullName":
			return SiteUser.staticSetUserFullName(siteRequest_, o);
		case "seeArchived":
			return SiteUser.staticSetSeeArchived(siteRequest_, o);
		case "seeDeleted":
			return SiteUser.staticSetSeeDeleted(siteRequest_, o);
		case "siteDomainName":
			return SiteUser.staticSetSiteDomainName(siteRequest_, o);
		case "zookeeperVersion":
			return SiteUser.staticSetZookeeperVersion(siteRequest_, o);
		case "zookeeperPortClient":
			return SiteUser.staticSetZookeeperPortClient(siteRequest_, o);
		case "solrVersion":
			return SiteUser.staticSetSolrVersion(siteRequest_, o);
		case "solrPortClient":
			return SiteUser.staticSetSolrPortClient(siteRequest_, o);
		case "solrConfigset":
			return SiteUser.staticSetSolrConfigset(siteRequest_, o);
		case "solrCollection":
			return SiteUser.staticSetSolrCollection(siteRequest_, o);
		case "statiqueUrlBase":
			return SiteUser.staticSetStatiqueUrlBase(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteUser(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteUser(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "userKeys":
			return SiteUser.staticSearchUserKeys(siteRequest_, (Long)o);
		case "userId":
			return SiteUser.staticSearchUserId(siteRequest_, (String)o);
		case "userName":
			return SiteUser.staticSearchUserName(siteRequest_, (String)o);
		case "userEmail":
			return SiteUser.staticSearchUserEmail(siteRequest_, (String)o);
		case "userFirstName":
			return SiteUser.staticSearchUserFirstName(siteRequest_, (String)o);
		case "userLastName":
			return SiteUser.staticSearchUserLastName(siteRequest_, (String)o);
		case "userFullName":
			return SiteUser.staticSearchUserFullName(siteRequest_, (String)o);
		case "seeArchived":
			return SiteUser.staticSearchSeeArchived(siteRequest_, (Boolean)o);
		case "seeDeleted":
			return SiteUser.staticSearchSeeDeleted(siteRequest_, (Boolean)o);
		case "siteDomainName":
			return SiteUser.staticSearchSiteDomainName(siteRequest_, (String)o);
		case "zookeeperVersion":
			return SiteUser.staticSearchZookeeperVersion(siteRequest_, (String)o);
		case "zookeeperPortClient":
			return SiteUser.staticSearchZookeeperPortClient(siteRequest_, (Integer)o);
		case "solrVersion":
			return SiteUser.staticSearchSolrVersion(siteRequest_, (String)o);
		case "solrPortClient":
			return SiteUser.staticSearchSolrPortClient(siteRequest_, (Integer)o);
		case "solrConfigset":
			return SiteUser.staticSearchSolrConfigset(siteRequest_, (String)o);
		case "solrCollection":
			return SiteUser.staticSearchSolrCollection(siteRequest_, (String)o);
		case "statiqueUrlBase":
			return SiteUser.staticSearchStatiqueUrlBase(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteUser(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteUser(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "userKeys":
			return SiteUser.staticSearchStrUserKeys(siteRequest_, (Long)o);
		case "userId":
			return SiteUser.staticSearchStrUserId(siteRequest_, (String)o);
		case "userName":
			return SiteUser.staticSearchStrUserName(siteRequest_, (String)o);
		case "userEmail":
			return SiteUser.staticSearchStrUserEmail(siteRequest_, (String)o);
		case "userFirstName":
			return SiteUser.staticSearchStrUserFirstName(siteRequest_, (String)o);
		case "userLastName":
			return SiteUser.staticSearchStrUserLastName(siteRequest_, (String)o);
		case "userFullName":
			return SiteUser.staticSearchStrUserFullName(siteRequest_, (String)o);
		case "seeArchived":
			return SiteUser.staticSearchStrSeeArchived(siteRequest_, (Boolean)o);
		case "seeDeleted":
			return SiteUser.staticSearchStrSeeDeleted(siteRequest_, (Boolean)o);
		case "siteDomainName":
			return SiteUser.staticSearchStrSiteDomainName(siteRequest_, (String)o);
		case "zookeeperVersion":
			return SiteUser.staticSearchStrZookeeperVersion(siteRequest_, (String)o);
		case "zookeeperPortClient":
			return SiteUser.staticSearchStrZookeeperPortClient(siteRequest_, (Integer)o);
		case "solrVersion":
			return SiteUser.staticSearchStrSolrVersion(siteRequest_, (String)o);
		case "solrPortClient":
			return SiteUser.staticSearchStrSolrPortClient(siteRequest_, (Integer)o);
		case "solrConfigset":
			return SiteUser.staticSearchStrSolrConfigset(siteRequest_, (String)o);
		case "solrCollection":
			return SiteUser.staticSearchStrSolrCollection(siteRequest_, (String)o);
		case "statiqueUrlBase":
			return SiteUser.staticSearchStrStatiqueUrlBase(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteUser(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteUser(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "userKeys":
			return SiteUser.staticSearchFqUserKeys(siteRequest_, o);
		case "userId":
			return SiteUser.staticSearchFqUserId(siteRequest_, o);
		case "userName":
			return SiteUser.staticSearchFqUserName(siteRequest_, o);
		case "userEmail":
			return SiteUser.staticSearchFqUserEmail(siteRequest_, o);
		case "userFirstName":
			return SiteUser.staticSearchFqUserFirstName(siteRequest_, o);
		case "userLastName":
			return SiteUser.staticSearchFqUserLastName(siteRequest_, o);
		case "userFullName":
			return SiteUser.staticSearchFqUserFullName(siteRequest_, o);
		case "seeArchived":
			return SiteUser.staticSearchFqSeeArchived(siteRequest_, o);
		case "seeDeleted":
			return SiteUser.staticSearchFqSeeDeleted(siteRequest_, o);
		case "siteDomainName":
			return SiteUser.staticSearchFqSiteDomainName(siteRequest_, o);
		case "zookeeperVersion":
			return SiteUser.staticSearchFqZookeeperVersion(siteRequest_, o);
		case "zookeeperPortClient":
			return SiteUser.staticSearchFqZookeeperPortClient(siteRequest_, o);
		case "solrVersion":
			return SiteUser.staticSearchFqSolrVersion(siteRequest_, o);
		case "solrPortClient":
			return SiteUser.staticSearchFqSolrPortClient(siteRequest_, o);
		case "solrConfigset":
			return SiteUser.staticSearchFqSolrConfigset(siteRequest_, o);
		case "solrCollection":
			return SiteUser.staticSearchFqSolrCollection(siteRequest_, o);
		case "statiqueUrlBase":
			return SiteUser.staticSearchFqStatiqueUrlBase(siteRequest_, o);
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
					o = persistSiteUser(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteUser(String var, Object val) {
		switch(var.toLowerCase()) {
			case "userid":
				if(val instanceof String)
					setUserId((String)val);
				saves.add("userId");
				return val;
			case "username":
				if(val instanceof String)
					setUserName((String)val);
				saves.add("userName");
				return val;
			case "useremail":
				if(val instanceof String)
					setUserEmail((String)val);
				saves.add("userEmail");
				return val;
			case "userfirstname":
				if(val instanceof String)
					setUserFirstName((String)val);
				saves.add("userFirstName");
				return val;
			case "userlastname":
				if(val instanceof String)
					setUserLastName((String)val);
				saves.add("userLastName");
				return val;
			case "userfullname":
				if(val instanceof String)
					setUserFullName((String)val);
				saves.add("userFullName");
				return val;
			case "seearchived":
				if(val instanceof Boolean)
					setSeeArchived((Boolean)val);
				else if(val instanceof String)
					setSeeArchived((String)val);
				saves.add("seeArchived");
				return val;
			case "seedeleted":
				if(val instanceof Boolean)
					setSeeDeleted((Boolean)val);
				else if(val instanceof String)
					setSeeDeleted((String)val);
				saves.add("seeDeleted");
				return val;
			case "sitedomainname":
				if(val instanceof String)
					setSiteDomainName((String)val);
				saves.add("siteDomainName");
				return val;
			case "zookeeperversion":
				if(val instanceof String)
					setZookeeperVersion((String)val);
				saves.add("zookeeperVersion");
				return val;
			case "zookeeperportclient":
				if(val instanceof Integer)
					setZookeeperPortClient((Integer)val);
				else if(val instanceof String)
					setZookeeperPortClient((String)val);
				saves.add("zookeeperPortClient");
				return val;
			case "solrversion":
				if(val instanceof String)
					setSolrVersion((String)val);
				saves.add("solrVersion");
				return val;
			case "solrportclient":
				if(val instanceof Integer)
					setSolrPortClient((Integer)val);
				else if(val instanceof String)
					setSolrPortClient((String)val);
				saves.add("solrPortClient");
				return val;
			case "solrconfigset":
				if(val instanceof String)
					setSolrConfigset((String)val);
				saves.add("solrConfigset");
				return val;
			case "solrcollection":
				if(val instanceof String)
					setSolrCollection((String)val);
				saves.add("solrCollection");
				return val;
			default:
				return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSiteUser(doc);
	}
	public void populateSiteUser(SolrResponse.Doc doc) {
		SiteUser oSiteUser = (SiteUser)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {
		}

		super.populateBaseModel(doc);
	}

	public void indexSiteUser(JsonObject doc) {
		if(userKeys != null) {
			JsonArray l = new JsonArray();
			doc.put("userKeys_docvalues_longs", l);
			for(Long o : userKeys) {
				l.add(o);
			}
		}
		if(userId != null) {
			doc.put("userId_docvalues_string", userId);
		}
		if(userName != null) {
			doc.put("userName_docvalues_string", userName);
		}
		if(userEmail != null) {
			doc.put("userEmail_docvalues_string", userEmail);
		}
		if(userFirstName != null) {
			doc.put("userFirstName_docvalues_string", userFirstName);
		}
		if(userLastName != null) {
			doc.put("userLastName_docvalues_string", userLastName);
		}
		if(userFullName != null) {
			doc.put("userFullName_docvalues_string", userFullName);
		}
		if(seeArchived != null) {
			doc.put("seeArchived_docvalues_boolean", seeArchived);
		}
		if(seeDeleted != null) {
			doc.put("seeDeleted_docvalues_boolean", seeDeleted);
		}
		if(siteDomainName != null) {
			doc.put("siteDomainName_docvalues_string", siteDomainName);
		}
		if(zookeeperVersion != null) {
			doc.put("zookeeperVersion_docvalues_string", zookeeperVersion);
		}
		if(zookeeperPortClient != null) {
			doc.put("zookeeperPortClient_docvalues_int", zookeeperPortClient);
		}
		if(solrVersion != null) {
			doc.put("solrVersion_docvalues_string", solrVersion);
		}
		if(solrPortClient != null) {
			doc.put("solrPortClient_docvalues_int", solrPortClient);
		}
		if(solrConfigset != null) {
			doc.put("solrConfigset_docvalues_string", solrConfigset);
		}
		if(solrCollection != null) {
			doc.put("solrCollection_docvalues_string", solrCollection);
		}
		super.indexBaseModel(doc);

	}

	public static String varStoredSiteUser(String entityVar) {
		switch(entityVar) {
			case "userKeys":
				return "userKeys_docvalues_longs";
			case "userId":
				return "userId_docvalues_string";
			case "userName":
				return "userName_docvalues_string";
			case "userEmail":
				return "userEmail_docvalues_string";
			case "userFirstName":
				return "userFirstName_docvalues_string";
			case "userLastName":
				return "userLastName_docvalues_string";
			case "userFullName":
				return "userFullName_docvalues_string";
			case "seeArchived":
				return "seeArchived_docvalues_boolean";
			case "seeDeleted":
				return "seeDeleted_docvalues_boolean";
			case "siteDomainName":
				return "siteDomainName_docvalues_string";
			case "zookeeperVersion":
				return "zookeeperVersion_docvalues_string";
			case "zookeeperPortClient":
				return "zookeeperPortClient_docvalues_int";
			case "solrVersion":
				return "solrVersion_docvalues_string";
			case "solrPortClient":
				return "solrPortClient_docvalues_int";
			case "solrConfigset":
				return "solrConfigset_docvalues_string";
			case "solrCollection":
				return "solrCollection_docvalues_string";
			default:
				return BaseModel.varStoredBaseModel(entityVar);
		}
	}

	public static String varIndexedSiteUser(String entityVar) {
		switch(entityVar) {
			case "userKeys":
				return "userKeys_docvalues_longs";
			case "userId":
				return "userId_docvalues_string";
			case "userName":
				return "userName_docvalues_string";
			case "userEmail":
				return "userEmail_docvalues_string";
			case "userFirstName":
				return "userFirstName_docvalues_string";
			case "userLastName":
				return "userLastName_docvalues_string";
			case "userFullName":
				return "userFullName_docvalues_string";
			case "seeArchived":
				return "seeArchived_docvalues_boolean";
			case "seeDeleted":
				return "seeDeleted_docvalues_boolean";
			case "siteDomainName":
				return "siteDomainName_docvalues_string";
			case "zookeeperVersion":
				return "zookeeperVersion_docvalues_string";
			case "zookeeperPortClient":
				return "zookeeperPortClient_docvalues_int";
			case "solrVersion":
				return "solrVersion_docvalues_string";
			case "solrPortClient":
				return "solrPortClient_docvalues_int";
			case "solrConfigset":
				return "solrConfigset_docvalues_string";
			case "solrCollection":
				return "solrCollection_docvalues_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String varSearchSiteUser(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedSiteUser(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSiteUser(doc);
	}
	public void storeSiteUser(SolrResponse.Doc doc) {
		SiteUser oSiteUser = (SiteUser)this;

		Optional.ofNullable((List<?>)doc.get("userKeys_docvalues_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteUser.addUserKeys(v.toString());
		});
		oSiteUser.setUserId(Optional.ofNullable(doc.get("userId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setUserName(Optional.ofNullable(doc.get("userName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setUserEmail(Optional.ofNullable(doc.get("userEmail_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setUserFirstName(Optional.ofNullable(doc.get("userFirstName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setUserLastName(Optional.ofNullable(doc.get("userLastName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setUserFullName(Optional.ofNullable(doc.get("userFullName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSeeArchived(Optional.ofNullable(doc.get("seeArchived_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSeeDeleted(Optional.ofNullable(doc.get("seeDeleted_docvalues_boolean")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSiteDomainName(Optional.ofNullable(doc.get("siteDomainName_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setZookeeperVersion(Optional.ofNullable(doc.get("zookeeperVersion_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setZookeeperPortClient(Optional.ofNullable(doc.get("zookeeperPortClient_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSolrVersion(Optional.ofNullable(doc.get("solrVersion_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSolrPortClient(Optional.ofNullable(doc.get("solrPortClient_docvalues_int")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSolrConfigset(Optional.ofNullable(doc.get("solrConfigset_docvalues_string")).map(v -> v.toString()).orElse(null));
		oSiteUser.setSolrCollection(Optional.ofNullable(doc.get("solrCollection_docvalues_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteUser() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteUser) {
			SiteUser original = (SiteUser)o;
			if(!Objects.equals(userKeys, original.getUserKeys()))
				apiRequest.addVars("userKeys");
			if(!Objects.equals(userId, original.getUserId()))
				apiRequest.addVars("userId");
			if(!Objects.equals(userName, original.getUserName()))
				apiRequest.addVars("userName");
			if(!Objects.equals(userEmail, original.getUserEmail()))
				apiRequest.addVars("userEmail");
			if(!Objects.equals(userFirstName, original.getUserFirstName()))
				apiRequest.addVars("userFirstName");
			if(!Objects.equals(userLastName, original.getUserLastName()))
				apiRequest.addVars("userLastName");
			if(!Objects.equals(userFullName, original.getUserFullName()))
				apiRequest.addVars("userFullName");
			if(!Objects.equals(seeArchived, original.getSeeArchived()))
				apiRequest.addVars("seeArchived");
			if(!Objects.equals(seeDeleted, original.getSeeDeleted()))
				apiRequest.addVars("seeDeleted");
			if(!Objects.equals(siteDomainName, original.getSiteDomainName()))
				apiRequest.addVars("siteDomainName");
			if(!Objects.equals(zookeeperVersion, original.getZookeeperVersion()))
				apiRequest.addVars("zookeeperVersion");
			if(!Objects.equals(zookeeperPortClient, original.getZookeeperPortClient()))
				apiRequest.addVars("zookeeperPortClient");
			if(!Objects.equals(solrVersion, original.getSolrVersion()))
				apiRequest.addVars("solrVersion");
			if(!Objects.equals(solrPortClient, original.getSolrPortClient()))
				apiRequest.addVars("solrPortClient");
			if(!Objects.equals(solrConfigset, original.getSolrConfigset()))
				apiRequest.addVars("solrConfigset");
			if(!Objects.equals(solrCollection, original.getSolrCollection()))
				apiRequest.addVars("solrCollection");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(userKeys).map(v -> "userKeys: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(userId).map(v -> "userId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userName).map(v -> "userName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userEmail).map(v -> "userEmail: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userFirstName).map(v -> "userFirstName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userLastName).map(v -> "userLastName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(userFullName).map(v -> "userFullName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(seeArchived).map(v -> "seeArchived: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(seeDeleted).map(v -> "seeDeleted: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(siteDomainName).map(v -> "siteDomainName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(zookeeperVersion).map(v -> "zookeeperVersion: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(zookeeperPortClient).map(v -> "zookeeperPortClient: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(solrVersion).map(v -> "solrVersion: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(solrPortClient).map(v -> "solrPortClient: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(solrConfigset).map(v -> "solrConfigset: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(solrCollection).map(v -> "solrCollection: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "SiteUser";
	public static final String VAR_userKeys = "userKeys";
	public static final String VAR_userId = "userId";
	public static final String VAR_userName = "userName";
	public static final String VAR_userEmail = "userEmail";
	public static final String VAR_userFirstName = "userFirstName";
	public static final String VAR_userLastName = "userLastName";
	public static final String VAR_userFullName = "userFullName";
	public static final String VAR_seeArchived = "seeArchived";
	public static final String VAR_seeDeleted = "seeDeleted";
	public static final String VAR_siteDomainName = "siteDomainName";
	public static final String VAR_zookeeperVersion = "zookeeperVersion";
	public static final String VAR_zookeeperPortClient = "zookeeperPortClient";
	public static final String VAR_solrVersion = "solrVersion";
	public static final String VAR_solrPortClient = "solrPortClient";
	public static final String VAR_solrConfigset = "solrConfigset";
	public static final String VAR_solrCollection = "solrCollection";
	public static final String VAR_statiqueUrlBase = "statiqueUrlBase";
	public static final String VAR_searchArticle = "searchArticle";

	public static List<String> varsQForClass() {
		return SiteUser.varsQSiteUser(new ArrayList<String>());
	}
	public static List<String> varsQSiteUser(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteUser.varsFqSiteUser(new ArrayList<String>());
	}
	public static List<String> varsFqSiteUser(List<String> vars) {
		vars.add(VAR_userKeys);
		vars.add(VAR_userId);
		vars.add(VAR_userName);
		vars.add(VAR_userEmail);
		vars.add(VAR_userFirstName);
		vars.add(VAR_userLastName);
		vars.add(VAR_userFullName);
		vars.add(VAR_seeArchived);
		vars.add(VAR_seeDeleted);
		vars.add(VAR_siteDomainName);
		vars.add(VAR_zookeeperVersion);
		vars.add(VAR_zookeeperPortClient);
		vars.add(VAR_solrVersion);
		vars.add(VAR_solrPortClient);
		vars.add(VAR_solrConfigset);
		vars.add(VAR_solrCollection);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteUser.varsRangeSiteUser(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteUser(List<String> vars) {
		vars.add(VAR_zookeeperPortClient);
		vars.add(VAR_solrPortClient);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_userKeys = "";
	public static final String DISPLAY_NAME_userId = "";
	public static final String DISPLAY_NAME_userName = "";
	public static final String DISPLAY_NAME_userEmail = "";
	public static final String DISPLAY_NAME_userFirstName = "";
	public static final String DISPLAY_NAME_userLastName = "";
	public static final String DISPLAY_NAME_userFullName = "";
	public static final String DISPLAY_NAME_seeArchived = "see archived";
	public static final String DISPLAY_NAME_seeDeleted = "see deleted";
	public static final String DISPLAY_NAME_siteDomainName = "";
	public static final String DISPLAY_NAME_zookeeperVersion = "";
	public static final String DISPLAY_NAME_zookeeperPortClient = "";
	public static final String DISPLAY_NAME_solrVersion = "";
	public static final String DISPLAY_NAME_solrPortClient = "";
	public static final String DISPLAY_NAME_solrConfigset = "";
	public static final String DISPLAY_NAME_solrCollection = "";
	public static final String DISPLAY_NAME_statiqueUrlBase = "";
	public static final String DISPLAY_NAME_searchArticle = "";

	public static String displayNameForClass(String var) {
		return SiteUser.displayNameSiteUser(var);
	}
	public static String displayNameSiteUser(String var) {
		switch(var) {
		case VAR_userKeys:
			return DISPLAY_NAME_userKeys;
		case VAR_userId:
			return DISPLAY_NAME_userId;
		case VAR_userName:
			return DISPLAY_NAME_userName;
		case VAR_userEmail:
			return DISPLAY_NAME_userEmail;
		case VAR_userFirstName:
			return DISPLAY_NAME_userFirstName;
		case VAR_userLastName:
			return DISPLAY_NAME_userLastName;
		case VAR_userFullName:
			return DISPLAY_NAME_userFullName;
		case VAR_seeArchived:
			return DISPLAY_NAME_seeArchived;
		case VAR_seeDeleted:
			return DISPLAY_NAME_seeDeleted;
		case VAR_siteDomainName:
			return DISPLAY_NAME_siteDomainName;
		case VAR_zookeeperVersion:
			return DISPLAY_NAME_zookeeperVersion;
		case VAR_zookeeperPortClient:
			return DISPLAY_NAME_zookeeperPortClient;
		case VAR_solrVersion:
			return DISPLAY_NAME_solrVersion;
		case VAR_solrPortClient:
			return DISPLAY_NAME_solrPortClient;
		case VAR_solrConfigset:
			return DISPLAY_NAME_solrConfigset;
		case VAR_solrCollection:
			return DISPLAY_NAME_solrCollection;
		case VAR_statiqueUrlBase:
			return DISPLAY_NAME_statiqueUrlBase;
		case VAR_searchArticle:
			return DISPLAY_NAME_searchArticle;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSiteUser(String var) {
		switch(var) {
		case VAR_userKeys:
			return "User keys that relate to this user";
		case VAR_userId:
			return "The unique user ID from the SSO server";
		case VAR_userName:
			return "The user's username";
		case VAR_userEmail:
			return "The user's email";
		case VAR_userFirstName:
			return "The user's first name";
		case VAR_userLastName:
			return "The user's last name";
		case VAR_userFullName:
			return "The user's full name";
		case VAR_seeArchived:
			return "A user field allowing a user to see archived records";
		case VAR_seeDeleted:
			return "A user field allowing a user to see deleted records";
		case VAR_siteDomainName:
			return "A domain name is your website name. A domain name is the address where Internet users can access your website. ";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSiteUser(String var) {
		switch(var) {
		case VAR_userKeys:
			return "List";
		case VAR_userId:
			return "String";
		case VAR_userName:
			return "String";
		case VAR_userEmail:
			return "String";
		case VAR_userFirstName:
			return "String";
		case VAR_userLastName:
			return "String";
		case VAR_userFullName:
			return "String";
		case VAR_seeArchived:
			return "Boolean";
		case VAR_seeDeleted:
			return "Boolean";
		case VAR_siteDomainName:
			return "String";
		case VAR_zookeeperVersion:
			return "String";
		case VAR_zookeeperPortClient:
			return "Integer";
		case VAR_solrVersion:
			return "String";
		case VAR_solrPortClient:
			return "Integer";
		case VAR_solrConfigset:
			return "String";
		case VAR_solrCollection:
			return "String";
		case VAR_statiqueUrlBase:
			return "String";
		case VAR_searchArticle:
			return "SearchList";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnSiteUser(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowSiteUser(String var) {
		switch(var) {
		case VAR_seeArchived:
			return 3;
		case VAR_seeDeleted:
			return 3;
		case VAR_siteDomainName:
			return 3;
		case VAR_zookeeperVersion:
			return 4;
		case VAR_zookeeperPortClient:
			return 4;
		case VAR_solrVersion:
			return 5;
		case VAR_solrPortClient:
			return 5;
		case VAR_solrConfigset:
			return 6;
		case VAR_solrCollection:
			return 6;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellSiteUser(String var) {
		switch(var) {
		case VAR_seeArchived:
			return 2;
		case VAR_seeDeleted:
			return 3;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinSiteUser(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxSiteUser(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxSiteUser(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minSiteUser(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
