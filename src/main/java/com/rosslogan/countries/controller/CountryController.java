package com.rosslogan.countries.controller;

import com.rosslogan.countries.data.CountryRepository;
import com.rosslogan.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String getCountries(ModelMap modelMap){
        List<Country> countries = countryRepository.getAllCountries();
        modelMap.put("countries", countries);
        return "index";
    }

    @RequestMapping("/name")
    public String getCountriesSortByName(ModelMap modelMap){
        List<Country> countries = countryRepository.getAllCountries();
        countries.sort(Comparator.comparing(Country::getCountryName));
        modelMap.put("countries", countries);
        return "index";
    }

    @RequestMapping("/population")
    public String getCountriesSortByPopulation(ModelMap modelMap){
        List<Country> countries = countryRepository.getAllCountries();
        countries.sort(Comparator.comparing(Country::getPopulation));
        modelMap.put("countries", countries);
        return "index";
    }

    @RequestMapping("/country/{name}")
    public String getCountry(@PathVariable String name, ModelMap modelMap){
        Country country = countryRepository.findByName(name);
        modelMap.put("country", country);
        return "country_details";
    }

}
