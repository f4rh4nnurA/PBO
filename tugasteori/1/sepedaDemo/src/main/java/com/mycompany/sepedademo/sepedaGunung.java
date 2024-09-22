/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sepedademo;

/**
 *
 * @author ASUS
 */
public class sepedaGunung extends sepeda {
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
