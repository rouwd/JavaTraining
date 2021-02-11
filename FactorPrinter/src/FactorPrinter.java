public class FactorPrinter {

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int half = number / 2;
        String factors = "";
        for(int i=1; i <=half; i++) {
            if(number % i == 0) {
                factors = factors + i + " ";
            }
        }
        factors += number;
        System.out.println(factors);
    }

}
