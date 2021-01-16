package generics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Planet {
    private String name;
    private double mass;
    
    public Planet(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    Planet(String mercury, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void print(){
        System.out.println("Planet " + name + ", mass " + mass);
    }
}
