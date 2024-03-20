package TesEncapsulasi;

public class Test {
    public static void main(String [] args) {
    Student s1 = new Student();
    s1.setName("Enkapsulasi");
    // No. 1 before 
    // s1.setMark("90");
    // After
    s1.setMark(90);
    // No. 1 before
    // System.out.println("s1Name is "+s1.setName());
    // After
    System.out.println("s1Name is "+s1.getName());
    // No. 1 before
    // System.out.println("s1Mark is "+s1.setMark());
    // After 
    System.out.println("s1Mark is "+s1.getMark());
    // No. 1 before
    // System.out.println("name dan mark "+name+" "+mark);
    // After
    System.out.println("name dan mark "+s1.getName()+" "+s1.getMark());
    }
   }
   
