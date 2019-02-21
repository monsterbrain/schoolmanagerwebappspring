/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.controller;

import com.websystique.spring.model.Message;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author monster
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("version", "1.0");
        return "Login";
    }
    
    @RequestMapping(value = "timetable", method = RequestMethod.GET)
    public String timeTableMV(ModelMap model) {
        model.addAttribute("version", "1.0");
        return "timetable";
    }
    

    @RequestMapping(value = "dashboard", method = RequestMethod.GET)
    public String getDashboard(ModelMap model) {
//        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "dashboard";
    }

    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }

}
