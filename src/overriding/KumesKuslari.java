package overriding;

public class KumesKuslari extends Kuslar{
    protected void hareket(){
        System.out.println("Ucamazlar,yururler");
    }

    public static void main(String[] args) {

        KumesKuslari kumes1= new KumesKuslari();
        kumes1.hareket(); // KumesKuslari
        System.out.println(kumes1.gagasiVarMi); // Kuslar
        System.out.println(kumes1.gorurMu); // Hayvanlar
        kumes1.beslenme(); // Hayvanlar
        //System.out.println(kumes1.pencesiVarmi); // KumesKuslari ve parent class'larinda olmadigindan CTE verir

        Kuslar kus1=new Kuslar();
        System.out.println(kus1.gagasiVarMi); // Kuslar
        kus1.beslenme();// Hayvanlar
        kus1.hareket(); // Hayvanlar
        // System.out.println(kus1.pencesiVarmi); //Kuslar ve parent class'larinda olmadigindan CTE verir

        Kuslar kumes2= new KumesKuslari();
        kumes2.hareket(); // KumesKuslari
        kumes2.beslenme(); // Hayvanlar
        kumes2.ureme();// Kuslar
        kumes2.solunum();// Kuslar
        System.out.println(kumes2.gagasiVarMi); // Kuslar
        System.out.println(kumes2.gorurMu); // hayvanlar
        //System.out.println(kumes2.pencesiVarmi); // CTE

        Hayvanlar kumes3= new KumesKuslari();
        kumes3.beslenme();// Hayvanlar
        kumes3.hareket(); // KumesKuslari
        kumes3.solunum(); // Kuslar
        kumes3.ureme();// Kuslar
        //System.out.println(kumes3.gagasiVarmi); // CTE
        System.out.println(kumes3.gorurMu); // Hayvanlar
        //System.out.println(kumes3.pencesiVarmi); // CTE

        Hayvanlar kus2=new Kuslar();
        kus2.ureme();// Kuslar
        kus2.solunum(); // Kuslar
        kus2.hareket(); // Hayvanlar
        kus2.beslenme();// Hayvanlar

        System.out.println(kus2.gorurMu); // Hayvanlar
        // System.out.println(kus2.gagasiVarMi); // CTE
        // System.out.println(kus2.kanadiVarMi); // CTE
    }
}






