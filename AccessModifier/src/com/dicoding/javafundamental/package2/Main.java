/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.package2;

import com.dicoding.javafundamental.KelasA;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        
        // Kode ini pasti mengalami kompiler arror
        
        KelasA kelasA = new KelasA ();
        
        //System.out.println(kelasA.functionB());
        
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);
        
        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}