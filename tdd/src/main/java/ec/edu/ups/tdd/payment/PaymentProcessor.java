package ec.edu.ups.tdd.payment;

public class PaymentProcessor {
    /**
     * Declaramos una variable de tipo PaymentGateway
     */
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }
    /**
     * Creamos metodo para el pago
     */
    public boolean makePayment(double amount){
        PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK)
            return true;
        else
            return false;
    }
}
