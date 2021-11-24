package org.computate.site.frfr.requete; 

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frfr.couverture.Couverture;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.utilisateur.UtilisateurSite;

import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.client.WebClient;
import io.vertx.sqlclient.SqlConnection; 

/**
 * MotCle: classeNomSimpleRequeteSite
 */  
public class RequeteSiteFrFR extends RequeteSiteFrFRGen<Object> implements Serializable {  

	private static final Pattern PATTERN_SESSION = Pattern.compile(".*vertx-web.session=(\\w+).*");

	/**	
	 *	The site configuration. 
	 **/
	protected void _config(Couverture<JsonObject> c) {
	}

	/**
	 */
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) { 
		c.o(this);
	}

	protected void _clientWeb(Couverture<WebClient> c) { 
	}

	/**
	 */
	protected void _requeteApi_(Couverture<RequeteApi> c) { 
	}

	/**
	 */
	protected void _objetJson(Couverture<JsonObject> c) {
	}

	/**
	 */
	protected void _rechercheSolr(Couverture<SolrQuery> c) {
	}

	/**
	 */
	protected void _requeteService(Couverture<ServiceRequest> c) {
	}

	protected void _utilisateur(Couverture<User> c) {
	}

	/**	
	 * Le sujet d'acces Keycloak pour l'utilisateur. 
	 * Aussi l'ID d'utilisateur cle primaire dans la base de donnees Keycloak. 
	 ***/
	protected void _utilisateurId(Couverture<String> c) {
		if(utilisateur != null) {
			String o = utilisateur.attributes().getString("sub");
			c.o(o);
		}
	}

	/**	
	 ***/
	protected void _utilisateurCle(Couverture<Long> c) {
	}

	/**   
	 * {@inheritDoc}
	 */                   
	protected void _sessionId(Couverture<String> c) {
		if(requeteService != null) {
			String cookie = requeteService.getHeaders().get("Cookie");
			if(StringUtils.isNotBlank(cookie)) {
				Matcher m = PATTERN_SESSION.matcher(cookie);
				if(m.matches()) {
					c.o(m.group(1));
				}
			}
		}
	}

	/**	
	 * {@inheritDoc}
	 */                   
	protected void _sessionIdAvant(Couverture<String> c) {
		if(requeteService != null) {
			c.o(Optional.ofNullable(requeteService).map(r -> r.getParams()).map(p -> p.getJsonObject("cookie")).map(cookie -> cookie.getString("sessionIdBefore")).orElse(null));
		}
	}

	/**	
	 * Le nom d'utilisateur prefere de l'utilisateur. 
	 * **/
	protected void _utilisateurNom(Couverture<String> c) {
		if(utilisateur != null) {
			String o = utilisateur.attributes().getJsonObject("accessToken").getString("preferred_username");
			c.o(o);
		}
	}

	/**	
	 * Le nom de famille de l'utilisateur. 
	 * **/
	protected void _utilisateurNomFamille(Couverture<String> c) {
		if(utilisateur != null) {
			String o = utilisateur.attributes().getJsonObject("accessToken").getString("family_name");
			c.o(o);
		}
	}

	/**	
	 * Le prenom de l'utilisateur. 
	 * **/
	protected void _utilisateurPrenom(Couverture<String> c) { 
		if(utilisateur != null) {
			String o = utilisateur.attributes().getJsonObject("accessToken").getString("given_name");
			c.o(o);
		}
	}

	/**	
	 * Le nom complet de l'utilisateur. 
	 * **/
	protected void _utilisateurNomComplet(Couverture<String> c) {
		if(utilisateur != null) {
			String o = utilisateur.attributes().getJsonObject("accessToken").getString("name");
			c.o(o);
		}
	}

	protected void _userMail(Couverture<String> c) {
		if(utilisateur != null) {
			String o = utilisateur.attributes().getJsonObject("accessToken").getString("email");
			c.o(o);
		}
	}

	/**	
	 * frFR: Les rôles de la ressource de l'utilisateur. 
	 * **/
	protected void _utilisateurRolesRoyaume(List<String> o) {
		JsonArray roles = Optional.ofNullable(utilisateur).map(user -> user.attributes()).map(attributes -> attributes.getJsonObject("accessToken")).map(o1 -> o1.getJsonObject("realm_access")).map(o2 -> o2.getJsonArray("roles")).orElse(new JsonArray());
		roles.stream().forEach(r -> {
			addUtilisateurRolesRoyaume((String)r);
		});
	}

	/**	
	 * frFR: Les rôles de la ressource de l'utilisateur. 
	 * **/
	protected void _utilisateurRessource(Couverture<JsonObject> c) {
		String authResource = config.getString("authResource");
		JsonObject o = Optional.ofNullable(utilisateur).map(user -> user.attributes()).map(p -> p.getJsonObject("resource_access")).map(o1 -> o1.getJsonObject(authResource)).orElse(new JsonObject());
		c.o(o);
	}

	/**	
	 * frFR: Les rôles de la ressource de l'utilisateur. 
	 * **/
	protected void _utilisateurRolesRessource(List<String> o) {
		JsonArray roles = Optional.ofNullable(utilisateurRessource).map(o2 -> o2.getJsonArray("roles")).orElse(new JsonArray());
		roles.stream().forEach(r -> {
			addUtilisateurRolesRessource((String)r);
		});
	}

	/**	
	 * L'utilisateur de la requête. 
	 * **/ 
	protected void _utilisateurSite_(Couverture<UtilisateurSite> c) { 
		if(utilisateurId != null) {
			UtilisateurSite o = new UtilisateurSite();
			o.setUtilisateurNom(utilisateurNom);
			o.setUtilisateurPrenom(utilisateurPrenom);
			o.setUtilisateurNomFamille(utilisateurNomFamille);
			o.setUtilisateurId(utilisateurId);
			c.o(o);
		}
	}

	/**
	 */
	protected void _documentSolr(Couverture<SolrDocument> c) {  
	}

	/**	
	 * frFR: Si la page vu etait achete par l'utilisateur. 
	 * **/
	protected void _pageAdmin(Couverture<Boolean> c) { 
		c.o(false);
	} 
	
	/**
	 */
	protected void _requetePk(Couverture<Long> c) {
		if(requeteService != null)
			c.o(requeteService.getParams().getLong("pk"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _requeteUri(Couverture<String> c) {
		c.o(Optional.ofNullable(requeteService).map(r -> r.getExtra()).map(extra -> extra.getString("uri")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _requeteMethode(Couverture<String> c) {
		c.o(Optional.ofNullable(requeteService).map(r -> r.getExtra()).map(extra -> extra.getString("method")).orElse(null));
	}

	/**
	 * {@inheritDoc}
	 * Ignorer: true
	 **/
	protected void _connexionSql(Couverture<SqlConnection> c) {
	}
	
	/**
	 * {@inheritDoc}
	 * Ignorer: true
	 **/
	protected void _requeteEnTetes(Couverture<MultiMap> c) {
	}
	
	/**
	 * Ignorer: true
	 */
	protected void _requeteVars(Map<String, String> m) {
	}

	/**
	 */
	public RequeteSiteFrFR copy() {
		RequeteSiteFrFR o = new RequeteSiteFrFR();
		o.setObjetJson(objetJson);
		o.setConfig(config);
		o.setClientWeb(clientWeb);
		o.setRequeteService(requeteService);
		o.setUtilisateur(utilisateur);
		o.setUtilisateurCle(utilisateurCle);
		o.setUtilisateurId(utilisateurId);
		o.setRequeteApi_(requeteApi_);
		return o;
	}
}
