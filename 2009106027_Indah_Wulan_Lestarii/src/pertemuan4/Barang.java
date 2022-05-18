package pertemuan4;

public class Barang {
    public String kodeBarang;
    public String namaBarang;
    public int hargaBarang;
    public String Bahan;
    
    public Barang(String kodeBarang, String namaBarang, int hargaBarang, String Bahan){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.Bahan = Bahan;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public String getBahan() {
        return Bahan;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setBahan(String Bahan) {
        this.Bahan = Bahan;
    }

    @Override
    public String toString() {
        return "Barang{" + "kodeBarang=" + kodeBarang + ", namaBarang=" + namaBarang + ", hargaBarang=" + hargaBarang + ", Bahan=" + Bahan + '}';
    }
    
    
    
    void tampilan(){
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga       : " + this.hargaBarang);
        System.out.println("Bahan       : " + this.Bahan);
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
