public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return getUpah();
    }
    
    @Override
    public String toString() {
        return "Pegawai Tetap\t: " + this.getNama() +
        "\nNo. KTP\t\t: " + this.getNoKTP() +
        "\nUpah\t\t: Rp " + this.getUpah() +
        "\nPendapatan\t: Rp " + this.gaji();
    }
}
