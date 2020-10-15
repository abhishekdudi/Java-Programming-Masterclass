package section5;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if (number <0)
            return -1;

        int sum = 0;
        int temp;

        while(number!=0) {
            temp = number % 10;
            if (temp % 2 == 0)
                sum += temp;
            number = number/10;
        }

        return sum;
    }
}
