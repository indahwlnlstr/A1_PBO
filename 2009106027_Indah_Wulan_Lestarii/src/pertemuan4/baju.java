/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;


public class baju extends Barang{
   String ukuran; 

    public baju(String kodeBarang, String namaBarang, int hargaBarang, String Bahan, String ukuran) {
        super(kodeBarang, namaBarang, hargaBarang, Bahan);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilan() {
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga       : " + this.hargaBarang);
        System.out.println("Bahan       : " + this.Bahan);
        System.out.println("Ukuran      : " + this.ukuran);
    }
   
    public void gudang(){
        System.out.println("Barang Terletak di Gudang besar");
    }
    public void gudang(String besar){
        System.out.println("Barang Terletak di Gudang " + besar);
    }

    public Object getnamaBarang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setnamaBarang(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void sethargaBarang(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setkodeBarang(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
