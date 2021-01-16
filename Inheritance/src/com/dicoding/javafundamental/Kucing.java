/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental;

/**
 *
 * @author ASUS
 */
public class Kucing extends Hewan implements Mamalia{
    
    private String ras;
    private String habitat;
    
    public Kucing(String ras,String habitat){
        this.ras = ras;
        this.habitat = habitat;
    }
    
    @Override
    public String toString(){
        return "Kucing ras : " + ras + ", habitat: " + habitat;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Kucing){
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        }else{
            return false;
        }
    }
    
    public Kucing(){
        super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Kucing");
        
    }
    
    public void makan(){ // overriding
        System.out.println("Kucing sedang makan...");
        
    }
    
    public void makan(String food) { // overload
        System.out.println("Kucing sedang makan " + food);
    }
}
