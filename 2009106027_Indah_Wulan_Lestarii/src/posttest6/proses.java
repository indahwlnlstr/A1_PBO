/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public class proses implements pemesanan{

    @Override
    public void pesanan() {
        System.out.println("Barang dalam proses");
    }

    @Override
    public void pembatalan() {
        System.out.println("Pesanan di Batalkan");
    }
    
}
