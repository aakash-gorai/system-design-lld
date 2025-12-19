package StructuralDesignPatterns.AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailNotification = new EmailNotificationService();
        emailNotification.send("aakash@gmail.com", "Greetings", "hello");

        NotificationService sendGridAdapter = new SendGridAdapter(new SendGridService());
        sendGridAdapter.send("aakash@gmail.com", "Greetings", "hello");
    }
}
