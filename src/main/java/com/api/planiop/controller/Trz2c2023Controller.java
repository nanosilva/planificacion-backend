/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.controller;

import com.api.planiop.model.Trz2c2023;
import com.api.planiop.service.ITrz2c2023Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class Trz2c2023Controller {
    
    @Autowired
    private ITrz2c2023Service interTrz;
    
    @GetMapping("/trazadoras_2c2023/ver")
    @ResponseBody
    public List <Trz2c2023> getTrazadoras(){
        return interTrz.getTrazadoras();
    }
    
}
