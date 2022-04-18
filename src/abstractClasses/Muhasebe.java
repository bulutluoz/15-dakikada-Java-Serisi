package abstractClasses;

public abstract class Muhasebe extends Personel{
    protected int saatUcreti;
    protected int aylikCalismaSuresi;
    protected int maas;

    protected abstract int saatUcreti();
    protected abstract int aylikCalismaSuresi();

    protected int maas(int saatUcreti,int aylikCalismaSuresi) {
        int maas= saatUcreti*aylikCalismaSuresi;
        return maas;
    }
}
