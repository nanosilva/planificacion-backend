/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Inscriptos;
import com.api.planiop.model.InscriptosCeb;
import com.api.planiop.repository.InscriptosCebRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class InscriptosCebService implements IInscriptosCebService{
    
    @Autowired
    private InscriptosCebRepository inscricebRepository;

    @Override
    public List<InscriptosCeb> getInscriptosCeb() {
       List <InscriptosCeb> listinscceb = inscricebRepository.findAll();
        return listinscceb;
    }

    @Override
    public void saveInscriptosCeb(InscriptosCeb inscriceb) {
        inscricebRepository.save(inscriceb);
        
    }

    @Override
    public void deleteInscriptosCeb(Long id) {
        inscricebRepository.deleteById(id);
        
    }

    @Override
     public InscriptosCeb findInscriptosCeb(Long id) {
        InscriptosCeb inscripceb = inscricebRepository.findById(id).orElse(null);
        return inscripceb;
            }
    }
    

