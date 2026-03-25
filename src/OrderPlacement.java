/**
 * Interface Segregation Principle (ISP):
 * Segregated interface for order placement responsibility only.
 */
public interface OrderPlacement {
    void placeOrder(String customerName, String address);
}
