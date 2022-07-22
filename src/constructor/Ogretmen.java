package constructor;

public class Ogretmen {

    public Ogretmen(){
        isim="Hasan";
        soyisim="Kul";
        brans="Matematik";
    }

    public Ogretmen(String isim, String soyisim,String brans){
        this.isim=isim;
        this.soyisim=soyisim;
        this.brans=brans;
    }

    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String brans="brans belirtilmedi";


    public Ogretmen(String isim,String soyisim){
        this.isim=isim;
    }
}



