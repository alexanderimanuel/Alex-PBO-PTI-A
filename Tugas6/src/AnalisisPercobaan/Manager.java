package src.AnalisisPercobaan;
public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        // Jawaban No. 8 (protected agar tidak error maka line 4 hilang)
        // Jawaban No. 4 (terjadi error karena constructor mengikuti parent dan di parent tidak ada bonus)
        // super(name, salary, year, month, day, bonus);
        bonus = 0;
    }
    // Jawaban No. 3, 6
    // public Manager(String name) {
    //     super(name);
    //     bonus = 0;
    // }
    public void setBonus(double bonus) {
        this.bonus = bonus;
        // Jawaban No. 5 (Kalau this dihapus maka nilai bonus akan direfer pada variabel parameter fungsi set bonus, bukan atributes Manager, demikian juga di class Employee)
    }
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
