package com.mobilabsolutions.imgurclient.model;

public enum Section {

    HOT ("hot"),
    TOP ("top"),
    USER ("user");

    private String value;

    Section(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }
}
