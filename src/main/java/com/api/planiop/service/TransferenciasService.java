/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Transferencias;
import com.api.planiop.repository.TransferenciasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TransferenciasService implements ITransferenciasService{
    @Autowired
    private TransferenciasRepository transfeRepository;

    @Override
    public List<Transferencias> getTransferencias() {
        List<Transferencias> listTransferencias = transfeRepository.findAll();
        return listTransferencias;
                
    }

    @Override
    public void saveTransferencia(Transferencias transfe) {
        transfeRepository.save(transfe);
        
    }

    @Override
    public void deleteTransferencia(Long id) {
        transfeRepository.deleteById(id);
        
    }

    @Override
    public Transferencias findTransferencia(Long id) {
        Transferencias transfe = transfeRepository.findById(id).orElse(null);
        return transfe;
    }
    
}
