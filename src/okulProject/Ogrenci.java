package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Map<String,String> ogrenciMap = new HashMap<>();
    static Scanner scan=new Scanner(System.in);
    public static void feykOgrenciEkle(){
        ogrenciMap.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415","Alp, Yan, 2009, 3769, 11, A");
    }
public static void ogrenciMenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRENCI MENU ============\n" +
                    "\t   1- Ogrenci Listesi Yazdir\n" +
                    "\t   2- Soyisimden Ogrenci Bulma\n" +
                    "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ");
            tercih=scan.nextLine();
            switch (tercih){
                case "1" :
                    ogrenciListeYazdir();
                    break;
                case "2" : // Soyisimden Ogrenci Bulma
                    soyisimdenOgrenciBulma();
                    break;
                case "3" : // Sinif ve Sube Ile Ogrenci Bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4" : // Bilgilerini Girerek Ogrenci Ekleme
                    ogrenciEkle();
                    break;
                case "5" :
                    tcNoIleOgrenciSilme();
                    break;
                case "a" :
                case "A" :
                    Depo.anaMenu();
                    break;
                case "q" :
                case "Q" :
                    Depo.projeDurdur();
                    break;
                default  :
                    System.out.println("Lutfen gecerli bir tercih giriniz");
            }


        } while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();

}

    private static void tcNoIleOgrenciSilme() {
        System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci=scan.nextLine();

        String silinecekValue=ogrenciMap.get(silinecekOgrenci);


        String sonucValue= ogrenciMap.remove(silinecekOgrenci);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogrenci bulunamadi");
        }
    }

    private static void ogrenciEkle() {
        System.out.println("Tc no");
        String tcNo=scan.nextLine();
        System.out.println("Isim");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyisim=scan.nextLine();
        System.out.println("Dogum Yili");
        String dogumYili=scan.nextLine();
        System.out.println("Okul No");
        String okulNo=scan.nextLine();
        System.out.println("Sinif");
        String sinif=scan.nextLine();
        System.out.println("Sube");
        String sube=scan.nextLine();

        String key= tcNo;
        String value= isim+ ", " + soyisim +", "+ dogumYili + ", "+ okulNo + ", "+
                      sinif+", "+ sube;
        ogrenciMap.put(key,value);
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String,String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci sinifini yaziniz");
        String istenilenSinif=scan.nextLine();
        System.out.println("Istediginiz ogrenci subesini yaziniz");
        String istenilenSube=scan.nextLine();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each:  myEntrySet
        ) {

            String eachKey= each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            if(istenilenSinif.equalsIgnoreCase(eachValueArr[4]) && istenilenSube.equalsIgnoreCase(eachValueArr[5])){
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3],
                        eachValueArr[4],eachValueArr[5]);
            }

        }
        Thread.sleep(5000);
    }

    private static void soyisimdenOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String,String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci soymini yaziniz");
        String istenilenSoyisim=scan.nextLine();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each:  myEntrySet
        ) {

            String eachKey= each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            if(istenilenSoyisim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3],
                        eachValueArr[4],eachValueArr[5]);
            }

        }
        Thread.sleep(5000);

    }

    private static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each:  myEntrySet
             ) {

            String eachKey= each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3],
                    eachValueArr[4],eachValueArr[5]);

        }
        Thread.sleep(5000);
    }

}
