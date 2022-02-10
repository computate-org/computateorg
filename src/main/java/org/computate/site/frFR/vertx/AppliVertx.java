package org.computate.site.frFR.vertx; 

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpClientUtil;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.cours.CoursEnUSGenApiService;
import org.computate.site.enUS.cours.c001.C001EnUSGenApiService;
import org.computate.site.enUS.cours.c001.C001LeconEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaineEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l002.C001L002ChoisirSystemeExploitationEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7EnUSGenApiService;
import org.computate.site.enUS.cours.c001.l005.C001L005InstallerMavenEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l007.C001L007InstallerPostgresqlEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificatEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeperEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolrEnUSGenApiService;
import org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloakEnUSGenApiService;
import org.computate.site.enUS.page.accueil.PageAccueilEnUSGenApiService;
import org.computate.site.enUS.page.apropos.PageAProposEnUSGenApiService;
import org.computate.site.enUS.page.blog.PageBlogEnUSGenApiService;
import org.computate.site.enUS.page.faq.PageFaqEnUSGenApiService;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.enUS.user.UtilisateurSiteEnUSGenApiService;
import org.computate.site.enus.article.ArticleEnUSGenApiService;
import org.computate.site.frFR.article.ArticleFrFRGenApiService;
import org.computate.site.frFR.cluster.ClusterFrFRGenApiService;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.cours.CoursFrFRGenApiService;
import org.computate.site.frFR.cours.c001.C001FrFRGenApiService;
import org.computate.site.frFR.cours.c001.C001LeconFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirSystemeExploitationFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7FrFRGenApiService;
import org.computate.site.frFR.cours.c001.l005.C001L005InstallerMavenFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipseFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresqlFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificatFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeperFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolrFrFRGenApiService;
import org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloakFrFRGenApiService;
import org.computate.site.frFR.page.accueil.PageAccueilFrFRGenApiService;
import org.computate.site.frFR.page.apropos.PageAProposFrFRGenApiService;
import org.computate.site.frFR.page.blog.PageBlogFrFRGenApiService;
import org.computate.site.frFR.page.faq.PageFaqFrFRGenApiService;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSiteFrFRGenApiService;
import org.computate.site.site.enus.model.base.ClusterEnUSGenApiService;

import io.opentracing.Span;
import io.opentracing.SpanContext;
import io.opentracing.Tracer;
import io.opentracing.Tracer.SpanBuilder;
import io.opentracing.contrib.solr.TracingHttpClient;
import io.opentracing.contrib.solr.TracingHttpSolrClientBuilder;
import io.opentracing.contrib.vertx.ext.web.TracingHandler;
import io.opentracing.util.GlobalTracer;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.net.JksOptions;
import io.vertx.core.shareddata.AsyncMap;
import io.vertx.core.shareddata.SharedData;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ext.auth.oauth2.providers.KeycloakAuth;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.Session;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.ext.web.api.contract.openapi3.impl.AppOpenAPI3RouterFactory;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.OAuth2AuthHandler;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.handler.UserSessionHandler;
import io.vertx.ext.web.sstore.LocalSessionStore;
import io.vertx.serviceproxy.ServiceBinder;

/**
 * Traduire: false
 */
public class AppliVertx extends AbstractVerticle {
	public static final String SQL_createTableC = "create table if not exists c(pk bigserial primary key, ajour boolean, nom_canonique text, cree timestamp with time zone default now(), modifie timestamp with time zone default now(), id_utilisateur text); ";
	public static final String SQL_uniqueIndexC = "create unique index if not exists c_index_utilisateur on c(pk, nom_canonique, id_utilisateur); ";
	public static final String SQL_createTableA = "create table if not exists a(pk bigserial primary key, pk1 bigint, pk2 bigint, entite1 text, entite2 text, actuel boolean, cree timestamp with time zone default now(), modifie timestamp with time zone default now(), foreign key(pk1) references c(pk), foreign key(pk2) references c(pk)); ";
	// public static final String SQL_uniqueIndexA = "create unique index if not
	// exists c_unique_pks on a(pk1, entite1, pk2, entite2); ";
	public static final String SQL_createTableD = "create table if not exists d(pk bigserial primary key, chemin text, valeur text, actuel boolean, cree timestamp with time zone default now(), modifie timestamp with time zone default now(), pk_c bigint, foreign key(pk_c) references c(pk)); ";
	// public static final String SQL_uniqueIndexP = "create unique index if not
	// exists p_index_chemin_pk_o_fk on p(chemin, pk_c); ";
	public static final String SQL_initTout = SQL_createTableC + SQL_uniqueIndexC + SQL_createTableA + SQL_createTableD;

