package exeption;

public class Exceptions {

    public static void main(String[] args) {
        int a= 10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Kod calismaya devam ediyor");
    }


}
