package com.sahaj.intrw.raj.business;

import java.util.Arrays;
import java.util.Calendar;

import com.sahaj.intrw.raj.model.Trip;
import com.sahaj.intrw.raj.util.TicketingUtils;

public abstract class FareCalculation {

	protected Calendar mrngOpenHour = Calendar.getInstance();
	protected Calendar mrngClosingHour = Calendar.getInstance();
	protected Calendar evngOpenHour = Calendar.getInstance();
	protected Calendar evngClosingHour = Calendar.getInstance();
	protected TicketingUtils util = new TicketingUtils();

	protected void setPeakHours(Calendar cal, String key) {
		cal.set(Calendar.HOUR_OF_DAY, getTime(key)[0]);
		cal.set(Calendar.MINUTE, getTime(key)[1]);

	}

	protected int[] getTime(String key) {
		String time = util.getPropValue(key);
		int[] array = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
		return array;

	}

	protected boolean isPeakHours(Trip trip) {
		Calendar tripTime = trip.getTripTime();
		return tripTime.after(mrngOpenHour) && tripTime.before(mrngClosingHour)
				|| tripTime.after(evngOpenHour) && tripTime.before(evngClosingHour);
	};

	protected Integer getZoneBasedFare(Trip trip, boolean peakHours) {
		if (peakHours) {
			if (trip.getFromZone() != trip.getToZone()) {// Different Zones
				return util.getPropIntValue("peak.fare.z1.z2");
			} else {// Same zones
				return (trip.getFromZone() == 1) ? util.getPropIntValue("peak.fare.z1.z1")
						: util.getPropIntValue("peak.fare.z2.z2");
			}
		} else {
			if (trip.getFromZone() != trip.getToZone()) {// Different Zones
				return util.getPropIntValue("offpeak.fare.z1.z2");
			} else {// Same zones
				return (trip.getFromZone() == 1) ? util.getPropIntValue("offpeak.fare.z1.z1")
						: util.getPropIntValue("offpeak.fare.z2.z2");
			}
		}
	}

	public abstract Integer getFare(Trip trip);

}
