package com.huyai;

import com.huyai.model.Mahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }
}

class Menu {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String[] listMenu = {
                "Lihat data mahasiswa",
                "Input data mahasiswa"
        };

        for (int i = 1; i < listMenu.length + 1; i++) {
            System.out.println(i + ". " + listMenu[i - 1]);
        }

        Integer choice = Menu.getInput();
        switch (choice) {
            case 1:
                Database.DbMahasiswa.forEach(mhs -> {
                    System.out.println("=====");
                    System.out.println(mhs.getNama());
                    System.out.println(mhs.getUmur());
                    System.out.println(mhs.getNim());
                    System.out.println("=====");
                });

                System.out.println("Lagi? (0 jika tidak)");
                choice = Menu.getInput();
                break;
            case 2:
                String nama;
                Integer umur;
                Long nim;


                System.out.println("\n=== INPUT DATA MAHASISWA ===\n");
                try {
                    System.out.println("- Masukkan nama: \n");
                    nama = scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Input tidak sesuai.");
                    System.out.println("\nLagi? (0 jika tidak)");
                    choice = Menu.getInput();
                    break;
                }

                try {
                    System.out.println("- Masukkan umur: \n");
                    umur = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Input tidak sesuai.");
                    System.out.println("\nLagi? (0 jika tidak)");
                    choice = Menu.getInput();
                    break;
                }

                try {
                    System.out.println("- Masukkan nim: \n");
                    nim = scanner.nextLong();
                } catch (Exception e) {
                    System.out.println("Input tidak sesuai.");
                    System.out.println("\nLagi? (0 jika tidak)");
                    choice = Menu.getInput();
                    break;
                }

                Mahasiswa mahasiswa = new Mahasiswa(nama, umur, nim);
                Database.DbMahasiswa.add(mahasiswa);
                System.out.println("\n=== BERHASIL ===\n");

                System.out.println("Lagi? (0 jika tidak)");
                choice = Menu.getInput();
                break;
            default:
                System.out.println("Lagi? (0 jika tidak)");
                choice = Menu.getInput();
        }

        if (!choice.equals(0)) {
            this.showMenu();
        }
    }

    public static Integer getInput() {
        Scanner scanner;
        Integer output = 0;

        System.out.println("Pilihan: ");
        try {
            scanner = new Scanner(System.in);
            output = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
        }

        return output;
    }
}
