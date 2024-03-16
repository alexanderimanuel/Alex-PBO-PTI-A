import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        // membuat objek Data dengan ukuran array tertentu
        Data data = new Data(10, 50, 100);     
        Scanner userInput = new Scanner(System.in);
        // membuat 3 objek dari overloading constructor 
        Perpustakaan perpustakaan = new Perpustakaan();
        data.addPerpustakaan(perpustakaan, 0);
        Perpustakaan perpustakaan2 = new Perpustakaan("Perpustakaan A");
        data.addPerpustakaan(perpustakaan2, 1);
        Perpustakaan perpustakaan3 = new Perpustakaan("Perpustakaan B","Bogor");
        data.addPerpustakaan(perpustakaan3, 2);
        // pemanggilan overloading method
        perpustakaan2.setLokasiPerpustakaan(); 
        perpustakaan.setNamaPerpustakaan("Perpustakaan Umum");
        perpustakaan.setLokasiPerpustakaan("Jakarta");
        perpustakaan.buatObjekAnggota();  
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Update Judul Buku");
            System.out.println("6. Baca Database");
            System.out.println("7. Ubah Isi Database");
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
                    data.addAnggota(anggota, 0);
                    anggota.nama = namaAnggota;
                    anggota.MemberID = idAnggota;
                    perpustakaan.daftarAnggota(anggota);
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    String judulBuku = userInput.nextLine();
                    Buku buku = new Buku();
                    data.addBuku(buku, 0);
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
                    data.readFile("C:\\BELAJAR CODE\\Tugas4lanjutan\\src\\data.txt"); 
                    break;
                case 7 :
                    data.writeFile("C:\\BELAJAR CODE\\Tugas4lanjutan\\src\\data.txt");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}