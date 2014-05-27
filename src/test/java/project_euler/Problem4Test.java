package project_euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem4Test {

    @Test
    public void testIsPalindrome9009() {
        assertTrue(Problem4.isPalindrome(9009));
    }

    @Test
    public void testMaxPalindromeIs906609() {
        assertEquals(906609,Problem4.run());
    }
}
