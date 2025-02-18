package java_abstract;

abstract class Payment1 {
    abstract void validatePayment(); // No method body (must be implemented by subclasses)

    void printPaymentDetails() { // common feature
        System.out.println("Logging payment details...");
    }
}

