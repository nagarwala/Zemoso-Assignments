package com.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // controller method to show form

    @RequestMapping("/showform")
    public String showForm(){
        return "helloworld-form";
    }

    //controller method to process form

    @RequestMapping("/processForm")
     public String processForm(){
        return "helloworld";
     }

     //need a controller method to read form data
    //add data to model
     @RequestMapping("/processFormTwo")
    public String readAndAddData(HttpServletRequest request, Model model){
      //read the request from HTML form
       String theName = request.getParameter("studentName");
       String theHobby = request.getParameter("studentHobby");

         //convert the data
         theName = theName.toUpperCase();
         String result = "Yo! " + theName;

         //add message to the model
         model.addAttribute("message",result);
         model.addAttribute("hobby",theHobby);
         return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String processVersionThree(@RequestParam("studentName") String theName,
                                      @RequestParam("studentHobby") String theHobby ,
                                      Model model){


        //convert the data
        theName = theName.toUpperCase();
        String result = "Nice to meet you, " + theName;

        //add message to the model
        model.addAttribute("message",result);
        model.addAttribute("hobby",theHobby);
        return "helloworld";
    }
}
