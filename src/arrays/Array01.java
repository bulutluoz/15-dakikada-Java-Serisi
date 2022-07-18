package arrays;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        int sayilar[] =new int[6];

        String str="Java, cok guzel.";

        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, cok, guzel]

        String[] kelimeler2= str.split("a");
        System.out.println(Arrays.toString(kelimeler2)); //[J, v,  cok guzel]

        String[] kelimeler3= str.split("cok");
        System.out.println(Arrays.toString(kelimeler3));

        String[] kelimeler4= str.split("");
        System.out.println(Arrays.toString(kelimeler4));

        int[] sayilar1= {1,2,3};



    }
}
