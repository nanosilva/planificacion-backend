/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesMonto;
import com.api.planiop.repository.PrestacionesMontoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PrestacionesMontoService implements IPrestacionesMontoService {
    
    @Autowired
    private PrestacionesMontoRepository prestmRepository;

    @Override
    public List<PrestacionesMonto> getPrestacion() {
        List <PrestacionesMonto> listPrestaciones = prestmRepository.findAll();
        return listPrestaciones;
        
    }

    @Override
    public void savePrestacion(PrestacionesMonto prest) {
        prestmRepository.save(prest);
    }

    @Override
    public void deletePrestacion(Long id) {
         prestmRepository.deleteById(id);
    }

    @Override
    public PrestacionesMonto findPrestacion(Long id) {
       PrestacionesMonto prest = (PrestacionesMonto) prestmRepository.findById(id).orElse(null);
       return prest;
       
        
    }
    
}
