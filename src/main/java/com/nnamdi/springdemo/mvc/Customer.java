package com.nnamdi.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NotNull(message = "is required")
@Size(min = 4, message = "Size must be more than one")
public class Customer {
    private String firstName;


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
