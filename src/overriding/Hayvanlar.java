package overriding;

public class Hayvanlar {
    protected boolean gorurMu=true;
    protected void ureme(){
        System.out.println("Tum hayvanlar ureme ile cogalir");
    }
    protected void beslenme(){
        System.out.println("Tum hayvanlar beslenir");
    }
    protected void hareket(){
        System.out.println("Hayvanlar hareket eder");
    }
    protected void solunum(){
        System.out.println("Hayvanlar nefes alir");
    }
}


