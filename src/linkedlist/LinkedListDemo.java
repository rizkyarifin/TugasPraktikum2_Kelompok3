package linkedlist;

import java.util.Scanner;

public class LinkedListDemo {
    private StudentLinkedList daftarMahasiswa = new StudentLinkedList();
    private Scanner scanner = new Scanner(System.in);
    
    public void run() {
        System.out.println("\n===========================================");
        System.out.println("   SISTEM MANAJEMEN DATA MAHASISWA");
        System.out.println("        (LINKED LIST)");
        System.out.println("===========================================\n");
        
        // Menambahkan data awal untuk demonstrasi
        System.out.println("Menambahkan data awal mahasiswa...");
        daftarMahasiswa.tambahMahasiswa(new Student("12345", "Andi", 85));
        daftarMahasiswa.tambahMahasiswa(new Student("67890", "Budi", 90));
        daftarMahasiswa.tambahMahasiswa(new Student("11111", "Siti", 88));
        daftarMahasiswa.tambahMahasiswa(new Student("22222", "Dewi", 92));

        daftarMahasiswa.tampilkanDaftarMahasiswa();
        
        boolean running = true;
        while (running) {
            System.out.println("\n===========================================");
            System.out.println("           MENU OPERASI");
            System.out.println("===========================================");
            System.out.println("1. Tambah Mahasiswa Baru");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Update Nilai Mahasiswa");
            System.out.println("4. Cari Mahasiswa");
            System.out.println("5. Tampilkan Daftar Mahasiswa");
            System.out.println("6. Kembali ke Menu Utama");
            System.out.println("===========================================");
            System.out.print("Pilih operasi (1-6): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    tambahMahasiswaBaru();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 3:
                    updateNilaiMahasiswa();
                    break;
                case 4:
                    cariMahasiswa();
                    break;
                case 5:
                    daftarMahasiswa.tampilkanDaftarMahasiswa();
                    break;
                case 6:
                    running = false;
                    System.out.println("Kembali ke menu utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
    
    private void tambahMahasiswaBaru() {
        System.out.println("\n--- Tambah Mahasiswa Baru ---");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nilai: ");
        int nilai = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        daftarMahasiswa.tambahMahasiswa(new Student(nim, nama, nilai));
    }
    
    private void hapusMahasiswa() {
        System.out.println("\n--- Hapus Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();
        
        daftarMahasiswa.hapusMahasiswa(nim);
    }
    
    private void updateNilaiMahasiswa() {
        System.out.println("\n--- Update Nilai Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan nilai baru: ");
        int nilaiBaru = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        daftarMahasiswa.updateNilaiMahasiswa(nim, nilaiBaru);
    }
    
    private void cariMahasiswa() {
        System.out.println("\n--- Cari Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String nim = scanner.nextLine();
        
        Student mahasiswa = daftarMahasiswa.cariMahasiswa(nim);
        if (mahasiswa != null) {
            System.out.println("Mahasiswa ditemukan: " + mahasiswa);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
        }
    }
}