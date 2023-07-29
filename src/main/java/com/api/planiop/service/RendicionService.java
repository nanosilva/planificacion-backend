/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Rendicion;
import com.api.planiop.repository.RendicionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author user
 */
@Service
public class RendicionService implements IRendicionService{
    
    @Autowired
    private RendicionRepository rendiRepository;

    @Override
    public List<Rendicion> getRendicion() {
        List <Rendicion> listaRendicion = rendiRepository.findAll();
        return listaRendicion;
    }

    @Override
    public void saveRendicion(Rendicion rend) {
        rendiRepository.save(rend);
    }

    @Override
    public void deleteRendicion(Long id) {
        rendiRepository.deleteById(id);
        
    }
       
    @Override
    public Rendicion findRendicion(Long id) {
        Rendicion rend = rendiRepository.findById(id).orElse(null);
        return rend;
            }
    
}

    