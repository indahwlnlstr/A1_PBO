/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import pertemuan4.*;
/**
 *
 * @author ASUS
 */
final class Bahanbaju extends barang{

    static void add(Bahanbaju bahanbaju) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Object get(int t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final String kodeBarang;
    private String namaBarang;
    private String hargaBarang;
    private String bahan;
    

    public Bahanbaju(String kodeBarang, String namaBarang, int hargaBarang, String bahan) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        
        
    }

    @Override
    public String getKodeBarang() {
        return kodeBarang;
    }

    @Override
    public String getNamaBarang() {
        return namaBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public String getBahan() {
        return bahan;
    }

    @Override
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

   
    @Override
    protected void pesanan() {
        System.out.println("Barang Berhasil dipesan");
    }
    
}
