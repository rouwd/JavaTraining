public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true,1));
        System.out.println(BarkingDog.shouldWakeUp(false,2));
        System.out.println(BarkingDog.shouldWakeUp(true,22));
        System.out.println( BarkingDog.shouldWakeUp(true,-1));
    }
}
