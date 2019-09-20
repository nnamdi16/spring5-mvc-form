package com.nnamdi.springdemo.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean
    public Customer customer() {
        return new Customer();
    }
}
