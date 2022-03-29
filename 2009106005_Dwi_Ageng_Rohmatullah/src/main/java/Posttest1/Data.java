/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

/**
 *
 * @author Sezzan
 */

public class Data {
    
    private int id;
    private String jenisikan;
    private int jumlah;
    private int harga;
    
    public Data(int id, String jenisikan, int jumlah, int harga){
        this.id = id;
        this.jenisikan = jenisikan;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getJenisikan(){
        return jenisikan;
    }
    public void setJenisikan(String jenisikan){
        this.jenisikan = jenisikan;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
}
