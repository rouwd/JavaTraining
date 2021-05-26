package dan.rouw;

public class Main {

    public static void main(String[] args) {
	    Hamburger plainBurger = new Hamburger("Plain Burger","Pretzel","beef", 7.00);

//	    plainBurger.printBill();
	    plainBurger.addCheese();
	    plainBurger.addBacon();
        plainBurger.printBill();

        HealthyBurger veggieBurger = new HealthyBurger("Black Bean", 8.00);

//        veggieBurger.addBacon();
        veggieBurger.printBill();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Angus Beef",9.00);

        deluxeBurger.removeCheese();
        deluxeBurger.addTomato();
        deluxeBurger.printBill();
    }
}
