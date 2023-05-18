package ec.edu.ups.tdd.payment;

public class PaymentRequest {
    /**
     * Atributos de clase
     */
    private double amount;

    /**
     * Constructor de clase
     */
    public PaymentRequest (double amount){
        this.amount = amount;
    }

    /**
     * Metodos getters and setters
     */
    public double getAmount() {
        return amount;
    }
}
