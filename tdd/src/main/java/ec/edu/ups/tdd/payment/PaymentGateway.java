package ec.edu.ups.tdd.payment;

public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
