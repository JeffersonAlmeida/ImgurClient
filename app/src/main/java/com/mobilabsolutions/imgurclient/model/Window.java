package com.mobilabsolutions.imgurclient.model;

public enum Window {

    DAY ("day"),
    WEEK ("week"),
    MONTH ("month");

    private String value;

    Window(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }
}
