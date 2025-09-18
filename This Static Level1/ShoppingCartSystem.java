package Level1this;

class Product {
    private static double discount = 10.0;

    private String productName;
    private final String productID;
    private double price;
    private int quantity;

    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price After Discount: " + getTotalPriceAfterDiscount());
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }

    public double getTotalPriceAfterDiscount() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public String getProductID() {
        return productID;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "P101", 50000, 1);
        Product p2 = new Product("Mouse", "P102", 800, 2);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.updateDiscount(15);
        System.out.println("\nAfter Updating Discount:");
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
