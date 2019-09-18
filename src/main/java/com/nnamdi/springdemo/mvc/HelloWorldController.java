package com.nnamdi.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    //new Controller method to read form data
    //Add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        //Read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        //Convert the data to all caps
        theName = theName.toUpperCase();

        //Create the message
        String result = "Yo! " + theName;

        //Add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
