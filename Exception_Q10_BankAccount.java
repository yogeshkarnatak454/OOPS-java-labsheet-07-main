class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0, balance);
    }

    void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient account balance.");
        }
        balance -= amount;
        System.out.printf("Withdrawal successful. Balance: %.2f%n", balance);
    }
}

public class Exception_Q10_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        try {
            account.withdraw(-50); // Change to 600 or 100 to test other cases.
        } catch (InsufficientFundsException e) {
            System.out.println("Bank error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }
}
