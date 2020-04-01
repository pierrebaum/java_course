package chapter6;

/*
Write a class that creates instances of the Recangle class to find the
total area of the two rooms
 */

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathrom = calculator.getRoom();

        double area = calculator.caculateTotalArea(kitchen, bathrom);

        calculator.scanner.close();

        System.out.println("The total area is: " + area);

    }
    public Rectangle getRoom(){

        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);

    }
    public double caculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){

        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
