// // jawaban No. 4
// import java.time.LocalDate;

// public class Uji {
//     public static void main(String[] args) {
//         LocalDate birthDate = LocalDate.of(1990, 5, 5); // contoh tanggal lahir

//         SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "1234567890", 5000000);
//         HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", "0987654321", 50000, 45);
//         CommissionEmployee commissionEmployee = new CommissionEmployee("Alice Johnson", "1357924680", 10000000, 0.1);
//         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob Brown", "2468013579", 8000000, 0.08, 2000000);

//         // Set tanggal lahir untuk menguji bonus bulan ulang tahun
//         salariedEmployee.setBirthDate(birthDate);
//         hourlyEmployee.setBirthDate(birthDate);
//         commissionEmployee.setBirthDate(birthDate);
//         basePlusCommissionEmployee.setBirthDate(birthDate);

//         // Menghitung gaji dengan polimorfisme
//         System.out.println("Pendapatan Salaried Employee : " + salariedEmployee.earnings());
//         System.out.println("Pendapatan Hourly Employee: " + hourlyEmployee.earnings());
//         System.out.println("Pendapatan Commission Employee: " + commissionEmployee.earnings());
//         System.out.println("Pendapatan Base Plus Commission Employee: " + basePlusCommissionEmployee.earnings());
//     }
// }

// // Jawaban No. 5
// public class Uji {
//     public static void main(String[] args) {
//         LocalDate birthDate = LocalDate.of(1990, 5, 5); // contoh tanggal lahir

//         HourlyEmployee hourlyEmployee1 = new HourlyEmployee("John Doe", "1234567890", 50000, 45, 100);
//         HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Jane Smith", "0987654321", 50000, 35, 150);
//         HourlyEmployee hourlyEmployee3 = new HourlyEmployee("Alice Johnson", "1357924680", 60000, 40, 120);
//         HourlyEmployee hourlyEmployee4 = new HourlyEmployee("Bob Brown", "2468013579", 60000, 50, 90);

//         // Set tanggal lahir untuk menguji bonus bulan ulang tahun
//         hourlyEmployee1.setBirthDate(birthDate);
//         hourlyEmployee2.setBirthDate(birthDate);
//         hourlyEmployee3.setBirthDate(birthDate);
//         hourlyEmployee4.setBirthDate(birthDate);

//         // Menghitung gaji dengan polimorfisme
//         System.out.println("Hourly Employee 1 Earnings: " + hourlyEmployee1.earnings());
//         System.out.println("Hourly Employee 2 Earnings: " + hourlyEmployee2.earnings());
//         System.out.println("Hourly Employee 3 Earnings: " + hourlyEmployee3.earnings());
//         System.out.println("Hourly Employee 4 Earnings: " + hourlyEmployee4.earnings());
//     }
// }
