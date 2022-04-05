
import java.util.*;
import java.io.*;

class Pendidikan{
    int NSPSN;
    String NamaSatuanPendidikan;
    String alamat;
    String Kelurahan;
    String Status;

    void print(int i){
        System.out.printf("|%-6d | %-15d   | %-38s  | %-42s      | %-18s   | %-6s    |\n",i+1,NSPSN,NamaSatuanPendidikan,alamat,Kelurahan,Status);
    }

    void ubah(int NSPSN,String NamaSatuanPendidikan,String alamat,String Kelurahan,String Status){
        this.NSPSN=NSPSN;
        this.NamaSatuanPendidikan=NamaSatuanPendidikan;
        this.alamat=alamat;
        this.Kelurahan=Kelurahan;
        this.Status=Status;
    }
}

class Kesehatan{
    String NamaFasilitasKesehatan;
    String TipeFaskes;
    String Alamat;
    String Kecamatan;

    void print(int i){
        System.out.printf("|%-6d | %-26s         | %-32s  | %-42s      | %-18s   |\n",i+1,NamaFasilitasKesehatan,TipeFaskes,Alamat,Kecamatan);
    }

    void Ubah(String NamaFasilitasKesehatan,String TipeFaskes,String Alamat,String Kecamatan){
        this.NamaFasilitasKesehatan = NamaFasilitasKesehatan;
        this.TipeFaskes=TipeFaskes;
        this.Alamat = Alamat;
        this.Kecamatan = Kecamatan;
    }
}

class Akomodasi{
    String NamaAkomodasi;
    String Harga;
    String Alamat;
    String notelp;

    void print(int i){
        System.out.printf("|%-6d | %-31s         | %-32s  | %-42s      | %-18s   |\n",i+1,NamaAkomodasi,Harga,Alamat,notelp);
    }

    void Ubah(String NamaAkomodasi,String Harga,String Alamat,String Notelp){
        this.NamaAkomodasi =NamaAkomodasi;
        this.Harga = Harga;
        this.Alamat = Alamat;
        this.notelp = Notelp;
    }
}

public class JavaApplication6 {
    static ArrayList<Pendidikan> pendidikan = new ArrayList<Pendidikan>();
    static ArrayList<Kesehatan> kesehatan = new ArrayList<Kesehatan>();
    static ArrayList<Akomodasi> akomodasi = new ArrayList<Akomodasi>();
    public static void main(String[] args) {
         readData();
        admin();
    }
    
    static void cls() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
     static void backToMenu() {
        System.out.println("");
        System.out.print("\t   <         Tekan Enter untuk Kembali          >");
        Scanner Inp = new Scanner(System.in);Inp.nextLine();
        cls();
    }


    static void admin() {
        do{
        System.out.println("\t===============================================");
        System.out.println("\t                   MENU ADMIN                  ");
        System.out.println("\t===============================================");
        System.out.println("\t|      1. Lihat Sarana Kota Samarinda         |");
        System.out.println("\t|      2. Tambah Fasilitas                    |");
        System.out.println("\t|      3. Hapus Fasilitas                     |");
        System.out.println("\t|      4. Ubah Fasilitas                      |");
        System.out.println("\t|      0. Keluar                              |");
        System.out.print("\t Pilih => ");
        Scanner Inp = new Scanner(System.in);String str = Inp.nextLine();
        
        if(str.equals("1")){
            LihatSarana();        
        }
        else if(str.equals("2")){
            TambahSarana();
        }
        else if(str.equals("3")){
            HapusSarana();
        }
        else if(str.equals("4")){
            UbahSarana();
        }
        else if(str.equals("0")){
            System.out.println("");
            System.out.print("\t  <         Program Akan Menutup..          >");
            System.exit(0);
        }
        }
        while (true);
    }
    
    static void LihatSarana(){
        cls();
            System.out.println("\t===============================================");
            System.out.println("\t                 PILIH SARANA                  ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String PilihSarana = scan.nextLine();
            if(PilihSarana.equals("1")){
                cls();
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+");
                for(int i=0;i<pendidikan.size();i++){
                    pendidikan.get(i).print(i);
                }
                backToMenu();
                }
            else if(PilihSarana.equals("2")){
                cls();
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |      NamaFasilitasKesehatan        |             TipeFaskes            |                      Alamat                     |       Kelurahan      |");
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    kesehatan.get(i).print(i);
                }
                backToMenu();

            }

            else if(PilihSarana.equals("3")){
                cls();
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                for(int i=0;i<akomodasi.size();i++){
                    akomodasi.get(i).print(i);
                }
                backToMenu();
            }
    }
    
