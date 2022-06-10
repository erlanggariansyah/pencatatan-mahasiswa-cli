package com.huyai.services;

import com.huyai.controller.MahasiswaController;

import java.util.Scanner;

public class Menu {
    private final MahasiswaController mahasiswaController = new MahasiswaController();

    public void showMenu() {
        String[] listMenu = {
                "Lihat data mahasiswa",
                "Input data mahasiswa"
        };

        for (int i = 1; i < listMenu.length + 1; i++) {
            System.out.println(i + ". " + listMenu[i - 1]);
        }

        Integer choice = Menu.getInput();
        switch (choice) {
            case 1 -> choice = mahasiswaController.index();
            case 2 -> choice = mahasiswaController.create();
            default -> {
                System.out.println("Lagi? (0 jika tidak)");
                choice = Menu.getInput();
            }
        }

        if (!choice.equals(0)) {
            this.showMenu();
        }
    }

    public static Integer getInput() {
        Scanner scanner;
        int output = 0;

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
