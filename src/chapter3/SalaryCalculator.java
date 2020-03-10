package chapter3;

/*
If statement.
All salespeople get payment of $1000 a week.
Salespeople who exceed 10 sales get an bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]) {

        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // get the values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        //Quick detour for bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        // Output
        System.out.println("The employee's is $" + salary);
    }
}
