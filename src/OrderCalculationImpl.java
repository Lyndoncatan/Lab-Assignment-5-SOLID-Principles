/**
 * Single Responsibility Principle (SRP):
 * This class is solely responsible for calculating order totals.
 *
 * Open/Closed Principle (OCP):
 * New calculation strategies (e.g., with discounts or tax) can be added
 * by creating new implementations of OrderCalculation without modifying this class.
 *
 * Liskov Substitution Principle (LSP):
 * This class can be substituted wherever OrderCalculation is expected.
 *
 * Dependency Inversion Principle (DIP):
 * Clients depend on the OrderCalculation abstraction, not this concrete class.
 */
public class OrderCalculationImpl implements OrderCalculation {

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }
}
