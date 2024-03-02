public class Mahasiswa {
    public static void main(String[] args) {
        PerhitunganBuku budi = new PerhitunganBuku();
        budi.isiBuku = 50; //50 lembar = 100 halaman
        budi.kataPerHari = 100; // 100 kata atau 1/2 halaman 
        budi.banyakHari();
    }
}

