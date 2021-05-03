package com.ericksonsantos.countrywebapp.data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CountrySummary {

    @JsonAlias("name")
    private String name;
    @JsonAlias("country_code")
    private String countryCode;

    public CountrySummary() {
    }

    public CountrySummary(String name, String countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "CountrySummary{name=" + this.name + ", countryCode=" + this.countryCode + "}";
    }

}

