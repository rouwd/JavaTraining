package dan.rouw;

public class HealthyBurger extends Hamburger {
    private AddOn avacado;
    private AddOn spinich;

    public HealthyBurger(String meat, double price) {
        super("Veggie Burger", "Brown Rye", meat, price);
        this.avacado = new AddOn("Avacado",true,1.00);
        this.spinich = new AddOn("Spinich",true, 0.65);
        this.addLettuce();
        this.addTomato();
    }

    @Override
    public void addBacon() {
        System.out.println("You cannot add bacon to the Veggie Burger");
    }

    @Override
    public void printAdditionalItems() {
        super.printAdditionalItems();
        if( this.avacado.isIncluded() ) {
            addItemToBill(this.avacado.getName(), this.avacado.getPrice(), true);
            this.totalCost += this.avacado.getPrice();
        }
        if( this.spinich.isIncluded() ) {
            addItemToBill(this.spinich.getName(), this.spinich.getPrice(), true);
            this.totalCost += this.spinich.getPrice();
        }
    }
}
