/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author iv4nm
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilKu = new Mobil();
        
        mobilKu.warna = "biru";
        mobilKu.tahunProduksi = 2000;
        
        System.out.println("Warna : " + mobilKu.warna);
        System.out.println("Tahun produksi : " + mobilKu.tahunProduksi);
    }
}
