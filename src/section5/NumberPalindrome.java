package section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        int temp1;

        while (temp!=0) {
            reverse = reverse *10;
            temp1 = temp % 10;
            reverse += temp1;
            temp = temp/10;
        }

        return (number == reverse);
    }
}