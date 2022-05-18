/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
/**
 *
 * @author ASUS
 */
public class Kasir {
    private pemesanan kasir;
    
    public Kasir(pemesanan kasir){
        this.kasir = kasir;
    }
    
    void pesankan(){
        this.kasir.pesanan();
    }
    void batalkan(){
        this.kasir.pembatalan();
    }
}
