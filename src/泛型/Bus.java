package 泛型;

public class Bus extends Vehicle{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Bus(int speed, String color, int price) {
        super(speed, color);
        this.price = price;
    }
}
