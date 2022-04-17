package abstractClasses;

public abstract class Personel {
    static final String sirketIsmi="Yildiz Celik";
    static final String sirketAdresi="Ankara / TURKEY";

    protected String isim= "Deger Girilmemis";
    protected String soyisim= "Deger Girilmemis";
    protected String tcNo= "Deger Girilmemis";
    protected String telefon="Deger Girilmemis";
    protected String iseBaslamaTarihi="Deger Girilmemis";
    protected String sigortaNo="Deger Girilmemis";
    static int personelSayac=1000;

    protected String personelNo;

    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }




}
