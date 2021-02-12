package dan.rouw;

public class Main extends Object {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal",1,1,5,5);
//
//        Dog dog = new Dog("Yorkie",8,20,2,3,1,1,"Long silky");
//        dog.eat();
//        dog.walk();
//        dog.run();

        Car ford = new Car("blue", "Ford", 4);
        Subaru legacy = new Subaru("silver",1,"Legacy");

        ford.accelerate(5);
        System.out.println("Ford speed: " + ford.getSpeed());
        ford.accelerate(25);
        System.out.println("Ford speed: " + ford.getSpeed());
        ford.decelerate(10);
        System.out.println("Ford speed: " + ford.getSpeed());

        legacy.disableEyeSight();
        System.out.println("Subaru eyeSight: " + legacy.getEyeSight());

        legacy.accelerate(75);
        System.out.println("Legacy speed: " + legacy.getSpeed());
    }
}
