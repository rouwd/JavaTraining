package dan.rouw;

public class Hamburger {
    private String name;
    private String bun;
    private String meat;
    private double price;
    private AddOn lettuce;
    private AddOn tomato;
    private AddOn bacon;
    private AddOn cheese;
    protected String bill = "";
    protected double totalCost = 0;

    public Hamburger(String name, String bun, String meat, double price) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;

        this.lettuce = new AddOn("Lettuce",false,0.50);
        this.tomato = new AddOn("Tomato",false,0.75);
        this.bacon = new AddOn("Bacon",false,1.00);
        this.cheese = new AddOn("Cheese",false,0.50);
    }

    public void addLettuce(){
        this.lettuce.add();
    }

    public void removeLettuce(){
        this.lettuce.remove();
    }

    public void addTomato(){
        this.tomato.add();
    }

    public void removeTomato(){
        this.tomato.remove();
    }

    public void addBacon(){
        this.bacon.add();
    }

    public void removeLBacon(){
        this.bacon.remove();
    }

    public void addCheese(){
        this.cheese.add();
    }

    public void removeCheese(){
        this.cheese.remove();
    }

    public void printBill() {
        addItemToBill(this.name, this.price, false);
        this.totalCost = this.price;
        printBillDetail();
        System.out.println(this.bill);
    }

    private void printBillDetail() {
        printAdditionalItems();
        this.bill += "Total Cost: " + this.totalCost + "\n\n";
    }

    public void printAdditionalItems() {
        if( this.lettuce.isIncluded() ) {
            addItemToBill(this.lettuce.getName(), this.lettuce.getPrice(), true);
            this.totalCost += this.lettuce.getPrice();
        }
        if( this.tomato.isIncluded() ) {
            addItemToBill(this.tomato.getName(), this.tomato.getPrice(), true);
            this.totalCost += this.tomato.getPrice();
        }
        if( this.bacon.isIncluded() ) {
            addItemToBill(this.bacon.getName(), this.bacon.getPrice(), true);
            this.totalCost += this.bacon.getPrice();
        }
        if( this.cheese.isIncluded() ) {
           addItemToBill(this.cheese.getName(), this.cheese.getPrice(), true);
            this.totalCost += this.cheese.getPrice();
        }
    }

    protected void addItemToBill(String item, double price, boolean isAddOn) {
        if( isAddOn ) {
            this.bill += "Add ";
        }
        this.bill += item + ": " + price + "\n";
    }

}
