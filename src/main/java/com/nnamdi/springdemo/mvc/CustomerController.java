package com.nnamdi.springdemo.mvc;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/customer")
public class CustomerController {
//    @Autowired
//    private Customer customer;

    //Trim input string
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        //Alternative to Line 15 for dependency Injection
//        theModel.addAttribute("customer", customer);
        System.out.println("Solve the bug in time in record");

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
//        System.out.println("Customer "+theCustomer.getLastName());
//        System.out.println("" + theBindingResult.hasErrors());
        if (theBindingResult.hasErrors()) {
            System.out.println("Stop Learning now");
            return "customer-form";
        } else {
            System.out.println("Start debugging now");
            return "customer-confirmation";
        }
//        return "customer-confirmation";
    }

}
