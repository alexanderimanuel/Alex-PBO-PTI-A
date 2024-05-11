public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    //upcasting
    Hero heroUp = (Hero)hero1;
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100);
    heroReg.display();
    //downcasting
    // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    // heroDown.display();
    //heroUp dikembalikan ke hero1
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting
    // Jawaban No. 3, ClassCastException (heroUp adalah HeroIntel, yang tidak kompatibel dengan HeroAgility)
    // HeroAgility hero3 = (HeroAgility) heroUp;
    // hero3.display();

    // Jawaban No. 4 (dapat diakses)
    HeroAgility heroAgility = new HeroAgility("AgilityHero", 100);
    System.out.println(heroAgility.type); // Akses langsung atribut type
    HeroIntel heroIntel = new HeroIntel("IntelHero", 100);
    System.out.println(heroIntel.type); // Akses langsung atribut type

    // Jawabaan No. 5
    // Membuat objek HeroMagic
    HeroMagic magicHero = new HeroMagic("Alex", 150);
    // Upcasting 
    Hero hero = magicHero;  // implisit
    hero.display();  
    // Downcasting 
    HeroMagic downcastedHeroMagic = (HeroMagic) hero; 
    downcastedHeroMagic.display(); 
    }
}

// jawaban no. 1 extends = mewarisi sifat dan perilaku dari kelas lain. HeroAgility dan HeroIntel adalah subclass yang mewarisi dari superclass Hero. Penggunaan extends memungkinkan kedua subclass ini untuk mengakses atau mengoverride metode dan variabel yang ada di superclass Hero
// super = untuk memanggil konstruktor, metode, atau mengakses variabel dari superclass. Dalam kode yang diberikan, super(name, health) dalam konstruktor HeroAgility dan HeroIntel digunakan untuk memanggil konstruktor dari superclass Hero.

// jawaban no. 2, konstruktor Hero, this.name dan this.health digunakan untuk merujuk pada variabel instance dari objek saat ini. 
// setter = metode setName dan setHealth, this.name dan this.health digunakan untuk menunjukkan bahwa nilai yang diteruskan ke setter harus ditetapkan ke variabel instance dari objek saat ini.
// getter = metode getName dan getHealth, this.name dan this.health digunakan untuk mengembalikan nilai dari variabel instance objek saat ini.

// jawaban no. 3 Java akan melempar ClassCastException karena heroUp tidak dapat di-cast ke HeroAgility. ClassCastException terjadi karena tipe runtime dari heroUp adalah HeroIntel, yang tidak kompatibel dengan HeroAgility