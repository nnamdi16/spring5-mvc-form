package com.nnamdi.springdemo.mvc;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

;


public class Customer {

    @NotEmpty(message = "Please enter last name")
    @Size(min = 5, max = 1000, message = "last name invalid")
    private String firstName;

    @NotEmpty(message = "Please enter last name")
    @Size(min = 5, max = 100, message = "last name invalid")
    private String lastName;

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
}
