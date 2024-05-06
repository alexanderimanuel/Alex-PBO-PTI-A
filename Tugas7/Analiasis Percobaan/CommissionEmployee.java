import java.time.LocalDate;
public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi
    public CommissionEmployee(String name, String noKTP, double sales, double rate) {
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }
       
    // Jawaban No. 4
    // public double earnings() {
    //     double totalEarnings = getCommissionRate() * getGrossSales();
    //     if (LocalDate.now().getMonth() == getBirthDate().getMonth()) { // cek apakah bulan ini adalah bulan ulang tahun
    //         totalEarnings += 100000; // tambahkan bonus 100.000 jika bulan ulang tahun
    //     }
    //     return totalEarnings;
    // }
    // public String toString(){
    //     return String.format("Commision employee:"+super.toString()+"\ngross sales:"+getGrossSales()+"\ncommission rate"+getCommissionRate());
    // }
}
   