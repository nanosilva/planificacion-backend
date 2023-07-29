/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.InscriptosGp;
import com.api.planiop.repository.InscriptosGpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class InscriptosGpService implements IInscriptosGpService {
    
    @Autowired
    private InscriptosGpRepository inscrigpRepository;

    @Override
    public List<InscriptosGp> getInscriptosGp() {
        List <InscriptosGp> listinscrigp = inscrigpRepository.findAll();
        return listinscrigp;
       
    }

    @Override
    public void saveInscriptosGp(InscriptosGp inscrigp) {
        inscrigpRepository.save(inscrigp);
                }

    @Override
    public void deleteInscriptosGp(Long id) {
        inscrigpRepository.deleteById(id);
        
    }

    @Override
    public InscriptosGp findInscriptosGp(Long id) {
        InscriptosGp inscrigp = inscrigpRepository.findById(id).orElse(null);
        return inscrigp;
        
    }
    
}
