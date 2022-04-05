package Perusahaan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manajemen {

    static String fileName;
    static ArrayList<String> dataPerusahaan;
    static boolean isEditing = false;
    static Scanner input;
  
    String dataSuplier;
    String namaBarang;
    int kodeBarang;
    int idSuplier;

    public static void main(String[] args) {
        
        String dataSuplier;
        dataPerusahaan = new ArrayList<>();
        input = new Scanner(System.in);

        String filePath = System.console() == null ? "/src/datacv.txt" : "/datacv.txt";
        fileName = System.getProperty("user.dir") + filePath;

        System.out.println("FILE: " + fileName);

        while (true) {
            showMenu();
        }
    }

    static void showMenu() {
        System.out.println("=Program Manajemen Perusahaan=");
        System.out.println("===== CV.Yova Bersaudara =====");
        System.out.println("| [1] Lihat Data Perusahaan  |");
        System.out.println("| [2] Tambah Data Perusahaan |");
        System.out.println("| [3] Edit Data Perusahaan   |");
        System.out.println("| [4] Hapus Data Perusahaan  |");
        System.out.println("| [0] Keluar                 |");
        System.out.println("------------------------------");
        System.out.print("Pilih menu = ");

        String selectedMenu = input.nextLine();

        switch (selectedMenu) {
            case "1":
                showData();
                break;
            case "2":
                addData();
                break;
            case "3":
                editData();
                break;
            case "4":
                deleteData();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Pilihan Anda Salah!");
                backToMenu();
                break;
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
    }

    static void readData() {
        try {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        dataPerusahaan.clear();
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            dataPerusahaan.add(data);
        }

        } catch (FileNotFoundException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void showData() {
        readData();
        if (dataPerusahaan.size() > 0) {
            System.out.println("### Data Perusahaan ###:");
            int index = 0;
            for (String data : dataPerusahaan) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }
    }

    static void addData() {
        System.out.print("Nama Suplier : ");
        String dataSuplier = input.nextLine();
        System.out.print("Nama Barang : ");
        String namaBarang = input.nextLine();
        System.out.print("Kode Barang : ");
        int kodeBarang = input.nextInt();
        System.out.print("ID Suplier : ");
        int idSuplier = input.nextInt();
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(String.format("%s%n", "Nama Suplier : "+ dataSuplier +"| Nama Barang : "+ namaBarang +"| Kode Barang : "+ kodeBarang +"| ID Suplier : "+ idSuplier));
            fileWriter.close();
            System.out.println("Berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }

    static void editData() {
        isEditing = true;
        showData();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > dataPerusahaan.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Nama Suplier Baru : ");
                String dataSuplier = input.nextLine();
                System.out.print("Nama Barang : ");
                String namaBarang = input.nextLine();
                System.out.print("Kode Barang : ");
                int kodeBarang = input.nextInt();
                System.out.print("ID Suplier : ");
                int idSuplier = input.nextInt();

                dataPerusahaan.set(index, dataSuplier +","+ namaBarang +","+ kodeBarang +","+ idSuplier);

                System.out.println(dataPerusahaan.toString());

                try {
                    FileWriter fileWriter = new FileWriter(fileName, false);
                    for (String data : dataPerusahaan) {
                        fileWriter.append(String.format("%s%n", "Nama Suplier : "+ dataSuplier +"| Nama Barang : "+ namaBarang +"| Kode Barang : "+ kodeBarang +"| ID Suplier : "+ idSuplier));
                    }
                    fileWriter.close();

                    System.out.println("Berhasil diubah!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena : " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }

    static void deleteData() {
        isEditing = true;
        showData();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks yang ingin dihapus : ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > dataPerusahaan.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus data :");
                System.out.println(String.format("[%d] %s", index, dataPerusahaan.get(index)));
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    dataPerusahaan.remove(index);

                    try {
                        FileWriter fileWriter = new FileWriter(fileName, false);

                        for (String data : dataPerusahaan) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                        fileWriter.close();

                        System.out.println("Berhasil dihapus!");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
    }
}