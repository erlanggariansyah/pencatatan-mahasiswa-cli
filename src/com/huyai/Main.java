package com.huyai;

import com.huyai.services.Menu;

/**
 * Main class
 */
public class Main {
    /**
     * static void main function, run the applications
     */
    public static void main(String[] args) {
        // Instansiasi class menu untuk memanggil function showMenu
        Menu menu = new Menu();

        // memanggil function showMenu untuk menampilkan list menu ke console
        menu.showMenu();
    }
}
