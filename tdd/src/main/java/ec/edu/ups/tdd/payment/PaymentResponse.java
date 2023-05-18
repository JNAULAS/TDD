package ec.edu.ups.tdd.payment;

public class PaymentResponse {
    enum PaymentStatus{
        OK, ERROR
    }
    // Creamos variable de tipo Paymemnt Status para maneras tanto el ok como el error
    private PaymentStatus status;

    /**
     * Constructior
     * @param status
     */
    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }
    // Creamos metodos Getter and Setters

    public PaymentStatus getStatus() {
        return status;
    }
}
