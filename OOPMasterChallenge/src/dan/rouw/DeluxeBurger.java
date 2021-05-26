package dan.rouw;

public class DeluxeBurger extends Hamburger{
    private AddOn chips;
    private AddOn drink;

    public DeluxeBurger(String meat, double price) {
        super("Deluxe Burger", "Pretzel Roll", meat, price);
        this.chips = new AddOn("BBQ Chips",true,1.00);
        this.drink = new AddOn("Coke",true, 1.25);
        this.addLettuce();
        this.addBacon();
        this.addCheese();
    }

    @Override
    public void printAdditionalItems() {
        super.printAdditionalItems();
        addItemToBill(this.chips.getName(), this.chips.getPrice(), true);
        this.totalCost += this.chips.getPrice();

        addItemToBill(this.drink.getName(), this.drink.getPrice(), true);
        this.totalCost += this.drink.getPrice();
    }

    @Override
    public void removeLettuce() {
        System.out.println("You cannot remove lettuce from the Deluxe Burger");
    }

    @Override
    public void addTomato() {
        System.out.println("You cannot add tomato to the Deluxe Burger");
    }

    @Override
    public void removeLBacon() {
        System.out.println("You cannot remove bacon from the Deluxe Burger");
    }

    @Override
    public void removeCheese() {
        System.out.println("You cannot remove cheese from the Deluxe Burger");
    }
}
