package com.sahaj.intrw.raj.model;

import java.util.List;

public class Commuter {
	List<Trip> tripList;
	String name;
	boolean hasDailyCapReached;
	boolean hasWeeklyCapReached;
	Integer cumulatedDailyFare = 0;
	Integer cumulativeWeeklyFare = 0;

	public List<Trip> getTripList() {
		return tripList;
	}

	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean hasDailyCapReached() {
		return hasDailyCapReached;
	}

	public boolean hasWeeklyCapReached() {
		return hasWeeklyCapReached;
	}

	public Integer getCumulatedDailyFare() {
		return cumulatedDailyFare;
	}

	public void setCumulatedDailyFare(Integer cumulatedDailyFare) {
		this.cumulatedDailyFare += cumulatedDailyFare;
	}

	public Integer getCumulativeWeeklyFare() {
		return cumulativeWeeklyFare;
	}

	public void setCumulativeWeeklyFare(Integer cumulativeWeeklyFare) {
		this.cumulativeWeeklyFare += cumulativeWeeklyFare;
	}

}
