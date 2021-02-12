package dan.rouw;

public class Vehicle {
    private int steering;
    private int gear;
    private int speed;
    private String color;

    public Vehicle(int steering, int gear, int speed, String color) {
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
        this.color = color;
    }

    public void move(int speed) {
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

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
}
