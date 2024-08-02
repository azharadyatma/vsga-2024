package com.azharadyatma.vsga2024;

public class Kontak {
    private String nama;
    private String alamat;

    public Kontak(String alamat, String nama) {
        this.alamat = alamat;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
