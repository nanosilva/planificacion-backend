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
public class InscriptosCeb {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String cod_mun;
    private String municipio;
    private int mes_1;
    private int mes_2;
    private int mes_3;
    private int mes_4;
    private int mes_5;
    private int mes_6;
    private int mes_7;
    private int mes_8;
    private int mes_9;
    private int mes_10;
    private int mes_11;
    private int mes_12;
    private String padron_1;
    private String padron_2;
    private String padron_3;
    private String padron_4;
    private String padron_5;
    private String padron_6;
    private String padron_7;
    private String padron_8;
    private String padron_9;
    private String padron_10;
    private String padron_11;
    private String padron_12;
    
}
