package chapter6;

public class PhoneBillCalculatorRedo {


    public static void main(String args[]){

        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }

}
