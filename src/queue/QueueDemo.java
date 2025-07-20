package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueDemo {
    // Queue untuk menyimpan daftar pelanggan
    private LinkedList<String> queue;
    private Scanner scanner;

    // Konstruktor
    public QueueDemo() {
        queue = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    // Tambahkan pelanggan ke antrean
    public void tambahPelanggan(String nama) {
        queue.addLast(nama); // enqueue
        System.out.println(nama + " telah ditambahkan ke antrean.");
    }

    // Layani pelanggan dari antrean (menghapus dari depan)
    public void layaniPelanggan() {
        if (queue.isEmpty()) {
            System.out.println("Antrean kosong, tidak ada pelanggan yang bisa dilayani.");
        } else {
            String dilayani = queue.removeFirst(); // dequeue
            System.out.println("Melayani pelanggan: " + dilayani);
        }
    }

    // Tampilkan seluruh pelanggan dalam antrean
    public void tampilkanAntrean() {
        if (queue.isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.println("Pelanggan dalam antrean:");
            int nomor = 1;
            for (String nama : queue) {
                System.out.println(nomor + ". " + nama);
                nomor++;
            }
        }
    }

    // Run method untuk integrasi dengan MainMenu
    public void run() {
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Antrean ===");
            System.out.println("1. Tambah pelanggan ke antrean");
            System.out.println("2. Layani pelanggan");
            System.out.println("3. Tampilkan antrean");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    tambahPelanggan(nama);
                    break;
                case 2:
                    layaniPelanggan();
                    break;
                case 3:
                    tampilkanAntrean();
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}