package section5;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        long avg;

        while (sc.hasNextInt()) {
            number = sc.nextInt();
            sum += number;
            count += 1;
        }
        avg = Math.round((double)sum/count);
        System.out.println("SUM = "+ sum + " AVG = " + avg);
    }
}