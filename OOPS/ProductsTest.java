//17. Create classes to store details for two different types of Products,
//a) ImportedProducts which have import duty.b) DiscountedProducts which have a discount rate.
//All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting.

class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getNetPrice() {
        return basePrice;
    }

    public void setPrice(double price) {
        this.basePrice = price;
    }

    public void print() {
        System.out.println("Product Name: " + name + ", Base Price: " + basePrice);
    }
}
class ImportedProduct extends Product {
    private double importDuty;

    public ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return basePrice + (basePrice * importDuty / 100);
    }

    @Override
    public void print() {
        System.out.println("Imported Product Name: " + name + ", Base Price: " + basePrice + ", Import Duty: " + importDuty + "%, Net Price: " + getNetPrice());
    }
}

class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    @Override
    public void print() {
        System.out.println("Discounted Product Name: " + name + ", Base Price: " + basePrice + ", Discount Rate: " + discountRate + "%, Net Price: " + getNetPrice());
    }
}

public class ProductsTest{
    public static void main(String[] args) {
        ImportedProduct importedProduct = new ImportedProduct("Laptop", 1500, 10);
        importedProduct.print();

        DiscountedProduct discountedProduct = new DiscountedProduct("Smartphone", 800, 15);
        discountedProduct.print();

        Product product1 = importedProduct;
        Product product2 = discountedProduct;
        System.out.println("Product1 Net Price (upcasted): " + product1.getNetPrice());
        System.out.println("Product2 Net Price (upcasted): " + product2.getNetPrice());

        if (product1 instanceof ImportedProduct) {
            ImportedProduct downcastedImportedProduct = (ImportedProduct) product1;
            downcastedImportedProduct.setImportDuty(12);
            downcastedImportedProduct.print();
        }

        if (product2 instanceof DiscountedProduct) {
            DiscountedProduct downcastedDiscountedProduct = (DiscountedProduct) product2;
            downcastedDiscountedProduct.setDiscountRate(20);
            downcastedDiscountedProduct.print();
        }
    }
}
