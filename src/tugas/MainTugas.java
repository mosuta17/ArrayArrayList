// Nama: Azkaa Muhammad Suta | NPM: 2410010057
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        KelasKuliah kelaskuliah = new KelasKuliah();
        
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Reza Okto", "2410010069", 100));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Niko", "2410010068", 30));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Teguh", "2410010067", 50)); 
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Tierrison", "2410010066", 90));
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Yukatheo", "2410010065", 100));
        
        
        // menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus serta daftar matkul
        kelaskuliah.tampilkanSemua();
        
        // Menambahkan satu objek Mahasiswa baru ke dalam koleksi, 
        kelaskuliah.tambahMahasiswa(new Mahasiswa("Ariyanto", "2410010064", 95));
        
        // lalu menampilkan kembali jumlah data terbaru.
        System.out.println();
        System.out.println("===[Menampilkan kembali jumlah data baru]===");
        kelaskuliah.tampilkanSemua();
    }
}