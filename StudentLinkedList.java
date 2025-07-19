public class StudentLinkedList {
    private Node head;
    private int size;
    
    public StudentLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public void tambahMahasiswa(Student student) {
        Node newNode = new Node(student);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan: " + student.getNama());
    }
    
    public void hapusMahasiswa(String nim) {
        if (head == null) {
            System.out.println("Daftar mahasiswa kosong!");
            return;
        }
        
        if (head.getData().getNim().equals(nim)) {
            System.out.println("Mahasiswa " + head.getData().getNama() + " berhasil dihapus.");
            head = head.getNext();
            size--;
            return;
        }
        
        Node current = head;
        Node previous = null;
        
        while (current != null && !current.getData().getNim().equals(nim)) {
            previous = current;
            current = current.getNext();
        }
        
        if (current == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
            return;
        }
        
        System.out.println("Mahasiswa " + current.getData().getNama() + " berhasil dihapus.");
        previous.setNext(current.getNext());
        size--;
    }
    
    public void updateNilaiMahasiswa(String nim, int nilaiBaru) {
        // TODO: Implementasikan method untuk mengupdate nilai mahasiswa
        // Langkah-langkah yang perlu dilakukan:
        // 1. Inisialisasi variabel Node current dengan head
        // 2. Lakukan traversal linked list dengan while loop (selama current != null)
        // 3. Di dalam loop, cek apakah NIM mahasiswa di node current sama dengan parameter nim
        //    Gunakan: current.getData().getNim().equals(nim)
        // 4. Jika ditemukan:
        //    a. Simpan nilai lama untuk ditampilkan: int nilaiLama = current.getData().getNilai()
        //    b. Update nilai dengan: current.getData().setNilai(nilaiBaru)
        //    c. Tampilkan pesan sukses dengan format:
        //       "Nilai mahasiswa [nama] berhasil diupdate dari [nilaiLama] menjadi [nilaiBaru]"
        //    d. Return untuk keluar dari method
        // 5. Jika tidak ditemukan dalam loop, pindah ke node berikutnya dengan: current = current.getNext()
        // 6. Jika sampai akhir linked list tidak ditemukan (keluar dari loop),
        //    tampilkan pesan: "Mahasiswa dengan NIM [nim] tidak ditemukan!"
        
        // Implementasi di sini
        System.out.println("Method updateNilaiMahasiswa belum diimplementasikan!");
    }
    
    public void tampilkanDaftarMahasiswa() {
        // TODO: Implementasikan method untuk menampilkan daftar seluruh mahasiswa
        // Langkah-langkah yang perlu dilakukan:
        // 1. Cek apakah linked list kosong (head == null)
        //    Jika kosong, tampilkan "Daftar mahasiswa kosong!" dan return
        // 2. Jika tidak kosong, tampilkan header "\nDaftar Mahasiswa:"
        // 3. Inisialisasi:
        //    a. Node current = head (untuk traversal)
        //    b. int nomor = 1 (untuk penomoran)
        // 4. Lakukan traversal dengan while loop (selama current != null):
        //    a. Tampilkan data mahasiswa dengan format: "[nomor]. [data mahasiswa]"
        //       Gunakan: System.out.println(nomor + ". " + current.getData())
        //    b. Pindah ke node berikutnya: current = current.getNext()
        //    c. Increment nomor: nomor++
        // 5. Setelah loop selesai, tampilkan total mahasiswa:
        //    System.out.println("Total mahasiswa: " + size)
        
        // Catatan: Method toString() di class Student sudah menghandle format output
        // Format output per mahasiswa: "NIM: [nim], Nama: [nama], Nilai: [nilai]"
        
        // Implementasi di sini
        System.out.println("Method tampilkanDaftarMahasiswa belum diimplementasikan!");
    }
    
    public Student cariMahasiswa(String nim) {
        Node current = head;
        
        while (current != null) {
            if (current.getData().getNim().equals(nim)) {
                return current.getData();
            }
            current = current.getNext();
        }
        
        return null;
    }
    
    public int getSize() {
        return size;
    }
    
    public long hitungWaktuOperasi(String operasi, String nim, Student student, int nilaiBaru) {
        long startTime = System.nanoTime();
        
        switch (operasi) {
            case "tambah":
                tambahMahasiswa(student);
                break;
            case "hapus":
                hapusMahasiswa(nim);
                break;
            case "update":
                updateNilaiMahasiswa(nim, nilaiBaru);
                break;
            case "tampilkan":
                tampilkanDaftarMahasiswa();
                break;
            case "cari":
                cariMahasiswa(nim);
                break;
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}