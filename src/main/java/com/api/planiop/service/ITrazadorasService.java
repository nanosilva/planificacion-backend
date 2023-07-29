/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trazadoras;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITrazadorasService {
    
    public List<Trazadoras> getTrazadoras();
    
    public void saveTrazadora(Trazadoras trazadora);
    
    public void deleteTrazdora(Long id);
    
    public Trazadoras findTrazadora(Long id);
    
}
