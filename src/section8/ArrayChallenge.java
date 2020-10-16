package section8;

import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        System.out.println("Entered values: ");
        printArray(myIntegers);

        System.out.println("After Sorting: ");
        sortIntegers(myIntegers);

    }

    private static void sortIntegers(int[] myIntegers) {
        int len = myIntegers.length;
        int[] sortedArray = new int[len];
        int k = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+ 1; j < len; j++) {
                if(myIntegers[i] < myIntegers[j]) {
                    int temp = myIntegers[i];
                    myIntegers[i] = myIntegers[j];
                    myIntegers[j] = temp;
                }
            }
            sortedArray[i] = myIntegers[i];
        }
        sortedArray[len - 1] = myIntegers[len -1];

//        Arrays.sort(myIntegers);
//        int[] sortedArray = Arrays.copyOf(myIntegers, len);

        printArray(sortedArray);
    }

    private static void printArray(int[] myIntegers) {

        for (int myInteger : myIntegers) {
            System.out.println(myInteger);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter values: ");
        int[] values = new int[number];

        for (int j = 0; j < number; j++) {
            values[j] = scanner.nextInt();
        }

        return values;
    }

}