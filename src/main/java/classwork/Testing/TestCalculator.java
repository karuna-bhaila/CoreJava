package classwork.Testing;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd(){ Assert.assertEquals(10,Calculator.add(4, 6));}

    @Test
    public void testSub(){ Assert.assertEquals(-2,Calculator.sub(4, 6));}

    @Test
    public void testMul(){ Assert.assertEquals(24,Calculator.mul(4, 6));}

    @Test
    public void testDiv(){ Assert.assertEquals(0,Calculator.div(4, 6));}
}
