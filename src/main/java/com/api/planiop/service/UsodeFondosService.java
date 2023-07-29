/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.UsodeFondos;
import com.api.planiop.repository.UsodeFondosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class UsodeFondosService implements IUsodeFondosService {
    
    @Autowired
    private UsodeFondosRepository usodefondosRepo;

    @Override
    public List<UsodeFondos> getUsodeFondos() {
        List<UsodeFondos> listusodefondos = usodefondosRepo.findAll();
        return listusodefondos;
        
        
    }

    @Override
    public void saveUsodeFondos(UsodeFondos usodefondo) {
        usodefondosRepo.save(usodefondo);
    }

    @Override
    public void deleteUsodeFondos(Long id) {
        usodefondosRepo.deleteById(id);
    }

    @Override
    public UsodeFondos findUsodeFondos(Long id) {
       UsodeFondos usodefondo = usodefondosRepo.findById(id).orElse(null);
       return usodefondo;
    }
    
}
