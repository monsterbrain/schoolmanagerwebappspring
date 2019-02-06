/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.controller;

import com.websystique.spring.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author monster
 */
@RestController
public class ControllerNew {
    @RequestMapping(value="/ws/testapi", method = RequestMethod.GET)
    public String testCase() {
        String restReturn = "{"
                + "\"name\":\"Faisal\""
                + "}";
        return restReturn;
    }
    
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
}
