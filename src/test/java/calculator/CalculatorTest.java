package calculator;


import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 5;
        int expected = x+y;
        int actual = calc.add(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void subTest() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 5;
        int expected = x-y+2;
        int actual = calc.sub(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void mulTest() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 5;
        int expected = x*y;
        int actual = calc.mul(x, y);
        assertEquals(expected, actual);
    }
    @Test
    public void divTest() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 5;
        int expected = x/y;
        int actual = calc.div(x, y);
        assertEquals(expected, actual);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
