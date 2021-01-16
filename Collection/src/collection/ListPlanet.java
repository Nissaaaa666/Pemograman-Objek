/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author ASUS
 */
public class ListPlanet {
    
    public static void main(String[] args){
        //deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsExpection karena ukuran Array tetap
        
        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambah objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List
        
        System.out.println("List planets awal:");
        for (int i = 0; i <planets.size(); i++) { //methid size()untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
            
        }
        
    
       planets.remove("venus"); //method remove() untuk mengeluarkan ukuran List
        System.out.println("List planets akhir:");
        for (int i = 0; i <planets.size(); i++){
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
   }
   
    
    
    
    
  
}
