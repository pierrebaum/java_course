package chapter7;

import java.util.Scanner;

public class WeekDay {

    public static String[] week = new String[]{"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
    public static int dayNumber;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int dayNumber = getDayNumber();
        String day = getWeekDay(dayNumber);
        scanner.close();

        System.out.println("You entered # "+ dayNumber + " the name of this day is: " + day);


    }

    public static String getWeekDay(int dayNumber){

        int arrayIndex = dayNumber - 1;
        return week[arrayIndex];
    }

    public static int getDayNumber(){

        System.out.print("Please enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        return dayNumber;
    }
}
