package java_this_keyword;

// Enables methods chaining
public class BankAccount {
    private double balance;

    public BankAccount deposit(double amount) {
        System.out.println("An amount has been deposited::");
        this.balance += amount;
        return this; // Returns the current object
    }

    public BankAccount withdraw(double amount) {
        System.out.println("An amount has been withdrawn::");
        this.balance -= amount;
        return this; // Returns the current object
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + this.balance + "\n");
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount();
        savingsAccount.showBalance();

//        savingsAccount.deposit(2500);
//        savingsAccount.showBalance();
//
//        savingsAccount.withdraw(1500);
//        savingsAccount.showBalance();

        savingsAccount.deposit(2500).withdraw(1500).showBalance();


    }
}
