import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buat 3 akun
        AkunCustomer[] accounts = new AkunCustomer[3];
        accounts[0] = new AkunCustomer("3876543210", "Davis", 5000000, "1234");
        accounts[1] = new AkunCustomer("5612345678", "Yuven", 7500000, "5678");
        accounts[2] = new AkunCustomer("7498765432", "Isri", 10000000, "9012");

        System.out.println("Selamat datang di Tiny Supermarket System!");

        AkunCustomer akunTerpilih = null;
        while (akunTerpilih == null) {
            System.out.print("Silakan masukkan nomor pelanggan Anda untuk login: ");
            String nomorCustomer = scanner.nextLine();

            for (AkunCustomer akun : accounts) {
                if (akun.getNomorCustomer().equals(nomorCustomer)) {
                    akunTerpilih = akun;
                    System.out.println("Selamat datang, " + akunTerpilih.getNama() + "!");
                    break;
                }
            }

            if (akunTerpilih == null) {
                System.out.println("Nomor pelanggan tidak ditemukan. Silakan coba lagi.");
            }
        }

        boolean keluar = false;
        while (!keluar) {
            System.out.println("\nPilih fitur: (1) Purchase (2) Top Up (3) Keluar");
            int input = scanner.nextInt();
            scanner.nextLine(); 

            switch (input) {
                case 1: // Purchase
                    System.out.print("Masukkan besar pembayaran: ");
                    double jumlahPembelian = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Masukan nomor PIN: ");
                    String pinPembayaran = scanner.nextLine();
                    boolean pembayaranBerhasil = akunTerpilih.prosesPembelian(jumlahPembelian, pinPembayaran);
                    if (pembayaranBerhasil) {
                        System.out.println("Pembayaran berhasil. Saldo: " + akunTerpilih.getSaldo());
                    } else {
                        System.out.println("Pembayaran gagal.");
                    }
                    break;
                case 2: // Top Up
                    System.out.print("Masukkan jumlah nominal top-up: ");
                    double nominalTopUp = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Masukan nomor PIN: ");
                    String topUpPin = scanner.nextLine();
                    if (akunTerpilih.autentifikasi(topUpPin)) {
                        akunTerpilih.kredit(nominalTopUp);
                        System.out.println("Top-up berhasil. Saldo: " + akunTerpilih.getSaldo());
                    } else {
                        System.out.println("Top-up gagal.");
                    }
                    break;
                case 3: // keluar
                    keluar = true;
                    System.out.println("Keluar dari program. Terima kasih telah menggunakan Sistem Supermarket Kecil. Jangan lupa senyum buat kamu disana :)");
                    break;
                default:
                    System.out.println("Tidak valid, pilih kembali.");
                    break;
            }
        }
    }
}