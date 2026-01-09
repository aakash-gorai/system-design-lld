package StructuralDesignPatterns.AdapterPattern;

public class SendGridAdapter implements NotificationService {
    private SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridService.sendEmail(to, subject, body);
    }
}
