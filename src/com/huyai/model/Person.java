package com.huyai.model;

/**
 * class Person, sebagai parent class untuk class Mahasiswa
 * class ini mengimplementasikan setiap fungsi dari PersonInterface
 */
public class Person implements PersonInterface {
    // deklarasi variable nama dengan access modifiers private
    private String nama;

    // deklarasi variable umur dengan access modifiers private
    private Integer umur;

    // constructor untuk class Person
    public Person(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // method convert to string
    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }

    // getter properti nama
    public String getNama() {
        return nama;
    }

    // setter properti nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter properti umur
    public Integer getUmur() {
        return umur;
    }

    // setter properti umur
    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    // method overriding (polymorphism) untuk self introduce
    @Override
    public String selfIntroduce() {
        return "Hai! Perkenalkan nama saya " + this.getNama() + ", saya berumur " + this.getUmur() + " tahun.";
    }
}
