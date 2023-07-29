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
public class TrazadorasEvolucion {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String cod_mun;
    private String municipio;
    private int trazadora;
    private int casos_1c2022;
    private String tca_1c2022;
    private int casos_2c2022;
    private String tca_2c2022;
    private int casos_3c2022;
    private String tca_3c2022;
    private int casos_1c2023;
    private String tca_1c2023;
    private int casos_2c2023;
    private String tca_2c2023;
    private int casos_3c2023;
    private String tca_3c2023;
    
}
