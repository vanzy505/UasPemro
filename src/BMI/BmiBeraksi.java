/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author iv4nm
 */

import java.util.Scanner;

public class BmiBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan (cm): ");
        float tinggi = input.nextFloat();

        System.out.print("Masukkan berat badan (kg): ");
        float berat = input.nextFloat();

        Bmi bmiApp = new Bmi(berat, tinggi);

        bmiApp.tampilkanHasil();

        input.close();
    }
}
