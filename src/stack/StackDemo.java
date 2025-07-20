package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    private String text = "";
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private Scanner scanner = new Scanner(System.in);

    // Menambahkan teks baru
    public void addText(String newText) {
        undoStack.push(text); // simpan keadaan sebelumnya untuk undo
        text += newText;
        redoStack.clear(); // redo harus dikosongkan setelah perubahan baru
    }

    // Undo (mengembalikan ke kondisi sebelumnya)
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text); // simpan current state ke redo
            text = undoStack.pop(); // ambil keadaan sebelumnya
            System.out.println("Undo: \"" + text + "\"");
        } else {
            System.out.println("Tidak ada yang bisa di-undo.");
        }
    }

    // Redo (mengembalikan perubahan yang di-undo)
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text); // simpan current state ke undo
            text = redoStack.pop(); // ambil perubahan yang di-undo
            System.out.println("Redo: \"" + text + "\"");
        } else {
            System.out.println("Tidak ada yang bisa di-redo.");
        }
    }

    public void showText() {
        System.out.println("Teks saat ini: \"" + text + "\"");
    }

    // Run method untuk integrasi dengan MainMenu
    public void run() {
        int choice;

        // Inisialisasi dengan contoh teks
        System.out.println("=== TEXT EDITOR dengan UNDO/REDO ===");
        System.out.println("Menambahkan teks awal untuk demonstrasi...");
        addText("Selamat");
        showText();
        
        do {
            System.out.println("\n=== MENU EDITOR TEKS ===");
            System.out.println("1. Tambah Teks");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Tampilkan Teks");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    String newText = scanner.nextLine();
                    addText(newText);
                    showText();
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    redo();
                    break;
                case 4:
                    showText();
                    break;
                case 5:
                    System.out.println("Kembali ke menu utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }
}