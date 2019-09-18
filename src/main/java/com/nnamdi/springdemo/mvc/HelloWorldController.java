package com.nnamdi.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //Controller method to show the form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //Controller to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
