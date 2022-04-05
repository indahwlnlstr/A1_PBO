
package pkg2009106027_indah_wulan_lestarii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class posttest1 {

    public static void main(String[] args) {
        Collection<data> Dta = new ArrayList<data>();
        Scanner input = new Scanner(System.in);
        Scanner masuk= new Scanner(System.in);
        int pilih;
        
        System.out.println("**** Data Pasien Pendaftaran Online Klinik ****");
        do{
            System.out.println("1. Masukan Data Pasien");
            System.out.println("2. Lihat Data Pasien");
            System.out.println("3. Edit Data Pasien");
            System.out.println("4. Hapus Data Pasien");
            System.out.println("0. Exit");
        
        System.out.print("Masukan Pilihan Anda : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.print("NIK     : ");
                int nik = input.nextInt();
                System.out.print("Nama    : ");
                String nama = masuk.nextLine();
                System.out.print("Alamat  : ");
                String alamat = masuk.nextLine();
                System.out.print("No Hp   : ");
                int nohp = input.nextInt();
                System.out.print("Umur    : ");
                int umur = input.nextInt();
                System.out.print("Keluhan : ");
                String keluhan = masuk.nextLine();
                
                Dta.add(new data(nik,nama,alamat,nohp,umur,keluhan));
                System.out.println("\nData Anda Berhasil disimpan\n\n");
                break;
            case 2:
                System.out.println("*********************************************************************");
                System.out.println("| NIK\t\t| Nama\t\t| Alamat\t\t| No Hp     | Umur      | Keluhan");
                System.out.println("*********************************************************************");
                Iterator<data> i = Dta.iterator();
                while(i.hasNext()){
                    data dta = i.next();
                    System.out.println(dta);
                 }
                break;
            case 3:
                break;
            case 4:
                break;
            
            }
        }while(pilih!=0);
    } 
    }   
    class data{
        private int nik;
        private String nama;
        private String alamat;
        private int umur;
        private int nohp;
        private String keluhan;
        
        data(int NIK,String Nama,String Alamat, int nohp,int umur, String Keluhan){
            this.nik = NIK;
            this.nama = Nama;
            this.alamat = Alamat;
            this.nohp = nohp;
            this.umur = umur;
            this.keluhan = Keluhan;
        }
        
        public int getnik(){
            return nik;
        }
        public String getNama(){
            return nama;
        }
        public String getAlamat(){
            return alamat;
        }
        public int getNohp(){
            return nohp;
        }
        public int getumur(){
            return umur;
        }
        public String getkeluhan(){
            return keluhan;
        }
        public String toString(){
           return nik+"\t\t"+nama+"\t\t"+alamat+"\t"+nohp+"\t"+umur+"\t"+keluhan+"\t"; 
        
        }
    }
            
    
    
        
        
