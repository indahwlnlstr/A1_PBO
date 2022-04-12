package pertemuan3;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Main {

static ArrayList<Barang> barang = new ArrayList<Barang>();
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
    
    public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("********************************");
            System.out.println("*         MENU BARANG          *");
            System.out.println("********************************");
            System.out.println("* 1. Tambah Data                *");
            System.out.println("* 2. Lihat Data                *"); 
            System.out.println("* 3. Edit Data                 *");
            System.out.println("* 4. Hapus Data                *");
            System.out.println("* 5. EXIT                      *");
            System.out.println("********************************");
            
            System.out.print("Masukkan Pilihan Anda : ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    inputdata();
                    break;
            case 2:
                    lihatdata();
                    break;
            case 3:
                    ubahdata();
                    break;
            case 4:
                    hapusdata();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }
public static void inputdata() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
          
    System.out.println("***************************");
    System.out.println("*    Input DATA BARANG    *");
    System.out.println("***************************");
    
    String kodeBarang;
    String namaBarang;
    int hargaBarang;
    String Bahan;
    
    System.out.print("Kode Barang  : ");
    kodeBarang = input.readLine();
    System.out.print("Nama Barang  : ");
    namaBarang = input.readLine();
    System.out.print("Harga Barang : ");
    hargaBarang = Integer.parseInt(input.readLine());
    System.out.print("Bahan Barang : ");
    Bahan = input.readLine();
    
    if("".equals(kodeBarang) || "".equals(namaBarang) || "".equals(hargaBarang) ||"".equals(Bahan)){
        System.out.println("DATA YANG ANDA MASUKKAN SALAH");
        return;
    }
        Barang Abaru = new Barang (kodeBarang, namaBarang, hargaBarang, Bahan);
        Abaru.kodeBarang = kodeBarang;
        Abaru.namaBarang = namaBarang;
        Abaru.hargaBarang = hargaBarang;
        Abaru.Bahan = Bahan;
        barang.add(Abaru);
        Abaru.inputdata();
}           

   public static void lihatdata()throws IOException{
            for(int i = 0 ; i < barang.size();i++){
                System.out.println(i+1);
                System.out.println("kode Barang    : " + barang.get(i).kodeBarang);
                System.out.println("Nama Barang    : " + barang.get(i).namaBarang);
                System.out.println("Harga Barang   : " + barang.get(i).hargaBarang);
                System.out.println("Bahan Barang   : " + barang.get(i).Bahan);
            }
}

public static void ubahdata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    lihatdata();
    System.out.println("***************************");
    System.out.println("*     UBAH DATA BARANG    *");
    System.out.println("***************************");
    String kode;
    String nama;
    int harga;
    String bahan;
    int index;
    
    System.out.println("Masukkan nomor yang ingin di ubah");
    index = Integer.parseInt(input.readLine());
    index--;
    
    System.out.print("Kode Barang  : ");
    kode = input.readLine();
    
    System.out.print("Nama Barang  : ");
    nama = input.readLine();
    
    System.out.print("Harga Barang : ");
    harga = Integer.parseInt(input.readLine());
    
    System.out.print("Bahan Barang : ");
    bahan = input.readLine();
    
    barang.get(index).kodeBarang = kode;
    barang.get(index).namaBarang = nama;
    barang.get(index).hargaBarang = harga;
    barang.get(index).Bahan = bahan;
}

public static void hapusdata() throws IOException{
    lihatdata();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int t;
    System.out.println("input Slot index = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    barang.get(t).hapusdata();
    barang.remove(t);
    }

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    
    menu();
    }



} 