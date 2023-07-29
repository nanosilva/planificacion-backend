/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Inscriptos;
import com.api.planiop.model.InscriptosCeb;
import java.util.List;

/**
 *
 * @author user
 */
public interface IInscriptosCebService {
    public List <InscriptosCeb> getInscriptosCeb();
    
    public void saveInscriptosCeb(InscriptosCeb inscriceb);
    
    public void deleteInscriptosCeb(Long id);
    
    public InscriptosCeb findInscriptosCeb(Long id);
    
}
