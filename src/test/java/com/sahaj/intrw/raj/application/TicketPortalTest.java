/**
 * 
 */
package com.sahaj.intrw.raj.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
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

	final void testGetNextFare() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testComputeTotalFare_DailyCap() {
		// Arrange
		List<Trip> trips = new ArrayList<Trip>();
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
		assertEquals(150, total);
	}

	final void testComputeTotalFare_WeeklyCap() {
	}

}
