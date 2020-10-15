package section5;

public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverseNumber = reverse(number);
        int numOfDigits = getDigitCount(number);
        int digit;

        while(numOfDigits != 0) {
            digit = reverseNumber % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            reverseNumber = reverseNumber/10;
            numOfDigits--;
        }
    }

    public static int reverse (int number) {
        int reverse = 0;

        while (number!=0) {
            reverse = (reverse*10) + (number%10);
            number = number/10;
        }
        return reverse;
    }

    public static int getDigitCount (int number) {

        int count = 0;

        if (number < 0)
            return -1;
        else if (number == 0)
            return 1;
        else {
            while (number!=0) {
                count++;
                number = number/10;
            }
        }
        return count;
    }

}