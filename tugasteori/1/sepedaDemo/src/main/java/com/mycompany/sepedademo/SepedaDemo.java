/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sepedademo;

/**
 *
 * @author ASUS
 */
public class SepedaDemo {

    public static void main(String[] args) {
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
