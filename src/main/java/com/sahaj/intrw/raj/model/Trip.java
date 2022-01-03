package com.sahaj.intrw.raj.model;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Trip {
	private DayOfWeek day;
	private Integer fromZone;
	private Integer toZone;
	private Calendar tripTime;
	private Integer fare;

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

	public Calendar getTripTime() {
		return tripTime;
	}

	public void setTripTime(Calendar tripTime) {
		this.tripTime = tripTime;
	}

	public Integer getFare() {
		return fare;
	}

	public void setFare(Integer fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Trip [day=" + day + ", fromZone=" + fromZone + ", toZone=" + toZone + ", tripTime=" + tripTime
				+ ", fare=" + fare + "]";
	}

}
