package java_exceptions;
import java.util.Scanner;

// ---------------------------------------------------------
// A custom exception for a problem specific to our system.
// ---------------------------------------------------------
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    // 'throws' tells the caller:
    // "This method may produce an InsufficientBalanceException."
    public void withdraw(double amount)
            throws InsufficientBalanceException {
        // 'throw' actually creates and sends an exception
        // when the account does not have enough money.
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available: " + balance
            );
        }

        // IllegalArgumentException is a built-in unchecked exception.
        // We use it when the amount itself is invalid.
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be greater than 0."
            );
        }

        // This line executes only when all validation succeeds.
        balance -= amount;

        System.out.println("Withdrawal successful.");
    }
}


public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        System.out.println("Current balance: "
                + account.getBalance());
        System.out.print("Enter withdrawal amount: ");
        String input = scanner.nextLine();
        double amount = 0;
        try {
            // This may throw NumberFormatException
            // if the user enters something like "abc".
            amount = Double.parseDouble(input);

            // This may throw:
            // 1. InsufficientBalanceException
            // 2. IllegalArgumentException
            account.withdraw(amount);

        }
        // Handle invalid text such as "abc".
        catch (NumberFormatException e) {
            System.out.println(
                    "Invalid input. Please enter a number."
            );
        }
        // Handle our application-specific problem.
        catch (InsufficientBalanceException e) {
            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );
        }
        // Handle invalid numeric values such as 0 or -100.
        catch (IllegalArgumentException e) {
            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );
        }
        finally {
            System.out.println("Remaining balance: "
                    + account.getBalance());

            // This block runs after the try/catch process
            // whether the transaction succeeds or fails.
            System.out.println(
                    "Transaction process finished."
            );

            scanner.close();
        }
    }
}