    static void TambahSarana() {
        cls();
            System.out.println("\t===============================================");
            System.out.println("\t                 PILIH SARANA                  ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String PilihSarana = scan.nextLine();
            if(PilihSarana.equals("1")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");
                System.out.print("\t| Masukkan NSPSN                   : ");
                Scanner Inp1 = new Scanner(System.in);int NewNSPN = Inp1.nextInt();
                System.out.print("\t| Masukkan Nama Satuan Pendidikan  : ");
                Scanner Inp2 = new Scanner(System.in);String NewPendidikan = Inp2.nextLine();
                System.out.print("\t| Masukkan Alamat                  : ");
                Scanner Inp3 = new Scanner(System.in);String NewAlamat = Inp3.nextLine();
                System.out.print("\t| Masukkan Kelurahan               : ");
                Scanner Inp4 = new Scanner(System.in);String NewKelurahan = Inp4.nextLine();
                System.out.print("\t| Masukkan Status                  : ");
                Scanner Inp5 = new Scanner(System.in);String NewStatus = Inp5.nextLine();


                Pendidikan newPendidikan = new Pendidikan();
                newPendidikan.NSPSN = NewNSPN;
                newPendidikan.NamaSatuanPendidikan = NewPendidikan;
                newPendidikan.alamat = NewAlamat;
                newPendidikan.Kelurahan = NewKelurahan;
                newPendidikan.Status = NewStatus;
                pendidikan.add(newPendidikan);
                backToMenu();
            }

            else if (PilihSarana.equals("2")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");
                System.out.print("\t| Masukkan Nama Fasilitas Kesehatan       :");
                Scanner Inp2 = new Scanner(System.in);String NewNamaKesehatan = Inp2.nextLine();
                System.out.print("\t| Masukkan Tipe Fasilitas Kesehatan       :");
                Scanner Inp3 = new Scanner(System.in);String NewTipeKesehatan = Inp3.nextLine();
                System.out.print("\t| Masukkan Alamat Fasilitas Kesehatan     :");
                Scanner Inp4 = new Scanner(System.in);String NewAlamatKesehatan = Inp4.nextLine();
                System.out.print("\t| Masukkan Kecamatan Fasilitas Kesehatan  :");
                Scanner Inp5 = new Scanner(System.in);String NewKecamatanKesehatan = Inp5.nextLine();

                Kesehatan newKesehatan = new Kesehatan();
                newKesehatan.NamaFasilitasKesehatan = NewNamaKesehatan;
                newKesehatan.TipeFaskes = NewTipeKesehatan;
                newKesehatan.Alamat = NewAlamatKesehatan;
                newKesehatan.Kecamatan = NewKecamatanKesehatan;
                kesehatan.add(newKesehatan);
                backToMenu();

            }


            if(PilihSarana.equals("3")){
                System.out.println("\t===============================================");
                System.out.println("\t                 TAMBAH SARANA                 ");
                System.out.println("\t===============================================");

                System.out.print("\t| Masukkan Nama Akomodasi       : ");
                Scanner Inp2 = new Scanner(System.in);String NewAkomodasi = Inp2.nextLine();
                System.out.print("\t| Masukkan Harga Rataan         : ");
                Scanner Inp3 = new Scanner(System.in);String NewHarga = Inp3.nextLine();
                System.out.print("\t| Masukkan Alamat Akomodasi     : ");
                Scanner Inp4 = new Scanner(System.in);String NewAlamatAkomodasi = Inp4.nextLine();
                System.out.print("\t| Masukkan No Telepon Akomodasi : ");
                Scanner Inp5 = new Scanner(System.in);String NewNotelp = Inp5.nextLine();

                Akomodasi newAkomodasi = new Akomodasi();
                newAkomodasi.NamaAkomodasi = NewAkomodasi;
                newAkomodasi.Harga = NewHarga;
                newAkomodasi.Alamat = NewAlamatAkomodasi;
                newAkomodasi.notelp = NewNotelp;
                akomodasi.add(newAkomodasi);
                backToMenu();
            }
            }
    
    
    
        static void HapusSarana(){
            cls();
            System.out.println("\t===============================================");
            System.out.println("\t               PILIH SARANA                    ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String HapusSarana = scan.nextLine();
            if (HapusSarana.equals("1")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+");
                for(int i=0;i<pendidikan.size();i++){
                    pendidikan.get(i).print(i);
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int NewNSPN = Inp1.nextInt();
                pendidikan.remove(NewNSPN-1);

                backToMenu();
            }

            else if (HapusSarana.equals("2")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |      NamaFasilitasKesehatan        |             TipeFaskes            |                      Alamat                     |       Kelurahan      |");
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    kesehatan.get(i).print(i);
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int hapuskesehatan = Inp1.nextInt();
                kesehatan.remove(hapuskesehatan-1);
                
                backToMenu();
            }
            else if(HapusSarana.equals("3")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 HAPUS SARANA                 ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
            
                for(int i=0;i<akomodasi.size();i++){
                    akomodasi.get(i).print(i);
                }
                System.out.print("| Masukkan Nomor Yang Ingin Dihapus  :");
                Scanner Inp1 = new Scanner(System.in);int hapusakomodasi = Inp1.nextInt();
                akomodasi.remove(hapusakomodasi-1);

                backToMenu();
            }
        }
        
      static void UbahSarana() {
            cls();
            System.out.println("\t===============================================");
            System.out.println("\t               PILIH SARANA                    ");
            System.out.println("\t===============================================");
            System.out.println("\t|             1. Pendidikan                   |");
            System.out.println("\t|             2. Kesehatan                    |");
            System.out.println("\t|             3. Akomodasi                    |");
            System.out.print("\t Pilih => ");
            Scanner scan = new Scanner(System.in);String UbahSarana = scan.nextLine();
            if (UbahSarana.equals("1")){
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------------------+----------------------+-----------+");
                System.out.println("|   No  |      NSPSN        |         NamaSatuanPendidikan            |                      Alamat                     |       Kelurahan      |   Status  |");
                System.out.println("+-------+-------------------+-----------------------------------------+-------------------------------------+-----------+----------------------+-----------+");
                for(int i=0;i<pendidikan.size();i++){
                    pendidikan.get(i).print(i);
                }
                System.out.print("| Masukkan Nomor Yang Ingin Diperbaharui  :");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan NSPSN                   :");
                Scanner Inp1 = new Scanner(System.in);int NewNSPN = Inp1.nextInt();
                System.out.print("| Masukkan Nama Satuan Pendidikan  :");
                Scanner Inp2 = new Scanner(System.in);String NewPendidikan = Inp2.nextLine();
                System.out.print("| Masukkan Alamat                  :");
                Scanner Inp3 = new Scanner(System.in);String NewAlamat = Inp3.nextLine();
                System.out.print("| Masukkan Kelurahan               :");
                Scanner Inp4 = new Scanner(System.in);String NewKelurahan = Inp4.nextLine();
                System.out.print("| Masukkan Status                  :");
                Scanner Inp5 = new Scanner(System.in);String NewStatus = Inp5.nextLine();

                pendidikan.get(Update-1).ubah(NewNSPN,NewPendidikan,NewAlamat,NewKelurahan,NewStatus);
                backToMenu();}
            else if(UbahSarana.equals("2")){
                cls();
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |      NamaFasilitasKesehatan        |             TipeFaskes            |                      Alamat                     |       Kelurahan      |");
                System.out.println("+-------+------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                for(int i=0;i<kesehatan.size();i++){
                    kesehatan.get(i).print(i);
                }
                System.out.print("| Masukkan Nomor Yang Ingin Diubah  :");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan Nama Fasilitas Kesehatan       :");
                Scanner Inp2 = new Scanner(System.in);String NewNamaKesehatan = Inp2.nextLine();
                System.out.print("| Masukkan Tipe Fasilitas Kesehatan       :");
                Scanner Inp3 = new Scanner(System.in);String NewTipeKesehatan = Inp3.nextLine();
                System.out.print("| Masukkan Alamat Fasilitas Kesehatan     :");
                Scanner Inp4 = new Scanner(System.in);String NewAlamatKesehatan = Inp4.nextLine();
                System.out.print("| Masukkan Kecamatan Fasilitas Kesehatan  :");
                Scanner Inp5 = new Scanner(System.in);String NewKecamatanKesehatan = Inp5.nextLine();
                
                kesehatan.get(Update-1).Ubah(NewNamaKesehatan,NewTipeKesehatan,NewAlamatKesehatan,NewKecamatanKesehatan);
                backToMenu();}

            else if(UbahSarana.equals("3")){
                System.out.println("\t\t\t\t===============================================");
                System.out.println("\t\t\t\t                 UBAH SARANA                   ");
                System.out.println("\t\t\t\t===============================================");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                System.out.println("|   No  |              Nama Akomodasi             |         Rataan Harga (Rp)         |                      Alamat                     |         No.Telp      |");
                System.out.println("+-------+-----------------------------------------+-----------------------------------+-------------------------------------------------+----------------------+");
                
                for(int i=0;i<akomodasi.size();i++){
                    akomodasi.get(i).print(i);
                }

                System.out.print("| Masukkan Nomor Yang Ingin Diubah  :");
                Scanner inp10 = new Scanner(System.in);int Update = inp10.nextInt();
                System.out.print("| Masukkan Nama Fasilitas Akomodasi       : ");
                Scanner Inp2 = new Scanner(System.in);String NewAkomodasi = Inp2.nextLine();
                System.out.print("| Masukkan Harga Rataan                   : ");
                Scanner Inp3 = new Scanner(System.in);String NewHarga = Inp3.nextLine();
                System.out.print("| Masukkan Alamat Akomodasi               : ");
                Scanner Inp4 = new Scanner(System.in);String NewAlamatAkomodasi = Inp4.nextLine();
                System.out.print("| Masukkan No.Telepon                     : ");
                Scanner Inp5 = new Scanner(System.in);String NewNotelp = Inp5.nextLine();

                akomodasi.get(Update-1).Ubah(NewAkomodasi,NewHarga,NewAlamatAkomodasi,NewNotelp);
                backToMenu();
            }
            }
      
      
      static void readData(){
        String file = "DataSekolah.csv";
        BufferedReader reader = null;
        String line = "";

        String fileKesehatan = "DataKesehatan.csv";
        String line1 = "";
        BufferedReader ReadKesehatan = null;

        String fileAkomodasi = "DataAkomodasi.csv";
        String line2 = "";
        BufferedReader ReadAkomodasi = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();
            int i = 0;
            while ((line = reader.readLine()) != null){
                String[]row = line.split(",");
                pendidikan.add(new Pendidikan());
                pendidikan.get(i).NSPSN = Integer.parseInt(row[0]);
                pendidikan.get(i).NamaSatuanPendidikan = row[1];
                pendidikan.get(i).alamat = row[2];
                pendidikan.get(i).Kelurahan = row[3];
                pendidikan.get(i).Status = row[4];
                i++;
            }
            int Lastindex = pendidikan.size() - 1;
            pendidikan.remove(Lastindex);
        
        
        int j = 0;

        ReadKesehatan = new BufferedReader(new FileReader(fileKesehatan));
        line1 = ReadKesehatan.readLine();
        while((line1 = ReadKesehatan.readLine()) != null){
                String[]row1 = line1.split(",");
                kesehatan.add(new Kesehatan());
                kesehatan.get(j).NamaFasilitasKesehatan = row1[0];
                kesehatan.get(j).TipeFaskes = row1[1];
                kesehatan.get(j).Alamat = row1[2];
                kesehatan.get(j).Kecamatan = row1[3];
                j++;
            }
            //int LastIndexKesehatan = kesehatan.size() - 1;
            //kesehatan.remove(LastIndexKesehatan);

        int k = 0;
        ReadAkomodasi = new BufferedReader(new FileReader(fileAkomodasi));
        line2 = ReadAkomodasi.readLine();

        while((line2 = ReadAkomodasi.readLine()) != null){
            String[]row2 = line2.split(",");
            akomodasi.add(new Akomodasi());
            akomodasi.get(k).NamaAkomodasi = row2[0];
            akomodasi.get(k).Harga = row2[1];
            akomodasi.get(k).Alamat = row2[2];
            akomodasi.get(k).notelp = row2[3];
            k++;
        }

        }


        catch (Exception e) {
            System.out.println();
        }
    }
    
}
