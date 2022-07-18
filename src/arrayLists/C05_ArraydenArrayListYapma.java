package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenArrayListYapma {

    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3,5,7,8,4,9,0,4,2,5,1,5,7};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each:arr
             ) {
            sayilar.add(each);
        }


        System.out.println(sayilar);

        String[] strArr={"a","b","c"};

        List<String> harfler= Arrays.asList(strArr);

        System.out.println(harfler);

        //harfler.add("f");
        //harfler.remove("a");

        System.out.println("Baslangicta strArr : " + Arrays.toString(strArr));
        System.out.println("Baslangicta harfler : " + harfler);

        strArr[0]="e";

        System.out.println("Array'i update ettigimizde strArr : " + Arrays.toString(strArr));
        System.out.println("Array'i update ettigimizde harfler : " + harfler);

        harfler.set(2,"t");

        System.out.println("List'i update ettigimizde strArr : " + Arrays.toString(strArr));
        System.out.println("List'i update ettigimizde harfler : " + harfler);

    }
}
