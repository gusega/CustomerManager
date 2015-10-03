package com.mytech.server.model;

import com.google.gwt.thirdparty.guava.common.base.Optional;

public class Address {
    private String street;
    private int houseNumber;
    private String city;
    private int zip;
    private Optional<String> state;
    private String country;
}
