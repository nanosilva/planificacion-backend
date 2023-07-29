/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesTipo;
import com.api.planiop.repository.PrestacionesTipoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PrestacionesTipoService implements IPrestacionesTipoService {
    
    @Autowired
    private PrestacionesTipoRepository prestipoRepo;

    @Override
    public List<PrestacionesTipo> getPrestacionTipo() {
        List <PrestacionesTipo> listprestipo = prestipoRepo.findAll();
        return listprestipo;
    }

    @Override
    public void savePrestacionTipo(PrestacionesTipo prest) {
        prestipoRepo.save(prest);
    }

    @Override
    public void deletePrestacionTipo(Long id) {
       prestipoRepo.deleteById(id);
    }

    @Override
    public PrestacionesTipo findPrestacionTipo(Long id) {
       PrestacionesTipo prestipo= prestipoRepo.findById(id).orElse(null);
       return prestipo;
    }
    
}
