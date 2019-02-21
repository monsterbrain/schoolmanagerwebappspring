/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.controller;

import com.google.gson.Gson;
import com.websystique.spring.dao.TimetableDao;
import com.websystique.spring.model.CommonResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author monster
 */
@RestController
@Transactional
public class TimetableController {
    
    @Autowired
    private TimetableDao dao;
    
    @RequestMapping(value="/getTimeTable", method = RequestMethod.GET)
    public String getTimeTable(
        ) {
        
        System.out.println("Get time table");
        
        CommonResponse response = new CommonResponse();
        
        List rowList = dao.getTimetable();
        if(rowList.isEmpty()){
            response.setMessage("User not found !");
            response.setIsSuccess(false);
        } else{
            response.setMessage("User found. Login Success.");
            response.setIsSuccess(true);
        }
        
        return new Gson().toJson(rowList);
    }
}
