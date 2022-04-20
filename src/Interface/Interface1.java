package Interface;

public interface Interface1 {

    public static final int SAYI1=20;
    static final int SAYI2=10;
    final int SAYI3=5;
    int SAYI4=0;

    void inter1a();
    abstract void inter1b();
    void inter1c();
    default void inter1d(){

    }

    static void inter1e(){

    }
}
