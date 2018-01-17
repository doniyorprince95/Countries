package com.rosslogan.countries.model;


public class Country {
    private String countryName;
    private String population;
    private String capitalCity;
    private String languages;

    public Country(String countryName, String population, String capitalCity, String languages) {
        this.countryName = countryName;
        this.population = population;
        this.capitalCity = capitalCity;
        this.languages = languages;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
