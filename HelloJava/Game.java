/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloJava;

/**
 *
 * @author ASUS
 */
public class Game {
    public static void main (String[] args){
        
        // membuat objek player
        Player petani = new Player();
        
        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 0;
        
        // menjalankan method
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over!");
            
            
        }
       
        
    }
    
}
