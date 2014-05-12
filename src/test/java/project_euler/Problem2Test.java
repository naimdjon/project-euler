package project_euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void testSumUpTo5DoesNotExceed2() {
        assertEquals(2,Problem2.sumOfFiboTermsUptoTerm(5));
    }

    @Test
    public void testSumUpTo8DoesNotExceed10() {
        assertEquals(10,Problem2.sumOfFiboTermsUptoTerm(8));
    }

    @Test
    public void testSumUpTo13DoesNotExceed10() {
        assertEquals(10,Problem2.sumOfFiboTermsUptoTerm(13));
    }

    @Test
    public void testSumUpTo21DoesNotExceed10() {
        assertEquals(10,Problem2.sumOfFiboTermsUptoTerm(21));
    }

    @Test
    public void testSumUpTo34DoesNotExceed44() {
        assertEquals(44,Problem2.sumOfFiboTermsUptoTerm(34));
    }

    @Test
    public void testSumUpTo55DoesNotExceed44() {
        assertEquals(44,Problem2.sumOfFiboTermsUptoTerm(55));
    }

    @Test
    public void testSumUpTo4million() {
        assertEquals(4613732,Problem2.sumOfFiboTermsUptoTerm(4000000));
    }

}
