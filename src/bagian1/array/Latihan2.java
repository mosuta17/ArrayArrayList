package bagian1.array;

public class Latihan2 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85};
 
        // for biasa: punya akses ke indeks
        System.out.println("== Menggunakan for ==");
        for (int i = 0; i < nilai.length; i++) {
        System.out.println("Indeks " + i + " = " + nilai[i]);
        }
        
        // for-each: lebih ringkas, tanpa indeks
        System.out.println("== Menggunakan for-each ==");
        int total = 0;
        for (int n : nilai) {
        total += n;
        }
 
        double rata = (double) total / nilai.length;
        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + rata);

    }
}
/*Kapan pakai yang mana?. Gunakan for-each bila hanya perlu membaca tiap
elemen secara berurutan. Gunakan for biasa bila perlu indeks (misalnya
mengubah isi elemen, atau memproses dua array sekaligus).*/