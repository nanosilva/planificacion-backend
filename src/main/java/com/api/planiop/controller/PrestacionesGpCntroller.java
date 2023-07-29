/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.controller;

import com.api.planiop.model.PrestacionesGp;
import com.api.planiop.service.IPrestacionesGpService;
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
@CrossOrigin(origins="http://localhost:4200",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})

public class PrestacionesGpCntroller {
    
    @Autowired
    private IPrestacionesGpService interPrestGp;
    
    @GetMapping("/prestaciones_gp/ver")
    @ResponseBody
    public List <PrestacionesGp> getPrestacionesGp(){
        return interPrestGp.getPrestacionGp();
        
    }
    
}
