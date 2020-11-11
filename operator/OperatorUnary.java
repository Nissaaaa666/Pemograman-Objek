/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

/**
 *
 * @author ASUS
 */
public class OperatorUnary {
    
    public static void main(String[] args){
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println ();
        
        System.out.println("Operator Unary Minus");
        int nilaiAwal2 =5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("HAsil -5 = " + nilaiAwal2);
        System.out.println();
        
        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();
        
        System.out.println("Oprator pengurangan nilai 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("HAsil 5-- = " + nilaiAwal4);
        System.out.println();
        
        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
