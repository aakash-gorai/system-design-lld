package StructuralDesignPatterns.AdapterPattern;

public class SendGridService {
    void sendEmail(String recipient, String title, String content) {
        System.out.println("sending email to " + recipient);
        System.out.println("email subject " + title);
        System.out.println("email body " + content);
    }
}
