package com.sahaj.intrw.raj.model;

import java.util.LinkedList;
import java.util.List;

public class Commuter {
	List<Trip> tripList;
	String name;
	boolean dailyCapReached;
	boolean weeklyCapReached;
	Integer dailyFare;
	Integer weeklyFare;

	public Commuter(String name) {
		// initializations
		this.name = name;
		this.tripList = new LinkedList<Trip>();
		this.dailyFare = 0;
		this.weeklyFare = 0;
		this.dailyCapReached = false;
		this.weeklyCapReached = false;
	}

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

	public Integer getDailyFare() {
		return dailyFare;
	}

	public void resetDailyFare() {
		this.dailyFare = 0;
	}

	public void addDailyFare(Integer dailyFare) {
		this.dailyFare += dailyFare;
	}

	public Integer getWeeklyFare() {
		return weeklyFare;
	}

	public void resetWeeklyFare() {
		this.weeklyFare = 0;
	}

	public void addWeeklyFare(Integer weeklyFare) {
		this.weeklyFare += weeklyFare;
	}

	@Override
	public String toString() {
		return "Commuter [tripList=" + tripList + ", name=" + name + ", dailyCapReached=" + dailyCapReached
				+ ", weeklyCapReached=" + weeklyCapReached + ", dailyFare=" + dailyFare + ", weeklyFare=" + weeklyFare
				+ "]";
	}

}
