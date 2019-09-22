package com.nnamdi.springdemo.mvc;


import javax.validation.constraints.*;

;


public class Customer {

    @NotEmpty(message = "Please enter last name")
    @Size(min = 5, max = 1000, message = "last name invalid")
    private String firstName;

    @NotEmpty(message = "Please enter last name")
    @Size(min = 5, max = 100, message = "last name invalid")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be greater or equal to zero")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 Chars/digits")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
