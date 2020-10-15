package section5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first<10 || second<10)
            return -1;

        int gcd = 0;
        int smaller = first;

        if (first > second)
            smaller = second;

        for (int i=1;i<=smaller;i++) {
            if (first%i==0 && second%i==0)
                gcd = i;
        }

        return gcd;
    }
}