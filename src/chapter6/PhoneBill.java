package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int minutesAllotted;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        minutesAllotted = 600;
        minutesUsed = 600;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        minutesAllotted = 600;
        minutesUsed = 600;

    }

    public PhoneBill(int id, double baseCost, int minutesAllotted, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.minutesAllotted = minutesAllotted;
        this.minutesUsed = minutesUsed;
    }

    //Getter
    public int getId() {
        return id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public int getMinutesAllotted() {
        return minutesAllotted;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setMinutesAllotted(int minutesAllotted) {
        this.minutesAllotted = minutesAllotted;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        double pricePerMinute = 0.25;
        double price;
        if (minutesAllotted >= minutesUsed ){
            return 0;
            }
        price = (minutesUsed - minutesAllotted) * pricePerMinute;
        return price;

    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return calculateOverage() + calculateTax() + baseCost;
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
