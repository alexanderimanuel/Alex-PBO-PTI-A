public class Main {
    public static void main(String[] args) {
        // Buat invoice
        Invoice invoice1 = new Invoice("Produk A", 2, 100);
        Invoice invoice2 = new Invoice("Produk B", 1, 200);
        Invoice invoice3 = new Invoice("Produk C", 3, 50);

        // Buat array invoice
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        // Buat PermanentEmployee dengan invoice
        PermanentEmployee permanentEmployee = new PermanentEmployee(12345, "Alexander", 3000, invoices, "IT");
        permanentEmployee.performDuties();
        permanentEmployee.attendMeeting();
        permanentEmployee.submitReport();
        Employee.printEmployeeDetails(permanentEmployee);

        // Buat InternEmployee dengan invoice 
        InternEmployee internEmployee = new InternEmployee(67890, "Toni", 1500, invoices, "Harvard");
        internEmployee.performDuties();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        internEmployee.submitAssignment();
        internEmployee.attendLecture();
        Employee.printEmployeeDetails(internEmployee);
    }
}
