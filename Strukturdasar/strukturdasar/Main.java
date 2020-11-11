/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.strukturdasar;

import com.dicoding.javafundamental.kendaraan.Kereta;
import com.dicoding.javafundamental.kendaraan.Mobil;
import com.dicoding.javafundamental.kendaraan.Motor;
import com.dicoding.javafundamental.musik.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        
        Gitar.bunyi();
        
        Mobil.jumlahBan();
        Kereta.jumlahBan();
        Motor.jumlahBan();
        
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok " + tomorrow);
    }
}
