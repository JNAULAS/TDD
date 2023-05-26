package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        /*
        Nos permite simular la implementacion de la interfaz
        Para este caso declaramos la Interfaz ICalculator y se instancia la clase de implementacion
        Ahora como no se tiene la clase de implementación usamos la clase Mockito para simular la implementacio de la interfaz

         */

        ICalculator cal = Mockito.mock(ICalculator.class);
        // Le digo a moquito que yo quiero sumar 2 + 3
        Mockito.when(cal.addition(2,3)).thenReturn(5);
        // Aplico la prueba
        assertEquals(5, cal.addition(2,3));
        System.out.println("Get result addition: " + cal.addition(2,3));

    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.subtraction(3,2)).thenReturn(1);
        assertEquals(1, cal.subtraction(3,2));
        System.out.println("Get result subtraction: " + cal.subtraction(3,2));

    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.multiplication(4,2)).thenReturn(8);
        assertEquals(8, cal.multiplication(4,2));
        System.out.println("Get result multiplication: " + cal.multiplication(4,2));

    }

    @Test
    public void given_two_integers_when_division_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.division(6,2)).thenReturn(3);
        assertEquals(3, cal.division(6,2));
        System.out.println("Get result division: " + cal.division(6,2));

    }
}
