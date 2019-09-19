package com.nnamdi.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public  Student theStudent;

    @RequestMapping("/showForm")

    public String showForm(Model theModel) {


        //Create the student object
//        Student theStudent = new Student();

        //Add student object to the model
       theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        //Log the input data
        System.out.println("the student: " + theStudent.getFirstName() + " " + theStudent.getLastName() );
        return "student-confirmation";
    }

}


