package src.AnalisisPercobaan;
public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
        // Jawaban No. 8 (protected)
        // Manager boss = new Manager();
        // boss.name = "Alex";
        // Jawaban No. 3
        // Manager boss = new Manager("Steven");
        boss.setBonus(5000);
        Employee staff = new Employee("Donni",50000,1989,10,1);
        System.out.println("nama boss : "+boss.getName()+", salary = "+boss.getSalary());
        System.out.println("nama staff : "+staff.getName()+", salary = "+staff.getSalary());
    }
}


// No. 1 tidak ditemukan kesalahan
// No. 2 Konstruktor pada subclass memanggil konstruktor di superclass menggunakan kata kunci super() di dalam definisi konstruktor subclass karena subclass ingin menggunakan atau menginisialisasi properti yang dimiliki oleh superclass. Konstruktor Manager pada subclass memanggil konstruktor Employee pada superclass dengan menggunakan super(name, salary, year, month, day); di dalam blok konstruktor Manager. Ini penting karena Manager adalah jenis khusus dari Employee, dan untuk memastikan bahwa data yang diperlukan untuk membuat objek Employee juga terinisialisasi dengan benar saat objek Manager dibuat. 
// No. 7 Modifier protected digunakan pada atribut atau metode dalam superclass agar dapat diakses oleh subclass, tetapi tidak dapat diakses secara langsung oleh kelas-kelas di luar hierarki turunan (subclass). Ini berarti bahwa atribut atau metode yang bersifat protected dapat diakses oleh subclass dan juga oleh kelas-kelas di paket yang sama dengan superclass.