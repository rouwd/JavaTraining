public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int tempNumber = Math.abs(number);

        while(tempNumber > 0) {
            reverseNumber *= 10;
            reverseNumber += tempNumber % 10;
            tempNumber /= 10;
        }

        if(number < 0) {
            reverseNumber *= -1;
        }

        return reverseNumber == number;
    }

}
