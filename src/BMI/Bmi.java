/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author iv4nm
 */

public class Bmi {

    float berat;
    float tinggi;

    public Bmi(float berat, float tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public float hitung() {
        float meter = tinggi / 100;
        return berat / (meter * meter);
    }

    public String getStatus() {
        float bmi = hitung();
        if (bmi < 18.5) {
            return "kurus";
        } else if (bmi < 24.9) {
            return "normal";
        } else if (bmi < 26.9) {
            return "Ideal";
        } else if (bmi < 27.5) {
            return "Berlebihan";
        } else {
            return "Obesitas";
        }
    }

    public void tampilkanHasil() {
        System.out.println("======== Hasil BMI =========");
        System.out.printf("Index massa tubuh             : %.1f%n", hitung());
        System.out.println("Status Kesehatan              : " + getStatus());
        System.out.println("============================");
    }
}
