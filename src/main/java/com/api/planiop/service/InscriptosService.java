/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Inscriptos;
import com.api.planiop.repository.InscriptosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class InscriptosService implements IInscriptosService {
    
    @Autowired
    private InscriptosRepository inscripRepository;

    @Override
    public List<Inscriptos> getInscriptos() {
       List <Inscriptos> listInscriptos = inscripRepository.findAll();
       return listInscriptos;
        
    }

    @Override
    public void saveInscriptos(Inscriptos inscrip) {
       inscripRepository.save(inscrip);
    }

    @Override
    public void deleteInscriptos(Long id) {
       inscripRepository.deleteById(id);
    }

    @Override
    public Inscriptos findInscriptos(Long id) {
        Inscriptos inscrip = inscripRepository.findById(id).orElse(null);
        return inscrip;
            }
    }
    

