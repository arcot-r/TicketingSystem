/**
 * 
 */
package com.sahaj.intrw.raj.application;

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

	FareCapping dailyCap;
	FareCapping weeklyCap;

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
		c.updateApplicableZones(dailyCap, weeklyCap);
		int dailyCapfare = dailyCap.getCapFare();
		int weeklyCapFare = weeklyCap.getCapFare();
		//Applicable Cap based on longest travel
		for (Trip trip : c.getTripList()) {
			int tripFare = computeFare(trip);
			if(c.getDailyFare()+tripFare > dailyCapfare) {
				int diff = c.getDailyFare() +tripFare - dailyCapfare;
				tripFare-=diff; 
			}
			trip.setFare(tripFare);
			fare += tripFare;
		}
		c.setDailyFare(fare);
		return fare;
	}

	
	private Integer computeFare(Trip trip) {
		fareCal = util.isWeekend(trip) ? new WeekendFare() : new WeekdayFare();
		return fareCal.getFare(trip);

	}

}
