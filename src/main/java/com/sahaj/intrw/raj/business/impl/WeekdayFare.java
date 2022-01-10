package com.sahaj.intrw.raj.business.impl;

import com.sahaj.intrw.raj.business.FareCalculation;
import com.sahaj.intrw.raj.model.Trip;

public class WeekdayFare extends FareCalculation {
	private final String WEEKDAY_MORNING_START = "peak.hours.weekday.morning.start";
	private final String WEEKDAY_MORNING_END = "peak.hours.weekday.morning.end";
	private final String WEEKDAY_EVENING_START = "peak.hours.weekday.evening.start";
	private final String WEEKDAY_EVENING_END = "peak.hours.weekday.evening.end";

	public WeekdayFare() {
		init();
	}

	private void init() {
		setPeakHours(mrngOpenHour, WEEKDAY_MORNING_START);
		setPeakHours(mrngClosingHour, WEEKDAY_MORNING_END);
		setPeakHours(evngOpenHour, WEEKDAY_EVENING_START);
		setPeakHours(evngClosingHour, WEEKDAY_EVENING_END);

	}

	@Override
	public Integer getFare(Trip trip) {
		return getZoneBasedFare(trip, isPeakHours(trip));

	}

}
