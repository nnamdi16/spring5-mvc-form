package com.nnamdi.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    @NotNull(message = "is required")
    @Max(value = 2, message = "Maximum of two words")
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Write the countries names form the Java class.
    @Autowired
    private LinkedHashMap<String, String> countryOptions;


    //Create a no-argument constructor to avoid nullExceptionPointer
    public Student() {

        //Populate the country options: used ISO country code

    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }


    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
