package org.computate.site.enus.model.user;

import java.util.List;

import org.computate.search.tool.SearchTool;
import org.computate.search.wrap.Wrap;
import org.computate.site.enus.article.Article;
import org.computate.site.enus.config.ConfigKeys;
import org.computate.site.enus.model.base.BaseModel;
import org.computate.site.enus.request.SiteRequestEnUS;
import org.computate.vertx.model.user.ComputateVertxSiteUser;
import org.computate.vertx.request.ComputateVertxSiteRequest;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**
 * Model: true
 * Api: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Indexed: true
 * Map.Integer.sqlSort: 1
 * Map.Integer.classSort: 1
 * 
 * ApiTag.enUS: User
 * ApiUri.enUS: /api/user
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: SiteUserPage
 * PageSuperSearchPage.enUS: BaseModelPage
 * ApiUriSearchPage.enUS: /user
 * 
 * Keyword: classSimpleNameSiteUser
 * Role.enUS: SiteAdmin
 * Filter: userId
 * 
 * AName.enUS: a site user
 * Color: gray
 * IconGroup: regular
 * IconName: user-cog
 * NameVar.enUS: user
 * 
 * RoleUser: true
 * Role.enUS: SiteAdmin
 * Description: A user record for each site user
 */
public class SiteUser extends SiteUserGen<BaseModel> implements ComputateVertxSiteUser {

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: User keys that relate to this user
	 */
	protected void _userKeys(List<Long> l) {
		l.add(pk);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The unique user ID from the SSO server
	 */
	protected void _userId(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's username
	 */
	protected void _userName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's email
	 */
	protected void _userEmail(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's first name
	 */
	protected void _userFirstName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's last name
	 */
	protected void _userLastName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Description: The user's full name
	 */
	protected void _userFullName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * DisplayName.enUS: see archived
	 * Description: A user field allowing a user to see archived records
	 */
	protected void _seeArchived(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * HtmlCell: 3
	 * DisplayName.enUS: see deleted
	 * Description: A user field allowing a user to see deleted records
	 */
	protected void _seeDeleted(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 3
	 * NomAffichage.frFR:nom de domaine
	 * NomAffichage.enUS:domain name
	 * Description.frFR:Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. 
	 * Description.enUS:A domain name is your website name. A domain name is the address where Internet users can access your website. 
	 */   
	protected void _siteDomainName(Wrap<String> c) {
		c.o("example.com");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 4
	 * NomAffichage.frFR:version de Zookeeper
	 * NomAffichage.enUS:Zookeeper version
	 */   
	protected void _zookeeperVersion(Wrap<String> c) {
		c.o("3.5.5");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 4
	 * NomAffichage.frFR:port client de Zookeeper
	 * NomAffichage.enUS:Zookeeper client port
	 */ 
	protected void _zookeeperPortClient(Wrap<Integer> c) {
		c.o(2181);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 5
	 * NomAffichage.frFR:version de Solr
	 * NomAffichage.enUS:Solr version
	 */   
	protected void _solrVersion(Wrap<String> c) {
		c.o("7.1.0");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 5
	 * NomAffichage.frFR:port client de Solr
	 * NomAffichage.enUS:Solr client port
	 */ 
	protected void _solrPortClient(Wrap<Integer> c) {
		c.o(8983);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 6
	 * NomAffichage.frFR:Configset Solr
	 * NomAffichage.enUS:Solr configset
	 */ 
	protected void _solrConfigset(Wrap<String> c) {
		c.o("computate");
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 6
	 * NomAffichage.frFR:Collection Solr
	 * NomAffichage.enUS:Solr collection
	 */ 
	protected void _solrCollection(Wrap<String> c) {
		c.o("site");
	}

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _statiqueUrlBase(Wrap<String> c) {
		c.o(siteRequest_.getConfig().getString(ConfigKeys.STATIC_BASE_URL));
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _searchArticle(Promise<SearchList<Article>> promise) {
		SearchList<Article> l = new SearchList<>();
		l.setC(Article.class);
		l.q("*:*");
		l.sortDesc("coursNumero_docvalues_int");
		l.sortDesc("leconNumero_docvalues_int");
		l.fq("classeNomsCanoniques_docvalues_strings:" + SearchTool.escapeQueryChars(getClass().getCanonicalName()));
		l.fq("isLesson_docvalues_boolean:true");
		promise.complete(l);
	}

	/**
	 * Description: An implementation for the interface for the object title
	 */
	@Override
	protected void _objectTitle(Wrap<String> c) {
		c.o(String.format("%s (%s) <%s>", userFullName, userName, userEmail));
	}

	/**
	 * Description: An implementation for the interface to set the request object
	 */
	@Override
	public <T extends ComputateVertxSiteRequest> void setSiteRequest_(T siteRequest) {
		siteRequest_ = (SiteRequestEnUS)siteRequest;
	}

	/**
	 * Description: An implementation for the interface to create a new API request object
	 */
	@Override
	public void apiRequestSiteUser() {
		apiRequestSiteUser();
	}
}
