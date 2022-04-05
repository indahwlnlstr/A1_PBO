/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009106026_sulhairah;

/**
 *
 * @author Windows10
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Posttest1 {
    static Scanner inputint = new Scanner(System.in);
    static Scanner inputstr = new Scanner (System.in);
    static ArrayList relawan = new ArrayList<>();
    static ArrayList devisi_relawan = new ArrayList<>();
    
    public static void main(String[]args){
        menuawal();
    }
    
    static void menuawal(){
        System.out.println("================");
        System.out.println("  PROGRAM PMII");
        System.out.println("[1] Tambah relawan");
        System.out.println("[2] Lihat data relawan");
        System.out.println("[3] Edit data relawan");
        System.out.println("[4] Hapus data relawan");
        System.out.println("[5] EXIT ");
        System.out.println("Masukkan Pilihan : ");
        String pilihan = inputstr.nextLine();
        if (pilihan.equals("1")){
            tambahRelawan();
            kemenuawal();
        }else if (pilihan.equals("2")){
            lihatRelawan();
            kemenuawal();
        }else if (pilihan.equals("3")){
            editRelawan();
            kemenuawal();
        }else if (pilihan.equals("4")){
            hapusRelawan();
            kemenuawal();
        }else if (pilihan.equals("5")){
            //exit()
        }else{
            System.out.println("Pilihan Anda tidak terdapat di sistem");
            kemenuawal();
        }
        
    }
    static void kemenuawal(){
        System.out.println("");
        System.out.println(" Tekan enter untuk kembali");
        inputstr.nextLine();
        menuawal();
    }
    static void tambahRelawan(){
        System.out.println("Jumlah Relawan yang akan di input : ");
        int jumlah_relawan = inputint.nextInt();
        for(int i = 0; i < jumlah_relawan; i++){
            System.out.println(" Masukkan nama relawan");
            String nama_relawan = inputstr.nextLine();
            relawan.add(nama_relawan);
            
            System.out.println("Masukkan Devisi Relawan");
            String devisi = inputstr.nextLine();
            devisi_relawan.add(devisi);
            
        }
    }
    static void lihatRelawan(){
        for (int j = 0; j <relawan.size();j++){
            System.out.println("Relawan ke-" + (j+1));
            System.out.println("Nama Relawan : " +relawan.get(j));
            System.out.println("Devisi Relawan : " + devisi_relawan.get(j));
            
        }
    }
    static void editRelawan(){
        lihatRelawan();
        System.out.print("Ubah relawan ke-");
        int edit = inputint.nextInt();
        System.out.print("Masukkan nama relawan : ");
        String edit_relawan = inputint.nextLine();
        
        System.out.print("Masukkan devisi : ");
        String edit_devisi = inputstr.nextLine();
        
        relawan.set((edit-1), edit_relawan);
        devisi_relawan.set((edit-1), edit_devisi);
    }
    static void hapusRelawan(){
        lihatRelawan();
        System.out.print("Hapus relawan ke-");
        int hapus = inputint.nextInt();
        System.out.println("Anda akan menghapus data : (y/t");
        String hapusrlwn = inputstr.nextLine();
        if (hapusrlwn == "y"){
            System.out.println("Data berhasil dihapus");
            relawan.remove(hapus-1);
            devisi_relawan.remove(hapus-1);
            
        }else{
            kemenuawal();
        }
            
               
    }
}

    
  
