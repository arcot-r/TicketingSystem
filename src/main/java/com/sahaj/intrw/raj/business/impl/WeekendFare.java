package com.sahaj.intrw.raj.business.impl;

import com.sahaj.intrw.raj.business.FareCalculation;
import com.sahaj.intrw.raj.model.Trip;

public class WeekendFare extends FareCalculation {
	private final String WEEKEND_MORNING_START = "peak.hours.weekend.morning.start";
	private final String WEEKEND_MORNING_END = "peak.hours.weekend.morning.end";
	private final String WEEKEND_EVENING_START = "peak.hours.weekend.evening.start";
	private final String WEEKEND_EVENING_END = "peak.hours.weekend.evening.end";

	public WeekendFare() {
		init();
	}

	private void init() {
		setPeakHours(mrngOpenHour, WEEKEND_MORNING_START);
		setPeakHours(mrngClosingHour, WEEKEND_MORNING_END);
		setPeakHours(evngOpenHour, WEEKEND_EVENING_START);
		setPeakHours(evngClosingHour, WEEKEND_EVENING_END);

	}

	@Override
	public Integer getFare(Trip trip) {
		return getZoneBasedFare(trip, isPeakHours(trip));
	}


}
