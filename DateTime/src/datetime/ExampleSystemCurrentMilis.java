/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

/**
 *
 * @author ASUS
 */
public class ExampleSystemCurrentMilis {
    public static void main(String[] args){
        long timeNow = System.currentTimeMillis();
        
        System.out.println("Waktu sekarang adalah " + timeNow +" millesecond");
    }
}