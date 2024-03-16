public class Buku {
    public String ISBN;
    public String judul;
    public String halamanBuku;
    void statusBuku(String[] dataPinjam) {
        int i = 0;
        for (String string : dataPinjam) {
            if (this.judul == string) {
                System.out.println("Buku dengan judul "+dataPinjam[i]+" sedang dipinjam");
                catatanKerusakan(dataPinjam[i]);
                break;
            }
            i++;
        }
        
    }
    void catatanKerusakan(String judul) {
        System.out.println("Tidak ada catatan kerusakan pada buku dengan judul "+judul);
        tampilkanHalamanBuku(halamanBuku);
    }
    void tampilkanHalamanBuku(String halaman) {
        System.out.println("Jumlah halaman adalah "+halamanBuku);
    }
}