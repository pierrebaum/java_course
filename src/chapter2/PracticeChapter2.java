package chapter2;

import java.util.Scanner;

public class PracticeChapter2 {

    public static void main(String[] args) {


        //1. Enter a season of a year

        System.out.println("Enter a season of a year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Enter a whole number

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Enter an adjective

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        //4. output
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum number of " + number + " cups of coffee");
    }
}
