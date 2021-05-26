import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] userIntegers = new int[number];

        System.out.println("Enter " + number + " integers\r");
        for(int i=0; i<userIntegers.length; i++){
            userIntegers[i] = scanner.nextInt();
        }
        scanner.close();

        return userIntegers;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];

        Arrays.sort(unsortedArray);

        for(int i = 0; i <  unsortedArray.length; i++) {
            int sortedIndex = unsortedArray.length - 1 - i;
            sortedArray[sortedIndex] = unsortedArray[i];
        }
        return sortedArray;
    }
}
