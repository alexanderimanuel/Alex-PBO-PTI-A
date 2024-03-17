import java.util.Scanner;
public class Perpustakaan {
    public String[] bukuPerpustakaan = new String[100];
    public String[] anggota = new String[100];
    private String namaPerpustakaan;
    private String lokasiPerpustakaan;

    // Menambah 3 constructor overloading
    public Perpustakaan() {
        String namaPerpustakaan = "";
        String lokasiPerpustakaan = "";
    }

    public Perpustakaan(String a) {
        String namaPerpustakaan = a;
        String lokasiPerpustakaan  = "";
    }

    public Perpustakaan(String a, String b) {
        String namaPerpustakaan = a;
        String lokasiPerpustakaan  = b;
    }
    // 3 method overload
    Scanner scanner = new Scanner(System.in);
    // method overloading 1
    void updateBuku(String judulLama) {
        System.out.println("masukkan judul buku baru : ");
        String judulBukuBaru = scanner.nextLine();
        for (int i = 0; i < bukuPerpustakaan.length; i++) {
            if (bukuPerpustakaan[i] != null && bukuPerpustakaan[i].equals(judulLama)) {
                bukuPerpustakaan[i] = judulBukuBaru;
                System.out.println("Judul buku berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }
    void updateBuku(String judulLama, String judulBaru) {
        for (int i = 0; i < bukuPerpustakaan.length; i++) {
            if (bukuPerpustakaan[i] != null && bukuPerpustakaan[i].equals(judulLama)) {
                bukuPerpustakaan[i] = judulBaru;
                System.out.println("Judul buku berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }
    
    void hapusBuku(String judulBuku) {
        for (int i = 0; i < bukuPerpustakaan.length; i++) {
            if (bukuPerpustakaan[i] != null && bukuPerpustakaan[i].equals(judulBuku)) {
                bukuPerpustakaan[i] = null;
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    void tampilkanSemuaBuku() {
        System.out.println("Daftar Buku:");
        for (String buku : bukuPerpustakaan) {
            if (buku != null) {
                System.out.println(buku);
            }
        }
    }
    // method overloading 2
    void setNamaPerpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
    }
    void setNamaPerpustakaan() {
        System.out.println("masukkan nama perpustakaan : ");
        String namaPerpustakaan = scanner.nextLine();
        this.namaPerpustakaan = namaPerpustakaan;
    }
    // method overloading 3
    void setLokasiPerpustakaan(String lokasiPerpustakaan) {
        this.lokasiPerpustakaan = lokasiPerpustakaan;
    }
    void setLokasiPerpustakaan() {
        this.lokasiPerpustakaan = "Indonesia";
    }

    void daftarAnggota(Anggota namaAnggota) {
        int i = 0;
        for (String a : anggota) {
            if (a == null) {
                break;
            }
            i += 1;
        }
        anggota[i] = namaAnggota.nama;
    }
    // mengembalikan tipe data class itu sendiri
    Anggota buatObjekAnggota() {
        Anggota anggota = new Anggota();
        return anggota;
    }

    void tambahBuku(Buku judulBuku) {
        int i = 0;
        for (String buku : bukuPerpustakaan) {
            if (buku == null) {
                break;
            }
            i += 1;
        }
        bukuPerpustakaan[i] = judulBuku.judul;
    }
}