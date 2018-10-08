import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
    calculator = new Calculator();
    }

    @Test
    public void hasAddMethod(){
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void hasSubtractMethod(){
        assertEquals(0, calculator.subtract(2,2));
    }

    @Test
    public void hasMultiplyMethod(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void hasDivideMethod(){
        assertEquals(1, calculator.divide(2,2));
    }

}
