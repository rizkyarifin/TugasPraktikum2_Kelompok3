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
       Node current = head;
       while (current != null) {
           if (current.getData().getNim().equals(nim)) {
               int nilaiLama = current.getData().getNilai();
               current.getData().setNilai(nilaiBaru);
               System.out.println("Nilai mahasiswa " + current.getData().getNama() +
                       " berhasil diupdate dari " + nilaiLama + " menjadi " + nilaiBaru);
               return;
           }
           current = current.getNext();
       }

        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
    }
    
    public void tampilkanDaftarMahasiswa() {
        if (head == null) {
            System.out.println("Daftar mahasiswa kosong!");
            return;
        }

        System.out.println("\nDaftar Mahasiswa:");
        Node current = head;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor + ". " + current.getData());
            current = current.getNext();
            nomor++;
        }
        System.out.println("Total mahasiswa: " + size);
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