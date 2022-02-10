package org.computate.site.enUS.cours.c001.l009;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeperEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerZookeeperEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	////////////////////////////////
	// c001L009InstallerZookeeper //
	////////////////////////////////

	/**	L'entité « c001L009InstallerZookeeper »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L009InstallerZookeeper c001L009InstallerZookeeper;
	public Couverture<C001L009InstallerZookeeper> c001L009InstallerZookeeperCouverture = new Couverture<C001L009InstallerZookeeper>().p(this).c(C001L009InstallerZookeeper.class).var("c001L009InstallerZookeeper").o(c001L009InstallerZookeeper);

	/**	<br/>L'entité « c001L009InstallerZookeeper »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeperEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L009InstallerZookeeper">Trouver l'entité c001L009InstallerZookeeper dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L009InstallerZookeeper(Couverture<C001L009InstallerZookeeper> c);

	public C001L009InstallerZookeeper getC001L009InstallerZookeeper() {
		return c001L009InstallerZookeeper;
	}

	public void setC001L009InstallerZookeeper(C001L009InstallerZookeeper c001L009InstallerZookeeper) {
		this.c001L009InstallerZookeeper = c001L009InstallerZookeeper;
		this.c001L009InstallerZookeeperCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeperEnUSGenPage c001L009InstallerZookeeperInit() {
		if(!c001L009InstallerZookeeperCouverture.dejaInitialise) {
			_c001L009InstallerZookeeper(c001L009InstallerZookeeperCouverture);
			if(c001L009InstallerZookeeper == null)
				setC001L009InstallerZookeeper(c001L009InstallerZookeeperCouverture.o);
		}
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.initLoinPourClasse(requeteSite_);
		c001L009InstallerZookeeperCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeperEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerZookeeperEnUSGenPage = false;

	public C001L009InstallerZookeeperEnUSGenPage initLoinC001L009InstallerZookeeperEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerZookeeperEnUSGenPage) {
			dejaInitialiseC001L009InstallerZookeeperEnUSGenPage = true;
			initLoinC001L009InstallerZookeeperEnUSGenPage();
		}
		return (C001L009InstallerZookeeperEnUSGenPage)this;
	}

	public void initLoinC001L009InstallerZookeeperEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L009InstallerZookeeperEnUSGenPage();
	}

	public void initC001L009InstallerZookeeperEnUSGenPage() {
		c001L009InstallerZookeeperInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L009InstallerZookeeperEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerZookeeperEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L009InstallerZookeeperEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerZookeeperEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerZookeeperEnUSGenPage(String var) {
		C001L009InstallerZookeeperEnUSGenPage oC001L009InstallerZookeeperEnUSGenPage = (C001L009InstallerZookeeperEnUSGenPage)this;
		switch(var) {
			case "c001L009InstallerZookeeper":
				return oC001L009InstallerZookeeperEnUSGenPage.c001L009InstallerZookeeper;
			default:
				return super.obtenirC001LeconEnUSPage(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerC001L009InstallerZookeeperEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerZookeeperEnUSGenPage(String var, Object val) {
		C001L009InstallerZookeeperEnUSGenPage oC001L009InstallerZookeeperEnUSGenPage = (C001L009InstallerZookeeperEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconEnUSPage(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirC001L009InstallerZookeeperEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerZookeeperEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerZookeeperEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerZookeeperEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerZookeeperEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerZookeeperEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerZookeeperEnUSGenPage();
	}

	public void htmlBodyCourtC001L009InstallerZookeeperEnUSGenPage() {
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerZookeeperEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerZookeeperEnUSGenPage() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001L009InstallerZookeeperEnUSGenPage))
			return false;
		C001L009InstallerZookeeperEnUSGenPage that = (C001L009InstallerZookeeperEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerZookeeperEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
