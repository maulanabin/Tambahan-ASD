package com.maulana.uts.kasus2;

public class DaftarBuku {
    public Pustakawan listBuku[] = new Pustakawan[4];
    public int idx, sama = 0;

    void tambah(Pustakawan b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Pustakawan b : listBuku) {
            b.tampil();
            System.out.println();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 1; j < listBuku.length - i; j++) {
                if (listBuku[j].tinggiBuku < listBuku[j - 1].tinggiBuku) {

                    Pustakawan tmp = listBuku[j];
                    listBuku[j] = listBuku[j - 1];
                    listBuku[j - 1] = tmp;
                }
            }
        }
    }

    public int FindBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listBuku[mid].tinggiBuku) {
                return (mid);
            } else if (listBuku[mid].tinggiBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int dataSama(double cari) {

        for (int i = 0; i < listBuku.length; i++) {
            if (cari == listBuku[i].tinggiBuku) {
                sama++;
            }
        }
        return sama;
    }

    public void Tampilposisi(double x, int pos) {
        if (pos != -1) {
            for (int i = 0; i < sama; i++) {
                if (i > 0) {
                    System.out.println("Judul\t\t: " + listBuku[pos].judul);
                    System.out.println("Jumlah Halaman\t: " + listBuku[pos].jumlahHalaman);
                    System.out.println("Ukuran Buku\t: " + listBuku[pos].ukuran);
                    System.out.println("Tinggi Buku\t: " + listBuku[pos].tinggiBuku + " cm");
                    System.out.println("===========================================================");
                } else {
                    System.out.println("===========================================================");
                    System.out.println("Buku dengan tinggi " + x + " cm ditemukan");
                    System.out.println("Judul\t\t: " + listBuku[pos].judul);
                    System.out.println("Jumlah Halaman\t: " + listBuku[pos].jumlahHalaman);
                    System.out.println("Ukuran Buku\t: " + listBuku[pos].ukuran);
                    System.out.println("Tinggi Buku\t: " + listBuku[pos].tinggiBuku + " cm");
                    System.out.println("===========================================================");
                }
            }
        } else {
            System.out.println("Tidak ditemukan buku dengan tinggi " + x + " cm");
        }
    }
}