package pkg2009106027_indah_wulan_lestarii.Posttest2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
        
public class posttest2 {
  public class barang{
        //atribut
        private String kodeBarang;
        private String namaBarang;
        private int hargaBarang;
        private String bahan;
        //konstruktor
        barang(String kodeBarang,String namaBarang, int hargaBarang, String bahan){
            this.kodeBarang = kodeBarang;
            this.namaBarang = namaBarang;
            this.hargaBarang = hargaBarang;
            this.bahan = bahan;
        }
        
        public String getkodeBarang(){
            return kodeBarang;
        }
        
        void print(){
            System.out.println("Kode Barang : " + this.kodeBarang);
            System.out.println("Nama Barang : " + this.namaBarang);
            System.out.println("Harga Barang: " + this.hargaBarang);
            System.out.println("Bahan       : " + this.bahan);
            
        }
        public class DataBarang {
        ArrayList<barang> dataBarang = new ArrayList<barang>();
        
        void tambahBarang(barang data){
            this.dataBarang.add(data);
            
        }
        
        void hapusBarang(String kode){
            this.dataBarang.removeIf(item -> item.kodeBarang == kode);
        }
        
        void cariBarang(String kode){
            boolean ketemu = false;
            int index = -1;
            
            for(int i=0; i<this.dataBarang.size(); i++){
                if (this.dataBarang.get(i).kodeBarang == kode){
                index = i;
                ketemu = true;
            }
        }
            if (ketemu == true){
                this.dataBarang.get(index).print();
            }else{
                System.out.println("Data Barang Tidak Ditemukan");
                
            }
        }
       
        void lihatBarang(){
            System.out.println("************************");
            for(barang item: this.dataBarang){
                item.print();
            }
        }
        }
  }
    public static void main(String[] args) {
        ArrayList<barang> dataBarang = new ArrayList<barang>(); 
        Scanner input = new Scanner(System.in);
        DataBarang a =  new DataBarang();
        int pilih;
        do{
            System.out.println("**** MENU DATA BARANG BABY CARE AND BABY SUPPLIES ****");
            System.out.println("1. Tambah Data Barang");
            System.out.println("2. Lihat Data Barang");
            System.out.println("3. Edit Data Barang");
            System.out.println("4. Hapus Data Barang");
            System.out.println("5. Exit");
        
            System.out.print("Masukan Pilihan Anda : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    a.tambahBarang();
                    break;
                case 2:
                    a.hapusBarang();
                    break;
                case 3:
                    break;
                case 4:
                    a.hapusBarang();
                    break;
                case 5:
                    System.out.println("Anda Keluar dari Program...");
                    System.exit(0);
            }
        
