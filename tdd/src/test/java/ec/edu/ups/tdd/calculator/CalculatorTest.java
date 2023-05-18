package ec.edu.ups.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    /**
     * Definimos variable de tipo Calculadora
     */
    Calculator cal = null;

    /**
     * Abrimos una sola vez la conexion y se ejecuta uan sola vez antes de ejecutar lso metodos de la clase
     */
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    // Ejecutamos antes de lso metodos para instancia la clase
    @Before
    public void setUp(){
        cal = new Calculator();
        System.out.println("setup()");
    }
    /**
     * Primero prueba unitaria
     * Method for addition
     * retunr: addition a + b
     * 1) Si se deja como Metodo Simple el framework no me reconoce que es una prueba
     * 2) Para que reconozca como una prueba agregamos la anotacion @Test
     */
    @Test
    public void given_two_integers_when_addition_then_ok() {
        //cal = new Calculator();
        //int expected = 6;
        //int valorActual = cal.addition(4,2);
        assertEquals(6, cal.addition(4,2));
        System.out.println("Test additions");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals( 2, cal.subtraction(4,2));
        System.out.println("Test subtraction");
    }

    @Test(expected = ArithmeticException.class)
    //@Test
    public void given_two_integers_when_division_then_exception() {
        assertEquals( 3, cal.division(6,0));
        System.out.println("Test division");
    }
    // Verificar timeout
    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_ok() {
        assertEquals( 8, cal.multiplication(4,2));
        System.out.println("Test multiplication timeout");
    }
    // Ahora ejecutamos metodo despues que se ejecute los @test
    @After // Indica que se ejecute despues
    public void tearDown(){
        // Simplemente seteo ese valor a cero
        System.out.println("tearDown()");
        cal.setAns(0);
        cal=null;
    }
    // Cerramso al final todas las conexiones
    @AfterClass // Indica que se cierra la conexion al final de ejecutar todos los metodos de clase
    public static void tearDownClass(){
        // Simplemente seteo ese valor a cero
        System.out.println("tearDownClass()");
    }
}