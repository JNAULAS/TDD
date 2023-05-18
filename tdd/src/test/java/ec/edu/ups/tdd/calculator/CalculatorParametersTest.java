package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 1. Para realizar pruebas con parametros se debe anticipar con @RunWith() --> Corredores siempre se esta ejecutando
 * 2. Definimos que esto es parametrizado, caso contrario no va a funcionar nada de los parametros
 * 3. crear metodo de sumatoria
 * 4. Las pruebas parametrizadas en al potencialidad que me da Junit
 */
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    //2 declaramos los parametros
    private int a,b, expected;
    //3 Para ejecutar las pruebas se debe crear los parametros

    /**
     * Siempre se debe crear de manera static caso contrario no funciona
     * Las pruebas parametrizada es la potencialidad que me da Junit
     * @return
     *
     * Para que funcione tengo que decirle q esos son los parametros con @Parameterized.Parameters
     */
    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        // objects.add(new Object[]{param a,param b,valor esperado})
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }
    // 4 Definimos el constructor
    public CalculatorParametersTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    //1
    @Test
    public void given_parameters_when_addition_then_on(){
        Calculator cal = new Calculator();
        int actual = cal.addition(a,b);
        assertEquals(expected,actual);
    }
}
