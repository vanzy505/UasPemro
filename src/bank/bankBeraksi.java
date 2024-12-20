/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author iv4nm
 */
public class bankBeraksi {
    public static void main(String[] args) {
        
        bank bk = new bank (100);
        bk.getSaldo();
        bk.simpanUang(500);
        bk.ambil(200);
    }
}
