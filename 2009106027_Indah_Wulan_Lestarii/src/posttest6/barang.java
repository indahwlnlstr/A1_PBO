/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import pertemuan4.*;
import pertemuan3.*;
import pertemuan2.*;
/**
 *
 * @author ASUS
 */
public abstract class barang {
    protected String kodeBarang;
    protected String namaBarang;
    
    public barang(String kodeBarang, String namaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }
    
    protected abstract void pesanan();

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    void tampilan(){
      System.out.println("Kode Barang           : " + this.kodeBarang);
      System.out.println("Nama Barang           : " + this.namaBarang);
      pesanan();
    }
    
    void inputdata(){
        System.out.println("Data Berhasil Ditambah");
    }
    void ubahdata(){
        System.out.println("Data Berhasil Diubah");
    }
    void hapusdata(){
        System.out.println("Data Berhasil Dihapus");
    }    
}
    
