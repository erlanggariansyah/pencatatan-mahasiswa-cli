package com.huyai.model;

public class Mahasiswa extends Person {
    private Long nim;

    public Mahasiswa(String nama, Integer umur, Long nim) {
        super(nama, umur);
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim=" + nim +
                '}';
    }

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    @Override
    public String selfIntroduce() {
        return "Hai, nama saya " +
                this.getNama() +
                "! nim saya adalah " +
                this.getNim() +
                ".";
    }
}
