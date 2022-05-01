package okulProject;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do{
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "==============  ANA MENU ==============\n" +
                "\n" +
                "\t   1- Okul Bilgileri Goruntule\n" +
                "\t   2- Ogretmen Menu\n" +
                "\t   3- Ogrenci Menu\t\t \n" +
                "\t   Q- ÇIKIŞ\n");
        System.out.println("Lutfen Menuden tercihinizi yapiniz");
        tercih=scan.nextLine();

        switch (tercih){
            case "1" :  // Okul bilgileri
                Depo.okulBilgileriniYazdir();
                break;
            case "2" :  // Ogretmen menu
                Ogretmen.ogretmenMenu();
               break;
            case "3" :  // ogrenci menu
                Ogrenci.ogrenciMenu();
               break;
            case "q" :
            case "Q" :
                break;
            default  :
                System.out.println("Lutfen gecerli bir tercih giriniz");
        }


        }while(!tercih.equalsIgnoreCase("q"));


        Depo.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("============= YILDIZ KOLEJI =============\n"+
                "\t\t Adres : " + Okul.adres +
                "\n\t\t Telefon : " + Okul.telefon);
        Thread.sleep(5000);

    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);
    }
}
