public class Mahasiswa extends Civitas {
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    @Override
    public void naikLift() {
        System.out.println("naik uhuyyy");
    }

    public void ngerjaInTugas() {
        System.out.println("Mahasiswa mengerjakan tugas");
    }

    public void pasrah() {
        System.out.println("Mahasiswa pasrah");
    }

    public void mengikutiOrganisasi(String nama) {
        System.out.println("Mahasiswa mengikuti organisasi " + nama);
    }

    public void presentasi() {
        System.out.println("Mahasiswa presentasi");
    }
}