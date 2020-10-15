package section4;

public class TeenNumberCheck {

    public static boolean isTeen(int x) {
        return (x>=13 && x<=19);
    }

    public static boolean hasTeen(int a,int b,int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }
}
