/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaibeasiswa;

/**
 *
 * @author ASUS
 */
public class NilaiBeasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama = "Alfi Khoirunnisa",
                NIM = "201969040038",
                Jurusan = "Teknik Informatika",
                Smstr = "3",
                Kelas = "A";
        
        double PO  = 4*4; // jumlah (SKS x Poin)
        double BD = 4*4;
        double JK = 5*4;
        double IMK = 3*3;
        double SP = 3*4;
        double SKS = 19; // jumlah SKS
        double jumlahkumulatif, IPK;
        jumlahkumulatif = PO + BD + IMK + SP + JK;
        IPK = jumlahkumulatif/SKS;
        
        System.out.println("Nama                                    : " + Nama);
        System.out.println("NIM                                     : "+ NIM);
        System.out.println("Jurusan                                 : " + Jurusan);
        System.out.println("Kelas                                   : " + Smstr+Kelas);
        System.out.println("Nilai MK-Pemograman Objek               : " + PO);
        System.out.println("Nilai MK-Basis Data                     :" + BD);
        System.out.println("Nilai MK-Jaringan Komputer              :" + JK);
        System.out.println("Nilai MK-Interaksi Manusia dan Komputer :" + IMK);
        System.out.println("Nilai MK-Statistik dan Probabilitas     :" + SP);
        System.out.println("Nilai IPK                               :" + IPK);
        
        
        if (IPK >= 3.50){
            System.out.println("Selamat Anda Mendapat Beasiswa");
        }else if (IPK < 3.50){
            System.out.println("Maaf Anda Tidak Mendapat Beasiswa");
        }
        
                
        
    }
    
}
