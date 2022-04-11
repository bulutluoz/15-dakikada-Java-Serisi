package polymorphism;

public class CarSeller{

    public static void main(String[] args) {
        // overloading : ayni isim farkli signature ile ayni class'da birden
        // fazla method olusturmamiza imkan tanir
        CarSeller obj1=new CarSeller();
        obj1.yakit(); // CarSeller
        obj1.yakit(2020); //
        obj1.yakit(2010,5.3);

        // overriding : parent class'da var olan bir method'un
        // child class'da olusturulan ayni isim ve signature'a sahip
        // bir method tarafindan gecersiz kilinmasidir

        Toyota obj2 = new Toyota();
        obj2.yakit(); // Toyota

        Toyota obj3= new ToyotaBenzinli();
        obj3.yakit(); // ToyotaBenzinli

        Toyota obj4 = new ToyotaDizel();
        obj4.yakit(); // ToyotaDizel

        Toyota obj5 = new ToyotaElektrikli();
        obj5.yakit(); // ToyotaElektrikli
    }

    public void motor(){
        System.out.println("Musteri nasil motor isterse, buluruz");
    }

    public void yakit(){
        System.out.println("Musteri hangi yakit isterse, buluruz");
    }

    public void yakit(double maxTuketim){
        System.out.println("istediginiz " + maxTuketim + " lt ttuketime uygun arac buluruz ");
    }
    public void yakit(int yil){
        System.out.println("istediginiz model yili=" + yil + " sartina uygun arac buluruz ");
    }

    public void yakit(int yil,double maxTuketim){
        System.out.println("istediginiz yil ve max tuketime uygun arac buluruz");
    }
}
