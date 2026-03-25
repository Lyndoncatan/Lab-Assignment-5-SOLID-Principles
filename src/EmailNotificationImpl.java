/**
 * Single Responsibility Principle (SRP):
 * This class is solely responsible for sending email notifications.
 *
 * Open/Closed Principle (OCP):
 * New notification methods (e.g., SMS, push notification) can be added by creating
 * new implementations of EmailNotification without modifying this class.
 *
 * Liskov Substitution Principle (LSP):
 * This class can be substituted wherever EmailNotification is expected.
 *
 * Dependency Inversion Principle (DIP):
 * Clients depend on the EmailNotification abstraction, not this concrete class.
 */
public class EmailNotificationImpl implements EmailNotification {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
