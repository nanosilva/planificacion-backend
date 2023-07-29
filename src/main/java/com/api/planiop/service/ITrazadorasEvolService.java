/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.TrazadorasEvolucion;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITrazadorasEvolService {
    public List<TrazadorasEvolucion> getTrazadoras();
    
    public void saveTrazadora(TrazadorasEvolucion trazadora);
    
    public void deleteTrazdora(Long id);
    
    public TrazadorasEvolucion findTrazadora(Long id);
    
}
