package com.mobilabsolutions.imgurclient.model;

public enum Sort {

    VIRAL ("viral"),
    TOP ("top"),
    TIME ("time");

    private String value;

    Sort(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }
}
