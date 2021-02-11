public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int half = number / 2;
        int factorSum = 0;

        for(int i=1; i <= half; i++) {
            if(number % i == 0) {
                factorSum += i;
            }
        }
        return factorSum == number;
    }

}
