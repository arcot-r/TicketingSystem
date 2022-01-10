package com.sahaj.intrw.raj.util;

import java.io.IOException;

import java.io.InputStream;
import java.time.DayOfWeek;
import java.util.Properties;

import com.sahaj.intrw.raj.model.Trip;

public class TicketingUtils {

	Properties prop;

	public TicketingUtils() {
		prop = new Properties();
		try (InputStream input = TicketingUtils.class.getClassLoader().getResourceAsStream("application.properties")) {
			if (input == null) {
				String errMsg = "Sorry, unable to find application.properties";
				System.out.println(errMsg);
				throw new IOException(errMsg);
			}
			// load a properties file from class path
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public Properties getProps() {
		return this.prop;
	}

	public String getPropValue(String key) {
		return this.prop.getProperty(key);
	}

	public int getPropIntValue(String key) {
		return Integer.valueOf(prop.getProperty(key));
	}

	public boolean isWeekend(Trip trip) {
		return trip.getDay() == DayOfWeek.SATURDAY || trip.getDay() == DayOfWeek.SUNDAY;
	}

	public Zones getApplicableZone(Trip trip) {
		if (trip.getFromZone() != trip.getToZone()) {// Different Zones
			return Zones.ZONE1TO2;
		} else {// Same zones
			return (trip.getFromZone() == 1) ? Zones.ZONE1TO1 : Zones.ZONE2TO2;
		}
	}

}
