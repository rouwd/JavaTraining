public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many Integers do you want to enter? ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//        int count = MinumumElement.readInteger();

        int[] myIntegers = MinimumElement.readElements(3);
        int min = MinimumElement.findMin(myIntegers);

        System.out.println("The minimum element is " + min);

//        scanner.close();
    }
}
