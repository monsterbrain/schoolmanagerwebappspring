/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.controller;

import com.google.gson.Gson;
import com.websystique.spring.dao.UserloginDao;
import com.websystique.spring.model.CommonResponse;
import com.websystique.spring.model.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author monster
 */
@RestController
@Transactional
public class DashboardController {
    
//    @Autowired
//    private UserloginDao dao;
    
//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String login(
//            @RequestParam("username") String username,
//            @RequestParam("password") String pwd
//        ) {
//        
//        System.out.println("uname, pwd = " +username+", "+ pwd);
//        
//        CommonResponse response = new CommonResponse();
//        
//        List rowList = dao.checkUsers(username, pwd);
//        if(rowList.isEmpty()){
//            response.setMessage("User not found !");
//            response.setIsSuccess(false);
//        } else{
//            response.setMessage("User found. Login Success.");
//            response.setIsSuccess(true);
//        }
//        
//        return new Gson().toJson(response);
//    }
}
