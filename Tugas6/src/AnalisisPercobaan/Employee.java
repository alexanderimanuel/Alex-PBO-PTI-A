package src.AnalisisPercobaan;
import java.util.*;
public class Employee {
    private String name;
    private double salary;
    private Date hireday;
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        // Jawaban No. 5 (tapi ini tidak pengaruh ke hireday karena data yg dimasukkan dan variabel nya tidak memiliki nama yang sama)
        hireday = calendar.getTime();
    }
    // Jawaban No. 3, 6
    public Employee(String name){}
    // Jawaban No. 8 (protected = harus hapus saja semua constructor)
    public Date getHireDay() {
        return hireday;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}

