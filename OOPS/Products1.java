//13.  Introduce multiple constructors in Product class.

public class Products1 {
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    public Products1() {
        this.prodId = 0;
        this.prodName = "Unknown";
        this.price = 0.0;
        this.quantityOnHand = 0;
    }

    public Products1(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;
    }

    public Products1(int prodId, String prodName, double price, int quantityOnHand) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public double getNetPrice() {
        double taxRate = 0.12;
        return price + (price * taxRate);
    }

    public void purchase(int quantity) {
        this.quantityOnHand += quantity;
        System.out.println("Purchased " + quantity + " units of " + prodName + ". Current stock: " + this.quantityOnHand);
    }

    public void sell(int quantity) {
        if (quantity > this.quantityOnHand) {
            System.out.println("Insufficient stock to sell " + quantity + " units. Available: " + this.quantityOnHand);
        } else {
            this.quantityOnHand -= quantity;
            System.out.println("Sold " + quantity + " units of " + prodName + ". Remaining stock: " + this.quantityOnHand);
        }
    }

    public static void main(String[] args) {
        Products1 product1 = new Products1();
        System.out.printf("Product 1: %s, Net price: $%.2f%n", product1.prodName, product1.getNetPrice());

        Products1 product2 = new Products1(102, "Smartphone", 500.0);
        System.out.printf("Product 2: %s, Net price: $%.2f%n", product2.prodName, product2.getNetPrice());

        Products1 product3 = new Products1(103, "Tablet", 300.0, 100);
        System.out.printf("Product 3: %s, Net price: $%.2f%n", product3.prodName, product3.getNetPrice());

        product3.purchase(50);
        product3.sell(30);
        product3.sell(150);
    }
}