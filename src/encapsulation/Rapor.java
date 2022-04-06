package encapsulation;

public class Rapor {

    private int satisTutari;
    private int satisToplami;



    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
    }

    public int getSatisToplami() {
        return satisToplami;
    }

    public static void main(String[] args) {
        Rapor rapor = new Rapor();
        rapor.setSatisTutari(100);


        System.out.println(rapor.getSatisToplami());

    }

}



