/**
 * Single Responsibility Principle (SRP):
 * This class is solely responsible for placing orders.
 *
 * Open/Closed Principle (OCP):
 * New placement strategies can be added by creating new implementations
 * of OrderPlacement without modifying this class.
 *
 * Liskov Substitution Principle (LSP):
 * This class can be substituted wherever OrderPlacement is expected.
 *
 * Dependency Inversion Principle (DIP):
 * Clients depend on the OrderPlacement abstraction, not this concrete class.
 */
public class OrderPlacementImpl implements OrderPlacement {

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
