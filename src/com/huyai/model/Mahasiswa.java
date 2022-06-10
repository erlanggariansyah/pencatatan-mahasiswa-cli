package com.huyai.model;

/**
 * class Mahasiswa, merupakan child class dari class Person
 * class ini digunakan sebagai identifier mahasiswa
 */
public class Mahasiswa extends Person {
    // deklarasi variable nim
    private Long nim;

    // constructor untuk class Mahasiswa
    public Mahasiswa(String nama, Integer umur, Long nim) {
        super(nama, umur);
        this.nim = nim;
    }

    // method convert to string
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim=" + nim +
                '}';
    }

    // getter properti nim
    public Long getNim() {
        return nim;
    }

    // setter properti nim
    public void setNim(Long nim) {
        this.nim = nim;
    }

    // overriding methods self introduce
    @Override
    public String selfIntroduce() {
        return "Hai, nama saya " +
                this.getNama() +
                "! nim saya adalah " +
                this.getNim() +
                ".";
    }
}
