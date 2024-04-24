package src.Praktikum;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Manusia Test Cases
        Manusia lakiLakiMenikah = new Manusia("Alexx", true, "123456789", true);
        Manusia perempuanMenikah = new Manusia("Sitii", false, "987654321", true);
        Manusia belumMenikah = new Manusia("Snowiii", false, "456789123", false);

        System.out.println("Manusia Test Cases:");
        System.out.println("a. Laki-laki telah menikah:\n" + lakiLakiMenikah.toString());
        System.out.println("b. Perempuan telah menikah:\n" + perempuanMenikah.toString());
        System.out.println("c. Belum menikah:\n" + belumMenikah.toString());

        // MahasiswaFILKOM Test Cases
        MahasiswaFILKOM ipkKurangTiga = new MahasiswaFILKOM("Dapis", true, "123456789", false, "165150600000000", 2.8);
        MahasiswaFILKOM ipkTigaTigaLima = new MahasiswaFILKOM("Isrik", false, "987654321", true, "165150600000001", 3.4);
        MahasiswaFILKOM ipkTigaLimaEmpat = new MahasiswaFILKOM("Yupenn", true, "456789123", false, "165150600000002", 3.9);

        System.out.println("\nMahasiswaFILKOM Test Cases:");
        System.out.println("a. IPK kurang dari 3:\n" + ipkKurangTiga.toString());
        System.out.println("b. IPK 3 - 3.5:\n" + ipkTigaTigaLima.toString());
        System.out.println("c. IPK 3.5 - 4:\n" + ipkTigaLimaEmpat.toString());

        // Pekerja Test Cases
        Pekerja pekerja1 = new Pekerja("Employee1", true, "111111111", true, 5000, LocalDate.of(2020, 1, 1), 2);
        // 250 + 40 + 25
        Pekerja pekerja2 = new Pekerja("Employee2", false, "222222222", false, 6000, LocalDate.of(2015, 1, 1), 0);
        Pekerja pekerja3 = new Pekerja("Employee3", true, "333333333", true, 7000, LocalDate.of(2000, 1, 1), 10);

        System.out.println("\nPekerja Test Cases:");
        System.out.println("a. Lama bekerja 2 tahun, anak 2:\n" + pekerja1.toString());
        System.out.println("b. Lama bekerja 9 tahun:\n" + pekerja2.toString());
        System.out.println("c. Lama bekerja 20 tahun, anak 10:\n" + pekerja3.toString());

        // Manager Test Case
        Manager manager = new Manager("Manager1", true, "444444444", false, 7500, LocalDate.of(2009, 1, 1), 0, "IT Department");
        System.out.println("\nManager Test Case:\n" + manager.toString());
        // 750 + 1125 + 15 
    }
}

