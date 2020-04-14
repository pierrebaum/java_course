package chapter10.exercise;

public class Market {

    public static void main(String[] args){

        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();
        System.out.println("Calories: " + banana.getCalories());

    }
}
