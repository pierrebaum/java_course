package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the overage minutes:");
        int overageMinutes = scanner.nextInt();


        printBill(baseCost, overageMinutes);


    }
    public static double calculateOveragePrice(int minutes){
        double pricePerMinute = 0.25;
        double price = minutes * pricePerMinute;
        return price;
    }

    public static void printBill(double plan, int minutes){
        double overagePrice = calculateOveragePrice(minutes);
        double tax = calculateTax(plan, overagePrice);
        double total = plan + overagePrice + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f",plan));

        System.out.println("Overage: $" + String.format("%.2f",overagePrice));

        System.out.println("Tax: $" + String.format("%.2f",tax));

        System.out.println("Total: $" + String.format("%.2f",total));

    }

    public static double calculateTax(double plan, double overage){
        double taxPercentage = 0.15;
        double tax = (plan + overage) * taxPercentage;
        return tax;
    }
}
