package overriding;

public class Kuslar extends Hayvanlar{
    protected boolean gagasiVarMi=true;
    protected boolean kanadiVarMi=true;
    protected void ureme(){
        System.out.println("Kuslar yumurta ile cogalir");
    }
    protected void solunum(){
        System.out.println("Kuslar akciger solunumu yapar");
    }
}