	private JDBCClient jdbcClient;

	private static final Logger LOGGER = LoggerFactory.getLogger(AppliVertx.class);

	public static void main(String[] args) {
		CoureurVertx.run(AppliVertx.class);
	}

	@Override
	public void start(Future<Void> demarrerFuture) throws Exception {

		SiteContexteFrFR siteContexteFrFR = new SiteContexteFrFR();
		siteContexteFrFR.setVertx(vertx);
		siteContexteFrFR.initLoinSiteContexteFrFR();

		SiteContexteEnUS siteContexteEnUS = new SiteContexteEnUS();
		siteContexteEnUS.setVertx(vertx);
		siteContexteEnUS.initLoinSiteContexteEnUS();

		Future<Void> etapesFutures = preparerDonnees(siteContexteFrFR, siteContexteEnUS).compose(a -> 
			configurerCluster(siteContexteFrFR).compose(b -> 
				configurerOpenApi(siteContexteFrFR, siteContexteEnUS).compose(c -> 
					configurerControlesSante(siteContexteFrFR, siteContexteEnUS).compose(d -> 
						configurerExecuteurTravailleurPartage(siteContexteFrFR, siteContexteEnUS).compose(e -> 
							demarrerServeur(siteContexteFrFR, siteContexteEnUS)
						)
					)
				)
			)
		);
		etapesFutures.setHandler(demarrerFuture.completer());
	}

	private Future<Void> preparerDonnees(SiteContexteFrFR siteContexteFrFR, SiteContexteEnUS siteContexteEnUS) {
		ConfigSite configSite = siteContexteFrFR.getConfigSite();
		Future<Void> future = Future.future();

		JsonObject jdbcConfig = new JsonObject();
		if (StringUtils.isNotEmpty(configSite.getJdbcUrl()))
			jdbcConfig.put("url", configSite.getJdbcUrl());
		if (StringUtils.isNotEmpty(configSite.getJdbcClassePilote()))
			jdbcConfig.put("driver_class", configSite.getJdbcClassePilote());
		if (StringUtils.isNotEmpty(configSite.getJdbcUtilisateur()))
			jdbcConfig.put("user", configSite.getJdbcUtilisateur());
		if (StringUtils.isNotEmpty(configSite.getJdbcMotDePasse()))
			jdbcConfig.put("password", configSite.getJdbcMotDePasse());
		if (configSite.getJdbcTailleMaxPiscine() != null)
			jdbcConfig.put("max_pool_size", configSite.getJdbcTailleMaxPiscine());
		if (configSite.getJdbcTailleInitialePiscine() != null)
			jdbcConfig.put("initial_pool_size", configSite.getJdbcTailleInitialePiscine());
		if (configSite.getJdbcTailleMinPiscine() != null)
			jdbcConfig.put("min_pool_size", configSite.getJdbcTailleMinPiscine());
		if (configSite.getJdbcMaxDeclarations() != null)
			jdbcConfig.put("max_statements", configSite.getJdbcMaxDeclarations());
		if (configSite.getJdbcMaxDeclarationsParConnexion() != null)
			jdbcConfig.put("max_statements_per_connection", configSite.getJdbcMaxDeclarationsParConnexion());
		if (configSite.getJdbcTempsInactiviteMax() != null)
			jdbcConfig.put("max_idle_time", configSite.getJdbcTempsInactiviteMax());
		jdbcClient = JDBCClient.createShared(vertx, jdbcConfig);

		siteContexteFrFR.setClientSql(jdbcClient);
		siteContexteEnUS.setClientSql(jdbcClient);

		jdbcClient.getConnection(ar -> {
			if (ar.failed()) {
				System.err.println("Could not open a database connection. ");
				ExceptionUtils.printRootCauseStackTrace(ar.cause());
				future.fail(ar.cause());
			} else {
				SQLConnection connection = ar.result();
				connection.execute(SQL_initTout, create -> {
					connection.close();
					if (create.failed()) {
						LOGGER.error("Database preparation error", create.cause());
						future.fail(create.cause());
					} else {
						future.complete();
					}
				});
			}
		});

		return future;
	}

