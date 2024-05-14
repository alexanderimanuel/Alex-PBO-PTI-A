public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Alexx", 35, true, "NIP123", 5000.0);
        Mahasiswa mahasiswa = new Mahasiswa("Isrii", 20, false, "NIM456", 3.8, 1);
        Resepsionis resepsionis = new Resepsionis("Davis Yuvennn", 28, true, 789, "Resepsionis", 3000.0);
        Pengajar pengajar = new Pengajar();
        Asprak asprak = new Asprak();

        Civitas civitasDosen = dosen;
        Civitas civitasMahasiswa = mahasiswa;
        Civitas civitasResepsionis = resepsionis;
        PesertaKelas pesertaKelasPengajar = pengajar;
    }
}
