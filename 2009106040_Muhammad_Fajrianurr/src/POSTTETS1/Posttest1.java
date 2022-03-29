package POSTTETS1;

import java.util.Scanner;
import java.util.ArrayList;
        
public class Posttest1 {
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    static ArrayList Nama = new ArrayList<>();
    static ArrayList Nomer_telp = new ArrayList<>();
    static ArrayList Jenis_Foto = new ArrayList<>();
    static ArrayList Harga = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("\t====== Studio Foto ======");
        System.out.println("\t [1] create Pesanan   ");
        System.out.println("\t [2] read pesanan   ");
        System.out.println("\t [3] update pesanan    ");
        System.out.println("\t [4] delete Pesanan   ");
        System.out.println("\t [0] Keluar            ");
        System.out.println("\t---------------------------");
        System.out.print("\tPilih Menu = ");
        String menu = input_str.nextLine();
        if (menu.equals("1")){
            create_Pesanan();    
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("2")){
            read_Pesanan();
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("3")){
            update_Pesanan();
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("4")){
            delete_Pesanan();
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("0")){
            
        }
        else{
            System.out.println("Masukan Sesuai Pilihan!");
        }
    }
    
    static void create_Pesanan(){
        System.out.println("<<============== Studio Foto ===========>>");
        System.out.println("<< Berapa Pesanan yang ingin anda Buat >>");
        System.out.print("    -> ");
        int bnyk = input_int.nextInt();
        
        for (int x = 0;x< bnyk;x++){
            System.out.println("\n    Masukan Nama ");
            System.out.print("    -> ");
            String nama = input_str.nextLine();
            
            
            System.out.println("    Masukan No Telpon ");
            System.out.print("    -> ");
            String tlpn = input_str.nextLine();
            
            System.out.println("    Masukan Jenis Foto ");
            System.out.print("    -> ");
            String jenis = input_str.nextLine();
            
            System.out.println("    Masukan Harga Foto ");
            System.out.print("    -> ");
            String harga= input_str.nextLine();
            
            Nama.add(nama);
            Nomer_telp.add(tlpn);
            Jenis_Foto.add(jenis);
            Harga.add(harga);
        }
    }
    static void read_Pesanan(){
        System.out.println("<<============== Studio Foto ===========>>");
        System.out.println("<<              Pesanan Anda           >>");
        for (int z = 0 ; z < Nama.size();z++){
            System.out.println("   Nomer Pesanan "+ (z+1));
            System.out.println("   Nama          = "+ Nama.get(z));
            System.out.println("   Nomer telpon  = "+ Nomer_telp.get(z));
            System.out.println("   Jenis Foto    = "+ Jenis_Foto.get(z));
            System.out.println("   Harga         = "+ Harga.get(z));
            System.out.println("\n");
        }
    }
    static void update_Pesanan(){
        System.out.println("<<============== Studio Foto ===========>>");
        System.out.println("<<           Update Pesanan Anda       >>");
        read_Pesanan();
        System.out.println("    Pesanan yang ingin di updete    ");
        System.out.print("    -> ");
        int indx_update = input_int.nextInt();
        System.out.println("\n    Masukan Nama      ");
        System.out.print("    -> ");
        String nama_update = input_str.nextLine();

        System.out.println("    Masukan nomer telpon ");
        System.out.print("    -> ");
        String tlpn_update = input_str.nextLine();

        System.out.println("    Masukan Jenis Foto ");
        System.out.print("    -> ");
        String jenis_update = input_str.nextLine();

        System.out.println("    Masukan harga ");
        System.out.print("    -> ");
        String harga_update = input_str.nextLine();
        
        Nama.set((indx_update-1), nama_update);
        Nomer_telp.set((indx_update-1), tlpn_update);
        Jenis_Foto.set((indx_update-1), jenis_update);
        Harga.set((indx_update-1), harga_update);
        
    }
    static void delete_Pesanan(){
        System.out.println("<<============== Studio Foto ===========>>");
        System.out.println("<<            Hapus Pesanan Anda       >>");
        read_Pesanan();
        
        System.out.println("    Nomor Pesanan yang ingin dihapus    ");
        System.out.print("    -> ");
        int indx_hapus = input_int.nextInt();
        Nama.remove(indx_hapus-1);
        Nomer_telp.remove(indx_hapus-1);
        Jenis_Foto.remove(indx_hapus-1);
        Harga.remove(indx_hapus-1);
    }
}
