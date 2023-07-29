/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trazadoras3c2022;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITrazadoras3c2022Service {
     public List<Trazadoras3c2022> getTrazadoras();
    
    public void saveTrazadora(Trazadoras3c2022 trazadora);
    
    public void deleteTrazdora(Long id);
    
    public Trazadoras3c2022 findTrazadora(Long id);
    
    
}
