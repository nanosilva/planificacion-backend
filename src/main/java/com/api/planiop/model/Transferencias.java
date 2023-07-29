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
public class Transferencias {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id;
    private String cod_mun;
    private String municipio;
    private int anio_2007;
    private int anio_2008;
    private int anio_2009;
    private int anio_2010;
    private int anio_2011;
    private int anio_2012;    
    private int anio_2013;    
    private int anio_2014;
    private int anio_2015;
    private int anio_2016;
    private int anio_2017;
    private int anio_2018;
    private int anio_2019;
    private int anio_2020;
    private int anio_2021;
    private int anio_2022;
    private int anio_2023;
    private int total_acum;
    
}
