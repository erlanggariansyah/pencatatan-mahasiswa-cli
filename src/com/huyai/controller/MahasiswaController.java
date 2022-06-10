package com.huyai.controller;

import com.huyai.Database;
import com.huyai.model.Mahasiswa;
import com.huyai.services.Menu;

import java.util.Scanner;

public class MahasiswaController {
    public Integer index() {
        int choice;

        Database.DbMahasiswa.forEach(mhs -> {
            System.out.println("=====");
            System.out.println(mhs.getNama());
            System.out.println(mhs.getUmur());
            System.out.println(mhs.getNim());
            System.out.println("=====");
        });

        System.out.println("Lagi? (0 jika tidak)");
        choice = Menu.getInput();

        return choice;
    }

    public Integer create() {
        String nama;
        int umur;
        long nim;

        Scanner scanner = new Scanner(System.in);
        Integer choice;

        System.out.println("\n=== INPUT DATA MAHASISWA ===\n");
        try {
            System.out.println("- Masukkan nama: \n");
            nama = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");
            choice = Menu.getInput();

            return choice;
        }

        try {
            System.out.println("- Masukkan umur: \n");
            umur = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");
            choice = Menu.getInput();

            return choice;
        }

        try {
            System.out.println("- Masukkan nim: \n");
            nim = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
            System.out.println("\nLagi? (0 jika tidak)");
            choice = Menu.getInput();

            return choice;
        }

        Mahasiswa mahasiswa = new Mahasiswa(nama, umur, nim);
        Database.DbMahasiswa.add(mahasiswa);
        System.out.println("\n=== BERHASIL ===\n");

        System.out.println("Lagi? (0 jika tidak)");
        choice = Menu.getInput();

        return choice;
    }
}
