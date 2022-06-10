package com.huyai.controller;

import com.huyai.Database;
import com.huyai.model.Mahasiswa;
import com.huyai.services.Menu;

import java.util.Scanner;

/**
 * class MahasiswaController, digunakan sebagai logic dari aplikasi
 * class yang dipanggil untuk menjalankan operasi, serta input data kedalam database
 */
public class MahasiswaController {
    /**
     * method untuk menampilkan list mahasiswa ke console, dengan return method Integer
     * public access modifiers
     */
    public Integer index() {
        // mendeklarasikan variable choice
        int choice;

        // menampilkan seluruh object dari arraylist mahasiswa ke console menggunakan foreach
        Database.DbMahasiswa.forEach(mhs -> {
            System.out.println("=====");
            System.out.println(mhs.getNama());
            System.out.println(mhs.getUmur());
            System.out.println(mhs.getNim());
            System.out.println("=====");
        });

        System.out.println("Lagi? (0 jika tidak)");

        // inisiasi ulang variable choice
        choice = Menu.getInput();

        // mereturn choice
        return choice;
    }

    /**
     * method create, public access modifiers dengan return type Integer
     * method yang digunakan untuk menjalankan operasi tambah data mahasiswa
     */
    public Integer create() {
        // deklarasi variable nama
        String nama;

        // deklarasi variable umur
        int umur;

        // deklarasi variable nim
        long nim;

        // deklarasi variable scanner dengan value class Scanner
        Scanner scanner = new Scanner(System.in);

        // deklarasi variable choice
        // variable ini akan direturn sebagai value yang mewakili pilihan user
        Integer choice;

        System.out.println("\n=== INPUT DATA MAHASISWA ===\n");

        // error handling dengan try-catch
        try {
            System.out.println("- Masukkan nama: \n");

            // inisiasi variable nama
            nama = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");

            // jika terjadi error, maka variable choice akan diinisiasi ulang
            choice = Menu.getInput();

            // mereturn variable choice
            return choice;
        }

        try {
            System.out.println("- Masukkan umur: \n");

            // inisiasi ulang variable umur
            umur = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");

            // inisiasi ulang variable choice
            choice = Menu.getInput();

            // mereturn variable choice
            return choice;
        }

        try {
            System.out.println("- Masukkan nim: \n");

            // inisiasi ulang variable nim
            nim = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");

            // inisiasi ulang variable choice
            choice = Menu.getInput();

            // mereturn variable choice
            return choice;
        }

        // deklarasi variable mahasiswa, untuk mengumpulkan data yang menjadi informasi mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(nama, umur, nim);

        // memasukkan object mahasiswa kedalam database mahasiswa
        Database.DbMahasiswa.add(mahasiswa);
        System.out.println("\n=== BERHASIL ===\n");

        System.out.println("Lagi? (0 jika tidak)");

        // inisiasi ulang variable choice
        choice = Menu.getInput();

        // mereturn value variable choice
        return choice;
    }
}
