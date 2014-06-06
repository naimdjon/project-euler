package project_euler;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.println("Max palindrome number made out of product of two 3-digit numbers is:\n " + run());
    }

    public static int run() {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int temp = i * j;
                if (isPalindrome(temp) && temp > max)
                    max = temp;
            }
        }
        return max;
    }

    public static boolean isPalindrome(int N) {
        int original = N;
        int reversed = 0;
        while (N > 0) {
            reversed = reversed * 10 + (N % 10);
            N /= 10;
        }
        return original == reversed;
    }



}
