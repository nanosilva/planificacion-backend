/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trazadoras2c2022;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITrazadoras2c2022Service  {
     public List<Trazadoras2c2022> getTrazadoras();
    
    public void saveTrazadora(Trazadoras2c2022 trazadora);
    
    public void deleteTrazdora(Long id);
    
    public Trazadoras2c2022 findTrazadora(Long id);
    
}
