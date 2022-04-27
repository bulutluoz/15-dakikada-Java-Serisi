package dosyaOkuma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class dosyaOkuma {
    public static void main(String[] args) throws IOException {
        // Listede kac baslik ve
        // bu basliklar altinda kac urun oldugunu bulalim

        String path="src/dosyaOkuma/urunler.txt";
        FileInputStream fis = new FileInputStream(path);

        int kontrol=0;
        String metin="";
        while((kontrol=fis.read()) != -1){
            metin+= (char)kontrol;

        }

        int urunSayisi=0;
        String arr[]=metin.split("-");

        System.out.println("Urun sayisi : " + (arr.length-1));





        int baslikSayisi=0;
        int index=0;
        for (int i = 0; i <metin.length() ; i++) {
            char karakter=metin.charAt(i);
            if(i==0){
                if (Character.isDigit(karakter)){
                    baslikSayisi++;
                }
            }else {
               char oncekiKarakter=metin.charAt(i-1);
               if (Character.isDigit(karakter) && (!Character.isDigit(oncekiKarakter))){
                   baslikSayisi++;
               }
            }

        }

        System.out.println("Baslik sayisi : " + baslikSayisi);
    }

}
