package chapter9.exercise;

public class TasteTester {

    public static void main(String[] args){

        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);

        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake bCake = new BirthdayCake();
        bCake.setFlavor("Buttermilk");
        bCake.setPrice(19.99);

        System.out.println("Cake flavor: " + bCake.getFlavor());
        System.out.println("Cake price: " + bCake.getPrice());

        WeddingCake wCake = new WeddingCake();
        wCake.setFlavor("Vanilla");

        System.out.println("Cake flavor: " + wCake.getFlavor());
        System.out.println("Cake price: " + wCake.getPrice());




    }
}
