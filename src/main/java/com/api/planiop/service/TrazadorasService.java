/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trazadoras;
import com.api.planiop.repository.TrazadorasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TrazadorasService implements ITrazadorasService {
    
    @Autowired
    private TrazadorasRepository trazaRepo;

    @Override
    public List<Trazadoras> getTrazadoras() {
        List <Trazadoras> listrz = trazaRepo.findAll();
        return listrz;
        
    }

    @Override
    public void saveTrazadora(Trazadoras trazadora) {
       trazaRepo.save(trazadora);
    }

    @Override
    public void deleteTrazdora(Long id) {
       trazaRepo.deleteById(id);
    }

    @Override
    public Trazadoras findTrazadora(Long id) {
       Trazadoras trazadora = trazaRepo.findById(id).orElse(null);
       return trazadora;
    }
    
}
