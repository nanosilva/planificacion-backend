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
public class UsodeFondos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String cod_mun; 
    private String municipio;
    private int item_6;
    private int item_7;
    private int item_8;
    private int item_11;
    private int item_12;
    private int item_13;
    private int item_21;
    private int item_22;
    private int item_23;
    private int item_31;
    private int item_32;
    private int item_41;
    private int item_42;
    private int item_43;
    private int item_51;
    private int item_52;
    private int item_53;
    private int total;
    
}
