public class Main {

    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        int[] myIntegers = sortedArray.getIntegers(6);
        sortedArray.printArray(myIntegers);

        int[] mySortedIntegers = new int[6];
        mySortedIntegers = sortedArray.sortIntegers(myIntegers);
        sortedArray.printArray(mySortedIntegers);

    }

}
