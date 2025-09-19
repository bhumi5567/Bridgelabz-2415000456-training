package ObjectModeling;
import java.util.*;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }
}

public class ProductOrders {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p2);

        Customer customer = new Customer("Emily");
        customer.placeOrder(order1);

        for (Order o : customer.getOrders()) {
            System.out.println(customer.getName() + " placed an order with products:");
            for (Product p : o.getProducts()) {
                System.out.println("- " + p.getName());
            }
        }
    }
}

