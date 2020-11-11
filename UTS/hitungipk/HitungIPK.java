/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungipk;

/**
 *
 * @author ASUS
 */
public class HitungIPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama = "Alfi Khoirunnisa",
               Nim = "201969040038",
               Jurusan = "Teknik Informatika",
               Smstr = "3",
               Kls = "A";
        int OOP = 70;
        int BS = 85;
        int JK = 80;
        int IP, totalnilaimk;
        totalnilaimk = OOP + BS + JK;
        IP = totalnilaimk;
        
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("Kelas : " + Smstr+Kls);
        System.out.println("Nilai Total Mata Kuliah ");
        System.out.println("Nilai IP : " + IP);
        
        char Predikat;
        if (IP >= 81){
            Predikat = 'A';
        }else if (IP >= 61){
            Predikat = 'B';
        }else if (IP >= 60){
            Predikat = 'C';
        }else
            Predikat = 'D';
        System.out.println("Selamat Anda Mendapat Predikat");
    }           
    
}
