package junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }


    @Test
    public void testAdd() {


        int a = 10;
        int b = 5;


        int result = calculator.add(a, b);


        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {


        int a = 10;
        int b = 5;


        int result = calculator.subtract(a, b);


        assertEquals(5, result);
    }


    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
}
