public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int firstNumber = 0;
        int lastNumber = 0;

        if( number < 10 ) {
            firstNumber = number;
            lastNumber = number;
        } else {
            lastNumber = number % 10;
            while(number >= 10) {
                number /= 10;
            }
            firstNumber = number;
        }

        return firstNumber + lastNumber;
    }

}
