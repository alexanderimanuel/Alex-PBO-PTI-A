import java.time.LocalDate;
public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary();
    }
    // Jawaban No. 4
    // public double earnings() {
    //     double totalEarnings = getWeeklySalary() * 4; // gaji per bulan (asumsi 4 minggu)
    //     if (LocalDate.now().getMonth() == getBirthDate().getMonth()) { // cek apakah bulan ini adalah bulan ulang tahun
    //         totalEarnings += 100000; // tambahkan bonus 100.000 jika bulan ulang tahun
    //     }
    //     return totalEarnings;
    // }

    public String toString() {
        return String.format("Salaried employee: " +
                super.toString() + "\nWeekly salary: " + getWeeklySalary());
    }
}
   