	private Future<Void> configurerCluster(SiteContexteFrFR siteContexte) {
		ConfigSite configSite = siteContexte.getConfigSite();
		Future<Void> future = Future.future();
		SharedData donneesPartagees = vertx.sharedData();
		donneesPartagees.getClusterWideMap("donneesCluster", res -> {
			if (res.succeeded()) {
				try {
					AsyncMap<Object, Object> donneesCluster = res.result();
					donneesCluster.put("configSite", configSite, resPut -> {
						if (resPut.succeeded()) {
							future.complete();
						} else {
							LOGGER.error("Could not configure the cluster", res.cause());
							future.fail(res.cause());
						}
					});
				} catch (Exception e) {
					LOGGER.error("Could not configure the cluster", res.cause());
					future.fail(e);
				}
			} else {
				LOGGER.error("Could not configure the cluster", res.cause());
				future.fail(res.cause());
			}
		});
		return future;
	}

	private Future<Void> configurerOpenApi(SiteContexteFrFR siteContexteFrFR, SiteContexteEnUS siteContexteEnUS) {
		ConfigSite configSite = siteContexteFrFR.getConfigSite();
		Future<Void> future = Future.future();
		Router routeur = Router.router(vertx);

//		OpenAPI3RouterFactory.create(vertx, "src/main/resources/openapi3.yaml", ar -> {
		AppOpenAPI3RouterFactory.create(vertx, routeur, "openapi3.yaml", ar -> {
			if (ar.succeeded()) {
				AppOpenAPI3RouterFactory usineRouteur = ar.result();
				usineRouteur.mountServicesFromExtensions();
				siteContexteFrFR.setUsineRouteur(usineRouteur);
				siteContexteEnUS.setUsineRouteur(usineRouteur);

				JsonObject keycloakJson = new JsonObject() {
					{
						// put("realm-public-key", "MIIBIjANBgkqhk...wIDAQAB");
						put("realm", configSite.getAuthRoyaume());
						put("resource", configSite.getAuthRessource());
						put("auth-server-url", configSite.getAuthUrl());
						put("ssl-required", configSite.getAuthSslRequis());
						put("use-resource-role-mappings", false);
						put("bearer-only", false);
						put("enable-basic-auth", false);
						put("expose-token", true);
						put("credentials", new JsonObject().put("secret", configSite.getAuthSecret()));
						put("connection-pool-size", 20);
						put("disable-trust-manager", false);
						put("allow-any-hostname", false);
						put("policy-enforcer", new JsonObject());
						put("redirect-rewrite-rules", new JsonObject().put("^(.*)$", "$1"));
					}
				};

				String siteNomHote = configSite.getSiteNomHote();
				Integer sitePort = configSite.getSitePort();
//				String siteUrlBase = "https://" + siteNomHote + ":" + sitePort;
				String siteUrlBase = configSite.getSiteUrlBase();
				OAuth2Auth authFournisseur = KeycloakAuth.create(vertx, OAuth2FlowType.AUTH_CODE, keycloakJson);

				routeur.route().handler(CookieHandler.create());
				routeur.route().handler(SessionHandler.create(LocalSessionStore.create(vertx)));

				routeur.route().handler(UserSessionHandler.create(authFournisseur));

				OAuth2AuthHandler gestionnaireAuth = OAuth2AuthHandler.create(authFournisseur,
						siteUrlBase + "/callback");

				gestionnaireAuth.setupCallback(routeur.get("/callback"));

				routeur.get("/deconnexion").handler(rc -> {
					Session session = rc.session();
					if (session != null) {
						session.destroy();
					}
					rc.clearUser();
					rc.reroute("/");
				});

				usineRouteur.addSecurityHandler("openIdConnect", gestionnaireAuth);

				usineRouteur.initRouter();

				future.complete();
			} else {
				LOGGER.error("Could not configure the api", ar.cause());
				future.fail(ar.cause());
			}
		});
		return future;
	}

