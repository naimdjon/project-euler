package project_euler;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static project_euler.Problem3.maxPrimeFactorOf;
import static project_euler.Problem3.primeNumbersOf;

public class Problem3Test {

    /*@Test
    public void testMaxPrimefactorOf5Is5() throws Exception {
        assertEquals(5,Problem3.maxPrimeFactorOf(5));
    }

    @Test
    public void testMaxPrimefactorOf10Is5() throws Exception {
        assertEquals(5,Problem3.maxPrimeFactorOf(10));
    }

    @Test
    public void testMaxPrimefactorOf14Is7() throws Exception {
        assertEquals(7,Problem3.maxPrimeFactorOf(14));
    }

    @Test
    public void testMaxPrimefactorOf15Is5() throws Exception {
        assertEquals(5,Problem3.maxPrimeFactorOf(15));
    }*/

    @Test
    public void testPrimeFactorsOf2() throws Exception {
        assertEquals(Arrays.asList(2), primeNumbersOf(2));
    }

    @Test
    public void testPrimeFactorsOf3() throws Exception {
        assertEquals(Arrays.asList(3), primeNumbersOf(3));
    }

    @Test
    public void testPrimeFactorsOf4() throws Exception {
        assertEquals(Arrays.asList(2, 2), primeNumbersOf(4));
    }

    @Test
    public void testPrimeFactorsOf5() throws Exception {
        assertEquals(Arrays.asList(5), primeNumbersOf(5));
    }

    @Test
    public void testPrimeFactorsOf6() throws Exception {
        assertEquals(Arrays.asList(2, 3), primeNumbersOf(6));
    }

    @Test
    public void testPrimeFactorsOf13195() throws Exception {
        assertEquals(29, maxPrimeFactorOf(13195));
    }

    @Test
    public void testRunProblem3() throws Exception {
        assertEquals(6857, Problem3.run());
    }

}
