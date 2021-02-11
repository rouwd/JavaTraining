import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int intSum = 0;
        int count = 0;
        long average = 0l;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                intSum += scanner.nextInt();
                count++;
            } else {
                break;
            }

            if(count > 0){
                average = Math.round( (double) intSum / (double) count);
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + intSum + " AVG = " + average);
        scanner.close();
    }

}
