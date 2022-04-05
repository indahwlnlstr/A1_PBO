/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Sezzan
 */
public class Main {
    
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Data> listData = new ArrayList<Data>();
    private static int id = 1;
    private static Data ikanda;
    
    public static void main(String[] args){
        
        ikanda = new Data(1, "demo", 3, 4);
        listData.add(ikanda);
        
        int menu;
        do {
            System.out.println(" ~~ Kios Ikan Hias Minaria ~~ ");
            System.out.println(">> Daftar Ikan hias yang tersedia :");
            System.out.println("1. Ikan Guppy  Rp25000/ekor");
            System.out.println("2. Ikan Cupang Rp75000/ekor");
            System.out.println("3. Ikan Koi    Rp120000/ekor");
            System.out.println("4. Ikan Mas    Rp37500/ekor");
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("=============  Menu  ==============");
            System.out.println("1> Tambah data pesanan");
            System.out.println("2> Menampilkan data pesanan");
            System.out.println("3> Hapus data pesanan");
            System.out.println("4> Ubah data pesanan");
            System.out.println("0> Keluar");
            System.out.println("Masukkan Pilihan Anda");
            menu = input.nextInt(); input.nextLine();
            
                if(menu > 0){
                    menu_kios(menu);
                }
        }   
        while(menu != 0);        
        System.out.println("\nTerimakasih telah menggunakan program kami.");
        System.exit(0);
    }
    
    public static void menu_kios(int menu){
        switch(menu){
            case 1:
                tambah_data();
                break;
            case 2:
                liat_data();
                input_lagi();
                break;
            case 3:
                hapus_data();
                break;
            case 4:
                ubah_data();
                break;
            default:
                System.out.println("\nPilihan tidak tersedia");
                input_lagi();
        }
    }
    
    public static void tambah_data(){
        id++;
            System.out.println("\n Penambahan data ~~~");
            System.out.println("\n Masukkan Jenis ikan yang ingin dibeli : ");
            String jenisikan = input.nextLine();
            System.out.println("Masukkan Jumlah yang ingin dibeli : ");
            int jumlah = input.nextInt();
            System.out.println("Masukkan Harga : ");
            int harga = input.nextInt();
            
            ikanda = new Data(id, jenisikan, jumlah, harga);
            listData.add(ikanda);
            
            System.out.println("\nData berhasil ditambahkan");
            input.nextLine();
            input_lagi();
    }
    
    private static void liat_data(){
        System.out.println("~~ Liat data penjualan ~~");
        System.out.println("\nNo  Jenisikan\tJumlah  Harga");
        
        for (Data ikanda : listData){
            System.out.println(
                    ikanda.getId() + "  " + ikanda.getJenisikan() + "  " + ikanda.getJumlah() + " Rp " + ikanda.getHarga()
            );
        }
        System.out.println();
    }
    
    private static void ubah_data(){
        liat_data();
        System.out.println("~~ Mengubah data penjualan ~~");
        
        System.out.println("Masukkan no Penjualan : ");
        int no = input.nextInt(); input.nextLine();
        
        boolean change = false;
        
        for (Data ikanda : listData){
            if(ikanda.getId() == no){
                System.out.println("Masukkan Data Jenis Ikan baru : ");
                String jenisikan = input.nextLine();
                System.out.println("Masukkan Data Jumlah baru : ");
                int jumlah = input.nextInt();
                System.out.println("Masukkan Data Harga baru : ");
                int harga = input.nextInt(); input.nextLine();
                
                ikanda.setJenisikan(jenisikan);
                ikanda.setJumlah(jumlah);
                ikanda.setHarga(harga);
                
                change = true;
                break;
                
            }
        }
        
        if(change == false){
            System.out.println("\nData penjualan tidak ditemukan");
            input_lagi();
        }else{
            System.out.println("\nData telah diubah");
            input_lagi();
        }
    }
    
    
    private static void hapus_data(){
        liat_data();
        System.out.println("~~ Manghapus data penjualan");
        
        System.out.println("Masukkan no Penjualan : ");
        int no = input.nextInt(); input.nextLine();
        
        boolean hapus = false;
        
        for (Data ikanda : listData){
            if(ikanda.getId() == no){
                listData.remove(ikanda);
                hapus = true;
                break;
            }
        }
        if(hapus == false){
            System.out.println("\nData penjualan tidak ditemukan");
            input_lagi();
        }else{
            System.out.println("\nData telah dihapus");
            input_lagi();
        }
    }
    
    public static void input_lagi(){
        System.out.println("Tekan enter untuk kembali");
        input.nextLine();
    }
}

