package com.sahaj.intrw.raj.model;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Trip {
	private DayOfWeek day;
	private Integer fromZone;
	private Integer toZone;
	private Integer calculatedFare;
	private Calendar tripTime;

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Integer getFromZone() {
		return fromZone;
	}

	public void setFromZone(Integer fromZone) {
		this.fromZone = fromZone;
	}

	public Integer getToZone() {
		return toZone;
	}

	public void setToZone(Integer toZone) {
		this.toZone = toZone;
	}

	public Integer getCalculatedFare() {
		return calculatedFare;
	}

	public void setCalculatedFare(Integer calculatedFare) {
		this.calculatedFare = calculatedFare;
	}

	public Calendar getTripTime() {
		return tripTime;
	}

	public void setTripTime(Calendar tripTime) {
		this.tripTime = tripTime;
	}

	@Override
	public String toString() {
		return "Trip [day=" + day + ", fromZone=" + fromZone + ", toZone=" + toZone + ", calculatedFare="
				+ calculatedFare + ", tripTime=" + tripTime + "]";
	}

}
