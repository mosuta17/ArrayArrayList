package bagian3.perpustakaan;

import java.util.ArrayList;

// ==========================================
// CLASS MODEL: BUKU (DENGAN TAHUN & STATUS)
// ==========================================
class Buku {
    private String judul;
    private String penulis;
    // Latihan 2: Menambahkan atribut tahunTerbit
    private int tahunTerbit; 
    // Atribut tambahan untuk mendukung fitur pengembalian/peminjaman
    private boolean isDipinjam; 

    // Constructor yang sudah dilengkapi dengan tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = true; // misalnya buku dalam status "Sedang Dipinjam"
    }

    // Getter untuk Judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk Penulis
    public String getPenulis() {
        return penulis;
    }

    // Latihan 2: Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter untuk mengubah status pinjam buku
    public void setDipinjam(boolean status) {
        this.isDipinjam = status;
    }

    // Getter untuk mengecek status pinjam
    public boolean isDipinjam() {
        return isDipinjam;
    }

    // Latihan 2: Menampilkan tahun terbit dan status di dalam method info
    public String getInfo() {
        String status = isDipinjam ? "Sedang Dipinjam" : "Tersedia (Sudah Dikembalikan)";
        return "Judul: " + judul + " | Penulis: " + penulis + " (" + tahunTerbit + ") -> [" + status + "]";
    }
}


// ==========================================
// CLASS PENGELOLA: PERPUSTAKAAN
// ==========================================
class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku bukuBaru) {
        koleksiBuku.add(bukuBaru);
    }

    // Latihan 1: Method kembalikanBuku berdasarkan judul
    public void kembalikanBuku(String judul) {
        System.out.println("\n--> Mencoba mengembalikan buku: \"" + judul + "\"");
        boolean ditemukan = false;

        for (Buku b : koleksiBuku) {
            // Menggunakan equalsIgnoreCase agar pencarian judul tidak sensitif huruf besar/kecil
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(false); // Mengubah status menjadi tidak dipinjam (Tersedia)
                System.out.println("Sukses! Buku \"" + b.getJudul() + "\" telah berhasil dikembalikan.");
                ditemukan = true;
                break; // Hentikan perulangan jika buku sudah ditemukan
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, buku dengan judul \"" + judul + "\" tidak ditemukan di sistem.");
        }
    }

    // Latihan 3: Method cariPenulis untuk menampilkan karya penulis tertentu
    public void cariPenulis(String penulis) {
        System.out.println("\n== HASIL PENCARIAN PENULIS: " + penulis.toUpperCase() + " ==");
        boolean adaKarya = false;

        for (Buku b : koleksiBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.getInfo());
                adaKarya = true;
            }
        }

        if (!adaKarya) {
            System.out.println("Tidak ditemukan buku karya " + penulis + " di perpustakaan ini.");
        }
        System.out.println("=================================================");
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\n=== SEMUA DAFTAR BUKU SAAT INI ===");
        if (koleksiBuku.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            for (Buku b : koleksiBuku) {
                System.out.println("- " + b.getInfo());
            }
        }
        System.out.println("==================================");
    }
}


// ==========================================
// CLASS UTAMA (MAIN) 
// ==========================================
public class TugasMultiClass {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // Latihan 2: Membuat objek buku yang menyertakan data Tahun Terbit
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi", "Tere Liye", 2014));
        perpus.tambahBuku(new Buku("Filosofi Teras", "Henry Manampiring", 2018));
        perpus.tambahBuku(new Buku("Bulan", "Tere Liye", 2015)); // Tambahan untuk tes cariPenulis

        // Menampilkan kondisi awal (Semua buku default-nya berstatus "Sedang Dipinjam")
        perpus.tampilkanSemuaBuku();

        // -------------------------------------------------------------
        // UJI LATIHAN 1: Mengembalikan Buku
        // -------------------------------------------------------------
        perpus.kembalikanBuku("Bumi");
        
        // Tampilkan semua buku lagi untuk melihat perubahan status buku "Bumi"
        perpus.tampilkanSemuaBuku();

        // -------------------------------------------------------------
        // UJI LATIHAN 3: Mencari Buku Berdasarkan Penulis
        // -------------------------------------------------------------
        perpus.cariPenulis("Tere Liye");
        
        // Tes cari penulis yang tidak ada di list
        perpus.cariPenulis("Raditya Dika");
    }
}