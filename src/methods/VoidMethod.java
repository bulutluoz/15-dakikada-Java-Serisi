package methods;

import java.sql.SQLOutput;

public class VoidMethod {
    public static void main(String[] args) {
        /*
           Input olarak verilen satis fiyati, musteri karti var mi ?
           ve uyeligi kac yillik ? bilgilerini degerlendirip
           - uye degilse : %5 indirim
           - uyeligi var ama 5 yildan az ise %10 indirim
           - uyeligi var ve 5 yildan cok ise %15 indim uygulayip
           asil fiyati, indirim miktarini ve indirimli fiyati yazdiran bir method olusturun
         */

        boolean uyeMi=false;
        int uyelikYili=13;
        double satisFiyati=250;

        indirimliFiyatHesapla(uyeMi,uyelikYili,satisFiyati);




    }

    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satisFiyati){
        if (uyeMi){
            if (uyelikYili<5){
                System.out.println("Urun fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati*0.1);
                System.out.println("Indirimli fiyat : " + (satisFiyati-satisFiyati*0.1));
            }else {
                System.out.println("Urun fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati*0.15);
                System.out.println("Indirimli fiyat : " + (satisFiyati-satisFiyati*0.15));
            }

        }else {
            System.out.println("Urun fiyati : " + satisFiyati);
            System.out.println("Indirim Miktari : " + satisFiyati*0.05);
            System.out.println("Indirimli fiyat : " + (satisFiyati-satisFiyati*0.05));
        }

    }

}