	public AppliVertx setupCallback(SiteContexteFrFR siteContexte, String callbackPath) { 
		OpenAPI3RouterFactory usineRouteur = siteContexte.getUsineRouteur();
		OAuth2AuthHandler gestionnaireAuth = siteContexte.getGestionnaireAuth();
		ConfigSite configSite = siteContexte.getConfigSite();
		String siteNomHote = configSite.getSiteNomHote();
		Integer sitePort = configSite.getSitePort();
		String siteUrlBase = "https://" + siteNomHote + ":" + sitePort;
		OAuth2Auth authFournisseur = siteContexte.getAuthFournisseur();

		Route route = usineRouteur.getRouter().get(callbackPath);

		if (callbackPath != null && !"".equals(callbackPath)) {
			// no matter what path was provided we will make sure it is the correct one
			route.path(callbackPath);
		}

		route.method(HttpMethod.GET);

		route.handler(ctx -> {
			// Handle the callback of the flow
			final String code = ctx.request().getParam("code");

			// code is a require value
			if (code == null) {
				ctx.fail(400);
				return;
			}

			final String state = ctx.request().getParam("state");

			final JsonObject config = new JsonObject().put("code", code);

			if (siteUrlBase != null) {
				config.put("redirect_uri", siteUrlBase + route.getPath());
			}

			// if (extraParams != null) {
			// config.mergeIn(extraParams);
			// }

			authFournisseur.authenticate(config, res -> {
				if (res.failed()) {
					ctx.fail(res.cause());
				} else {
					ctx.setUser(res.result());
					Session session = ctx.session();
					if (session != null) {
						// the user has upgraded from unauthenticated to authenticated
						// session should be upgraded as recommended by owasp
						session.regenerateId();
						// we should redirect the UA so this link becomes invalid
						ctx.response()
								// disable all caching
								.putHeader(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, must-revalidate")
								.putHeader("Pragma", "no-cache").putHeader(HttpHeaders.EXPIRES, "0")
								// redirect (when there is no state, redirect to home
								.putHeader(HttpHeaders.LOCATION, state != null ? state : "/").setStatusCode(302)
								.end("Redirecting to " + (state != null ? state : "/") + ".");
					} else {
						// there is no session object so we cannot keep state
						ctx.reroute(state != null ? state : "/");
					}
				}
			});
		});

		return this;
	}

	private <T> void enregistrerService(ServiceBinder serviceBinder, T service) {
		Class<T> c = (Class<T>)service.getClass();
		MessageConsumer<JsonObject> calculInrApiConsumer = serviceBinder.register(c, service);
	}

	private Future<Void> configurerExecuteurTravailleurPartage(SiteContexteFrFR siteContexteFrFR, SiteContexteEnUS siteContexteEnUS) {
		Future<Void> future = Future.future();

		WorkerExecutor executeurTravailleur = vertx.createSharedWorkerExecutor("WorkerExecutor");
		siteContexteFrFR.setExecuteurTravailleur(executeurTravailleur);
		siteContexteEnUS.setExecuteurTravailleur(executeurTravailleur);
		future.complete();
		return future;
	}

	private Future<Void> configurerControlesSante(SiteContexteFrFR siteContexteFrFR, SiteContexteEnUS siteContexteEnUS) {
		Future<Void> future = Future.future();
		Router siteRouteur = siteContexteFrFR.getUsineRouteur().getRouter();
		HealthCheckHandler healthCheckHandler = HealthCheckHandler.create(vertx);

		healthCheckHandler.register("database", 2000, a -> {
			siteContexteFrFR.getClientSql().queryWithParams("select current_timestamp"
					, new JsonArray(Arrays.asList())
					, selectCAsync
			-> {
				if(selectCAsync.succeeded()) {
					a.complete(Status.OK());
				} else {
					LOGGER.error("The vertx application is down. ", a.cause());
					future.fail(a.cause());
				}
			});
		});
		healthCheckHandler.register("solr", 2000, a -> {
			SolrQuery query = new SolrQuery();
			query.setQuery("*:*");
			try {
				QueryResponse r = siteContexteFrFR.getClientSolr().query(query);
				if(r.getResults().size() > 0)
					a.complete(Status.OK());
				else {
					LOGGER.error("The solr application is empty. ", a.cause());
					future.fail(a.cause());
				}
			} catch (SolrServerException | IOException e) {
				LOGGER.error("The solr application is down. ", a.cause());
				future.fail(a.cause());
			}
		});
		siteRouteur.get("/health").handler(healthCheckHandler);
		future.complete();
		return future;
	}

	/**
	 * r: FrFR
	 * r.enUS: EnUS
	 */ 
	private Future<Void> demarrerServeur(SiteContexteFrFR siteContexteFrFR, SiteContexteEnUS siteContexteEnUS) {
		ConfigSite configSite = siteContexteFrFR.getConfigSite();
		Future<Void> future = Future.future();

		PageBlogFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		PageBlogEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		PageAccueilFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		PageAccueilEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		PageAProposFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		PageAProposEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		PageFaqFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		PageFaqEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		UtilisateurSiteFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		UtilisateurSiteEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L002ChoisirSystemeExploitationFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L002ChoisirSystemeExploitationEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L001ChoisirNomDomaineFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L001ChoisirNomDomaineEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L004InstallerCentos7FrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L004InstallerCentos7EnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L005InstallerMavenFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L005InstallerMavenEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L006InstallerEclipseFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L006InstallerEclipseEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L007InstallerPostgresqlFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L007InstallerPostgresqlEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L008CreerCertificatFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L008CreerCertificatEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L009InstallerZookeeperFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L009InstallerZookeeperEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L010InstallerSolrFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L010InstallerSolrEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001L011InstallerKeycloakFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001L011InstallerKeycloakEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001LeconFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001LeconEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		C001FrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		C001EnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		CoursFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		CoursEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		ArticleFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		ArticleEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		ClusterFrFRGenApiService.enregistrerService(siteContexteFrFR, vertx);
		ClusterEnUSGenApiService.enregistrerService(siteContexteEnUS, vertx);

		Router siteRouteur = siteContexteFrFR.getUsineRouteur().getRouter();
		// siteContexte.setSiteRouteur_(siteRouteur);


//		siteRouteur.route().order(-2).handler(siteContexteFrFR.getSiteTracingHandler()).failureHandler(siteContexteFrFR.getSiteTracingHandler());

		StaticHandler staticHandler = StaticHandler.create().setCachingEnabled(false).setFilesReadOnly(true);
		if("site.computate.org".equals(configSite.getSiteNomHote())) {
			staticHandler.setAllowRootFileSystemAccess(true);
			staticHandler.setWebRoot("/usr/local/src/computate.org-static");
		}
		siteRouteur.route("/static/*").handler(staticHandler);

		String siteNomHote = configSite.getSiteNomHote();
		Integer sitePort = configSite.getSitePort();
		HttpServerOptions options = new HttpServerOptions();
		// options.setMaxWebsocketFrameSize(1000000);
		if(new File(configSite.getSslJksChemin()).exists()) {
			options.setKeyStoreOptions(
					new JksOptions().setPath(configSite.getSslJksChemin()).setPassword(configSite.getSslJksMotDePasse()));
			options.setSsl(true);
		}
		options.setPort(sitePort);
//		options.setHost("localhost");

		LOGGER.info(String.format("HTTP server starting: %s://%s:%s", "https", siteNomHote, sitePort));
		vertx.createHttpServer(options).requestHandler(siteRouteur).listen(ar -> {
			if (ar.succeeded()) {
				LOGGER.info(String.format("HTTP server running: %s:%s", "*", sitePort));
				future.complete();
			} else {
				LOGGER.error("Could not start a HTTP server", ar.cause());
				future.fail(ar.cause());
			}
		});

		return future;
	}
}
