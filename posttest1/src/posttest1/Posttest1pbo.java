package posttest1;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Posttest1pbo {
    static ArrayList<String> bukunovel;
    static Scanner input2=new Scanner(System.in);
    static Scanner input3=new Scanner(System.in);
    static ArrayList listNovel0 = new ArrayList();
    static ArrayList listNovel = new ArrayList();
    static ArrayList listNovel1 = new ArrayList();
    static ArrayList listNovel2 = new ArrayList();
    static ArrayList listNovel3 = new ArrayList();
    
    static void clearScreen(){
        try {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            // clear screen untuk windows
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        } else {
            // clear screen untuk Linux, Unix, Mac
            Runtime.getRuntime().exec("clear");
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (final Exception e) {
        System.out.println("Error karena: " + e.getMessage());
    }
    }
    
    public static void main(String[] args) {
            while (true) {
                showMenu();
            }
        } 

    static void showMenu() {
        clearScreen();
        System.out.println("NAMA : Jihan Hafizah Ariyani");
        System.out.println("NIM : 2009106038");
        System.out.println("KELAS : Informatika A 2020");
        System.out.println("");
        System.out.println("");
        System.out.println("== SISTEM MANAJEMEN BUKU NOVEL ==");
        System.out.println("[1] Read Buku Novel");
        System.out.println("[2] Create Buku Novel");
        System.out.println("[3] Update Buku Novel");
        System.out.println("[4] Delete Buku Novel");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input3.nextLine();

        if (selectedMenu.equals("1")) {
            readbukunovel();
            backToMenu();
        } else if (selectedMenu.equals("2")) {
            addbukunovel();
            backToMenu();
        } else if (selectedMenu.equals("3")) {
            editbukunovel();
            backToMenu();
        } else if (selectedMenu.equals("4")) {
            deletebukunovel();
            backToMenu();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Kamu salah pilih menu!");
            backToMenu();
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input3.nextLine();
        clearScreen();
    }

    static void readbukunovel() {
        clearScreen();
       System.out.println("\nDaftar Buku Novel: ");
        if(listNovel.isEmpty()){
       System.out.println("Belum ada data");
    } else {
        for(int i = 0; i < listNovel.size(); i++){
            System.out.println("Nomor Novel : "+listNovel0.get(i));
            System.out.println("Nama Novel : "+listNovel.get(i));
            System.out.println("Nama Penulis : "+listNovel1.get(i));
            System.out.println("Nama Penerbit : "+listNovel2.get(i));
            System.out.println("Tahun Terbit : "+listNovel3.get(i));
        }
    }
    }

    static void addbukunovel() {
        clearScreen();
        System.out.print("Masukkan jumlah buku: ");
        int indexNovel = input2.nextInt();
        for(int j = 0; j < indexNovel; j++){
        System.out.print("Nomor Novel: ");
        int nomorNovel = input2.nextInt();
        System.out.print("Nama Novel : ");
        String namaNovel = input3.nextLine();
        System.out.print("Nama penulis : ");
        String namaPenulis = input3.nextLine();
        System.out.print("Nama Penerbit : ");
        String namaPenerbit = input3.nextLine();
        int tahunTerbit;
        System.out.print("Tahun Terbit: ");
        tahunTerbit=input2.nextInt();
        listNovel0.add(nomorNovel);
        listNovel.add(namaNovel);
        listNovel1.add(namaPenulis);
        listNovel2.add(namaPenerbit);
        listNovel3.add(tahunTerbit);
       }
    }

    static void editbukunovel() {
        clearScreen();
        readbukunovel();
        System.out.print("Pilih nomer novel: ");
        int updateIndex= input2.nextInt();
        System.out.print("Nama Novel: ");
        String novelBaru = input3.nextLine();
        System.out.print("Nama penulis : ");
        String penulisBaru = input3.nextLine();
        System.out.print("Nama Penerbit : ");
        String penerbitBaru = input3.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahunBaru = input3.nextLine();
        
        listNovel.set((updateIndex-1), novelBaru);
        listNovel1.set((updateIndex-1), penulisBaru);
        listNovel2.set((updateIndex-1), penerbitBaru);
        listNovel3.set((updateIndex-1), tahunBaru);
        
    }

    static void deletebukunovel() {
        clearScreen();
        readbukunovel();
        System.out.print("Pilih nomer novel : ");
        int indexNovel = input2.nextInt();
        listNovel.remove(indexNovel);
    }
  }

