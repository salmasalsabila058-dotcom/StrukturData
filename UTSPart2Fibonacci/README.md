# UTS Struktur Data – Part 2

## Implementasi Deret Fibonacci Menggunakan Rekursi (Java)
## Identitas

* **Nama** : Salma Salsabila
* **NPM**  : 25161562009
* **Kelas**: 2/A

##  Deskripsi Tugas

Program ini dibuat untuk mencetak deret Fibonacci hingga suku ke-*n* menggunakan pendekatan **rekursif** sesuai dengan instruksi Ujian Tengah Semester (UTS) mata kuliah Struktur Data.

Barisan Fibonacci merupakan deret angka di mana setiap elemen merupakan hasil penjumlahan dua elemen sebelumnya.

## Landasan Teori

Barisan Fibonacci didefinisikan sebagai:

* F(0) = 0
* F(1) = 1
* F(n) = F(n-1) + F(n-2), untuk n > 1

Pendekatan rekursif digunakan karena secara langsung merepresentasikan definisi matematis tersebut.

## Cara Kerja Program

1. Program meminta input jumlah suku (n) dari pengguna
2. Fungsi rekursif menghitung nilai Fibonacci
3. Perulangan digunakan untuk mencetak deret dari F(0) hingga F(n)
4. Output ditampilkan dalam format yang rapi menggunakan tanda koma

## Contoh Output

Jika user memasukkan: 7
Maka program menghasilkan:

Masukkan jumlah suku Fibonacci: 7
Deret Fibonacci hingga suku ke-7 adalah:
0, 1, 1, 2, 3, 5, 8, 13


## Analisis Kompleksitas

* **Time Complexity**: O(2ⁿ)
* **Space Complexity**: O(n)

Hal ini disebabkan oleh banyaknya pemanggilan fungsi rekursif yang berulang (*overlapping subproblems*).


## Keterbatasan

* Kurang efisien untuk nilai n besar
* Terjadi perhitungan berulang
* Potensi stack overflow jika n terlalu besar

## Kesimpulan

Program ini berhasil mengimplementasikan konsep rekursi untuk menghasilkan deret Fibonacci. Meskipun memiliki keterbatasan dari sisi efisiensi, pendekatan ini efektif untuk memahami dasar algoritma rekursif dalam struktur data.

