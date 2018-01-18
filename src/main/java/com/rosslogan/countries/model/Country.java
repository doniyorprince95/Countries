package com.rosslogan.countries.model;


import java.util.List;

public class Country {
    private String countryName;
    private String population;
    private String capitalCity;
    private List<String> languages;

    public Country(String countryName, String population, String capitalCity, List<String> languages) {
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

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
