/**
 * Interface Segregation Principle (ISP):
 * Segregated interface for invoice generation responsibility only.
 */
public interface InvoiceGenerator {
    void generateInvoice(String fileName);
}
