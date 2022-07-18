package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListeyeListeEklemeSilme {
    public static void main(String[] args) {

        List<String> isimler1 = new ArrayList<>();

        isimler1.add("Ali");
        isimler1.add("Veli");
        System.out.println("Isimler 1 : "+isimler1);
        List<String> isimler2 = new ArrayList<>();

        isimler2.add("Ayse");
        isimler2.add("Fatma");
        System.out.println("Isimler 2 : "+isimler2);

        List<String> isimler3 = new ArrayList<>();

        isimler3.add("Ayse");
        isimler3.add("Veli");
        System.out.println("Isimler 3 : "+isimler3);

        isimler1.addAll(isimler2);
        System.out.println(isimler1);

        isimler1.removeAll(isimler3);
        System.out.println(isimler1);
    }
}
