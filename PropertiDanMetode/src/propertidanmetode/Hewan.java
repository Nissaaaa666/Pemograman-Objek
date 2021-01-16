/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertidanmetode;

/**
 *
 * @author ASUS
 */
public class Hewan {
    // Properti atau fields
    
    //Inisiasi dengan inisial
    double tinggi = 30;
    double berat = 3;
    
    //Inisiasi melalui konstruktor
    int umur;
    
    //Konstruktor dengan parameter
    Hewan(int umurParam) {
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }
    
    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }
    
    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }
    
    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
