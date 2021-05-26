import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("How many Integers do you want to enter? ");
        int count = s1.nextInt();
        s1.nextLine();

        s1.close();

        return count;
    }

    private static int[] readElements(int count) {
        Scanner s2 = new Scanner(System.in);
        int[] myArray = new int[count];

        System.out.println("Enter " + count + " Integers\r");
        for(int i=0; i<count; i++) {
            myArray[i] = s2.nextInt();
            s2.nextLine();
        }

        s2.close();
        return myArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
