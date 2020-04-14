package chapter10.exercise;

public class Banana extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made.");
    }

    public Banana(){
        setCalories(120);

    }

    public void peel(){
        System.out.println("The banana is peeled.");
    }
}
