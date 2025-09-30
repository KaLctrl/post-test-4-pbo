package model;

public abstract class destinasi {
    private String nama;
    private String lokasi;
    private double hargaTiket;

    public  destinasi(String nama, String lokasi, double hargaTiket) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.hargaTiket = hargaTiket;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public double getHargaTiket() { return hargaTiket; }

    // Overloading setter hargaTiket
    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public void setHargaTiket(double hargaTiket, double diskon) {
        this.hargaTiket = hargaTiket - (hargaTiket * diskon / 100);
    }

    // Abstract method → wajib di override
    public abstract void tampilkanInfo();
}
