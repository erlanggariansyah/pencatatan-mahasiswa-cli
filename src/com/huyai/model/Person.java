package com.huyai.model;

public class Person {
    private String nama;
    private Integer umur;

    public Person(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
