/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author ASUS
 */
public class gendongan extends Barang {
    String warna;

    public gendongan(String kodeBarang, String namaBarang, int hargaBarang, String Bahan, String warna) {
        super(kodeBarang, namaBarang, hargaBarang, Bahan);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void tampilan() {
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga       : " + this.hargaBarang);
        System.out.println("Bahan       : " + this.Bahan);
        System.out.println("Warna       : " + this.warna);
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

    public void setjumlah(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setHarga(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
