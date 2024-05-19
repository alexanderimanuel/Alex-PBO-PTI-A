// Jawaban No. 3 (bisa, dapat dilihat pada line 2 dibawah ini dimana Hewan dapat mengimplements interface MakhlukHidup dan Identitas)
// interface mengadopdsi multiple inheritance
// Jawaban No. 5 (tidak akan terjadi error, karena tidak ada keterangan override pada tampilkanNama dan tampilkanUmur)
public class Hewan implements MakhlukHidup {
 @Override
 public void makan() {
 System.out.println("Makan pakai tangan dan mulut");
 }
 @Override
 public void berjalan() {
 System.out.println("Jalan pakai 4 kaki");
 }
 @Override
 public void bersuara() {
 System.out.println("Suaranya nggak jelas");
 }
 
 public void tampilkanNama (){}

 public void tampilkanUmur () {}
}
