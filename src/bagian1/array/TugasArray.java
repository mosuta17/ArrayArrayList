package bagian1.array;

public class TugasArray {
    public static void main(String[] args) {
        
        // latihan 1 array suhu
        // ==========================================
        System.out.println("=== LATIHAN 1: SUHU HARIAN ===");
        
        // Membuat array berisi 6 suhu harian (double)
        double[] suhuHarian = {28.5, 31.2, 26.9, 34.0, 29.8, 30.5};
        
        // Mengasumsikan indeks pertama sebagai suhu tertinggi dan terendah awal
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        
        // Melakukan perulangan untuk mencari nilai tertinggi dan terendah
        for (int i = 0; i < suhuHarian.length; i++) {
            // Jika menemukan suhu yang lebih besar, perbarui suhuTertinggi
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            // Jika menemukan suhu yang lebih kecil, perbarui suhuTerendah
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }
        
        // Menampilkan hasil
        System.out.println("Suhu Tertinggi: " + suhuTertinggi + "`C");
        System.out.println("Suhu Terendah : " + suhuTerendah + "`C");
        System.out.println(); // Baris baru untuk jarak

        
        // ==========================================
        // latihan 2 array nama hari
        // ==========================================
        System.out.println("=== LATIHAN 2: NAMA HARI (> 5 HURUF) ===");
        
        // Membuat array String berisi 5 nama hari
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        // Memeriksa panjang huruf setiap hari menggunakan .length() milik String
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("Hari " + hari + " memiliki " + hari.length() + " huruf");
            }
        }
        System.out.println(); // Baris baru untuk jarak

        
        // ==========================================
        // latihan 3 hitung angka genap
        // ==========================================
        System.out.println("=== LATIHAN 3: MENGHITUNG ANGKA GENAP ===");
        
        // Array angka yang diberikan
        int[] angka = {4, 8, 15, 16, 23, 42};
        
        // Variabel counter untuk menghitung jumlah angka genap
        int jumlahGenap = 0;
        
        // Memeriksa satu per satu angka menggunakan for-each
        for (int n : angka) {
            // Angka genap adalah angka yang habis dibagi 2 (sisa bagi / modulo adalah 0)
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }
        
        // Menampilkan hasil akhir
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}