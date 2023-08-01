package bmt;
import static org.junit.Assert.*;

import org.junit.Test;



// import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    private Calculator objCalcUnderTest;
    @Test
    public void testadd()
    {
    int a = 15; int b = 20;
    int expectedResult = 35;
    int result = objCalcUnderTest.add(a, b);
    assertEquals(expectedResult, result);

    
    }
    @Test
    public void testsub()
    {
    int a = 15; int b = 10;
    int expectedResult = 5;
    int result = objCalcUnderTest.sub(a, b);
    assertEquals(expectedResult, result);

    
    }

    @Test
    public void testmulti()
    {
    int a = 5; int b = 10;
    int expectedResult = 50;
    int result = objCalcUnderTest.multi(a, b);
    assertEquals(expectedResult, result);

    
    }

    @Test
    public void testdiv()
    {
    int a = 15; int b = 5;
    int expectedResult = 3;
    int result = objCalcUnderTest.div(a, b);
    assertEquals(expectedResult, result);

    
    }
}
