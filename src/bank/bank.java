/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author iv4nm
 */
public class bank {
    int saldo;
    public bank (int saldo){
        this.saldo = saldo;
    }
    void getSaldo (){
        System.out.println("welcome to bank ");
        System.out.println("saldo saat ini : Rp." + saldo);
    }
    void simpanUang (int simpan){
        saldo += simpan;
        System.out.println("Anda kirim uang : Rp." + simpan);
        System.out.println("saldo anda saat ini : Rp." + saldo);
    }
    void ambil (int ambil){
        saldo -= ambil;
        System.out.println("ambil uang nominal : Rp." + ambil);
        System.out.println("Saldo anda saat ini : Rp." + saldo);
    }
}
