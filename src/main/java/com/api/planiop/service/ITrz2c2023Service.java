/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Trz2c2023;
import java.util.List;

/**
 *
 * @author user
 */
public interface ITrz2c2023Service {
    
    public List <Trz2c2023> getTrazadoras();
    
    public void saveTrazadora(Trz2c2023 trazadora);
    
    public void deleteTrazadora(Long id);
    
    public Trz2c2023 findTrazadora(long id);
    
}
