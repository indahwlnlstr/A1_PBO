package pertemuan3;

class Barang {
    String kodeBarang;
    String namaBarang;
    int hargaBarang;
    String Bahan;
    
    public Barang(String kodeBarang, String namaBarang, int hargaBarang, String Bahan){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.Bahan = Bahan;
    }
    
    void inputdata(){
        System.out.println("Data Berhasil ditambahkan");
    }
    void ubahdata(){
        System.out.println("Data berhasil diedit");
    }
    void hapusdata(){
        System.out.println("Data berhasil dihapus");
    }      
}
