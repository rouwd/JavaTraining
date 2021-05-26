import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int a = 0;
        int b = array.length-1;

        System.out.println("Array = " + Arrays.toString(array));

        while ( a < b ) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            a++;
            b--;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
