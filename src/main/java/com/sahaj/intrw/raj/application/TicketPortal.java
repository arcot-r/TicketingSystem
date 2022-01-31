/**
 * 
 */
package com.sahaj.intrw.raj.application;

import java.time.DayOfWeek;

import com.sahaj.intrw.raj.business.FareCalculation;
import com.sahaj.intrw.raj.business.FareCapping;
import com.sahaj.intrw.raj.business.impl.DailyFareCapping;
import com.sahaj.intrw.raj.business.impl.WeekdayFare;
import com.sahaj.intrw.raj.business.impl.WeekendFare;
import com.sahaj.intrw.raj.business.impl.WeeklyFareCapping;
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

	// service method for calculating the fare
	public Integer computeTotalFare(Commuter commuter) {
		int fare = 0;
		boolean isDaily = true;
		int dailyCapfare = getCappedFare(commuter, isDaily);
		int weeklyCapFare = getCappedFare(commuter, !isDaily);

		DayOfWeek prevDay = null;
		// Applicable Cap is based on longest travel
		for (Trip trip : commuter.getTripList()) {
			if (prevDay == null) {
				prevDay = trip.getDay();
			}
			// if previous day is not equal to today == Day Changed.
			if (!trip.getDay().equals(prevDay)) {
				commuter.resetDailyFare();
				commuter.setDailyCapReached(false);
			}
			// if previous day is greater than or equal to sunday AND today is monday ==
			// Week changed.
			if (DayOfWeek.SUNDAY.compareTo(prevDay) >= 0 && trip.getDay().equals(DayOfWeek.MONDAY)) {
				commuter.resetWeeklyFare();
				commuter.setWeeklyCapReached(false);
			}

			int tripFare = getPeakFare(trip);

			// Fare Capping Reached
			if (commuter.isDailyCapReached() || commuter.isWeeklyCapReached()) {
				tripFare = 0;
			} else {
				// Near to Fare Cap limits
				if (commuter.getDailyFare() + tripFare > dailyCapfare) {
					commuter.setDailyCapReached(true);
					tripFare -= commuter.getDailyFare() + tripFare - dailyCapfare;
				} else if (commuter.getWeeklyFare() + tripFare > weeklyCapFare) {
					commuter.setWeeklyCapReached(true);
					tripFare -= commuter.getWeeklyFare() + tripFare - weeklyCapFare;
				}

			}
			trip.setFare(tripFare);
			fare += tripFare;
			commuter.addDailyFare(tripFare);
			commuter.addWeeklyFare(tripFare);
		}

		return fare;
	}

	private Integer getPeakFare(Trip trip) {
		fareCal = util.isWeekend(trip) ? new WeekendFare() : new WeekdayFare();
		return fareCal.getFare(trip);

	}

	private Integer getCappedFare(Commuter commuter, boolean isDaily) {
		fareCap = isDaily ? new DailyFareCapping() : new WeeklyFareCapping();
		Zones zone = util.getApplicableZone(commuter);
		fareCap.setZone(zone);
		return fareCap.getCapFare();

	}

}
