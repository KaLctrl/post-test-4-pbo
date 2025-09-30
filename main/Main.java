package main;

import service.DestinasiService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DestinasiService service = new DestinasiService();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu CRUD Destinasi Wisata ===");
            System.out.println("1. Tambah Destinasi");
            System.out.println("2. Tampilkan Destinasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Input harus angka. Pilih menu: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    service.tambahDestinasi();
                    break;
                case 2:
                    service.tampilkanDestinasi();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 3);
    }
}
