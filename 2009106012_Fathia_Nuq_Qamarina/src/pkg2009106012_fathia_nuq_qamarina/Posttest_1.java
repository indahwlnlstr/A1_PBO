/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009106012_fathia_nuq_qamarina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Posttest_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Obat> Obt = new ArrayList<Obat>();
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        int ph;
        System.out.println("====      >> Selamat Datang <<       ====");
        System.out.println("==== Program Manajeman Gudang Apotek ====");
        do{
            System.out.println("Pilihan Menu Gudang Obat :");
            System.out.println("==========================");
            System.out.println("1. Masukkan Data Obat");
            System.out.println("2. Lihat Data Obat");
            System.out.println("3. Hapus Data Obat");
            System.out.println("4. Edit Data Obat");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            ph = input.nextInt();
            
            switch(ph){
                case 1:
                    System.out.print("Masukkan Id Obat : ");
                    int id = input.nextInt();
                    System.out.print("Masukkan Nama Obat : ");
                    String Nama = input1.nextLine();
                    System.out.print("Masukkan Stock Obat : ");
                    int Stock = input.nextInt();
                    
                    Obt.add(new Obat(id,Nama,Stock));
                    System.out.println("Data Berhasil Disimpan..."); 
                    System.out.println(" ");
                break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("ID     |Nama         |Stock");
                    Iterator<Obat> i = Obt.iterator();
                    while(i.hasNext()){
                        Obat o = i.next();
                        System.out.println(o);   
                    }
                    System.out.println("=============================");
                    System.out.println(" ");
                break;
                case 3:
                    boolean found = false;
                    System.out.print("Masukkan Id Obat yang ingin dihapus : ");
                    id = input.nextInt();
                    System.out.println("========================");
                    i = Obt.iterator();
                    while(i.hasNext()){
                        Obat o = i.next();
                        if(o.getid() == id){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Data Tidak Ditemukan");
                    }else{
                        System.out.println("Data Berhasil Dihapus..."); 
                    }
                    System.out.println("========================");
                    System.out.println(" ");
                break;   
                case 4:
                    found = false;
                    System.out.print("Masukkan Id Obat yang ingin diedit : ");
                    id = input.nextInt();
                    System.out.println("========================");
                    ListIterator<Obat>li= Obt.listIterator();
                    while(li.hasNext()){
                        Obat o = li.next();
                        if(o.getid() == id){
                            System.out.print("Masukkan Nama Obat Baru :");
                            Nama = input1.nextLine();
                            
                            System.out.print("Masukkan Stock Obat Baru :");
                            Stock = input.nextInt();
                            li.set(new Obat (id, Nama, Stock));
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Data Tidak Ditemukan");
                    }else{
                        System.out.println("Data Berhasil Diupdate..."); 
                    }
                    System.out.println("========================");
                    System.out.println(" ");
                break;
                case 6: 
                    System.out.println("Anda Keluar dari Program...");
                    System.exit(0);
                break;
            }
        }while(ph!=0);
    }
    
}

class Obat{

    private int id;
    private String Nama;
    private int Stock;
    
    Obat(int id, String Nama, int Stock){
        this.id = id;
        this.Nama = Nama;
        this.Stock = Stock;
    }
    
    public int getid(){
        return id;
    }
    public String getNama(){
        return Nama;
    }
    public int getStock(){
        return Stock;
    }
     public String toString(){
        return id+"\t"+Nama+"\t"+Stock;
    }
}