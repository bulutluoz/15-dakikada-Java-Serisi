package abstractClasses;

public class Isci extends Muhasebe {

    @Override
    public String toString() {
        return "Isci{" +
                "sirketIsmi=" + sirketIsmi +
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
        isci1.aylikCalismaSuresi=isci1.aylikCalismaSuresi();
        isci1.iseBaslamaTarihi="10.04.2022";
        isci1.isim="Mehmet";
        isci1.saatUcreti= isci1.saatUcreti();
        isci1.maas=isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.personelNo=isci1.personelNo();
        isci1.sigortaNo="123456";
        isci1.soyisim="Bulutluoz";
        isci1.tcNo="2365478965";
        System.out.println(isci1);


    }


    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }









}
