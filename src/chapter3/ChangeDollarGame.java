package chapter3;

import java.util.Scanner;

public class ChangeDollarGame {

    public static void main(String args[]){

    // Initialize what we know

    int value_quarter = 25;
    int value_dime = 10;
    int value_nickel = 5;
    int expected_result = 100;
    int result;
    int difference_result;

    // Ask for items we don't know
    System.out.println("How many quarters would you like to add?");
    Scanner scanner = new Scanner(System.in);
    int quarters = scanner.nextInt();
    System.out.println("How many dimes would you like to add?");
    int dimes = scanner.nextInt();
    System.out.println("How many nickels would you like to add?");
    int nickels = scanner.nextInt();
    System.out.println("How many pennies would you like to add?");
    int pennies = scanner.nextInt();
    scanner.close();
    // Calculate the value
    result = quarters * value_quarter + dimes * value_dime + nickels * value_nickel + pennies;
    difference_result = expected_result - result;
    // Make a decision
        if (difference_result==0){
            System.out.println("Well done! You won");
        }
        else if(difference_result > 0){
            System.out.println("You lost! You are short by " + difference_result + " pennies");
        }
        else{
            difference_result = difference_result * -1;
            System.out.println("You lost! You gave " + difference_result + " pennies too much.");
        }

    }

}
