package project_euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 */
public class Problem5 {

    public static int run() {
        int from = 1;
        int to = 20;
        return smallestPositiveNumberEvenlyDivisibleBy(from, to);
    }


    public static int smallestPositiveNumberEvenlyDivisibleBy(int from, int to) {
        boolean check = true;
        int stop = (int) Math.sqrt(to);
        int[] primes = generatePrimes(to);
        int[] exponents = new int[20];
        int i = 0;
        while (i < primes.length && primes[i] <= to) {
            exponents[i] = 1;
            if (check) {
                if (primes[i] <= stop) {
                    exponents[i] = (int) Math.floor(Math.log(to) / Math.log(primes[i]));
                } else
                    check = false;
            }
            from = from * (int) Math.pow(primes[i], exponents[i]);
            i = i + 1;
        }
        return from;
    }


    public static int[] generatePrimes(int max) {
        boolean[] b = new boolean[max + 1];
        for (int i = 2; i * i <= max; i++) {
            if (!b[i]) {
                for (int j = i; i * j <= max; j++)
                    b[i * j] = true;
            }
        }
        int numPrimes = 0;
        for (int i = 2; i <= max; i++) {
            if (!b[i]) numPrimes++;
        }
        int[] primes = new int[numPrimes];
        int index = 0;
        for (int i = 2; i <= max; i++) {
            if (!b[i]) primes[index++] = i;
        }
        return primes;
    }

}
