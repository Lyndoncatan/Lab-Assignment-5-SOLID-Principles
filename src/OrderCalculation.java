/**
 * Interface Segregation Principle (ISP):
 * Segregated interface for order calculation responsibility only.
 */
public interface OrderCalculation {
    void calculateTotal(double price, int quantity);
}
