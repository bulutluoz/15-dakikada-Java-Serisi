package overriding;

public class AvciKuslar extends Kuslar{
    protected boolean pencesiVarmi=true;
    protected void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    protected void beslenme(){
        System.out.println("Avci kuslar etle beslenir");
    }
}




