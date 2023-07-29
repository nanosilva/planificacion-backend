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
public class PrestacionesTipo {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    
    private Long id;
    private String cod_mun;
    private String municipio;
    private int consultas;
    private int inmunizaciones;
    private int ig_lb_pr;
    private int internacion;
    private int partos;
    private int talleres;
    private int anato;
    private int varias;
    private int total;
    
}
