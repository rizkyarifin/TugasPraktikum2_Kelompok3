import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList daftarMahasiswa = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("    SISTEM MANAJEMEN DATA MAHASISWA");
        System.out.println("       MENGGUNAKAN LINKED LIST");
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
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Cari Mahasiswa");
            System.out.println("6. Analisis Waktu Eksekusi");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- TAMBAH MAHASISWA BARU ---");
                    System.out.print("Masukkan NIM: ");
                    String nimBaru = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    int nilaiBaru = scanner.nextInt();
                    
                    daftarMahasiswa.tambahMahasiswa(new Student(nimBaru, namaBaru, nilaiBaru));
                    break;
                    
                case 2:
                    System.out.println("\n--- HAPUS MAHASISWA ---");
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    
                    daftarMahasiswa.hapusMahasiswa(nimHapus);
                    break;
                    
                case 3:
                    System.out.println("\n--- UPDATE NILAI MAHASISWA ---");
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimUpdate = scanner.nextLine();
                    System.out.print("Masukkan nilai baru: ");
                    int nilaiUpdate = scanner.nextInt();
                    
                    daftarMahasiswa.updateNilaiMahasiswa(nimUpdate, nilaiUpdate);
                    break;
                    
                case 4:
                    daftarMahasiswa.tampilkanDaftarMahasiswa();
                    break;
                    
                case 5:
                    System.out.println("\n--- CARI MAHASISWA ---");
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nimCari = scanner.nextLine();
                    
                    Student mahasiswaDitemukan = daftarMahasiswa.cariMahasiswa(nimCari);
                    if (mahasiswaDitemukan != null) {
                        System.out.println("Mahasiswa ditemukan: " + mahasiswaDitemukan);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan!");
                    }
                    break;
                    
                case 6:
                    analisisWaktuEksekusi(daftarMahasiswa);
                    break;
                    
                case 7:
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan sistem!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-7.");
            }
        }
        
        scanner.close();
    }
    
    private static void analisisWaktuEksekusi(StudentLinkedList daftarMahasiswa) {
        System.out.println("\n===========================================");
        System.out.println("     ANALISIS WAKTU EKSEKUSI OPERASI");
        System.out.println("===========================================");
        
        // Test tambah mahasiswa
        Student testStudent = new Student("99999", "Test", 95);
        long waktuTambah = daftarMahasiswa.hitungWaktuOperasi("tambah", null, testStudent, 0);
        System.out.println("Waktu Tambah Mahasiswa: " + waktuTambah + " nanoseconds");
        
        // Test cari mahasiswa
        long waktuCari = daftarMahasiswa.hitungWaktuOperasi("cari", "99999", null, 0);
        System.out.println("Waktu Cari Mahasiswa: " + waktuCari + " nanoseconds");
        
        // Test update nilai
        long waktuUpdate = daftarMahasiswa.hitungWaktuOperasi("update", "99999", null, 100);
        System.out.println("Waktu Update Nilai: " + waktuUpdate + " nanoseconds");
        
        // Test hapus mahasiswa
        long waktuHapus = daftarMahasiswa.hitungWaktuOperasi("hapus", "99999", null, 0);
        System.out.println("Waktu Hapus Mahasiswa: " + waktuHapus + " nanoseconds");
        
        // Test tampilkan daftar
        long waktuTampilkan = daftarMahasiswa.hitungWaktuOperasi("tampilkan", null, null, 0);
        System.out.println("\nWaktu Tampilkan Daftar: " + waktuTampilkan + " nanoseconds");
        
        System.out.println("\n--- ANALISIS KOMPLEKSITAS ---");
        System.out.println("1. Tambah Mahasiswa: O(n) - harus traverse sampai akhir list");
        System.out.println("2. Hapus Mahasiswa: O(n) - worst case harus traverse seluruh list");
        System.out.println("3. Update Nilai: O(n) - harus mencari mahasiswa terlebih dahulu");
        System.out.println("4. Cari Mahasiswa: O(n) - linear search");
        System.out.println("5. Tampilkan Daftar: O(n) - harus traverse seluruh list");
    }
}