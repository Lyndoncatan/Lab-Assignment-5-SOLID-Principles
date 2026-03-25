/**
 * Dependency Inversion Principle (DIP):
 * OrderService depends on abstractions (interfaces), not concrete implementations.
 * Dependencies are injected through the constructor.
 *
 * Single Responsibility Principle (SRP):
 * OrderService orchestrates the order workflow by delegating to specialized services.
 * It does not implement any business logic itself.
 *
 * Open/Closed Principle (OCP):
 * The behavior of OrderService can be extended by injecting different implementations
 * of the interfaces without modifying this class.
 */
public class OrderService {

    private final OrderCalculation orderCalculation;
    private final OrderPlacement orderPlacement;
    private final InvoiceGenerator invoiceGenerator;
    private final EmailNotification emailNotification;

    // Constructor Injection (DIP) — depend on abstractions, not concretions
    public OrderService(OrderCalculation orderCalculation,
                        OrderPlacement orderPlacement,
                        InvoiceGenerator invoiceGenerator,
                        EmailNotification emailNotification) {
        this.orderCalculation = orderCalculation;
        this.orderPlacement = orderPlacement;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotification = emailNotification;
    }

    public void processOrder(double price, int quantity, String customerName,
                             String address, String invoiceFileName, String email) {
        orderCalculation.calculateTotal(price, quantity);
        orderPlacement.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(invoiceFileName);
        emailNotification.sendEmailNotification(email);
    }
}
