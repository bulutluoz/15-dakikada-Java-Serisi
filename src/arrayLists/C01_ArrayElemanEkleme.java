package arrayLists;

import java.util.Arrays;

public class C01_ArrayElemanEkleme {
    public static void main(String[] args) {
        // bir array'e element olarak 7yi ekleyelim

        int[] arr ={3,4,5,6};

        int[] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=7;

        arr=yeniArr;

        System.out.println(Arrays.toString(arr));
    }
}
