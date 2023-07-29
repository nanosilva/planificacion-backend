/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesGp;
import com.api.planiop.repository.PrestacionesGpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PrestacionesGpService implements IPrestacionesGpService {
    
    @Autowired
    private PrestacionesGpRepository prestgpRepo;

    @Override
    public List<PrestacionesGp> getPrestacionGp() {
        List <PrestacionesGp> listprestgp = prestgpRepo.findAll();
        return listprestgp;
    }

    @Override
    public void savePrestacionGp(PrestacionesGp prest) {
        prestgpRepo.save(prest);
       
    }

    @Override
    public void deletePrestacionGp(Long id) {
        prestgpRepo.deleteById(id);
    }

    @Override
    public PrestacionesGp findPrestacionGp(Long id) {
        PrestacionesGp prest = prestgpRepo.findById(id).orElse(null);
        return prest;
    }
    
}
