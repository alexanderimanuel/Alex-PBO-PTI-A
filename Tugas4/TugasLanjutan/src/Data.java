import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Data {
    private Perpustakaan[] perpustakaanList;
    private Buku[] bukuList;
    private Anggota[] anggotaList;

    public Data(int perpustakaanSize, int bukuSize, int anggotaSize) {
        perpustakaanList = new Perpustakaan[perpustakaanSize];
        bukuList = new Buku[bukuSize];
        anggotaList = new Anggota[anggotaSize];
    }
    // menambahkan Perpustakaan ke dalam array
    public void addPerpustakaan(Perpustakaan perpustakaan, int index) {
        if (index >= 0 && index < perpustakaanList.length) {
            perpustakaanList[index] = perpustakaan;
        } else {
            System.out.println("Index tidak valid atau array penuh.");
        }
    }
    // menambahkan Buku ke dalam array
    public void addBuku(Buku buku, int index) {
        if (index >= 0 && index < bukuList.length) {
            bukuList[index] = buku;
        } else {
            System.out.println("Index tidak valid atau array penuh.");
        }
    }
    // menambahkan Anggota ke dalam array
    public void addAnggota(Anggota anggota, int index) {
        if (index >= 0 && index < anggotaList.length) {
            anggotaList[index] = anggota;
        } else {
            System.out.println("Index tidak valid atau array penuh.");
        }
    }
    public void writeFile(String filePath) {
        FileWriter writer = null;
        try {
            // Mengatur FileWriter untuk menambahkan data ke file yang ada (append: true)
            writer = new FileWriter(filePath, true);
            // Contoh menulis data buku ke file
            for (Buku buku : bukuList) {
                if (buku != null) {
                    // Menambahkan karakter newline setelah setiap entri buku
                    writer.write(buku.judul + ";" + buku.halamanBuku + System.lineSeparator());
                }
            }
            System.out.println("Data berhasil ditulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan saat menutup writer: " + e.getMessage());
                }
            }
        }
    }
    // Metode untuk membaca data dari file
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Mencetak setiap baris yang dibaca dari file
                System.out.println(line);
                // Asumsikan format: JudulBuku;HalamanBuku
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    Buku buku = new Buku();
                    buku.judul = parts[0];
                    buku.halamanBuku = parts[1];
                }
            }
            scanner.close();
            System.out.println("Data berhasil dibaca dari file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}


