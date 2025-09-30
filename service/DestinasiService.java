package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class DestinasiService {
    private ArrayList<destinasi> daftarDestinasi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
   
    public void tambahDestinasi() {
        System.out.println("Pilih jenis destinasi:");
        System.out.println("1. Pantai");
        System.out.println("2. Gunung");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Lokasi: ");
        String lokasi = scanner.nextLine();
        System.out.print("Harga tiket: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Fasilitas: ");
            String fasilitas = scanner.nextLine();
            daftarDestinasi.add(new pantai(nama, lokasi, harga, fasilitas));
        } else if (pilihan == 2) {
            System.out.print("Ketinggian (mdpl): ");
            int ketinggian = scanner.nextInt();
            scanner.nextLine();
            daftarDestinasi.add(new gunung(nama, lokasi, harga, ketinggian));
        }
        System.out.println("Destinasi berhasil ditambahkan!");
    }

    public void tampilkanDestinasi() {
        if (daftarDestinasi.isEmpty()) {
            System.out.println("Belum ada destinasi.");
            return;
        }
        for (destinasi d : daftarDestinasi) {
            d.tampilkanInfo();
        }
    }
}
