/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.TrazadorasEvolucion;
import com.api.planiop.repository.TrazadorasEvolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TrazadorasEvolService implements ITrazadorasEvolService {
    
    @Autowired
    private TrazadorasEvolRepository trzevolRepo;

    @Override
    public List<TrazadorasEvolucion> getTrazadoras() {
        List <TrazadorasEvolucion> trzevolist = trzevolRepo.findAll();
        return trzevolist;
    }

    @Override
    public void saveTrazadora(TrazadorasEvolucion trazadora) {
        trzevolRepo.save(trazadora);
    }

    @Override
    public void deleteTrazdora(Long id) {
        trzevolRepo.deleteById(id);
        
    }

    @Override
    public TrazadorasEvolucion findTrazadora(Long id) {
        TrazadorasEvolucion trzevol = trzevolRepo.findById(id).orElse(null);
        return trzevol;
    }
    
}
