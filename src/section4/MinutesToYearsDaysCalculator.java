package section4;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {

        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            long years = minutes/525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes/(24 * 60);
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}