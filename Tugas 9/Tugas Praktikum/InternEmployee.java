public class InternEmployee extends Employee implements Contract {
    // Tambahkan 1 atribut unik
    private String university;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String university) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.university = university;
    }

    @Override
    public void performDuties() {
        System.out.println("Melaksanakan tugas magang dari " + university);
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Menghadiri sesi pelatihan");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Melacak durasi kontrak");
    }

    // Tambahkan 2 method unik
    public void submitAssignment() {
        System.out.println("Mengirimkan tugas untuk " + university);
    }

    public void attendLecture() {
        System.out.println("Menghadiri kuliah di " + university);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}