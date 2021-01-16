/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author ASUS
 */
public class Hewan {
    String nama;
    int berat;
    int jumlahkaki;
    private int jumlahKaki;
    
    //ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    Hewan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    
    public void jumlahKakiHewan(int jumlahKakiHewan){
         jumlahKaki = jumlahKakiHewan;
    }
    public void cetakHewan(){
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + "kg");
        System.out.println("Jumlah Kaki :" + jumlahKaki);
        
    }

    void cetakNama(String elang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
