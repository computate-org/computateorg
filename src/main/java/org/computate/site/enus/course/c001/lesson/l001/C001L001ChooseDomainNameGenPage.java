package org.computate.site.enus.course.c001.lesson.l001;

import org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.QuestionReponse;
import java.util.List;
import java.lang.String;
import org.computate.site.enus.course.c001.C001Page;
import org.computate.site.enus.request.SiteRequestEnUS;
import org.computate.site.enus.model.user.SiteUser;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.vertx.search.list.SearchList;
import org.computate.search.wrap.Wrap;
import org.computate.site.enus.page.PageLayout;
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
public class C001L001ChooseDomainNameGenPage extends C001L001ChooseDomainNameGenPageGen<C001Page> {

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 **/
	protected void _searchListC001L001ChooseDomainName_(Wrap<SearchList<C001L001ChooseDomainName>> w) {
	}

	protected void _pageResponse(Wrap<String> w) {
		if(searchListC001L001ChooseDomainName_ != null)
			w.o(JsonObject.mapFrom(searchListC001L001ChooseDomainName_.getQueryResponse()).toString());
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
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetRangeGap()).orElse("+1DAY"));
	}

	protected void _defaultRangeEnd(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetRangeEnd()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(ZonedDateTime.now(defaultTimeZone).toLocalDate().atStartOfDay(defaultTimeZone).plusDays(1)));
	}

	protected void _defaultRangeStart(Wrap<ZonedDateTime> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetRangeStart()).map(s -> TimeTool.parseZonedDateTime(defaultTimeZone, s)).orElse(defaultRangeEnd.minusDays(7).toLocalDate().atStartOfDay(defaultTimeZone)));
	}

	protected void _defaultRangeVar(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetRanges()).orElse(Arrays.asList()).stream().findFirst().map(v -> { if(v.contains("}")) return StringUtils.substringBefore(StringUtils.substringAfterLast(v, "}"), "_"); else return StringUtils.substringBefore(v, "_"); }).orElse("created"));
	}

	protected void _defaultFacetSort(Wrap<String> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetSort()).orElse("index"));
	}

	protected void _defaultFacetLimit(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetLimit()).orElse(1));
	}

	protected void _defaultFacetMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetMinCount()).orElse(1));
	}

	protected void _defaultPivotMinCount(Wrap<Integer> w) {
		w.o(Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetPivotMinCount()).orElse(0));
	}

	@Override
	protected void _defaultPivotVars(List<String> l) {
		Optional.ofNullable(searchListC001L001ChooseDomainName_.getFacetPivots()).orElse(Arrays.asList()).forEach(facetPivot -> {
			String facetPivot2 = facetPivot;
			if(StringUtils.contains(facetPivot2, "}"))
				facetPivot2 = StringUtils.substringAfterLast(facetPivot2, "}");
			String[] parts = facetPivot2.split(",");
			for(String part : parts) {
				if(StringUtils.isNotBlank(part)) {
					String var = StringUtils.substringBefore(part, "_");
					if(StringUtils.isNotBlank(var))
						l.add(var);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _listC001L001ChooseDomainName(JsonArray l) {
		Optional.ofNullable(searchListC001L001ChooseDomainName_).map(o -> o.getList()).orElse(Arrays.asList()).stream().map(o -> JsonObject.mapFrom(o)).forEach(o -> l.add(o));
	}

	protected void _facetCounts(Wrap<SolrResponse.FacetCounts> w) {
		w.o(searchListC001L001ChooseDomainName_.getQueryResponse().getFacetCounts());
	}

	protected void _c001L001ChooseDomainNameCount(Wrap<Integer> w) {
		w.o(searchListC001L001ChooseDomainName_ == null ? 0 : searchListC001L001ChooseDomainName_.size());
	}

	protected void _c001L001ChooseDomainName_(Wrap<C001L001ChooseDomainName> w) {
		if(c001L001ChooseDomainNameCount == 1)
			w.o(searchListC001L001ChooseDomainName_.get(0));
	}

	protected void _id(Wrap<String> w) {
		if(c001L001ChooseDomainNameCount == 1)
			w.o(c001L001ChooseDomainName_.getId());
	}

	@Override
	protected void _promiseBefore(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _classSimpleName(Wrap<String> w) {
		w.o("C001L001ChooseDomainName");
	}

	@Override
	protected void _pageTitle(Wrap<String> c) {
		if(c001L001ChooseDomainName_ != null && c001L001ChooseDomainName_.getObjectTitle() != null)
			c.o(c001L001ChooseDomainName_.getObjectTitle());
		else if(c001L001ChooseDomainName_ != null)
			c.o("What is the first step to creating my own website? Choose a domain name. ");
		else if(searchListC001L001ChooseDomainName_ == null || c001L001ChooseDomainNameCount == 0)
			c.o("no lesson found");
		else
			c.o("What is the first step to creating my own website? Choose a domain name. ");
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o("");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
	}

	@Override
	protected void _pagination(JsonObject pagination) {
		JsonArray pages = new JsonArray();
		Long start = searchListC001L001ChooseDomainName_.getStart().longValue();
		Long rows = searchListC001L001ChooseDomainName_.getRows().longValue();
		Long foundNum = searchListC001L001ChooseDomainName_.getQueryResponse().getResponse().getNumFound().longValue();
		Long startNum = start + 1L;
		Long endNum = start + rows;
		Long floorMod = Math.floorMod(foundNum, rows);
		Long last = Math.floorDiv(foundNum, rows) - (floorMod.equals(0L) ? 1L : 0L) * rows;
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
		C001L001ChooseDomainName.varsQForClass().forEach(var -> {
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(C001L001ChooseDomainName.displayNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(C001L001ChooseDomainName.classSimpleNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", Optional.ofNullable(searchListC001L001ChooseDomainName_.getRequest().getQuery()).filter(fq -> fq.startsWith(C001L001ChooseDomainName.varIndexedC001L001ChooseDomainName(var) + ":")).map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsFq(JsonObject vars) {
		Map<String, SolrResponse.FacetField> facetFields = Optional.ofNullable(facetCounts).map(c -> c.getFacetFields()).map(f -> f.getFacets()).orElse(new HashMap<String,SolrResponse.FacetField>());
		C001L001ChooseDomainName.varsFqForClass().forEach(var -> {
			String varIndexed = C001L001ChooseDomainName.varIndexedC001L001ChooseDomainName(var);
			String varStored = C001L001ChooseDomainName.varStoredC001L001ChooseDomainName(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("varStored", varStored);
			json.put("varIndexed", varIndexed);
			json.put("displayName", Optional.ofNullable(C001L001ChooseDomainName.displayNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(C001L001ChooseDomainName.classSimpleNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListC001L001ChooseDomainName_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(C001L001ChooseDomainName.varIndexedC001L001ChooseDomainName(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
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
			if(defaultPivotVars.contains(var)) {
				json.put("pivot", true);
			}
			vars.put(var, json);
		});
	}

	@Override
	protected void _varsRange(JsonObject vars) {
		C001L001ChooseDomainName.varsRangeForClass().forEach(var -> {
			String varIndexed = C001L001ChooseDomainName.varIndexedC001L001ChooseDomainName(var);
			JsonObject json = new JsonObject();
			json.put("var", var);
			json.put("displayName", Optional.ofNullable(C001L001ChooseDomainName.displayNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("classSimpleName", Optional.ofNullable(C001L001ChooseDomainName.classSimpleNameC001L001ChooseDomainName(var)).map(d -> StringUtils.isBlank(d) ? var : d).orElse(var));
			json.put("val", searchListC001L001ChooseDomainName_.getRequest().getFilterQueries().stream().filter(fq -> fq.startsWith(C001L001ChooseDomainName.varIndexedC001L001ChooseDomainName(var) + ":")).findFirst().map(s -> StringUtils.substringAfter(s, ":")).orElse(null));
			vars.put(var, json);
		});
	}

	@Override
	protected void _query(JsonObject query) {
		ServiceRequest serviceRequest = siteRequest_.getServiceRequest();
		JsonObject params = serviceRequest.getParams();

		JsonObject queryParams = Optional.ofNullable(serviceRequest).map(ServiceRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
		Long num = searchListC001L001ChooseDomainName_.getQueryResponse().getResponse().getNumFound().longValue();
		String q = "*:*";
		String q1 = "objectText";
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

		Long rows1 = Optional.ofNullable(searchListC001L001ChooseDomainName_).map(l -> l.getRows()).orElse(10L);
		Long start1 = Optional.ofNullable(searchListC001L001ChooseDomainName_).map(l -> l.getStart()).orElse(1L);
		Long start2 = start1 - rows1;
		Long start3 = start1 + rows1;
		Long rows2 = rows1 / 2;
		Long rows3 = rows1 * 2;
		start2 = start2 < 0 ? 0 : start2;
		JsonObject fqs = new JsonObject();
		for(String fq : Optional.ofNullable(searchListC001L001ChooseDomainName_).map(l -> l.getFilterQueries()).orElse(Arrays.asList())) {
			if(!StringUtils.contains(fq, "(")) {
				String fq1 = StringUtils.substringBefore(fq, "_");
				String fq2 = StringUtils.substringAfter(fq, ":");
				if(!StringUtils.startsWithAny(fq, "classCanonicalNames_", "archived_", "deleted_", "sessionId", "userKeys"))
					fqs.put(fq1, new JsonObject().put("var", fq1).put("val", fq2).put("displayName", C001L001ChooseDomainName.displayNameForClass(fq1)));
				}
			}
		query.put("fq", fqs);

		JsonArray sorts = new JsonArray();
		for(String sort : Optional.ofNullable(searchListC001L001ChooseDomainName_).map(l -> l.getSorts()).orElse(Arrays.asList())) {
			String sort1 = StringUtils.substringBefore(sort, "_");
			sorts.add(new JsonObject().put("var", sort1).put("order", StringUtils.substringAfter(sort, " ")).put("displayName", C001L001ChooseDomainName.displayNameForClass(sort1)));
		}
		query.put("sort", sorts);
	}

	@Override
	protected void _promiseAfter(Promise<Void> promise) {
		promise.complete();
	}

	@Override
	protected void _pageDescription(Wrap<String> c) {
			c.o("What is the first step to creating my own website? Choose a domain name. ");
	}

	@Override
	protected void _pageImageUri(Wrap<String> c) {
			c.o("/png-999.png");
	}

	@Override
	protected void _pageVideoId(Wrap<String> c) {
			c.o("sBcDnQj9_QM");
	}

	@Override
	protected void _contextIconGroup(Wrap<String> c) {
			c.o("regular");
	}

	@Override
	protected void _contextIconName(Wrap<String> c) {
			c.o("book");
	}
}
