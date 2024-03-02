import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
    //instan objek bernama m1 
    Mobil m1 = new Mobil(); 
    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukkan kecepatan: ");
    int kecepatan = userInput.nextInt();
    userInput.nextLine();
    m1.setKecepatan(kecepatan); 
    System.out.print("Masukkan Manufaktur: ");
    String manufaktur = userInput.nextLine();
    m1.setManufaktur(manufaktur); 
    System.out.print("Masukkan No. Plat: ");
    String noPlat = userInput.nextLine();
    m1.setNoPlat(noPlat);
    System.out.print("Masukkan warna: ");
    String warna = userInput.nextLine(); 
    m1.setWarna(warna); 
    m1.displayMessage();
    System.out.println("================");
    //instan objek baru bernama m2 
    Mobil m2 = new Mobil(); 
    m2.setKecepatan(100); 
    m2.setManufaktur("Mitsubishi"); 
    m2.setNoPlat("N 1134 AG"); 
    m2.setWarna("Pink"); 
    m2.displayMessage();
    System.out.println("================");
    //merubah warna dari objek m1
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    m1.setWarna("Hijau");
    //menampilkan hasil perubahan 
    m1.setWaktu(2.0);
    m1.hitungJarak();
    m1.displayMessage();
    
    }
}


    
    

    
