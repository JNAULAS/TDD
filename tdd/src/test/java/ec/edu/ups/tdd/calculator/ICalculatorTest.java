package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.addition(2,3)).thenReturn(5);
        assertEquals(5, cal.addition(2,3));

    }
}