//12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand

public class Products{
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    public Products(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;
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
        Products product = new Products(101, "Laptop", 1000.0);
        System.out.printf("Net price of %s: $%.2f%n", product.prodName, product.getNetPrice());

        product.purchase(50);
        product.sell(20);
        product.sell(40);
    }
}

