package org.computate.site.frFR.ecrivain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.vertx.AppliSwagger2;

/**
 * Traduire: false
 */ 
public class ApiEcrivain extends ApiEcrivainGen<Object> implements Comparable<ApiEcrivain> {       

	/**
	 * 
	 * {@inheritDoc}
	 **/
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	protected void _classeDocumentSolr(Couverture<SolrDocument> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiMethode(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _openApiVersion(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _appSwagger2(Couverture<AppliSwagger2> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeUris(Couverture<List<String>> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _openApiVersionNumero(Couverture<Integer> c) {
		c.o((int)Double.parseDouble(StringUtils.substringBefore(openApiVersion, ".")));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _tabsSchema(Couverture<Integer> c) {
		if(openApiVersionNumero == 2)
			c.o(1);
		else
			c.o(2);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _tabsReponses(Couverture<Integer> c) {
		if(StringUtils.equals(openApiVersion, "2.0"))
			c.o(0);
		else
			c.o(2);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wChemins(Couverture<ToutEcrivain> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wCorpsRequetes(Couverture<ToutEcrivain> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wSchemas(Couverture<ToutEcrivain> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _siteContexte(Couverture<SiteContexteFrFR> c) {
		c.o(requeteSite_.getSiteContexte_());
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _configSite(Couverture<ConfigSite> c) {
		c.o(requeteSite_.getConfigSite_());
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wRequeteEnTete(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wRequeteDescription(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wReponseDescription(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wRequeteCorps(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wReponseCorps(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wRequeteSchema(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _wReponseSchema(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, "  "));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _ecrivains(Couverture<TousEcrivains> c) {
		c.o(TousEcrivains.creer(requeteSite_));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiTag(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiTag_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeEtendBase(Couverture<Boolean> c) {
		c.o((Boolean)classeDocumentSolr.get("classeEtendBase_stored_boolean"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeEstBase(Couverture<Boolean> c) {
		c.o((Boolean)classeDocumentSolr.get("classeEstBase_stored_boolean"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeNomSimple(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeNomSimple_frFR_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeCheminAbsolu(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeCheminAbsolu_frFR_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiUriMethode(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiUri" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiMethodeMethode(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiMethode" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiTypeMedia200Methode(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiTypeMedia200" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiOperationIdMethode(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiOperationId" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiOperationIdMethodeRequete(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiOperationId" + classeApiMethode + "Requete_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeApiOperationIdMethodeReponse(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeApiOperationId" + classeApiMethode + "Reponse_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeSuperApiOperationIdMethodeRequete(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeSuperApiOperationId" + classeApiMethode + "Requete_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeSuperApiOperationIdMethodeReponse(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classeSuperApiOperationId" + classeApiMethode + "Reponse_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeMotsClesTrouves(Couverture<Boolean> c) {
		c.o((Boolean)classeDocumentSolr.get("classeMotsClesTrouves_stored_boolean"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeMotsCles(Couverture<List<String>> c) {
		List<String> o = (List<String>)classeDocumentSolr.get("classeMotsCles_stored_strings");
		if(o == null)
			o = new ArrayList<>();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classeRolesTrouves(Couverture<Boolean> c) {
		c.o((Boolean)classeDocumentSolr.get("classeRolesTrouves_stored_boolean"));
	}

	/**
	 * {@inheritDoc}
	 **/ 
	protected void _classeRoles(Couverture<List<String>> c) {
		List<String> o = (List<String>)classeDocumentSolr.get("classeRoles_stored_strings");
		if(o == null)
			o = new ArrayList<>();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classePageLangueNom(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classePageLangueNom" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _classePageNomSimple(Couverture<String> c) {
		c.o((String)classeDocumentSolr.get("classePageNomSimple" + classeApiMethode + "_stored_string"));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _langueNom(Couverture<String> c) {
		String o = "frFR";
		if(classePageLangueNom != null) {
			o = classePageLangueNom;
		}
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _entiteDocumentSolr(Couverture<SolrDocument> c) {
	}

	/**
	 */
	String entiteVar;

	/**
	 */
	String entiteNomCanonique;

	/**
	 */
	String entiteNomCanoniqueGenerique;

	/**
	 */
	String entiteVarApi;

	/**
	 */
	String entiteDescription;

	/**
	 */
	String entiteNomAffichage;

	/**
	 */
	Integer entiteLongeurMin;

	/**
	 */
	Integer entiteLongeurMax;

	/**
	 */
	Double entiteMin;

	/**
	 */
	Double entiteMax;

	/**
	 */
	Boolean entiteOptionnel;

	/**
	 */
	String entiteVarCapitalise;

	/**
	 */
	String entiteTypeJson;

	/**
	 */
	String entiteListeTypeJson;

	/**
	 */
	String entiteFormatJson;

	/**
	 */
	Boolean entiteClePrimaire;

	/**
	 */
	Boolean entiteStocke;

	/**
	 */
	Boolean entiteIndexe;

	/**
	 */
	Boolean entiteMotsClesTrouves;

	/**
	 */
	List<String> entiteMotsCles;

	/**
	 */
	List<String> entiteOptionsVar;

	/**
	 */
	List<String> entiteOptionsDescription;

	/**
	 */
	public void initEntite(SolrDocument entiteDocumentSolr) {
		setEntiteDocumentSolr(entiteDocumentSolr);
		entiteVar = (String)entiteDocumentSolr.get("entiteVar_frFR_stored_string");
		entiteVarApi = StringUtils.defaultIfBlank((String)entiteDocumentSolr.get("entiteVarApi_stored_string"), entiteVar);
		entiteMotsClesTrouves = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMotsClesTrouves_stored_boolean"));
		entiteMotsCles = (List<String>)entiteDocumentSolr.get("entiteMotsCles_stored_strings");
		if(entiteMotsCles == null)
			entiteMotsCles = new ArrayList<>();
		entiteNomCanoniqueGenerique = (String)entiteDocumentSolr.get("entiteNomCanoniqueGenerique_frFR_stored_string");
		entiteNomCanonique = (String)entiteDocumentSolr.get("entiteNomCanonique_frFR_stored_string");
		entiteListeTypeJson = (String)entiteDocumentSolr.get("entiteListeTypeJson_stored_string");
		entiteTypeJson = (String)entiteDocumentSolr.get("entiteTypeJson_stored_string");
		entiteFormatJson = (String)entiteDocumentSolr.get("entiteFormatJson_stored_string");
		entiteOptionsVar = (List<String>)entiteDocumentSolr.get("entiteOptionsVar_stored_strings");
		entiteOptionsDescription = (List<String>)entiteDocumentSolr.get("entiteOptionsDescription_stored_strings");
		entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_stored_string");
	}

	/**
	 */
	public void ecrireEntiteEnTete() throws Exception {

		if(entiteMotsCles.contains(classeApiMethode + ".header")) {
			wRequeteEnTete.tl(4, "- name: ", entiteVarApi);
			wRequeteEnTete.tl(5, "in: header");
			wRequeteEnTete.t(5, "description: ").yamlStr(6, entiteDescription);
			if(entiteMotsCles.contains(classeApiMethode + ".header.required"))
				wRequeteEnTete.tl(5, "required: true");
			wRequeteEnTete.tl(5, "type: ", entiteTypeJson);
		}
	}

	public void ecrireEntiteDescription(Integer nombreTabulations) throws Exception {
		ecrireEntiteDescription(nombreTabulations, wRequeteDescription, "requete");
		ecrireEntiteDescription(nombreTabulations, wReponseDescription, "reponse");
	}

	public void ecrireEntiteDescription(Integer nombreTabulations, ToutEcrivain w, String apiRequeteOuReponse) throws Exception {
		nombreTabulations = nombreTabulations == null ? 0 : nombreTabulations;
		
		if(
				entiteMotsCles.contains("apiModelEntity")
				|| entiteMotsCles.contains(classeApiMethode + "." + apiRequeteOuReponse)
				) {
			w.l();
			w.t(nombreTabulations, "- " + entiteVar);
			if(StringUtils.isNotBlank(entiteNomAffichage))
				w.s(" (" + entiteNomAffichage + ")");
			w.l(": ");
			ToutEcrivain wDescription = ToutEcrivain.creer(requeteSite_, "  ");
			if(StringUtils.isNotBlank(entiteDescription))
				wDescription.l(entiteDescription);
			if(BooleanUtils.isTrue(entiteOptionnel))
				wDescription.tl(nombreTabulations + 1, "- optional: ", entiteOptionnel);
			if(entiteLongeurMin != null)
				wDescription.tl(nombreTabulations + 1, "- min length: ", entiteLongeurMin);
			if(entiteLongeurMax != null)
				wDescription.tl(nombreTabulations + 1, "- max length: ", entiteLongeurMax);
			if(entiteMin != null)
				wDescription.tl(nombreTabulations + 1, "- min: ", entiteMin);
			if(entiteMax != null)
				wDescription.tl(nombreTabulations + 1, "- max: ", entiteMax);
			if(entiteOptionsVar != null && entiteOptionsDescription != null && entiteOptionsVar.size() > 0 && entiteOptionsDescription.size() == entiteOptionsVar.size()) {
				wDescription.tl(nombreTabulations + 1, "- enum:");
				for(int m = 0; m < entiteOptionsVar.size(); m++) {
					wDescription.tl(nombreTabulations + 2, "- " + entiteOptionsVar.get(m) + ": " + entiteOptionsDescription.get(m));
				}
			}
			if(entiteMotsCles.contains("apiModel")) {
				SolrQuery rechercheEntites = new SolrQuery();
				rechercheEntites.setQuery("*:*");
				rechercheEntites.setRows(1000000);
				rechercheEntites.addFilterQuery("appPath_indexed_string:" + ClientUtils.escapeQueryChars(configSite.getAppliChemin()));

				if(StringUtils.isBlank(entiteNomCanoniqueGenerique))
					rechercheEntites.addFilterQuery("classCanonicalName_enUS_indexed_string:" + ClientUtils.escapeQueryChars(entiteNomCanonique));
				else
					rechercheEntites.addFilterQuery("classCanonicalName_enUS_indexed_string:" + ClientUtils.escapeQueryChars(entiteNomCanoniqueGenerique));

				rechercheEntites.addFilterQuery("entiteMotsCles_indexed_strings:" + ClientUtils.escapeQueryChars("apiModelEntity"));
				rechercheEntites.addFilterQuery("partIsEntity_indexed_boolean:true");
				rechercheEntites.addSort("partNumber_indexed_int", ORDER.asc);
				QueryResponse rechercheEntitesReponse = siteContexte.getClientSolrComputate().query(rechercheEntites);
				SolrDocumentList rechercheEntitesResultats = rechercheEntitesReponse.getResults();
				Integer rechercheEntitesLignes = rechercheEntites.getRows();

				if(rechercheEntitesResultats.size() > 0) {
					for(Long k = rechercheEntitesResultats.getStart(); k < rechercheEntitesResultats.getNumFound(); k+=rechercheEntitesLignes) {
						for(Integer l = 0; l < rechercheEntitesResultats.size(); l++) {
							SolrDocument entiteDocumentSolr = rechercheEntitesResultats.get(l);
							String entiteVarAncien = entiteVar;
							String entiteVarApiAncien = entiteVarApi;
							Boolean entiteMotsClesTrouvesAncien = entiteMotsClesTrouves;
							List<String> entiteMotsClesAncien = entiteMotsCles;
							String entiteNomCanoniqueGeneriqueAncien = entiteNomCanoniqueGenerique;
							String entiteNomCanoniqueAncien = entiteNomCanonique;
							String entiteListeTypeJsonAncien = entiteListeTypeJson;
							String entiteTypeJsonAncien = entiteTypeJson;
							String entiteFormatJsonAncien = entiteFormatJson;
							List<String> entiteOptionsVarAncien = entiteOptionsVar;
							List<String> entiteOptionsDescriptionAncien = entiteOptionsDescription;
							String entiteDescriptionAncien = entiteDescription;
							
							entiteVar = (String)entiteDocumentSolr.get("entiteVar_enUS_stored_string");
							entiteVarApi = StringUtils.defaultIfBlank((String)entiteDocumentSolr.get("entiteVarApi_stored_string"), entiteVar);
							entiteMotsClesTrouves = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMotsClesTrouves_stored_boolean"));
							entiteMotsCles = (List<String>)entiteDocumentSolr.get("entiteMotsCles_stored_strings");
							if(entiteMotsCles == null)
								entiteMotsCles = new ArrayList<>();
							entiteNomCanoniqueGenerique = (String)entiteDocumentSolr.get("entiteNomCanoniqueGenerique_enUS_stored_string");
							entiteNomCanonique = (String)entiteDocumentSolr.get("entiteNomCanonique_enUS_stored_string");
							entiteListeTypeJson = (String)entiteDocumentSolr.get("entiteListeTypeJson_stored_string");
							entiteTypeJson = (String)entiteDocumentSolr.get("entiteTypeJson_stored_string");
							entiteFormatJson = (String)entiteDocumentSolr.get("entiteFormatJson_stored_string");
							entiteOptionsVar = (List<String>)entiteDocumentSolr.get("entiteOptionsVar_stored_strings");
							entiteOptionsDescription = (List<String>)entiteDocumentSolr.get("entiteOptionsDescription_stored_strings");
							entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_stored_string");
	
							ecrireEntiteDescription(nombreTabulations + 3, w, apiRequeteOuReponse);
//							if(entiteCanonicalNameGeneric == null) {
//								writeEntityDescription(tabStep + 3, w, classeApiMethode, apiRequeteOuReponse);
//							}
//							else {
//								writeEntityDescription(tabStep + 5, w, classeApiMethode, apiRequeteOuReponse);
//							}
							
							entiteVar = entiteVarAncien;
							entiteVarApi = entiteVarApiAncien;
							entiteMotsClesTrouves = entiteMotsClesTrouvesAncien;
							entiteMotsCles = entiteMotsClesAncien;
							entiteNomCanoniqueGenerique = entiteNomCanoniqueGeneriqueAncien;
							entiteNomCanonique = entiteNomCanoniqueAncien;
							entiteListeTypeJson = entiteListeTypeJsonAncien;
							entiteTypeJson = entiteTypeJsonAncien;
							entiteFormatJson = entiteFormatJsonAncien;
							entiteOptionsVar = entiteOptionsVarAncien;
							entiteOptionsDescription = entiteOptionsDescriptionAncien;
							entiteDescription = entiteDescriptionAncien;
						}
					}
				}
			}
			w.s(StringUtils.trim(wDescription.toString()));
		}
	}

	public void ecrireEntiteSchema(Integer nombreTabulations) throws Exception {
		ecrireEntiteSchema(nombreTabulations, wRequeteSchema, "requete");
		ecrireEntiteSchema(nombreTabulations, wReponseSchema, "reponse");
	}

	/**
	 */
	public void ecrireEntiteSchema(Integer nombreTabulations, ToutEcrivain w, String apiRequeteOuReponse) throws Exception {
		nombreTabulations = nombreTabulations == null ? (classeApiMethode.contains("Recherche") && "reponse".equals(apiRequeteOuReponse) ? 1 : 0) : nombreTabulations;
		if(
				entiteTypeJson != null
//				entiteMotsCles.contains("apiModeleEntite")
//				|| entiteMotsCles.contains(classeApiMethode + "." + apiRequeteOuReponse)
				) {
//		if(classeMotsClesTrouves && entiteMotsClesTrouves && (
//				entiteMotsCles.contains("apiModeleEntite")
//				|| entiteMotsCles.contains(classeApiMethode + "." + apiRequeteOuReponse)
//				)) {
//			if(entiteMotsClesTrouves && entiteMotsCles.contains("apiModel")) {
//				SolrQuery searchEntities = new SolrQuery();
//				searchEntities.setQuery("*:*");
//				searchEntities.setRows(1000000);
//				searchEntities.addFilterQuery("appliChemin_indexed_string:" + ClientUtils.escapeQueryChars(configSite.getAppliChemin()));
//
//				if(StringUtils.isBlank(entiteNomCanoniqueGenerique))
//					searchEntities.addFilterQuery("classeNomCanonique_frFR_indexed_string:" + ClientUtils.escapeQueryChars(entiteNomCanonique));
//				else
//					searchEntities.addFilterQuery("classNomCanonique_frFR_indexed_string:" + ClientUtils.escapeQueryChars(entiteNomCanoniqueGenerique));
//
//				searchEntities.addFilterQuery("entiteMotsCles_indexed_strings:" + ClientUtils.escapeQueryChars("apiModelEntity"));
//				searchEntities.addFilterQuery("partEstEntite_indexed_boolean:true");
//				searchEntities.addSort("partNumero_indexed_int", ORDER.asc);
//				QueryResponse searchEntitiesResponse = siteContexte.getClientSolrComputate().query(searchEntities);
//				SolrDocumentList searchEntitiesResults = searchEntitiesResponse.getResults();
//				Integer searchEntitiesLignes = searchEntities.getRows();
//
//				if(searchEntitiesResults.size() > 0) {
//					if(entiteNomCanoniqueGenerique == null) {
//						w.tl(6 + nombreTabulations, "type: object");
//						w.tl(6 + nombreTabulations, "properties:");
//					}
//					else {
//						w.tl(6 + nombreTabulations, "type: array");
//						w.tl(6 + nombreTabulations, "items:");
//						w.tl(7 + nombreTabulations, "type: object");
//						w.tl(7 + nombreTabulations, "properties:");
//					}
//					for(Long k = searchEntitiesResults.getStart(); k < searchEntitiesResults.getNumFound(); k+=searchEntitiesLignes) {
//						for(Integer l = 0; l < searchEntitiesResults.size(); l++) {
//							SolrDocument entiteDocumentSolr = searchEntitiesResults.get(l);
//							String entiteVarAncien = entiteVar;
//							String entiteVarApiAncien = entiteVarApi;
//							Boolean entiteMotsClesTrouvesAncien = entiteMotsClesTrouves;
//							List<String> entiteMotsClesAncien = entiteMotsCles;
//							String entiteCanonicalNameGenericAncien = entiteNomCanoniqueGenerique;
//							String entiteCanonicalNameAncien = entiteNomCanonique;
//							String entiteListeJsonTypeAncien = entiteListeTypeJson;
//							String entiteJsonTypeAncien = entiteTypeJson;
//							String entiteJsonFormatAncien = entiteFormatJson;
//							List<String> entiteOptionsVarAncien = entiteOptionsVar;
//							List<String> entiteOptionsValueurAncien = entiteOptionsDescription;
//							String entiteDescriptionAncien = entiteDescription;
//
//							entiteVar = (String)entiteDocumentSolr.get("entiteVar_enUS_stored_string");
//							entiteVarApi = StringUtils.defaultIfBlank((String)entiteDocumentSolr.get("entiteVarApi_stored_string"), entiteVar);
//							entiteMotsClesTrouves = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMotsClesTrouves_stored_boolean"));
//							entiteMotsCles = (List<String>)entiteDocumentSolr.get("entiteMotsCles_stored_strings");
//							entiteNomCanoniqueGenerique = (String)entiteDocumentSolr.get("entiteNomCanoniqueGenerique_enUS_stored_string");
//							entiteNomCanonique = (String)entiteDocumentSolr.get("entiteNomCanonique_enUS_stored_string");
//							entiteListeTypeJson = (String)entiteDocumentSolr.get("entiteListeTypeJson_stored_string");
//							entiteTypeJson = (String)entiteDocumentSolr.get("entiteTypeJson_stored_string");
//							entiteFormatJson = (String)entiteDocumentSolr.get("entiteFormatJson_stored_string");
//							entiteOptionsVar = (List<String>)entiteDocumentSolr.get("entiteOptionsVar_stored_strings");
//							entiteOptionsDescription = (List<String>)entiteDocumentSolr.get("entiteOptionsDescription_stored_strings");
//							entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_stored_string");
//
//							if(entiteNomCanoniqueGenerique == null) {
//								ecrireEntiteSchema(nombreTabulations + 3, w, apiRequeteOuReponse);
//							}
//							else {
//								ecrireEntiteSchema(nombreTabulations + 5, w, apiRequeteOuReponse);
//							}
//
//							entiteVar = entiteVarAncien;
//							entiteVarApi = entiteVarApiAncien;
//							entiteMotsClesTrouves = entiteMotsClesTrouvesAncien;
//							entiteMotsCles = entiteMotsClesAncien;
//							entiteNomCanoniqueGenerique = entiteCanonicalNameGenericAncien;
//							entiteNomCanonique = entiteCanonicalNameAncien;
//							entiteListeTypeJson = entiteListeJsonTypeAncien;
//							entiteTypeJson = entiteJsonTypeAncien;
//							entiteFormatJson = entiteJsonFormatAncien;
//							entiteOptionsVar = entiteOptionsVarAncien;
//							entiteOptionsDescription = entiteOptionsValueurAncien;
//							entiteDescription = entiteDescriptionAncien;
//						}
//					}
//				}
//			}
//			else {

				w.tl(4 + tabsSchema + nombreTabulations, entiteVarApi, ":");
				w.tl(5 + tabsSchema + nombreTabulations, "type: ", entiteTypeJson);
				if(entiteListeTypeJson == null && entiteOptionsVar != null && entiteOptionsDescription != null && entiteOptionsVar.size() > 0 && entiteOptionsDescription.size() == entiteOptionsVar.size()) {
					w.tl(5 + tabsSchema + nombreTabulations, "enum:");
					for(String entiteOptionVar : entiteOptionsVar) {
						w.tl(6 + tabsSchema + nombreTabulations, "- ", entiteOptionVar);
						
					}
				}
				if(entiteListeTypeJson != null) {
					w.tl(5 + tabsSchema + nombreTabulations, "items:");
					w.tl(6 + tabsSchema + nombreTabulations, "type: ", entiteListeTypeJson);
					if(entiteOptionsVar != null && entiteOptionsDescription != null && entiteOptionsVar.size() > 0 && entiteOptionsDescription.size() == entiteOptionsVar.size()) {
						w.tl(6 + tabsSchema + nombreTabulations, "enum:");
						for(String entiteOptionVar : entiteOptionsVar) {
							w.tl(7 + tabsSchema + nombreTabulations, "- ", entiteOptionVar);
						}
					}
				}
				if(StringUtils.isNotBlank(entiteDescription))
					w.t(5 + tabsSchema + nombreTabulations, "description: ").yamlStr(7 + nombreTabulations, "- " + entiteDescription);
				if(entiteFormatJson != null)
					w.tl(5 + tabsSchema + nombreTabulations, "format: ", entiteFormatJson);
//			}
		}
	}

	public void ecrireApi() throws Exception {

		if(!classeUris.contains(classeApiUriMethode)) {
			wChemins.tl(1, classeApiUriMethode, ":");
			classeUris.add(classeApiUriMethode);
		}

		wChemins.tl(2, StringUtils.lowerCase(classeApiMethodeMethode), ":");
		wChemins.tl(3, "operationId: ", classeApiOperationIdMethode);
		wChemins.tl(3, "x-vertx-event-bus: ", langueNom, classeNomSimple);

		if(classeRolesTrouves) {
			wChemins.tl(3, "security:");
			wChemins.tl(4, "- openIdConnect:");
			for(String classeRole : classeRoles)
				wChemins.tl(5, "- ", classeRole);
		}

		wChemins.t(3, "description: ").yamlStr(4, "");
		wChemins.t(3, "summary: ").yamlStr(4, "");
		if(StringUtils.isNotBlank(classeApiTag)) {
			wChemins.tl(3, "tags:");
			wChemins.tl(4, "- ", classeApiTag);
		}

		if(openApiVersionNumero == 2) {
			wChemins.tl(3, "produces:");
			wChemins.tl(4, "- ", classeApiTypeMedia200Methode);
		}

		if(!wRequeteEnTete.getVide() || "GET".equals(classeApiMethodeMethode) || "DELETE".equals(classeApiMethodeMethode) || "PUT".equals(classeApiMethodeMethode)) {
			wChemins.tl(3, "parameters:");
			wChemins.s(wRequeteEnTete);
			if("GET".equals(classeApiMethode) || "DELETE".equals(classeApiMethodeMethode) || "PUT".equals(classeApiMethodeMethode)) {
				wChemins.tl(4, "- name: id");
				wChemins.tl(5, "in: path");
				wChemins.t(5, "description: ").yamlStr(6, "");
				wChemins.tl(5, "required: true");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: string");
			}
			else if(classeApiMethode.contains("Recherche")) {
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: q");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: string");
				wChemins.tl(6, "default: '*:*'");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: pageRecapituler");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: boolean");
				wChemins.tl(6, "default: false");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: fq");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: array");
				wChemins.tl(6, "items:");
				wChemins.tl(7, "  type: string");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: fl");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: string");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: sort");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: array");
				wChemins.tl(6, "items:");
				wChemins.tl(7, "  type: string");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: start");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: integer");
				wChemins.tl(6, "default: 0");
				wChemins.tl(6, "minimum: 0");
				wChemins.tl(4, "- in: query");
				wChemins.tl(5, "name: rows");
				wChemins.tl(5, "description: ''");
				wChemins.tl(5, "required: false");
				wChemins.tl(5, "schema:");
				wChemins.tl(6, "type: integer");
				wChemins.tl(6, "default: 10");
				wChemins.tl(6, "minimum: 1");
			}
		}

		if(openApiVersionNumero > 2) {
			if(!classeApiMethodeMethode.contains("GET") && !classeApiMethodeMethode.contains("DELETE")) {
				wChemins.tl(3, "requestBody:");
				String strRequeteDescription = wRequeteDescription.toString();
				wChemins.t(4, "description: ").yamlStr(5, StringUtils.trim(strRequeteDescription));
				wChemins.tl(4, "required: true");
				wChemins.tl(4, "content:");
				wChemins.tl(5, "application/json:");
				wChemins.tl(6, "schema:");
				wChemins.tl(7, "$ref: '#/components/requestBodies/", classeApiOperationIdMethodeRequete, "'");
			}
		}
		else {
			wChemins.tl(4, "- name: \"", classeApiOperationIdMethodeRequete, "\"");
			wChemins.tl(5, "in: body");

			String strRequeteDescription = wRequeteDescription.toString();
//			if(StringUtils.isNotBlank(StringUtils.trim(strRequeteDescription)))
				wChemins.t(5, "description: ").yamlStr(6, StringUtils.trim(strRequeteDescription));
//			else
//				wChemins.tl(5, "description: ''");
			
			wChemins.tl(5, "schema:");
			wChemins.tl(6, "$ref: '#/components/requestBodies/", classeApiOperationIdMethodeRequete, "'");
		}

		wChemins.tl(3, "responses:");
		wChemins.tl(4, "'200':");
		if(openApiVersionNumero > 2) {
			String strReponseDescription = wReponseDescription.toString();
			wChemins.t(5, "description: ").yamlStr(6, strReponseDescription);
			wChemins.tl(5, "content:");
			wChemins.tl(6, classeApiTypeMedia200Methode, "; charset=utf-8:");
		}
		else {
	
			String strReponseDescription = wReponseDescription.toString();
	//		if(StringUtils.isNotBlank(StringUtils.trim(strReponseDescription)))
				wChemins.t(5 + tabsReponses, "description: ").yamlStr(6, strReponseDescription);
	//		else
	//			wChemins.tl(5, "description: ''");
		}

		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/", classeApiOperationIdMethodeReponse, "'");
		wChemins.tl(4, "'400':");
		if(openApiVersionNumero > 2) {
			wChemins.t(5, "description: ").yamlStr(6 + tabsReponses, "<table><table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>error</td><td>invalidRequest</td><td>Missing or invalid Parameters</td></tr></table>");
			wChemins.tl(5, "content:").tl(6, "application/json:");
		}
		else {
			wChemins.t(5 + tabsReponses, "description: ").yamlStr(6 + tabsReponses, "<table><table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>error</td><td>invalidRequest</td><td>Missing or invalid Parameters</td></tr></table>");
		}
		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/ErrorResponse'");
		wChemins.tl(4, "'401':");
		if(openApiVersionNumero > 2) {
			wChemins.t(5, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>error</td><td>unAuthorized</td><td>Authorization credentials are missing or invalid</td></tr></table>");
			wChemins.tl(5, "content:").tl(6, "application/json:");
		}
		else {
			wChemins.t(5 + tabsReponses, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>error</td><td>unAuthorized</td><td>Authorization credentials are missing or invalid</td></tr></table>");
		}
		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/ErrorResponse'");
		wChemins.tl(4, "'403':");
		if(openApiVersionNumero > 2) {
			wChemins.t(5, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td><td>More Info</td></tr><tr><td>error</td><td>accessNotConfigured</td><td>The request operation is not configured to access this resource</td><td>Channel/Country/Business provided in the request is not supported currently</td></tr></table>");
			wChemins.tl(5, "content:").tl(6, "application/json:");
		}
		else {
			wChemins.t(5 + tabsReponses, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td><td>More Info</td></tr><tr><td>error</td><td>accessNotConfigured</td><td>The request operation is not configured to access this resource</td><td>Channel/Country/Business provided in the request is not supported currently</td></tr></table>");
		}
		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/ErrorResponse'");
		wChemins.tl(4, "'404':");
		if(openApiVersionNumero > 2) {
			wChemins.t(5, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td><td>More Info</td></tr><tr><td>error</td><td>resourceNotFound</td><td>The requested resource was not found</td><td>Empty resource/resource not found</td></tr></table>");
			wChemins.tl(5, "content:").tl(6, "application/json:");
		}
		else {
			wChemins.t(5 + tabsReponses, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td><td>More Info</td></tr><tr><td>error</td><td>resourceNotFound</td><td>The requested resource was not found</td><td>Empty resource/resource not found</td></tr></table>");
		}
		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/ErrorResponse'");
		wChemins.tl(4, "'500':");
		if(openApiVersionNumero > 2) {
			wChemins.t(5, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>fatal</td><td>serverUnavailable</td><td>The request failed due to an internal error/server unavailability</td></tr></table>");
			wChemins.tl(5, "content:").tl(6, "application/json:");
		}
		else {
			wChemins.t(5 + tabsReponses, "description: ").yamlStr(6 + tabsReponses, "<table><tr><td>Type</td><td>Code</td><td>Details</td></tr><tr><td>fatal</td><td>serverUnavailable</td><td>The request failed due to an internal error/server unavailability</td></tr></table>");
		}
		wChemins.tl(5 + tabsReponses, "schema:");
		wChemins.tl(6 + tabsReponses, "$ref: '#/components/requestBodies/ErrorResponse'");

		if(openApiVersionNumero > 2) {
			if(!"GET".equals(classeApiMethodeMethode) && !"DELETE".equals(classeApiMethodeMethode)) {
				wCorpsRequetes.tl(2, classeApiOperationIdMethodeRequete, ":");
				wCorpsRequetes.tl(3, "content:");
				wCorpsRequetes.tl(4, "application/json:");
				wCorpsRequetes.tl(5, "schema:");
				wCorpsRequetes.tl(6, "$ref: '#/components/schemas/", classeApiOperationIdMethodeRequete, "'");
			}
			wCorpsRequetes.tl(2, classeApiOperationIdMethodeReponse, ":");
			wCorpsRequetes.tl(3, "content:");
			wCorpsRequetes.tl(4, classeApiTypeMedia200Methode, "; charset=utf-8:");
			wCorpsRequetes.tl(5, "schema:");
			wCorpsRequetes.tl(6, "$ref: '#/components/schemas/", classeApiOperationIdMethodeReponse, "'");
		}

		if(!"GET".equals(classeApiMethodeMethode) && !"DELETE".equals(classeApiMethodeMethode)) {
//		if(classeMotsClesTrouves && classeMotsCles.contains(classeApiMethode + ".request")) {
			wSchemas.tl(tabsSchema, classeApiOperationIdMethodeRequete, ":");
			wSchemas.tl(tabsSchema + 1, "allOf:");
			if(BooleanUtils.isTrue(classeEtendBase)) {
				wSchemas.tl(tabsSchema + 2, "- $ref: \"#/components/schemas/", classeSuperApiOperationIdMethodeRequete, "\"");
			}
			wSchemas.tl(tabsSchema + 2, "- type: object");
			wSchemas.tl(tabsSchema + 3, "properties:");
			wSchemas.s(wRequeteSchema.toString());
		}

//		if(classeMotsClesTrouves && classeMotsCles.contains(classeApiMethode + ".response")) {
			wSchemas.tl(tabsSchema, classeApiOperationIdMethodeReponse, ":");
			wSchemas.tl(tabsSchema + 1, "allOf:");
			if("text/html".equals(classeApiTypeMedia200Methode)) {
				wSchemas.tl(tabsSchema + 2, "- type: string");
			}
			else {
				if(BooleanUtils.isTrue(classeEtendBase)) {
					wSchemas.tl(tabsSchema + 2, "- $ref: \"#/components/schemas/", classeSuperApiOperationIdMethodeReponse, "\"");
				}
	
				if(classeApiMethode.contains("Recherche")) {
					wSchemas.tl(tabsSchema + 2, "- type: array");
					wSchemas.tl(tabsSchema + 3, "items:");
					wSchemas.tl(tabsSchema + 4, "type: object");
					wSchemas.tl(tabsSchema + 4, "properties:");
				}
				else {
					wSchemas.tl(tabsSchema + 2, "- type: object");
					wSchemas.tl(tabsSchema + 3, "properties:");
				}
				wSchemas.s(wReponseSchema.toString());
			}
//		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/ 
	@Override public int compareTo(ApiEcrivain o) {
		return ObjectUtils.compare(classeApiUriMethode, o.getClasseApiUriMethode());
	}


}
