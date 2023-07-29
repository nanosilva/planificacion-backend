/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Rendicion;
import java.util.List;

/**
 *
 * @author user
 */
public interface IRendicionService {
    public List<Rendicion> getRendicion();
    
    public void saveRendicion(Rendicion rend);
    
    public void deleteRendicion(Long id);
    
    public Rendicion findRendicion(Long id);
    
}
