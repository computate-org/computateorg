package org.computate.site.enus.article;

import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.search.wrap.Wrap;
import org.computate.site.enus.config.ConfigKeys;
import org.computate.site.enus.model.base.BaseModel;
import org.computate.site.enus.model.user.SiteUser;
import org.computate.site.enus.page.PageLayout;
import org.computate.site.enus.request.SiteRequestEnUS;

import io.vertx.core.Promise;

/**
 * Api: true
 * Indexed: true
 * Page: true
 * SuperPage.enUS: PageLayout
 * Map.Integer.classSort: 1
 * 
 * ApiTag: Article
 * ApiUri: /api/article
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: ArticlePage
 * PageSuperSearchPage.enUS: PageLayout
 * ApiUriSearchPage.enUS: /article
 * 
 * AName.frFR: un article
 * AName.enUS: an article
 * Color: green
 * IconGroup: regular
 * IconName: university
*/
public class Article extends ArticleGen<Object> {

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _staticBaseUrl(Wrap<String> w) {
		w.o(siteRequest_.getConfig().getString(ConfigKeys.STATIC_BASE_URL));
	}

	/** 
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Site domain name
	 * NomAffichage.frFR: Nom de domaine du site
	 * Le nom de domaine du site. 
	 * **/
	protected void _domainName(Wrap<String> w) {
		w.o("example.com");
	}

	/**   
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Display name of the site
	 * NomAffichage.frFR: Nom d'affichage du site
	 * Le nom d'hôte du site. **/
	protected void _siteName(Wrap<String> w) {
		w.o(domainName);
	}

