public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        double firstFormatted;
        if (firstNumber < 0) {
            firstFormatted = Math.ceil(firstNumber * 1000.0);
        } else {
            firstFormatted = Math.floor(firstNumber * 1000.0);
        }
        double secondFormatted;
        if (secondNumber < 0) {
            secondFormatted = Math.ceil(secondNumber * 1000.0);
        } else {
            secondFormatted = Math.floor(secondNumber * 1000.0);
        }

        return firstFormatted == secondFormatted;
    }

}
