package com.nnamdi.springdemo.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private Customer customer;

    public String showForm(Model theModel) {
//        theModel.addAttribute("customer",new Customer());
        //Alternative to Line 15 for dependency Injection
        theModel.addAttribute("customer", customer);
        return "customer-form";
    }
}
