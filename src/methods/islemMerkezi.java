package methods;

import java.util.Scanner;

public class islemMerkezi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz 2 tamsayi girin");
        int input1= scan.nextInt();
        int input2= scan.nextInt();

        int sonuc=topla(input1,input2);

        System.out.println("istediginiz islemin numarasini girin" +
                "\n1-Asal sayi mi kontrol et" +
                "\n2-Fibonacci sayisi mi kontrol et" +
                "\n3-palindrome mu kontrol et" +
                "\n4-Faktoryel degerini bul" +
                "\n5-Tam bolenleri kac tane");
        int tercih= scan.nextInt();

        switch (tercih){
            case 1:
                asalMi(sonuc);
                break;
            case 2 :
                fibonacciMi(sonuc);
                break;
            case 3 :
                palindromeMu(sonuc);
                break;
            case 4:
                faktoryelHesapla(sonuc);
                break;
            case 5:
                tamBolenSayisiBul(sonuc);
                break;
            default:
                System.out.println("lutfen gecerli bir tercih giriniz");

        }

    }

    private static void tamBolenSayisiBul(int sonuc) {
        int tamBolenSayisi=2;
        for (int i = 2; i <=sonuc ; i++) {

            if (sonuc%i==0){
                tamBolenSayisi+=2;
            }
        }
        System.out.println("Girilen iki sayinin toplami :" + sonuc);
        System.out.println(sonuc+ " sayisinin "+tamBolenSayisi+ " tane tam boleni vardir");
    }

    private static void faktoryelHesapla(int sonuc) {
        int faktoryel=1;
        if (sonuc<0 || sonuc>10){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi icin faktoryel hesaplanamiyor");
        } else if(sonuc==0 || sonuc==1){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi icin faktoryeli : "+ 1);
        } else{
            for (int i = 1; i <=sonuc ; i++) {
                faktoryel *=i;
            }
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi icin faktoryeli : "+ faktoryel);
        }
    }

    private static void palindromeMu(int sonuc) {
        String sonucStr=sonuc +"";
        String tersSonucStr="";
        for (int i = 0; i <sonucStr.length() ; i++) {
            tersSonucStr +=sonucStr.substring(i,i+1);
        }

        if (sonucStr.equals(tersSonucStr)){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi  palindrome");
        }else {
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi  palindrome degil");
        }
    }

    private static void fibonacciMi(int sonuc) {
        int f1=0;
        int f2=1;
        int temp=0;

        if (sonuc<0){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " negatif oldugundan fibonacci sayisi olamaz");
        }else if (sonuc==0 ||sonuc==1){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " fibonacci sayisi");
        } else{
            boolean flag=false;
            while(sonuc>=temp){
                temp=f1+f2;
                f2=f1;
                f1=temp;
                if (temp==sonuc){
                    System.out.println("Girilen iki sayinin toplami :" + sonuc);
                    System.out.println(sonuc + " fibonacci sayisi");
                    flag=true;
                }
            }
            if (!flag){
                System.out.println("Girilen iki sayinin toplami :" + sonuc);
                System.out.println(sonuc + " fibonacci sayisi degil");
            }

        }
    }

    private static void asalMi(int sonuc) {
        boolean flag=true;
        if (sonuc<2){
            System.out.println("Girilen iki sayinin toplami :" + sonuc);
            System.out.println(sonuc + " sayisi asal sayi degil");
        }else {
            for (int i = 2; i <sonuc ; i++) {
                if (sonuc%i ==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.println("Girilen iki sayinin toplami :" + sonuc);
                System.out.println(sonuc + " sayisi asal sayi");
            }else{
                System.out.println("Girilen iki sayinin toplami :" + sonuc);
                System.out.println(sonuc + " sayisi asal sayi degil");
            }
        }
    }

    private static int topla(int input1, int input2) {
        return input1+input2;
    }


}





