package ec.edu.ups.tdd.payment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    // Inicio Refactorizacion
    /**
     * Realizamos refactorizacion o extract Method
     * Eliminamos los objetos de los metodos inicalizando como null
     */
    private PaymentGateway gateway = null;
    private PaymentProcessor processor = null;
    @Before
    public void setUp(){
        gateway = Mockito.mock(PaymentGateway.class);
        processor = new PaymentProcessor(gateway);
    }

    //Fin refactorizacion

    /**
     * Creamos prueba de PaymentProcessor
     */
    @Test
    public void given_payment_when_is_correct_then_ok() {
        //PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        //PaymentProcessor processor = new PaymentProcessor(gateway);
        /**
         * any se pone que ointeresa saber es siretorna un ok o false pues la logica por detras no se conoce
         */
        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //valida que retorne un ok por eso se pone assertTrue
        assertTrue(processor.makePayment(100));
    }
    /**
     * Pruebas de error
     */
    @Test
    public void given_payment_when_is_wrong_then_ok() {
        /**
         * any se pone que ointeresa saber es siretorna un ok o false pues la logica por detras no se conoce
         */
        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        //valida que retorne un ok por eso se pone assertTrue
        assertFalse(processor.makePayment(100));
    }
}