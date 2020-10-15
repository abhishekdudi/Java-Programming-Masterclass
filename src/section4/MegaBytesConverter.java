package section4;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int n) {
        if (n < 0)
            System.out.println("Invalid Value");
        else {
            int x = n/1024;
            int y = n % 1024;
            //String z = String(n)+" KB = "+String(x)+" MB and "+String(y)+" KB";
            System.out.println(n+" KB = "+x+" MB and "+y+" KB");
        }
    }
}