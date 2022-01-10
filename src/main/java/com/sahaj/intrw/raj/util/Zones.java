package com.sahaj.intrw.raj.util;


public enum Zones {
    ZONE1TO2 (10),
    ZONE1TO1 (5),
    ZONE2TO2 (1);

    private int zoneCode;

    public int getZoneCodes() {
        return zoneCode;
    }

    Zones (int code) {
        this.zoneCode = code;
    }
}
