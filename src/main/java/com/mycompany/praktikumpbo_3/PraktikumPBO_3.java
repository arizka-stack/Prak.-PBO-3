/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_3;

/**
 *
 * @author Aukhal Rifqi Z
 */
public class PraktikumPBO_3 {
    public static void main(String[] args) {
        // Membuat objek pertama dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();

        // Membuat objek kedua dari class Mobil
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Putih");
        mobil2.displayInfo();
        mobil2.startEngine();

        // Mengubah warna mobil kedua
        mobil2.setWarna("Merah");
        mobil2.displayInfo();
    }
}
