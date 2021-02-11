public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }

        int largestPrimeFactor = 0;
        int loopEnd = number;
        for(int i=loopEnd; i >= 2; i--) {
            // if i is a factor
            if(i < largestPrimeFactor){
                continue;
            }
            if(number % i == 0) {
                // check if i is prime
                int factorCount = 0;
                for(int j=2; j <= i/2; j++) {
                    if(i % j == 0) {
                        factorCount++;
                        break;
                    }
                }
                if(factorCount == 0 && i > largestPrimeFactor){
                    largestPrimeFactor = i;
                }
            }
        }
        return largestPrimeFactor;
    }

}
