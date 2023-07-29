/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Prestaciones;
import java.util.List;

/**
 *
 * @author user
 */
public interface IPrestacionesService {
    public List<Prestaciones> getPrestacion();
    
    public void savePrestacion(Prestaciones prest);
    
    public void deletePrestacion(Long id);
    
    public Prestaciones findPrestacion(Long id);
    
    
    
    
    
}
