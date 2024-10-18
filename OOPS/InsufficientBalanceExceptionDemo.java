class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
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

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }
}

public class InsufficientBalanceExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            System.out.println("Current balance: $" + account.getBalance());
            account.withdraw(600.00);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Transaction complete. Final balance: $" + account.getBalance());
    }
}
