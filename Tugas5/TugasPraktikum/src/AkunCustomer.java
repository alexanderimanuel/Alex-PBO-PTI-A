public class AkunCustomer {
    private double saldo;
    private String nomorCustomer;
    private String nama;
    private String pin;
    private int salahPin = 0;
    private boolean membeku = false;

    // Constructor
    public AkunCustomer(String nomorCustomer, String nama, double saldo, String pin) {
        this.nomorCustomer = nomorCustomer;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    public String getNomorCustomer() {
        return nomorCustomer;
    }

    public String getNama() {
        return nama;
    }

    // Method autentifikasi
    public boolean autentifikasi(String nomorPIN) {
        if (membeku) {
            System.out.println("Akun telah dibekukan karena 3 kali salah memasukkan PIN.");
            return false;
        }

        if (!this.pin.equals(nomorPIN)) {
            salahPin++;
            if (salahPin >= 3) {
                membeku = true;
                System.out.println("Akun dibekukan karena 3 kali salah memasukkan PIN.");
            }
            return false;
        }

        salahPin = 0; 
        return true;
    }

    // Method top up
    public void kredit(double jumlah) {
        saldo += jumlah;
    }

    // Method proses pembayaran
    public boolean prosesPembelian(double jumlah, String nomorPIN) {
        if (!autentifikasi(nomorPIN)) {
            return false;
        }

        if (jumlah <= 0 || saldo - jumlah < 10000) {
            System.out.println("Transaksi gagal: Saldo tidak mencukupi atau jumlah pembelian tidak valid.");
            return false;
        }

        saldo -= jumlah;
        double cashback = hitungCashBack(jumlah);
        kredit(cashback);
        System.out.println("Pembelian berhasil.");
        return true;
    }

    // kalkulasi cashback
    private double hitungCashBack(double jumlah) {
        String tipeAkun = nomorCustomer.substring(0, 2);
        double cashback = 0;

        switch (tipeAkun) {
            case "38": // Silver
                if (jumlah > 1000000) {
                    cashback = jumlah * 0.05;
                }
                break;
            case "56": // Gold
                if (jumlah > 1000000) {
                    cashback = jumlah * 0.07;
                } else {
                    cashback = jumlah * 0.02;
                }
                break;
            case "74": // Platinum
                if (jumlah > 1000000) {
                    cashback = jumlah * 0.10;
                } else {
                    cashback = jumlah * 0.05;
                }
                break;
            default:
                break;
        }
        return cashback;
    }
}