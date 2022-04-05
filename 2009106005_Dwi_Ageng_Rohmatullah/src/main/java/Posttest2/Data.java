/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

/**
 *
 * @author Sezzan
 */

public class Data {
    
    private int id;
    private String jenisikan;
    private String warnaikan;
    private int jumlah;
    private int harga;
    
    public Data(int id, String jenisikan, String warnaikan, int jumlah, int harga){
        this.id = id;
        this.jenisikan = jenisikan;
        this.warnaikan = warnaikan;
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

    public String getWarnaikan(){
        return warnaikan;
    }
    public void setWarnaikan(String warnaikan){
        this.warnaikan = warnaikan;
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

    public void InfojumharTunggal(){
        System.out.println(" Informasi ");
        System.out.println(" Jumlah : " + jumlah );
        System.out.println(" harga : " + harga );
    }

    public void IkanTerjual(){
        System.out.print(jenisikan + ", ");
    }
}
