package com.rosslogan.countries.data;

import com.rosslogan.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("ecuador", 16900000, "Quito", Arrays.asList("Spanish")),
            new Country("france", 67200000, "Paris", Arrays.asList("French")),
            new Country("india", 1300000000, "New Delhi", Arrays.asList("Hindi", "English")),
            new Country("italy", 60600000, "Rome", Arrays.asList("Italian")),
            new Country("kenya", 49100000, "Nairobi", Arrays.asList("English", "Kiswahili")));


    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

    public Country findByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getCountryName().equals(name))
                .findFirst().orElse(null);
    }
}
