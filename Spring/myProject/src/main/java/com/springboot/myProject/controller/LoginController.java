package com.springboot.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String homePage(){
        return "redirect:/trains/list";
    }

    @GetMapping("/showMyLoginPage")
    public String login(){
        return "loginpage";
    }

    @GetMapping("/access-denied")
    public String accessDenied(){
        return "accessdenied";
    }
}
