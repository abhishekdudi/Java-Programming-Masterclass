package section5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a,int b,int c) {
        if (!(isValid(a) && isValid(b) && isValid(c)))
            return false;

        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;

        return (a1==b1 || b1==c1 || a1==c1);
    }

    public static boolean isValid(int x) {
        return x >= 10 && x <= 1000;
    }
}