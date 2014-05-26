package project_euler;

import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem3 {

    public static long maxPrimeFactorOf( long input) {
        long start = System.currentTimeMillis();
        long max=0;
        for (long i = 2; i <= input; i++) {
            if (input % i == 0) {
                while (input % i == 0)
                    input = input / i;
                max=i;
            }
        }
        long stop = System.nanoTime();
        System.out.println((stop-start));
        return max;
    }

    private static boolean isPrimeNumber(final int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if((num%i)==0)
                return false;
        }
        return true;
    }

    public static List<Integer> primeNumbersOf(int number) {
        List<Integer> result=new ArrayList<>();
        while (number % 2 ==0) {
            result.add(2);
            number=number/2;
        }

        return result;
    }
}
