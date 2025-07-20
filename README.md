# Tugas Praktikum 2 - Kelompok 3
## Implementasi Linked List, Stack, dan Queue

### Deskripsi
Proyek ini merupakan implementasi tiga struktur data fundamental (Linked List, Stack, dan Queue) dalam konteks aplikasi nyata menggunakan bahasa Java. Tugas ini merupakan bagian dari Praktikum Struktur Data dan Analisis Algoritma.

### Learning Outcomes
- **LO 1**: Explain the concept data structures and its usage in Computer Science
- **LO 2**: Analyze algorithm complexity: Students will be able to assess the time and space complexity of algorithms
- **LO 3**: Apply data structures and algorithm in Java

## Struktur Proyek

```
src/
├── linkedlist/              # Implementasi Linked List
│   ├── Node.java           # Class node untuk linked list
│   ├── Student.java        # Class data mahasiswa
│   ├── StudentLinkedList.java  # Implementasi linked list
│   └── LinkedListDemo.java # Demo sistem manajemen mahasiswa
│
├── queue/                   # Implementasi Queue
│   └── QueueDemo.java      # Sistem antrean customer service
│
├── stack/                   # Implementasi Stack
│   └── StackDemo.java      # Editor teks dengan undo/redo
│
└── main/
    └── MainMenu.java       # Menu utama program
```

## Implementasi

### 1. Linked List - Sistem Manajemen Data Mahasiswa
Menggunakan Single Linked List untuk mengelola data mahasiswa dengan fitur:
- Menambahkan mahasiswa baru
- Menghapus mahasiswa dari daftar
- Mengupdate nilai mahasiswa
- Menampilkan daftar mahasiswa
- Mencari mahasiswa berdasarkan NIM

### 2. Queue - Sistem Manajemen Antrean Customer Service
Implementasi Queue menggunakan LinkedList untuk simulasi layanan customer service dengan fitur:
- Tambah pelanggan baru ke antrean (enqueue)
- Layani pelanggan dari antrean (dequeue)
- Menampilkan daftar pelanggan dalam antrean

### 3. Stack - Editor Teks dengan Fitur Undo/Redo
Menggunakan dua Stack untuk menyimpan histori perubahan teks dengan fitur:
- Menambahkan teks baru
- Undo (mengembalikan ke kondisi sebelum perubahan)
- Redo (mengembalikan perubahan yang telah di-undo)

## Cara Menjalankan

### Kompilasi
```bash
# Compile semua file
javac -d out src/main/MainMenu.java src/linkedlist/*.java src/queue/*.java src/stack/*.java
```

### Menjalankan Program
```bash
# Jalankan dari menu utama
java -cp out main.MainMenu
```

## Kompleksitas Waktu

### Linked List Operations
- **Tambah Mahasiswa**: O(n) - menambah di akhir list
- **Hapus Mahasiswa**: O(n) - pencarian linear
- **Update Nilai**: O(n) - pencarian linear
- **Cari Mahasiswa**: O(n) - pencarian linear
- **Tampilkan Daftar**: O(n) - traversal seluruh list

### Queue Operations
- **Enqueue**: O(1) - menambah di belakang
- **Dequeue**: O(1) - menghapus dari depan
- **Display**: O(n) - menampilkan semua elemen

### Stack Operations
- **Push**: O(1) - menambah di atas
- **Pop**: O(1) - menghapus dari atas
- **Undo/Redo**: O(1) - operasi push/pop

## Contoh Output

### Linked List - Manajemen Data Mahasiswa
```
Daftar Mahasiswa:
1. NIM: 12345, Nama: Andi, Nilai: 85
2. NIM: 67890, Nama: Budi, Nilai: 90
Total mahasiswa: 2
```

### Queue - Sistem Antrean
```
Pelanggan dalam antrean:
1. Andi
2. Budi
3. Siti

Melayani pelanggan: Andi
```

### Stack - Editor Teks
```
Teks saat ini: "Selamat datang"
Undo: "Selamat"
Redo: "Selamat datang"
```

## Anggota Kelompok

### Pembagian Tugas:

1. **MUHAMMAD RIZKY ARIFIN (2802610061)**
   - Modul: Linked List
   - Tugas: Implementasi sistem manajemen data mahasiswa

2. **DWI RIZKY FITRIANA (2802621664)**
   - Modul: Linked List
   - Tugas: Implementasi sistem manajemen data mahasiswa

3. **MEGGI KASANDRA (2502095044)**
   - Modul: Queue
   - Tugas: Implementasi sistem antrean customer service

4. **TOFIK HIDAYAT (2802596403)**
   - Modul: Stack
   - Tugas: Implementasi editor teks dengan fitur undo/redo

5. **VINSENSIUS IGNASIUS WUISAN (2802611625)**
   - Modul: Dokumentasi dan Analisis
   - Tugas: Pembuatan dokumentasi proyek dan analisis kompleksitas algoritma

## Teknologi yang Digunakan
- Java SE 8 atau lebih tinggi
- IDE: IntelliJ IDEA / Eclipse / VS Code (opsional)

## Lisensi
Proyek ini dibuat untuk keperluan akademik dalam mata kuliah Struktur Data dan Analisis Algoritma.