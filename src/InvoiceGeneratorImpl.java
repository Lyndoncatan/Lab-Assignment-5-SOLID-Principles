/**
 * Single Responsibility Principle (SRP):
 * This class is solely responsible for generating invoices.
 *
 * Open/Closed Principle (OCP):
 * New invoice formats (e.g., PDF, HTML, XML) can be added by creating
 * new implementations of InvoiceGenerator without modifying this class.
 *
 * Liskov Substitution Principle (LSP):
 * This class can be substituted wherever InvoiceGenerator is expected.
 *
 * Dependency Inversion Principle (DIP):
 * Clients depend on the InvoiceGenerator abstraction, not this concrete class.
 */
public class InvoiceGeneratorImpl implements InvoiceGenerator {

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
