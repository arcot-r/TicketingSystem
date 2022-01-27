package com.sahaj.intrw.raj.business.impl;

import com.sahaj.intrw.raj.business.FareCapping;

public class DailyFareCapping extends FareCapping {
	private final String ZONE1TO1_CAP = "daily.cap.z1.z1";
	private final String ZONE1TO2_CAP = "daily.cap.z1.z2";
	private final String ZONE2TO2_CAP = "daily.cap.z2.z2";

	
	public DailyFareCapping() {
		init();
	}

	private void init() {
		
		
	}

	@Override
	public int getCapFare() {
		// TODO Auto-generated method stub
		return 0;
	}

}
