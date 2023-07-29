/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.PrestacionesMonto;
import java.util.List;

/**
 *
 * @author user
 */
public interface IPrestacionesMontoService {
    public List<PrestacionesMonto> getPrestacion();
    
    public void savePrestacion(PrestacionesMonto prest);
    
    public void deletePrestacion(Long id);
    
    public PrestacionesMonto findPrestacion(Long id);
    
    
}
