/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesGp;
import java.util.List;

/**
 *
 * @author user
 */
public interface IPrestacionesGpService {
    
      public List<PrestacionesGp> getPrestacionGp();
    
    public void savePrestacionGp(PrestacionesGp prest);
    
    public void deletePrestacionGp(Long id);
    
    public PrestacionesGp findPrestacionGp(Long id);
    
    
}
