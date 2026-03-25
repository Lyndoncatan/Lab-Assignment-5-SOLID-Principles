/**
 * Interface Segregation Principle (ISP):
 * Segregated interface for email notification responsibility only.
 */
public interface EmailNotification {
    void sendEmailNotification(String email);
}
