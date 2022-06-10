package com.huyai.services;

import com.huyai.controller.MahasiswaController;

import java.util.Scanner;

/**
 * class Menu, class yang digunakan untuk menampilkan list menu serta memanggil controller untuk menjalankan operasi.
 */
public class Menu {
    // deklarasi constant variable mahasiswaController yang berisi object MahasiswaController
    // variable dengan access modifiers private
    private final MahasiswaController mahasiswaController = new MahasiswaController();

    /**
     * public function showMenu, function yang menampilkan list sekaligus menjalankan controller.
     * void, tidak mereturn value. hanya menampilkannya ke console.
     */
    public void showMenu() {
        // menetapkan menu kedalam variable Array<String> listMenu
        String[] listMenu = {
                "Lihat data mahasiswa",
                "Input data mahasiswa"
        };

        // perulangan untuk menampilkan setiap instance dari listMenu variable
        for (int i = 1; i < listMenu.length + 1; i++) {
            System.out.println(i + ". " + listMenu[i - 1]);
        }

        // deklarasi pilihan, untuk menampung value yang diinput
        // tipe integer, dengan value yang memanggil static function dari class Menu
        // static function dari class Menu mereturn value berupa integer yang akan langsung diambil oleh variable choice
        Integer choice = Menu.getInput();

        // pengkondisian untuk setiap value dari choice
        switch (choice) {
            // sesuai dengan list yang ada di variable listMenu
            // jika choice adalah 1, maka panggil function index dari constant variable mahasiswaController
            // setiap case akan menginisiasi variable choice dengan return value dari setiap function yang dipanggil
            // constant variable mahasiswaController sebelumnya telah dideklarasikan dengan value class MahasiswaController
            case 1 -> choice = mahasiswaController.index();

            // jika choice adalah 2, maka panggil function create pada constant variable mahasiswaController
            case 2 -> choice = mahasiswaController.create();

            // tetapi jika tidak, maka tanya apakah ingin menjalankan aplikasi kembali
            default -> {
                System.out.println("Lagi? (0 jika tidak)");
                choice = Menu.getInput();
            }
        }

        // jika choice tidak sama dengan 0 / false, maka tampilkan menu kembali
        if (!choice.equals(0)) {
            this.showMenu();
        }
    }

    /**
     * static function getInput dengan acccess modifiers public
     * fungsi ini bertugas sebagai helper untuk mengambil input dari console dan memiliki error handling
     */
    public static Integer getInput() {
        // deklarasi variable scanner dengan expect value tipe class Scanner
        Scanner scanner;

        // deklarasi variable output dengan default value = 0
        // output ini merupakan value yang nantinya direturn
        int output = 0;

        System.out.println("Pilihan: ");

        // error handling, untuk setiap anomali akan dianggap sebagai error input tidak sesuai
        try {
            // menginisasi variable scanner yang sebelumnya telah dideklarasikan
            scanner = new Scanner(System.in);

            // menginisasi kembali value output sebagai value yang dipilih user
            output = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input tidak sesuai.");
        }

        // mereturn value output
        return output;
    }
}
