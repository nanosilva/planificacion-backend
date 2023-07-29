/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author user
 */
@Getter @Setter
@Entity
public class Trz2c2023 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long Id;
    private String periodo;
    private String cod_mun;
    private String municipio;
    private int casos_positivos;
    private int trazadora;
    private int meta_pct;
    private int meta_casos;
    private String tasa_cobertura;
    private String tcm;
    private String cumple_tcm;
            
            
    
    
}
