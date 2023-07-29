/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Inscriptos;
import java.util.List;

/**
 *
 * @author user
 */
public interface IInscriptosService {
     public List <Inscriptos> getInscriptos();
    
    public void saveInscriptos(Inscriptos inscrip);
    
    public void deleteInscriptos(Long id);
    
    public Inscriptos findInscriptos(Long id);
    
}
