import java.util.Scanner;
public class Tugas4 {
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
            userInput.nextLine(); 

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
