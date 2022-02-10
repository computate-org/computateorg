package org.computate.site.enUS.cours.c001.l003;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	/////////////////////////////////////////////////
	// c001L003InstallerMachineVirtuelleVirtualBox //
	/////////////////////////////////////////////////

	/**	L'entité « c001L003InstallerMachineVirtuelleVirtualBox »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L003InstallerMachineVirtuelleVirtualBox c001L003InstallerMachineVirtuelleVirtualBox;
	public Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c001L003InstallerMachineVirtuelleVirtualBoxCouverture = new Couverture<C001L003InstallerMachineVirtuelleVirtualBox>().p(this).c(C001L003InstallerMachineVirtuelleVirtualBox.class).var("c001L003InstallerMachineVirtuelleVirtualBox").o(c001L003InstallerMachineVirtuelleVirtualBox);

	/**	<br/>L'entité « c001L003InstallerMachineVirtuelleVirtualBox »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L003InstallerMachineVirtuelleVirtualBox">Trouver l'entité c001L003InstallerMachineVirtuelleVirtualBox dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L003InstallerMachineVirtuelleVirtualBox(Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c);

	public C001L003InstallerMachineVirtuelleVirtualBox getC001L003InstallerMachineVirtuelleVirtualBox() {
		return c001L003InstallerMachineVirtuelleVirtualBox;
	}

	public void setC001L003InstallerMachineVirtuelleVirtualBox(C001L003InstallerMachineVirtuelleVirtualBox c001L003InstallerMachineVirtuelleVirtualBox) {
		this.c001L003InstallerMachineVirtuelleVirtualBox = c001L003InstallerMachineVirtuelleVirtualBox;
		this.c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage c001L003InstallerMachineVirtuelleVirtualBoxInit() {
		if(!c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise) {
			_c001L003InstallerMachineVirtuelleVirtualBox(c001L003InstallerMachineVirtuelleVirtualBoxCouverture);
			if(c001L003InstallerMachineVirtuelleVirtualBox == null)
				setC001L003InstallerMachineVirtuelleVirtualBox(c001L003InstallerMachineVirtuelleVirtualBoxCouverture.o);
		}
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.initLoinPourClasse(requeteSite_);
		c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage = false;

	public C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
		c001L003InstallerMachineVirtuelleVirtualBoxInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(String var) {
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage oC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage)this;
		switch(var) {
			case "c001L003InstallerMachineVirtuelleVirtualBox":
				return oC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage.c001L003InstallerMachineVirtuelleVirtualBox;
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage oC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage)this;
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage() {
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage that = (C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
