package org.computate.site.frfr.requete.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

import org.computate.site.frfr.config.ConfigCles;
import org.computate.site.frfr.couverture.Couverture;
import org.computate.site.frfr.requete.RequeteSiteFrFR;

/**    
 * MotCle: classeNomSimpleRequeteApi
*/  
public class RequeteApi extends RequeteApiGen<Object> {

	/**
	 * {@inheritDoc}
	 * Ignorer: true
	 */        
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * VarCree: true
	 * NomAffichage.frFR: crée
	 * NomAffichage.enUS: created
	 */   
	protected void _cree(Couverture<ZonedDateTime> c) {
		c.o(ZonedDateTime.now(ZoneId.of(requeteSite_.getConfig().getString(ConfigCles.SITE_ZONE))));
	}

	/**
	 * DocValues: true
	 */   
	protected void _rows(Couverture<Integer> c) {
	}

	/**
	 * DocValues: true
	 */   
	protected void _numFound(Couverture<Long> c) {
	}

	/**
	 * DocValues: true
	 */   
	protected void _numPATCH(Couverture<Long> c) {
		c.o(0L);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * NomAffichage.frFR: UUID
	 * NomAffichage.enUS: UUID
	 */                 
	protected void _uuid(Couverture<String> c) {
		c.o(UUID.randomUUID().toString());
	}

	protected void _id(Couverture<String> c) {
		c.o("PATCH-" + uuid);
	}

	protected void _pk(Couverture<Long> c) {
	}

	/**
	 * Ignorer: true
	 */
	protected void _original(Couverture<Object> c) {
	}

	protected void _pks(List<Long> c) {
	}

	protected void _classes(List<String> c) {
	}

	protected void _vars(List<String> c) {
	}

	protected void _timeRemaining(Couverture<String> w) {
		w.o(calculateTimeRemaining());
	}

	public String calculateTimeRemaining() {
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of(requeteSite_.getConfig().getString(ConfigCles.SITE_ZONE)));
		Long timeDifferenceNow = ChronoUnit.SECONDS.between(cree, now);
		Double ratio = ((double) numPATCH / numFound);
		Double remainingSeconds = ((double) timeDifferenceNow) / ratio - ((double) timeDifferenceNow);

		// Calculating the difference in Hours
		Long hours = ((Double) (remainingSeconds / 60 / 60)).longValue();

		// Calculating the difference in Minutes
		Long minutes = ((Double) ((remainingSeconds / 60) % 60)).longValue();

		// Calculating the difference in Seconds
		Long seconds = ((Double) (remainingSeconds % 60)).longValue();

		return (hours > 0L ? hours + " hours " : "") + (minutes > 0L ? minutes + " minutes " : "") + (hours == 0L && minutes <= 1L ? seconds + " seconds." : "");
	}
}
