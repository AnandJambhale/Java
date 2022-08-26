package lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Properties");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void hey(){
        System.out.println("Inside init method");
    }
    public void hello(){
        System.out.println("In destroy method");
    }
}
