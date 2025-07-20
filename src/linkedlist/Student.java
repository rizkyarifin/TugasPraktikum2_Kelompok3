package linkedlist;

public class Student {
    private String nim;
    private String nama;
    private int nilai;
    
    public Student(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getNilai() {
        return nilai;
    }
    
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}