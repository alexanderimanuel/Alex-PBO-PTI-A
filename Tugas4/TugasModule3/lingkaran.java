public class lingkaran {
    int alas, tinggi;
    public lingkaran(int alas) {
        this.alas = alas;
    }
    // No. 2 (terjadi karena nama construtor, jumlah beserta tipe data pada parameter sama dengan seperti di line 3)
    // public lingkaran(int tinggi) {

    // }
    // No 3
    public lingkaran(String a, String b) {
        String alas = a;
        String tinggi = b;
        parsing(alas,tinggi);
    }
    public void parsing(String a, String b) {
        alas = Integer.parseInt(a);
        tinggi = Integer.parseInt(b);
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    } 

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi()*getAlas())/2;
        return hasil;
    }

    // No. 1
    public void displayMessage() {
        System.out.println("Alas lingkaran adalah = "+this.alas);
        System.out.println("Tinggi lingkaran adalah = "+this.tinggi);
    }
}