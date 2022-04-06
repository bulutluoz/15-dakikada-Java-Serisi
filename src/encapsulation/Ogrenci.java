package encapsulation;

public class Ogrenci {
    public String isim;
    private String soyisim;

    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    } }

class ogrenciIsleri {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.isim="Hasan";
        System.out.println(ogr1.isim); // Hasan

        Ogrenci ogr2=new Ogrenci();
        ogr2.setSoyisim("Kalem");
        System.out.println(ogr2.getSoyisim()); // Kalem
    }}






