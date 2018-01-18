package com.rosslogan.countries.data;

import com.rosslogan.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Ecuador", "16.9M", "Quito", Arrays.asList("Spanish")),
            new Country("France", "67.2M", "Paris", Arrays.asList("French")),
            new Country("India", "1.3B", "New Delhi", Arrays.asList("Hindi", "English")),
            new Country("Italy", "60.6M", "Rome", Arrays.asList("Italian")),
            new Country("Kenya", "49.1M", "Nairobi", Arrays.asList("English", "Kiswahili")));


    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

    public Country findByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getCountryName().equals(name))
                .findFirst().orElse(null);
    }
}
