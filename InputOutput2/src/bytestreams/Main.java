/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("latihan_input.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;
            
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}