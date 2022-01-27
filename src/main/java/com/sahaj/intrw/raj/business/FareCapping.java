package com.sahaj.intrw.raj.business;

import com.sahaj.intrw.raj.util.TicketingUtils;
import com.sahaj.intrw.raj.util.Zones;

public abstract class FareCapping {
	protected Zones applicableZone = null;
	protected TicketingUtils util = new TicketingUtils();
	

	public abstract int getCapFare();

	public Zones getZone() {
		return this.getZone();
	}
	public void setZone(Zones applicableZone) {
		this.applicableZone = applicableZone;
	};

}
