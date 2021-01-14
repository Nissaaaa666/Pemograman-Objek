/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

private static char pilihan;
private static Scanner scanner = new Scanner (System.in);

public static void main (String[] args){
    Persegi opersegi;
    Segitiga osegitiga;
    Lingkaran olingkaran;
    int s1 = 38;
    int s2 = 38;
    int r = 38;
    
    opersegi = new Persegi();
    osegitiga = new Segitiga();
    olingkaran = new Lingkaran();
    
    
    mainMenu();
    switch(pilihan){
        case'1':{
            
            System.out.println("Luas Persegi : " + opersegi.luas(s1,s2));
            System.out.println("Keliling persegi :" + opersegi.keliling(s1,s2));
            break;
        }
        case'2':{
            
            System.out.println("Luas Segitiga :" + osegitiga.luas(s1,s2));
            System.out.println("Keliling segitiga :" + osegitiga.keliling(s1,s2));
            break;
        }
        case'3':{
            
            System.out.println("Luas Lingkaran :"+ olingkaran.luas(r));
            System.out.println("Keliling lingkaran :" + olingkaran.keliling(r));
            break;
        }
        default :{
            
            System.out.println("tidak ada pilihan");
            break;
        }
    }
}
    
    private static void mainMenu(){
        System.out.println("===================");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan Menu");
        pilihan = scanner.next().charAt(0);
    }
}


   

