package org.computate.site.frfr.recherche;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrQuery.SortClause;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.CursorMarkParams;
import org.apache.solr.common.params.FacetParams;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.common.util.SimpleOrderedMap;
import org.computate.site.frfr.config.ConfigCles;
import org.computate.site.frfr.couverture.Couverture;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.computate.site.frfr.utilisateur.UtilisateurSite;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

/**
 * MotCle: classeNomSimpleListeRecherche
 */  
public class ListeRecherche<DEV> extends ListeRechercheGen<DEV> {

	/**  
	 * {@inheritDoc}
	 * 
	 **/
	protected void _c(Couverture<Class<DEV>> c) {
		
	}

	/**
	 * Ignorer: true
	 */
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	/**
	 */
	protected void _stocker(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 */
	protected void _peupler(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 */
	protected void _fields(List<String> c) {
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _solrQuery(SolrQuery o) {
	}

	public DEV get(Integer index) {
		return list.get(index);
	}

	/**
	 */
	public Future<Boolean> next() {
		Promise<Boolean> promise = Promise.promise();
		try {
			Long start = Optional.ofNullable(getSolrDocumentList()).map(l -> l.getStart()).orElse(0L);
			Integer rows = Optional.ofNullable(getRows()).orElse(0);
			Long numFound = Optional.ofNullable(getSolrDocumentList()).map(l -> l.getNumFound()).orElse(0L);
			if(rows > 0 && (start + rows) < numFound) {
				setStart(start.intValue() + rows);
				String solrHostName = requeteSite_.getConfig().getString(ConfigCles.SOLR_HOST_NAME);
				Integer solrPort = requeteSite_.getConfig().getInteger(ConfigCles.SOLR_PORT);
				String solrCollection = requeteSite_.getConfig().getString(ConfigCles.SOLR_COLLECTION);
				String solrRequestUri = String.format("/solr/%s/select%s", solrCollection, solrQuery.toQueryString());
				requeteSite_.getClientWeb().get(solrPort, solrHostName, solrRequestUri).send().onSuccess(a -> {
					JsonObject json = a.bodyAsJsonObject();
					Map<String, Object> map = json.getMap();
					QueryResponse r = generateSolrQueryResponse(map);
					setQueryResponse(r);
					Couverture<SolrDocumentList> solrDocumentListCouverture = new Couverture<SolrDocumentList>().var("solrDocumentList").o(solrDocumentList);
					_solrDocumentList(solrDocumentListCouverture);
					setSolrDocumentList(solrDocumentListCouverture.o);
					list.clear();
					_list(list);

					promise.complete(true);
				}).onFailure(ex -> {
					LOG.error(String.format("Search failed. "), ex);
					promise.fail(ex);
				});
			} else {
				promise.complete(false);
			}
		} catch (Exception ex) {
			promise.fail(ex);
			LOG.error(String.format("Solr search failed. "), ex);
		}
		return promise.future();
	}

	public Future<Boolean> query() {
		Promise<Boolean> promise = Promise.promise();
		try {
			String solrHostName = requeteSite_.getConfig().getString(ConfigCles.SOLR_HOST_NAME);
			Integer solrPort = requeteSite_.getConfig().getInteger(ConfigCles.SOLR_PORT);
			String solrCollection = requeteSite_.getConfig().getString(ConfigCles.SOLR_COLLECTION);
			String solrRequestUri = String.format("/solr/%s/select%s", solrCollection, solrQuery.toQueryString());
			requeteSite_.getClientWeb().get(solrPort, solrHostName, solrRequestUri).send().onSuccess(a -> {
				JsonObject json = a.bodyAsJsonObject();
				Map<String, Object> map = json.getMap();
				QueryResponse r = generateSolrQueryResponse(map);
				setQueryResponse(r);
				Couverture<SolrDocumentList> solrDocumentListCouverture = new Couverture<SolrDocumentList>().var("solrDocumentList").o(solrDocumentList);
				_solrDocumentList(solrDocumentListCouverture);
				setSolrDocumentList(solrDocumentListCouverture.o);
				list.clear();
				_list(list);

				promise.complete(true);
			}).onFailure(ex -> {
				promise.fail(ex);
				LOG.error(String.format("Solr search failed. "), ex);
			});
		} catch (Exception ex) {
			promise.fail(ex);
			LOG.error(String.format("Solr search failed. "), ex);
		}
		return promise.future();
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _queryResponse(Promise<QueryResponse> promise) {
		try {
			if(this.c != null)
				solrQuery.addFilterQuery("classeNomCanonique_indexedstored_string:" + ClientUtils.escapeQueryChars(this.c.getCanonicalName()));
			UtilisateurSite utilisateurSite = requeteSite_.getUtilisateurSite_();
			if(utilisateurSite == null || BooleanUtils.isNotTrue(utilisateurSite.getSeeDeleted()))
				solrQuery.addFilterQuery("deleted_indexedstored_boolean:false");
			if(utilisateurSite == null || BooleanUtils.isNotTrue(utilisateurSite.getSeeArchived()))
				solrQuery.addFilterQuery("archived_indexedstored_boolean:false");
			if(solrQuery.getQuery() != null) {
				String solrHostName = requeteSite_.getConfig().getString(ConfigCles.SOLR_HOST_NAME);
				Integer solrPort = requeteSite_.getConfig().getInteger(ConfigCles.SOLR_PORT);
				String solrCollection = requeteSite_.getConfig().getString(ConfigCles.SOLR_COLLECTION);
				String solrRequestUri = String.format("/solr/%s/select%s", solrCollection, solrQuery.toQueryString());
				requeteSite_.getClientWeb().get(solrPort, solrHostName, solrRequestUri).send().onSuccess(a -> {
					try {
						JsonObject json = a.bodyAsJsonObject();
						Map<String, Object> map = json.getMap();
						QueryResponse r = generateSolrQueryResponse(map);
						setQueryResponse(r);
						promise.complete(r);
					} catch(Exception ex) {
						LOG.error(String.format("Could not read response from Solr: http://%s:%s%s", solrHostName, solrPort, solrRequestUri), ex);
						promise.fail(ex);
					}
				}).onFailure(ex -> {
					LOG.error(String.format("Search failed. "), new RuntimeException(ex));
					promise.fail(ex);
				});
			} else {
				promise.complete();
			}
		} catch (Exception ex) {
			promise.fail(ex);
			LOG.error(String.format("Search failed. "), ex);
		}
	}

	public QueryResponse generateSolrQueryResponse(Map<String, Object> map) {
		NamedList<Object> l = new NamedList<>();
		SolrDocumentList response = new SolrDocumentList();
		ArrayList<NamedList<Object>> clusters = new ArrayList<>();
		Map<String, NamedList<Object>> suggestInfo = new HashMap<>();
		NamedList<NamedList<Object>> terms = new NamedList<NamedList<Object>>();
		NamedList<SolrDocumentList> moreLikeThis = new NamedList<SolrDocumentList>();

		// clusters //
		clusters.addAll(Optional.ofNullable((List<Map<String, Object>>)map.get("clusters")).orElse(Arrays.asList()).stream().map(m -> new NamedList<Object>(m)).collect(Collectors.toList()));

		// suggest //
		Optional.ofNullable((Map<String, Map<String, Object>>)map.get("suggest")).orElse(new HashMap<String, Map<String, Object>>()).forEach((key, value) -> {
			suggestInfo.put(key, new NamedList<Object>(value));
		});

		// terms //
		Optional.ofNullable((Map<String, List<Object>>)map.get("terms")).orElse(new HashMap<String, List<Object>>()).forEach((key, list) -> {
			NamedList<Object> namedList1 = new NamedList<>();

			for(Integer i = 0; i < list.size(); i+=2) {
				NamedList<Object> namedList2 = new NamedList<>();
				namedList1.add((String)list.get(i), list.get(i + 1));
			}
			terms.add(key, namedList1);
		});

		// response //
		Optional.ofNullable((LinkedHashMap<String, Object>)map.get("response")).ifPresent(m -> {
			response.setStart(((Integer)m.get("start")).longValue());
			response.setNumFound(((Integer)m.get("numFound")).longValue());
			response.setMaxScore((Float)m.get("maxScore"));
			((ArrayList<LinkedHashMap<String, Object>>)m.get("docs")).stream().forEach(doc -> {
				response.add(new SolrDocument(doc));
			});
		});

		// facet_counts //
		NamedList<Object> facetCounts = new NamedList<Object>();
		Map<String, ? extends Object> facetCountsJson = (Map<String, Object>)map.get("facet_counts");
		if(facetCountsJson != null) {

			// facet_fields //
			Optional.ofNullable(facetCountsJson.get("facet_fields")).ifPresent(facetFieldsJson -> {
				NamedList<Object> facetFields = new NamedList<Object>();
				((Map<String, List<Object>>)facetFieldsJson).forEach((key1, value1) -> {
					NamedList<Object> namedList1 = new NamedList<>();
					for(Integer i = 0; i < value1.size(); i+=2) {
						namedList1.add((String)value1.get(i), value1.get(i + 1));
					}
					facetFields.add(key1, namedList1);
				});
				facetCounts.add("facet_fields", facetFields);
			});

			// terms //
			Optional.ofNullable((Map<String, List<Object>>)map.get("terms")).orElse(new HashMap<String, List<Object>>()).forEach((key, list) -> {
			});

			// facet_queries //
			Optional.ofNullable(facetCountsJson.get("facet_queries")).ifPresent(facet_queries -> {
				facetCounts.add("facet_queries", new NamedList<Object>((Map<String, ? extends Object>)facet_queries));
			});

			// facet_ranges //
			Optional.ofNullable(facetCountsJson.get("facet_ranges")).ifPresent(facetRangesJson -> {
				NamedList<Object> facetRanges = new NamedList<Object>();
				facetCounts.add("facet_ranges", facetRanges);
				((Map<String, Map<String, Object>>)facetRangesJson).forEach((key1, value1) -> {
					NamedList<Object> namedList1 = new NamedList<>();
					facetRanges.add(key1, namedList1);
					List<Object> countsJson = (List<Object>)value1.get("counts");
					NamedList<Integer> counts = new NamedList<>();
					namedList1.add("counts", counts);
					Optional.ofNullable((String)value1.get("gap")).ifPresent(gap -> {
						namedList1.add("gap", gap);
					});
					Optional.ofNullable((String)value1.get("start")).ifPresent(start -> {
						namedList1.add("start", start);
					});
					Optional.ofNullable((String)value1.get("end")).ifPresent(end -> {
						namedList1.add("end", end);
					});
					for(Integer i = 0; i < countsJson.size(); i+=2) {
						counts.add((String)countsJson.get(i), (Integer)countsJson.get(i + 1));
					}
				});
			});

			// facet_pivot //
			Optional.ofNullable((Map<String, List<Map<String, Object>>>)facetCountsJson.get("facet_pivot")).ifPresent(pivotsItem1 -> {
				NamedList<Object> facetPivots = new NamedList<Object>();
				facetCounts.add("facet_pivot", facetPivots);
				pivotsItem1.forEach((key1, pivotsJson1) -> {
					List<NamedList<Object>> pivots1 = new ArrayList<>();
					facetPivots.add(key1, pivots1);
					for(Map<String, Object> pivotJson1 : pivotsJson1) {
						generateFacetPivotResponse(pivotJson1, pivots1);
					}
				});
			});
			Optional.ofNullable(facetCountsJson.get("facet_intervals")).ifPresent(facet_intervals -> {
				facetCounts.add("facet_intervals", new NamedList<Object>((Map<String, ? extends Object>)facet_intervals));
			});
		}

		// facets //
		NamedList<Object> facets = new SimpleOrderedMap<Object>();
		Optional.ofNullable(((Map<String, ? extends Object>) map.get("facets"))).orElse(new HashMap<>())
				.forEach((key, value) -> {
					if (value instanceof LinkedHashMap) {
						LinkedHashMap<String, Object> linkedHashMap1 = (LinkedHashMap<String, Object>) value;
						SimpleOrderedMap simpleOrderedMap1 = new SimpleOrderedMap<Object>();
						facets.add(key, simpleOrderedMap1);
						ArrayList<LinkedHashMap<String, Object>> bucketsIn = (ArrayList<LinkedHashMap<String, Object>>) linkedHashMap1
								.get("buckets");
						ArrayList<SimpleOrderedMap<Object>> bucketsOut = new ArrayList<SimpleOrderedMap<Object>>();
						simpleOrderedMap1.add("buckets", bucketsOut);
						bucketsIn.forEach(bucket -> {
							SimpleOrderedMap simpleOrderedMap2 = new SimpleOrderedMap<Object>();
							simpleOrderedMap2.add("val", bucket.get("val").toString());
							simpleOrderedMap2.add("count", bucket.get("count"));
							bucketsOut.add(simpleOrderedMap2);
						});
					} else {
						facets.add(key, value);
					}
				});

		// Look for known things
		l.add("responseHeader", new NamedList<Object>(((Map<String, ? extends Object>)map.get("responseHeader"))));
		l.add("response", response);
		l.add("sort_values", new NamedList<Object>(((Map<String, ? extends Object>)map.get("sort_values"))));
		l.add("facet_counts", facetCounts);
		l.add("debug", new NamedList<Object>(((Map<String, ? extends Object>)map.get("debug"))));
		l.add("grouped", new NamedList<Object>(((Map<String, ? extends Object>)map.get("grouped"))));
		l.add("expanded", new NamedList<Object>(((Map<String, ? extends Object>)map.get("expanded"))));
		l.add("highlighting", new NamedList<Object>(((Map<String, ? extends Object>)map.get("highlighting"))));
		l.add("spellcheck", new NamedList<Object>(((Map<String, ? extends Object>)map.get("spellcheck"))));
		l.add("clusters", clusters);
		l.add("facets", facets);
		l.add("suggest", suggestInfo);
		l.add("stats", new NamedList<Object>(((Map<String, ? extends Object>)map.get("stats"))));
		l.add("terms", terms);
		l.add("moreLikeThis", moreLikeThis);
		l.add(CursorMarkParams.CURSOR_MARK_NEXT, (String)map.get(CursorMarkParams.CURSOR_MARK_NEXT));

		QueryResponse r = new QueryResponse(l, null);
		return r;
	}

	private void generateFacetPivotResponse(Map<String, Object> pivotJson, List<NamedList<Object>> pivots) {
		NamedList<Object> namedList1 = new NamedList<>();
		pivots.add(namedList1);
		namedList1.add("field", pivotJson.get("field"));
		namedList1.add("value", pivotJson.get("value"));
		namedList1.add("count", pivotJson.get("count"));
		List<NamedList<Object>> pivots2 = new ArrayList<>();
		namedList1.add("pivot", pivots2);
		Optional.ofNullable((List<Map<String, Object>>)pivotJson.get("pivot")).ifPresent(pivotsJson2 -> {
			pivotsJson2.forEach(pivotJson2 -> {
				generateFacetPivotResponse(pivotJson2, pivots2);
			});
			
		});
		Optional.ofNullable(pivotJson.get("ranges")).ifPresent(facetRangesJson -> {
			NamedList<Object> facetRanges = new NamedList<Object>();
			namedList1.add("ranges", facetRanges);
			((Map<String, Map<String, Object>>)facetRangesJson).forEach((key2, value2) -> {
				NamedList<Object> namedList2 = new NamedList<>();
				facetRanges.add(key2, namedList2);
				List<Object> countsJson = (List<Object>)value2.get("counts");
				NamedList<Integer> counts = new NamedList<>();
				namedList2.add("counts", counts);
				Optional.ofNullable((String)value2.get("gap")).ifPresent(gap -> {
					namedList2.add("gap", gap);
				});
				Optional.ofNullable((String)value2.get("start")).ifPresent(start -> {
					namedList2.add("start", start);
				});
				Optional.ofNullable((String)value2.get("end")).ifPresent(end -> {
					namedList2.add("end", end);
				});
				for(Integer i = 0; i < countsJson.size(); i+=2) {
					counts.add((String)countsJson.get(i), (Integer)countsJson.get(i + 1));
				}
			});
		});
	}

	private void searchFacetPivot() {
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/ 
	protected void _solrDocumentList(Couverture<SolrDocumentList> c) {
		if(solrQuery.getQuery() != null) {
			SolrDocumentList o = queryResponse.getResults();
			c.o(o);
		}
	}

	/**
	 * r: peuplerPourClasse
	 * r.enUS: populateForClass
	 * r: stockerPourClasse
	 * r.enUS: storeForClass
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: peupler
	 * r.enUS: populate
	 * r: stocker
	 * r.enUS: store
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: RequeteSite
	 * r.enUS: SiteRequest
	 */
	protected void _list(List<DEV> l) {
		if(solrQuery.getQuery() != null) {
			for(SolrDocument solrDocument : solrDocumentList) {
				try {
					if(solrDocument != null) {
						String classeNomCanonique = (String)solrDocument.get("classeNomCanonique_indexedstored_string");
						DEV o = (DEV)Class.forName(classeNomCanonique).newInstance();
						MethodUtils.invokeMethod(o, "setRequeteSite_", requeteSite_);
						if(peupler)
							MethodUtils.invokeMethod(o, "peuplerPourClasse", solrDocument);
						if(stocker)
							MethodUtils.invokeMethod(o, "stockerPourClasse", solrDocument);
						l.add(o);
					}
				} catch (InstantiationException | IllegalAccessException | NoSuchMethodException
						| InvocationTargetException | ClassNotFoundException e) {
					ExceptionUtils.rethrow(e);
				}
			}
		}
	}

	protected void _first(Couverture<Object> w) {
		if(list.size() > 0)
			w.o(list.get(0));
	}

	public DEV first() {
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	public int getSize() {
		return list.size();
	}

	public int size() {
		return list.size();
	}

	/**
	 * enable/disable terms.
	 * 
	 * @param b
	 *            flag to indicate terms should be enabled. <br>
	 *            if b==false, removes all other terms parameters
	 * @return Current reference (<i>this</i>)
	 */
	public SolrQuery setTerms(boolean b) {
		return solrQuery.setTerms(b);
	}

	public boolean getTerms() {
		return solrQuery.getTerms();
	}

	public SolrQuery addTermsField(String field) {
		return solrQuery.addTermsField(field);
	}

	public String[] getTermsFields() {
		return solrQuery.getTermsFields();
	}

	public SolrQuery setTermsLower(String lower) {
		return solrQuery.setTermsLower(lower);
	}

	public String getTermsLower() {
		return solrQuery.getTermsLower();
	}

	public SolrQuery setTermsUpper(String upper) {
		return solrQuery.setTermsUpper(upper);
	}

	public String getTermsUpper() {
		return solrQuery.getTermsUpper();
	}

	public SolrQuery setTermsUpperInclusive(boolean b) {
		return solrQuery.setTermsUpperInclusive(b);
	}

	public boolean getTermsUpperInclusive() {
		return solrQuery.getTermsUpperInclusive();
	}

	public SolrQuery setTermsLowerInclusive(boolean b) {
		return solrQuery.setTermsLowerInclusive(b);
	}

	public boolean getTermsLowerInclusive() {
		return solrQuery.getTermsLowerInclusive();
	}

	public SolrQuery setTermsLimit(int limit) {
		return solrQuery.setTermsLimit(limit);
	}

	public int getTermsLimit() {
		return solrQuery.getTermsLimit();
	}

	public SolrQuery setTermsMinCount(int cnt) {
		return solrQuery.setTermsMinCount(cnt);
	}

	public int getTermsMinCount() {
		return solrQuery.getTermsMinCount();
	}

	public SolrQuery setTermsMaxCount(int cnt) {
		return solrQuery.setTermsMaxCount(cnt);
	}

	public int getTermsMaxCount() {
		return solrQuery.getTermsMaxCount();
	}

	public SolrQuery setTermsPrefix(String prefix) {
		return solrQuery.setTermsPrefix(prefix);
	}

	public String getTermsPrefix() {
		return solrQuery.getTermsPrefix();
	}

	public SolrQuery setTermsRaw(boolean b) {
		return solrQuery.setTermsRaw(b);
	}

	public boolean getTermsRaw() {
		return solrQuery.getTermsRaw();
	}

	public SolrQuery setTermsSortString(String type) {
		return solrQuery.setTermsSortString(type);
	}

	public String getTermsSortString() {
		return solrQuery.getTermsSortString();
	}

	public SolrQuery setTermsRegex(String regex) {
		return solrQuery.setTermsRegex(regex);
	}

	public String getTermsRegex() {
		return solrQuery.getTermsRegex();
	}

	public SolrQuery setTermsRegexFlag(String flag) {
		return solrQuery.setTermsRegexFlag(flag);
	}

	public String[] getTermsRegexFlags() {
		return solrQuery.getTermsRegexFlags();
	}

	/**
	 * Add field(s) for facet computation.
	 * 
	 * @param fields
	 *            Array of field names from the IndexSchema
	 * @return this
	 */
	public SolrQuery addFacetField(String... fields) {
		return solrQuery.addFacetField(fields);
	}

	/**
	 * Add field(s) for pivot computation.
	 * 
	 * pivot fields are comma separated
	 * 
	 * @param fields
	 *            Array of field names from the IndexSchema
	 * @return this
	 */
	public SolrQuery addFacetPivotField(String... fields) {
		return solrQuery.addFacetPivotField(fields);
	}

	/**
	 * Add a numeric range facet.
	 *
	 * @param field
	 *            The field
	 * @param start
	 *            The start of range
	 * @param end
	 *            The end of the range
	 * @param gap
	 *            The gap between each count
	 * @return this
	 */
	public SolrQuery addNumericRangeFacet(String field, Number start, Number end, Number gap) {
		return solrQuery.addNumericRangeFacet(field, start, end, gap);
	}

	/**
	 * Add a numeric range facet.
	 *
	 * @param field
	 *            The field
	 * @param start
	 *            The start of range
	 * @param end
	 *            The end of the range
	 * @param gap
	 *            The gap between each count
	 * @return this
	 */
	public SolrQuery addDateRangeFacet(String field, Date start, Date end, String gap) {
		return solrQuery.addDateRangeFacet(field, start, end, gap);
	}

	/**
	 * Add Interval Faceting on a field. All intervals for the same field should be
	 * included in the same call to this method. For syntax documentation see
	 * <a href=
	 * "https://wiki.apache.org/solr/SimpleFacetParameters#Interval_Faceting">Solr
	 * wiki</a>. <br>
	 * Key substitution, filter exclusions or other local params on the field are
	 * not supported when using this method, if this is needed, use the lower level
	 * {@link #add} method.<br>
	 * Key substitution IS supported on intervals when using this method.
	 * 
	 * 
	 * @param field
	 *            the field to add facet intervals. Must be an existing field and
	 *            can't be null
	 * @param intervals
	 *            Intervals to be used for faceting. It can be an empty array, but
	 *            it can't be <code>null</code>
	 * @return this
	 */
	public SolrQuery addIntervalFacets(String field, String[] intervals) {
		return solrQuery.addIntervalFacets(field, intervals);
	}

	/**
	 * Remove all Interval Facets on a field
	 * 
	 * @param field
	 *            the field to remove from facet intervals
	 * @return Array of current intervals for <code>field</code>
	 */
	public String[] removeIntervalFacets(String field) {
		return solrQuery.removeIntervalFacets(field);
	}

	/**
	 * get the facet fields
	 * 
	 * @return string array of facet fields or null if not set/empty
	 */
	public String[] getFacetFields() {
		return solrQuery.getFacetFields();
	}

	/**
	 * remove a facet field
	 * 
	 * @param name
	 *            Name of the facet field to be removed.
	 * 
	 * @return true, if the item was removed. <br>
	 *         false, if the facet field was null or did not exist.
	 */
	public boolean removeFacetField(String name) {
		return solrQuery.removeFacetField(name);
	}

	/**
	 * enable/disable faceting.
	 * 
	 * @param b
	 *            flag to indicate faceting should be enabled. <br>
	 *            if b==false, removes all other faceting parameters
	 * @return Current reference (<i>this</i>)
	 */
	public SolrQuery setFacet(boolean b) {
		return solrQuery.setFacet(b);
	}

	public SolrQuery setFacetPrefix(String prefix) {
		return solrQuery.setFacetPrefix(prefix);
	}

	public SolrQuery setFacetPrefix(String field, String prefix) {
		return solrQuery.setFacetPrefix(field, prefix);
	}

	/**
	 * add a faceting query
	 * 
	 * @param f
	 *            facet query
	 */
	public SolrQuery addFacetQuery(String f) {
		return solrQuery.addFacetQuery(f);
	}

	/**
	 * get facet queries
	 * 
	 * @return all facet queries or null if not set/empty
	 */
	public String[] getFacetQuery() {
		return solrQuery.getFacetQuery();
	}

	/**
	 * remove a facet query
	 * 
	 * @param q
	 *            the facet query to remove
	 * @return true if the facet query was removed false otherwise
	 */
	public boolean removeFacetQuery(String q) {
		return solrQuery.removeFacetQuery(q);
	}

	/**
	 * set the facet limit
	 * 
	 * @param lim
	 *            number facet items to return
	 */
	public SolrQuery setFacetLimit(int lim) {
		return solrQuery.setFacetLimit(lim);
	}

	/**
	 * get current facet limit
	 * 
	 * @return facet limit or default of 25
	 */
	public int getFacetLimit() {
		return solrQuery.getFacetLimit();
	}

	/**
	 * set facet minimum count
	 * 
	 * @param cnt
	 *            facets having less that cnt hits will be excluded from teh facet
	 *            list
	 */
	public SolrQuery setFacetMinCount(int cnt) {
		return solrQuery.setFacetMinCount(cnt);
	}

	/**
	 * get facet minimum count
	 * 
	 * @return facet minimum count or default of 1
	 */
	public int getFacetMinCount() {
		return solrQuery.getFacetMinCount();
	}

	/**
	 * Sets facet missing boolean flag
	 * 
	 * @param v
	 *            flag to indicate the field of {@link FacetParams#FACET_MISSING} .
	 * @return this
	 */
	public SolrQuery setFacetMissing(Boolean v) {
		return solrQuery.setFacetMissing(v);
	}

	/**
	 * get facet sort
	 * 
	 * @return facet sort or default of {@link FacetParams#FACET_SORT_COUNT}
	 */
	public String getFacetSortString() {
		return solrQuery.getFacetSortString();
	}

	/**
	 * set facet sort
	 * 
	 * @param sort
	 *            sort facets
	 * @return this
	 */
	public SolrQuery setFacetSort(String sort) {
		return solrQuery.setFacetSort(sort);
	}

	/**
	 * add highlight field
	 * 
	 * @param f
	 *            field to enable for highlighting
	 */
	public SolrQuery addHighlightField(String f) {
		return solrQuery.addHighlightField(f);
	}

	/**
	 * remove a field for highlighting
	 * 
	 * @param f
	 *            field name to not highlight
	 * @return <i>true</i>, if removed, <br>
	 *         <i>false</i>, otherwise
	 */
	public boolean removeHighlightField(String f) {
		return solrQuery.removeHighlightField(f);
	}

	/**
	 * get list of highlighted fields
	 * 
	 * @return Array of highlight fields or null if not set/empty
	 */
	public String[] getHighlightFields() {
		return solrQuery.getHighlightFields();
	}

	public SolrQuery setHighlightSnippets(int num) {
		return solrQuery.setHighlightSnippets(num);
	}

	public int getHighlightSnippets() {
		return solrQuery.getHighlightSnippets();
	}

	public SolrQuery setHighlightFragsize(int num) {
		return solrQuery.setHighlightFragsize(num);
	}

	public int getHighlightFragsize() {
		return solrQuery.getHighlightFragsize();
	}

	public SolrQuery setHighlightRequireFieldMatch(boolean flag) {
		return solrQuery.setHighlightRequireFieldMatch(flag);
	}

	public boolean getHighlightRequireFieldMatch() {
		return solrQuery.getHighlightRequireFieldMatch();
	}

	public SolrQuery setHighlightSimplePre(String f) {
		return solrQuery.setHighlightSimplePre(f);
	}

	public String getHighlightSimplePre() {
		return solrQuery.getHighlightSimplePre();
	}

	public SolrQuery setHighlightSimplePost(String f) {
		return solrQuery.setHighlightSimplePost(f);
	}

	public String getHighlightSimplePost() {
		return solrQuery.getHighlightSimplePost();
	}

	/**
	 * Gets the raw sort field, as it will be sent to Solr.
	 * <p>
	 * The returned sort field will always contain a serialized version of the sort
	 * string built using {@link #setSort(SortClause)},
	 * {@link #addSort(SortClause)}, {@link #addOrUpdateSort(SortClause)},
	 * {@link #removeSort(SortClause)}, {@link #clearSorts()} and
	 * {@link #setSorts(List)}.
	 */
	public String getSortField() {
		return solrQuery.getSortField();
	}

	/**
	 * Clears current sort information.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery clearSorts() {
		return solrQuery.clearSorts();
	}

	/**
	 * Replaces the current sort information.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery setSorts(List<SortClause> value) {
		return solrQuery.setSorts(value);
	}

	/**
	 * Gets an a list of current sort clauses.
	 *
	 * @return an immutable list of current sort clauses
	 * @since 4.2
	 */
	public List<SortClause> getSorts() {
		return solrQuery.getSorts();
	}

	/**
	 * Replaces the current sort information with a single sort clause
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery setSort(String field, ORDER order) {
		return solrQuery.setSort(field, order);
	}

	/**
	 * Replaces the current sort information with a single sort clause
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery setSort(SortClause sortClause) {
		return solrQuery.setSort(sortClause);
	}

	/**
	 * Adds a single sort clause to the end of the current sort information.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery addSort(String field, ORDER order) {
		return solrQuery.addSort(field, order);
	}

	/**
	 * Adds a single sort clause to the end of the query.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery addSort(SortClause sortClause) {
		return solrQuery.addSort(sortClause);
	}

	/**
	 * Updates or adds a single sort clause to the query. If the field is already
	 * used for sorting, the order of the existing field is modified; otherwise, it
	 * is added to the end.
	 * <p>
	 * 
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery addOrUpdateSort(String field, ORDER order) {
		return solrQuery.addOrUpdateSort(field, order);
	}

	/**
	 * Updates or adds a single sort field specification to the current sort
	 * information. If the sort field already exist in the sort information map, its
	 * position is unchanged and the sort order is set; if it does not exist, it is
	 * appended at the end with the specified order..
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery addOrUpdateSort(SortClause sortClause) {
		return solrQuery.addOrUpdateSort(sortClause);
	}

	/**
	 * Removes a single sort field from the current sort information.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery removeSort(SortClause sortClause) {
		return solrQuery.removeSort(sortClause);
	}

	/**
	 * Removes a single sort field from the current sort information.
	 *
	 * @return the modified SolrQuery object, for easy chaining
	 * @since 4.2
	 */
	public SolrQuery removeSort(String itemName) {
		return solrQuery.removeSort(itemName);
	}

	public void setGetFieldStatistics(boolean v) {
		solrQuery.setGetFieldStatistics(v);
	}

	public void setGetFieldStatistics(String field) {
		solrQuery.setGetFieldStatistics(field);
	}

	public void addGetFieldStatistics(String... field) {
		solrQuery.addGetFieldStatistics(field);
	}

	public void addStatsFieldFacets(String field, String... facets) {
		solrQuery.addStatsFieldFacets(field, facets);
	}

	public void addStatsFieldCalcDistinct(String field, boolean calcDistinct) {
		solrQuery.addStatsFieldCalcDistinct(field, calcDistinct);
	}

	public SolrQuery setFilterQueries(String... fq) {
		return solrQuery.setFilterQueries(fq);
	}

	public SolrQuery addFilterQuery(String... fq) {
		return solrQuery.addFilterQuery(fq);
	}

	public boolean removeFilterQuery(String fq) {
		return solrQuery.removeFilterQuery(fq);
	}

	public String[] getFilterQueries() {
		return solrQuery.getFilterQueries();
	}

	public boolean getHighlight() {
		return solrQuery.getHighlight();
	}

	public SolrQuery setHighlight(boolean b) {
		return solrQuery.setHighlight(b);
	}

	/**
	 * Add field for MoreLikeThis. Automatically enables MoreLikeThis.
	 *
	 * @param field
	 *            the names of the field to be added
	 * @return this
	 */
	public SolrQuery addMoreLikeThisField(String field) {
		return solrQuery.addMoreLikeThisField(field);
	}

	public SolrQuery setMoreLikeThisFields(String... fields) {
		return solrQuery.setMoreLikeThisFields(fields);
	}

	/**
	 * @return an array with the fields used to compute similarity.
	 */
	public String[] getMoreLikeThisFields() {
		return solrQuery.getMoreLikeThisFields();
	}

	/**
	 * Sets the frequency below which terms will be ignored in the source doc
	 *
	 * @param mintf
	 *            the minimum term frequency
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMinTermFreq(int mintf) {
		return solrQuery.setMoreLikeThisMinTermFreq(mintf);
	}

	/**
	 * Gets the frequency below which terms will be ignored in the source doc
	 */
	public int getMoreLikeThisMinTermFreq() {
		return solrQuery.getMoreLikeThisMinTermFreq();
	}

	/**
	 * Sets the frequency at which words will be ignored which do not occur in at
	 * least this many docs.
	 *
	 * @param mindf
	 *            the minimum document frequency
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMinDocFreq(int mindf) {
		return solrQuery.setMoreLikeThisMinDocFreq(mindf);
	}

	/**
	 * Gets the frequency at which words will be ignored which do not occur in at
	 * least this many docs.
	 */
	public int getMoreLikeThisMinDocFreq() {
		return solrQuery.getMoreLikeThisMinDocFreq();
	}

	/**
	 * Sets the minimum word length below which words will be ignored.
	 *
	 * @param minwl
	 *            the minimum word length
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMinWordLen(int minwl) {
		return solrQuery.setMoreLikeThisMinWordLen(minwl);
	}

	/**
	 * Gets the minimum word length below which words will be ignored.
	 */
	public int getMoreLikeThisMinWordLen() {
		return solrQuery.getMoreLikeThisMinWordLen();
	}

	/**
	 * Sets the maximum word length above which words will be ignored.
	 *
	 * @param maxwl
	 *            the maximum word length
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMaxWordLen(int maxwl) {
		return solrQuery.setMoreLikeThisMaxWordLen(maxwl);
	}

	/**
	 * Gets the maximum word length above which words will be ignored.
	 */
	public int getMoreLikeThisMaxWordLen() {
		return solrQuery.getMoreLikeThisMaxWordLen();
	}

	/**
	 * Sets the maximum number of query terms that will be included in any generated
	 * query.
	 *
	 * @param maxqt
	 *            the maximum number of query terms
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMaxQueryTerms(int maxqt) {
		return solrQuery.setMoreLikeThisMaxQueryTerms(maxqt);
	}

	/**
	 * Gets the maximum number of query terms that will be included in any generated
	 * query.
	 */
	public int getMoreLikeThisMaxQueryTerms() {
		return solrQuery.getMoreLikeThisMaxQueryTerms();
	}

	/**
	 * Sets the maximum number of tokens to parse in each example doc field that is
	 * not stored with TermVector support.
	 *
	 * @param maxntp
	 *            the maximum number of tokens to parse
	 * @return this
	 */
	public SolrQuery setMoreLikeThisMaxTokensParsed(int maxntp) {
		return solrQuery.setMoreLikeThisMaxTokensParsed(maxntp);
	}

	/**
	 * Gets the maximum number of tokens to parse in each example doc field that is
	 * not stored with TermVector support.
	 */
	public int getMoreLikeThisMaxTokensParsed() {
		return solrQuery.getMoreLikeThisMaxTokensParsed();	
	}

	/**
	 * Sets if the query will be boosted by the interesting term relevance.
	 *
	 * @param b
	 *            set to true to boost the query with the interesting term relevance
	 * @return this
	 */
	public SolrQuery setMoreLikeThisBoost(boolean b) {
		return solrQuery.setMoreLikeThisBoost(b);
	}

	/**
	 * Gets if the query will be boosted by the interesting term relevance.
	 */
	public boolean getMoreLikeThisBoost() {
		return solrQuery.getMoreLikeThisBoost();
	}

	/**
	 * Sets the query fields and their boosts using the same format as that used in
	 * DisMaxQParserPlugin. These fields must also be added using
	 * {@link #addMoreLikeThisField(String)}.
	 *
	 * @param qf
	 *            the query fields
	 * @return this
	 */
	public SolrQuery setMoreLikeThisQF(String qf) {
		return solrQuery.setMoreLikeThisQF(qf);
	}

	/**
	 * Gets the query fields and their boosts.
	 */
	public String getMoreLikeThisQF() {
		return solrQuery.getMoreLikeThisQF();
	}

	/**
	 * Sets the number of similar documents to return for each result.
	 *
	 * @param count
	 *            the number of similar documents to return for each result
	 * @return this
	 */
	public SolrQuery setMoreLikeThisCount(int count) {
		return solrQuery.setMoreLikeThisCount(count);
	}

	/**
	 * Gets the number of similar documents to return for each result.
	 */
	public int getMoreLikeThisCount() {
		return solrQuery.getMoreLikeThisCount();
	}

	/**
	 * Enable/Disable MoreLikeThis. After enabling MoreLikeThis, the fields used for
	 * computing similarity must be specified calling
	 * {@link #addMoreLikeThisField(String)}.
	 *
	 * @param b
	 *            flag to indicate if MoreLikeThis should be enabled. if b==false
	 *            removes all mlt.* Parameters
	 * @return this
	 */
	public SolrQuery setMoreLikeThis(boolean b) {
		return solrQuery.setMoreLikeThis(b);
	}

	/**
	 * @return true if MoreLikeThis is enabled, false otherwise
	 */
	public boolean getMoreLikeThis() {
		return solrQuery.getMoreLikeThis();
	}

	public SolrQuery setIncludeScore(boolean includeScore) {
		return solrQuery.setIncludeScore(includeScore);
	}

	public SolrQuery setQuery(String query) {
		return solrQuery.setQuery(query);
	}

	public String getQuery() {
		return solrQuery.getQuery();
	}

	public SolrQuery setRows(Integer rows) {
		return solrQuery.setRows(rows);
	}

	public Integer getRows() {
		return solrQuery.getRows();
	}

	public SolrQuery setShowDebugInfo(boolean showDebugInfo) {
		return solrQuery.setShowDebugInfo(showDebugInfo);
	}

	public void set(String name, boolean val) {
		solrQuery.set(name, val);
	}

	public void set(String name, int val) {
		solrQuery.set(name, val);
	}

	public void set(String name, String vals) {
		solrQuery.set(name, vals);
	}

	public void add(String name, String...vals) {
		solrQuery.add(name, vals);
	}

	public void setDistrib(boolean val) {
		solrQuery.setDistrib(val);
	}

	public SolrQuery setStart(Integer start) {
		return solrQuery.setStart(start);
	}

	public Integer getStart() {
		return solrQuery.getStart();
	}

	/**
	 * The Request Handler to use (see the solrconfig.xml), which is stored in the
	 * "qt" parameter. Normally it starts with a '/' and if so it will be used by
	 * {@link org.apache.solr.client.solrj.request.QueryRequest#getPath()} in the
	 * URL instead of the "qt" parameter. If this is left blank, then the default of
	 * "/select" is assumed.
	 *
	 * @param qt
	 *            The Request Handler name corresponding to one in solrconfig.xml on
	 *            the server.
	 * @return this
	 */
	public SolrQuery setRequestHandler(String qt) {
		return solrQuery.setRequestHandler(qt);
	}

	public String getRequestHandler() {
		return solrQuery.getRequestHandler();
	}

	/**
	 * @return this
	 * @see ModifiableSolrParams#set(String,String[])
	 */
	public SolrQuery setParam(String name, String... values) {
		return solrQuery.setParam(name, values);
	}

	/**
	 * @return this
	 * @see org.apache.solr.common.params.ModifiableSolrParams#set(String, boolean)
	 */
	public SolrQuery setParam(String name, boolean value) {
		return solrQuery.setParam(name, value);
	}

	/** get a deep copy of this object **/
	public SolrQuery getCopy() {
		return solrQuery.getCopy();
	}

	/**
	 * Set the maximum time allowed for this query. If the query takes more time
	 * than the specified milliseconds, a timeout occurs and partial (or no) results
	 * may be returned.
	 * 
	 * If given Integer is null, then this parameter is removed from the request
	 * 
	 * @param milliseconds
	 *            the time in milliseconds allowed for this query
	 */
	public SolrQuery setTimeAllowed(Integer milliseconds) {
		return solrQuery.setTimeAllowed(milliseconds);
	}

	/**
	 * Get the maximum time allowed for this query.
	 */
	public Integer getTimeAllowed() {
		return solrQuery.getTimeAllowed();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ListeRecherche { ");
		list.stream().forEach(o -> {
			sb.append(o);
		});
		sb.append(" }");
		return sb.toString();
	}
}
