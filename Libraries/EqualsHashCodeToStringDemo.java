import java.util.Objects;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(product.price, price) == 0 &&
               Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BankAccount that = (BankAccount) obj;
        return Double.compare(that.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "BankAccount{balance=" + balance + "}";
    }
}

public class EqualsHashCodeToStringDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500.00);
        Product product2 = new Product("Laptop", 1500.00);
        Product product3 = new Product("Smartphone", 800.00);

        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
        System.out.println("Product 3: " + product3);

        System.out.println("Product 1 equals Product 2: " + product1.equals(product2));
        System.out.println("Product 1 equals Product 3: " + product1.equals(product3));
        System.out.println("Product 1 hashCode: " + product1.hashCode());
        System.out.println("Product 2 hashCode: " + product2.hashCode());
        System.out.println("Product 3 hashCode: " + product3.hashCode());

        BankAccount account1 = new BankAccount(500.00);
        BankAccount account2 = new BankAccount(500.00);
        BankAccount account3 = new BankAccount(1000.00);

        System.out.println("\nAccount 1: " + account1);
        System.out.println("Account 2: " + account2);
        System.out.println("Account 3: " + account3);

        System.out.println("Account 1 equals Account 2: " + account1.equals(account2));
        System.out.println("Account 1 equals Account 3: " + account1.equals(account3));
        System.out.println("Account 1 hashCode: " + account1.hashCode());
        System.out.println("Account 2 hashCode: " + account2.hashCode());
        System.out.println("Account 3 hashCode: " + account3.hashCode());
    }
}
