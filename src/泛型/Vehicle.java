package 泛型;

public class Vehicle implements Comparable<Vehicle> {
    private int speed;
    private  String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.speed-o.speed;
    }
    public Vehicle(int speed,String color){
        this.speed=speed;
        this.color=color;
    }

}

