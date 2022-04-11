package polymorphism;

public class ToyotaBenzinli extends Toyota{
    public void motor(){
        System.out.println("Toyota Benzinli araclar 1.4 cevreci motor kullanir");
    }

    public void yakit(){
        System.out.println("Toyota Benzinli araclar E10 benzin kullanilir");
    }

    public void yakit(Double maxTuketim){

        System.out.println("Toyota Benzinli araclar ortalama 6.8  lt benzin kullanilir");

        if (maxTuketim>6.8){
            System.out.println("benzinli bir Toyota alabilirsiniz");
        } else {
            System.out.println("Isteginize uygun benzinli bir Toyota bulamazsiniz");
        }

    }



    }