	/**	
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Site host name
	 * NomAffichage.frFR: Nom d'hôte du site
	 * Le nom d'hôte du site. **/
	protected void _siteHostName(Wrap<String> w) {
		w.o("localhost");
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: site package name
	 * NomAffichage.frFR: nom d'ensemble du site
	 * 
	 */    
	protected void _sitePackageName(Wrap<String> w) { 
		String[] parts = StringUtils.split(siteHostName, ".");
		ArrayUtils.reverse(parts);
		String o = StringUtils.join(parts, ".");
		w.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Computer host name
	 * NomAffichage.frFR: Nom d'hôte de l'ordinateur
	 * Le nom d'hôte du site. 
	 * r: tour
	 * r.enUS: tower
	 * **/    
	protected void _computerHostName(Wrap<String> w) {
		w.o("localhost");
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: User name
	 * NomAffichage.frFR: Nom d'utilisateur
	 * r: monutlisateur
	 * r.enUS: myuser
	 */
	protected void _userName(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getUserName()).orElse("user"));
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Project path
	 * NomAffichage.frFR: Chemin du projet
	 * Le chemin vers le projet du site. **/
	protected void _cheminProjet(Wrap<String> w) {
		String o = new StringBuilder(userName).append("/.local/src/").append(siteName).toString();
		w.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Group name
	 * NomAffichage.frFR: Nom de groupe
	 * 
	 */ 
	protected void _groupName(Wrap<String> w) {
		w.o(userName);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est cours
	 * NomAffichage.enUS: is course
	 */
	protected void _isCourse(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est leçon
	 * NomAffichage.enUS: is lesson
	 */
	protected void _isLesson(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est article
	 * NomAffichage.enUS: is article
	 */
	protected void _isArticle(Wrap<Boolean> w) {
		w.o(true);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 1
	 * HtmlColonne: 1
	 * NomAffichage.frFR: cours
	 * NomAffichage.enUS: course
	 */  
	protected void _courseNumber(Wrap<Integer> w) {
		Matcher m = Pattern.compile("^C(\\d+)", Pattern.MULTILINE).matcher(getClass().getSimpleName());
		if(m.find()) {
			Integer o = Integer.parseInt(m.group(1));
			w.o(o);
		}
	}

	/**
	 * leconNumeroWrap.indexe: true
	 * Stocke: true
	 * Indexe: true
	 * HtmlColonne: 2
	 * NomAffichage.frFR: leçon
	 * NomAffichage.enUS: lesson
	 */
	protected void _lessonNumber(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * HtmlLigne: 1
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _lessonDescription(Wrap<String> w) {
		if(isLesson)
			w.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: enUS
	 * NomAffichage.enUS: title in English
	 */
	protected void _articleH1_enUS(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: frFR
	 * NomAffichage.frFR: titre en français
	 */
	protected void _articleH1_frFR(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: enUS
	 */
	protected void _articleH2_enUS(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: frFR
	 */ 
	protected void _articleH2_frFR(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleH1(Wrap<String> w) {
		w.o(articleH1_frFR);
	}

	/**
	 * {@inheritDoc}
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleH2(Wrap<String> w) {
		w.o(articleH2_frFR);
	}

	/**
	 * {@inheritDoc}
	 * HtmlLigne: 1
	 * HtmlColonne: 3
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 * Highlighting: true
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleDescription(Wrap<String> w) {
		w.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	protected void _pageDescription(Wrap<String> w) {
		w.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	/**  
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _articleCreated(Wrap<ZonedDateTime> w) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageUri_enUS(Wrap<String> w) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageUri_frFR(Wrap<String> w) {
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _pageUri(Wrap<String> w) {
		w.o(pageUri_frFR);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUri_enUS(Wrap<String> w) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUri_frFR(Wrap<String> w) {
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _pageImageUri(Wrap<String> w) {
		w.o(pageImageUri_frFR);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageCreated(Wrap<ZonedDateTime> w) {
		w.o(articleCreated);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH1(Wrap<String> w) {
		Class<?> clazz = getClass();
		try {
			w.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H1")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH2(Wrap<String> w) {
		Class<?> clazz = getClass();
		try {
			w.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H2")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: Crée : 
	 * r.enUS: Created: 
	 */
	protected void _pageH3(Wrap<String> w) { 
		if(pageCreated != null)
			w.o("Crée : " + pageCreated.format(PageLayout.FORMATDateTimeShort));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: Titre
	 * r.enUS: Title
	 */
	protected void _pageTitle(Wrap<String> w) {
		Class<?> clazz = getClass();
		try {
			w.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_Title")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * {@inheritDoc}
	 * Texte: true
	 * Langue: enUS
	 */
	protected void _pageSearch_enUS(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * Texte: true
	 * Langue: frFR
	 */ 
	protected void _pageSearch_frFR(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _siteUser_(Wrap<SiteUser> w) {
		w.o(siteRequest_.getSiteUser_());
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _userId(Wrap<String> w) {
		if(siteUser_ != null)
			w.o(siteUser_.getUserId());
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 * Description: The current request object
	 */
	protected void _siteRequest_(Wrap<SiteRequestEnUS> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * InheritPrimaryKey: true
	 * Persist: true
	 * Description: An optional inherited primary key from a legacy system for this object in the database
	 */
	protected void _inheritPk(Wrap<String> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * VarCreated: true
	 * HtmlRow: 1
	 * HtmlCell: 2
	 * HtmlColumn: 1
	 * DisplayName.enUS: created
	 * FormatHtm: MMM d, yyyy h:mm:ss a
	 * Description: A created timestamp for this record in the database
	 */
	protected void _created(Wrap<ZonedDateTime> w) {
		w.o(ZonedDateTime.now(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Modify: false
	 * VarModified: true
	 * HtmlRow: 1
	 * HtmlCell: 3
	 * DisplayName.enUS: modified
	 * Description: A modified timestamp for this record in the database
	 */
	protected void _modified(Wrap<ZonedDateTime> w) {
		w.o(ZonedDateTime.now(ZoneId.of(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE))));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 2
	 * HtmlCell: 1
	 * DisplayName.enUS: archived
	 * Description: For archiving this record
	 */
	protected void _archived(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmlRow: 2
	 * HtmlCell: 2
	 * DisplayName.enUS: deleted
	 * Description: For deleting this record
	 */
	protected void _deleted(Wrap<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: the canonical name of this Java class
	 */
	protected void _classCanonicalName(Wrap<String> w) {
		w.o(getClass().getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: The simple name of this Java class
	 */
	protected void _classSimpleName(Wrap<String> w) {
		w.o(getClass().getSimpleName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: All the inherited canonical names of this Java class
	 */
	protected void _classCanonicalNames(List<String> l) { 
		Class<?> cl = getClass();
		if(!cl.equals(BaseModel.class))
			l.add(cl.getCanonicalName());
		l.add(BaseModel.class.getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * Description: The session ID of the user that created this object
	 */
	protected void _sessionId(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: userKey
	 * DocValues: true
	 * Persist: true
	 * Modify: false
	 * Description: The primary key of the user that created this record
	 */
	protected void _userKey(Wrap<Long> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Saves: true
	 * Description: A list of fields that are saved for this record in the database
	 */
	protected void _saves(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarTitle: true
	 * HtmlColumn: 2
	 * Description: The title of this object
	 */
	protected void _objectTitle(Wrap<String> w) {
		w.o(String.format(Article_Title_enUS));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * VarId: true
	 * HtmlRow: 1
	 * HtmlCell: 4
	 * DisplayName.enUS: ID
	 * Description: A URL friendly unique ID for this object
	 */
	protected void _objectId(Wrap<String> w) {
		w.o(String.format("%s_%s", getClass().getSimpleName(), UUID.randomUUID().toString()));
	}

	/**
	 * Description: A helper method for generating a URL friendly unique ID for this object
	 */
	public String toId(String s) {
		if(s != null) {
			s = Normalizer.normalize(s, Normalizer.Form.NFD);
			s = StringUtils.lowerCase(s);
			s = StringUtils.trim(s);
			s = StringUtils.replacePattern(s, "\\s{1,}", "-");
			s = StringUtils.replacePattern(s, "[^\\w-]", "");
			s = StringUtils.replacePattern(s, "-{2,}", "-");
		}

		return s;
	}

	/**
	 * Description: The var that identifies this type of object in the API
	 */
	protected void _objectNameVar(Wrap<String> w) {
		if(objectId != null) {
			Class<?> cl = getClass();

			try {
				String o = toId(StringUtils.join(StringUtils.splitByCharacterTypeCamelCase((String)FieldUtils.getField(cl, cl.getSimpleName() + "_NameVar").get(this)), "-"));
				w.o(o);
			} catch (Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * Suggested: true
	 * Description: The indexed field in the search engine for this record while using autosuggest
	 * DisplayName: autosuggest
	 */
	protected void _objectSuggest(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
		if(objectNameVar != null)
			b.append(" ").append(objectNameVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objectTitle != null)
			b.append(" ").append(objectTitle);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * Text: true
	 * DocValues: true
	 * Description: The full text search field in the search engine for this record while using autosuggest
	 * DisplayName: text
	 */
	protected void _objectText(Wrap<String> w) { 
		StringBuilder b = new StringBuilder();
		if(objectNameVar != null)
			b.append(" ").append(objectNameVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objectTitle != null)
			b.append(" ").append(objectTitle);
		w.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlId: true
	 * Description: The link by name for this object in the UI
	 */
	protected void _pageUrlId(Wrap<String> w) {
		if(objectId != null) {
			String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/" + objectNameVar + "/" + objectId;
			w.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlPk: true
	 * Description: The link by primary key for this object in the UI
	 */
	protected void _pageUrlPk(Wrap<String> w) {
		w.o(pageUrlId);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Description: The link to this object in the API
	 */
	protected void _pageUrlApi(Wrap<String> w) {
		String o = siteRequest_.getConfig().getString(ConfigKeys.SITE_BASE_URL) + "/api/" + objectNameVar + "/" + objectId;
		w.o(o);
	}

	/**
	 * {@inheritDoc}
	 * UniqueKey: true
	 * Description: The unique key for this record in the search engine
	 */
	protected void _id(Wrap<String> w) {
		w.o(getClass().getCanonicalName());
	}
}
