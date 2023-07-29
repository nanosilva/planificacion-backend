/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.InscriptosGp;
import java.util.List;

/**
 *
 * @author user
 */
public interface IInscriptosGpService {
    
    public List <InscriptosGp> getInscriptosGp();
    
    public void saveInscriptosGp(InscriptosGp inscrigp);
    
    public void deleteInscriptosGp(Long id);
    
    public InscriptosGp findInscriptosGp(Long id);
    
}
