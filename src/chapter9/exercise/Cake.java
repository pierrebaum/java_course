package chapter9.exercise;

public class Cake {

    private double price;
    private String flavor;

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
