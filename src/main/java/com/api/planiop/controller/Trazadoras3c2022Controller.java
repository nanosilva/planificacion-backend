/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.controller;

import com.api.planiop.model.Trazadoras3c2022;
import com.api.planiop.service.ITrazadoras3c2022Service;
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
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class Trazadoras3c2022Controller {

    @Autowired
    private ITrazadoras3c2022Service interTrazadora;

    @GetMapping("/trazadoras_3c2022/ver")
    @ResponseBody
    public List<Trazadoras3c2022> getTrazadoras() {
        return interTrazadora.getTrazadoras();
    }
;

}
