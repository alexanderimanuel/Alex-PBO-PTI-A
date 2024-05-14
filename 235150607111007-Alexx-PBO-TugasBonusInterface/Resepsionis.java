public class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    @Override
    public void naikLift() {
        System.out.println("Naik uhuyyy");
    }

    public void melayani() {
        System.out.println("Resepsionis melayani");
    }

    public void melapor() {
        System.out.println("Resepsionis melapor");
    }
}