package methods;

public class ReturnMethod {
    public static void main(String[] args) {
        /*
         Input olarak verilen isim ve soyismi
         ilk harfleri buyuk, diger harfler kucuk olarak degistirip
         programin sonraki bolumlerinde kullanabilmek uzere
         isimSoyisim variable'ina atayacak bir method olusturun
         input - Isim : ALI, Soyisim: CAN
         Output- isimSoyisim : Ali Can seklinde kayit
         */

        String isim="semra";
        String soyisim= "koca";

        String isimSoyisim= isimDuzenle(isim,soyisim);

        System.out.println("ilk girilen : " + isim + " " + soyisim);
        System.out.println("Degistirilmis hali : " + isimSoyisim);

    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                               isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+
                                  soyisim.substring(1).toLowerCase();

        return isimDuzenlenmis + " " +soyisimDuzenlenmis;

    }
}
