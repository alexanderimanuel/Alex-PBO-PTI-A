import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Jawaban No. 1 (tidak ada error)
        // Jawaban No. 2
        // MakhlukHidup alex = new MakhlukHidup(); (akan error karena interface tidak dapat menginstance objek)
        // Jawaban No. 6 
        Manusia alex = new Manusia("Alexander",18);
        // Jawaban No. 7
        System.out.print("Masukkan nama mu : ");
        String nama = scanner.next(); 
        System.out.print("Masukkan umur mu : ");
        String umur = scanner.next(); 
        System.out.println("Anda sudah terdaftar, nama anda adalah "+nama+" dan anda berusia "+umur);
        // Jawaban No. 8
        MakhlukHidup anjing = new Hewan();
        anjing.berjalan();
        anjing.makan(); 
    }
}

