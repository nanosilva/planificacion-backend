/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trazadoras2c2022;
import com.api.planiop.repository.Trazadoras2c2022Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class Trazadoras2c2022Service implements ITrazadoras2c2022Service{
    
    @Autowired
    private Trazadoras2c2022Repository trazaRepo;

    @Override
    public List<Trazadoras2c2022> getTrazadoras() {
        List <Trazadoras2c2022> listrz = trazaRepo.findAll();
        return listrz;
        
    }

    @Override
    public void saveTrazadora(Trazadoras2c2022 trazadora) {
        trazaRepo.save(trazadora);
    }

    @Override
    public void deleteTrazdora(Long id) {
        trazaRepo.deleteById(id);
    }

    @Override
    public Trazadoras2c2022 findTrazadora(Long id) {
        Trazadoras2c2022 trazadora = trazaRepo.findById(id).orElse(null);
       return trazadora;
       
    }
    
}
