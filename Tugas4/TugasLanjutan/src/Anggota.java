import java.util.Scanner;
public class Anggota {
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