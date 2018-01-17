package com.rosslogan.countries.data;

import com.rosslogan.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Ecuador", "16.9M", "Quito", "Spanish"),
            new Country("France", "67.2M", "Paris", "French"),
            new Country("India", "1.3B", "New Delhi", "Hindi, English"),
            new Country("Italy", "60.6M", "Rome", "Italian"),
            new Country("Kenya", "49.1M", "Nairobi", "English, Kiswahili"));


    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

    public Country findByName(String name){
        for(Country country: ALL_COUNTRIES){
            if(country.getCountryName().equals(name)){
                return country;
            }
        }
        return null;
    }
}
