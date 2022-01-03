package com.sahaj.intrw.raj.model;

import java.util.List;

public class Commuter {
	List<Trip> tripList;
	String name;
	boolean dailyCapReached;
	boolean weeklyCapReached;

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

	public boolean isDailyCapReached() {
		return dailyCapReached;
	}

	public void setDailyCapReached(boolean dailyCapReached) {
		this.dailyCapReached = dailyCapReached;
	}

	public boolean isWeeklyCapReached() {
		return weeklyCapReached;
	}

	public void setWeeklyCapReached(boolean weeklyCapReached) {
		this.weeklyCapReached = weeklyCapReached;
	}

}
