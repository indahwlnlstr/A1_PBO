package POSTTEST1;

import java.util.Scanner;
import java.util.ArrayList;

public class main{
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    static ArrayList kegiatan = new ArrayList<>();
    static ArrayList jam_kegiatan = new ArrayList<>();
    static ArrayList durasi_kegiatan = new ArrayList<>();
    static ArrayList keterangan_kegiatan = new ArrayList<>();
    
    
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("\t\t++====== TODO LIST ======++");
        System.out.println("\t\t++ [1] Lihat Todo List   ++");
        System.out.println("\t\t++ [2] Tambah Todo List  ++ ");
        System.out.println("\t\t++ [3] Edit Todo List    ++");
        System.out.println("\t\t++ [4] Hapus Todo List   ++");
        System.out.println("\t\t++ [0] Keluar            ++");
        System.out.println("\t\t---------------------------");
        System.out.print("\t\tPilih Menu = ");
        String menu = input_str.nextLine();
        if (menu.equals("1")){
            lihat_todolist();    
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("2")){
            buat_todolist();
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("3")){
            update_todolist();
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
        else if(menu.equals("4")){
            hapus_todolist();
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
    
    static void buat_todolist(){
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++ Berapa Jadwal yang ingin anda Buat ++");
        System.out.print("    >> ");
        int bnyk = input_int.nextInt();
        
        for (int x = 0;x< bnyk;x++){
            System.out.println("\n    Masukan Nama Kegiatan ");
            System.out.print("    >> ");
            String keg = input_str.nextLine();
            
            
            System.out.println("    Masukan jam kegiatan ");
            System.out.print("    >> ");
            String jam = input_str.nextLine();
            
            System.out.println("    Masukan durasi kegiatan ");
            System.out.print("    >> ");
            String durasi = input_str.nextLine();
            
            System.out.println("    Masukan keterangan kegiatan ");
            System.out.print("    >> ");
            String keterangan = input_str.nextLine();
            
            kegiatan.add(keg);
            jam_kegiatan.add(jam);
            durasi_kegiatan.add(durasi);
            keterangan_kegiatan.add(keterangan);
        }
    }
    
    static void lihat_todolist(){
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++              Jadwal Anda           ++");
        for (int z = 0 ; z < kegiatan.size();z++){
            System.out.println("   Kegiatan "+ (z+1));
            System.out.println("   Nama Kegiatan       = "+ kegiatan.get(z));
            System.out.println("   Jam Kegiatan        = "+ jam_kegiatan.get(z));
            System.out.println("   Durasi Kegiatan     = "+ durasi_kegiatan.get(z));
            System.out.println("   Keterangan Kegiatan = "+ keterangan_kegiatan.get(z));
            System.out.println("\n");
        }
    }
    
    static void update_todolist(){
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++           Update Jadwal Anda       ++");
        lihat_todolist();
        System.out.println("    Nomor Kegiatan ");
        System.out.print("    >> ");
        int indx_update = input_int.nextInt();
        System.out.println("\n    Masukan Nama Kegiatan ");
        System.out.print("    >> ");
        String keg_update = input_str.nextLine();

        System.out.println("    Masukan jam kegiatan ");
        System.out.print("    >> ");
        String jam_update = input_str.nextLine();

        System.out.println("    Masukan durasi kegiatan ");
        System.out.print("    >> ");
        String durasi_update = input_str.nextLine();

        System.out.println("    Masukan keterangan kegiatan ");
        System.out.print("    >> ");
        String keterangan_update = input_str.nextLine();
        
        kegiatan.set((indx_update-1), keg_update);
        jam_kegiatan.set((indx_update-1), jam_update);
        durasi_kegiatan.set((indx_update-1), durasi_update);
        keterangan_kegiatan.set((indx_update-1), keterangan_update);
        
    }
    
    static void hapus_todolist(){
        System.out.println("++============== TODO LIST ===========++");
        System.out.println("++            Hapus Jadwal Anda       ++");
        lihat_todolist();
        
        System.out.println("    Nomor Kegiatan ");
        System.out.print("    >> ");
        int indx_hapus = input_int.nextInt();
        
        System.out.println("\n++    Data yang ingin di Hapus       ++");
        System.out.println("    Nama Kegiatan       = "+ kegiatan.get(indx_hapus-1));
        System.out.println("    Jam Kegiatan        = "+ jam_kegiatan.get(indx_hapus-1));
        System.out.println("    Durasi Kegiatan     = "+ durasi_kegiatan.get(indx_hapus-1));
        System.out.println("    Keterangan Kegiatan = "+ keterangan_kegiatan.get(indx_hapus-1));
        
        System.out.println("\n   Yakin ingin menghapus Data ");
        System.out.print("   (y/n)  >> ");
        String pil = input_str.nextLine();
        if(pil.equals("y")){
            kegiatan.remove(indx_hapus-1);
            jam_kegiatan.remove(indx_hapus-1);
            durasi_kegiatan.remove(indx_hapus-1);
            keterangan_kegiatan.remove(indx_hapus-1);
        }
        else if(pil.endsWith("Y")){
            kegiatan.remove(indx_hapus-1);
            jam_kegiatan.remove(indx_hapus-1);
            durasi_kegiatan.remove(indx_hapus-1);
            keterangan_kegiatan.remove(indx_hapus-1);
        }
        else{
            System.out.println("Tekan Enter Untuk Kembali");
            input_str.nextLine();
            menu();
        }
    }
    

    
    
}
