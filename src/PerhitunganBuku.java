public class PerhitunganBuku {
    public int isiBuku;
    public int kataPerHari;
    public int banyakHari;
    public void banyakHari() {
        banyakHari = isiBuku * 4; // 2 dikali 2
        System.out.print("Banyak hari yang dibutuhkan untuk membaca 1 buku tersebut adalah "+banyakHari+" hari");
    }
}
