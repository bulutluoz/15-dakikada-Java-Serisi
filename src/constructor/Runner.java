package constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {




        Ogretmen ogr1=new Ogretmen();

        ogr1.isim="Ali";
        ogr1.soyisim="Can";

        System.out.println(ogr1.isim); // Ali
        System.out.println(ogr1.soyisim); // Can
        System.out.println(ogr1.brans); // brans belirtilmedi

        Ogretmen ogr2=new Ogretmen();

        System.out.println("ogretmen 2 isim : "+ogr2.isim); // Hasan
        System.out.println("ogretmen 2 soyisim : "+ogr2.soyisim); // Kul
        System.out.println("ogretmen 2 brans : "+ogr2.brans); // Matematik

        Ogretmen ogr3=new Ogretmen("Veli","Cem","Kimya");

        System.out.println("ogretmen 3 isim : "+ogr3.isim); // Veli
        System.out.println("ogretmen 3 soyisim : "+ogr3.soyisim); // Cem
        System.out.println("ogretmen 3 brans : "+ogr3.brans); // Kimya





    }
}
