package PraktikumOpang;
import java.util.Scanner;
import java.util.ArrayList;

public class PraktikumOpang {
    
    public static void main(String[] args) {
        ArrayList<String> nama_instansi = new ArrayList<>();
        ArrayList<Long> anggaran_masuk = new ArrayList<>();
        ArrayList<Long> anggaran_keluar = new ArrayList<>();
        ArrayList<Long> anggaran_perbulan = new ArrayList<>();
        ArrayList<Long> anggaran_pertahun = new ArrayList<>();

        Scanner input_int = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("===== Menu Keuangan Daerah =====");
            System.out.println("1. Tambah Instansi");
            System.out.println("2. Lihat Instansi");
            System.out.println("3. Edit Instansi");
            System.out.println("4. Hapus Instansi");
            System.out.println("5. Keluar");
            System.out.print("Input Menu : ");
            menu = input_int.nextInt();
            if(menu == 1) {
                System.out.println("===== Tambah Instansi =====");
                System.out.print("1. Nama Instansi     : ");
                nama_instansi.add(input_str.nextLine());                
                System.out.print("2. Anggaran Masuk    : ");
                anggaran_masuk.add(input_int.nextLong());
                System.out.print("3. Anggaran Keluar   : ");
                anggaran_keluar.add(input_int.nextLong());
                System.out.print("4. Anggaran Perbulan : ");
                anggaran_perbulan.add(input_int.nextLong());
                System.out.print("5. Anggaran Pertahun : ");
                anggaran_pertahun.add(input_int.nextLong());
                System.out.println("Instansi telah ditambahkan!");
            } else if(menu == 2) {
                System.out.println("===== Lihat Instansi =====");
                if(nama_instansi.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama_instansi.size(); i++) {
                        System.out.println("===============================================");
                        System.out.println("Nomor Instansi    : " + (i+1));
                        System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                        System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                        System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                        System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                        System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                        System.out.println("===============================================");                    
                    }                    
                }
            } else if(menu == 3) {                
                System.out.println("===== Edit Instansi =====");
                if(nama_instansi.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama_instansi.size(); i++) {
                        System.out.println("===============================================");
                        System.out.println("Nomor Instansi    : " + (i+1));
                        System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                        System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                        System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                        System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                        System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                        System.out.println("===============================================");                    
                    }                    
                    System.out.print("Masukkan Nomor Instansi yang ingin diubah: ");
                    int no = input_int.nextInt();
                    System.out.print("1. Nama Instansi     : ");
                    nama_instansi.set(no-1, input_str.nextLine());                
                    System.out.print("2. Anggaran Masuk    : ");
                    anggaran_masuk.set(no-1, input_int.nextLong());
                    System.out.print("3. Anggaran Keluar   : ");
                    anggaran_keluar.set(no-1, input_int.nextLong());
                    System.out.print("4. Anggaran Perbulan : ");
                    anggaran_perbulan.set(no-1, input_int.nextLong());
                    System.out.print("5. Anggaran Pertahun : ");
                    anggaran_pertahun.set(no-1, input_int.nextLong());
                    System.out.println("Instansi telah diperbaharui!");
                }
            } else if(menu == 4) {                
                System.out.println("===== Hapus Instansi =====");
                if(nama_instansi.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama_instansi.size(); i++) {
                        System.out.println("===============================================");
                        System.out.println("Nomor Instansi    : " + (i+1));
                        System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                        System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                        System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                        System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                        System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                        System.out.println("===============================================");                    
                    }                    
                    System.out.print("Masukkan Nomor Instansi yang ingin dihapus: ");
                    int no = input_int.nextInt();
                    nama_instansi.remove(no-1);                
                    anggaran_masuk.remove(no-1);
                    anggaran_keluar.remove(no-1);
                    anggaran_perbulan.remove(no-1);
                    anggaran_pertahun.remove(no-1);
                    System.out.println("Instansi telah dihapus!");
                }
            } else if(menu == 5) {                
                System.out.println("Terima Kasih!");
            } else {                
                System.out.println("Menu Salah!");
            }
        } while(menu != 5);
    }
}