package com.maulana.uts.kasus2;

public class Pustakawan {

    String judul, ukuran;
    int jumlahHalaman;
    double tinggiBuku;

    Pustakawan(String j, int jml, String u, double tg) {
        judul = j;
        jumlahHalaman = jml;
        ukuran = u;
        tinggiBuku = tg;
    }

    void tampil() {
        System.out.println("Judul = " + judul);
        System.out.println("Jumlah Halaman = " + jumlahHalaman);
        System.out.println("Ukuran Buku = " + ukuran);
        System.out.println("Tinggi Buku = " + tinggiBuku + " cm");
    }
}