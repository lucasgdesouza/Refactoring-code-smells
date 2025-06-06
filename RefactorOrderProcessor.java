// first refactor: public void processOrder() has many parameters;
// second refactor: these parameters are primitive;
// Then, I refactored it passing by parameter
// an object RefactorOrderProcessor, reducing the primitive variables;
// third refactor: change the method´s name to printOrderInformations(), seen that it doesn´t mean its official working;
// fourth refactor: separate printOrderInformations(), creating a method that calculate the total and ohter method that shows
// the add shipping depending on the destiny;
public class RefactorOrderProcessor{
    private String customerName;
    private String productName;
    private int quantity;
    private double price;
    private String shippingAddress;
    private double total;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void calculateShipping(){

    }

    public void calculateTotal(int quantity, double price){
        total = quantity * price;
    }

    public void shipping(String shippingAddress){
        if (shippingAddress.contains("Brazil")) {
            total += 20.0;
        } else {
            total += 50.0;
        }

        System.out.println("Shipping cost included. Final total: " + total);
    }
    public void printOrderInformations(RefactorOrderProcessor refactorOrderProcessor){
        System.out.println("Processing order...");
        System.out.println("Customer: " + refactorOrderProcessor.customerName);
        System.out.println("Product: " + refactorOrderProcessor.productName);
        System.out.println("Quantity: " + refactorOrderProcessor.quantity);
        System.out.println("Total: " + total);
        System.out.println("Shipping to: " + refactorOrderProcessor.shippingAddress);
    }

    public static void main(String[] args) {
        RefactorOrderProcessor orderProcessor = new RefactorOrderProcessor();
        orderProcessor.setCustomerName("John Doe");
        orderProcessor.setPrice(1500.00);
        orderProcessor.setQuantity(2);
        orderProcessor.setProductName("laptop");
        orderProcessor.setShippingAddress("123 Main St, Brazil");
        orderProcessor.printOrderInformations(orderProcessor);
    }
}