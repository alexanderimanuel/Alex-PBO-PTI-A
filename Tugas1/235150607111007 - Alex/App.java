import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {
    static String[] mataKuliah = {"Matematika", "Fisika", "Kimia"};
    static String[] jadwalKuliah = {"Senin 08.00-09.40", "Rabu 10.00-11.40", "Jumat 13.00-14.40"};
    static int[] nilai = bacaNilaiDariFile("C:\\BELAJAR CODE\\belajarOOP\\Class dan Objek\\src\\nilai_mahasiswa.txt"); // simulasi nilai
    static Scanner scanner = new Scanner(System.in);
    static int banyakMemilih = 0;
    static int[] matkulPilihan = {3,3,3};
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Selamat Datang di SIAM UB Simulator");
            System.out.println("1. Pendaftaran Mata Kuliah");
            System.out.println("2. Informasi Jadwal Kuliah");
            System.out.println("3. Hasil Studi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    pendaftaranMataKuliah();
                    break;
                case 2:
                    informasiJadwalKuliah();
                    break;
                case 3:
                    hasilStudi();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan SIAM UB Simulator.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
                    System.out.println("----------------------------------------------------"); 
            }
        }
    }

    static int[] bacaNilaiDariFile(String namaFile) {
        String filePath = namaFile;
        int[] nilaiArray = new int[3];
        int index = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                if (index < nilaiArray.length) {
                    nilaiArray[index++] = scanner.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
        return nilaiArray;
    }

    static void pendaftaranMataKuliah() {
        System.out.println("Pendaftaran Mata Kuliah");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i+1) + ". " + mataKuliah[i]);
        }
        System.out.print("Masukkan nomor mata kuliah yang ingin didaftarkan: ");
        int pilihan = scanner.nextInt();
        boolean sudahDaftar = false;
        for (int isi : matkulPilihan) {
            if (isi == pilihan-1) {
                sudahDaftar = true;
            }
        }
        if (sudahDaftar == true) {
            System.out.println("Anda telah mendaftarkan matkul tersebut sebelumnya");
            System.out.println("----------------------------------------------------");
        } else {
            if (pilihan > 0 && pilihan <= mataKuliah.length) {
                System.out.println("Pendaftaran untuk mata kuliah " + mataKuliah[pilihan-1]+" telah berhasil");
                System.out.println("----------------------------------------------------");
                matkulPilihan[banyakMemilih] = pilihan - 1;
                banyakMemilih++;
            } else {
                System.out.println("Pilihan tidak valid.");
                System.out.println("----------------------------------------------------");
            }
        }
    }

    static void informasiJadwalKuliah() {
        if (banyakMemilih == 0) {
            System.out.println("Anda belum memilih mata kuliah");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("Informasi Jadwal Kuliah");
            for (int i = 0; i < banyakMemilih; i++) {
                System.out.println(mataKuliah[matkulPilihan[i]] + " - " + jadwalKuliah[matkulPilihan[i]]);   
            }
            System.out.println("----------------------------------------------------");
        }
    }

    static void hasilStudi() {
        if (banyakMemilih == 0) {
            System.out.println("Anda belum memilih mata kuliah");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("Hasil Studi");
            for (int i = 0; i < banyakMemilih; i++) {
                System.out.println(mataKuliah[matkulPilihan[i]] + ": " + nilai[matkulPilihan[i]]);
            }
            int totalNilai = hitungTotalNilai(banyakMemilih - 1);
            System.out.println("Total Nilai: " + totalNilai);
            System.out.println("----------------------------------------------------");
        }
    }
    // Penerapan rekursif
    static int hitungTotalNilai(int indeks) {
        if (indeks < 0) { // Kalau indeks kurang dari 0, tidak ada mata kuliah yang dipilih
            return 0;
        } else { // Menambah nilai mata kuliah saat ini dengan nilai dari mata kuliah sebelumnya
            return nilai[matkulPilihan[indeks]] + hitungTotalNilai(indeks - 1);
        }
    }
}