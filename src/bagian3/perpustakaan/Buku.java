package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
     private String judul;
     private String penulis;
     private boolean dipinjam;
     // Constructor: dipanggil saat objek dibuat
     public Buku(String judul, String penulis) {
     this.judul = judul;
     this.penulis = penulis;
     this.dipinjam = false; // buku baru dianggap tersedia
        }
     // Getter: cara membaca atribut dari luar class
     public String getJudul() {
         return judul;
        }
     public String getPenulis() {
         return penulis;
        }
     public boolean isDipinjam() {
         return dipinjam;
        }
     // Method untuk mengubah status pinjam
     public void setDipinjam(boolean dipinjam) {
         this.dipinjam = dipinjam;
        }
     // Mengembalikan keterangan buku dalam bentuk teks
     public String info() {
         String status = dipinjam ? "Dipinjam" : "Tersedia";
         return judul + " oleh " + penulis + " [" + status + "]";
        }
 }
