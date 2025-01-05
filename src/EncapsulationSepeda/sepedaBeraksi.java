/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationSepeda;

/**
 *
 * @author iv4nm
 */
public class sepedaBeraksi {
    public static void main(String[] args) {
        sepeda sepedaku = new sepeda();
        
        sepedaku.setGir(1);
        
//        sepedaku.gir = 3;
        System.out.println("Gir saat ini: " +sepedaku.getGir());
    }
  
}
