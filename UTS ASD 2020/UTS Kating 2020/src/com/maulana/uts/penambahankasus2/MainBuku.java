package com.maulana.uts.penambahankasus2;
import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        int jumBuku = 4;
        DaftarBuku data = new DaftarBuku();
        Searching string = new Searching();


        for(int i=0; i<jumBuku; i++){
            System.out.print("Judul : ");
            String judul = sc1.nextLine();
            System.out.print("Jumlah Halaman : ");
            int jum = sc.nextInt();
            System.out.print("Tinggi Buku : ");
            double tinggi = sc.nextDouble();
            System.out.println();

            Buku b = new Buku(judul, jum, tinggi);
            data.tambah(b);
        }
        System.out.println("Tinggi Buku Sebelum Sorting");
        data.tampil();
        System.out.println();

        System.out.println("Tinggi Buku Setelah Sorting");
        data.selectionSort();
        data.tampil();

        String[] buku;
        System.out.print("Masukkan jumlah buku :");
        buku = new String[sc.nextInt()];
        for (int i = 0; i < buku.length; i++) {
            System.out.print("Masukkan buku ke :" + (i + 1) + " :");
            buku[i] = sc.nextLine();
        }
        String[] max;
        System.out.print("Masukkan jumlah buku :");
        max = new String[sc.nextInt()];
        for (int i = 0; i < max.length; i++) {
            System.out.print("Masukkan string ke :" + (i + 1) + " :");
            max[i] = sc.nextLine();
        }
    }
}
