/**
 * 
 */
package com.sahaj.intrw.raj.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sahaj.intrw.raj.model.Commuter;
import com.sahaj.intrw.raj.model.Trip;

/**
 * @author Raj
 *
 */
class TicketPortalTest {

	Commuter commuter;
	TicketPortal portal;

	@BeforeEach
	void setUp() throws Exception {
		commuter = new Commuter("test");
		portal = new TicketPortal();

	}

	@AfterEach
	void tearDown() throws Exception {
		commuter = null;
		portal = null;
	}

	@Test
	final void coomputeTotalFare_DailyCapTest() {
		// Arrange
		List<Trip> trips = new LinkedList<Trip>();
		Trip trip;
		Calendar cal;
		// Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		commuter.setTripList(trips);
		// Action
		Integer total = portal.computeTotalFare(commuter);
		// Assert
		assertEquals(120, total);
	}

	@Test
	final void computeTotalFare_WeeklyCapTest() {
		// Arrange
		List<Trip> trips = new LinkedList<Trip>();
		Trip trip;
		Calendar cal;

		// Monday: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// Monday:Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Monday: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Monday:Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Monday: Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		// Tuesday: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.TUESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// Tuesday: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.TUESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Tuesday: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.TUESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Tuesday: Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.TUESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// Tuesday: Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.TUESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		// WEDNESDAY: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.WEDNESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// WEDNESDAY: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.WEDNESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// WEDNESDAY: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.WEDNESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// WEDNESDAY: Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.WEDNESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// WEDNESDAY: Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.WEDNESDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		// THURSDAY: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.THURSDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// THURSDAY: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.THURSDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// THURSDAY: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.THURSDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// THURSDAY: Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.THURSDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// THURSDAY: Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.THURSDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		// FRIDAY: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.FRIDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 40);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// FRIDAY: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.FRIDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// FRIDAY: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.FRIDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 17);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);

		// SATURDAY: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.SATURDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// SATURDAY: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.SATURDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);
		

		// SUNDAY: Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.SUNDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// SUNDAY: Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.SUNDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// SUNDAY: Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.SUNDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// SUNDAY: Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.SUNDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// SUNDAY: Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.SUNDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		// MONDAY: week2 Row 1
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 20);
		trip.setTripTime(cal);
		trip.setFromZone(2);
		trip.setToZone(1);
		trips.add(trip);
		// MONDAY: week2 Row 2
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 45);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// MONDAY: week2 Row 3
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// MONDAY: week2 Row 4
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.MINUTE, 15);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(1);
		trips.add(trip);
		// MONDAY: week2 Row 5
		trip = new Trip();
		trip.setDay(DayOfWeek.MONDAY);
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 19);
		cal.set(Calendar.MINUTE, 00);
		trip.setTripTime(cal);
		trip.setFromZone(1);
		trip.setToZone(2);
		trips.add(trip);

		commuter.setTripList(trips);

		// Action
		Integer total = portal.computeTotalFare(commuter);
		// Assert
		assertEquals(835, total);
	}

}
