import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Perpustakaan {
    private String penulis;
    private int kategori;
    private String tahun;
    private String judul;
    Scanner userInput = new Scanner(System.in);
    String[][] dataArrayPerBuku = new String[5][3];
    public String[] golonganKategori = {"teknologi","filsafat","sejarah","agama","psikologi","politik","fiksi"};
    public String[][] isiKategori = {{"Metaverse", "Ngoding Java","Ngoding HTML","Ngoding Python","Ngoding C#"},{"Filsafat A", "Filsafat B","Filsafat C","Filsafat D","Filsafat E"},{"Sejarah A", "Sejarah B","Sejarah C","Sejarah D","Sejarah E"},{"Agama Kristen", "Agama Islam","Agama Katolik","Agama Hindu","Agama Budha"},{"Psikologi A", "Psikologi B","Psikologi C","Psikologi D","Psikologi E"},{"Politik A", "Politik B","Politik C","Politik D","Politik E"},{"Fiksi A", "Fiksi B","Fiksi C","Fiksi D","Fiksi E"}};
    
    Perpustakaan(){
        int index = 1;
        for (String isi : golonganKategori) {
            System.out.println(index+". "+isi);
            index++;
        }
        System.out.print("Masukkan pilihan kategori anda: ");
        int a = userInput.nextInt();
        userInput.nextLine();
        kategori = a;
    }

    public void display(){
        if (kategori==1) {
            System.out.println("Kategori : Teknologi");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\teknologi.txt");
            tampilkan(1);
        } else if (kategori==2){
            System.out.println("Kategori : Filsafat");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\filsafat.txt");
            tampilkan(2);
        } else if (kategori==3){
            System.out.println("Kategori : Sejarah");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\sejarah.txt");
            tampilkan(3);
        } else if (kategori==4){
            System.out.println("Kategori : Agama");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\agama.txt");
            tampilkan(4);
        } else if (kategori==5){
            System.out.println("Kategori : Psikologi");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\psikologi.txt");
            tampilkan(5);
        } else if (kategori==6){
            System.out.println("Kategori : Politik");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\politik.txt");
            tampilkan(6);
        } else if (kategori==7){
            System.out.println("Kategori : Fiksi");
            bacaNilaiDariFile("C:\\BELAJAR CODE\\Buku\\Buku\\src\\fiksi.txt");
            tampilkan(7);
        }
    }

    public void tampilkan(int nomorKategori) {
        int i = 1;
        for (int j = 0; j < 5; j++) {
            System.out.println(i+". "+isiKategori[nomorKategori-1][j]);
            i++;
        }
        System.out.print("Pilih buku diatas: ");
        int pilihan = userInput.nextInt();
        if (pilihan == 1){
            aksesFile(1);
        } else if (pilihan == 2) {
            aksesFile(2);
        } else if (pilihan == 3) {
            aksesFile(3);
        } else if (pilihan == 4) {
            aksesFile(4);
        } else if (pilihan == 5) {
            aksesFile(5);
        }
    }

    public String[][] bacaNilaiDariFile(String namaFile) {
        String[] nilaiArray = new String[5];
        int index = 0;
        try {
            File dataKategoriAgama = new File(namaFile);
            Scanner scanner = new Scanner(dataKategoriAgama);
            while (scanner.hasNextLine()) {
                if (index < nilaiArray.length) {
                    nilaiArray[index++] = scanner.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
        for(int i = 0; i < 5; i++) {
            dataArrayPerBuku[i] = nilaiArray[i].split(" ");
        }
        return dataArrayPerBuku;	
    }

    public void aksesFile(int pilihan) {
        penulis = dataArrayPerBuku[pilihan-1][0];
        tahun = dataArrayPerBuku[pilihan-1][1];
        judul = dataArrayPerBuku[pilihan-1][2];
        System.out.println("Judul buku tersebut adalah "+judul);
        System.out.println("Tahun ditulisnya buku tersebut adalah "+tahun);
        System.out.println("Penulis buku tersebut adalah "+penulis);
    }
}
