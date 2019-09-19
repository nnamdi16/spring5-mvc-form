package com.nnamdi.springdemo.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Student theStudent() {
        return new Student();
    }
}
