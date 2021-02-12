package dan.rouw;

public class Car extends Vehicle {
    private String make;
    private int wheels;

    public Car(String color, String make, int wheels) {
        super(1, 1, 0, color);
        this.make = make;
        this.wheels = wheels;
    }

    public void accelerate(int amount) {
        this.setSpeed(this.getSpeed() + amount);
    }

    public void decelerate(int amount) {
        this.setSpeed(this.getSpeed() - amount);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
