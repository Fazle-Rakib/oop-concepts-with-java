package java_abstract;

// Abstract  Class
abstract class Payment {
    String paymentType;

    // Constructor
    Payment(String type) {
        this.paymentType = type;
    }

    // Abstract method (to be implemented by subclasses)
    abstract void validatePayment();

    // Concrete method (shared logic)
    void processPayment() {
        System.out.println("Processing " + paymentType + " payment...");
    }
}

// Subclass 1: Credit Card Payment
class CreditCardPayment extends Payment {
    CreditCardPayment() {
        super("Credit Card");
    }

    @Override
    void validatePayment() {
        System.out.println("Validating Credit Card details...");
    }
}

// Subclass 2: PayPal Payment
class PayPalPayment extends Payment {
    PayPalPayment() {
        super("PayPal");
    }

    @Override
    void validatePayment() {
        System.out.println("Validating PayPal credentials...");
    }
}

// Main class
public class PaymentExample {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.validatePayment(); // Calls CreditCardPayment's implementation
        payment.processPayment();

        payment = new PayPalPayment();
        payment.validatePayment(); // Calls PayPalPayment's implementation
        payment.processPayment();
    }
}
