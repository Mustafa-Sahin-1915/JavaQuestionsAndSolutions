package questions;
/*
Find the sum of all digits in integer
 */

public class Q017 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits2(123));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int sumOfDigits2(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.valueOf(s.substring(i,i+1));
        }
        return sum;
    }
}
