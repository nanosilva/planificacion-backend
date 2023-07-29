/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Transferencias;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITransferenciasService {
    
    public List<Transferencias> getTransferencias();
    
    public void saveTransferencia(Transferencias transfe);
    
    public void deleteTransferencia(Long id);
    
    public Transferencias findTransferencia(Long id);
    
}
