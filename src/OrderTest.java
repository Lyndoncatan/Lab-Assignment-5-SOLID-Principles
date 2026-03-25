/**
 * Test class demonstrating the SOLID-compliant order system.
 *
 * Dependency Inversion Principle (DIP):
 * Concrete implementations are injected into OrderService.
 * The client code depends on abstractions, making it easy to swap implementations.
 *
 * Liskov Substitution Principle (LSP):
 * Any implementation of the interfaces can be used interchangeably
 * without affecting the correctness of the program.
 */
public class OrderTest {

    public static void main(String[] args) {
        // Create concrete implementations (can be swapped easily)
        OrderCalculation calculator = new OrderCalculationImpl();
        OrderPlacement placer = new OrderPlacementImpl();
        InvoiceGenerator invoicer = new InvoiceGeneratorImpl();
        EmailNotification notifier = new EmailNotificationImpl();

        // Inject dependencies into OrderService (DIP)
        OrderService orderService = new OrderService(calculator, placer, invoicer, notifier);

        // Process a complete order
        orderService.processOrder(10.0, 2, "John Doe", "123 Main St",
                "order_123.pdf", "johndoe@example.com");

        System.out.println();

        // Demonstrate flexibility: use individual services independently (ISP)
        System.out.println("--- Using individual services independently ---");
        calculator.calculateTotal(25.0, 4);
        placer.placeOrder("Jane Smith", "456 Oak Ave");
        // No need to call invoice or email — ISP allows selective usage
    }
}
