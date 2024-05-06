import java.time.LocalDate;
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;//gaji pokok tiap minggu
    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary) {
        super(name, noKTP, sales, rate);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    // Jawaban No. 4
    // public double earnings() {
    //     double totalEarnings = getBaseSalary() + super.earnings();
    //     if (LocalDate.now().getMonth() == getBirthDate().getMonth()) { // cek apakah bulan ini adalah bulan ulang tahun
    //         totalEarnings += 100000; // tambahkan bonus 100.000 jika bulan ulang tahun
    //     }
    //     return totalEarnings;
    // }
    public String toString() {
    return String.format("Base-Salaried " +
    super.toString() + "\nbase salary " + getBaseSalary());
    }
}