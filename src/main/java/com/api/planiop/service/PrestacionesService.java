/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Prestaciones;
import com.api.planiop.model.Rendicion;
import com.api.planiop.repository.PrestacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PrestacionesService implements IPrestacionesService {
    
    @Autowired
    private PrestacionesRepository prestRepository;
            
    @Override
    public List<Prestaciones> getPrestacion() {
        List <Prestaciones> listPrestaciones = prestRepository.findAll();
        return listPrestaciones;
    }

    @Override
    public void savePrestacion(Prestaciones prest) {
        prestRepository.save(prest);
       
    }

    @Override
    public void deletePrestacion(Long id) {
        prestRepository.deleteById(id);
        
    }

    @Override
    public Prestaciones findPrestacion(Long id) {
         Prestaciones prest = prestRepository.findById(id).orElse(null);
        return prest;
        
    }
    
}
