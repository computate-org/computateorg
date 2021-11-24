package org.computate.site.frfr.utilisateur;

import java.util.List;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.computate.site.frfr.couverture.Couverture;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.solr.common.util.SimpleOrderedMap;
import java.util.stream.Collectors;
import java.util.Arrays;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.collections.CollectionUtils;
import java.util.Objects;
import org.apache.solr.client.solrj.SolrQuery.SortClause;
import io.vertx.core.Promise;
import org.computate.site.frfr.config.ConfigCles;


/**
 * Traduire: false
 **/
public class UtilisateurSiteGenPage extends UtilisateurSiteGenPageGen<Object> {

	/**
	 * Ignorer: true
	**/
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	/**
	 * {@inheritDoc}
	 * Ignorer: true
	 **/
	protected void _listeRechercheUtilisateurSite_(Couverture<ListeRecherche<UtilisateurSite>> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listeUtilisateurSite(JsonArray l) {
		Optional.ofNullable(listeRechercheUtilisateurSite_).map(o -> o.getListe()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _utilisateurSiteCount(Couverture<Integer> c) {
		c.o(listeRechercheUtilisateurSite_ == null ? 0 : listeRechercheUtilisateurSite_.size());
	}

	protected void _utilisateurSite_(Couverture<UtilisateurSite> c) {
		if(utilisateurSiteCount == 1)
			c.o(listeRechercheUtilisateurSite_.get(0));
	}

	protected void _(Couverture<Long> c) {
		if(utilisateurSiteCount == 1)
			c.o(utilisateurSite_.get());
	}

	/**
	 * Ignorer: true
	**/
	protected void _promiseAvant(Promise<Void> promise) {
		promise.complete();
	}

	protected void _classeNomSimple(Couverture<String> c) {
		c.o("UtilisateurSite");
	}

	protected void _pageTitre(Couverture<String> c) {
		if(utilisateurSite_ != null)
			c.o("utilisateurs du site");
		else if(listeRechercheUtilisateurSite_ == null || utilisateurSiteCount == 0)
			c.o("aucun utilisateur du site trouvé");
		else
			c.o("utilisateurs du site");
	}

	protected void _pageUri(Couverture<String> c) {
		c.o("/api/utilisateur");
	}

	protected void _roles(List<String> l) {
		if(requeteSite_ != null) {
			l.addAll(Stream.concat(requeteSite_.getUtilisateurRolesRessource().stream(), requeteSite_.getUtilisateurRolesRoyaume().stream()).distinct().collect(Collectors.toList()));
		}
	}

	protected void _rolesRequis(List<String> l) {
		l.addAll(Optional.ofNullable(siteRequest_.getConfig().getJsonArray(ConfigCles.AUTH_ROLES_REQUIS + "_UtilisateurSite")).orElse(new JsonArray()).stream().map(o -> o.toString()).collect(Collectors.toList()));
	}

	protected void _pagination(JsonObject pagination) {
		JsonArray pages = new JsonArray();
		Long debut = listeRechercheUtilisateurSite_.getStart().longValue();
		Long lignes = listeRechercheUtilisateurSite_.getRows().longValue();
		Long numTrouve = listeRechercheUtilisateurSite_.getQueryResponse().getResults().getNumFound();
		Long debutNum = debut + 1L;
		Long finNum = debut + lignes;
		Long floorMod = Math.floorMod(numTrouve, lignes);
		Long dernier = Math.floorDiv(numTrouve, lignes) - (floorMod.equals(0L) ? 1L : 0L) * lignes;
		finNum = finNum < numTrouve ? finNum : numTrouve;
		debutNum = numTrouve == 0L ? 0L : debutNum;
		Long paginationDebut = debut - 10L * lignes;
		if(paginationDebut < 0L)
			paginationDebut = 0L;
		Long paginationFin = debut + 10L * lignes;
		if(paginationFin > numTrouve)
			paginationFin = numTrouve;

		pagination.put("1L", 1L);
		pagination.put("0L", 0L);
		pagination.put("debut", debut);
		pagination.put("lignes", lignes);
		pagination.put("lignesPrecedent", lignes / 2);
		pagination.put("lignesProchaine", lignes * 2);
		pagination.put("debutNum", debutNum);
		pagination.put("finNum", finNum);
		pagination.put("numTrouve", numTrouve);
		pagination.put("pageDebut", new JsonObject().put("debut", 0L).put("pageNumero", 1L));
		if(debut > 0L)
			pagination.put("pagePrecedent", new JsonObject().put("debut", debut - lignes).put("pageNumero", debut - lignes + 1L));
		if(debut + lignes < numTrouve)
			pagination.put("pageProchaine", new JsonObject().put("debut", debut + lignes).put("pageNumero", debut + lignes + 1L));
		pagination.put("pageFin", new JsonObject().put("debut", dernier).put("pageNumero", dernier + 1L));
		pagination.put("pages", pages);
		for(Long i = paginationDebut; i < paginationFin; i += lignes) {
			Long pageNumero = Math.floorDiv(i, lignes) + 1L;
			JsonObject page = new JsonObject();
			page.put("pageNumero", pageNumero);
			page.put("pageActuel", debut.equals(i));
			page.put("debut", i);
			pages.add(page);
		}
	}

	protected void _query(JsonObject query) {
		ServiceRequest requeteService = requeteSite_.getServiceRequest();
		JsonObject params = requeteService.getParams();

		JsonObject queryParams = Optional.ofNullable(requeteService).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		Long num = listeRechercheUtilisateurSite_.getQueryResponse().getResults().getNumFound();
		String q = "*:*";
		String q1 = "";
		String q2 = "";
		for(String paramNom : queryParams.fieldNames()) {
			String entiteVar = null;
			String valeurIndexe = null;
			Object paramValeursObjet = queryParams.getValue(paramNom);
			JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

			try {
				for(Object paramObjet : paramObjets) {
					switch(paramNom) {
					case "q":
						q = (String)paramObjet;
						entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
						valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
						q1 = entiteVar.equals("*") ? q1 : entiteVar;
						q2 = valeurIndexe;
						q = q1 + ":" + q2;
					}
				}
			} catch(Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
		query.put("q", q);

		Integer rows1 = Optional.ofNullable(listeRechercheUtilisateurSite_).map(l -> l.getRows()).orElse(10);
		Integer start1 = Optional.ofNullable(listeRechercheUtilisateurSite_).map(l -> l.getStart()).orElse(1);
		Integer start2 = start1 - rows1;
		Integer start3 = start1 + rows1;
		Integer rows2 = rows1 / 2;
		Integer rows3 = rows1 * 2;
		start2 = start2 < 0 ? 0 : start2;
		JsonArray fqs = new JsonArray();
		for(String fq : Optional.ofNullable(listeRechercheUtilisateurSite_).map(l -> l.getFilterQueries()).orElse(new String[0])) {
			if(!StringUtils.contains(fq, "(")) {
				String fq1 = StringUtils.substringBefore(fq, "_");
				String fq2 = StringUtils.substringAfter(fq, ":");
				if(!StringUtils.startsWithAny(fq, "classeNomsCanoniques_", "archive_", "supprime_", "sessionId", "utilisateurCles"))
					fqs.add(new JsonObject().put("var", fq1).put("val", fq2));
				}
			}
		query.put("fq", fqs);

		JsonArray sorts = new JsonArray();
		for(SortClause sort : Optional.ofNullable(listeRechercheUtilisateurSite_).map(l -> l.getSorts()).orElse(Arrays.asList())) {
			sorts.add(new JsonObject().put("var", StringUtils.substringBefore(sort.getItem(), "_")).put("order", sort.getOrder().name()));
		}
		query.put("sort", sorts);
	}

	/**
	 * Ignorer: true
	**/
	protected void _promiseApres(Promise<Void> promise) {
		promise.complete();
	}

	protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/api/utilisateur-999.png");
	}

	protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	protected void _contexteIconeNom(Couverture<String> c) {
			c.o("user-cog");
	}
}
