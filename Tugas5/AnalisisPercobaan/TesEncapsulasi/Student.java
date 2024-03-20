package TesEncapsulasi;

public class Student {
    private String name;
    private int mark;
    // No. 2 ketika diubah menjadi private, maka nilai Test.java tidak dapat memasukkan nilai name pada objek s1
    // No. 4 ketika sudah ditaruh ke dalam package yang sama, maka encapsulasi tetap berpengaruh
    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public void setMark(int m){
        mark=m;
    }

    public int getMark(){
        return mark;
    }
}

