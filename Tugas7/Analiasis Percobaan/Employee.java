import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    // jawaban No. 4
    private LocalDate tanggalUltah; 
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }
    // jawaban No. 4
    public LocalDate getBirthDate() {
        return tanggalUltah;
    }
    
    public void setBirthDate(LocalDate birthDate) {
        this.tanggalUltah = birthDate;
    }
    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nTanggal ulang tahun: %s", getName(), getNoKTP(), getBirthDate());
    }
    public abstract double earnings();//pendapatan
}
