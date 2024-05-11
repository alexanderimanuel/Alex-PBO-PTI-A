public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Bayu", "35072849032742409342", 2000000);
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Toni", "35072849032742409343", 8500, 40);
        Sales sales1 = new Sales("Alex", "35072849032742409344", 50, 50000);

        // Upcasting
        Pegawai pegawai1 = pegawaiTetap1;
        Pegawai pegawai2 = pegawaiHarian1;
        Pegawai pegawai3 = sales1;

        // upcasting output
        System.out.println(pegawai1.toString()); 
        System.out.println(pegawai2.toString()); 
        System.out.println(pegawai3.toString()); 

        // Downcasting
        PegawaiTetap pegawaiTetapDowncast = (PegawaiTetap) pegawai1;
        PegawaiHarian pegawaiHarianDowncast = (PegawaiHarian) pegawai2;
        Sales salesDowncast = (Sales) pegawai3;

        // downcasting output
        System.out.println(pegawaiTetapDowncast.toString()); 
        System.out.println(pegawaiHarianDowncast.toString()); 
        System.out.println(salesDowncast.toString());
    }
}
