/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.perulangan;

/**
 *
 * @author ASUS
 */
public class ForBersarang {
    public static void main(String [] args){
        int a = 5;
                for (int i = 0; i <= a; i++){
                    for (int j = 0; j <= i; j++){
                        System.out.println("*");
                    }
                    System.out.println("");
                }
    }
}
