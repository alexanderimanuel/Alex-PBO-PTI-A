public class Rasional{
    private int pembilang, penyebut; 

    public Rasional(){
        pembilang=0; 
        penyebut=0;
    }

    public Rasional(int pbl, int pyb){ 
        pembilang=pbl;
        penyebut=pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan public boolean isRasional(){
    public boolean isRasional() {
        return (penyebut!= 0);
    }
    
    //menyederhanakan bilangan rasional public void Sederhana(){
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang; 
        B = (pembilang<penyebut) ? pembilang:penyebut;
        // while (B != 0){
        //     temp= A % B;
        //     A = B;
        //     B = temp;
        // }
        
        // pembilang /=A; 
        // penyebut /=A;
        // No 3.
        for (; B != 0; ) {
            temp = A % B;
            A = B;
            B = temp;
        }
    
        pembilang /= A;
        penyebut /= A;
    }
    
    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //oprator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    //operator Unary- ---> A = -A public void negasi(){
    public void negasi() {
        pembilang = - pembilang;
    }

    //operator unary += 
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }

    // No. 2
    // Operator <
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    // Operator <=
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    // Operator >=
    public boolean greaterThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // No. 4
    // Metode untuk operasi pengurangan
    public Rasional subtract(Rasional r) {
        int newPembilang = this.pembilang * r.penyebut - this.penyebut * r.pembilang;
        int newPenyebut = this.penyebut * r.penyebut;
        Rasional hasil = new Rasional(newPembilang, newPenyebut);
        hasil.Sederhana();
        return hasil;
    }

    // Metode untuk operasi perkalian
    public Rasional multiply(Rasional r) {
        int newPembilang = this.pembilang * r.pembilang;
        int newPenyebut = this.penyebut * r.penyebut;
        Rasional hasil = new Rasional(newPembilang, newPenyebut);
        hasil.Sederhana();
        return hasil;
    }

    // Metode untuk operasi pembagian
    public Rasional divide(Rasional r) {
        int newPembilang = this.pembilang * r.penyebut;
        int newPenyebut = this.penyebut * r.pembilang;
        Rasional hasil = new Rasional(newPembilang, newPenyebut);
        hasil.Sederhana();
        return hasil;
    }
}



