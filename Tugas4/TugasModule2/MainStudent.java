import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
    //No. 4
    Scanner scanner = new Scanner(System.in);
    System.out.print("Mau berapa siswa niee: ");
    int jumlahSiswa = scanner.nextInt();
    Student[] students = new Student[jumlahSiswa];
    for (int i = 0; i < students.length; i++) {
        students[i] = new Student();
    }

    Student anna = new Student();
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.setMath(100);
    anna.setScience(89);
    anna.setEnglish(80);
    anna.displayMessage();
    
    //menggunakan constructor lain
    System.out.println("===================");
    Student chris = new Student("Chris", "Kediri", 21);
    chris.setMath(70);
    chris.setScience(60);
    chris.setEnglish(90);
    chris.displayMessage();
    //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("===================");
    // No. 1 student("anna","Batu",18) --> Student("anna","Batu",18)
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();

    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();

    // No. 2 
    Student alex = new Student(90.2,92.2,93.2);
    
    // No. 5
    Student.jumlahObjek(); 
    }
}

