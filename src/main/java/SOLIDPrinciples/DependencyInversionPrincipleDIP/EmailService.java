package SOLIDPrinciples.DependencyInversionPrincipleDIP;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending message using email " + message);
    }
}
