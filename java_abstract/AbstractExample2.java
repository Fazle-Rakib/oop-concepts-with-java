package java_abstract;

abstract class Payment2 {
    String transactionId;

    // Abstract constructor forces subclasses to provide a transaction ID
    Payment2(String transactionId) {
        this.transactionId = transactionId;
    }

    abstract void validatePayment();

    void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
    }
}

class BankTransfer extends Payment2 {
    BankTransfer(String transactionId) {
        super(transactionId);
    }

    @Override
    void validatePayment() {
        System.out.println("Validating bank account details...");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        Payment2 payment = new BankTransfer("TXN123456");
        payment.validatePayment();
        payment.displayTransaction();
    }
}
