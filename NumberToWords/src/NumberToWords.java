public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int numberLen = getDigitCount(number);
        int numberReversed = reverse(number);
        int numberReversedLen = getDigitCount(numberReversed);

        while(numberReversed != 0) {
            int nextNumber = numberReversed % 10;
            switch (nextNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            numberReversed /= 10;
        }
        for(int i = numberReversedLen; i < numberLen; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int result = 0;
        int posNumber = Math.abs(number);
        while (posNumber > 0) {
            result *= 10;
            result += posNumber % 10;
            posNumber /= 10;
        }
        return number < 0 ? result * -1 : result;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else if (number < 10) {
            return 1;
        }
        int count = 0;
        while(number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
