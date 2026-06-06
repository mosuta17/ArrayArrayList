package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan3 {
     public static void main(String[] args) {
     // Membuat ArrayList kosong yang menampung String
     ArrayList<String> mahasiswa = new ArrayList<>();
     // add() menambah elemen di akhir
     mahasiswa.add("Andi");
     mahasiswa.add("Budi");
     mahasiswa.add("Citra");
     System.out.println("Isi list : " + mahasiswa);
     System.out.println("Jumlah : " + mahasiswa.size());
     System.out.println("Index 1 : " + mahasiswa.get(1));
 }
}
/*Kelemahan array adalah ukurannya tetap. Jika kita tidak tahu berapa banyak data
yang akan masuk (misalnya daftar mahasiswa yang bisa bertambah atau berkurang),
array menjadi merepotkan. ArrayList adalah struktur data dari Java Collections yang
ukurannya dinamis: dapat bertambah dan berkurang secara otomatis.
ArrayList hanya bisa menyimpan objek, bukan tipe primitif. Karena itu kita
memakai kelas pembungkus seperti Integer (untuk int), Double (untuk double), dan
Boolean (untuk boolean). String sudah berupa objek sehingga bisa langsung dipakai.
Wajib di-import. ArrayList berada di paket java.util. Tambahkan baris import
java.util.ArrayList; di bagian atas file. Di NetBeans, jika muncul tanda lampu
merah, tekan Alt+Enter untuk menambahkan import secara otomatis.

Untuk ArrayList, jumlah elemen diperoleh dengan method size()
(memakai tanda kurung), berbeda dengan array yang memakai properti length
(tanpa kurung). Akses elemen memakai get(indeks), bukan tanda kurung siku.*/