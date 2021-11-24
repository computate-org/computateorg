package org.computate.site.frfr.base;

import java.text.Normalizer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.computate.site.frfr.config.ConfigCles;
import org.computate.site.frfr.couverture.Couverture;
import org.computate.site.frfr.requete.RequeteSiteFrFR;

/**
 * Indexe: true
 * Page: true
 * SuperPage: MiseEnPage
 * MotCle: classeNomSimpleCluster
 */
public class ModeleBase {

	/**
	 * {@inheritDoc}
	 * Ignorer: true
	 */
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * ClePrimaire: true
	 * Modifier: false
	 * HtmlLigne: 1
	 * HtmlCellule: 1
	 * Description.frFR: La clé primaire dans la base de données. 
	 * Description.enUS: The primary key in the database. 
	 * NomAffichage.frFR: clé primaire
	 * NomAffichage.enUS: primary key
	 */
	protected void _pk(Couverture<Long> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * InheritPrimaryKey: true
	 * Definir: true
	 */
	protected void _inheritPk(Couverture<String> w) {}

	/**
	 * {@inheritDoc}
	 * CleUnique: true
	 */
	protected void _id(Couverture<String> w) {
		if(pk != null)
			w.o(getClass().getSimpleName() + "_" + pk.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Definir: true
	 * Modifier: false
	 * VarCree: true
	 * HtmlLigne: 1
	 * HtmlCellule: 2
	 * HtmlColonne: 2
	 * NomAffichage.frFR: crée
	 * NomAffichage.enUS: created
	 * FormatHtm: MMM d, yyyy h:mm:ss a
	 */
	protected void _cree(Couverture<ZonedDateTime> w) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Modifier: false
	 * VarModifie: true
	 * HtmlLigne: 1
	 * HtmlCellule: 3
	 * Description.frFR: La date et l'heure modifiéés. 
	 * Description.enUS: The date and time modified. 
	 * NomAffichage.frFR: modifié
	 * NomAffichage.enUS: modified
	 */ 
	protected void _modifie(Couverture<ZonedDateTime> w) {
		w.o(ZonedDateTime.now(ZoneId.of(requeteSite_.getConfig().getString(ConfigCles.SITE_ZONE))));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Definir: true
	 * HtmlLigne: 2
	 * HtmlCellule: 1
	 * Description.frFR: archivé. 
	 * Description.enUS: archived. 
	 * NomAffichage.frFR: archivé
	 * NomAffichage.enUS: archived
	 */ 
	protected void _archive(Couverture<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Definir: true
	 * HtmlLigne: 2
	 * HtmlCellule: 2
	 * Description.frFR: supprimé. 
	 * Description.enUS: deleted. 
	 * NomAffichage.frFR: supprimé
	 * NomAffichage.enUS: deleted
	 */ 
	protected void _supprime(Couverture<Boolean> w) {
		w.o(false);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 */ 
	protected void _classeNomCanonique(Couverture<String> w) {
		w.o(getClass().getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 */ 
	protected void _classeNomSimple(Couverture<String> w) {
		w.o(getClass().getSimpleName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 */ 
	protected void _classeNomsCanoniques(List<String> l) { 
		Class<?> cl = getClass();
		if(!cl.equals(ModeleBase.class))
			l.add(cl.getCanonicalName());
		l.add(ModeleBase.class.getCanonicalName());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Definir: true
	 * Modifier: false
	 */  
	protected void _sessionId(Couverture<String> c) {
	}

	/**   
	 * {@inheritDoc}
	 * Var.enUS: userKey
	 * DocValues: true
	 * Definir: true
	 * Modifier: false
	 */               
	protected void _utilisateurCle(Couverture<Long> c) {
	}
	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Sauvegardes: true
	 */ 
	protected void _sauvegardes(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarTitle: true
	 * HtmlColonne: 2
	 */ 
	protected void _objetTitre(Couverture<String> w) {
		if(pk != null)
			w.o(pk.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarId: true
	 * HtmlLigne: 1
	 * HtmlCellule: 4
	 * NomAffichage.frFR: ID
	 * NomAffichage.enUS: ID
	 */ 
	protected void _objetId(Couverture<String> c) {
		if(objetTitre != null) {
			c.o(toId(objetTitre));
		}
		else if(pk != null){
			c.o(pk.toString());
		}
	}

	public String toId(String s) {
		if(s != null) {
			s = Normalizer.normalize(s, Normalizer.Form.NFD);
			s = StringUtils.lowerCase(s);
			s = StringUtils.trim(s);
			s = StringUtils.replacePattern(s, "\\s{1,}", "-");
			s = StringUtils.replacePattern(s, "[^\\w-]", "");
			s = StringUtils.replacePattern(s, "-{2,}", "-");
		}

		return s;
	}

	protected void _objetNomVar(Couverture<String> c) {
		if(objectId != null) {
			Class<?> cl = getClass();

			try {
				String o = toId(StringUtils.join(StringUtils.splitByCharacterTypeCamelCase((String)FieldUtils.getField(cl, cl.getSimpleName() + "_NameVar").get(this)), "-"));
				c.o(o);
			} catch (Exception e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * Suggested: true
	 */    
	protected void _objetSuggere(Couverture<String> c) { 
		StringBuilder b = new StringBuilder();
		if(pk != null)
			b.append(" ").append(pk);
		if(objetNomVar != null)
			b.append(" ").append(objetNomVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objetTitre != null)
			b.append(" ").append(objetTitre);
		c.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * Text: true
	 */ 
	protected void _objetTexte(Couverture<String> c) { 
		StringBuilder b = new StringBuilder();
		if(pk != null)
			b.append(" ").append(pk);
		if(objetNomVar != null)
			b.append(" ").append(objetNomVar);
		if(objectId != null)
			b.append(" ").append(objectId);
		if(objetTitre != null)
			b.append(" ").append(objetTitre);
		c.o(b.toString());
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlId: true
	 */ 
	protected void _pageUrlId(Couverture<String> c) {
		if(objectId != null) {
			String o = requeteSite_.getConfig().getString(ConfigCles.SITE_URL_BASE) + "/" + objetNomVar + "/" + objectId;
			c.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarUrlPk: true
	 */ 
	protected void _pageUrlPk(Couverture<String> c) {
		if(pk != null) {
			String o = requeteSite_.getConfig().getString(ConfigCles.SITE_URL_BASE) + "/" + objetNomVar + "/" + pk;
			c.o(o);
		}
	}

	/**	
	 * {@inheritDoc}
	 * DocValues: true
	 **/   
	protected void _pageUrlApi(Couverture<String> c)  {
		if(pk != null) {
			String o = requeteSite_.getConfig().getString(ConfigCles.SITE_URL_BASE) + "/api/" + objetNomVar + "/" + pk;
			c.o(o);
		}
	}

	/**
	 * {@inheritDoc}
	 * H1: true
	 */ 
	protected void _pageH1(Couverture<String> c) {
		try {
			Class<?> cl = getClass();
			c.o((String)FieldUtils.getField(cl, cl.getSimpleName() + "_NomSingulier").get(this) + ": " + objectTitre);
		} catch (Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}
}
