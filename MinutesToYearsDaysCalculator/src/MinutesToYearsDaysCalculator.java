public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long minutesInADay = 60 * 24;
        long minutesInAYear = minutesInADay * 365;
        long years = minutes / minutesInAYear;
        long days = (minutes - years * minutesInAYear) / minutesInADay;
        System.out.println(minutes + " min = " +
                years + " y and " +
                days + " d");
    }
}
