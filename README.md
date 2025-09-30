# CRUD Destinasi Wisata

## Deskripsi
Program ini merupakan aplikasi sederhana untuk mengelola daftar destinasi wisata dengan fitur CRUD. Program menggunakan konsep OOP (Encapsulation, Inheritance, Polymorphism, Abstraction) serta package terstruktur sesuai arsitektur MVC.

## Struktur Packages
- **model** → berisi struktur data (class abstrak `Destinasi`, subclass `Pantai` dan `Gunung`, serta interface `Diskonable`).
- **service** → berisi logika CRUD (`DestinasiService`).
- **main** → berisi entry point (`Main`) yang mengatur menu user.

## OOP Concepts
### 1. Encapsulation
- Atribut class dibuat `private`.<img width="839" height="613" alt="encapsulation4" src="https://github.com/user-attachments/assets/c970d639-6321-46a7-ba22-aee320d3c8a7" />

- Akses data melalui `getter` dan `setter`.

### 2. Inheritance
- `Pantai` dan `Gunung` adalah subclass dari `Destinasi`.
<img width="623" height="26" alt="inheritance4pantai" src="https://github.com/user-attachments/assets/4ea0d8e5-8b81-4a0e-a117-d6eec58ac12c" />
<img width="615" height="20" alt="inheritance4gunung" src="https://github.com/user-attachments/assets/f0243bfd-fb35-47b2-9088-9b3751140e88" />

### 3. Abstraction
- `Destinasi` adalah **abstract class** dengan method `tampilkanInfo()` yang harus dioverride. <img width="840" height="343" alt="abstract" src="https://github.com/user-attachments/assets/f984a65c-7a9e-45f5-bc6d-d9c7509f8623" />
 
- `Diskonable` adalah **interface** dengan method `hitungDiskon()` yang diimplementasikan oleh `Pantai` dan `Gunung`.
<img width="397" height="50" alt="abstract interface" src="https://github.com/user-attachments/assets/1e5c514c-6811-4f34-b926-cfc40052b49f" />

### 4. Polymorphism
- **Overriding** → method `tampilkanInfo()` dioverride di subclass `Pantai` dan `Gunung`.  <img width="877" height="118" alt="override" src="https://github.com/user-attachments/assets/5c2d64b4-b0ea-4f37-b5f4-898421c27ea8" />

- **Overloading** → method `setHargaTiket()` dibuat 2 versi:  
  - `setHargaTiket(double harga)`  <img width="643" height="195" alt="overloading" src="https://github.com/user-attachments/assets/b7ed11b1-34ba-4e30-b9f5-cbab9f7effde" />

  - `setHargaTiket(double harga, double diskon)`

### Nilai Tambah
- Program menggunakan **kombinasi abstract class dan interface** secara bersamaan.

<img width="713" height="775" alt="nilai tambah" src="https://github.com/user-attachments/assets/f942fd3a-a288-4465-b918-82f6d9f1ec3a" />
<img width="313" height="257" alt="tambah2" src="https://github.com/user-attachments/assets/61825799-6ab0-47aa-ae6e-8530eb4972df" />
<img width="941" height="562" alt="nilai tambah3" src="https://github.com/user-attachments/assets/ad9e71ca-3945-4c21-ae6c-186520afb7a8" />

## Fitur
- Tambah destinasi (Pantai/Gunung).
- Tampilkan semua destinasi.
- Validasi input menu (harus angka).

