package methods;

import java.util.Scanner;

public class islemMerkezi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz tamsayiyi girin");
        int input= scan.nextInt();

        System.out.println("istediginiz islemin numarasini girin" +
                "\n1-Asal sayi mi kontrol et" +
                "\n2-Fibonacci sayisi mi kontrol et" +
                "\n3-palindrome mu kontrol et" +
                "\n4-Tam bolenlerini listele" +
                "\n5-Faktoryel degerini bul" +
                "\n6-Mutlak degerini hesapla");
        int tercih= scan.nextInt();

    }




}



