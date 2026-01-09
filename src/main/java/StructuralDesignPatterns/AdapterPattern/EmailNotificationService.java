package StructuralDesignPatterns.AdapterPattern;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("sending email to " + to);
        System.out.println("email subject " + subject);
        System.out.println("email body " + body);
    }
}
