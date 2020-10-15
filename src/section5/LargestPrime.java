package section5;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        int maxPrime = 0;

        while (number % 2 == 0) {
            maxPrime = 2;
            number = number / 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }

        if (number > 2)
            maxPrime = number;

        return maxPrime;
    }
}
//    public static int getLargestPrime (int number) {
//        // Write your code here
//        int largestPrime = -1;
//        for(int i=2; i<=number/2; i++) {
//            int temp = largestPrime;
//            if(number%i ==0){
//                if (temp < i) {
//                    largestPrime = i;
//                }
//            }
//        }
//        if(largestPrime == -1 && number > 1) {
//            return number;
//        }
//        if (largestPrime > 2) {
//            if (getLargestPrime(largestPrime) == -1) {
//                return largestPrime;
//            } else {
//                largestPrime = getLargestPrime(largestPrime);
//            }
//        }
//
//        return largestPrime;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getLargestPrime(1));
//    }
//}