public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int testNumber = Math.min(first,second);
        int factor = 1;

        for(int i = testNumber; i > 1; i--) {
            if(first % i == 0 && second % i == 0) {
                factor = i;
                break;
            }
        }

        return factor;
    }
}
