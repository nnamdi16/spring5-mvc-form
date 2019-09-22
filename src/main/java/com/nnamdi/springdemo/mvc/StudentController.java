package com.nnamdi.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@Component
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private Student theStudent;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {


        //Create the student object
//        Student theStudent = new Student();

        //Add student object to the model
       theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBinder) {
        if (theBinder.hasErrors()) {
            return "student-form";
        } else {
            //Log the input data
            System.out.println("the student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
            return "student-confirmation";
        }
    }

}


