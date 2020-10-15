package section4;

public class AreaCalculator {
    public static double area(double r) {
        if (r < 0)
            return -1.0;
        else
            return (3.14159 * r * r);

    }

    public static double area(double a,double b) {
        if (a < 0 || b < 0)
            return -1.0;
        else
            return a*b;

    }
}
