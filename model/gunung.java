package model;

public class gunung extends destinasi implements Diskonable {
    private int ketinggian;

    public gunung(String nama, String lokasi, double hargaTiket, int ketinggian) {
        super(nama, lokasi, hargaTiket);
        this.ketinggian = ketinggian;
    }

    public int getKetinggian() { return ketinggian; }
    public void setKetinggian(int ketinggian) { this.ketinggian = ketinggian; }

    @Override
    public void tampilkanInfo() {
        System.out.println("Gunung: " + getNama() + " | Lokasi: " + getLokasi() +
                " | Harga: " + getHargaTiket() + " | Ketinggian: " + ketinggian + " mdpl");
    }

    @Override
    public double hitungDiskon(double persen) {
        return getHargaTiket() - (getHargaTiket() * persen / 100);
    }
}
