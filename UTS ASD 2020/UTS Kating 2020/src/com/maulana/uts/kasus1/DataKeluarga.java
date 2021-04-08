package com.maulana.uts.kasus1;

public class DataKeluarga {
    public String nama, posisi;
    public int umur;

    public DataKeluarga(String nama, String posisi, int umur) {
        this.nama = nama;
        this.posisi = posisi;
        this.umur = umur;
    }
    public void tampil() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Posisi\t: " + posisi);
        System.out.println("Umur\t: " + umur);
    }
}
