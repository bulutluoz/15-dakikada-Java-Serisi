package abstractClasses;

public class Isci extends Muhasebe{


    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "sirket ismi=" + sirketIsmi +
                ", saatUcreti=" + saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Isci isci1=new Isci();
        isci1.saatUcreti= isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.maas= isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.isim="Hasan";
        isci1.soyisim="Can";
        System.out.println(isci1);
    }
}
