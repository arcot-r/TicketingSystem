package com.sahaj.intrw.raj.model;

import java.util.ArrayList;
import java.util.List;

import com.sahaj.intrw.raj.business.FareCapping;
import com.sahaj.intrw.raj.util.Zones;

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
		this.tripList = new ArrayList<Trip>();
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

	public void setDailyFare(Integer dailyFare) {
		this.dailyFare = dailyFare;
	}

	public Integer getWeeklyFare() {
		return weeklyFare;
	}

	public void setWeeklyFare(Integer weeklyFare) {
		this.weeklyFare = weeklyFare;
	}

	public void updateApplicableZones(FareCapping dailyCap, FareCapping weeklyCap) {
		Zones applicableZone = null;
		for (Trip trip : this.tripList) {
			if (applicableZone == null) {
				applicableZone = getApplicableZone(trip);
			}
			if (getApplicableZone(trip).getZoneCodes() > applicableZone.getZoneCodes())
				applicableZone = getApplicableZone(trip);
		}
		dailyCap.setZone(applicableZone);
		weeklyCap.setZone(applicableZone);

	}

	public Zones getApplicableZone(Trip trip) {
		if (trip.getFromZone() != trip.getToZone()) {// Different Zones
			return Zones.ZONE1TO2;
		} else {// Same zones
			return (trip.getFromZone() == 1) ? Zones.ZONE1TO1 : Zones.ZONE2TO2;
		}
	}

	@Override
	public String toString() {
		return "Commuter [tripList=" + tripList + ", name=" + name + ", dailyCapReached=" + dailyCapReached
				+ ", weeklyCapReached=" + weeklyCapReached + ", dailyFare=" + dailyFare + ", weeklyFare=" + weeklyFare
				+ "]";
	}

}
