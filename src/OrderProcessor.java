//Smelly code 

public class OrderProcessor {

    public void processOrder(String customerName, String productName, int quantity, double price, String shippingAddress) {
        double total = quantity * price;
        System.out.println("Processing order...");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("Shipping to: " + shippingAddress);

        if (shippingAddress.contains("Brazil")) {
            total += 20.0;
        } else {
            total += 50.0;
        }

        System.out.println("Shipping cost included. Final total: " + total);
    }

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder("John Doe", "Laptop", 2, 1500.00, "123 Main St, Brazil");
    }
}
