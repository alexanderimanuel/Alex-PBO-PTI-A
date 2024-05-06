public class TestKue {
    public static void main(String[] args) {
        Kue[] arrayKue = new Kue[20];
        arrayKue[0] = new KuePesanan("Brownies", 15000, 0.5);
        arrayKue[1] = new KuePesanan("Bolu Kukus", 10000, 0.3);
        arrayKue[2] = new KuePesanan("Donat", 12000, 0.4);
        arrayKue[3] = new KuePesanan("Lapis Legit 1", 25000, 0.8);
        arrayKue[4] = new KuePesanan("Lapis Legit 2", 25000, 0.8);
        arrayKue[5] = new KuePesanan("Lapis Legit 3", 25000, 0.8);
        arrayKue[6] = new KuePesanan("Lapis Legit 4", 25000, 0.8);
        arrayKue[7] = new KuePesanan("Lapis Legit 5", 25000, 0.8);
        arrayKue[8] = new KuePesanan("Lapis Legit 6", 25000, 0.8);
        arrayKue[9] = new KuePesanan("Lapis Legit 7", 25000, 0.8);

        arrayKue[10] = new KueJadi("Fortune Cookie", 25000, 2);
        arrayKue[11] = new KueJadi("Kue Lapis", 5000, 10);
        arrayKue[12] = new KueJadi("Kue Kering", 7000, 15);
        arrayKue[13] = new KueJadi("Kue Lumpur", 8000, 8);
        arrayKue[14] = new KueJadi("Kue Basah", 6000, 12);
        arrayKue[15] = new KueJadi("Kue Basah 2", 6000, 12);
        arrayKue[16] = new KueJadi("Kue Basah 3", 6000, 12);
        arrayKue[17] = new KueJadi("Kue Basah 4", 6000, 12);
        arrayKue[18] = new KueJadi("Kue Basah 5", 6000, 12);
        arrayKue[19] = new KueJadi("Kue Basah 6", 6000, 12);

        // semua kue
        System.out.println();
        System.out.println("Daftar Semua Kue:");
        for (Kue kue : arrayKue) {
            System.out.println(kue);
        }

        // total harga semua kue
        System.out.println();
        double totalHargaSemuaKue = 0;
        for (Kue kue : arrayKue) {
            totalHargaSemuaKue += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);

        // total harga, total berat KuePesanan
        System.out.println();
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);

        // total harga, total jumlah KueJadi
        System.out.println();
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);

        // kue harga akhir terbesar
        System.out.println();
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : arrayKue) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar:\n" + kueTerbesar);
    }
}

