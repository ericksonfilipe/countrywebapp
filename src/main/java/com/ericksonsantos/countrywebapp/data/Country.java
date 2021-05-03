package com.ericksonsantos.countrywebapp.data;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    @JsonAlias("name")
    private String name;
    @JsonAlias("country_code")
    private String countryCode;
    @JsonAlias("capital")
    private String capital;
    @JsonAlias("population")
    private Long population;
    @JsonAlias("flag_file_url")
    private String flagFileUrl;

    public Country() {
    }

    public Country(String name, String countryCode, String capital, Long population, String flagFileUrl) {
        this.name = name;
        this.countryCode = countryCode;
        this.capital = capital;
        this.population = population;
        this.flagFileUrl = flagFileUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @JsonProperty("population")
    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @JsonProperty("flag_file_url")
    public String getFlagFileUrl() {
        return flagFileUrl;
    }

    public void setFlagFileUrl(String flagFileUrl) {
        this.flagFileUrl = flagFileUrl;
    }

    @Override
    public String toString() {
        return "Country{name=" + this.name + "}";
    }
}
