/**
 * AccountOperation
 */
interface AccountOperation {
    void deposit(double amount);
    double getBalance();
}

class Account implements AccountOperation {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        myAccount.deposit(500);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}