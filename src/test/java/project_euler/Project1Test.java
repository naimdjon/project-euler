package project_euler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Project1Test{

    @Test
    public void testProblem1(){
        final String message="sum of all the multiples of 3 or 5 below 1000 is wrong!";
        assertEquals(message,233168, Problem1.run());
    }
}
