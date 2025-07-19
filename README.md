# Sistem Manajemen Data Mahasiswa dengan Linked List

## Deskripsi
Program ini merupakan implementasi sistem manajemen data mahasiswa menggunakan struktur data Linked List dalam bahasa Java.

## File-file dalam Project
1. **Node.java** - Class untuk node dalam linked list
2. **Student.java** - Class untuk merepresentasikan data mahasiswa
3. **StudentLinkedList.java** - Implementasi linked list dengan operasi CRUD
4. **ManajemenDataMahasiswa.java** - Program utama dengan menu interaktif

## Fitur
- Tambah mahasiswa baru
- Hapus mahasiswa berdasarkan NIM
- Update nilai mahasiswa
- Tampilkan daftar mahasiswa
- Cari mahasiswa berdasarkan NIM
- Analisis waktu eksekusi operasi

## Cara Menjalankan
1. Compile semua file Java:
   ```bash
   javac *.java
   ```
2. Jalankan program utama:
   ```bash
   java ManajemenDataMahasiswa
   ```

## Kompleksitas Waktu
- Tambah Mahasiswa: O(n)
- Hapus Mahasiswa: O(n)
- Update Nilai: O(n)
- Cari Mahasiswa: O(n)
- Tampilkan Daftar: O(n)