package com.huyai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();

        Integer choice = Menu.getInput();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("\nLagi? (0/1)");
                choice = menu.getInput();
        }

        if (choice.equals(1)) {
            // ongoing
        }
    }
}

class Menu {
    public void showMenu() {
        String[] listMenu = {
                "Lihat data mahasiswa",
                "Input data mahasiswa"
        };

        for (int i = 1; i < listMenu.length + 1; i++) {
            System.out.println(i + ". " + listMenu[i - 1]);
        }
    }

    public static Integer getInput() {
        Scanner scanner;
        Integer output = 0;

        System.out.println("\n\nPilihan: ");
        try {
            scanner = new Scanner(System.in);
            output = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
        }

        return output;
    }
}
