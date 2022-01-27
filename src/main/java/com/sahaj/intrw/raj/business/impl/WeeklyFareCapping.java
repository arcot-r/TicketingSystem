package com.sahaj.intrw.raj.business.impl;

import com.sahaj.intrw.raj.business.FareCapping;

public class WeeklyFareCapping extends FareCapping {

	private final String ZONE1TO1_CAP = "weekly.cap.z1.z1";
	private final String ZONE1TO2_CAP = "weekly.cap.z1.z2";
	private final String ZONE2TO2_CAP = "weekly.cap.z2.z2";

	@Override
	public int getCapFare() {
		switch (applicableZone) {
		case ZONE1TO1:
			return util.getPropIntValue(ZONE1TO1_CAP);
		case ZONE1TO2:
			return util.getPropIntValue(ZONE1TO2_CAP);
		case ZONE2TO2:
			return util.getPropIntValue(ZONE2TO2_CAP);
		}
		return 0;
	}



}
