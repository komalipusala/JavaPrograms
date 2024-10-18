import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
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
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class SortByName implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ProductSortDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1500.00));
        productList.add(new Product("Smartphone", 800.00));
        productList.add(new Product("Headphones", 200.00));
        productList.add(new Product("Monitor", 300.00));

        System.out.println("Products before sorting:");
        for (Product product : productList) {
            System.out.println(product);
        }

        Collections.sort(productList, new SortByName());
        System.out.println("\nProducts sorted by name:");
        for (Product product : productList) {
            System.out.println(product);
        }

        Collections.sort(productList, new SortByPrice());
        System.out.println("\nProducts sorted by price:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}