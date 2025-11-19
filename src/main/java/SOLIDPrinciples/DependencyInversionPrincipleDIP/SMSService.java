package SOLIDPrinciples.DependencyInversionPrincipleDIP;

public class SMSService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("sending message using sms " + message);
    }
}
