package pertemuan2;

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
