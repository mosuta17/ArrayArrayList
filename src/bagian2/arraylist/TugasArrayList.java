package bagian2.arraylist;

import java.util.ArrayList;

public class TugasArrayList {
    public static void main(String[] args) {

        // ==========================================
        // latihan 1 arraylist daftar belanja
        // ==========================================
        System.out.println("=== LATIHAN 1: DAFTAR BELANJA ===");
        
        // Membuat ArrayList untuk menampung String (daftar belanja)
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah 4 item ke dalam list menggunakan method .add()
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Gula");
        
        // Menghapus item ke-2
        // Ingat: Indeks dimulai dari 0. Jadi item ke-2 berada di indeks 1 (Beras).
        daftarBelanja.remove(1);
        
        // Tampilkan isi list
        System.out.println("Isi daftar belanja saat ini: " + daftarBelanja);
        
        // Tampilkan jumlah akhir menggunakan method .size()
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println(); // Baris baru untuk jarak

        
        // //latihan 2 nilai terbesar di arraylist
        // ==========================================
        System.out.println("=== LATIHAN 2: NILAI TERBESAR ===");
        
        // Membuat ArrayList berisi 5 angka (Integer)
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        daftarAngka.add(25);
        daftarAngka.add(78);
        daftarAngka.add(43);
        daftarAngka.add(91);
        daftarAngka.add(60);
        
        // Menelusuri seluruh elemen untuk mencari nilai terbesar
        int angkaTerbesar = daftarAngka.get(0);
        
        for (int i = 0; i < daftarAngka.size(); i++) {
            // Mengambil angka pada indeks ke-i menggunakan .get(i)
            if (daftarAngka.get(i) > angkaTerbesar) {
                angkaTerbesar = daftarAngka.get(i);
            }
        }
        
        // Tampilkan hasil
        System.out.println("Daftar angka   : " + daftarAngka);
        System.out.println("Nilai Terbesar : " + angkaTerbesar);
        System.out.println(); // Baris baru untuk jarak

        
        // //latihan 3 filter nama awalan huruf A
        // ==========================================
        System.out.println("=== LATIHAN 3: FILTER NAMA (AWALAN A) ===");
        
        // Membuat ArrayList dan menambah 6 nama
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dedi");
        
        System.out.println("Semua nama di list: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");
        
        // Cetak hanya nama yang diawali huruf A dengan .startsWith()
        // perulangan for-each agar lebih ringkas
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}