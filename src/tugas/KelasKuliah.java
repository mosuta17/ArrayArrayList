package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    private String[] namaMatkul = {"Tauhid", "Algoritma", "PBO 1"};

    public void tambahMahasiswa(Mahasiswa mhs) {
        mahasiswa.add(mhs);
    }

    public void hitungRataRata() {
        double totalnilai = 0;
        double jumlah_mahasiswa = mahasiswa.size();

        for (Mahasiswa mhs : mahasiswa) {
            totalnilai += mhs.getNilai();
        }

        double rata_rata = totalnilai / jumlah_mahasiswa;
        System.out.println("Rata-rata nilai dari semua mahasiswa adalah : " + rata_rata);
    }

    public void jumlahLulus() {
        int jumlah_lulus = 0;

        for (Mahasiswa mhs : mahasiswa) {
            if (mhs.lulus()) {
                jumlah_lulus++;
                System.out.println(jumlah_lulus + ". " + mhs.getNama() + " lulus!");
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus adalah : " + jumlah_lulus);
    }

    public void daftarMatkul() {
        System.out.println("--- daftar matkul : ---");
        for (int i = 0; i < namaMatkul.length; i++) {
            int urutannya = i + 1;
            String nama = namaMatkul[i];
            System.out.println(urutannya + ". " + nama);
        }
    }

    public void tampilkanDaftarMahasiswa() {
        System.out.println("=== daftar mahasiswa di kelas: ===");
        int nomor = 1;
        for (Mahasiswa mhs : mahasiswa) {
            // Mengambil data lewat getter dari class Mahasiswa
            System.out.println(nomor + ". Nama: " + mhs.getNama() + " | NPM: " + mhs.getNpm() + " | Nilai: " + mhs.getNilai());
            nomor++;
        }
    }

    public void tampilkanSemua() {
        daftarMatkul();
        System.out.println();
        tampilkanDaftarMahasiswa(); 
        System.out.println();
        hitungRataRata();
        System.out.println();
        jumlahLulus();
    }
}