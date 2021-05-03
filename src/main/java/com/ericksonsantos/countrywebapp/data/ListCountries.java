package com.ericksonsantos.countrywebapp.data;

public class ListCountries {

    private CountrySummary[] countries;

    public ListCountries() {
    }

    public ListCountries(CountrySummary[] countries) {
        this.countries = countries;
    }

    public CountrySummary[] getCountries() {
        return countries;
    }

    public void setCountries(CountrySummary[] countries) {
        this.countries = countries;
    }
}
