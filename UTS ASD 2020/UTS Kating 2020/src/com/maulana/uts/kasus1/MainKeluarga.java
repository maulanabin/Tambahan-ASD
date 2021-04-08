package com.maulana.uts.kasus1;
import java.util.Scanner;
public class MainKeluarga {
    public static void main(String[] args) {
        Scanner userInputTeks = new Scanner(System.in);
        Scanner userInputAngka = new Scanner(System.in);
        Keluarga family = new Keluarga();
        System.out.print("Masukkan jumlah anggota keluarga: ");
        int jumlahKeluarga = userInputAngka.nextInt();
        family.Keluarga(jumlahKeluarga);
        userInputTeks.nextLine();
        System.out.print("\n");

        for (int i = 0; i < jumlahKeluarga; i++) {
            System.out.printf("+++ Input Data Anggota Keluarga %d +++\n", (i + 1));
            System.out.print("Nama\t: ");
            String nama = userInputTeks.nextLine();
            System.out.print("Posisi\t: ");
            String posisi = userInputTeks.nextLine();
            System.out.print("Umur\t: ");
            int umur = userInputAngka.nextInt();
            System.out.println("========================================");

            DataKeluarga dk = new DataKeluarga(nama, posisi, umur);
            family.tambah(dk);
        }
        System.out.println("Pengurutan berdasarkan umur termuda-tertua");
        family.selectionSortAsc();
        family.tampil();
        System.out.print("Cari anggota keluarga berdasarkan umur: ");
        int cari = userInputAngka.nextInt();
        int posisi = family.findBinarySearch(cari, 0, jumlahKeluarga);
        family.tampilPosisi(cari, posisi);
        family.tampilCari(posisi);
    }
}
