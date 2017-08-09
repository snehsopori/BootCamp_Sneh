package PrimeGenerateUsingTest;

import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
    @Test
    public void testPrime() {
        int expextedOutput = 21536;
        Assert.assertEquals("The sum should be 21536", expextedOutput, new PrimeGenerator(1).prime());
    }
}
