package dan.rouw;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Dan";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player2 = new EnhancedPlayer("Dan", 200, "Sword");
//        System.out.println("Initial health is " + player2.getHealth());

//        Printer printer1 = new Printer(75,true);
//        Printer printer2 = new Printer(100,false);

//        printer1.print(2);
//        printer2.print(10);
//        printer1.print(50);
//        printer1.fillToner();
//        printer1.print(50);

        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
