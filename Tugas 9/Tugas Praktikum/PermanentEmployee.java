public class PermanentEmployee extends Employee {
    // Tambahkan 1 atribut unik
    private String department;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    @Override
    public void performDuties() {
        System.out.println("Melaksanakan tugas sebagai pegawai tetap di" + department + " departemen.");
    }

    // Tambahkan 2 method unik
    public void attendMeeting() {
        System.out.println("Meeting di " + department + " department.");
    }

    public void submitReport() {
        System.out.println("Submit report di " + department + " department.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

