package section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
        a = a*1000;

        b = b*1000;

        return ((int)a==(int)b);
    }
}
