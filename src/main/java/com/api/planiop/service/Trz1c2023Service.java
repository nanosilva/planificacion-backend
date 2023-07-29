/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trz1c2023;
import com.api.planiop.repository.Trz1c2023Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class Trz1c2023Service implements ITrz1c2023Service{
    
    @Autowired
    private Trz1c2023Repository trazaRepo;

    @Override
    public List<Trz1c2023> getTrazadoras() {
        List <Trz1c2023> listrz = trazaRepo.findAll();
        return listrz;
        
    }

    @Override
    public void saveTrazadora(Trz1c2023 trazadora) {
         trazaRepo.save(trazadora);
    }

    @Override
    public void deleteTrazadora(Long id) {
        trazaRepo.deleteById(id);
    }

    @Override
    public Trz1c2023 findTrazadora(long id) {
       Trz1c2023 trazadora = trazaRepo.findById(id).orElse(null);
       return trazadora;
    }
    
}
