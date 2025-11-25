package SOLIDPrinciples.DependencyInversionPrincipleDIP;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationServiceEmail = new NotificationService(new EmailService());
        notificationServiceEmail.notify("hello");

        NotificationService notificationServiceSms = new NotificationService(new SMSService());
        notificationServiceSms.notify("hi");
    }
}