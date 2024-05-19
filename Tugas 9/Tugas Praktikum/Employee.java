abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    @Override
    public String toString() {
        StringBuilder invoiceDetails = new StringBuilder();
        for (Invoice invoice : invoices) {
            invoiceDetails.append(invoice.toString()).append("\n");
        }
        return "Nomor registrasi=" + registrationNumber +
                ", nama=" + name + 
                ", gaji per bulan=" + salaryPerMonth +
                ", total gaji setelah pemotongan=" + getPayableAmount() +
                "\nInvoices:\n" + invoiceDetails;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    // Tambahkan 2 method instans
    public void addInvoice(Invoice invoice) {
        Invoice[] newInvoices = new Invoice[invoices.length + 1];
        System.arraycopy(invoices, 0, newInvoices, 0, invoices.length);
        newInvoices[invoices.length] = invoice;
        this.invoices = newInvoices;
    }

    public void removeInvoice(Invoice invoice) {
        Invoice[] newInvoices = new Invoice[invoices.length - 1];
        int index = 0;
        for (Invoice inv : invoices) {
            if (!inv.equals(invoice)) {
                newInvoices[index++] = inv;
            }
        }
        this.invoices = newInvoices;
    }

    // Tambahkan 1 method static
    public static void printEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }

    // Tambahkan 1 method abstract
    public abstract void performDuties();
}



