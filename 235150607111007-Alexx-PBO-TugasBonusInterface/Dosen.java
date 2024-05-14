public class Dosen extends Civitas implements PesertaKelas {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    @Override
    public void masukKelas() {
        System.out.println("Dosen masuk kelas");
    }

    @Override
    public void naikLift() {
        System.out.println("Naik uhuyyy");
    }

    public void ikutPenelitian() {
        System.out.println("Dosen ikut penelitian");
    }
}