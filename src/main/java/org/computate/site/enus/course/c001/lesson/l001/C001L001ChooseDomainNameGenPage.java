package org.computate.site.enus.course.c001.lesson.l001;

import org.computate.site.enus.course.c001.lesson.l001.C001L001ChooseDomainName;
import io.vertx.core.json.JsonObject;
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

	protected void _c001L001ChooseDomainName_(Wrap<C001L001ChooseDomainName> w) {
		w.o(new C001L001ChooseDomainName());
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
		else
			c.o("What is the first step to creating my own website? Choose a domain name. ");
	}

	@Override
	protected void _pageUri(Wrap<String> c) {
		c.o("");
	}

	@Override
	protected void _apiUri(Wrap<String> c) {
		c.o("");
	}

	@Override
	protected void _roles(List<String> l) {
		if(siteRequest_ != null) {
			l.addAll(Stream.concat(siteRequest_.getUserResourceRoles().stream(), siteRequest_.getUserRealmRoles().stream()).distinct().collect(Collectors.toList()));
		}
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
	protected void _pageImageWidth(Wrap<Integer> c) {
			c.o(800);
	}

	@Override
	protected void _pageImageHeight(Wrap<Integer> c) {
			c.o(781);
	}

	@Override
	protected void _pageVideoId(Wrap<String> c) {
			c.o("sBcDnQj9_QM");
	}

	@Override
	protected void _classIconGroup(Wrap<String> c) {
			c.o("regular");
	}

	@Override
	protected void _classIconName(Wrap<String> c) {
			c.o("book");
	}
}
