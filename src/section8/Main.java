package section8;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        double[] myDoubleArray = new double[5];
//        myDoubleArray[3] = 5;

//        for (int i=0;i < myIntArray.length; i++) {
//            System.out.println(myIntArray[i]);
//          }

        int[] myIntegers = getIntegers(5);
        for (int myInteger : myIntegers) {
            System.out.println(myInteger);
        }

        System.out.println("Average: "+ getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter values: ");
        int[] values = new int[number];

        for (int j = 0; j < number; j++) {
            values[j] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum/(double)array.length;
    }
}
