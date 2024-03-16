public class Perpustakaan {
    public String[] bukuPerpustakaan = new String[100];
    public String[] anggota = new String[100];
    private String namaPerpustakaan;
    private String lokasiPerpustakaan;
    
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

    void setNamaPerpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
    }

    void setLokasiPerpustakaan(String lokasiPerpustakaan) {
        this.lokasiPerpustakaan = lokasiPerpustakaan;
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
        // System.out.println(anggota[i]);
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
        // System.out.println(bukuPerpustakaan[i]);
        
    }
}
