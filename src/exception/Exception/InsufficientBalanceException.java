package Exception;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Check for negative amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        // Check for insufficient balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

// Main Class
  class Insufficient {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);   // valid
            account.withdraw(4000);   // will throw InsufficientBalanceException
            account.withdraw(-100);   // will throw IllegalArgumentException

        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        }
    }
}
