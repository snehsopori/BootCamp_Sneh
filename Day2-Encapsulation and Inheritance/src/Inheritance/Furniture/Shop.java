package Inheritance.Furniture;

import org.junit.Assert;
import org.junit.Test;

public class Shop {

    @Test
    public void testDisplay() {
        Chair chair = new Chair();
        Assert.assertEquals("Chair 100 Wood",chair.toString());
    }
}