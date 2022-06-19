package org.computate.site.enus.model.htm;

import org.computate.site.enus.page.PageLayout;
import org.computate.site.enus.request.SiteRequestEnUS;
import org.computate.site.enus.model.user.SiteUser;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.vertx.search.list.SearchList;
import org.computate.search.wrap.Wrap;
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
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.collections.CollectionUtils;
import java.util.Objects;
import io.vertx.core.Promise;
import org.computate.site.enus.config.ConfigKeys;
import org.computate.search.response.solr.SolrResponse;
import java.util.HashMap;
import org.computate.search.tool.TimeTool;
import java.time.ZoneId;


/**
 * Translate: false
 **/
public class SiteHtmGenPage extends SiteHtmGenPageGen<PageLayout> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _searchListSiteHtm_(Wrap<SearchList<SiteHtm>> w) {
	}

	protected void _pageResponse(Wrap<String> w) {
		if(searchListSiteHtm_ != null)
			w.o(JsonObject.mapFrom(searchListSiteHtm_.getResponse()).toString());
	}

	protected void _defaultZoneId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestVars().get(VAR_defaultZoneId)).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_ZONE)));
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultTimeZone(Wrap<ZoneId> w) {
		w.o(ZoneId.of(defaultZoneId));
	}

	protected void _defaultLocaleId(Wrap<String> w) {
		w.o(Optional.ofNullable(siteRequest_.getRequestHeaders().get("Accept-Language")).map(acceptLanguage -> StringUtils.substringBefore(acceptLanguage, ",")).orElse(siteRequest_.getConfig().getString(ConfigKeys.SITE_LOCALE)));
	}

	/**
	 * Ignore: true
	 **/
	protected void _defaultLocale(Wrap<Locale> w) {
		w.o(Locale.forLanguageTag(defaultLocaleId));
	}

	protected void _defaultRangeGap(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetRangeGap()).orElse("+1DAY"));
	}

	protected void _defaultRangeEnd(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetRangeEnd()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(ZonedDateTime.now(defaultTimeZone).toLocalDate().atStartOfDay(defaultTimeZone).plusDays(1)));
	}

	protected void _defaultRangeStart(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetRangeStart()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(defaultRangeEnd.minusDays(7).toLocalDate().atStartOfDay(defaultTimeZone)));
	}

	protected void _defaultRangeVar(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetRanges()).orElse(Arrays.asList()).stream().findFirst().map(v -> { if(v.contains("}")) return StringUtils.substringBefore(StringUtils.substringAfterLast(v, "}"), "_"); else return SiteHtm.searchVarSiteHtm(v); }).orElse("created"));
	}

	protected void _defaultFacetSort(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetSort()).orElse("index"));
	}

	protected void _defaultFacetLimit(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetLimit()).orElse(1));
	}

	protected void _defaultFacetMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetMinCount()).orElse(1));
	}

	protected void _defaultPivotMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListSiteHtm_.getFacetPivotMinCount()).orElse(0));
	}

	protected void _defaultFieldListVars(List<String> l) {
		Optional.ofNullable(searchListSiteHtm_.getFields()).orElse(Arrays.asList()).forEach(varStored -> {
			String varStored2 = varStored;
			if(StringUtils.contains(varStored2, "}"))
				varStored2 = StringUtils.substringAfterLast(varStored2, "}");
			String[] parts = varStored2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SiteHtm.searchVarSiteHtm(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	protected void _defaultStatsVars(List<String> l) {
		Optional.ofNullable(searchListSiteHtm_.getStatsFields()).orElse(Arrays.asList()).forEach(varIndexed -> {
			String varIndexed2 = varIndexed;
			if(StringUtils.contains(varIndexed2, "}"))
				varIndexed2 = StringUtils.substringAfterLast(varIndexed2, "}");
			String[] parts = varIndexed2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SiteHtm.searchVarSiteHtm(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	protected void _defaultPivotVars(List<String> l) {
		Optional.ofNullable(searchListSiteHtm_.getFacetPivots()).orElse(Arrays.asList()).forEach(facetPivot -> {
			String facetPivot2 = facetPivot;
			if(StringUtils.contains(facetPivot2, "}"))
				facetPivot2 = StringUtils.substringAfterLast(facetPivot2, "}");
			String[] parts = facetPivot2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = SiteHtm.searchVarSiteHtm(part);
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listSiteHtm(JsonArray l) {
		Optional.ofNullable(searchListSiteHtm_).map(o -> o.getList()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _stats(Wrap<SolrResponse.Stats> w) {
		w.o(searchListSiteHtm_.getResponse().getStats());
	}

	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
		w.o(searchListSiteHtm_.getResponse().getFacetCounts());
	}

	protected void _siteHtmCount(Wrap<Integer> w) {
		w.o(searchListSiteHtm_ == null ? 0 : searchListSiteHtm_.size());
	}

	protected void _siteHtm_(Wrap<SiteHtm> w) {
		if(siteHtmCount == 1)
			w.o(searchListSiteHtm_.get(0));
	}

	protected void _id(Wrap<String> w) {
		if(siteHtmCount == 1)
			w.o(siteHtm_.getId());
	}

	@Override
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _classSimpleName(Wrap<String> w) {
		w.o("SiteHtm");
	}

	@Override
	protected void _pageTitle(Wrap<String> c) {
		if(siteHtm_ != null && siteHtm_.getObjectTitle() != null)
			c.o(siteHtm_.getObjectTitle());
		else if(siteHtm_ != null)
			c.o("HTMLs");
		else if(searchListSiteHtm_ == null || siteHtmCount == 0)
			c.o("no HTML found");
		else
			c.o("HTMLs");
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o("/htm");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _rolesRequired(List<String> l) {
		l.addAll(Optional.ofNullable(siteRequest_.getConfig().getJsonArray(ConfigKeys.AUTH_ROLES_REQUIRED + "_SiteHtm")).orElse(new JsonArray()).stream().map(o -> o.toString()).collect(Collectors.toList()));
	}

	@Override
	protected void _pagination(JsonObject pagination) {
		JsonArray pages = new JsonArray();
		Long start = searchListSiteHtm_.getStart().longValue();
		Long rows = searchListSiteHtm_.getRows().longValue();
		Long foundNum = searchListSiteHtm_.getResponse().getResponse().getNumFound().longValue();
		Long startNum = start + 1L;
		Long endNum = start + rows;
		Long floorMod = (rows == 0L ? 0L : Math.floorMod(foundNum, rows));
		Long last = (rows == 0L ? 0L : Math.floorDiv(foundNum, rows) - (floorMod.equals(0L) ? 1L : 0L) * rows);
		endNum = endNum < foundNum ? endNum : foundNum;
		startNum = foundNum == 0L ? 0L : startNum;
		Long paginationStart = start - 10L * rows;
		if(paginationStart < 0L)
			paginationStart = 0L;
		Long paginationEnd = start + 10L * rows;
		if(paginationEnd > foundNum)
			paginationEnd = foundNum;

		pagination.put("1L", 1L);
		pagination.put("0L", 0L);
		pagination.put("start", start);
		pagination.put("rows", rows);
		pagination.put("rowsPrevious", rows / 2);
		pagination.put("rowsNext", rows * 2);
		pagination.put("startNum", startNum);
		pagination.put("endNum", endNum);
		pagination.put("foundNum", foundNum);
		pagination.put("pageStart", new JsonObject().put("start", 0L).put("pageNumber", 1L));
		if(start > 0L)
			pagination.put("pagePrevious", new JsonObject().put("start", start - rows).put("pageNumber", start - rows + 1L));
		if(start + rows < foundNum)
			pagination.put("pageNext", new JsonObject().put("start", start + rows).put("pageNumber", start + rows + 1L));
		pagination.put("pageEnd", new JsonObject().put("start", last).put("pageNumber", last + 1L));
		pagination.put("pages", pages);
		for(Long i = paginationStart; i < paginationEnd; i += rows) {
			Long pageNumber = Math.floorDiv(i, rows) + 1L;
			JsonObject page = new JsonObject();
			page.put("pageNumber", pageNumber);
			page.put("currentPage", start.equals(i));
			page.put("start", i);
			pages.add(page);
		}
	}

	@Override
	protected void _varsQ(JsonObject vars) {
		SiteHtm.varsQForClass().forEach(var -> {
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(SiteHtm.displayNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(SiteHtm.classSimpleNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", Optional.ofNullable(searchListSiteHtm_.getRequest().getQuery()).filter(fq -> fq.startsWith(SiteHtm.varIndexedSiteHtm(var) + ":")).map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsFq(JsonObject vars) {
		Map<String, SolrResponse.FacetField> facetFields = Optional.ofNullable(facetCounts).map(c -> c.getFacetFields()).map(f -> f.getFacets()).orElse(new HashMap<String,SolrResponse.FacetField>());
		SiteHtm.varsFqForClass().forEach(var -> {
			String varIndexed = SiteHtm.varIndexedSiteHtm(var);
			String varStored = SiteHtm.varStoredSiteHtm(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("varStored", varStored);
			json.put("varIndexed", varIndexed);
					String type = StringUtils.substringAfterLast(varIndexed, "_");
			json.put("displayName", Optional.ofNullable(SiteHtm.displayNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(SiteHtm.classSimpleNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListSiteHtm_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(SiteHtm.varIndexedSiteHtm(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			Optional.ofNullable(stats).map(s -> s.get(varIndexed)).ifPresent(stat -> {
				json.put("stats", JsonObject.mapFrom(stat));
			});
			Optional.ofNullable(facetFields.get(varIndexed)).ifPresent(facetField -> {
				JsonObject facetJson = new JsonObject();
				JsonObject counts = new JsonObject();
				facetJson.put("var", var);
				facetField.getCounts().forEach((val, count) -> {
					counts.put(val, count);
				});
				facetJson.put("counts", counts);
				json.put("facetField", facetJson);
			});
			if(defaultFieldListVars.contains(var)) {
				json.put("fieldList", true);
			}
			json.put("enableStats", !StringUtils.equalsAny(type, "boolean", "location"));
			if(defaultStatsVars.contains(var)) {
				SolrResponse.StatsField varStats = stats.get(varIndexed);
				if(varStats != null)
					json.put("stats", varStats);
			}
			if(defaultPivotVars.contains(var)) {
				json.put("pivot", true);
			}
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsRange(JsonObject vars) {
		SiteHtm.varsRangeForClass().forEach(var -> {
			String varIndexed = SiteHtm.varIndexedSiteHtm(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(SiteHtm.displayNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(SiteHtm.classSimpleNameSiteHtm(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListSiteHtm_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(SiteHtm.varIndexedSiteHtm(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _query(JsonObject query) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		JsonObject params = serviceRequest.getParams();

		JsonObject queryParams = Optional.ofNullable(serviceRequest).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		Long num = searchListSiteHtm_.getResponse().getResponse().getNumFound().longValue();
		String q = "*:*";
		String q1 = "";
		String q2 = "";
		for(String paramName : queryParams.fieldNames()) {
			String entityVar = null;
			String valueIndexed = null;
			Object paramObjectValues = queryParams.getValue(paramName);
			JsonArray paramObjects = paramObjectValues instanceof JsonArray ? (JsonArray)paramObjectValues : new JsonArray().add(paramObjectValues);

			try {
				for(Object paramObject : paramObjects) {
					switch(paramName) {
					case "q":
						q = (String)paramObject;
						entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
						valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
						q1 = entityVar.equals("*") ? q1 : entityVar;
						q2 = valueIndexed;
						q = q1 + ":" + q2;
					}
				}
			} catch(Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
		query.put("q", q);

		Long rows1 = Optional.ofNullable(searchListSiteHtm_).map(l -> l.getRows()).orElse(10L);
		Long start1 = Optional.ofNullable(searchListSiteHtm_).map(l -> l.getStart()).orElse(1L);
		Long start2 = start1 - rows1;
		Long start3 = start1 + rows1;
		Long rows2 = rows1 / 2;
		Long rows3 = rows1 * 2;
		start2 = start2 < 0 ? 0 : start2;
		JsonObject fqs = new JsonObject();
		for(String fq : Optional.ofNullable(searchListSiteHtm_).map(l -> l.getFilterQueries()).orElse(Arrays.asList())) {
			if(!StringUtils.contains(fq, "(")) {
				String fq1 = SiteHtm.searchVarSiteHtm(StringUtils.substringBefore(fq, ":"));
				String fq2 = StringUtils.substringAfter(fq, ":");
				if(!StringUtils.startsWithAny(fq, "classCanonicalNames_", "archived_", "deleted_", "sessionId", "userKeys"))
					fqs.put(fq1, new JsonObject().put("var", fq1).put("val", fq2).put("displayName", SiteHtm.displayNameForClass(fq1)));
				}
			}
		query.put("fq", fqs);

		JsonArray sorts = new JsonArray();
		for(String sort : Optional.ofNullable(searchListSiteHtm_).map(l -> l.getSorts()).orElse(Arrays.asList())) {
			String sort1 = SiteHtm.searchVarSiteHtm(StringUtils.substringBefore(sort, " "));
			sorts.add(new JsonObject().put("var", sort1).put("order", StringUtils.substringAfter(sort, " ")).put("displayName", SiteHtm.displayNameForClass(sort1)));
		}
		query.put("sort", sorts);
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageDescription(Wrap<String> c) {
			c.o("An HTML part that is indexed in the search engine. ");
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png/htm-999.png");
	}

	@Override
	protected void _contextIconGroup(Wrap<String> c) {
			c.o("duotone");
	}

	@Override
	protected void _contextIconName(Wrap<String> c) {
			c.o("code");
	}
}
