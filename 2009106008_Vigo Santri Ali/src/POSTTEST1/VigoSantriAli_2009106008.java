/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VigoSantriAli_2009106008 {

    static Scanner input;
    public static List<String> Petarung = new ArrayList<String>() {
        {
            add("Khabib");
            add("Conor");
            add("Justin");
            add("Adesanya");
            add("Porier");
            add("Max");
            add("Tony");
        }
    };

    public static void main(String[] args) {
        
        input = new Scanner(System.in);
        
        while (true) {
            menu();
        }
    }

    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("=== LIST PETARUNG ===");
        System.out.println("[1] Lihat Petarung");
        System.out.println("[2] Tambah Petarung");
        System.out.println("[3] Hapus Petarung");
        System.out.println("[4] Cari Petarung");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        if (selectedMenu.equals("1")) {
            showPetarung();
        } else if (selectedMenu.equals("2")) {
            addPetarung();
        } else if (selectedMenu.equals("3")) {
            deletePetarung();
        } else if (selectedMenu.equals("4")) {
            findPetarung();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            clearScreen();
            System.out.println("Anda salah pilih menu!");
            backToMenu();
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void showPetarung() {
        clearScreen();

        if (Petarung.size() <= 0) {
            System.out.println("Data Petarung Kosong!");
            backToMenu();

        } else {
            System.out.println("DATA PETARUNG:");
            int index = 0;
            for (String data : Petarung) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
            backToMenu();
        }
    }

    static void addPetarung() {
        clearScreen();

        System.out.println("MENAMBAH PETARUNG");
        System.out.print("Masukkan nama petarung : ");

        String namaPetarung = input.nextLine();

        try {
            Petarung.add(namaPetarung);
            System.out.print("Berhasil menambahkan Petarung");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }

    

    static void findPetarung() {
        clearScreen();

        System.out.println("MENCARI PETARUNG");
        System.out.print("Cari : ");

        String namaPetarung = input.nextLine();
        System.out.println("PETARUNG YANG DITEMUKAN");
        for (String Petarung : Petarung) {
            if (Petarung.contains(namaPetarung)) {
                // String find[] = namaBarang;
                System.out.println(Petarung);
            }
        }

        backToMenu();

    }

    static void deletePetarung() {
        clearScreen();

        System.out.println("MENGHAPUS PETARUNG");
        System.out.print("Masukkan nama petarung : ");

        String namaPetarung = input.nextLine();

        try {
            Petarung.remove(namaPetarung);
            System.out.print("Berhasil menghapus petarung");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }
}