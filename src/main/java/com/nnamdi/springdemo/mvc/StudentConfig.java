package com.nnamdi.springdemo.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

@Configuration
public class StudentConfig {
    @Bean
    public Student theStudent() {
        return new Student();
    }

    @Bean
    public LinkedHashMap<String, String> countryList() {
        LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States of America");
        return countryOptions;
    }
}
