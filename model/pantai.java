package model;

public class pantai extends destinasi implements Diskonable {
    private String fasilitas;

    public pantai(String nama, String lokasi, double hargaTiket, String fasilitas) {
        super(nama, lokasi, hargaTiket);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() { return fasilitas; }
    public void setFasilitas(String fasilitas) { this.fasilitas = fasilitas; }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pantai: " + getNama() + " | Lokasi: " + getLokasi() +
                " | Harga: " + getHargaTiket() + " | Fasilitas: " + fasilitas);
    }

    @Override
    public double hitungDiskon(double persen) {
        return getHargaTiket() - (getHargaTiket() * persen / 100);
    }
}
