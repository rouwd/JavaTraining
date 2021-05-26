package dan.rouw;

public class AddOn {
    private String name;
    private boolean included;
    private double price;
    private boolean isRemovable;

    public AddOn(String name, boolean included, double price) {
        this.name = name;
        this.included = included;
        this.price = price;
    }

    public void add() {
        this.included = true;
    }

    public void remove() {
        this.included = false;
    }

    public String getName() {
        return name;
    }

    public boolean isIncluded() {
        return included;
    }

    public double getPrice() {
        return price;
    }
}
