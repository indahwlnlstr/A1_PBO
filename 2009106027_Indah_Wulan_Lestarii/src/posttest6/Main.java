/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;
import pertemuan4.*;
import pertemuan3.*;
import pertemuan2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
import static pertemuan4.Main.inputdata;
import static posttest6.Main.inputdata;
/**
 *
 * @author ASUS
 */
public class Main {

    static ArrayList<Barang> barang = new ArrayList<Barang>();
    static ArrayList<gendongan> gendongan = new ArrayList<gendongan>();
    static ArrayList<baju> baju= new ArrayList<baju>();
    private static Object inputdata;
    private static Object namaBarang;
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
    
    public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("********************************");
            System.out.println("*         MENU BARANG          *");
            System.out.println("********************************");
            System.out.println("* 1. Tambah Data                *");
            System.out.println("* 2. Lihat Data                *"); 
            System.out.println("* 3. Edit Data                 *");
            System.out.println("* 4. Hapus Data                *");
            System.out.println("* 5. EXIT                      *");
            System.out.println("********************************");
            
            System.out.print("Masukkan Pilihan Anda : ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    inputdata();
                    break;
            case 2:
//                    lihatdata();
                    break;
            case 3:
                    ubahdata();
                    break;
            case 4:
//                    hapusdata();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }
public static void inputdata() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
          
    System.out.println("***************************");
    System.out.println("*    Input DATA BARANG    *");
    System.out.println("***************************");
    
        String kodeBarang;
        String namaBarang;
        int hargaBarang;
        String Bahan;
        int pilihan;
    
    System.out.println("1. Baju");
    System.out.println("2. Gendongan");
    System.out.println("Masukkan Pilihan Anda : ");
    pilihan = Integer.parseInt(inputdata.readLine());
    if (pilihan == 1) {
        System.out.println("Kode Baju : ");
        kodeBarang = input.readLine();
        System.out.println("Nama Baju : ");
        namaBarang = input.readLine();
        System.out.println("Harga     : ");
        hargaBarang = Integer.parseInt(input.readLine());
        System.out.println("Bahan : ");
        String bahan = input.readLine();
        Bahanbaju.add(new Bahanbaju(kodeBarang,namaBarang, hargaBarang, bahan));
        } else {
        if (pilihan == 2) {
        System.out.println("Kode Gendongan : ");
        kodeBarang = input.readLine();
        System.out.println("Nama Gendongan : ");
        namaBarang = input.readLine();
        System.out.println("Harga          : ");
        hargaBarang = Integer.parseInt(input.readLine());
        System.out.println("jumlah         : ");
        String jumlah = input.readLine();
        System.out.println("Bahan          : ");
        String bahan = input.readLine();
        gendongan.add(new gendongan(kodeBarang, namaBarang, hargaBarang, jumlah, bahan));
        }
    
}
}

   public static void plus()throws IOException{
            for(int i = 0 ; i < barang.size();i++){
                System.out.println(i+1);
                System.out.println("kode Barang    : " + barang.get(i).kodeBarang);
                System.out.println("Nama Barang    : " + barang.get(i).namaBarang);
                System.out.println("Harga Barang   : " + barang.get(i).hargaBarang);
                System.out.println("Bahan Barang   : " + barang.get(i).Bahan);
            }
}

public static void ubahdata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    
    System.out.println("***************************");
    System.out.println("*     UBAH DATA BARANG    *");
    System.out.println("***************************");
    int pilih;
    String kode;
    String nama;
    int harga;
    String bahan;
    plus();
    System.out.println("1. Baju");
    System.out.println("2. Gendongan");
    System.out.println("Masukan pilihan Anda: ");
    pilih = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Barang");
    if (pilih == 1) {
                        System.out.println("Masukan Nama Baju : ");
                        nama = input.readLine();
                        for (baju i : baju) {
                            if (i.getnamaBarang().equals(namaBarang)) {
                                System.out.println("Masukan Kode Baju baru : ");
                                i.setkodeBarang(input.readLine());
                                System.out.println("Masukan Nama Baju baru : ");
                                i.setnamaBarang(input.readLine());
                                System.out.println("Masukan Harga Baju baru : ");
                                i.sethargaBarang(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Bahan Baju baru : ");
                                i.setBahan(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan Nama Barang Lemari : ");
                        nama = input.readLine();
                        for (gendongan i : gendongan) {
                            if (i.getnamaBarang().equals(nama)) {
                                System.out.println("Masukan Kode Gendongan baru : ");
                                i.setnamaBarang(input.readLine());
                                System.out.println("Masukan Nama Gendongan baru : ");
                                i.setnamaBarang(input.readLine());
                                System.out.println("Masukan Harga Gendongan baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Jumlah Gendongan Baru : ");
                                i.setjumlah(input.readLine());
                                    System.out.println("Masukan Bahan baru : ");
                                i.setBahan(input.readLine());
                            }
                        }
                    }
}



public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    
    menu();
    }



} 

