import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.setNamaPerpustakaan("Perpustakaan Umum");
        perpustakaan.setLokasiPerpustakaan("Jakarta");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Update Judul Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = userInput.nextInt();
            userInput.nextLine(); // 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama anggota: ");
                    String namaAnggota = userInput.nextLine();
                    System.out.print("Masukkan ID : ");
                    String idAnggota = userInput.nextLine();
                    Anggota anggota = new Anggota();
                    anggota.nama = namaAnggota;
                    anggota.MemberID = idAnggota;
                    perpustakaan.daftarAnggota(anggota);
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    String judulBuku = userInput.nextLine();
                    Buku buku = new Buku();
                    buku.judul = judulBuku;
                    System.out.print("Masukkan halaman buku: ");
                    String halamanBuku = userInput.nextLine();
                    buku.halamanBuku = halamanBuku;
                    perpustakaan.tambahBuku(buku);
                    buku.catatanKerusakan(judulBuku);
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String hapusJudul = userInput.nextLine();
                    perpustakaan.hapusBuku(hapusJudul);
                    break;
                case 4 :
                    perpustakaan.tampilkanSemuaBuku();
                    break;
                case 5 :
                    System.out.print("Masukkan judul buku lama: ");
                    String judulLama = userInput.nextLine();
                    System.out.print("Masukkan judul buku baru: ");
                    String judulBaru = userInput.nextLine();
                    perpustakaan.updateBuku(judulLama, judulBaru);
                    break;
                case 6 :
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    return;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }

    }
}

class Perpustakaan {
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

class Anggota {
    Scanner userInput = new Scanner(System.in);
    public String[] dataBukuPinjam = new String[100];
    public String MemberID;
    public String nama;

    void pinjamBuku(Buku judulBuku) {
        int i = 0;
        for (String buku : dataBukuPinjam) {
            if (buku == null) {
                break;
            }
            i += 1;
        }
        dataBukuPinjam[i] = judulBuku.judul;
        // System.out.println(dataBukuPinjam[i]);
    }

    void kembalikanBuku(Buku judulBuku) {
        int i = 0;
        for (String buku : dataBukuPinjam) {
            if (buku == judulBuku.judul) {
                dataBukuPinjam[i] = null;
            }
            i += 1;
        }
    }

    void bayar(double tagihan) {
        System.out.println("Ciee dah bayar");
    }
}

class Buku {
    public String ISBN;
    public String judul;
    public String halamanBuku;
    void statusBuku(String[] dataPinjam) {
        int i = 0;
        for (String string : dataPinjam) {
            if (this.judul == string) {
                System.out.println("Buku dengan judul "+dataPinjam[i]+" sedang dipinjam");
                catatanKerusakan(dataPinjam[i]);
                break;
            }
            i++;
        }
        
    }
    void catatanKerusakan(String judul) {
        System.out.println("Tidak ada catatan kerusakan pada buku dengan judul "+judul);
        tampilkanHalamanBuku(halamanBuku);
    }
    void tampilkanHalamanBuku(String halaman) {
        System.out.println("Jumlah halaman adalah "+halamanBuku);
    }
}
