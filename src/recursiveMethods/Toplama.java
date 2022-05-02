package recursiveMethods;

public class Toplama {
    public static void main(String[] args) {

        int input=5;
        int sonuc=topla(input);
        System.out.println(sonuc);

    }

    private static int topla(int input) {

        if (input==1){
            return 1;
        }else{
            return input+topla(input-1);
        }
    }
}
