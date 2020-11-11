/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class UserBufferedReader {
   
    public static void main(String[] args) throws IOException{
        
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sanagt sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan Angka kedua : ");
            anotherValue =Integer.parseInt(bufferedReader.readLine());
            
        } catch (IOException e){
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah : " + resul);
        
    }
    
}
