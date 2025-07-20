package main;

import linkedlist.LinkedListDemo;
import queue.QueueDemo;
import stack.StackDemo;
import java.util.Scanner;

/**
 * Main Menu untuk Tugas Praktikum 2
 * Implementasi Linked List, Stack, dan Queue
 */
public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("       TUGAS PRAKTIKUM 2 - KELOMPOK");
        System.out.println("   Implementasi Linked List, Stack, Queue");
        System.out.println("===========================================");
        
        boolean running = true;
        while (running) {
            System.out.println("\n===========================================");
            System.out.println("              MENU UTAMA");
            System.out.println("===========================================");
            System.out.println("1. Sistem Manajemen Data Mahasiswa (Linked List)");
            System.out.println("2. Sistem Antrean Customer Service (Queue)");
            System.out.println("3. Fitur Undo/Redo Editor Teks (Stack)");
            System.out.println("4. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    LinkedListDemo linkedListDemo = new LinkedListDemo();
                    linkedListDemo.run();
                    break;
                case 2:
                    QueueDemo queueDemo = new QueueDemo();
                    queueDemo.run();
                    break;
                case 3:
                    StackDemo stackDemo = new StackDemo();
                    stackDemo.run();
                    break;
                case 4:
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
}