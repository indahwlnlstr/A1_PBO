/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST1_Nata;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

public class POSTTEST1{

    static Scanner in = new Scanner (System.in);
    static ArrayList<String> daftar = new ArrayList<String>();
    public static void main(String[] args) {
        
        int menu;
        do{
            System.out.println("===========================================");
            System.out.println(" SELAMAT DATANG DI PROGRAM MANAJEMEN KERETA.");
            System.out.println(" SILAKAN KETIKKAN PILIHAN ANDA ");
            System.out.println("===========================================");
            System.out.println("1) Membuat Daftar Keberangkatan   ");
            System.out.println("2) Melihat Daftar Keberangkatan   ");
            System.out.println("3) Menghapus Daftar Keberangkatan   ");
            System.out.println("4) Mengedit Daftar Keberangkatan   ");
            System.out.println("5) Keluar Program   ");
            System.out.println("===========================================");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = in.nextInt();
            if (menu == 1){
                nambah();
            }
            else if (menu == 2){
                tampil();
            }
            else if (menu == 3){
                hapus();
            }
            else if (menu == 4){
                edit();
            }
            else if (menu == 5){
                System.exit(0);
            }
        } while (menu != 5);
    }

    private static void nambah() {
        System.out.print("Berikan kota keberangkatan : ");
        String kota = in.next();
        daftar.add(kota);
        System.out.println("Kota berhasil ditambahkan.\n");
    }

    private static void tampil() {
        System.out.println("Daftar Keberangkatan : ");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println(i+1 + ". " + daftar.get(i));
        }
        System.out.println();
    }

    private static void hapus() {
        tampil();
        System.out.print("Berikan nomor kota yang ingin dihapus : ");
        int idx = in.nextInt();
        daftar.remove(idx-1);
        System.out.println("Kota berhasil dihapus.\n");
    }

    private static void edit() {
        tampil();
        System.out.print("Berikan nomor kota yang ingin diubah : ");
        int idx = in.nextInt();
        System.out.print("Berikan kota keberangkatan : ");
        String kota = in.next();
        daftar.set(idx-1, kota);
        System.out.println("Kota berhasil diubah.\n");
    }
}