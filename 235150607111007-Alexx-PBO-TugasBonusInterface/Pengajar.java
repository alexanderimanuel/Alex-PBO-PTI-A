public class Pengajar implements PesertaKelas {
    @Override
    public void masukKelas() {
        System.out.println("Pengajar masuk kelas");
    }

    public void mengajar(String matkul) {
        System.out.println("Mengajar mata kuliah " + matkul);
    }

    public void mengasihTugas() {
        System.out.println("Pengajar memberi tugas");
    }

    public void menilaiTugas() {
        System.out.println("Pengajar menilai tugas");
    }
}