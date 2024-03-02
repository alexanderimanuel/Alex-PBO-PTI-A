public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    public double sekon;
    public double konversiKecepatan;
    public double jarak;
    public double kecepatanPublic;
    public double waktu;
    public void setNoPlat(String s){
    noPlat = s;
    }
    public void setWarna(String s){
    warna = s;
    }
    public void setManufaktur(String s){
    manufaktur = s;
    }
    private void rubahSekon(double inputWaktu) {
        sekon = 3600 * inputWaktu;
        System.out.println("Waktu menjadi "+sekon+" sekon");
    }
    public void setWaktu(double masukanWaktu) {
        waktu = masukanWaktu;
        rubahSekon(waktu);
        System.out.println("Debug waktu "+waktu);
    }

    public void setKecepatan(int i){
        kecepatan = i;
        kecepatanPublic = i;
        rubahKecepatan(kecepatan);
    }

    private void rubahKecepatan(double inputKecepatan) {
        konversiKecepatan = (inputKecepatan * 1000) / 3600;
        System.out.println("Kecepatan anda dalam m/s adalah "+konversiKecepatan+ " m/s");
    }
    // dalam sekon
    public void hitungJarak() {
        jarak = konversiKecepatan * sekon;
        System.out.println("Jarak yang ditempuh mobil adalah "+ jarak+ "m");
    }
    public double hitungJarakKm() {
        return kecepatanPublic * waktu;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("Jarak yang ditempuh adalah "+hitungJarakKm()+" km");
    }
}
