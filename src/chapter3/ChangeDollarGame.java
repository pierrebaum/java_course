package chapter3;

import java.util.Scanner;

public class ChangeDollarGame {

    public static void main(String args[]){

    // Initialize what we know

    double value_quarter = 0.25;
    double value_dime = 0.10;
    double value_nickel = 0.05;
    double value_penny = 0.01;
    int dollar = 1;

    // Ask for items we don't know
        System.out.println("Welcome to 'Change for a Dollar'!" +
                "Your goal is to enter enough change to make exactly $1.00");
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
    double result = quarters * value_quarter + dimes * value_dime + nickels * value_nickel + pennies * value_penny;

    // Make a decision
        if (result < dollar){
            double result_short = dollar - result;
            System.out.println("You lost! You are short by $" + String.format("%.2f", result_short));
        }
        else if(result > dollar){
            double result_over = result - dollar;
            System.out.println("You lost! You gave $" + String.format("%.2f", result_over) + " too much");
        }
        else{
            System.out.println("Well done! You won");
        }

    }

}
