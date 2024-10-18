import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public String toString() {
        return name + ": $" + price;
    }
}

public class SimpleExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter product name for product " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter product price for product " + i + ": ");
            try {
                double price = Double.parseDouble(scanner.nextLine());
                Product product = new Product(name, price);
                productList.add(product);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid price. Please enter a valid number and non-negative price.");
                i--;
            }
        }

        System.out.println("\nProducts sorted by name:");
        productList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        for (Product product : productList) {
            System.out.println(product);
        }

        double total = 0.0;
        System.out.println("\nEnter five strings containing numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("String " + i + ": ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. This is not a valid number.");
            }
        }

        System.out.println("Total sum of valid numbers: " + total);
        scanner.close();
    }
}