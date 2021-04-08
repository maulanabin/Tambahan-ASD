package com.maulana.uts.penambahankasus2;

public class Buku {
    String judul;
    int jumHal;
    double tinggiBuku;

    Buku (String j, int jum, double tg){
        judul = j;
        jumHal = jum;
        tinggiBuku = tg;
    }
    void tampil(){
        System.out.println("judul : "+judul);
        System.out.println("Jumlah Halaman : "+jumHal);
        System.out.println("Tinggi Buku : "+tinggiBuku);
    }
}