package com.sahaj.intrw.raj.model;

import java.util.List;

public class Commuter {
	List<Trip> tripList;
	String name;
	boolean dailyCapReached;
	boolean weeklyCapReached;
	Integer dailyFare;
	Integer weeklyFare;
	
	Commuter(String name){
		this.name=name;
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

	public void setDailyFare(Integer dailyFare) {
		this.dailyFare = dailyFare;
	}

	public Integer getWeeklyFare() {
		return weeklyFare;
	}

	public void setWeeklyFare(Integer weeklyFare) {
		this.weeklyFare = weeklyFare;
	}

	@Override
	public String toString() {
		return "Commuter [tripList=" + tripList + ", name=" + name + ", dailyCapReached=" + dailyCapReached
				+ ", weeklyCapReached=" + weeklyCapReached + ", dailyFare=" + dailyFare + ", weeklyFare=" + weeklyFare
				+ "]";
	}



}
