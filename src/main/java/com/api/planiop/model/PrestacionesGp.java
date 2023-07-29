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
public class PrestacionesGp {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String cod_mun;
    private String municipio;
    private int ninos_05;
    private int ninos_69;
    private int adolescentes;
    private int adultos;
    private int emb;
    private int total_ac;
}
