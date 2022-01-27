/**
 * 
 */
package com.sahaj.intrw.raj.application;

import java.time.DayOfWeek;

import com.sahaj.intrw.raj.business.FareCalculation;
import com.sahaj.intrw.raj.business.FareCapping;
import com.sahaj.intrw.raj.business.impl.WeekdayFare;
import com.sahaj.intrw.raj.business.impl.WeekendFare;
import com.sahaj.intrw.raj.model.Commuter;
import com.sahaj.intrw.raj.model.Trip;
import com.sahaj.intrw.raj.util.TicketingUtils;
import com.sahaj.intrw.raj.util.Zones;

/**
 * @author Raj
 *
 */
public class TicketPortal {

	FareCapping fareCap;

	FareCalculation fareCal;

	TicketingUtils util = new TicketingUtils();

	// utility method to find out the next fare after the daily/weekly capping and
	// peak hour calculations
	public Integer getNextFare(Commuter c) {

		return 0;
	}

	// service method for calculating the fare
	public Integer computeTotalFare(Commuter c) {
		int fare = 0;
		Zones zone = util.getApplicableZone(c);
		int dailyCapfare = fareCap.getCapFare();

		DayOfWeek dayReset = null;
		// Applicable Cap is based on longest travel
		for (Trip trip : c.getTripList()) {
			if (dayReset == null) {
				dayReset = trip.getDay();
			} else {
				if(!trip.getDay().equals(dayReset)) {
					c.resetDailyFare();
				}
				if(trip.getDay().equals(DayOfWeek.SUNDAY)) {
					c.resetWeeklyFare();
				}
			}

			int tripFare = processTripFare(trip);
			if (c.getDailyFare() + tripFare > dailyCapfare) {
				int diff = c.getDailyFare() + tripFare - dailyCapfare;
				tripFare -= diff;
			}
			trip.setFare(tripFare);
			fare += tripFare;
		}
		c.addDailyFare(fare);
		c.addWeeklyFare(fare);
		return fare;
	}

	private Integer processTripFare(Trip trip) {
		fareCal = util.isWeekend(trip) ? new WeekendFare() : new WeekdayFare();
		return fareCal.getFare(trip);

	}

}
