/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class ExampleSpecificCalendar {
    public static void main(String[] args){
        
        //menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        
        // menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu :" + calendar.getTime());
        
        // menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian : " + calendar.getTime());
        
        // menampilkan waktu 2 bulan yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian : " + calendar.getTime());
    }
}
