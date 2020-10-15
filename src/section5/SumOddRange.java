package section5;

public class SumOddRange {
    public static boolean isOdd(int number) {
        return ((number % 2) != 0 && number > 0);
    }

    public static int sumOdd(int start,int end) {
        int sum=0;
        if (start <=0 || end <=0 || start>end)
            return -1;
        else
            for (int i=start;i<=end;i++) {
                if (isOdd(i))
                    sum +=i;
            }
        return sum;
    }
}