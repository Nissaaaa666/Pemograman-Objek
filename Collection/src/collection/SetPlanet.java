/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class SetPlanet {
    
    public static void main(String[] args){
        //menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menggunakan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set
        
        //method siza() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal : (size = " + planets.size() +")");
        for (String planet : planets); {
        System.out.println("\t " + planets);
        
        }
        
        
        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set
        
        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
    
}
