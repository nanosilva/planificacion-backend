/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesTipo;
import java.util.List;

/**
 *
 * @author user
 */
public interface IPrestacionesTipoService {
    
     public List<PrestacionesTipo> getPrestacionTipo();
    
    public void savePrestacionTipo(PrestacionesTipo prest);
    
    public void deletePrestacionTipo(Long id);
    
    public PrestacionesTipo findPrestacionTipo(Long id);
    
    
}
